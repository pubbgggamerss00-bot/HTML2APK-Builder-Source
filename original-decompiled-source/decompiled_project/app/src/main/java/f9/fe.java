package f9;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class fe implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9550b;

    public fe(boolean z10, String str) {
        this.f9549a = z10;
        this.f9550b = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        long j10;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 16, 14);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, jVar2, 54);
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
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            t2.l0 l0Var = ((t0.nf) jVar2.f(t0.of.f26647a)).f26547j;
            boolean z10 = this.f9549a;
            x2.p pVar = z10 ? x2.p.f32033f : x2.p.f32030c;
            if (z10) {
                jVar2.L(-1653676860);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a;
            } else {
                jVar2.L(-1653675610);
                j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
            }
            jVar2.B();
            t0.ff.b(this.f9550b, null, j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65498);
            jVar2.L(-1653673044);
            if (z10) {
                t0.t4.b(p0.n1.a(), null, androidx.compose.foundation.layout.g.n(aVar, 20), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25751a, jVar2, 432, 0);
            }
            jVar2.B();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
