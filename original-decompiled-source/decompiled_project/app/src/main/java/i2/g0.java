package i2;

import java.util.Map;

/* loaded from: classes.dex */
public final class g0 extends a {
    @Override // i2.a
    public final long b(g1 g1Var, long j10) {
        u1 u1Var = g1Var.M;
        if (u1Var != null) {
            j10 = u1Var.d(j10, false);
        }
        return ph.m0.b(j10, g1Var.C);
    }

    @Override // i2.a
    public final Map<g2.a, Integer> c(g1 g1Var) {
        return g1Var.v0().r();
    }

    @Override // i2.a
    public final int d(g1 g1Var, g2.a aVar) {
        return g1Var.Q(aVar);
    }
}
