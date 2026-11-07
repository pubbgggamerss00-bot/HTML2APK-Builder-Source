package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class fd implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9548b;

    public /* synthetic */ fd(Object obj, int i10) {
        this.f9547a = i10;
        this.f9548b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9547a) {
            case 0:
                fg fgVar = (fg) this.f9548b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.f9596w;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                x0.n1 n1Var = (x0.n1) this.f9548b;
                y2.c0 it2 = (y2.c0) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                ((eh.l) n1Var.getValue()).invoke(it2);
                break;
        }
        return pg.f0.f21461a;
    }
}
