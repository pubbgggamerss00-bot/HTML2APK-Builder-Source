package g2;

/* loaded from: classes.dex */
public final class q0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f11422a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f11423b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f11424c;

    public q0(p pVar, s0 s0Var, t0 t0Var) {
        this.f11422a = pVar;
        this.f11423b = s0Var;
        this.f11424c = t0Var;
    }

    @Override // g2.p
    public final int J(int i10) {
        return this.f11422a.J(i10);
    }

    @Override // g2.p
    public final int O(int i10) {
        return this.f11422a.O(i10);
    }

    @Override // g2.k0
    public final g1 P(long j10) {
        t0 t0Var = this.f11424c;
        t0 t0Var2 = t0.f11451a;
        s0 s0Var = this.f11423b;
        p pVar = this.f11422a;
        if (t0Var == t0Var2) {
            return new r0(s0Var == s0.f11438b ? pVar.O(f3.b.h(j10)) : pVar.J(f3.b.h(j10)), f3.b.d(j10) ? f3.b.h(j10) : 32767);
        }
        return new r0(f3.b.e(j10) ? f3.b.i(j10) : 32767, s0Var == s0.f11438b ? pVar.z(f3.b.i(j10)) : pVar.b0(f3.b.i(j10)));
    }

    @Override // g2.p
    public final int b0(int i10) {
        return this.f11422a.b0(i10);
    }

    @Override // g2.p
    public final Object w() {
        return this.f11422a.w();
    }

    @Override // g2.p
    public final int z(int i10) {
        return this.f11422a.z(i10);
    }
}
