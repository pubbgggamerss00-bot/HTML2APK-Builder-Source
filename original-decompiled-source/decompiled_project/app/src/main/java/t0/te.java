package t0;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class te extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f27087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.q<xd, x0.j, Integer, pg.f0> f27089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(f1.b bVar, eh.p pVar, eh.q qVar) {
        super(2);
        this.f27087a = bVar;
        this.f27088b = pVar;
        this.f27089c = qVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new se();
                jVar2.C(objG);
            }
            se seVar = (se) objG;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            List listJ = qg.p.j(this.f27087a, this.f27088b, f1.c.b(1236693605, new qe(this.f27089c, seVar), jVar2));
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                objG2 = new re(seVar);
                jVar2.C(objG2);
            }
            g2.u0 u0Var = (g2.u0) objG2;
            f1.b bVar = new f1.b(-1953651383, true, new g2.a0(listJ));
            Object objG3 = jVar2.g();
            if (objG3 == c0321a) {
                objG3 = new g2.v0(u0Var);
                jVar2.C(objG3);
            }
            g2.l0 l0Var = (g2.l0) objG3;
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, jVar2);
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
            ph.v1.j(g.a.f13867f, l0Var, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            bVar.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
