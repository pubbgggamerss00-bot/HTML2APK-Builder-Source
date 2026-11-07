package u0;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import s.y1;
import x0.a2;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r3<Float> f28984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f28985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f28986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f28987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(y1.d dVar, long j10, t2.l0 l0Var, eh.p pVar) {
        super(2);
        this.f28984a = dVar;
        this.f28985b = j10;
        this.f28986c = l0Var;
        this.f28987d = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            r3<Float> r3Var = this.f28984a;
            boolean zK = jVar2.K(r3Var);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new d1(r3Var, 0);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(d.a.f1143b, (eh.l) objG);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, jVar2);
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
            t1.b(this.f28985b, this.f28986c, this.f28987d, jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
