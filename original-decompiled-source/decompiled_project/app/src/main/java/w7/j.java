package w7;

import g7.w;
import java.util.concurrent.CancellationException;
import pg.f0;
import ph.s1;

/* loaded from: classes.dex */
public final class j implements n, androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.l f31398a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f31399b;

    public j(androidx.lifecycle.l lVar, s1 s1Var) {
        this.f31398a = lVar;
        this.f31399b = s1Var;
    }

    @Override // androidx.lifecycle.e
    public final void M(androidx.lifecycle.t tVar) {
        this.f31399b.cancel((CancellationException) null);
    }

    @Override // w7.n
    public final void b() {
        this.f31398a.c(this);
    }

    @Override // w7.n
    public final Object c(w wVar) throws Throwable {
        Object objA = b8.k.a(this.f31398a, wVar);
        return objA == ug.a.f29706a ? objA : f0.f21461a;
    }

    @Override // w7.n
    public final void start() {
        this.f31398a.a(this);
    }
}
