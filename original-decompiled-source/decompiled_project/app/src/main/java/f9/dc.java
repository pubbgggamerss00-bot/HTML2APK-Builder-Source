package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class dc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9329b;

    public /* synthetic */ dc(Object obj, int i10) {
        this.f9328a = i10;
        this.f9329b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object it) {
        switch (this.f9328a) {
            case 0:
                fg fgVar = (fg) this.f9329b;
                String it2 = (String) it;
                kotlin.jvm.internal.r.e(it2, "it");
                sh.z0 z0Var = fgVar.f9592u;
                z0Var.getClass();
                z0Var.j(null, it2);
                return pg.f0.f21461a;
            case 1:
                g9.y yVar = (g9.y) this.f9329b;
                String it3 = (String) it;
                kotlin.jvm.internal.r.e(it3, "it");
                sh.z0 z0Var2 = yVar.f11842p;
                z0Var2.getClass();
                z0Var2.j(null, it3);
                yVar.m(null);
                return pg.f0.f21461a;
            default:
                eh.a aVar = (eh.a) this.f9329b;
                kotlin.jvm.internal.r.e(it, "it");
                return aVar.invoke();
        }
    }
}
