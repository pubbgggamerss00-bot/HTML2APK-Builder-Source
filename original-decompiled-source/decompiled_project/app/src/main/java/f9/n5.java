package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class n5 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10103a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pg.f f10106d;

    public /* synthetic */ n5(String str, eh.l lVar, boolean z10, int i10) {
        this.f10105c = str;
        this.f10106d = lVar;
        this.f10104b = z10;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10103a) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = f3.i.n(1);
                b8.e((String) this.f10105c, (eh.l) this.f10106d, this.f10104b, (x0.j) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = f3.i.n(385);
                k9.j.a((k9.a) this.f10105c, this.f10104b, (f1.b) this.f10106d, (x0.j) obj, iN2);
                break;
        }
        return pg.f0.f21461a;
    }

    public /* synthetic */ n5(k9.a aVar, boolean z10, f1.b bVar, int i10) {
        this.f10105c = aVar;
        this.f10104b = z10;
        this.f10106d = bVar;
    }
}
