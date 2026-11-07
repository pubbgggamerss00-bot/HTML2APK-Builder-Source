package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class y8 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11017b;

    public /* synthetic */ y8(Object obj, int i10) {
        this.f11016a = i10;
        this.f11017b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f11016a) {
            case 0:
                ((eh.l) this.f11017b).invoke("");
                return pg.f0.f21461a;
            case 1:
                ((x0.n1) this.f11017b).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            default:
                return (k7.a) ((g7.t) this.f11017b).f11525a.f11533d.getValue();
        }
    }
}
