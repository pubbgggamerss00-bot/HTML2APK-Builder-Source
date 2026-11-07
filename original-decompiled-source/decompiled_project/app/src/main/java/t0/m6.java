package t0;

import i2.e0;
import i2.g;
import j1.d;

/* loaded from: classes.dex */
public final class m6 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hb f26427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f26428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f26429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f26430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f26431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f26432h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q1.f2 f26433j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f26434k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f26435l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f26436m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26437n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, z.u1> f26438p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f1.b f26439q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(long j10, eh.a aVar, hb hbVar, s.b bVar, ph.i0 i0Var, eh.l lVar, androidx.compose.ui.d dVar, float f10, q1.f2 f2Var, long j11, long j12, float f11, eh.p pVar, eh.p pVar2, f1.b bVar2) {
        super(2);
        this.f26425a = j10;
        this.f26426b = aVar;
        this.f26427c = hbVar;
        this.f26428d = bVar;
        this.f26429e = i0Var;
        this.f26430f = lVar;
        this.f26431g = dVar;
        this.f26432h = f10;
        this.f26433j = f2Var;
        this.f26434k = j11;
        this.f26435l = j12;
        this.f26436m = f11;
        this.f26437n = pVar;
        this.f26438p = pVar2;
        this.f26439q = bVar2;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarA = q2.q.a(d0.h.e(androidx.compose.foundation.layout.g.f976c), false, l6.f26362a);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
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
            hb hbVar = this.f26427c;
            boolean z10 = ((ib) hbVar.f26015b.f28948h.getValue()) != ib.f26108a;
            long j10 = this.f26425a;
            eh.a<pg.f0> aVar2 = this.f26426b;
            p7.c(j10, aVar2, z10, jVar2, 0);
            p7.b(this.f26428d, this.f26429e, aVar2, this.f26430f, this.f26431g, hbVar, this.f26432h, this.f26433j, this.f26434k, this.f26435l, this.f26436m, this.f26437n, this.f26438p, this.f26439q, jVar2, 70);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
