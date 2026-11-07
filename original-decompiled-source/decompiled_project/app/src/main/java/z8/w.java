package z8;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import ph.i0;
import ph.v1;
import q1.b1;
import q1.u0;
import t0.m0;
import t0.x0;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;
import z.g1;
import z.k1;
import z.m1;

/* loaded from: classes.dex */
public final class w implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.b f34861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f34862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f34863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.x f34864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34865f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f34866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<b1> f34867h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f34868j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r3<b1> f34869k;

    public w(long j10, e0.b bVar, i0 i0Var, e0 e0Var, p5.x xVar, n1 n1Var, float f10, List list, Context context, r3 r3Var) {
        this.f34860a = j10;
        this.f34861b = bVar;
        this.f34862c = i0Var;
        this.f34863d = e0Var;
        this.f34864e = xVar;
        this.f34865f = n1Var;
        this.f34866g = f10;
        this.f34867h = list;
        this.f34868j = context;
        this.f34869k = r3Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        boolean z10;
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            jVar2.L(1195622247);
            final long j10 = this.f34860a;
            boolean zJ = jVar2.j(j10);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zJ || objG == c0321a) {
                objG = new eh.l() { // from class: z8.p
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        s1.e drawBehind = (s1.e) obj;
                        kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                        List listJ = qg.p.j(new b1(b1.c(0.22f, j10)), new b1(b1.f21653g));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.i() >> 32)) / 2.0f;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.i() & BodyPartID.bodyIdMax)) * 0.32f;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                        long jI = drawBehind.i();
                        s1.e.d0(drawBehind, u0.a.c(listJ, jFloatToRawIntBits, Math.max(Float.intBitsToFloat((int) ((jI >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jI & 2147483647L))) * 0.55f, 8), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            z.g.a(androidx.compose.ui.draw.a.a(fillElement, (eh.l) objG), jVar2, 0);
            androidx.compose.ui.d dVarG = d0.h.g(fillElement);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
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
            d.a aVar2 = d.a.f1143b;
            float f10 = 24;
            float f11 = 8;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), f10, f11, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8);
            m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar2);
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            v1.j(bVar, m1VarA, jVar2);
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            double d10 = 1.0f;
            if (d10 <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            jVar2.L(-599861136);
            final Context context = this.f34868j;
            boolean zL = jVar2.l(context);
            final e0.b bVar2 = this.f34861b;
            boolean zK = zL | jVar2.K(bVar2);
            Object objG2 = jVar2.g();
            if (zK || objG2 == c0321a) {
                objG2 = new eh.l() { // from class: z8.q
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        q2.d0 semantics = (q2.d0) obj;
                        kotlin.jvm.internal.r.e(semantics, "$this$semantics");
                        q2.a0.d(semantics, context.getString(R.string.onboarding_page_indicator, Integer.valueOf(bVar2.j() + 1), 4));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            androidx.compose.ui.d dVarA = q2.q.a(layoutWeightElement, false, (eh.l) objG2);
            float f12 = this.f34866g;
            List<b1> list = this.f34867h;
            j.g(f12, list, dVarA, jVar2, 0);
            jVar2.L(-599850149);
            final i0 i0Var = this.f34862c;
            boolean zL2 = jVar2.l(i0Var);
            final e0 e0Var = this.f34863d;
            boolean zL3 = zL2 | jVar2.l(e0Var);
            final p5.x xVar = this.f34864e;
            boolean zL4 = zL3 | jVar2.l(xVar);
            final n1<String> n1Var = this.f34865f;
            boolean zK2 = zL4 | jVar2.K(n1Var);
            Object objG3 = jVar2.g();
            if (zK2 || objG3 == c0321a) {
                objG3 = new eh.a() { // from class: z8.r
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        ph.h.c(i0Var, null, null, new x(e0Var, (String) n1Var.getValue(), xVar, null), 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            jVar2.B();
            x0.d((eh.a) objG3, null, false, null, null, null, a.f34783a, jVar2, 805306368, 510);
            jVar2.H();
            if (d10 <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            e0.b0.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 16380, new LayoutWeightElement(1.0f, true), null, bVar2, null, f1.c.b(1579032352, new t(n1Var, bVar2, list), jVar2), null, null, null, null, jVar2, null, false);
            boolean z11 = bVar2.j() == 3;
            jVar2.L(2030426769);
            boolean zC = jVar2.c(z11) | jVar2.l(i0Var) | jVar2.l(e0Var) | jVar2.l(xVar) | jVar2.K(n1Var) | jVar2.K(bVar2);
            Object objG4 = jVar2.g();
            if (zC || objG4 == c0321a) {
                final boolean z12 = z11;
                objG4 = new eh.a() { // from class: z8.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        boolean z13 = z12;
                        i0 i0Var2 = i0Var;
                        if (z13) {
                            ph.h.c(i0Var2, null, null, new x(e0Var, (String) n1Var.getValue(), xVar, null), 3);
                        } else {
                            ph.h.c(i0Var2, null, null, new u(bVar2, null), 3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                z10 = z12;
                jVar2.C(objG4);
            } else {
                z10 = z11;
            }
            jVar2.B();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.f.j(d0.h.f(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f)), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 20, 5), 56);
            h0.e eVarA = h0.f.a(16);
            g1 g1Var = m0.f26400a;
            x0.a((eh.a) objG4, dVarF, false, eVarA, m0.a(this.f34869k.getValue().f21656a, b1.f21650d, 0L, jVar2, 12), null, null, null, f1.c.b(-1182911279, new v(z10), jVar2), jVar2, 805306368, 484);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
