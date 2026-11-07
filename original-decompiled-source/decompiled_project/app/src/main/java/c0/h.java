package c0;

import c0.b;
import com.android.apksig.internal.apk.v4.V4Signature;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r.n2;
import t.i1;
import t.k1;
import x0.h2;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(b.a aVar, androidx.compose.ui.d dVar, w0 w0Var, z.g1 g1Var, b.l lVar, b.e eVar, v.z zVar, boolean z10, i1 i1Var, eh.l lVar2, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        z.g1 g1Var2;
        boolean z11;
        int i13;
        i1 i1Var2;
        int i14;
        v.z zVar2;
        i1 i1Var3;
        boolean z12;
        h2 h2VarV;
        v.z zVar3;
        int i15;
        i1 i1VarA;
        boolean z13;
        x0.k kVarP = jVar.p(-2072102870);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            dVar2 = dVar;
            i12 |= kVarP.K(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.K(w0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            g1Var2 = g1Var;
            i12 |= kVarP.K(g1Var2) ? 2048 : 1024;
        } else {
            g1Var2 = g1Var;
        }
        int i16 = i12 | 24576;
        if ((i10 & 196608) == 0) {
            i16 |= kVarP.K(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i16 |= kVarP.K(eVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i16 |= 4194304;
        }
        int i17 = i11 & 256;
        if (i17 == 0) {
            if ((100663296 & i10) == 0) {
                z11 = z10;
                i16 |= kVarP.c(z11) ? 67108864 : 33554432;
            }
            if ((i10 & 805306368) != 0) {
                i13 = 196608;
                if ((i11 & 512) == 0) {
                    i1Var2 = i1Var;
                    int i18 = kVarP.K(i1Var2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    i16 |= i18;
                } else {
                    i1Var2 = i1Var;
                }
                i16 |= i18;
            } else {
                i13 = 196608;
                i1Var2 = i1Var;
            }
            i14 = !kVarP.l(lVar2) ? 4 : 2;
            if (kVarP.A(i16 & 1, (i16 & 306783379) == 306783378 || (i14 & 3) != 2)) {
                kVarP.v();
                zVar2 = zVar;
                i1Var3 = i1Var2;
                z12 = z11;
            } else {
                kVarP.r0();
                int i19 = i10 & 1;
                Object obj = j.a.f31715a;
                if (i19 == 0 || kVarP.a0()) {
                    s.y yVarA = n2.a(kVarP);
                    boolean zK = kVarP.K(yVarA);
                    Object objG = kVarP.g();
                    if (zK || objG == obj) {
                        objG = new v.h(yVarA);
                        kVarP.C(objG);
                    }
                    zVar3 = (v.h) objG;
                    int i20 = i16 & (-29360129);
                    if (i17 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 512) != 0) {
                        i15 = i16 & (-1908408321);
                        i1VarA = k1.a(kVarP);
                    } else {
                        i15 = i20;
                        i1VarA = i1Var2;
                    }
                    z13 = z11;
                } else {
                    kVarP.v();
                    int i21 = i16 & (-29360129);
                    if ((i11 & 512) != 0) {
                        i21 = i16 & (-1908408321);
                    }
                    i15 = i21;
                    i1VarA = i1Var2;
                    z13 = z11;
                    zVar3 = zVar;
                }
                kVarP.U();
                int i22 = (i15 & 14) | ((i15 >> 15) & 112);
                boolean z14 = ((((i22 & 14) ^ 6) > 4 && kVarP.K(aVar)) || (i22 & 6) == 4) | ((((i22 & 112) ^ 48) > 32 && kVarP.K(eVar)) || (i22 & 48) == 32);
                Object objG2 = kVarP.g();
                if (z14 || objG2 == obj) {
                    objG2 = new d(new g(aVar, eVar));
                    kVarP.C(objG2);
                }
                int i23 = i15 >> 3;
                v.z zVar4 = zVar3;
                e0.a(dVar2, w0Var, (t0) objG2, g1Var2, zVar4, z13, i1VarA, lVar, eVar, lVar2, kVarP, (i23 & 234881024) | (i23 & 14) | i13 | (i23 & 112) | (i15 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (57344 & i15) | (29360128 & i23) | ((i15 << 12) & 1879048192), ((i15 >> 18) & 14) | ((i14 << 3) & 112));
                i1Var3 = i1VarA;
                z12 = z13;
                zVar2 = zVar4;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new f(aVar, dVar, w0Var, g1Var, lVar, eVar, zVar2, z12, i1Var3, lVar2, i10, i11);
                return;
            }
            return;
        }
        i16 |= 100663296;
        z11 = z10;
        if ((i10 & 805306368) != 0) {
        }
        if (!kVarP.l(lVar2)) {
        }
        if (kVarP.A(i16 & 1, (i16 & 306783379) == 306783378 || (i14 & 3) != 2)) {
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }
}
