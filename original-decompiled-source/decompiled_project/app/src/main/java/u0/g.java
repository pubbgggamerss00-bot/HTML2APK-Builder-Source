package u0;

import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class g {
    public static final void a(androidx.lifecycle.t tVar, eh.l lVar, eh.a aVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-1868327245);
        int i11 = (kVarP.l(tVar) ? 4 : 2) | i10 | (kVarP.l(lVar) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zL = ((i11 & 112) == 32) | kVarP.l(tVar) | ((i11 & 896) == 256);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new c(tVar, lVar, aVar);
                kVarP.C(objG);
            }
            x0.o0.a(tVar, (eh.l) objG, kVarP);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d(tVar, lVar, aVar, i10);
        }
    }
}
