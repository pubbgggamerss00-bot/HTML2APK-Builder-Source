package h9;

/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f12701b;

    public /* synthetic */ k3(x0.n1 n1Var, int i10) {
        this.f12700a = i10;
        this.f12701b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12700a) {
            case 0:
                v3.e(this.f12701b, false);
                break;
            default:
                this.f12701b.setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
