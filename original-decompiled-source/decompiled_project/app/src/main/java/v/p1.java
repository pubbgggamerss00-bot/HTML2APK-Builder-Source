package v;

/* loaded from: classes.dex */
public final class p1 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f30028a;

    public p1(s1 s1Var) {
        this.f30028a = s1Var;
    }

    @Override // v.s0
    public final long a(long j10) {
        s1 s1Var = this.f30028a;
        return s1.a(s1Var, s1Var.f30076j, j10, 1);
    }

    @Override // v.s0
    public final long b(int i10, long j10) {
        s1 s1Var = this.f30028a;
        s1Var.f30075i = i10;
        t.i1 i1Var = s1Var.f30068b;
        return (i1Var == null || !(s1Var.f30067a.d() || s1Var.f30067a.b())) ? s1.a(s1Var, s1Var.f30076j, j10, i10) : i1Var.a(j10, s1Var.f30075i, s1Var.f30078l);
    }
}
