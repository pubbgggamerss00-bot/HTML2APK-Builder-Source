package t0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.s0;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class pd extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.v f26738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f26740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(androidx.compose.ui.d dVar, q1.f2 f2Var, long j10, float f10, t.v vVar, float f11, f1.b bVar) {
        super(2);
        this.f26734a = dVar;
        this.f26735b = f2Var;
        this.f26736c = j10;
        this.f26737d = f10;
        this.f26738e = vVar;
        this.f26739f = f11;
        this.f26740g = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarH = q2.q.a(md.c(this.f26734a, this.f26735b, md.d(this.f26736c, this.f26737d, jVar2), this.f26738e, ((f3.d) jVar2.f(j2.j2.f14779h)).N0(this.f26739f)), false, nd.f26536a).h(new SuspendPointerInputElement(pg.f0.f21461a, null, new s0.a(new od(2, null)), 6));
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
            this.f26740g.invoke(jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
