package a9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import p0.v5;
import p0.w5;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import z.b;

/* loaded from: classes.dex */
public final class b1 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f137b;

    public b1(x0.n1 n1Var, boolean z10) {
        this.f136a = z10;
        this.f137b = n1Var;
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
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 16, 14);
            b.g gVar = z.b.f34450g;
            f.b bVar = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(gVar, bVar, jVar2, 54);
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
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, m1VarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            z.m1 m1VarA2 = z.k1.a(z.b.h(12), bVar, jVar2, 54);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar, jVar2);
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
            ph.v1.j(bVar2, m1VarA2, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 38), h0.f.a(11));
            boolean z10 = this.f136a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, q1.b1.c(z10 ? 0.18f : 0.12f, z10 ? c2.n0.c(4294956800L) : c2.n0.c(4292441862L)), q1.y1.f21750a);
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
            ph.v1.j(bVar2, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            x0.n1<Boolean> n1Var = this.f137b;
            t4.b(v0.g(n1Var) ? w5.a() : v5.a(), null, androidx.compose.foundation.layout.g.n(aVar, 22), z10 ? c2.n0.c(4294956800L) : c2.n0.c(4290007817L), jVar2, 432, 0);
            jVar2.H();
            ff.b(n1Var.getValue().booleanValue() ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 80035229, R.string.premium_less_features_button, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 80165181, R.string.premium_more_features_button, jVar2), null, z10 ? c2.n0.c(4294956800L) : c2.n0.c(4290007817L), 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196608, 0, 65498);
            jVar2.H();
            t4.b(n1Var.getValue().booleanValue() ? w5.a() : v5.a(), null, androidx.compose.foundation.layout.g.n(aVar, 20), z10 ? c2.n0.c(4294956800L) : c2.n0.c(4290007817L), jVar2, 432, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
