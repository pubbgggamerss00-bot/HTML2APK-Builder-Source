package u8;

import android.app.Activity;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import q8.v2;
import t0.af;
import t0.s4;
import x0.a2;
import x0.j;
import x0.l1;
import x0.n1;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class h0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f29468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f29469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f29470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f29471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f29472e;

    public h0(l1 l1Var, n1 n1Var, d1 d1Var, Activity activity, n1 n1Var2) {
        this.f29468a = l1Var;
        this.f29469b = n1Var;
        this.f29470c = d1Var;
        this.f29471d = activity;
        this.f29472e = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r ModalBottomSheet = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 480));
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 16, 10);
            m1 m1VarA = k1.a(z.b.f34450g, d.a.f14612k, jVar2, 54);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar2);
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            v1.j(bVar, m1VarA, jVar2);
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            l1 l1Var = this.f29468a;
            int iG = l1Var.g();
            long j10 = q1.b1.f21653g;
            long jC = c2.n0.c(4294956800L);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            af.b(iG, new LayoutWeightElement(1.0f, true), j10, jC, f1.c.b(1533893607, new d0(l1Var), jVar2), null, f1.c.b(1128435175, new g0(l1Var), jVar2), jVar2, 1600896, 32);
            jVar2.L(1717887376);
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new v2(this.f29469b, 1);
                jVar2.C(objG);
            }
            jVar2.B();
            s4.c((eh.a) objG, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar, 32), c2.n0.c(4280951581L), h0.f.f12083a), false, null, e1.f29438c, jVar2, 196614, 28);
            jVar2.H();
            androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.f976c, 14, 6);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD3 = jVar2.D();
            a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarI2, jVar2);
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            v1.j(bVar, l0VarD, jVar2);
            v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            v1.j(cVar, dVarC3, jVar2);
            int iG2 = l1Var.g();
            d1 d1Var = this.f29470c;
            n1 n1Var = this.f29472e;
            if (iG2 == 0) {
                jVar2.L(1717914703);
                y.d((k8.i) n1Var.getValue(), d1Var, jVar2, 64);
                jVar2.B();
                pg.f0 f0Var = pg.f0.f21461a;
            } else if (iG2 == 1) {
                jVar2.L(1717917458);
                y.k((k8.i) n1Var.getValue(), d1Var, jVar2, 64);
                jVar2.B();
                pg.f0 f0Var2 = pg.f0.f21461a;
            } else if (iG2 == 2) {
                jVar2.L(1717920308);
                y.a((k8.i) n1Var.getValue(), d1Var, jVar2, 64);
                jVar2.B();
                pg.f0 f0Var3 = pg.f0.f21461a;
            } else if (iG2 == 3) {
                jVar2.L(1717923217);
                y.h((k8.i) n1Var.getValue(), d1Var, jVar2, 64);
                jVar2.B();
                pg.f0 f0Var4 = pg.f0.f21461a;
            } else if (iG2 != 4) {
                jVar2.L(1716196007);
                jVar2.B();
                pg.f0 f0Var5 = pg.f0.f21461a;
            } else {
                jVar2.L(1717926052);
                y.i((k8.i) n1Var.getValue(), d1Var, this.f29471d, jVar2, 64);
                jVar2.B();
                pg.f0 f0Var6 = pg.f0.f21461a;
            }
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
