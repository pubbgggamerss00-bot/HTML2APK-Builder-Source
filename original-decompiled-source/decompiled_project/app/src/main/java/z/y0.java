package z;

/* loaded from: classes.dex */
public final class y0 extends x0 {

    /* renamed from: q, reason: collision with root package name */
    public w0 f34691q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34692r;

    @Override // z.x0, i2.b0
    public final int F(i2.l0 l0Var, g2.p pVar, int i10) {
        return this.f34691q == w0.f34658a ? pVar.J(i10) : pVar.O(i10);
    }

    @Override // z.x0, i2.b0
    public final int G(i2.l0 l0Var, g2.p pVar, int i10) {
        return this.f34691q == w0.f34658a ? pVar.J(i10) : pVar.O(i10);
    }

    @Override // z.x0
    public final long T1(g2.k0 k0Var, long j10) {
        int iJ = this.f34691q == w0.f34658a ? k0Var.J(f3.b.h(j10)) : k0Var.O(f3.b.h(j10));
        if (iJ < 0) {
            iJ = 0;
        }
        if (iJ < 0) {
            f3.l.a("width must be >= 0");
        }
        return f3.c.h(iJ, iJ, 0, Integer.MAX_VALUE);
    }

    @Override // z.x0
    public final boolean U1() {
        return this.f34692r;
    }
}
