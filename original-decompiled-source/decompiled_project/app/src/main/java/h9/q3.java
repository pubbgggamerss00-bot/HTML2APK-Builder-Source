package h9;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class q3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f12767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4 f12768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f12769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<l9.b> f12770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.r3<String> f12771f;

    public q3(Context context, ph.i0 i0Var, b4 b4Var, x0.n1 n1Var, List list, x0.n1 n1Var2) {
        this.f12766a = context;
        this.f12767b = i0Var;
        this.f12768c = b4Var;
        this.f12769d = n1Var;
        this.f12770e = list;
        this.f12771f = n1Var2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) throws Resources.NotFoundException {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
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
            l9.d0.f16789a.getClass();
            String strD = l9.d0.d(this.f12766a, "system");
            x0.r3<String> r3Var = this.f12771f;
            boolean zA = kotlin.jvm.internal.r.a(r3Var.getValue(), "system");
            jVar2.L(-1083298744);
            final ph.i0 i0Var = this.f12767b;
            boolean zL = jVar2.l(i0Var);
            final b4 b4Var = this.f12768c;
            boolean zL2 = zL | jVar2.l(b4Var);
            final x0.n1<Boolean> n1Var = this.f12769d;
            boolean zK = zL2 | jVar2.K(n1Var);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                objG = new eh.a() { // from class: h9.m3
                    @Override // eh.a
                    public final Object invoke() {
                        ph.h.c(i0Var, null, null, new o3(b4Var, null), 3);
                        n1Var.setValue(Boolean.FALSE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            v3.a(strD, zA, (eh.a) objG, jVar2, 0);
            jVar2.L(-1083291387);
            for (final l9.b bVar : this.f12770e) {
                String strA = bVar.a();
                boolean zA2 = kotlin.jvm.internal.r.a(r3Var.getValue(), bVar.f16781a);
                jVar2.L(-1270444009);
                boolean zL3 = jVar2.l(i0Var) | jVar2.l(b4Var) | jVar2.K(bVar) | jVar2.K(n1Var);
                Object objG2 = jVar2.g();
                if (zL3 || objG2 == c0321a) {
                    objG2 = new eh.a() { // from class: h9.n3
                        @Override // eh.a
                        public final Object invoke() {
                            ph.h.c(i0Var, null, null, new p3(b4Var, bVar, null), 3);
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                v3.a(strA, zA2, (eh.a) objG2, jVar2, 0);
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
