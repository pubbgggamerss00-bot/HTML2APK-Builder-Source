package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10759a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f10760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10761c;

    public /* synthetic */ v1(eh.l lVar, x0.n1 n1Var) {
        this.f10760b = lVar;
        this.f10761c = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10759a) {
            case 0:
                Integer num = (Integer) this.f10761c;
                if (num != null) {
                    this.f10760b.invoke(num);
                }
                break;
            default:
                x0.n1 n1Var = (x0.n1) this.f10761c;
                this.f10760b.invoke(null);
                n1Var.setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ v1(Integer num, eh.l lVar) {
        this.f10761c = num;
        this.f10760b = lVar;
    }
}
