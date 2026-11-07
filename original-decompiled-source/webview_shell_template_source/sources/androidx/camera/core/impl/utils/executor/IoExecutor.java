package androidx.camera.core.impl.utils.executor;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class IoExecutor implements Executor {
    private static volatile Executor sExecutor;
    private final ExecutorService mIoService = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.IoExecutor.1
        private static final String THREAD_NAME_STEM = "CameraX-camerax_io_%d";
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.mThreadId.getAndIncrement());
            return thread;
        }
    });

    public static Executor getInstance() {
        if (sExecutor != null) {
            return sExecutor;
        }
        synchronized (IoExecutor.class) {
            try {
                if (sExecutor == null) {
                    sExecutor = new IoExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.mIoService.execute(runnable);
    }
}
