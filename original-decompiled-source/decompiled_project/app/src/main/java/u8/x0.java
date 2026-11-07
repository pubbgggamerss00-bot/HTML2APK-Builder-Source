package u8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import t0.ff;
import x0.a2;
import x0.j;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class x0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8.i f29536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f29537b;

    public x0(k8.i iVar, d1 d1Var) {
        this.f29536a = iVar;
        this.f29537b = d1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        boolean z10;
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 10);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            ff.b(f3.q.c(R.string.cat_farm_shop_tuna_header, jVar2), null, c2.n0.c(4294956800L), f3.u.c(14), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 200064, 0, 131026);
            float f10 = 8;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            m1 m1VarA = k1.a(z.b.h(f10), d.a.f14611j, jVar2, 6);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
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
            k8.i iVar = this.f29536a;
            boolean z11 = iVar.f16122c >= 10;
            z.g1 g1Var = t0.m0.f26400a;
            t0.l0 l0VarA = t0.m0.a(c2.n0.c(4286331629L), 0L, c2.n0.c(4282201390L), jVar2, 10);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            jVar2.L(-629106679);
            d1 d1Var = this.f29537b;
            boolean zL = jVar2.l(d1Var);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                z10 = false;
                objG = new t0(d1Var, 0);
                jVar2.C(objG);
            } else {
                z10 = false;
            }
            jVar2.B();
            t0.x0.a((eh.a) objG, layoutWeightElement, z11, null, l0VarA, null, null, null, f1.c.b(1929755022, new v0(iVar), jVar2), jVar2, 805306368, 488);
            boolean z12 = iVar.f16122c >= 20;
            t0.l0 l0VarA2 = t0.m0.a(c2.n0.c(4279150057L), 0L, c2.n0.c(4282201390L), jVar2, 10);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            jVar2.L(-629052535);
            boolean zL2 = jVar2.l(d1Var);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new u0(d1Var, 0);
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.x0.a((eh.a) objG2, layoutWeightElement2, z12, null, l0VarA2, null, null, null, f1.c.b(1463310725, new w0(iVar), jVar2), jVar2, 805306368, 488);
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
