package a9;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f241b;

    public /* synthetic */ i1(Object obj, int i10) {
        this.f240a = i10;
        this.f241b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f240a) {
            case 0:
                s8.b2.e((p5.x) this.f241b);
                break;
            default:
                ((eh.a) this.f241b).invoke();
                break;
        }
        return pg.f0.f21461a;
    }
}
