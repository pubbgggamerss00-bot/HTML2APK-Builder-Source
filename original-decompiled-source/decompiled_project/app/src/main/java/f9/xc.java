package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class xc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10947b;

    public /* synthetic */ xc(Object obj, int i10) {
        this.f10946a = i10;
        this.f10947b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10946a) {
            case 0:
                fg fgVar = (fg) this.f10947b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.B0;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                q8.e0 e0Var = (q8.e0) this.f10947b;
                g2.v it2 = (g2.v) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                e0Var.f22177a = it2;
                break;
        }
        return pg.f0.f21461a;
    }
}
