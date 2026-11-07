package h9;

/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f12817b;

    public /* synthetic */ u1(x0.n1 n1Var, int i10) {
        this.f12816a = i10;
        this.f12817b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12816a) {
            case 0:
                this.f12817b.setValue(Boolean.FALSE);
                break;
            default:
                this.f12817b.setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
