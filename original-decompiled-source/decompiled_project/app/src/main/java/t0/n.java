package t0;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f26479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.ui.d dVar, f1.b bVar) {
        super(2);
        this.f26478a = dVar;
        this.f26479b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            String strB = di.a.b(R.string.m3c_dialog, jVar2);
            androidx.compose.ui.d dVarQ = androidx.compose.foundation.layout.g.q(this.f26478a, p.f26649a, p.f26650b, 10);
            boolean zK = jVar2.K(strB);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new m(strB);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarH = dVarQ.h(q2.q.a(d.a.f1143b, false, (eh.l) objG));
            g2.l0 l0VarD = z.g.d(d.a.f14602a, true);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
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
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            this.f26479b.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
