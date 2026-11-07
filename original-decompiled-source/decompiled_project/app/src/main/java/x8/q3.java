package x8;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class q3 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f33093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f33094b;

    public q3(j6 j6Var, p5.x xVar) {
        this.f33093a = j6Var;
        this.f33094b = xVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            t0.d1.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), h0.f.a(20), t0.z0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25770p, jVar2, 0), null, null, f1.c.b(1535319521, new p3(this.f33093a, this.f33094b), jVar2), jVar2, 196614, 24);
        }
        return pg.f0.f21461a;
    }
}
