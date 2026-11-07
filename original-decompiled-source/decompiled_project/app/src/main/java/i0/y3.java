package i0;

import x.o;

/* loaded from: classes.dex */
public final class y3 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<o.b> f13705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f13706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(x0.n1<o.b> n1Var, x.m mVar) {
        super(1);
        this.f13705a = n1Var;
        this.f13706b = mVar;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        return new x3(this.f13705a, this.f13706b);
    }
}
