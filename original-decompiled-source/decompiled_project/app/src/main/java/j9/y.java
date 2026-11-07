package j9;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15647b;

    public /* synthetic */ y(Object obj, int i10) {
        this.f15646a = i10;
        this.f15647b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f15646a) {
            case 0:
                sh.z0 z0Var = ((x1) this.f15647b).f15629l;
                Boolean bool = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool);
                break;
            default:
                ((m9.g0) this.f15647b).f();
                break;
        }
        return pg.f0.f21461a;
    }
}
