package u0;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import t0.v9;
import t0.w9;
import x0.a2;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.h> f29181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z.f1 f29182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f29183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(x0.n1<p1.h> n1Var, z.f1 f1Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        super(2);
        this.f29181a = n1Var;
        this.f29182b = f1Var;
        this.f29183c = pVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(d.a.f1143b, "Container");
            x0 x0Var = new x0(this.f29181a, x0.n1.class, "value", "getValue()Ljava/lang/Object;", 0);
            float f10 = w9.f27292a;
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(dVarB, new v9(x0Var, this.f29182b));
            g2.l0 l0VarD = z.g.d(d.a.f14602a, true);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarC, jVar2);
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
            ph.v1.j(g.a.f13865d, dVarC2, jVar2);
            this.f29183c.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
