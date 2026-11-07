package c0;

import d0.a2;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f4468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, int i10) {
        super(2);
        this.f4468a = rVar;
        this.f4469b = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            a2<i> a2Var = this.f4468a.f4476b.f4402b;
            int i10 = this.f4469b;
            d0.g<i> gVarB = a2Var.b(i10);
            ((i) gVarB.f7133c).f4396d.f(w.f4503a, Integer.valueOf(i10 - gVarB.f7131a), jVar2, 6);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
