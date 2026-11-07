package s;

/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f23767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1<Object>.d<Object, Object> f23768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(y1<Object> y1Var, y1<Object>.d<Object, Object> dVar) {
        super(1);
        this.f23767a = y1Var;
        this.f23768b = dVar;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        y1<Object> y1Var = this.f23767a;
        h1.u<y1<Object>.d<?, ?>> uVar = y1Var.f24009i;
        y1<Object>.d<?, ?> dVar = this.f23768b;
        uVar.add(dVar);
        return new g2(y1Var, dVar);
    }
}
