package i9;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import d0.d2;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ph.v1;
import q1.b1;
import q1.q1;
import s1.a;
import t0.ff;
import t0.m0;
import t0.md;
import t0.nf;
import t0.of;
import t0.x0;
import x0.a2;
import x0.j;
import x0.r3;
import x0.s3;
import z.g1;

/* loaded from: classes.dex */
public final class c0 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f14295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f14296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f14297c;

    public c0(eh.a<pg.f0> aVar, r3<Float> r3Var, r3<Float> r3Var2) {
        this.f14295a = aVar;
        this.f14296b = r3Var;
        this.f14297c = r3Var2;
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
            float f10 = 24;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, f10, 28);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
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
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 110);
            j1.f fVar = d.a.f14606e;
            l0 l0VarD = z.g.d(fVar, false);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarN, jVar2);
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
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            jVar2.L(861096399);
            final r3<Float> r3Var = this.f14296b;
            boolean zK = jVar2.K(r3Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: i9.b0
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        s1.e Canvas = (s1.e) obj;
                        kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                        float fFloatValue = ((Number) r3Var.getValue()).floatValue();
                        long jH1 = Canvas.h1();
                        a.b bVarQ0 = Canvas.Q0();
                        long jD = bVarQ0.d();
                        bVarQ0.a().d();
                        try {
                            bVarQ0.f24180a.d(fFloatValue, jH1);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.i() >> 32)) / 2.0f;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)) / 2.0f;
                            z.d(Canvas, (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), Float.intBitsToFloat((int) (Canvas.i() >> 32)) / 2.0f, b1.c(0.35f, n0.c(4294956800L)));
                            t.r.a(bVarQ0, jD);
                            return pg.f0.f21461a;
                        } catch (Throwable th2) {
                            t.r.a(bVarQ0, jD);
                            throw th2;
                        }
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            t.w.a(fillElement, (eh.l) objG, jVar2, 6);
            androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, 76);
            float fFloatValue = this.f14297c.getValue().floatValue();
            androidx.compose.ui.d dVarC3 = d2.c(dVarN2, fFloatValue, fFloatValue);
            h0.e eVar = h0.f.f12083a;
            androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.a(e1.d.d(dVarC3, eVar), new q1(qg.p.j(new b1(n0.c(4294956800L)), new b1(n0.c(4294942720L))), null, 0L, 9187343241974906880L)), (float) 2.5d, n0.c(4294964144L), eVar);
            l0 l0VarD2 = z.g.d(fVar, false);
            int iD3 = jVar2.D();
            a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA, jVar2);
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
            v1.j(bVar, l0VarD2, jVar2);
            v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            v1.j(cVar, dVarC4, jVar2);
            ff.b("☕", null, 0L, f3.u.c(38), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3078, 0, 131062);
            jVar2.H();
            jVar2.H();
            String strA = pd.d.a(aVar, 18, jVar2, R.string.support_success_title, jVar2);
            s3 s3Var = of.f26647a;
            ff.b(strA, null, n0.c(4294956800L), 0L, x2.p.f32035h, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26543f, jVar2, 196992, 0, 64986);
            float f11 = 12;
            ff.b(pd.d.a(aVar, f11, jVar2, R.string.support_success_message, jVar2), null, n0.c(4293779668L), 0L, null, null, 0L, new e3.h(3), f3.u.c(22), 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 384, 6, 63994);
            float f12 = 16;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f12), jVar2);
            md.a(null, h0.f.a(f11), b1.c(0.15f, n0.c(4294956800L)), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, b1.c(0.3f, n0.c(4294956800L))), d.f14298a, jVar2, 14156160, 57);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 52);
            h0.e eVarA = h0.f.a(f12);
            g1 g1Var = m0.f26400a;
            x0.a(this.f14295a, dVarF, false, eVarA, m0.a(n0.c(4294956800L), b1.f21648b, 0L, jVar2, 12), null, null, null, d.f14299b, jVar2, 805306416, 484);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
