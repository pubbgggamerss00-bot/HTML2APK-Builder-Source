package x8;

import android.content.Context;
import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class e6 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f32567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f32568b;

    public e6(Context context, eh.a aVar) {
        this.f32567a = context;
        this.f32568b = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        h0.e eVarA = h0.f.a(22);
        t0.y0 y0VarA = t0.z0.a(((t0.e2) jVar2.f(t0.f2.f25858a)).f25770p, jVar2, 0);
        t.v vVarA = a9.d2.a((float) 1.5d, q1.b1.c(0.6f, c2.n0.c(4292030255L)));
        t0.c1 c1VarB = t0.z0.b(12, 62);
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
        jVar2.L(1196249611);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = new x.n();
            jVar2.C(objG);
        }
        x.m mVar = (x.m) objG;
        jVar2.B();
        jVar2.L(1196253606);
        Object objG2 = jVar2.g();
        if (objG2 == c0321a) {
            objG2 = new c6();
            jVar2.C(objG2);
        }
        jVar2.B();
        t0.d1.a(androidx.compose.foundation.b.b(dVarD, mVar, null, false, null, (eh.a) objG2, 28), eVarA, y0VarA, c1VarB, vVarA, f1.c.b(-1130730577, new d6(this.f32567a, this.f32568b), jVar2), jVar2, 221184, 0);
        return pg.f0.f21461a;
    }
}
