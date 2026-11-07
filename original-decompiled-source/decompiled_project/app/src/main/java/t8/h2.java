package t8;

/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28235c;

    public /* synthetic */ h2(int i10, Object obj, Object obj2) {
        this.f28233a = i10;
        this.f28234b = obj;
        this.f28235c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f28233a) {
            case 0:
                ((m3) this.f28234b).o(((y3) this.f28235c).f28581a, new e3());
                break;
            default:
                ((h1.u) this.f28234b).remove((u8.g1) this.f28235c);
                break;
        }
        return pg.f0.f21461a;
    }
}
