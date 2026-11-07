package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class e1 implements eh.q<eh.p<? super x0.j, ? super Integer, ? extends pg.f0>, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f9475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.d f9476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9478d;

    public e1(t0.e2 e2Var, w1.d dVar, String str, String str2) {
        this.f9475a = e2Var;
        this.f9476b = dVar;
        this.f9477c = str;
        this.f9478d = str2;
    }

    @Override // eh.q
    public final pg.f0 b(eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar, x0.j jVar, Integer num) throws Throwable {
        eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar2;
        g.a.C0128a c0128a;
        g.a.c cVar;
        Throwable th2;
        eh.p<? super x0.j, ? super Integer, ? extends pg.f0> inner = pVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(inner, "inner");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.l(inner) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            h0.e eVarA = h0.f.a(12);
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = e1.d.d(aVar, eVarA);
            t0.e2 e2Var = this.f9475a;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.h(androidx.compose.foundation.a.b(dVarD, e2Var.H, q1.y1.f21750a), 40, CropImageView.DEFAULT_ASPECT_RATIO, 2), 10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
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
            g.a.C0128a c0128a2 = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a2);
            }
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, jVar2);
            jVar2.L(-2144287127);
            w1.d dVar2 = this.f9476b;
            if (dVar2 != null) {
                pVar2 = inner;
                cVar = cVar2;
                c0128a = c0128a2;
                th2 = null;
                t0.t4.b(dVar2, null, androidx.compose.foundation.layout.g.n(aVar, 18), e2Var.f25773s, jVar2, 432, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 8), jVar2);
            } else {
                pVar2 = inner;
                c0128a = c0128a2;
                cVar = cVar2;
                th2 = null;
            }
            jVar2.B();
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw th2;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            jVar2.L(2108305443);
            if (this.f9477c.length() == 0) {
                t0.ff.b(this.f9478d, null, e2Var.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((t0.nf) jVar2.f(t0.of.f26647a)).f26548k, jVar2, 0, 3072, 57338);
                jVar2 = jVar2;
            }
            jVar2.B();
            pVar2.invoke(jVar2, Integer.valueOf(i10 & 14));
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
