package q8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import t0.ff;
import t0.nf;
import t0.of;
import t0.s4;
import x0.j;
import x0.s3;
import z.b;

/* loaded from: classes.dex */
public final class t1 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f22390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22391c;

    public t1(eh.a<pg.f0> aVar, x0.l1 l1Var, eh.a<pg.f0> aVar2) {
        this.f22389a = aVar;
        this.f22390b = l1Var;
        this.f22391c = aVar2;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        final x0.l1 l1Var;
        z.r Card = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            float f10 = 20;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10, 16);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
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
            b.j jVar3 = z.b.f34444a;
            f.b bVar2 = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar3, bVar2, jVar2, 54);
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
            s4.c(this.f22389a, androidx.compose.foundation.layout.g.n(aVar, 36), false, null, a0.f22090a, jVar2, 196656, 28);
            jVar2.H();
            String strA = pd.d.a(aVar, 4, jVar2, R.string.rating_dialog_title, jVar2);
            s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26544g;
            x2.p pVar = x2.p.f32033f;
            s3 s3Var2 = t0.f2.f25858a;
            ff.b(strA, null, ((t0.e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 64986);
            ff.b(pd.d.a(aVar, 6, jVar2, R.string.rating_dialog_subtitle, jVar2), null, ((t0.e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26548k, jVar2, 0, 0, 65018);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, f10), jVar2);
            z.m1 m1VarA2 = z.k1.a(z.b.h(8), bVar2, jVar2, 54);
            int iD3 = jVar2.D();
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar, jVar2);
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
            ph.v1.j(bVar, m1VarA2, jVar2);
            ph.v1.j(dVar, a2VarY3, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                l9.i.a(iD3, jVar2, iD3, c0128a);
            }
            ph.v1.j(cVar, dVarC3, jVar2);
            jVar2.L(-822710448);
            final int i10 = 1;
            while (true) {
                l1Var = this.f22390b;
                if (i10 >= 6) {
                    break;
                }
                boolean z10 = i10 <= l1Var.g();
                jVar2.L(-822705878);
                boolean zI = jVar2.i(i10);
                Object objG = jVar2.g();
                if (zI || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: q8.q1
                        @Override // eh.a
                        public final Object invoke() {
                            l1Var.f(i10);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                s4.c((eh.a) objG, androidx.compose.foundation.layout.g.n(aVar, 44), false, null, f1.c.b(-1577140911, new r1(z10, i10), jVar2), jVar2, 196656, 28);
                i10++;
            }
            jVar2.B();
            jVar2.H();
            androidx.compose.animation.d.c(l1Var.g() > 0, null, r.w0.c(null, 3).b(r.w0.b(null, 15)), null, null, f1.c.b(1570685967, new s1(this.f22391c), jVar2), jVar2, 196992, 26);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 12), jVar2);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
