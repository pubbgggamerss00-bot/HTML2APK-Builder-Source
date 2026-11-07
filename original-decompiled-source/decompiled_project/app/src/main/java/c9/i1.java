package c9;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f5114b;

    public /* synthetic */ i1(x0.n1 n1Var, int i10) {
        this.f5113a = i10;
        this.f5114b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f5113a) {
            case 0:
                r0.m(this.f5114b, false);
                break;
            default:
                ((x0.l1) this.f5114b).f(r0.g() - 1);
                break;
        }
        return pg.f0.f21461a;
    }
}
