package w7;

import g7.w;
import java.util.concurrent.CancellationException;
import pg.f0;
import ph.s1;

/* loaded from: classes.dex */
public final class q implements n, androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final g7.t f31419a;

    /* renamed from: b, reason: collision with root package name */
    public final f f31420b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.l f31421c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f31422d;

    public q(g7.t tVar, f fVar, y7.b bVar, androidx.lifecycle.l lVar, s1 s1Var) {
        this.f31419a = tVar;
        this.f31420b = fVar;
        this.f31421c = lVar;
        this.f31422d = s1Var;
    }

    @Override // androidx.lifecycle.e
    public final void M(androidx.lifecycle.t tVar) {
        throw null;
    }

    @Override // w7.n
    public final void a() {
        throw null;
    }

    @Override // w7.n
    public final Object c(w wVar) {
        Object objA;
        androidx.lifecycle.l lVar = this.f31421c;
        return (lVar == null || (objA = b8.k.a(lVar, wVar)) != ug.a.f29706a) ? f0.f21461a : objA;
    }

    public final void d() {
        this.f31422d.cancel((CancellationException) null);
        androidx.lifecycle.l lVar = this.f31421c;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // w7.n
    public final void start() {
        androidx.lifecycle.l lVar = this.f31421c;
        if (lVar != null) {
            lVar.a(this);
        }
        throw null;
    }
}
