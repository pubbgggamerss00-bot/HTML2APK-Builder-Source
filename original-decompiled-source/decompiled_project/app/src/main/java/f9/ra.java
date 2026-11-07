package f9;

/* loaded from: classes.dex */
public final /* synthetic */ class ra implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10380b;

    public /* synthetic */ ra(Object obj, int i10) {
        this.f10379a = i10;
        this.f10380b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10379a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f10380b;
                ((Boolean) obj).getClass();
                n1Var.setValue(Boolean.valueOf(!((Boolean) n1Var.getValue()).booleanValue()));
                break;
            default:
                v8.q qVar = (v8.q) this.f10380b;
                String action = (String) obj;
                kotlin.jvm.internal.r.e(action, "action");
                if (((String) qVar.f30742f.getValue()) == null) {
                    qVar.f30741e.invoke(action);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
