package i0;

import com.android.apksig.internal.apk.v4.V4Signature;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;
import y2.q0;

/* loaded from: classes.dex */
public final class q {
    static {
        float f10 = 40;
        f3.i.a(f10, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, eh.l lVar, androidx.compose.ui.d dVar, boolean z10, boolean z11, t2.l0 l0Var, h2 h2Var, g2 g2Var, boolean z12, int i10, int i11, y2.q0 q0Var, eh.l lVar2, x.m mVar, q1.i2 i2Var, eh.q qVar, x0.j jVar, int i12, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        int i17;
        int i18;
        g2 g2Var2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        x0.k kVar;
        boolean z15;
        int i31;
        y2.q0 q0Var2;
        eh.l lVar3;
        eh.q qVar2;
        boolean z16;
        g2 g2Var3;
        boolean z17;
        h2 h2Var2;
        int i32;
        x.m mVar2;
        x0.h2 h2VarV;
        h2 h2Var3;
        int i33;
        int i34;
        int i35;
        boolean z18;
        g2 g2Var4;
        int i36;
        int i37;
        y2.q0 q0Var3;
        eh.l lVar4;
        x.m mVar3;
        eh.q qVar3;
        boolean z19;
        Object objG;
        j.a.C0321a c0321a;
        x0.n1 n1Var;
        y2.c0 c0VarA;
        boolean zK;
        Object objG2;
        boolean z20;
        Object objG3;
        x0.n1 n1Var2;
        boolean zK2;
        Object objG4;
        x0.k kVarP = jVar.p(945255183);
        if ((i12 & 6) == 0) {
            i15 = (kVarP.K(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i15 |= kVarP.K(dVar) ? 256 : 128;
        }
        int i38 = i14 & 8;
        if (i38 != 0) {
            i15 |= 3072;
        } else {
            if ((i12 & 3072) == 0) {
                z13 = z10;
                i15 |= kVarP.c(z13) ? 2048 : 1024;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i12 & 24576) == 0) {
                    z14 = z11;
                    i15 |= kVarP.c(z14) ? 16384 : 8192;
                }
                if ((i12 & 196608) == 0) {
                    i15 |= kVarP.K(l0Var) ? 131072 : 65536;
                }
                i17 = i14 & 64;
                if (i17 != 0) {
                    i15 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    i15 |= kVarP.K(h2Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i18 = i14 & 128;
                if (i18 != 0) {
                    i15 |= 12582912;
                    g2Var2 = g2Var;
                } else {
                    g2Var2 = g2Var;
                    if ((i12 & 12582912) == 0) {
                        i15 |= kVarP.K(g2Var2) ? 8388608 : 4194304;
                    }
                }
                i19 = i14 & 256;
                if (i19 != 0) {
                    i15 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    i15 |= kVarP.c(z12) ? 67108864 : 33554432;
                }
                if ((i12 & 805306368) == 0) {
                    i15 |= ((i14 & 512) == 0 && kVarP.i(i10)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                i20 = i14 & 1024;
                if (i20 != 0) {
                    i22 = i13 | 6;
                    i21 = i20;
                } else {
                    i21 = i20;
                    i22 = i13 | (kVarP.i(i11) ? 4 : 2);
                }
                i23 = i14 & 2048;
                if (i23 != 0) {
                    i25 = i22 | 48;
                    i24 = i23;
                } else {
                    i24 = i23;
                    i25 = i22 | (kVarP.K(q0Var) ? 32 : 16);
                }
                int i39 = i25;
                i26 = i15;
                int i40 = i39 | 384;
                i27 = i14 & 8192;
                if (i27 != 0) {
                    i28 = i39 | 3456;
                } else {
                    i28 = i40 | (kVarP.K(mVar) ? 2048 : 1024);
                }
                i29 = i28 | (kVarP.K(i2Var) ? 16384 : 8192);
                i30 = i14 & 32768;
                if (i30 != 0) {
                    i29 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i29 |= kVarP.l(qVar) ? 131072 : 65536;
                }
                if (kVarP.A(i26 & 1, ((i26 & 306783379) == 306783378 && (i29 & 74899) == 74898) ? false : true)) {
                    kVarP.r0();
                    if ((i12 & 1) == 0 || kVarP.a0()) {
                        if (i38 != 0) {
                            z13 = true;
                        }
                        if (i16 != 0) {
                            z14 = false;
                        }
                        h2Var3 = i17 != 0 ? h2.f13315c : h2Var;
                        if (i18 != 0) {
                            g2Var2 = g2.f13294c;
                        }
                        boolean z21 = i19 != 0 ? false : z12;
                        if ((i14 & 512) != 0) {
                            i33 = z21 ? 1 : Integer.MAX_VALUE;
                            i34 = i26 & (-1879048193);
                        } else {
                            i33 = i10;
                            i34 = i26;
                        }
                        int i41 = i21 != 0 ? 1 : i11;
                        y2.q0 q0Var4 = i24 != 0 ? q0.a.f33765a : q0Var;
                        m mVar4 = m.f13421a;
                        x.m mVar5 = i27 != 0 ? null : mVar;
                        if (i30 != 0) {
                            boolean z22 = z21;
                            i35 = i34;
                            z18 = z22;
                            i36 = i33;
                            i37 = i41;
                            q0Var3 = q0Var4;
                            mVar3 = mVar5;
                            qVar3 = j0.f13369a;
                            g2Var4 = g2Var2;
                            lVar4 = mVar4;
                        } else {
                            boolean z23 = z21;
                            i35 = i34;
                            z18 = z23;
                            g2Var4 = g2Var2;
                            i36 = i33;
                            i37 = i41;
                            q0Var3 = q0Var4;
                            lVar4 = mVar4;
                            mVar3 = mVar5;
                            qVar3 = qVar;
                        }
                    } else {
                        kVarP.v();
                        if ((i14 & 512) != 0) {
                            h2Var3 = h2Var;
                            i36 = i10;
                            i37 = i11;
                            q0Var3 = q0Var;
                            mVar3 = mVar;
                            qVar3 = qVar;
                            i35 = i26 & (-1879048193);
                            z19 = z14;
                            g2Var4 = g2Var2;
                            z18 = z12;
                            lVar4 = lVar2;
                            kVarP.U();
                            objG = kVarP.g();
                            y2.q0 q0Var5 = q0Var3;
                            c0321a = j.a.f31715a;
                            if (objG == c0321a) {
                                objG = bg.b.h(new y2.c0(str, 0L, 6));
                                kVarP.C(objG);
                            }
                            n1Var = (x0.n1) objG;
                            c0VarA = y2.c0.a((y2.c0) n1Var.getValue(), str, 0L, 6);
                            zK = kVarP.K(c0VarA);
                            objG2 = kVarP.g();
                            if (!zK || objG2 == c0321a) {
                                objG2 = new n(c0VarA, n1Var);
                                kVarP.C(objG2);
                            }
                            x0.l0 l0Var2 = x0.o0.f31834a;
                            kVarP.u((eh.a) objG2);
                            z20 = (i35 & 14) != 4;
                            objG3 = kVarP.g();
                            if (!z20 || objG3 == c0321a) {
                                objG3 = bg.b.h(str);
                                kVarP.C(objG3);
                            }
                            n1Var2 = (x0.n1) objG3;
                            int i42 = i29;
                            y2.o oVarA = h2Var3.a(z18);
                            boolean z24 = !z18;
                            int i43 = !z18 ? 1 : i37;
                            boolean z25 = z13;
                            int i44 = !z18 ? 1 : i36;
                            h2 h2Var4 = h2Var3;
                            zK2 = kVarP.K(n1Var2) | ((i35 & 112) == 32);
                            objG4 = kVarP.g();
                            if (!zK2 || objG4 == c0321a) {
                                objG4 = new o(lVar, n1Var, n1Var2);
                                kVarP.C(objG4);
                            }
                            int i45 = i42 << 9;
                            kVar = kVarP;
                            boolean z26 = z18;
                            q1.a(c0VarA, (eh.l) objG4, dVar, l0Var, q0Var5, lVar4, mVar3, i2Var, z24, i44, i43, oVarA, g2Var4, z25, z19, qVar3, kVar, (i35 & 896) | ((i35 >> 6) & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i45 & 57344) | 196608 | (3670016 & i45) | (i45 & 29360128), (i35 & 57344) | ((i35 >> 15) & 896) | (i35 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (458752 & i42));
                            q0Var2 = q0Var5;
                            lVar3 = lVar4;
                            mVar2 = mVar3;
                            g2Var3 = g2Var4;
                            z17 = z25;
                            z16 = z19;
                            qVar2 = qVar3;
                            i32 = i36;
                            i31 = i37;
                            h2Var2 = h2Var4;
                            z15 = z26;
                        } else {
                            h2Var3 = h2Var;
                            z18 = z12;
                            i36 = i10;
                            i37 = i11;
                            q0Var3 = q0Var;
                            mVar3 = mVar;
                            qVar3 = qVar;
                            g2Var4 = g2Var2;
                            i35 = i26;
                            lVar4 = lVar2;
                        }
                    }
                    z19 = z14;
                    kVarP.U();
                    objG = kVarP.g();
                    y2.q0 q0Var52 = q0Var3;
                    c0321a = j.a.f31715a;
                    if (objG == c0321a) {
                    }
                    n1Var = (x0.n1) objG;
                    c0VarA = y2.c0.a((y2.c0) n1Var.getValue(), str, 0L, 6);
                    zK = kVarP.K(c0VarA);
                    objG2 = kVarP.g();
                    if (!zK) {
                        objG2 = new n(c0VarA, n1Var);
                        kVarP.C(objG2);
                        x0.l0 l0Var22 = x0.o0.f31834a;
                        kVarP.u((eh.a) objG2);
                        if ((i35 & 14) != 4) {
                        }
                        objG3 = kVarP.g();
                        if (!z20) {
                            objG3 = bg.b.h(str);
                            kVarP.C(objG3);
                            n1Var2 = (x0.n1) objG3;
                            int i422 = i29;
                            y2.o oVarA2 = h2Var3.a(z18);
                            boolean z242 = !z18;
                            if (!z18) {
                            }
                            boolean z252 = z13;
                            if (!z18) {
                            }
                            h2 h2Var42 = h2Var3;
                            zK2 = kVarP.K(n1Var2) | ((i35 & 112) == 32);
                            objG4 = kVarP.g();
                            if (!zK2) {
                                objG4 = new o(lVar, n1Var, n1Var2);
                                kVarP.C(objG4);
                                int i452 = i422 << 9;
                                kVar = kVarP;
                                boolean z262 = z18;
                                q1.a(c0VarA, (eh.l) objG4, dVar, l0Var, q0Var52, lVar4, mVar3, i2Var, z242, i44, i43, oVarA2, g2Var4, z252, z19, qVar3, kVar, (i35 & 896) | ((i35 >> 6) & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i452 & 57344) | 196608 | (3670016 & i452) | (i452 & 29360128), (i35 & 57344) | ((i35 >> 15) & 896) | (i35 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (458752 & i422));
                                q0Var2 = q0Var52;
                                lVar3 = lVar4;
                                mVar2 = mVar3;
                                g2Var3 = g2Var4;
                                z17 = z252;
                                z16 = z19;
                                qVar2 = qVar3;
                                i32 = i36;
                                i31 = i37;
                                h2Var2 = h2Var42;
                                z15 = z262;
                            }
                        }
                    }
                } else {
                    kVar = kVarP;
                    kVar.v();
                    z15 = z12;
                    i31 = i11;
                    q0Var2 = q0Var;
                    lVar3 = lVar2;
                    qVar2 = qVar;
                    z16 = z14;
                    g2Var3 = g2Var2;
                    z17 = z13;
                    h2Var2 = h2Var;
                    i32 = i10;
                    mVar2 = mVar;
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new p(str, lVar, dVar, z17, z16, l0Var, h2Var2, g2Var3, z15, i32, i31, q0Var2, lVar3, mVar2, i2Var, qVar2, i12, i13, i14);
                    return;
                }
                return;
            }
            i15 |= 24576;
            z14 = z11;
            if ((i12 & 196608) == 0) {
            }
            i17 = i14 & 64;
            if (i17 != 0) {
            }
            i18 = i14 & 128;
            if (i18 != 0) {
            }
            i19 = i14 & 256;
            if (i19 != 0) {
            }
            if ((i12 & 805306368) == 0) {
            }
            i20 = i14 & 1024;
            if (i20 != 0) {
            }
            i23 = i14 & 2048;
            if (i23 != 0) {
            }
            int i392 = i25;
            i26 = i15;
            int i402 = i392 | 384;
            i27 = i14 & 8192;
            if (i27 != 0) {
            }
            i29 = i28 | (kVarP.K(i2Var) ? 16384 : 8192);
            i30 = i14 & 32768;
            if (i30 != 0) {
            }
            if (kVarP.A(i26 & 1, ((i26 & 306783379) == 306783378 && (i29 & 74899) == 74898) ? false : true)) {
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        z13 = z10;
        i16 = i14 & 16;
        if (i16 != 0) {
        }
        z14 = z11;
        if ((i12 & 196608) == 0) {
        }
        i17 = i14 & 64;
        if (i17 != 0) {
        }
        i18 = i14 & 128;
        if (i18 != 0) {
        }
        i19 = i14 & 256;
        if (i19 != 0) {
        }
        if ((i12 & 805306368) == 0) {
        }
        i20 = i14 & 1024;
        if (i20 != 0) {
        }
        i23 = i14 & 2048;
        if (i23 != 0) {
        }
        int i3922 = i25;
        i26 = i15;
        int i4022 = i3922 | 384;
        i27 = i14 & 8192;
        if (i27 != 0) {
        }
        i29 = i28 | (kVarP.K(i2Var) ? 16384 : 8192);
        i30 = i14 & 32768;
        if (i30 != 0) {
        }
        if (kVarP.A(i26 & 1, ((i26 & 306783379) == 306783378 && (i29 & 74899) == 74898) ? false : true)) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    public static final void b(y2.c0 c0Var, eh.l lVar, androidx.compose.ui.d dVar, boolean z10, t2.l0 l0Var, h2 h2Var, g2 g2Var, boolean z11, int i10, int i11, y2.q0 q0Var, eh.l lVar2, x.m mVar, q1.i2 i2Var, f1.b bVar, x0.j jVar, int i12) {
        x0.k kVar;
        eh.l lVar3;
        eh.l lVar4;
        x0.k kVarP = jVar.p(1804514146);
        int i13 = i12 | (kVarP.K(c0Var) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.K(dVar) ? 256 : 128) | (kVarP.c(z10) ? 2048 : 1024) | (kVarP.c(false) ? 16384 : 8192) | (kVarP.K(l0Var) ? 131072 : 65536) | (kVarP.K(h2Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.K(g2Var) ? 8388608 : 4194304) | (kVarP.c(z11) ? 67108864 : 33554432) | (kVarP.i(i10) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i14 = 196608 | (kVarP.i(i11) ? 4 : 2) | (kVarP.K(q0Var) ? 32 : 16) | 384 | (kVarP.K(mVar) ? 2048 : 1024) | (kVarP.K(i2Var) ? 16384 : 8192);
        if (kVarP.A(i13 & 1, ((i13 & 306783379) == 306783378 && (74899 & i14) == 74898) ? false : true)) {
            kVarP.r0();
            if ((i12 & 1) == 0 || kVarP.a0()) {
                lVar4 = k.f13382a;
            } else {
                kVarP.v();
                lVar4 = lVar2;
            }
            kVarP.U();
            y2.o oVarA = h2Var.a(z11);
            boolean z12 = !z11;
            int i15 = z11 ? 1 : i11;
            int i16 = z11 ? 1 : i10;
            boolean z13 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
            Object objG = kVarP.g();
            if (z13 || objG == j.a.f31715a) {
                objG = new d0.v1(2, c0Var, lVar);
                kVarP.C(objG);
            }
            int i17 = i14 << 9;
            int i18 = ((i13 >> 6) & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i13 & 910) | (i17 & 57344) | 196608 | (i17 & 3670016) | (i17 & 29360128);
            int i19 = ((i13 >> 15) & 896) | (i13 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i13 & 57344) | 196608;
            kVar = kVarP;
            eh.l lVar5 = lVar4;
            q1.a(c0Var, (eh.l) objG, dVar, l0Var, q0Var, lVar5, mVar, i2Var, z12, i16, i15, oVarA, g2Var, z10, false, bVar, kVar, i18, i19);
            lVar3 = lVar5;
        } else {
            kVar = kVarP;
            kVar.v();
            lVar3 = lVar2;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l(c0Var, lVar, dVar, z10, l0Var, h2Var, g2Var, z11, i10, i11, q0Var, lVar3, mVar, i2Var, bVar, i12);
        }
    }
}
