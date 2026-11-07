package u8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import ph.v1;
import t0.ff;
import t0.md;
import x0.a2;
import x0.j;
import z.b;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class a1 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8.i f29394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f29395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f29396c;

    public a1(k8.i iVar, d1 d1Var, boolean z10) {
        this.f29394a = iVar;
        this.f29395b = d1Var;
        this.f29396c = z10;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        x0.j jVar2;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar = d.a.f1143b;
            float f10 = 12;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10);
            b.g gVar = z.b.f34450g;
            f.b bVar = d.a.f14612k;
            m1 m1VarA = k1.a(gVar, bVar, jVar3, 54);
            int iD = jVar3.D();
            a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            v1.j(bVar2, m1VarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar3);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            m1 m1VarA2 = k1.a(z.b.f34444a, bVar, jVar3, 48);
            int iD2 = jVar3.D();
            a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, m1VarA2, jVar3);
            v1.j(dVar, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar3);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar, 44), c2.n0.c(4281872167L), h0.f.f12083a);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD3 = jVar3.D();
            a2 a2VarY3 = jVar3.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, l0VarD, jVar3);
            v1.j(dVar, a2VarY3, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar3, iD3, c0128a);
            }
            v1.j(cVar, dVarC3, jVar3);
            ff.b("👑", null, 0L, f3.u.c(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 3078, 0, 131062);
            jVar3.H();
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 10), jVar3);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar3, 0);
            int iD4 = jVar3.D();
            a2 a2VarY4 = jVar3.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(aVar, jVar3);
            if (jVar3.t() == null) {
                u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar2);
            } else {
                jVar3.z();
            }
            v1.j(bVar2, qVarA, jVar3);
            v1.j(dVar, a2VarY4, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD4))) {
                l9.i.a(iD4, jVar3, iD4, c0128a);
            }
            v1.j(cVar, dVarC4, jVar3);
            ff.b(f3.q.c(R.string.cat_farm_shop_vip_title, jVar3), null, q1.b1.f21650d, f3.u.c(14), x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 200064, 0, 131026);
            ff.b(f3.q.c(R.string.cat_farm_shop_vip_sub, jVar3), null, c2.n0.c(4288582279L), f3.u.c(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar3, 3456, 0, 131058);
            jVar3.H();
            jVar3.H();
            if (this.f29394a.f16135p) {
                jVar3.L(837494839);
                md.a(null, h0.f.a(8), c2.n0.c(4286926094L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, e1.f29441f, jVar3, 12583296, 121);
                jVar3.B();
                jVar2 = jVar3;
            } else {
                jVar3.L(838160440);
                jVar3.L(581227700);
                d1 d1Var = this.f29395b;
                boolean zL = jVar3.l(d1Var);
                Object objG = jVar3.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new y0(d1Var, 0);
                    jVar3.C(objG);
                }
                eh.a aVar3 = (eh.a) objG;
                jVar3.B();
                z.g1 g1Var = t0.m0.f26400a;
                t0.l0 l0VarA = t0.m0.a(c2.n0.c(4293571336L), 0L, c2.n0.c(4282201390L), jVar3, 10);
                float f11 = 6;
                z.g1 g1Var2 = new z.g1(f10, f11, f10, f11);
                boolean z10 = this.f29396c;
                jVar2 = jVar3;
                t0.x0.a(aVar3, null, z10, null, l0VarA, null, null, g1Var2, f1.c.b(993233907, new z0(z10), jVar3), jVar2, 817889280, 362);
                jVar2.B();
            }
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
