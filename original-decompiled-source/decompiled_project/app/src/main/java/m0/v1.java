package m0;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.s implements eh.l<o1.h0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17536a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(r1 r1Var) {
        super(1);
        this.f17536a = r1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(o1.h0 h0Var) {
        o1.h0 h0Var2 = h0Var;
        r1 r1Var = this.f17536a;
        x0.x1 x1Var = r1Var.f17477i;
        if (!h0Var2.a() && ((Boolean) x1Var.getValue()).booleanValue()) {
            r1Var.i();
        }
        x1Var.setValue(Boolean.valueOf(h0Var2.a()));
        return pg.f0.f21461a;
    }
}
