package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class ub implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f10726b;

    public /* synthetic */ ub(androidx.lifecycle.w0 w0Var, int i10) {
        this.f10725a = i10;
        this.f10726b = w0Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10725a) {
            case 0:
                fg fgVar = (fg) this.f10726b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.V0;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                g9.y yVar = (g9.y) this.f10726b;
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                String strB0 = mh.y.b0(50, mh.t.n(mh.t.n(it2, "\n", ""), "\r", ""));
                sh.z0 z0Var2 = yVar.f11835i;
                z0Var2.getClass();
                z0Var2.j(null, strB0);
                yVar.m(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
