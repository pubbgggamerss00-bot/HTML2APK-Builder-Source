package x8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import p0.gc;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class a6 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f32226a;

    public a6(float f10) {
        this.f32226a = f10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, 14, 10);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            w1.d dVarA = gc.a();
            String strC = f3.q.c(R.string.sideload_warning_badge_content_description, jVar2);
            long j10 = g5.f32667c;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 32);
            jVar2.L(1286179873);
            final float f10 = this.f32226a;
            boolean zH = jVar2.h(f10);
            Object objG = jVar2.g();
            if (zH || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: x8.z5
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        q1.l1 graphicsLayer = (q1.l1) obj;
                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                        float f11 = f10;
                        graphicsLayer.h(f11);
                        graphicsLayer.d(f11);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t0.t4.b(dVarA, strC, androidx.compose.ui.graphics.a.a(dVarN, (eh.l) objG), j10, jVar2, 3072, 0);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 12), jVar2);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, qVarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            String strC2 = f3.q.c(R.string.sideload_warning_title, jVar2);
            x0.s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26546i;
            x2.p pVar = x2.p.f32033f;
            long j11 = q1.b1.f21650d;
            ff.b(strC2, null, j11, 0L, pVar, null, 0L, null, 0L, 0, false, 1, 0, l0Var, jVar2, 196992, 3072, 57306);
            ff.b(f3.q.c(R.string.sideload_warning_banner, jVar2), null, q1.b1.c(0.95f, j11), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 384, 3120, 55290);
            jVar2.H();
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 8), jVar2);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(aVar, 30), j10, h0.f.f12083a);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            ff.b("!", null, g5.f32666b, 0L, x2.p.f32035h, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26545h, jVar2, 196998, 0, 65498);
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
