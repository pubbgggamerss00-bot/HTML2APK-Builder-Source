package h1;

import h1.n;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: e, reason: collision with root package name */
    public final eh.l<Object, pg.f0> f12113e;

    /* renamed from: f, reason: collision with root package name */
    public int f12114f;

    public f(long j10, l lVar, eh.l<Object, pg.f0> lVar2) {
        super(j10, lVar);
        this.f12113e = lVar2;
        this.f12114f = 1;
    }

    @Override // h1.h
    public final void c() {
        if (this.f12123c) {
            return;
        }
        l();
        super.c();
    }

    @Override // h1.h
    public final eh.l e() {
        return this.f12113e;
    }

    @Override // h1.h
    public final boolean f() {
        return true;
    }

    @Override // h1.h
    public final eh.l<Object, pg.f0> i() {
        return null;
    }

    @Override // h1.h
    public final void k() {
        this.f12114f++;
    }

    @Override // h1.h
    public final void l() {
        int i10 = this.f12114f - 1;
        this.f12114f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // h1.h
    public final void m() {
    }

    @Override // h1.h
    public final void n(i0 i0Var) {
        n.a aVar = n.f12158a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // h1.h
    public final h u(eh.l<Object, pg.f0> lVar) {
        n.d(this);
        return new e(this.f12122b, this.f12121a, n.l(lVar, this.f12113e, true), this);
    }
}
