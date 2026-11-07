package e0;

/* loaded from: classes.dex */
public final class s0 implements d0.h1, v.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.b1 f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f8286b;

    public s0(v.b1 b1Var, d1 d1Var) {
        this.f8286b = d1Var;
        this.f8285a = b1Var;
    }

    @Override // d0.h1
    public final int a() {
        return ((n) qg.x.J(this.f8286b.l().f())).getIndex();
    }

    @Override // d0.h1
    public final void b(int i10, int i11) {
        this.f8286b.t(i10, i11 / r0.o(), true);
    }

    @Override // d0.h1
    public final int c() {
        return this.f8286b.f8148f;
    }

    @Override // d0.h1
    public final int d(int i10) {
        d1 d1Var = this.f8286b;
        return (int) (jh.j.n(d0.b1.b(d1Var) + gh.a.b(((d1Var.o() * (i10 - d1Var.j())) - (d1Var.k() * d1Var.o())) + 0), d1Var.f8150h, d1Var.f8149g) - d0.b1.b(d1Var));
    }

    @Override // v.b1
    public final float e(float f10) {
        return this.f8285a.e(f10);
    }

    @Override // d0.h1
    public final int f() {
        return this.f8286b.f8147e;
    }

    @Override // d0.h1
    public final int getItemCount() {
        return this.f8286b.m();
    }
}
