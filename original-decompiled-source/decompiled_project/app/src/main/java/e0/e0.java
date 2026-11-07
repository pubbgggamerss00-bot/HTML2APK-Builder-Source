package e0;

import d0.a2;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f8170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, int i10) {
        super(2);
        this.f8170a = f0Var;
        this.f8171b = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            a2 a2VarF = this.f8170a.f8177b.f();
            int i10 = this.f8171b;
            d0.g gVarB = a2VarF.b(i10);
            ((s) gVarB.f7133c).f8284b.f(q0.f8274a, Integer.valueOf(i10 - gVarB.f7131a), jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
