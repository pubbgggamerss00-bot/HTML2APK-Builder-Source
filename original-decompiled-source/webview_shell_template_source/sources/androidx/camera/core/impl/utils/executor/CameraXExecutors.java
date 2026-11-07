package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
    }

    public static Executor audioExecutor() {
        return AudioExecutor.getInstance();
    }

    public static Executor directExecutor() {
        return DirectExecutor.getInstance();
    }

    public static Executor highPriorityExecutor() {
        return HighPriorityExecutor.getInstance();
    }

    public static Executor ioExecutor() {
        return IoExecutor.getInstance();
    }

    public static boolean isSequentialExecutor(Executor executor) {
        return executor instanceof SequentialExecutor;
    }

    public static ScheduledExecutorService mainThreadExecutor() {
        return MainThreadExecutor.getInstance();
    }

    public static ScheduledExecutorService myLooperExecutor() {
        return HandlerScheduledExecutorService.currentThreadExecutor();
    }

    public static ScheduledExecutorService newHandlerExecutor(Handler handler) {
        return new HandlerScheduledExecutorService(handler);
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
