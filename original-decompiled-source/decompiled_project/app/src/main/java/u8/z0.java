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
public final class z0 implements eh.q<n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29634a;

    public z0(boolean z10) {
        this.f29634a = z10;
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
            String strC = f3.q.c(R.string.cat_farm_shop_vip_unlock, jVar2);
            boolean z10 = this.f29634a;
            long jC = z10 ? q1.b1.f21648b : c2.n0.c(4286082403L);
            long jC2 = f3.u.c(11);
            x2.p pVar = x2.p.f32033f;
            ff.b(strC, null, jC, jC2, pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 199680, 0, 131026);
            ff.b("50 🐟", null, z10 ? q1.b1.f21648b : c2.n0.c(4286082403L), f3.u.c(10), pVar, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 199686, 0, 131026);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
