package u8;

import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import ph.v1;
import t0.ff;
import x0.a2;
import z.n1;

/* loaded from: classes.dex */
public final class v0 implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k8.i f29530a;

    public v0(k8.i iVar) {
        this.f29530a = iVar;
    }

    @Override // eh.q
    public final pg.f0 b(n1 n1Var, x0.j jVar, Integer num) {
        n1 Button = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Button, "$this$Button");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, jVar2);
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
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            String strC = f3.q.c(R.string.cat_farm_shop_boost_tap_title, jVar2);
            int i10 = this.f29530a.f16122c;
            long jC = i10 >= 10 ? q1.b1.f21650d : c2.n0.c(4286082403L);
            x2.p pVar = x2.p.f32033f;
            ff.b(strC, null, jC, f3.u.c(12), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 199680, 0, 131026);
            ff.b(f3.q.c(R.string.cat_farm_shop_boost_tap_sub, jVar2), null, i10 >= 10 ? q1.b1.c(0.8f, q1.b1.f21650d) : c2.n0.c(4286082403L), f3.u.c(10), null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 3072, 0, 131058);
            ff.b("10 🐟", null, i10 >= 10 ? q1.b1.f21650d : c2.n0.c(4286082403L), f3.u.c(11), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 199686, 0, 131026);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
