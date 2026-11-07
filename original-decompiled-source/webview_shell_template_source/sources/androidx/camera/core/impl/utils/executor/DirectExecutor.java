package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class DirectExecutor implements Executor {
    private static volatile DirectExecutor sDirectExecutor;

    public static Executor getInstance() {
        if (sDirectExecutor != null) {
            return sDirectExecutor;
        }
        synchronized (DirectExecutor.class) {
            try {
                if (sDirectExecutor == null) {
                    sDirectExecutor = new DirectExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sDirectExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
