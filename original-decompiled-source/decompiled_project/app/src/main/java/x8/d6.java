package x8;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import f9.vf;
import i2.e0;
import i2.g;
import j1.d;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class d6 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f32511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f32512b;

    public d6(Context context, eh.a aVar) {
        this.f32511a = context;
        this.f32512b = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 20);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
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
            ph.v1.j(bVar, m1VarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            md.a(androidx.compose.foundation.layout.g.n(aVar, 34), h0.f.f12083a, c2.n0.c(4292030255L), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, c.D, jVar2, 12583302, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            float f10 = 12;
            String strB = r.e2.b(aVar, f10, jVar2, R.string.sideload_warning_title, jVar2);
            x0.s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var2 = t0.f2.f25858a;
            long j10 = ((t0.e2) jVar2.f(s3Var2)).f25771q;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            ff.b(strB, new LayoutWeightElement(1.0f, true), j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65496);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 32);
            f1.b bVar2 = c.E;
            eh.a<pg.f0> aVar3 = this.f32512b;
            t0.s4.c(aVar3, dVarN, false, null, bVar2, jVar2, 196656, 28);
            jVar2.H();
            float f11 = 14;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f11), jVar2);
            t0.v2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.5f, ((t0.e2) jVar2.f(s3Var2)).B), jVar2, 0, 3);
            ff.b(pd.d.a(aVar, f11, jVar2, R.string.sideload_warning_desc, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, f3.u.c(21), 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 6, 64506);
            float f12 = 18;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar2);
            h0.e eVarA = h0.f.a(f10);
            long jC = q1.b1.c(0.35f, ((t0.e2) jVar2.f(s3Var2)).f25755c);
            t.v vVarA = a9.d2.a(1, q1.b1.c(0.4f, ((t0.e2) jVar2.f(s3Var2)).f25751a));
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(258165195);
            Context context = this.f32511a;
            boolean zL = jVar2.l(context);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new vf(context, 2);
                jVar2.C(objG);
            }
            jVar2.B();
            md.a(androidx.compose.foundation.b.c(dVarD2, false, null, null, (eh.a) objG, 7), eVarA, jC, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, c.F, jVar2, 12582912, 56);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar2);
            h0.e eVarA2 = h0.f.a(f10);
            z.g1 g1Var = t0.m0.f26400a;
            t0.x0.a(aVar3, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 46), false, eVarA2, t0.m0.a(((t0.e2) jVar2.f(s3Var2)).f25751a, 0L, 0L, jVar2, 14), null, null, null, c.G, jVar2, 805306416, 484);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
