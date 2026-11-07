package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class wc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10861b;

    public /* synthetic */ wc(Object obj, int i10) {
        this.f10860a = i10;
        this.f10861b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f10860a;
        Object obj2 = this.f10861b;
        switch (i10) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = ((fg) obj2).f9594v;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                String strB0 = mh.y.b0(4000, it2);
                mh.k kVar = t8.v2.f28495e;
                ((x0.n1) obj2).setValue(strB0);
                break;
        }
        return pg.f0.f21461a;
    }
}
