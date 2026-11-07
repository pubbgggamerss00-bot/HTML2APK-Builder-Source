package j3;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f15101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g0 g0Var, o0 o0Var) {
        super(1);
        this.f15100a = g0Var;
        this.f15101b = o0Var;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        o0 o0Var = this.f15101b;
        g0 g0Var = this.f15100a;
        g0Var.setPositionProvider(o0Var);
        g0Var.o();
        return new o();
    }
}
