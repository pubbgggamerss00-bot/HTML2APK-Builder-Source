package t8;

import androidx.compose.ui.d;
import x0.j;

/* loaded from: classes.dex */
public final class s2 implements eh.q<z.n1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.r3<g8.d> f28448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.x f28449b;

    public s2(p5.x xVar, x0.r3 r3Var) {
        this.f28448a = r3Var;
        this.f28449b = xVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
        z.n1 TopAppBar = n1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(TopAppBar, "$this$TopAppBar");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            mh.k kVar = v2.f28495e;
            g8.d value = this.f28448a.getValue();
            jVar2.L(1987471928);
            if (value != null) {
                long j10 = value.f11561a;
                jVar2.L(391054935);
                p5.x xVar = this.f28449b;
                boolean zL = jVar2.l(xVar);
                Object objG = jVar2.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new a9.m1(xVar, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                v2.f(j10, (eh.a) objG, jVar2, 0);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            jVar2.B();
            p1.d.b(androidx.compose.foundation.layout.g.r(d.a.f1143b, 8), jVar2);
        }
        return pg.f0.f21461a;
    }
}
