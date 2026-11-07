package s;

import s.l0;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f23854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a<Object, Object> f23855b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, l0.a<Object, Object> aVar) {
        super(1);
        this.f23854a = l0Var;
        this.f23855b = aVar;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        l0 l0Var2 = this.f23854a;
        z0.b<l0.a<?, ?>> bVar = l0Var2.f23803a;
        l0.a<Object, Object> aVar = this.f23855b;
        bVar.b(aVar);
        l0Var2.f23804b.setValue(Boolean.TRUE);
        return new n0(l0Var2, aVar);
    }
}
