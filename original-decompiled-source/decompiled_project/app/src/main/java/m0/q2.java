package m0;

import i2.e0;
import i2.g;

/* loaded from: classes.dex */
public final class q2 {
    public static final void a(androidx.compose.ui.d dVar, f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-2105228848);
        int i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, o2.f17440a, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            bVar.invoke(kVarP, 6);
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p2(dVar, bVar, i10);
        }
    }
}
