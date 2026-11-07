package z;

import com.android.apksig.internal.apk.v4.V4Signature;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class m {
    public static final void a(androidx.compose.ui.d dVar, j1.d dVar2, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        x0.k kVarP = jVar.p(1781813501);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= kVarP.K(dVar2) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if ((i10 & 3072) == 0) {
            i14 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if (kVarP.A(i14 & 1, (i14 & 1171) != 1170)) {
            if (i13 != 0) {
                dVar2 = d.a.f14602a;
            }
            g2.l0 l0VarD = g.d(dVar2, false);
            boolean zK = kVarP.K(l0VarD) | ((i14 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new k(l0VarD, bVar);
                kVarP.C(objG);
            }
            g2.p1.a(dVar, (eh.p) objG, kVarP, i14 & 14, 0);
        } else {
            kVarP.v();
        }
        j1.d dVar3 = dVar2;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l(dVar, dVar3, bVar, i10, i11);
        }
    }
}
