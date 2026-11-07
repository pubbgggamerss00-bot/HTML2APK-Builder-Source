package u;

import androidx.compose.ui.d;
import c2.s0;
import com.android.apksig.internal.apk.v4.V4Signature;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.m0;
import ph.v1;
import u.p;
import x0.a2;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class f {
    public static final void a(p pVar, eh.a aVar, androidx.compose.ui.d dVar, eh.l lVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(645832757);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.l(lVar) ? 2048 : 1024;
        }
        if (kVarP.A(i12 & 1, (i12 & 1171) != 1170)) {
            p.a aVar2 = (p.a) pVar.f28915a.getValue();
            if (!(aVar2 instanceof p.a.b)) {
                h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new a(pVar, aVar, lVar, i10);
                    return;
                }
                return;
            }
            boolean zK = kVarP.K(aVar2);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new l(m0.d(((p.a.b) aVar2).f28917a));
                kVarP.C(objG);
            }
            y.c((l) objG, aVar, lVar, kVarP, i12 & 8176);
            dVar = d.a.f1143b;
        } else {
            kVarP.v();
        }
        androidx.compose.ui.d dVar2 = dVar;
        h2 h2VarV2 = kVarP.V();
        if (h2VarV2 != null) {
            h2VarV2.f31703d = new b(pVar, aVar, dVar2, lVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(p pVar, eh.a aVar, eh.l lVar, androidx.compose.ui.d dVar, boolean z10, eh.a aVar2, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        eh.a aVar3;
        eh.l lVar2;
        boolean z11;
        int i13;
        eh.a aVar4;
        androidx.compose.ui.d dVar2;
        boolean z12;
        h2 h2VarV;
        androidx.compose.ui.d dVarA;
        x0.k kVarP = jVar.p(1969259374);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar3 = aVar;
            i12 |= kVarP.l(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i10 & 384) == 0) {
            lVar2 = lVar;
            i12 |= kVarP.l(lVar2) ? 256 : 128;
        } else {
            lVar2 = lVar;
        }
        int i14 = i12 | 3072;
        int i15 = i11 & 16;
        if (i15 != 0) {
            i14 = i12 | 27648;
        } else {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                i14 |= kVarP.c(z11) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    aVar4 = aVar2;
                    i14 |= kVarP.l(aVar4) ? 131072 : 65536;
                }
                if ((1572864 & i10) == 0) {
                    i14 |= kVarP.l(bVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (kVarP.A(i14 & 1, (599187 & i14) != 599186)) {
                    boolean z13 = i15 != 0 ? true : z11;
                    if (i13 != 0) {
                        aVar4 = c.f28871a;
                    }
                    dVar2 = d.a.f1143b;
                    if (z13) {
                        kVarP.L(1021907653);
                        boolean z14 = ((458752 & i14) == 131072) | ((i14 & 14) == 4);
                        Object objG = kVarP.g();
                        if (z14 || objG == j.a.f31715a) {
                            objG = new e(aVar4, pVar);
                            kVarP.C(objG);
                        }
                        dVarA = s0.a(dVar2, k.f28895a, new i((eh.l) objG));
                        kVarP.T(false);
                    } else {
                        kVarP.L(1022064513);
                        kVarP.T(false);
                        dVarA = dVar2;
                    }
                    l0 l0VarD = z.g.d(d.a.f14602a, true);
                    int i16 = kVarP.P;
                    a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar5 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.w(aVar5);
                    } else {
                        kVarP.z();
                    }
                    v1.j(g.a.f13867f, l0VarD, kVarP);
                    v1.j(g.a.f13866e, a2VarP, kVarP);
                    g.a.C0128a c0128a = g.a.f13868g;
                    if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                    }
                    v1.j(g.a.f13865d, dVarC, kVarP);
                    bVar.invoke(kVarP, Integer.valueOf((i14 >> 18) & 14));
                    a(pVar, aVar3, null, lVar2, kVarP, (i14 & 126) | ((i14 << 3) & V4Signature.MAX_SIGNING_INFOS_SIZE));
                    kVarP.T(true);
                    z12 = z13;
                } else {
                    kVarP.v();
                    dVar2 = dVar;
                    z12 = z11;
                }
                eh.a aVar6 = aVar4;
                h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new d(pVar, aVar, lVar, dVar2, z12, aVar6, bVar, i10, i11);
                    return;
                }
                return;
            }
            i14 |= 196608;
            aVar4 = aVar2;
            if ((1572864 & i10) == 0) {
            }
            if (kVarP.A(i14 & 1, (599187 & i14) != 599186)) {
            }
            eh.a aVar62 = aVar4;
            h2VarV = kVarP.V();
            if (h2VarV != null) {
            }
        }
        z11 = z10;
        i13 = i11 & 32;
        if (i13 != 0) {
        }
        aVar4 = aVar2;
        if ((1572864 & i10) == 0) {
        }
        if (kVarP.A(i14 & 1, (599187 & i14) != 599186)) {
        }
        eh.a aVar622 = aVar4;
        h2VarV = kVarP.V();
        if (h2VarV != null) {
        }
    }
}
