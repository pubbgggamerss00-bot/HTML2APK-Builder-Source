package t0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f25737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.b f25738h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(eh.p pVar, eh.p pVar2, eh.p pVar3, long j10, long j11, long j12, long j13, f1.b bVar) {
        super(2);
        this.f25731a = pVar;
        this.f25732b = pVar2;
        this.f25733c = pVar3;
        this.f25734d = j10;
        this.f25735e = j11;
        this.f25736f = j12;
        this.f25737g = j13;
        this.f25738h = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(d.a.f1143b, p.f26653e);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
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
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, jVar2);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            jVar2.L(-1924971291);
            eh.p<x0.j, Integer, pg.f0> pVar = this.f25731a;
            if (pVar != null) {
                x0.y.a(com.android.aapt.a.b(this.f25734d, p2.f26666a), f1.c.b(934657765, new b(pVar), jVar2), jVar2, 56);
            }
            jVar2.B();
            jVar2.L(-1924961479);
            eh.p<x0.j, Integer, pg.f0> pVar2 = this.f25732b;
            if (pVar2 != null) {
                u0.v0.a(this.f25735e, of.a(v0.e.f30266c, jVar2), f1.c.b(434448772, new c(pVar, pVar2), jVar2), jVar2, 384);
            }
            jVar2.B();
            jVar2.L(-1924936431);
            eh.p<x0.j, Integer, pg.f0> pVar3 = this.f25733c;
            if (pVar3 != null) {
                u0.v0.a(this.f25736f, of.a(v0.e.f30268e, jVar2), f1.c.b(-796843771, new d(pVar3), jVar2), jVar2, 384);
            }
            jVar2.B();
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(d.a.f14616o);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD2 = jVar2.D();
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(horizontalAlignElement, jVar2);
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
            ph.v1.j(bVar, l0VarD, jVar2);
            ph.v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            ph.v1.j(cVar, dVarC2, jVar2);
            v0.c0 c0Var = v0.e.f30264a;
            u0.v0.a(this.f25737g, of.a(v0.o0.f30413d, jVar2), this.f25738h, jVar2, 0);
            jVar2.H();
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
