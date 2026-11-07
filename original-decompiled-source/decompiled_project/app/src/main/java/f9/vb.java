package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class vb implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.w0 f10811b;

    public /* synthetic */ vb(androidx.lifecycle.w0 w0Var, int i10) {
        this.f10810a = i10;
        this.f10811b = w0Var;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10810a) {
            case 0:
                fg fgVar = (fg) this.f10811b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.f9590t;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                g9.y yVar = (g9.y) this.f10811b;
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                String strB0 = mh.y.b0(100, mh.x.W(mh.t.n(mh.t.n(it2, "\n", ""), "\r", "")).toString());
                sh.z0 z0Var2 = yVar.f11836j;
                z0Var2.getClass();
                z0Var2.j(null, strB0);
                yVar.m(null);
                break;
        }
        return pg.f0.f21461a;
    }
}
