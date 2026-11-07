package z;

/* loaded from: classes.dex */
public final class v0 extends x0 {

    /* renamed from: q, reason: collision with root package name */
    public w0 f34650q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34651r;

    @Override // z.x0
    public final long T1(g2.k0 k0Var, long j10) {
        int iB0 = this.f34650q == w0.f34658a ? k0Var.b0(f3.b.i(j10)) : k0Var.z(f3.b.i(j10));
        if (iB0 < 0) {
            iB0 = 0;
        }
        if (iB0 < 0) {
            f3.l.a("height must be >= 0");
        }
        return f3.c.h(0, Integer.MAX_VALUE, iB0, iB0);
    }

    @Override // z.x0
    public final boolean U1() {
        return this.f34651r;
    }

    @Override // z.x0, i2.b0
    public final int r(i2.l0 l0Var, g2.p pVar, int i10) {
        return this.f34650q == w0.f34658a ? pVar.b0(i10) : pVar.z(i10);
    }

    @Override // z.x0, i2.b0
    public final int w(i2.l0 l0Var, g2.p pVar, int i10) {
        return this.f34650q == w0.f34658a ? pVar.b0(i10) : pVar.z(i10);
    }
}
