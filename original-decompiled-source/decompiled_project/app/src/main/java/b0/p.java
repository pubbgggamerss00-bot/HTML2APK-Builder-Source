package b0;

import d0.a2;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f3412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3413b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i10) {
        super(2);
        this.f3412a = qVar;
        this.f3413b = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            q qVar = this.f3412a;
            a2<i> a2Var = qVar.f3417b.f3380a;
            int i10 = this.f3413b;
            d0.g<i> gVarB = a2Var.b(i10);
            ((i) gVarB.f7133c).f3368c.f(qVar.f3418c, Integer.valueOf(i10 - gVarB.f7131a), jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
