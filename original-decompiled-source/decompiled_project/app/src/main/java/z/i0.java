package z;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.s implements eh.l<g2.g1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f34545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f34546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, m0 m0Var) {
        super(1);
        this.f34545a = j0Var;
        this.f34546b = m0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g2.g1 g1Var) {
        int iJ;
        int iB;
        g2.g1 g1Var2 = g1Var;
        if (g1Var2 != null) {
            m0 m0Var = this.f34546b;
            iJ = m0Var.j(g1Var2);
            iB = m0Var.b(g1Var2);
        } else {
            iJ = 0;
            iB = 0;
        }
        p.g gVar = new p.g(p.g.a(iJ, iB));
        j0 j0Var = this.f34545a;
        j0Var.f34556g = gVar;
        j0Var.f34554e = g1Var2;
        return pg.f0.f21461a;
    }
}
