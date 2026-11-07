package h1;

import h1.n;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: e, reason: collision with root package name */
    public final eh.l<Object, pg.f0> f12111e;

    /* renamed from: f, reason: collision with root package name */
    public final h f12112f;

    public e(long j10, l lVar, eh.l<Object, pg.f0> lVar2, h hVar) {
        super(j10, lVar);
        this.f12111e = lVar2;
        this.f12112f = hVar;
        hVar.k();
    }

    @Override // h1.h
    public final void c() {
        if (this.f12123c) {
            return;
        }
        long j10 = this.f12122b;
        h hVar = this.f12112f;
        if (j10 != hVar.g()) {
            a();
        }
        hVar.l();
        super.c();
    }

    @Override // h1.h
    public final eh.l e() {
        return this.f12111e;
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
    }

    @Override // h1.h
    public final void n(i0 i0Var) {
        n.a aVar = n.f12158a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // h1.h
    public final h u(eh.l lVar) {
        return new e(this.f12122b, this.f12121a, n.l(lVar, this.f12111e, true), this.f12112f);
    }
}
