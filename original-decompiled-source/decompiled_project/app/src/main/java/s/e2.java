package s;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(y1<Object> y1Var, y1<Object> y1Var2) {
        super(1);
        this.f23718a = y1Var;
        this.f23719b = y1Var2;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        y1<Object> y1Var = this.f23718a;
        h1.u<y1<?>> uVar = y1Var.f24010j;
        y1<?> y1Var2 = this.f23719b;
        uVar.add(y1Var2);
        return new d2(y1Var, y1Var2);
    }
}
