package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class ie implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9825d;

    public ie(eh.a aVar, eh.l lVar, boolean z10, boolean z11) {
        this.f9822a = z10;
        this.f9823b = aVar;
        this.f9824c = lVar;
        this.f9825d = z11;
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
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(705533940);
            final boolean z10 = this.f9822a;
            boolean zC = jVar2.c(z10);
            final eh.a<pg.f0> aVar2 = this.f9823b;
            boolean zK = zC | jVar2.K(aVar2);
            final eh.l<Boolean, pg.f0> lVar = this.f9824c;
            boolean zK2 = zK | jVar2.K(lVar);
            final boolean z11 = this.f9825d;
            boolean zC2 = zK2 | jVar2.c(z11);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zC2 || objG == obj) {
                objG = new eh.a() { // from class: f9.ge
                    @Override // eh.a
                    public final Object invoke() {
                        if (z10) {
                            lVar.invoke(Boolean.valueOf(!z11));
                        } else {
                            aVar2.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) objG, 7), 16, 14);
            z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14612k, jVar2, 54);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar3);
            } else {
                jVar2.z();
            }
            ph.v1.j(bVar, qVarA, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            String strC = f3.q.c(R.string.editor_splash_enable_label, jVar2);
            x0.e2 e2Var = t0.of.f26647a;
            t2.l0 l0Var = ((t0.nf) jVar2.f(e2Var)).f26547j;
            x2.p pVar = x2.p.f32032e;
            x0.e2 e2Var2 = t0.f2.f25858a;
            t0.ff.b(strC, null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
            t0.ff.b(pd.d.a(aVar, 2, jVar2, R.string.editor_splash_enable_desc, jVar2), null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((t0.nf) jVar2.f(e2Var)).f26549l, jVar2, 0, 0, 65530);
            jVar2.H();
            boolean z12 = z11 && z10;
            jVar2.L(-1689933961);
            boolean zC3 = jVar2.c(z10) | jVar2.K(aVar2) | jVar2.K(lVar);
            Object objG2 = jVar2.g();
            if (zC3 || objG2 == obj) {
                objG2 = new eh.l() { // from class: f9.he
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        if (z10) {
                            lVar.invoke(bool);
                        } else {
                            aVar2.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            androidx.compose.material3.a.a(z12, (eh.l) objG2, null, false, t0.td.a(q1.b1.f21650d, c2.n0.c(4294944550L), jVar2), jVar2, 0, 92);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
