package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4156b;

    public /* synthetic */ y1(Object obj, int i10) {
        this.f4155a = i10;
        this.f4156b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4155a;
        Object obj = this.f4156b;
        switch (i10) {
            case 0:
                q1.d1 d1Var = o1.f3960b;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                break;
            default:
                ((eh.l) obj).invoke(1);
                break;
        }
        return pg.f0.f21461a;
    }
}
