package m9;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17768b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.f17767a = i10;
        this.f17768b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17767a) {
            case 0:
                g0 g0Var = (g0) this.f17768b;
                g0Var.l();
                g0Var.j();
                break;
            default:
                ((x0.n1) this.f17768b).setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
