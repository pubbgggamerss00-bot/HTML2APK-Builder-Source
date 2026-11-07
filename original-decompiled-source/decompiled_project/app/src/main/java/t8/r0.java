package t8;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f28421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28422c;

    public /* synthetic */ r0(Object obj, eh.l lVar, int i10, int i11) {
        this.f28420a = i11;
        this.f28422c = obj;
        this.f28421b = lVar;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28420a) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = f3.i.n(1);
                s0.a((h8.j) this.f28422c, this.f28421b, (x0.j) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = f3.i.n(1);
                z8.j.a((String) this.f28422c, this.f28421b, (x0.j) obj, iN2);
                break;
        }
        return pg.f0.f21461a;
    }
}
