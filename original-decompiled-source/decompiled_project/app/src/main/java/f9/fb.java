package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class fb implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f9545b;

    public /* synthetic */ fb(x0.n1 n1Var, int i10) {
        this.f9544a = i10;
        this.f9545b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9544a) {
            case 0:
                this.f9545b.setValue(Boolean.TRUE);
                break;
            default:
                this.f9545b.setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
