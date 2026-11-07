package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import z.b;

/* loaded from: classes.dex */
public final class g4 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f9664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f9665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9666c;

    public g4(b bVar, t0.e2 e2Var, long j10) {
        this.f9664a = bVar;
        this.f9665b = e2Var;
        this.f9666c = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 14);
            b.k kVar = z.b.f34446c;
            f.a aVar2 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, qVarA2, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            b bVar2 = this.f9664a;
            String strC = f3.q.c(bVar2.f8988a, jVar2);
            x0.s3 s3Var = t0.of.f26647a;
            t0.ff.b(strC, null, 0L, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(s3Var)).f26546i, jVar2, 196608, 0, 65502);
            String strC2 = f3.q.c(bVar2.f8989b, jVar2);
            t2.l0 l0Var = ((t0.nf) jVar2.f(s3Var)).f26549l;
            t0.e2 e2Var = this.f9665b;
            t0.ff.b(strC2, null, e2Var.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65530);
            jVar2.H();
            t0.t4.b(r0.a.a(), f3.q.c(R.string.editor_html_snippet_insert, jVar2), androidx.compose.foundation.layout.f.l(aVar, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), this.f9666c, jVar2, 384, 0);
            jVar2.H();
            float f10 = 10;
            t0.ff.b(bVar2.f8990c, androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), h0.f.a(f10)), e2Var.H, q1.y1.f21750a), f10), e2Var.f25773s, 0L, null, null, 0L, null, 0L, 2, false, 6, 0, new t2.l0(0L, f3.u.c(11), null, x2.f.f32016c, 0L, 0, f3.u.c(16), 16646109), jVar2, 0, 3120, 55288);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
