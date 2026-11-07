package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class pf implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f10252b;

    public /* synthetic */ pf(x0.n1 n1Var, int i10) {
        this.f10251a = i10;
        this.f10252b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f10251a) {
            case 0:
                this.f10252b.setValue(Boolean.FALSE);
                break;
            default:
                this.f10252b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
        }
        return pg.f0.f21461a;
    }
}
