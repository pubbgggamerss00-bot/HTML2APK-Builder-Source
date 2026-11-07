package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10519a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10521c;

    public /* synthetic */ t0(String str, boolean z10, int i10) {
        this.f10521c = str;
        this.f10520b = z10;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10519a) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = f3.i.n(49);
                d1.v((String) this.f10521c, this.f10520b, (x0.j) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = f3.i.n(1);
                t8.w.d(this.f10520b, (eh.a) this.f10521c, (x0.j) obj, iN2);
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ t0(boolean z10, eh.a aVar, int i10) {
        this.f10520b = z10;
        this.f10521c = aVar;
    }
}
