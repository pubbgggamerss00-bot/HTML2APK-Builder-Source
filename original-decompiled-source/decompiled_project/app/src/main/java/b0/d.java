package b0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r.n2;
import t.i1;
import t.k1;
import x0.h2;
import x0.j;
import z.b;
import z.f1;
import z.g1;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, m0 m0Var, f1 f1Var, b.l lVar, d.b bVar, v.z zVar, boolean z10, i1 i1Var, eh.l lVar2, x0.j jVar, int i10, int i11) {
        int i12;
        m0 m0VarA;
        int i13;
        f1 g1Var;
        b.l lVar3;
        int i14;
        d.b bVar2;
        int i15;
        x0.k kVar;
        v.z zVar2;
        i1 i1Var2;
        f1 f1Var2;
        b.l lVar4;
        d.b bVar3;
        boolean z11;
        h2 h2VarV;
        int i16;
        v.z zVar3;
        i1 i1VarA;
        boolean z12;
        x0.k kVarP = jVar.p(53695811);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            m0VarA = m0Var;
            int i17 = kVarP.K(m0VarA) ? 32 : 16;
            int i18 = i12 | i17;
            i13 = i11 & 4;
            if (i13 == 0) {
                i18 |= 384;
            } else {
                if ((i10 & 384) == 0) {
                    g1Var = f1Var;
                    i18 |= kVarP.K(g1Var) ? 256 : 128;
                }
                int i19 = i18 | 3072;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        lVar3 = lVar;
                        int i20 = kVarP.K(lVar3) ? 16384 : 8192;
                        i19 |= i20;
                    } else {
                        lVar3 = lVar;
                    }
                    i19 |= i20;
                } else {
                    lVar3 = lVar;
                }
                i14 = i11 & 32;
                if (i14 == 0) {
                    if ((196608 & i10) == 0) {
                        bVar2 = bVar;
                        i19 |= kVarP.K(bVar2) ? 131072 : 65536;
                    }
                    i15 = i19 | 46661632 | (!kVarP.l(lVar2) ? PKIFailureInfo.duplicateCertReq : 268435456);
                    if (kVarP.A(i15 & 1, (306783379 & i15) == 306783378)) {
                        kVar = kVarP;
                        kVar.v();
                        zVar2 = zVar;
                        i1Var2 = i1Var;
                        f1Var2 = g1Var;
                        lVar4 = lVar3;
                        bVar3 = bVar2;
                        z11 = z10;
                    } else {
                        kVarP.r0();
                        if ((i10 & 1) == 0 || kVarP.a0()) {
                            if ((i11 & 2) != 0) {
                                m0VarA = u0.a(kVarP);
                                i15 &= -113;
                            }
                            if (i13 != 0) {
                                float f10 = 0;
                                g1Var = new g1(f10, f10, f10, f10);
                            }
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                                lVar3 = z.b.f34446c;
                            }
                            if (i14 != 0) {
                                bVar2 = d.a.f14614m;
                            }
                            s.y yVarA = n2.a(kVarP);
                            boolean zK = kVarP.K(yVarA);
                            Object objG = kVarP.g();
                            if (zK || objG == j.a.f31715a) {
                                objG = new v.h(yVarA);
                                kVarP.C(objG);
                            }
                            i16 = i15 & (-238551041);
                            zVar3 = (v.h) objG;
                            i1VarA = k1.a(kVarP);
                            z12 = true;
                        } else {
                            kVarP.v();
                            if ((i11 & 2) != 0) {
                                i15 &= -113;
                            }
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                            }
                            i16 = i15 & (-238551041);
                            zVar3 = zVar;
                            z12 = z10;
                            i1VarA = i1Var;
                        }
                        m0 m0Var2 = m0VarA;
                        f1 f1Var3 = g1Var;
                        b.l lVar5 = lVar3;
                        d.b bVar4 = bVar2;
                        kVarP.U();
                        kVar = kVarP;
                        y.a(dVar, m0Var2, f1Var3, true, zVar3, z12, i1VarA, bVar4, lVar5, null, null, lVar2, kVar, (i16 & 14) | 24576 | (i16 & 112) | (i16 & 896) | 1575936 | ((i16 << 12) & 1879048192), ((i16 >> 12) & 14) | ((i16 >> 18) & V4Signature.MAX_SIGNING_INFOS_SIZE), 6400);
                        m0VarA = m0Var2;
                        f1Var2 = f1Var3;
                        zVar2 = zVar3;
                        z11 = z12;
                        i1Var2 = i1VarA;
                        bVar3 = bVar4;
                        lVar4 = lVar5;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new b(dVar, m0VarA, f1Var2, lVar4, bVar3, zVar2, z11, i1Var2, lVar2, i10, i11);
                        return;
                    }
                    return;
                }
                i19 |= 196608;
                bVar2 = bVar;
                i15 = i19 | 46661632 | (!kVarP.l(lVar2) ? PKIFailureInfo.duplicateCertReq : 268435456);
                if (kVarP.A(i15 & 1, (306783379 & i15) == 306783378)) {
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            g1Var = f1Var;
            int i192 = i18 | 3072;
            if ((i10 & 24576) == 0) {
            }
            i14 = i11 & 32;
            if (i14 == 0) {
            }
            bVar2 = bVar;
            i15 = i192 | 46661632 | (!kVarP.l(lVar2) ? PKIFailureInfo.duplicateCertReq : 268435456);
            if (kVarP.A(i15 & 1, (306783379 & i15) == 306783378)) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        } else {
            m0VarA = m0Var;
        }
        int i182 = i12 | i17;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        g1Var = f1Var;
        int i1922 = i182 | 3072;
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        bVar2 = bVar;
        i15 = i1922 | 46661632 | (!kVarP.l(lVar2) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (kVarP.A(i15 & 1, (306783379 & i15) == 306783378)) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(androidx.compose.ui.d dVar, m0 m0Var, f1 f1Var, b.e eVar, d.c cVar, v.z zVar, boolean z10, i1 i1Var, eh.l lVar, x0.j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        m0 m0VarA;
        f1 f1Var2;
        b.e eVar2;
        int i13;
        x0.k kVar;
        d.c cVar2;
        boolean z11;
        i1 i1Var2;
        androidx.compose.ui.d dVar3;
        m0 m0Var2;
        f1 f1Var3;
        v.z zVar2;
        h2 h2VarV;
        f1 g1Var;
        androidx.compose.ui.d dVar4;
        v.z zVar3;
        int i14;
        i1 i1VarA;
        d.c cVar3;
        boolean z12;
        f1 f1Var4;
        x0.k kVarP = jVar.p(-1884325601);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            dVar2 = dVar;
        } else if ((i10 & 6) == 0) {
            dVar2 = dVar;
            i12 = (kVarP.K(dVar2) ? 4 : 2) | i10;
        } else {
            dVar2 = dVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                m0VarA = m0Var;
                int i16 = kVarP.K(m0VarA) ? 32 : 16;
                i12 |= i16;
            } else {
                m0VarA = m0Var;
            }
            i12 |= i16;
        } else {
            m0VarA = m0Var;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 384) == 0) {
                f1Var2 = f1Var;
                i12 |= kVarP.K(f1Var2) ? 256 : 128;
            }
            int i18 = i12 | 3072;
            if ((i10 & 24576) != 0) {
                eVar2 = eVar;
                i18 |= kVarP.K(eVar2) ? 16384 : 8192;
            } else {
                eVar2 = eVar;
            }
            int i19 = 196608 | i18;
            if ((1572864 & i10) == 0) {
                i19 = 720896 | i18;
            }
            i13 = 12582912 | i19;
            if ((100663296 & i10) == 0) {
                i13 = 46137344 | i19;
            }
            if ((805306368 & i10) == 0) {
                i13 |= kVarP.l(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            if (kVarP.A(i13 & 1, (306783379 & i13) == 306783378)) {
                kVar = kVarP;
                kVar.v();
                cVar2 = cVar;
                z11 = z10;
                i1Var2 = i1Var;
                dVar3 = dVar2;
                m0Var2 = m0VarA;
                f1Var3 = f1Var2;
                zVar2 = zVar;
            } else {
                kVarP.r0();
                if ((i10 & 1) == 0 || kVarP.a0()) {
                    androidx.compose.ui.d dVar5 = i15 != 0 ? d.a.f1143b : dVar2;
                    if ((i11 & 2) != 0) {
                        i13 &= -113;
                        m0VarA = u0.a(kVarP);
                    }
                    if (i17 != 0) {
                        float f10 = 0;
                        g1Var = new g1(f10, f10, f10, f10);
                    } else {
                        g1Var = f1Var2;
                    }
                    s.y yVarA = n2.a(kVarP);
                    boolean zK = kVarP.K(yVarA);
                    Object objG = kVarP.g();
                    if (zK || objG == j.a.f31715a) {
                        objG = new v.h(yVarA);
                        kVarP.C(objG);
                    }
                    dVar4 = dVar5;
                    zVar3 = (v.h) objG;
                    i14 = i13 & (-238551041);
                    i1VarA = k1.a(kVarP);
                    cVar3 = d.a.f14611j;
                    z12 = true;
                    f1Var4 = g1Var;
                } else {
                    kVarP.v();
                    if ((i11 & 2) != 0) {
                        i13 &= -113;
                    }
                    i14 = i13 & (-238551041);
                    cVar3 = cVar;
                    zVar3 = zVar;
                    z12 = z10;
                    i1VarA = i1Var;
                    dVar4 = dVar2;
                    f1Var4 = f1Var2;
                }
                m0 m0Var3 = m0VarA;
                kVarP.U();
                kVar = kVarP;
                y.a(dVar4, m0Var3, f1Var4, false, zVar3, z12, i1VarA, null, null, cVar3, eVar2, lVar, kVar, (i14 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & V4Signature.MAX_SIGNING_INFOS_SIZE) | ((i14 >> 3) & 3670016), ((i14 >> 12) & 112) | ((i14 >> 6) & 896) | ((i14 >> 18) & V4Signature.MAX_SIGNING_INFOS_SIZE), 1792);
                dVar3 = dVar4;
                m0Var2 = m0Var3;
                f1Var3 = f1Var4;
                zVar2 = zVar3;
                z11 = z12;
                i1Var2 = i1VarA;
                cVar2 = cVar3;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new c(dVar3, m0Var2, f1Var3, eVar, cVar2, zVar2, z11, i1Var2, lVar, i10, i11);
                return;
            }
            return;
        }
        i12 |= 384;
        f1Var2 = f1Var;
        int i182 = i12 | 3072;
        if ((i10 & 24576) != 0) {
        }
        int i192 = 196608 | i182;
        if ((1572864 & i10) == 0) {
        }
        i13 = 12582912 | i192;
        if ((100663296 & i10) == 0) {
        }
        if ((805306368 & i10) == 0) {
        }
        if (kVarP.A(i13 & 1, (306783379 & i13) == 306783378)) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
