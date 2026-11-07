package r9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23306a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f23307a;

        public a(Runnable runnable) {
            this.f23307a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f23307a.run();
            } catch (Exception e10) {
                v9.a.b(e10, "Executor", "Background execution failure.");
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f23306a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f23306a.execute(new a(runnable));
    }
}
