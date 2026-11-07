package i0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f13439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(y2.c0 c0Var, x0.n1<y2.c0> n1Var) {
        super(0);
        this.f13438a = c0Var;
        this.f13439b = n1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        y2.c0 c0Var = this.f13438a;
        long j10 = c0Var.f33683b;
        x0.n1<y2.c0> n1Var = this.f13439b;
        if (!t2.j0.a(j10, n1Var.getValue().f33683b) || !kotlin.jvm.internal.r.a(c0Var.f33684c, n1Var.getValue().f33684c)) {
            n1Var.setValue(c0Var);
        }
        return pg.f0.f21461a;
    }
}
