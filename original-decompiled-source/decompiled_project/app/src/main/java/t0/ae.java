package t0;

import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class ae extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f25493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.u0 f25495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f25497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b f25498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(androidx.compose.ui.d dVar, boolean z10, t.u0 u0Var, boolean z11, eh.a aVar, f1.b bVar) {
        super(2);
        this.f25493a = dVar;
        this.f25494b = z10;
        this.f25495c = u0Var;
        this.f25496d = z11;
        this.f25497e = aVar;
        this.f25498f = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.selection.a.a(this.f25493a, this.f25494b, null, this.f25495c, this.f25496d, new q2.i(4), this.f25497e), 1.0f);
            z.q qVarA = z.o.a(z.b.f34448e, d.a.f14615n, jVar2, 54);
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
            this.f25498f.b(z.s.f34624a, jVar2, 6);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
