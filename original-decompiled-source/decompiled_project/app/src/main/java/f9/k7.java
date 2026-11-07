package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9922b;

    public /* synthetic */ k7(Object obj, int i10) {
        this.f9921a = i10;
        this.f9922b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9921a) {
            case 0:
                fg fgVar = (fg) this.f9922b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.U0;
                z0Var.getClass();
                z0Var.j(null, it);
                return pg.f0.f21461a;
            default:
                return obj == ((qg.a) this.f9922b) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
