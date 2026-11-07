package h9;

/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12819b;

    public /* synthetic */ u2(Object obj, int i10) {
        this.f12818a = i10;
        this.f12819b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12818a) {
            case 0:
                ((x0.n1) this.f12819b).setValue(Boolean.TRUE);
                break;
            default:
                m9.s1 s1Var = (m9.s1) this.f12819b;
                m9.g0 g0Var = s1Var.f17901d;
                int currentPage = g0Var.getCurrentPage() - 1;
                if (s1Var.f17908l) {
                    g0Var.n(currentPage);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
