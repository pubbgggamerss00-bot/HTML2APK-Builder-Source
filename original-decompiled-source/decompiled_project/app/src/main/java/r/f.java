package r;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements eh.q<g2.o0, g2.k0, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f22815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n0 n0Var) {
        super(3);
        this.f22815a = n0Var;
    }

    @Override // eh.q
    public final g2.m0 b(g2.o0 o0Var, g2.k0 k0Var, f3.b bVar) {
        g2.g1 g1VarP = k0Var.P(bVar.f8811a);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, qg.a0.f22708a, new e(g1VarP, this.f22815a));
    }
}
