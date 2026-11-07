package c0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import d0.j2;
import j2.j2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q1.k1;
import t.i1;
import x0.h2;
import x0.j;
import x0.n1;
import x0.r3;
import x0.s2;
import x0.w2;
import z.b;

/* loaded from: classes.dex */
public final class e0 {
    /* JADX WARN: Removed duplicated region for block: B:177:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, w0 w0Var, t0 t0Var, z.g1 g1Var, v.z zVar, boolean z10, i1 i1Var, b.l lVar, b.e eVar, eh.l lVar2, x0.j jVar, int i10, int i11) {
        int i12;
        int i13;
        w0 w0Var2;
        x0.k kVar;
        Object d0Var;
        w0 w0Var3;
        g1 g1Var2;
        boolean z11;
        boolean z12;
        kh.g gVar;
        androidx.compose.ui.d dVarA;
        x0.k kVarP = jVar.p(708740370);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.K(w0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? kVarP.K(t0Var) : kVarP.l(t0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.K(g1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.c(false) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= kVarP.c(true) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= kVarP.K(zVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= kVarP.c(z10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= kVarP.K(i1Var) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= kVarP.K(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.K(eVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.l(lVar2) ? 32 : 16;
        }
        if (kVarP.A(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true)) {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            int i14 = i12 >> 3;
            int i15 = i14 & 14;
            int i16 = i15 | (i13 & 112);
            n1 n1VarK = bg.b.k(lVar2, kVarP);
            int i17 = i12;
            boolean z13 = (((i16 & 14) ^ 6) > 4 && kVarP.K(w0Var)) || (i16 & 6) == 4;
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z13 || objG == c0321a) {
                t tVar = new t(n1VarK, 0);
                s2 s2Var = s2.f31913a;
                objG = new s(bg.b.e(new u(bg.b.e(tVar, s2Var), w0Var), s2Var), r3.class, "value", "getValue()Ljava/lang/Object;", 0);
                kVarP.C(objG);
            }
            kh.g gVar2 = (kh.g) objG;
            int i18 = i15 | ((i17 >> 9) & 112);
            boolean z14 = ((((i18 & 14) ^ 6) > 4 && kVarP.K(w0Var)) || (i18 & 6) == 4) | ((((i18 & 112) ^ 48) > 32 && kVarP.c(false)) || (i18 & 48) == 32);
            Object objG2 = kVarP.g();
            if (z14 || objG2 == c0321a) {
                objG2 = new g1(w0Var);
                kVarP.C(objG2);
            }
            g1 g1Var3 = (g1) objG2;
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
            int i19 = (i17 & 524272) | ((i13 << 18) & 3670016) | ((i17 >> 6) & 29360128);
            boolean z15 = ((((i19 & 896) ^ 384) > 256 && kVarP.K(t0Var)) || (i19 & 384) == 256) | ((((i19 & 112) ^ 48) > 32 && kVarP.K(w0Var)) || (i19 & 48) == 32) | ((((i19 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) > 2048 && kVarP.K(g1Var)) || (i19 & 3072) == 2048);
            if (((57344 & i19) ^ 24576) <= 16384 || !kVarP.c(false)) {
                boolean z16 = (i19 & 24576) == 16384;
                boolean zK = z15 | z16 | ((((458752 & i19) ^ 196608) > 131072 && kVarP.c(true)) || (i19 & 196608) == 131072) | ((((i19 & 3670016) ^ 1572864) > 1048576 && kVarP.K(eVar)) || (i19 & 1572864) == 1048576) | ((((i19 & 29360128) ^ 12582912) > 8388608 && kVarP.K(lVar)) || (i19 & 12582912) == 8388608) | kVarP.K(k1Var);
                Object objG4 = kVarP.g();
                if (zK || objG4 == c0321a) {
                    w0Var3 = w0Var;
                    g1Var2 = g1Var3;
                    z11 = false;
                    z12 = true;
                    d0Var = new d0(w0Var3, g1Var, gVar2, t0Var, lVar, eVar, i0Var, k1Var, c0077a);
                    gVar = gVar2;
                    kVarP.C(d0Var);
                } else {
                    d0Var = objG4;
                    g1Var2 = g1Var3;
                    gVar = gVar2;
                    z11 = false;
                    z12 = true;
                    w0Var3 = w0Var;
                }
                eh.p pVar = (eh.p) d0Var;
                v.t0 t0Var2 = v.t0.f30083a;
                if (z10) {
                    kVarP.L(-1614890700);
                    boolean z17 = (((i15 ^ 6) <= 4 || !kVarP.K(w0Var3)) && (i14 & 6) != 4) ? z11 : z12;
                    Object objG5 = kVarP.g();
                    if (z17 || objG5 == c0321a) {
                        objG5 = new e(w0Var3);
                        kVarP.C(objG5);
                    }
                    dVarA = androidx.compose.foundation.lazy.layout.a.a((e) objG5, w0Var3.f4518n, t0Var2);
                    kVarP.T(z11);
                } else {
                    kVarP.L(-1614595456);
                    kVarP.T(z11);
                    dVarA = d.a.f1143b;
                }
                androidx.compose.ui.d dVarA2 = androidx.compose.foundation.f.a(androidx.compose.foundation.lazy.layout.c.a(dVar.h(w0Var3.f4515k).h(w0Var3.f4516l), gVar, g1Var2, t0Var2, z10).h(dVarA).h(w0Var3.f4517m.f999k), w0Var3, t0Var2, z10, zVar, w0Var3.f4510f, false, i1Var, null);
                w0Var2 = w0Var3;
                kVar = kVarP;
                d0.p0.a(gVar, dVarA2, w0Var2.f4519o, pVar, kVar, 0);
            }
        } else {
            w0Var2 = w0Var;
            kVar = kVarP;
            kVar.v();
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new y(dVar, w0Var2, t0Var, g1Var, zVar, z10, i1Var, lVar, eVar, lVar2, i10, i11);
        }
    }
}
