package b0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import d0.j2;
import d0.m1;
import j1.d;
import j2.j2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.k1;
import t.i1;
import x0.h2;
import x0.j;
import x0.n1;
import x0.r3;
import x0.s2;
import x0.v1;
import x0.w2;
import z.b;
import z.f1;

/* loaded from: classes.dex */
public final class y {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, m0 m0Var, f1 f1Var, boolean z10, v.z zVar, boolean z11, i1 i1Var, d.b bVar, b.l lVar, d.c cVar, b.e eVar, eh.l lVar2, x0.j jVar, int i10, int i11, int i12) {
        int i13;
        int i14;
        b.l lVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        x0.k kVar;
        d.b bVar2;
        b.e eVar2;
        b.l lVar4;
        d.c cVar2;
        h2 h2VarV;
        m1 m1Var;
        x0.k kVar2;
        int i20;
        kh.g gVar;
        b.l lVar5;
        b.e eVar3;
        d.b bVar3;
        d.c cVar3;
        androidx.compose.ui.d dVarA;
        m0 m0Var2 = m0Var;
        x0.k kVarP = jVar.p(924924659);
        if ((i10 & 6) == 0) {
            i13 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= kVarP.K(m0Var2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= kVarP.K(f1Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= kVarP.c(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= kVarP.c(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= kVarP.K(zVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= kVarP.c(z11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= kVarP.K(i1Var) ? 8388608 : 4194304;
        }
        int i21 = i13 | 100663296;
        int i22 = i12 & 512;
        if (i22 != 0) {
            i21 = i13 | 905969664;
        } else {
            if ((i10 & 805306368) == 0) {
                i21 |= kVarP.K(bVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            i14 = i12 & 1024;
            if (i14 == 0) {
                lVar3 = lVar;
                i15 = i11 | 6;
            } else {
                lVar3 = lVar;
                if ((i11 & 6) == 0) {
                    i15 = i11 | (kVarP.K(lVar3) ? 4 : 2);
                } else {
                    i15 = i11;
                }
            }
            i16 = i12 & 2048;
            if (i16 == 0) {
                i15 |= 48;
                i17 = i16;
            } else if ((i11 & 48) == 0) {
                i17 = i16;
                i15 |= kVarP.K(cVar) ? 32 : 16;
            } else {
                i17 = i16;
            }
            i18 = i15;
            i19 = i12 & 4096;
            if (i19 != 0) {
                if ((i11 & 384) == 0) {
                    i18 |= kVarP.K(eVar) ? 256 : 128;
                }
                if ((i11 & 3072) == 0) {
                    i18 |= kVarP.l(lVar2) ? 2048 : 1024;
                }
                if (kVarP.A(i21 & 1, ((i21 & 306783379) == 306783378 && (i18 & 1171) == 1170) ? false : true)) {
                    d.b bVar4 = i22 != 0 ? null : bVar;
                    if (i14 != 0) {
                        lVar3 = null;
                    }
                    d.c cVar4 = i17 != 0 ? null : cVar;
                    int i23 = i18;
                    b.e eVar4 = i19 != 0 ? null : eVar;
                    int i24 = (i21 >> 3) & 14;
                    int i25 = i24 | ((i23 >> 6) & 112);
                    n1 n1VarK = bg.b.k(lVar2, kVarP);
                    boolean z12 = (((i25 & 14) ^ 6) > 4 && kVarP.K(m0Var2)) || (i25 & 6) == 4;
                    Object objG = kVarP.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (z12 || objG == c0321a) {
                        f fVar = new f();
                        fVar.f3317a = new v1(Integer.MAX_VALUE);
                        fVar.f3318b = new v1(Integer.MAX_VALUE);
                        s sVar = new s(n1VarK, 0);
                        s2 s2Var = s2.f31913a;
                        objG = new r(bg.b.e(new t(bg.b.e(sVar, s2Var), m0Var2, fVar), s2Var), r3.class, "value", "getValue()Ljava/lang/Object;", 0);
                        kVarP.C(objG);
                    }
                    kh.g gVar2 = (kh.g) objG;
                    int i26 = i21 >> 9;
                    int i27 = i24 | (i26 & 112);
                    boolean z13 = ((((i27 & 112) ^ 48) > 32 && kVarP.c(z10)) || (i27 & 48) == 32) | ((((i27 & 14) ^ 6) > 4 && kVarP.K(m0Var2)) || (i27 & 6) == 4);
                    Object objG2 = kVarP.g();
                    if (z13 || objG2 == c0321a) {
                        objG2 = new g(m0Var2, z10);
                        kVarP.C(objG2);
                    }
                    m1 m1Var2 = (m1) objG2;
                    Object objG3 = kVarP.g();
                    if (objG3 == c0321a) {
                        x0.l0 l0Var = x0.o0.f31834a;
                        w2 w2Var = new w2(kVarP.x());
                        kVarP.C(w2Var);
                        objG3 = w2Var;
                    }
                    ph.i0 i0Var = (ph.i0) objG3;
                    k1 k1Var = (k1) kVarP.f(j2.f14778g);
                    j2.a.C0077a c0077a = !((Boolean) kVarP.f(j2.j2.f14793v)).booleanValue() ? j2.a.f7168a : null;
                    int i28 = i23 << 18;
                    int i29 = (i21 & 65520) | (i26 & 458752) | (i26 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | ((i23 << 27) & 1879048192);
                    boolean z14 = ((((i29 & 896) ^ 384) > 256 && kVarP.K(f1Var)) || (i29 & 384) == 256) | ((((i29 & 112) ^ 48) > 32 && kVarP.K(m0Var2)) || (i29 & 48) == 32);
                    if (((i29 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) <= 2048 || !kVarP.c(false)) {
                        boolean z15 = (i29 & 3072) == 2048;
                        boolean zK = z14 | z15 | ((((57344 & i29) ^ 24576) > 16384 && kVarP.c(z10)) || (i29 & 24576) == 16384) | ((((i29 & 3670016) ^ 1572864) > 1048576 && kVarP.K(bVar4)) || (i29 & 1572864) == 1048576) | ((((i29 & 29360128) ^ 12582912) > 8388608 && kVarP.K(cVar4)) || (i29 & 12582912) == 8388608) | ((((i29 & 234881024) ^ 100663296) > 67108864 && kVarP.K(eVar4)) || (i29 & 100663296) == 67108864) | ((((i29 & 1879048192) ^ 805306368) > 536870912 && kVarP.K(lVar3)) || (i29 & 805306368) == 536870912) | kVarP.K(k1Var) | kVarP.K(c0077a);
                        Object objG4 = kVarP.g();
                        if (zK || objG4 == c0321a) {
                            b.l lVar6 = lVar3;
                            m1Var = m1Var2;
                            kVar2 = kVarP;
                            i20 = 4;
                            m0Var2 = m0Var;
                            x xVar = new x(m0Var2, z10, f1Var, gVar2, lVar6, eVar4, i0Var, k1Var, c0077a, bVar4, cVar4);
                            gVar = gVar2;
                            lVar5 = lVar6;
                            eVar3 = eVar4;
                            bVar3 = bVar4;
                            cVar3 = cVar4;
                            kVar2.C(xVar);
                            objG4 = xVar;
                        } else {
                            m0Var2 = m0Var;
                            m1Var = m1Var2;
                            gVar = gVar2;
                            kVar2 = kVarP;
                            eVar3 = eVar4;
                            lVar5 = lVar3;
                            bVar3 = bVar4;
                            cVar3 = cVar4;
                            i20 = 4;
                        }
                        eh.p pVar = (eh.p) objG4;
                        v.t0 t0Var = z10 ? v.t0.f30083a : v.t0.f30084b;
                        if (z11) {
                            kVar2.L(-1513147781);
                            int i30 = i24 | ((i21 >> 21) & 112);
                            boolean z16 = ((((i30 & 14) ^ 6) > i20 && kVar2.K(m0Var2)) || (i30 & 6) == i20) | (((i30 & 112) ^ 48) > 32 && kVar2.i(0));
                            Object objG5 = kVar2.g();
                            if (z16 || objG5 == c0321a) {
                                objG5 = new h(m0Var2);
                                kVar2.C(objG5);
                            }
                            dVarA = androidx.compose.foundation.lazy.layout.a.a((h) objG5, m0Var2.f3395n, t0Var);
                            kVar2.T(false);
                        } else {
                            kVar2.L(-1512720880);
                            kVar2.T(false);
                            dVarA = d.a.f1143b;
                        }
                        kVar = kVar2;
                        d0.p0.a(gVar, androidx.compose.foundation.f.a(androidx.compose.foundation.lazy.layout.c.a(dVar.h(m0Var2.f3392k).h(m0Var2.f3393l), gVar, m1Var, t0Var, z11).h(dVarA).h(m0Var2.f3394m.f999k), m0Var2, t0Var, z11, zVar, m0Var2.f3387f, false, i1Var, null), m0Var2.f3396o, pVar, kVar, 0);
                        bVar2 = bVar3;
                        lVar4 = lVar5;
                        cVar2 = cVar3;
                        eVar2 = eVar3;
                    }
                } else {
                    kVar = kVarP;
                    kVar.v();
                    bVar2 = bVar;
                    eVar2 = eVar;
                    lVar4 = lVar3;
                    cVar2 = cVar;
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new u(dVar, m0Var2, f1Var, z10, zVar, z11, i1Var, bVar2, lVar4, cVar2, eVar2, lVar2, i10, i11, i12);
                    return;
                }
                return;
            }
            i18 |= 384;
            if ((i11 & 3072) == 0) {
            }
            if (kVarP.A(i21 & 1, ((i21 & 306783379) == 306783378 && (i18 & 1171) == 1170) ? false : true)) {
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        i14 = i12 & 1024;
        if (i14 == 0) {
        }
        i16 = i12 & 2048;
        if (i16 == 0) {
        }
        i18 = i15;
        i19 = i12 & 4096;
        if (i19 != 0) {
        }
        if ((i11 & 3072) == 0) {
        }
        if (kVarP.A(i21 & 1, ((i21 & 306783379) == 306783378 && (i18 & 1171) == 1170) ? false : true)) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }
}
