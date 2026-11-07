package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9987b;

    public /* synthetic */ l9(Object obj, int i10) {
        this.f9986a = i10;
        this.f9987b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9986a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f9987b;
                ((Boolean) obj).getClass();
                n1Var.setValue(Boolean.valueOf(!((Boolean) n1Var.getValue()).booleanValue()));
                break;
            default:
                h9.b4 b4Var = (h9.b4) this.f9987b;
                ph.h.c(androidx.lifecycle.x0.a(b4Var), null, null, new h9.a4(b4Var, ((Boolean) obj).booleanValue(), null), 3);
                break;
        }
        return pg.f0.f21461a;
    }
}
