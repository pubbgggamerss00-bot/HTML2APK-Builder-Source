package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;

/* loaded from: classes.dex */
public final class p3 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f33074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f33075b;

    public p3(j6 j6Var, p5.x xVar) {
        this.f33074a = j6Var;
        this.f33075b = xVar;
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
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 24);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
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
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            t0.t4.b(p0.d1.a(), null, androidx.compose.foundation.layout.g.n(aVar, 48), c2.n0.c(4294956800L), jVar2, 3504, 0);
            float f10 = 16;
            String strA = pd.d.a(aVar, f10, jVar2, R.string.offer_dialog_title, jVar2);
            x0.s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26544g;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var2 = t0.f2.f25858a;
            ff.b(strA, null, ((t0.e2) jVar2.f(s3Var2)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
            ff.b(pd.d.a(aVar, 12, jVar2, R.string.offer_dialog_message, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 20), jVar2);
            jVar2.L(-1153255832);
            j6 j6Var = this.f33074a;
            boolean zL = jVar2.l(j6Var);
            p5.x xVar = this.f33075b;
            boolean zL2 = zL | jVar2.l(xVar);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL2 || objG == c0321a) {
                objG = new b9.v2(2, j6Var, xVar);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.x0.a((eh.a) objG, androidx.compose.foundation.layout.g.d(aVar, 1.0f), false, h0.f.a(f10), null, null, null, null, c.f32352j, jVar2, 805306416, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            jVar2.L(-1153241912);
            boolean zL3 = jVar2.l(j6Var);
            Object objG2 = jVar2.g();
            if (zL3 || objG2 == c0321a) {
                objG2 = new a9.m1(j6Var, 2);
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.x0.d((eh.a) objG2, null, false, null, null, null, c.f32353k, jVar2, 805306368, 510);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
