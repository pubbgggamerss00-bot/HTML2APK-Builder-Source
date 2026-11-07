package t;

import g2.e1;
import m0.i3;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.p implements eh.p<o1.h0, o1.h0, pg.f0> {
    @Override // eh.p
    public final pg.f0 invoke(o1.h0 h0Var, o1.h0 h0Var2) {
        boolean zB;
        m0 m0VarX1;
        o1.h0 h0Var3 = h0Var;
        o1.h0 h0Var4 = h0Var2;
        j0 j0Var = (j0) this.receiver;
        if (j0Var.f1157p && (zB = h0Var4.b()) != h0Var3.b()) {
            eh.l<Boolean, pg.f0> lVar = j0Var.f25265t;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(zB));
            }
            if (zB) {
                ph.h.c(j0Var.H1(), null, null, new l0(j0Var, null), 3);
                kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                i2.p1.a(j0Var, new i3(1, g0Var, j0Var));
                g2.e1 e1Var = (g2.e1) g0Var.f16327a;
                j0Var.f25267w = e1Var != null ? e1Var.b() : null;
                i2.g1 g1Var = j0Var.f25268x;
                if (g1Var != null && g1Var.l1().f1157p && (m0VarX1 = j0Var.X1()) != null) {
                    m0VarX1.T1(j0Var.f25268x);
                }
            } else {
                e1.a aVar = j0Var.f25267w;
                if (aVar != null) {
                    aVar.a();
                }
                j0Var.f25267w = null;
                m0 m0VarX12 = j0Var.X1();
                if (m0VarX12 != null) {
                    m0VarX12.T1(null);
                }
            }
            i2.k.f(j0Var).P();
            x.m mVar = j0Var.f25264s;
            if (mVar != null) {
                if (zB) {
                    x.e eVar = j0Var.f25266v;
                    if (eVar != null) {
                        j0Var.W1(mVar, new x.f(eVar));
                        j0Var.f25266v = null;
                    }
                    x.e eVar2 = new x.e();
                    j0Var.W1(mVar, eVar2);
                    j0Var.f25266v = eVar2;
                } else {
                    x.e eVar3 = j0Var.f25266v;
                    if (eVar3 != null) {
                        j0Var.W1(mVar, new x.f(eVar3));
                        j0Var.f25266v = null;
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
