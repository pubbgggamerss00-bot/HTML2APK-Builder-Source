package x0;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.s implements eh.l<Object, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f31910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.m0<Object> f31911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(p.m0 m0Var, f0 f0Var) {
        super(1);
        this.f31910a = f0Var;
        this.f31911b = m0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(Object obj) {
        this.f31910a.o(obj);
        p.m0<Object> m0Var = this.f31911b;
        if (m0Var != null) {
            m0Var.d(obj);
        }
        return pg.f0.f21461a;
    }
}
