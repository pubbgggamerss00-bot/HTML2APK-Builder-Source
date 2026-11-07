package a9;

import androidx.compose.ui.d;
import t0.e2;
import t0.f2;
import x0.j;

/* loaded from: classes.dex */
public final class c1 implements eh.q<r.h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f174b;

    public c1(x0.n1 n1Var, boolean z10) {
        this.f173a = z10;
        this.f174b = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(r.h0 h0Var, x0.j jVar, Integer num) {
        r.h0 AnimatedVisibility = h0Var;
        x0.j jVar2 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedVisibility, "$this$AnimatedVisibility");
        androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
        h0.e eVarA = h0.f.a(18);
        jVar2.L(1484486664);
        boolean z10 = this.f173a;
        long jC = z10 ? q1.b1.c(0.32f, ((e2) jVar2.f(f2.f25858a)).f25772r) : q1.b1.c(0.92f, q1.b1.f21650d);
        jVar2.B();
        t0.y0 y0VarA = t0.z0.a(jC, jVar2, 0);
        t.v vVarA = d2.a((float) 1.5d, z10 ? q1.b1.c(0.45f, c2.n0.c(4294956800L)) : q1.b1.c(0.45f, c2.n0.c(4292441862L)));
        t0.c1 c1VarB = t0.z0.b(!z10 ? 2 : 0, 62);
        jVar2.L(1484478547);
        x0.n1<Boolean> n1Var = this.f174b;
        boolean zK = jVar2.K(n1Var);
        Object objG = jVar2.g();
        if (zK || objG == j.a.f31715a) {
            objG = new a1(n1Var, 0);
            jVar2.C(objG);
        }
        jVar2.B();
        t0.d1.b((eh.a) objG, dVarD, false, eVarA, y0VarA, c1VarB, vVarA, null, f1.c.b(520284403, new b1(n1Var, z10), jVar2), jVar2, 100663344, 132);
        return pg.f0.f21461a;
    }
}
