package s;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0<Object> f23707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z0<Object> z0Var) {
        super(0);
        this.f23707a = z0Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        z0<Object> z0Var = this.f23707a;
        y1<Object> y1Var = z0Var.f24051e;
        z0Var.f24052f = y1Var != null ? ((Number) y1Var.f24012l.getValue()).longValue() : 0L;
        return pg.f0.f21461a;
    }
}
