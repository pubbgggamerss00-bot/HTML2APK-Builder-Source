package v;

import v.j0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.s implements eh.l<s.k<Float, s.o>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.d0 f29883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f29884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f29885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.a f29886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kotlin.jvm.internal.d0 d0Var, f0 f0Var, s0 s0Var, j0.a aVar) {
        super(1);
        this.f29883a = d0Var;
        this.f29884b = f0Var;
        this.f29885c = s0Var;
        this.f29886d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke(s.k<Float, s.o> kVar) {
        s.k<Float, s.o> kVar2 = kVar;
        float fFloatValue = ((Number) kVar2.f23791e.getValue()).floatValue();
        kotlin.jvm.internal.d0 d0Var = this.f29883a;
        float f10 = fFloatValue - d0Var.f16322a;
        if (e0.a(f10)) {
            if (((Boolean) this.f29886d.invoke(Float.valueOf(d0Var.f16322a))).booleanValue()) {
                kVar2.a();
            }
        } else if (e0.a(f10 - f0.a(this.f29884b, this.f29885c, f10))) {
            d0Var.f16322a += f10;
            if (((Boolean) this.f29886d.invoke(Float.valueOf(d0Var.f16322a))).booleanValue()) {
            }
        } else {
            kVar2.a();
        }
        return pg.f0.f21461a;
    }
}
