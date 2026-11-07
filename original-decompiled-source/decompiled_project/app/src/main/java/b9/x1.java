package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4144b;

    public /* synthetic */ x1(Object obj, int i10) {
        this.f4143a = i10;
        this.f4144b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4143a;
        Object obj = this.f4144b;
        switch (i10) {
            case 0:
                q1.d1 d1Var = o1.f3960b;
                ((x0.n1) obj).setValue(Boolean.FALSE);
                break;
            default:
                ((eh.l) obj).invoke(0);
                break;
        }
        return pg.f0.f21461a;
    }
}
