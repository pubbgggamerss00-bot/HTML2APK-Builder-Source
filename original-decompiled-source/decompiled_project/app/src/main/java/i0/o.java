package i0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.s implements eh.l<y2.c0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f13466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f13467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f13468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(eh.l<? super String, pg.f0> lVar, x0.n1<y2.c0> n1Var, x0.n1<String> n1Var2) {
        super(1);
        this.f13466a = lVar;
        this.f13467b = n1Var;
        this.f13468c = n1Var2;
    }

    @Override // eh.l
    public final pg.f0 invoke(y2.c0 c0Var) {
        y2.c0 c0Var2 = c0Var;
        this.f13467b.setValue(c0Var2);
        x0.n1<String> n1Var = this.f13468c;
        boolean zA = kotlin.jvm.internal.r.a(n1Var.getValue(), c0Var2.f33682a.f27761b);
        t2.b bVar = c0Var2.f33682a;
        n1Var.setValue(bVar.f27761b);
        if (!zA) {
            this.f13466a.invoke(bVar.f27761b);
        }
        return pg.f0.f21461a;
    }
}
