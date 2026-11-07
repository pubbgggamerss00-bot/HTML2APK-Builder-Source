package i2;

/* loaded from: classes.dex */
public final class k1 implements g2.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final g2.p f13932a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f13933b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f13934c;

    public k1(g2.p pVar, m1 m1Var, n1 n1Var) {
        this.f13932a = pVar;
        this.f13933b = m1Var;
        this.f13934c = n1Var;
    }

    @Override // g2.p
    public final int J(int i10) {
        return this.f13932a.J(i10);
    }

    @Override // g2.p
    public final int O(int i10) {
        return this.f13932a.O(i10);
    }

    @Override // g2.k0
    public final g2.g1 P(long j10) {
        n1 n1Var = this.f13934c;
        n1 n1Var2 = n1.f13960a;
        m1 m1Var = this.f13933b;
        g2.p pVar = this.f13932a;
        if (n1Var == n1Var2) {
            return new l1(m1Var == m1.f13954b ? pVar.O(f3.b.h(j10)) : pVar.J(f3.b.h(j10)), f3.b.d(j10) ? f3.b.h(j10) : 32767);
        }
        return new l1(f3.b.e(j10) ? f3.b.i(j10) : 32767, m1Var == m1.f13954b ? pVar.z(f3.b.i(j10)) : pVar.b0(f3.b.i(j10)));
    }

    @Override // g2.p
    public final int b0(int i10) {
        return this.f13932a.b0(i10);
    }

    @Override // g2.p
    public final Object w() {
        return this.f13932a.w();
    }

    @Override // g2.p
    public final int z(int i10) {
        return this.f13932a.z(i10);
    }
}
