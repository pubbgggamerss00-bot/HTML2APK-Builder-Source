package e0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import d0.m1;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import v.e2;
import x0.h2;
import x0.j;
import x0.n1;
import x0.r3;
import x0.s2;
import x0.w2;

/* loaded from: classes.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:241:0x0370 A[PHI: r7
      0x0370: PHI (r7v58 int) = (r7v43 int), (r7v59 int) binds: [B:240:0x036e, B:236:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f10, int i10, int i11, int i12, androidx.compose.ui.d dVar, b2.a aVar, b bVar, o oVar, f1.b bVar2, d.c cVar, t.i1 i1Var, e2 e2Var, w.n nVar, x0.j jVar, z.f1 f1Var, boolean z10) {
        int i13;
        int i14;
        Object obj;
        androidx.compose.ui.d dVar2;
        e2 e2Var2;
        int i15;
        b2.a aVar2;
        x0.k kVar;
        int i16;
        boolean z11;
        boolean zK;
        Object objG;
        v.t0 t0Var;
        int i17;
        b bVar3;
        kh.g gVar;
        boolean zC;
        Object objG2;
        boolean z12;
        Object objG3;
        v.d dVar3;
        boolean zK2;
        Object objG4;
        v.t0 t0Var2;
        boolean z13;
        androidx.compose.ui.d dVarA;
        b bVar4 = bVar;
        v.t0 t0Var3 = v.t0.f30084b;
        x0.k kVarP = jVar.p(1125194810);
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.K(dVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.K(bVar4) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.K(f1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.c(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= kVarP.K(t0Var3) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= kVarP.K(e2Var) ? 131072 : 65536;
        }
        int i18 = i11 & 1572864;
        int i19 = PKIFailureInfo.signerNotTrusted;
        if (i18 == 0) {
            i13 |= kVarP.c(z10) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= kVarP.K(i1Var) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= kVarP.i(i10) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= kVarP.h(f10) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (kVarP.K(oVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= kVarP.l(aVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= kVarP.l(null) ? 256 : 128;
        }
        int i20 = i12 & 3072;
        Object obj2 = d.a.f14615n;
        if (i20 == 0) {
            i14 |= kVarP.K(obj2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= kVarP.K(cVar) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= kVarP.K(nVar) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            obj = bVar2;
            if (kVarP.l(obj)) {
                i19 = PKIFailureInfo.badCertTemplate;
            }
            i14 |= i19;
        } else {
            obj = bVar2;
        }
        int i21 = i14;
        boolean z14 = true;
        if (kVarP.A(i13 & 1, ((i13 & 306783379) == 306783378 && (599187 & i21) == 599186) ? false : true)) {
            if (i10 < 0) {
                y.c.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i10);
            }
            int i22 = i13 & 112;
            boolean z15 = i22 == 32;
            Object objG5 = kVarP.g();
            Object obj3 = j.a.f31715a;
            if (z15 || objG5 == obj3) {
                objG5 = new f(bVar4);
                kVarP.C(objG5);
            }
            eh.a aVar3 = (eh.a) objG5;
            int i23 = i13 >> 3;
            int i24 = i23 & 14;
            int i25 = i21 >> 15;
            int i26 = i24 | (i25 & 112) | (i21 & 896);
            n1 n1VarK = bg.b.k(obj, kVarP);
            n1 n1VarK2 = bg.b.k(null, kVarP);
            boolean zK3 = ((((i26 & 14) ^ 6) > 4 && kVarP.K(bVar4)) || (i26 & 6) == 4) | kVarP.K(n1VarK) | kVarP.K(n1VarK2) | kVarP.K(aVar3);
            Object objG6 = kVarP.g();
            if (zK3 || objG6 == obj3) {
                i iVar = new i(n1VarK, n1VarK2, aVar3);
                s2 s2Var = s2.f31913a;
                objG6 = new h(bg.b.e(new j(0, bg.b.e(iVar, s2Var), bVar4), s2Var), r3.class, "value", "getValue()Ljava/lang/Object;", 0);
                kVarP.C(objG6);
            }
            kh.g gVar2 = (kh.g) objG6;
            Object objG7 = kVarP.g();
            if (objG7 == obj3) {
                x0.l0 l0Var = x0.o0.f31834a;
                Object w2Var = new w2(kVarP.x());
                kVarP.C(w2Var);
                objG7 = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG7;
            boolean z16 = i22 == 32;
            Object objG8 = kVarP.g();
            if (z16 || objG8 == obj3) {
                objG8 = new e(bVar4);
                kVarP.C(objG8);
            }
            eh.a aVar4 = (eh.a) objG8;
            int i27 = i13 >> 9;
            int i28 = (i13 & 65520) | (i27 & 458752) | (i27 & 3670016) | ((i21 << 21) & 29360128);
            int i29 = i21 << 15;
            int i30 = i28 | (i29 & 234881024) | (i29 & 1879048192);
            boolean zK4 = ((((i30 & 896) ^ 384) > 256 && kVarP.K(f1Var)) || (i30 & 384) == 256) | ((((i30 & 112) ^ 48) > 32 && kVarP.K(bVar4)) || (i30 & 48) == 32) | ((((i30 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) > 2048 && kVarP.c(false)) || (i30 & 3072) == 2048) | ((((57344 & i30) ^ 24576) > 16384 && kVarP.K(t0Var3)) || (i30 & 24576) == 16384) | ((((i30 & 234881024) ^ 100663296) > 67108864 && kVarP.K(obj2)) || (i30 & 100663296) == 67108864) | ((((i30 & 1879048192) ^ 805306368) > 536870912 && kVarP.K(cVar)) || (i30 & 805306368) == 536870912) | ((((i30 & 3670016) ^ 1572864) > 1048576 && kVarP.h(f10)) || (i30 & 1572864) == 1048576) | ((((i30 & 29360128) ^ 12582912) > 8388608 && kVarP.K(oVar)) || (i30 & 12582912) == 8388608) | ((((i25 & 14) ^ 6) > 4 && kVarP.K(nVar)) || (i25 & 6) == 4) | kVarP.K(aVar4);
            if (((i30 & 458752) ^ 196608) > 131072) {
                i16 = i10;
                if (kVarP.i(i16)) {
                    z11 = true;
                    zK = zK4 | z11 | kVarP.K(i0Var);
                    objG = kVarP.g();
                    if (!zK || objG == obj3) {
                        t0Var = t0Var3;
                        i17 = 4;
                        e2Var2 = e2Var;
                        int i31 = i16;
                        bVar3 = bVar;
                        Object n0Var = new n0(bVar3, f1Var, f10, oVar, gVar2, aVar4, cVar, i31, nVar, i0Var);
                        i15 = i31;
                        i0Var = i0Var;
                        gVar = gVar2;
                        kVarP.C(n0Var);
                        objG = n0Var;
                    } else {
                        bVar3 = bVar;
                        t0Var = t0Var3;
                        i15 = i16;
                        i17 = 4;
                        gVar = gVar2;
                        e2Var2 = e2Var;
                    }
                    eh.p pVar = (eh.p) objG;
                    v.t0 t0Var4 = v.t0.f30083a;
                    zC = (((i24 ^ 6) <= i17 && kVarP.K(bVar3)) || (i23 & 6) == i17) | kVarP.c(false);
                    objG2 = kVarP.g();
                    if (zC || objG2 == obj3) {
                        objG2 = new l(bVar3, false);
                        kVarP.C(objG2);
                    }
                    m1 m1Var = (m1) objG2;
                    z12 = ((i13 & 458752) != 131072) | (i22 != 32);
                    objG3 = kVarP.g();
                    if (!z12 || objG3 == obj3) {
                        objG3 = new i1(e2Var2, bVar3);
                        kVarP.C(objG3);
                    }
                    i1 i1Var2 = (i1) objG3;
                    dVar3 = (v.d) kVarP.f(v.e.f29814a);
                    zK2 = kVarP.K(dVar3) | (i22 != 32);
                    objG4 = kVarP.g();
                    if (!zK2 || objG4 == obj3) {
                        objG4 = new q(bVar3, dVar3);
                        kVarP.C(objG4);
                    }
                    q qVar = (q) objG4;
                    d.a aVar5 = d.a.f1143b;
                    if (z10) {
                        t0Var2 = t0Var;
                        z13 = false;
                        kVarP.L(1935788068);
                        kVarP.T(false);
                        dVarA = aVar5;
                    } else {
                        kVarP.L(1935359245);
                        int i32 = i24 | ((i13 >> 21) & 112);
                        boolean z17 = (((i32 & 14) ^ 6) > i17 && kVarP.K(bVar3)) || (i32 & 6) == i17;
                        if ((((i32 & 112) ^ 48) <= 32 || !kVarP.i(i15)) && (i32 & 48) != 32) {
                            z14 = false;
                        }
                        boolean z18 = z17 | z14;
                        Object objG9 = kVarP.g();
                        if (z18 || objG9 == obj3) {
                            objG9 = new p(bVar3, i15);
                            kVarP.C(objG9);
                        }
                        t0Var2 = t0Var;
                        dVarA = androidx.compose.foundation.lazy.layout.a.a((p) objG9, bVar3.f8164v, t0Var2);
                        z13 = false;
                        kVarP.T(false);
                    }
                    dVar2 = dVar;
                    androidx.compose.ui.d dVarA2 = androidx.compose.foundation.lazy.layout.c.a(dVar2.h(bVar3.f8167y).h(bVar3.f8165w), gVar, m1Var, t0Var2, z10);
                    androidx.compose.ui.d dVarH = !z10 ? dVarA2.h(q2.q.a(aVar5, z13, new y(z13, bVar3, i0Var))) : dVarA2.h(aVar5);
                    v.t0 t0Var5 = t0Var2;
                    bVar4 = bVar3;
                    aVar2 = aVar;
                    kVar = kVarP;
                    d0.p0.a(gVar, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.f.a(dVarH.h(dVarA), bVar3, t0Var5, z10, i1Var2, bVar3.f8160r, false, i1Var, qVar).h(c2.s0.a(aVar5, bVar4, new g(bVar4))), aVar2, null), bVar4.f8163u, pVar, kVar, 0);
                }
            } else {
                i16 = i10;
            }
            if ((i30 & 196608) != 131072) {
                z11 = false;
            }
            zK = zK4 | z11 | kVarP.K(i0Var);
            objG = kVarP.g();
            if (zK) {
                t0Var = t0Var3;
                i17 = 4;
                e2Var2 = e2Var;
                int i312 = i16;
                bVar3 = bVar;
                Object n0Var2 = new n0(bVar3, f1Var, f10, oVar, gVar2, aVar4, cVar, i312, nVar, i0Var);
                i15 = i312;
                i0Var = i0Var;
                gVar = gVar2;
                kVarP.C(n0Var2);
                objG = n0Var2;
                eh.p pVar2 = (eh.p) objG;
                v.t0 t0Var42 = v.t0.f30083a;
                if ((i24 ^ 6) <= i17) {
                    zC = (((i24 ^ 6) <= i17 && kVarP.K(bVar3)) || (i23 & 6) == i17) | kVarP.c(false);
                    objG2 = kVarP.g();
                    if (zC) {
                        objG2 = new l(bVar3, false);
                        kVarP.C(objG2);
                        m1 m1Var2 = (m1) objG2;
                        if (i22 != 32) {
                        }
                        z12 = ((i13 & 458752) != 131072) | (i22 != 32);
                        objG3 = kVarP.g();
                        if (!z12) {
                            objG3 = new i1(e2Var2, bVar3);
                            kVarP.C(objG3);
                            i1 i1Var22 = (i1) objG3;
                            dVar3 = (v.d) kVarP.f(v.e.f29814a);
                            zK2 = kVarP.K(dVar3) | (i22 != 32);
                            objG4 = kVarP.g();
                            if (!zK2) {
                                objG4 = new q(bVar3, dVar3);
                                kVarP.C(objG4);
                                q qVar2 = (q) objG4;
                                d.a aVar52 = d.a.f1143b;
                                if (z10) {
                                }
                                dVar2 = dVar;
                                androidx.compose.ui.d dVarA22 = androidx.compose.foundation.lazy.layout.c.a(dVar2.h(bVar3.f8167y).h(bVar3.f8165w), gVar, m1Var2, t0Var2, z10);
                                if (!z10) {
                                }
                                v.t0 t0Var52 = t0Var2;
                                bVar4 = bVar3;
                                aVar2 = aVar;
                                kVar = kVarP;
                                d0.p0.a(gVar, androidx.compose.ui.input.nestedscroll.a.a(androidx.compose.foundation.f.a(dVarH.h(dVarA), bVar3, t0Var52, z10, i1Var22, bVar3.f8160r, false, i1Var, qVar2).h(c2.s0.a(aVar52, bVar4, new g(bVar4))), aVar2, null), bVar4.f8163u, pVar2, kVar, 0);
                            }
                        }
                    }
                } else {
                    zC = (((i24 ^ 6) <= i17 && kVarP.K(bVar3)) || (i23 & 6) == i17) | kVarP.c(false);
                    objG2 = kVarP.g();
                    if (zC) {
                    }
                }
            }
        } else {
            dVar2 = dVar;
            e2Var2 = e2Var;
            i15 = i10;
            aVar2 = aVar;
            kVar = kVarP;
            kVar.v();
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d(f10, i15, i11, i12, dVar2, aVar2, bVar4, oVar, bVar2, cVar, i1Var, e2Var2, nVar, f1Var, z10);
        }
    }
}
