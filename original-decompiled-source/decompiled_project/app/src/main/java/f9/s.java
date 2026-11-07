package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10457b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f10456a = i10;
        this.f10457b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10456a) {
            case 0:
                ((x0.n1) this.f10457b).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            case 1:
                ((j9.x1) this.f10457b).g();
                return pg.f0.f21461a;
            default:
                return new p5.h0((String) this.f10457b);
        }
    }
}
