package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9782b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.f9781a = i10;
        this.f9782b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9781a) {
            case 0:
                ph.v1.e((tg.h) this.f9782b);
                break;
            case 1:
                ((fg) this.f9782b).f9553a0.setValue(null);
                break;
            default:
                ((x0.n1) this.f9782b).setValue(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
