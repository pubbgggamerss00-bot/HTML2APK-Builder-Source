package z8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import q1.b1;
import x0.a2;

/* loaded from: classes.dex */
public final class c0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34789a;

    public c0(long j10) {
        this.f34789a = j10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 12);
            float f10 = 6;
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 0.7f), 10);
            long j10 = this.f34789a;
            float f11 = 3;
            z.g.a(androidx.compose.foundation.a.b(dVarF, b1.c(0.9f, j10), h0.f.a(f11)), jVar2, 0);
            jVar2.L(1283143891);
            int i10 = 0;
            while (true) {
                float f12 = 1.0f;
                if (i10 >= 5) {
                    break;
                }
                if (i10 % 2 != 0) {
                    f12 = 0.8f;
                }
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, f12), 5), n0.c(4292533472L), h0.f.a(f11)), jVar2, 0);
                i10++;
            }
            jVar2.B();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            z.g.a(androidx.compose.foundation.a.b(dVarD.h(new LayoutWeightElement(1.0f, true)), b1.c(0.12f, j10), h0.f.a(f10)), jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
