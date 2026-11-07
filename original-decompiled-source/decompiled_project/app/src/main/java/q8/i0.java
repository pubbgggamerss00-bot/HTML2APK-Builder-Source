package q8;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22229d;

    public /* synthetic */ i0(Object obj, int i10, int i11, Object obj2) {
        this.f22226a = i11;
        this.f22228c = obj;
        this.f22229d = obj2;
        this.f22227b = i10;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22226a) {
            case 0:
                ((Integer) obj2).intValue();
                p0.b((z.i) this.f22228c, (w0) this.f22229d, (x0.j) obj, f3.i.n(this.f22227b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                t8.v2.l((String) this.f22228c, (eh.a) this.f22229d, (x0.j) obj, f3.i.n(this.f22227b | 1));
                break;
        }
        return pg.f0.f21461a;
    }
}
