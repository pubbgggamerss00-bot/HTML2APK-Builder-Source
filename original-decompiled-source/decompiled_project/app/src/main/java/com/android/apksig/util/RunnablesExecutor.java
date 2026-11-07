package com.android.apksig.util;

import androidx.room.f0;
import com.android.apksig.util.RunnablesExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface RunnablesExecutor {
    public static final RunnablesExecutor SINGLE_THREADED = new f0();
    public static final RunnablesExecutor MULTI_THREADED = new AnonymousClass1();

    /* renamed from: com.android.apksig.util.RunnablesExecutor$1, reason: invalid class name */
    public class AnonymousClass1 implements RunnablesExecutor {
        private final int PARALLELISM = Math.min(32, Runtime.getRuntime().availableProcessors());
        private final int QUEUE_SIZE = 4;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$execute$0(RunnablesProvider runnablesProvider, Phaser phaser) {
            runnablesProvider.createRunnable().run();
            phaser.arriveAndDeregister();
        }

        @Override // com.android.apksig.util.RunnablesExecutor
        public void execute(final RunnablesProvider runnablesProvider) {
            int i10 = this.PARALLELISM;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
            final Phaser phaser = new Phaser(1);
            for (int i11 = 0; i11 < this.PARALLELISM; i11++) {
                Runnable runnable = new Runnable() { // from class: com.android.apksig.util.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnablesExecutor.AnonymousClass1.lambda$execute$0(runnablesProvider, phaser);
                    }
                };
                phaser.register();
                threadPoolExecutor.execute(runnable);
            }
            phaser.arriveAndAwaitAdvance();
            threadPoolExecutor.shutdownNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(RunnablesProvider runnablesProvider) {
        runnablesProvider.createRunnable().run();
    }

    void execute(RunnablesProvider runnablesProvider);
}
