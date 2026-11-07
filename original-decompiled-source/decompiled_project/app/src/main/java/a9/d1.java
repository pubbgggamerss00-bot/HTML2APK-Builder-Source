package a9;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<y> f185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f186b;

    public d1(List<y> list, boolean z10) {
        this.f185a = list;
        this.f186b = z10;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
        z.q qVarA = z.o.a(z.b.h(10), d.a.f14614m, jVar2, 6);
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
        ph.v1.j(g.a.f13867f, qVarA, jVar2);
        ph.v1.j(g.a.f13866e, a2VarY, jVar2);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar2, iD, c0128a);
        }
        ph.v1.j(g.a.f13865d, dVarC, jVar2);
        jVar2.L(594823365);
        for (y yVar : this.f185a) {
            v0.d(yVar.f366a, f3.q.c(yVar.f367b, jVar2), v0.j(yVar, jVar2), this.f186b ? yVar.f370e : yVar.f371f, null, false, jVar2, 0, 48);
        }
        jVar2.B();
        jVar2.H();
        return pg.f0.f21461a;
    }
}
