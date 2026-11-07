package x8;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class a8 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f32248c;

    public a8(long j10, String str, boolean z10) {
        this.f32246a = z10;
        this.f32247b = j10;
        this.f32248c = str;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            float f10 = 4;
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, 8, f10);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            w1.d dVarA = this.f32246a ? p0.p.a() : p0.r5.a();
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 13);
            long j10 = this.f32247b;
            t0.t4.b(dVarA, null, dVarN, j10, jVar2, 432, 0);
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
            ff.b(this.f32248c, null, j10, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26552o, jVar2, 196608, 0, 65498);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
