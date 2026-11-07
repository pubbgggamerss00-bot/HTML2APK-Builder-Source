package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class zc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11097b;

    public /* synthetic */ zc(Object obj, int i10) {
        this.f11096a = i10;
        this.f11097b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f11096a) {
            case 0:
                fg fgVar = (fg) this.f11097b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.L0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            default:
                t8.y3 y3Var = (t8.y3) this.f11097b;
                return e1.c.a(y3Var.f28581a, ((Integer) obj).intValue(), "c", "-");
        }
    }
}
