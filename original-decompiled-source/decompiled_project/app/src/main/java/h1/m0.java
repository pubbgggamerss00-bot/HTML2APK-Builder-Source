package h1;

import androidx.datastore.preferences.protobuf.u1;
import h1.n;

/* loaded from: classes.dex */
public final class m0 extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f12152o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12153p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12154q;

    /* renamed from: r, reason: collision with root package name */
    public eh.l<Object, pg.f0> f12155r;

    /* renamed from: s, reason: collision with root package name */
    public eh.l<Object, pg.f0> f12156s;

    /* renamed from: t, reason: collision with root package name */
    public final long f12157t;

    /* JADX WARN: Illegal instructions before constructor call */
    public m0(c cVar, eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2, boolean z10, boolean z11) {
        eh.l<Object, pg.f0> lVarI;
        eh.l<Object, pg.f0> lVarE;
        n.a aVar = n.f12158a;
        super(0L, l.f12135e, n.l(lVar, (cVar == null || (lVarE = cVar.e()) == null) ? n.f12167j.f12093e : lVarE, z10), n.b(lVar2, (cVar == null || (lVarI = cVar.i()) == null) ? n.f12167j.f12094f : lVarI));
        this.f12152o = cVar;
        this.f12153p = z10;
        this.f12154q = z11;
        this.f12155r = this.f12093e;
        this.f12156s = this.f12094f;
        this.f12157t = u1.a();
    }

    @Override // h1.c
    public final void B(p.m0<i0> m0Var) {
        x.a();
        throw null;
    }

    @Override // h1.c
    public final c C(eh.l<Object, pg.f0> lVar, eh.l<Object, pg.f0> lVar2) {
        eh.l<Object, pg.f0> lVarL = n.l(lVar, this.f12155r, true);
        eh.l<Object, pg.f0> lVarB = n.b(lVar2, this.f12156s);
        return !this.f12153p ? new m0(D().C(null, lVarB), lVarL, lVarB, false, true) : D().C(lVarL, lVarB);
    }

    public final c D() {
        c cVar = this.f12152o;
        return cVar == null ? n.f12167j : cVar;
    }

    @Override // h1.c, h1.h
    public final void c() {
        c cVar;
        this.f12123c = true;
        if (!this.f12154q || (cVar = this.f12152o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // h1.h
    public final l d() {
        return D().d();
    }

    @Override // h1.c, h1.h
    public final eh.l e() {
        return this.f12155r;
    }

    @Override // h1.c, h1.h
    public final boolean f() {
        return D().f();
    }

    @Override // h1.h
    public final long g() {
        return D().g();
    }

    @Override // h1.c, h1.h
    public final int h() {
        return D().h();
    }

    @Override // h1.c, h1.h
    public final eh.l<Object, pg.f0> i() {
        return this.f12156s;
    }

    @Override // h1.c, h1.h
    public final void k() {
        x.a();
        throw null;
    }

    @Override // h1.c, h1.h
    public final void l() {
        x.a();
        throw null;
    }

    @Override // h1.c, h1.h
    public final void m() {
        D().m();
    }

    @Override // h1.c, h1.h
    public final void n(i0 i0Var) {
        D().n(i0Var);
    }

    @Override // h1.h
    public final void r(l lVar) {
        x.a();
        throw null;
    }

    @Override // h1.h
    public final void s(long j10) {
        x.a();
        throw null;
    }

    @Override // h1.c, h1.h
    public final void t(int i10) {
        D().t(i10);
    }

    @Override // h1.c, h1.h
    public final h u(eh.l<Object, pg.f0> lVar) {
        eh.l<Object, pg.f0> lVarL = n.l(lVar, this.f12155r, true);
        return !this.f12153p ? n.h(D().u(null), lVarL, true) : D().u(lVarL);
    }

    @Override // h1.c
    public final i w() {
        return D().w();
    }

    @Override // h1.c
    public final p.m0<i0> x() {
        return D().x();
    }

    @Override // h1.c
    /* renamed from: y */
    public final eh.l<Object, pg.f0> e() {
        return this.f12155r;
    }
}
