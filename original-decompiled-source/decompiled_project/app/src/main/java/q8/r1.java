package q8;

import androidx.compose.ui.d;
import p0.va;
import t0.t4;
import w1.d;

/* loaded from: classes.dex */
public final class r1 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22376b;

    public r1(boolean z10, int i10) {
        this.f22375a = z10;
        this.f22376b = i10;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        w1.d dVarB;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = this.f22375a;
            if (z10) {
                dVarB = va.a();
            } else {
                dVarB = q0.d.f21644a;
                if (dVarB == null) {
                    d.a aVar = new d.a("Outlined.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = p0.m.a(12.0f, 17.27f, 18.18f, 21.0f);
                    eVarA.g(-1.64f, -7.03f);
                    eVarA.f(22.0f, 9.24f);
                    eVarA.g(-7.19f, -0.61f);
                    eVarA.f(12.0f, 2.0f);
                    eVarA.f(9.19f, 8.63f);
                    eVarA.f(2.0f, 9.24f);
                    eVarA.g(5.46f, 4.73f);
                    p0.f0.a(eVarA, 5.82f, 21.0f, 12.0f, 17.27f);
                    d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar.b();
                    q0.d.f21644a = dVarB;
                }
            }
            String strValueOf = String.valueOf(this.f22376b);
            jVar2.L(1076938387);
            long jC = z10 ? c2.n0.c(4294948864L) : q1.b1.c(0.38f, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s);
            jVar2.B();
            t4.b(dVarB, strValueOf, androidx.compose.foundation.layout.g.n(d.a.f1143b, 36), jC, jVar2, 384, 0);
        }
        return pg.f0.f21461a;
    }
}
