package h9;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Iterator;
import p0.e6;
import p0.ia;
import p0.t7;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class k2 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4 f12697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<k9.a> f12699c;

    public k2(b4 b4Var, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f12697a = b4Var;
        this.f12698b = n1Var;
        this.f12699c = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        w1.d dVarB;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = true;
            androidx.compose.ui.d dVarE = ph.m0.e(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), ph.m0.c(jVar2), true);
            z.q qVarA = z.o.a(z.b.h(4), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarE, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.L(-1083189535);
            Iterator<T> it = k9.a.f16174f.iterator();
            while (it.hasNext()) {
                final k9.a aVar2 = (k9.a) it.next();
                boolean z11 = this.f12699c.getValue() == aVar2 ? z10 : false;
                switch (aVar2.ordinal()) {
                    case 0:
                        dVarB = p0.s0.f21022a;
                        if (dVarB == null) {
                            d.a aVar3 = new d.a("Filled.BrightnessAuto", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i10 = w1.m.f31210a;
                            q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                            w1.e eVar = new w1.e();
                            eVar.h(10.85f, 12.65f);
                            eVar.e(2.3f);
                            eVar.f(12.0f, 9.0f);
                            eVar.g(-1.15f, 3.65f);
                            eVar.a();
                            eVar.h(20.0f, 8.69f);
                            eVar.k(4.0f);
                            eVar.e(-4.69f);
                            eVar.f(12.0f, 0.69f);
                            eVar.f(8.69f, 4.0f);
                            eVar.d(4.0f);
                            eVar.l(4.69f);
                            eVar.f(0.69f, 12.0f);
                            eVar.f(4.0f, 15.31f);
                            eVar.k(20.0f);
                            eVar.e(4.69f);
                            eVar.f(12.0f, 23.31f);
                            eVar.f(15.31f, 20.0f);
                            eVar.d(20.0f);
                            eVar.l(-4.69f);
                            p0.f0.a(eVar, 23.31f, 12.0f, 20.0f, 8.69f);
                            eVar.h(14.3f, 16.0f);
                            eVar.g(-0.7f, -2.0f);
                            eVar.e(-3.2f);
                            eVar.g(-0.7f, 2.0f);
                            eVar.d(7.8f);
                            eVar.f(11.0f, 7.0f);
                            eVar.e(2.0f);
                            eVar.g(3.2f, 9.0f);
                            eVar.e(-1.9f);
                            eVar.a();
                            d.a.a(aVar3, eVar.f31100a, 0, i2Var);
                            dVarB = aVar3.b();
                            p0.s0.f21022a = dVarB;
                            break;
                        }
                        break;
                    case 1:
                        dVarB = e6.a();
                        break;
                    case 2:
                        dVarB = p0.u1.a();
                        break;
                    case 3:
                        dVarB = ia.a();
                        break;
                    case 4:
                        dVarB = p0.b3.a();
                        break;
                    case 5:
                        dVarB = t7.a();
                        break;
                    case 6:
                        dVarB = p0.k2.a();
                        break;
                    case 7:
                        dVarB = p0.d2.a();
                        break;
                    default:
                        throw new pg.l();
                }
                String strC = f3.q.c(aVar2.f16176b, jVar2);
                jVar2.L(-1270318628);
                final b4 b4Var = this.f12697a;
                boolean zL = jVar2.l(b4Var) | jVar2.K(aVar2);
                final x0.n1<Boolean> n1Var = this.f12698b;
                boolean zK = zL | jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: h9.j2
                        @Override // eh.a
                        public final Object invoke() {
                            b4 b4Var2 = b4Var;
                            ph.h.c(androidx.lifecycle.x0.a(b4Var2), null, null, new y3(b4Var2, aVar2, null), 3);
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                v3.h(aVar2, dVarB, strC, z11, (eh.a) objG, jVar2, 0);
                z10 = true;
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
