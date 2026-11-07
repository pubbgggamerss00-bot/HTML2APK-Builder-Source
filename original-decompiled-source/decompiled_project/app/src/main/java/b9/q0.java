package b9;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4065b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f4064a = i10;
        this.f4065b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4064a) {
            case 0:
                ((x0.n1) this.f4065b).setValue(Boolean.TRUE);
                return pg.f0.f21461a;
            case 1:
                ((x0.n1) this.f4065b).setValue(null);
                return pg.f0.f21461a;
            default:
                return this.f4065b;
        }
    }
}
