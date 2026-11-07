package e7;

import android.os.Handler;
import android.os.Looper;
import d7.s;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ph.g0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final s f8398a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f8399b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f8400c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final a f8401d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.this.f8400c.post(runnable);
        }
    }

    public c(ExecutorService executorService) {
        s sVar = new s(executorService);
        this.f8398a = sVar;
        this.f8399b = bg.b.g(sVar);
    }

    @Override // e7.b
    public final g0 a() {
        return this.f8399b;
    }

    @Override // e7.b
    public final a b() {
        return this.f8401d;
    }

    @Override // e7.b
    public final s c() {
        return this.f8398a;
    }
}
