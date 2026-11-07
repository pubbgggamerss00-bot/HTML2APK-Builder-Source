package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4023b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.f4022a = i10;
        this.f4023b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4022a) {
            case 0:
                ((eh.a) this.f4023b).invoke();
                break;
            default:
                ((x0.n1) this.f4023b).setValue(Boolean.TRUE);
                break;
        }
        return pg.f0.f21461a;
    }
}
