package e0;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements eh.p<Float, Float, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f8179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f8180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlin.jvm.internal.d0 d0Var, s0 s0Var) {
        super(2);
        this.f8179a = d0Var;
        this.f8180b = s0Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(Float f10, Float f11) {
        float fFloatValue = f10.floatValue();
        f11.floatValue();
        kotlin.jvm.internal.d0 d0Var = this.f8179a;
        d0Var.f16322a += this.f8180b.f8285a.e(fFloatValue - d0Var.f16322a);
        return pg.f0.f21461a;
    }
}
