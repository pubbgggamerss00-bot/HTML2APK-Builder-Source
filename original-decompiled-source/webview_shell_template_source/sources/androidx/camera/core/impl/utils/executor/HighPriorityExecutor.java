package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class HighPriorityExecutor implements Executor {
    private static volatile Executor sExecutor;
    private final ExecutorService mHighPriorityService = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.HighPriorityExecutor.1
        private static final String THREAD_NAME = "CameraX-camerax_high_priority";

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName(THREAD_NAME);
            return thread;
        }
    });

    public static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (HighPriorityExecutor.class) {
            try {
                if (sExecutor == null) {
                    sExecutor = new HighPriorityExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.mHighPriorityService.execute(runnable);
    }
}
