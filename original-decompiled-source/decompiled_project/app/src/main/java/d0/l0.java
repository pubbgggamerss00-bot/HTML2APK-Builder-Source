package d0;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f7186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f7187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2.s1 f7188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f7189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d1 d1Var, c0 c0Var, g2.s1 s1Var, h2 h2Var) {
        super(1);
        this.f7186a = d1Var;
        this.f7187b = c0Var;
        this.f7188c = s1Var;
        this.f7189d = h2Var;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        e2 e2Var = new e2(this.f7187b, this.f7188c, this.f7189d);
        d1 d1Var = this.f7186a;
        d1Var.f7087d = e2Var;
        return new k0(d1Var);
    }
}
