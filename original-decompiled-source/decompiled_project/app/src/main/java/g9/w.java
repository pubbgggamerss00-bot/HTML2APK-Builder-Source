package g9;

import androidx.compose.ui.d;
import c9.u1;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import t0.ff;
import t0.nf;
import t0.of;
import t0.t4;
import x0.a2;
import z.n1;

/* loaded from: classes.dex */
public final class w implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1.d f11825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11826b;

    public w(w1.d dVar, String str) {
        this.f11825a = dVar;
        this.f11826b = str;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 TextButton = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TextButton, "$this$TextButton");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(aVar, 20);
            w1.d dVar = this.f11825a;
            String str = this.f11826b;
            t4.b(dVar, str, dVarF, 0L, jVar2, 384, 8);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar2);
            ff.b(str, null, 0L, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26552o, jVar2, 0, 0, 65022);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
