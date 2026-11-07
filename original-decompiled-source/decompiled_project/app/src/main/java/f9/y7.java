package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a f11015b;

    public /* synthetic */ y7(int i10, int i11, eh.a aVar) {
        this.f11014a = i11;
        this.f11015b = aVar;
    }

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11014a;
        x0.j jVar = (x0.j) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                b8.b(f3.i.n(7), this.f11015b, jVar);
                break;
            default:
                j9.d0.e(f3.i.n(1), this.f11015b, jVar);
                break;
        }
        return pg.f0.f21461a;
    }
}
