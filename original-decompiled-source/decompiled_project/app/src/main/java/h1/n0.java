package h1;

import androidx.datastore.preferences.protobuf.u1;
import h1.n;

/* loaded from: classes.dex */
public final class n0 extends h {

    /* renamed from: e, reason: collision with root package name */
    public final h f12172e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12173f;

    /* renamed from: g, reason: collision with root package name */
    public eh.l<Object, pg.f0> f12174g;

    /* renamed from: h, reason: collision with root package name */
    public final long f12175h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(h hVar, eh.l lVar, boolean z10) {
        eh.l<Object, pg.f0> lVarE;
        super(0L, l.f12135e);
        n.a aVar = n.f12158a;
        this.f12172e = hVar;
        this.f12173f = z10;
        this.f12174g = n.l(lVar, (hVar == null || (lVarE = hVar.e()) == null) ? n.f12167j.f12093e : lVarE, false);
        this.f12175h = u1.a();
    }

    @Override // h1.h
    public final void c() {
        h hVar;
        this.f12123c = true;
        if (!this.f12173f || (hVar = this.f12172e) == null) {
            return;
        }
        hVar.c();
    }

    @Override // h1.h
    public final l d() {
        return v().d();
    }

    @Override // h1.h
    public final eh.l e() {
        return this.f12174g;
    }

    @Override // h1.h
    public final boolean f() {
        return v().f();
    }

    @Override // h1.h
    public final long g() {
        return v().g();
    }

    @Override // h1.h
    public final eh.l<Object, pg.f0> i() {
        return null;
    }

    @Override // h1.h
    public final void k() {
        x.a();
        throw null;
    }

    @Override // h1.h
    public final void l() {
        x.a();
        throw null;
    }

    @Override // h1.h
    public final void m() {
        v().m();
    }

    @Override // h1.h
    public final void n(i0 i0Var) {
        v().n(i0Var);
    }

    @Override // h1.h
    public final h u(eh.l<Object, pg.f0> lVar) {
        return n.h(v().u(null), n.l(lVar, this.f12174g, true), true);
    }

    public final h v() {
        h hVar = this.f12172e;
        return hVar == null ? n.f12167j : hVar;
    }
}
