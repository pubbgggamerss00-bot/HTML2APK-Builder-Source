package q8;

/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f22422b;

    public /* synthetic */ v2(x0.n1 n1Var, int i10) {
        this.f22421a = i10;
        this.f22422b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f22421a) {
            case 0:
                this.f22422b.setValue(Boolean.FALSE);
                break;
            default:
                u8.y.c(this.f22422b, false);
                break;
        }
        return pg.f0.f21461a;
    }
}
