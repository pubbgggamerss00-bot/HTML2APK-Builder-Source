package t0;

/* loaded from: classes.dex */
public final class lc extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f26390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u3<ic> f26391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(ic icVar, u3<ic> u3Var) {
        super(0);
        this.f26390a = icVar;
        this.f26391b = u3Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        u3<ic> u3Var = this.f26391b;
        Object obj = u3Var.f27117a;
        ic icVar = this.f26390a;
        if (!kotlin.jvm.internal.r.a(icVar, obj)) {
            qg.t.r(new i0.h3(icVar, 1), u3Var.f27118b);
            x0.g2 g2Var = u3Var.f27119c;
            if (g2Var != null) {
                g2Var.invalidate();
            }
        }
        return pg.f0.f21461a;
    }
}
