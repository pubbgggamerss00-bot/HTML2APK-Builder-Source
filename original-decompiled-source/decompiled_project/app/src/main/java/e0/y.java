package e0;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f8327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z10, b bVar, ph.i0 i0Var) {
        super(1);
        this.f8325a = z10;
        this.f8326b = bVar;
        this.f8327c = i0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        boolean z10 = this.f8325a;
        ph.i0 i0Var = this.f8327c;
        b bVar = this.f8326b;
        if (z10) {
            u uVar = new u(bVar, i0Var);
            kh.i<Object>[] iVarArr = q2.a0.f21754a;
            d0Var2.c(q2.k.f21796x, new q2.a(null, uVar));
            d0Var2.c(q2.k.f21798z, new q2.a(null, new v(bVar, i0Var)));
        } else {
            w wVar = new w(bVar, i0Var);
            kh.i<Object>[] iVarArr2 = q2.a0.f21754a;
            d0Var2.c(q2.k.f21797y, new q2.a(null, wVar));
            d0Var2.c(q2.k.A, new q2.a(null, new x(bVar, i0Var)));
        }
        return pg.f0.f21461a;
    }
}
