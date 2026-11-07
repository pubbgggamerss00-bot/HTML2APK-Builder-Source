package f9;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Set;

/* loaded from: classes.dex */
public final class cb implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set<String> f9244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9245b;

    public cb(Set<String> set, eh.a<pg.f0> aVar) {
        this.f9244a = set;
        this.f9245b = aVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 6;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.f.k(d.a.f1143b, 14, f10, f10, f10);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarK, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
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
            Set<String> set = this.f9244a;
            String strA = f3.q.a(R.plurals.editor_permissions_detected_missing, set.size(), new Object[]{Integer.valueOf(set.size())}, jVar2);
            t2.l0 l0Var = ((t0.nf) jVar2.f(t0.of.f26647a)).f26549l;
            long j10 = ((t0.e2) jVar2.f(t0.f2.f25858a)).f25771q;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            t0.ff.b(strA, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 0, 0, 65528);
            t0.x0.d(this.f9245b, null, false, null, null, null, e.J, jVar2, 805306368, 510);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
