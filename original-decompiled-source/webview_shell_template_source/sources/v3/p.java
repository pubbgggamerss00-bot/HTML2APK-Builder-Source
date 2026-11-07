package v3;

import com.google.android.gms.internal.ads.n31;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14815a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n31 f14816b = new n31();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14817c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f14818d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14819e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f14820f;

    public final void a(Executor executor, c cVar) {
        this.f14816b.b(new k(executor, cVar));
        m();
    }

    public final p b(Executor executor, d dVar) {
        this.f14816b.b(new l(executor, dVar));
        m();
        return this;
    }

    public final <TContinuationResult> p c(Executor executor, a<TResult, TContinuationResult> aVar) {
        p pVar = new p();
        this.f14816b.b(new h(executor, aVar, pVar));
        m();
        return pVar;
    }

    public final Exception d() {
        Exception exc;
        synchronized (this.f14815a) {
            exc = this.f14820f;
        }
        return exc;
    }

    public final TResult e() {
        TResult tresult;
        synchronized (this.f14815a) {
            try {
                com.google.android.gms.common.internal.l.h("Task is not yet complete", this.f14817c);
                if (this.f14818d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f14820f;
                if (exc != null) {
                    throw new e(exc);
                }
                tresult = (TResult) this.f14819e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    public final boolean f() {
        return this.f14818d;
    }

    public final boolean g() {
        boolean z6;
        synchronized (this.f14815a) {
            z6 = this.f14817c;
        }
        return z6;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f14815a) {
            try {
                z6 = false;
                if (this.f14817c && !this.f14818d && this.f14820f == null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    public final void i(Exception exc) {
        com.google.android.gms.common.internal.l.g("Exception must not be null", exc);
        synchronized (this.f14815a) {
            l();
            this.f14817c = true;
            this.f14820f = exc;
        }
        this.f14816b.c(this);
    }

    public final void j(Object obj) {
        synchronized (this.f14815a) {
            l();
            this.f14817c = true;
            this.f14819e = obj;
        }
        this.f14816b.c(this);
    }

    public final void k() {
        synchronized (this.f14815a) {
            try {
                if (this.f14817c) {
                    return;
                }
                this.f14817c = true;
                this.f14818d = true;
                this.f14816b.c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        if (this.f14817c) {
            int i6 = b.s;
            if (!g()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excD = d();
        }
    }

    public final void m() {
        synchronized (this.f14815a) {
            try {
                if (this.f14817c) {
                    this.f14816b.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
