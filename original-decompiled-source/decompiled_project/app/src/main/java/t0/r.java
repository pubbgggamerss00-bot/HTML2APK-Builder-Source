package t0;

import androidx.compose.ui.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class r {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, eh.p pVar, eh.p pVar2, eh.p pVar3, eh.p pVar4, q1.f2 f2Var, long j10, long j11, long j12, long j13, float f10, j3.d0 d0Var, x0.j jVar, int i10, int i11, int i12) {
        int i13;
        eh.p pVar5;
        int i14;
        eh.p pVar6;
        long jE;
        int i15;
        int i16;
        q1.f2 f2VarA;
        long jE2;
        long jE3;
        j3.d0 d0Var2;
        eh.p pVar7;
        long j14;
        long j15;
        q1.f2 f2Var2;
        int i17;
        float f11;
        long j16;
        androidx.compose.ui.d dVar2;
        long j17;
        x0.k kVar;
        androidx.compose.ui.d dVar3;
        eh.p pVar8;
        q1.f2 f2Var3;
        long j18;
        long j19;
        long j20;
        long j21;
        float f12;
        j3.d0 d0Var3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-2081346864);
        if ((i10 & 6) == 0) {
            i13 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= kVarP.l(bVar) ? 32 : 16;
        }
        int i18 = i13 | 384;
        int i19 = i12 & 8;
        if (i19 != 0) {
            i18 = i13 | 3456;
        } else {
            if ((i10 & 3072) == 0) {
                pVar5 = pVar;
                i18 |= kVarP.l(pVar5) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar6 = pVar2;
                    i18 |= kVarP.l(pVar6) ? 16384 : 8192;
                }
                if ((196608 & i10) == 0) {
                    i18 |= kVarP.l(pVar3) ? 131072 : 65536;
                }
                if ((1572864 & i10) == 0) {
                    i18 |= kVarP.l(pVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if ((i10 & 12582912) == 0) {
                    i18 |= ((i12 & 128) == 0 && kVarP.K(f2Var)) ? 8388608 : 4194304;
                }
                if ((i10 & 100663296) == 0) {
                    jE = j10;
                    i18 |= ((i12 & 256) == 0 && kVarP.j(jE)) ? 67108864 : 33554432;
                } else {
                    jE = j10;
                }
                if ((i10 & 805306368) == 0) {
                    i18 |= 268435456;
                }
                if ((i11 & 6) == 0) {
                    i15 = i11 | (((i12 & 1024) == 0 && kVarP.j(j12)) ? 4 : 2);
                } else {
                    i15 = i11;
                }
                if ((i11 & 48) == 0) {
                    i15 |= ((i12 & 2048) == 0 && kVarP.j(j13)) ? 32 : 16;
                }
                i16 = i15 | 3456;
                if ((306783379 & i18) == 306783378 && (i16 & 1171) == 1170 && kVarP.s()) {
                    kVarP.v();
                    dVar3 = dVar;
                    j19 = j11;
                    j21 = j13;
                    f12 = f10;
                    d0Var3 = d0Var;
                    kVar = kVarP;
                    j18 = jE;
                    pVar8 = pVar6;
                    f2Var3 = f2Var;
                    j20 = j12;
                } else {
                    kVarP.r0();
                    if ((i10 & 1) != 0 || kVarP.a0()) {
                        if (i19 != 0) {
                            pVar5 = null;
                        }
                        if (i14 != 0) {
                            pVar6 = null;
                        }
                        if ((i12 & 128) == 0) {
                            float f13 = a.f25428a;
                            f2VarA = ab.a(v0.e.f30264a, kVarP);
                            i18 &= -29360129;
                        } else {
                            f2VarA = f2Var;
                        }
                        if ((i12 & 256) != 0) {
                            float f14 = a.f25428a;
                            v0.c0 c0Var = v0.e.f30264a;
                            jE = f2.e(v0.d.f30255v, kVarP);
                            i18 &= -234881025;
                        }
                        float f15 = a.f25428a;
                        long jE4 = f2.e(v0.e.f30269f, kVarP);
                        int i20 = (-1879048193) & i18;
                        if ((i12 & 1024) == 0) {
                            jE2 = f2.e(v0.e.f30265b, kVarP);
                            i16 &= -15;
                        } else {
                            jE2 = j12;
                        }
                        if ((i12 & 2048) == 0) {
                            jE3 = f2.e(v0.e.f30267d, kVarP);
                            i16 &= -113;
                        } else {
                            jE3 = j13;
                        }
                        float f16 = a.f25428a;
                        d0Var2 = new j3.d0(7);
                        pVar7 = pVar6;
                        j14 = jE2;
                        j15 = jE3;
                        f2Var2 = f2VarA;
                        i17 = i20;
                        f11 = f16;
                        j16 = jE4;
                        dVar2 = d.a.f1143b;
                        j17 = jE;
                        i16 = i16;
                    } else {
                        kVarP.v();
                        if ((i12 & 128) != 0) {
                            i18 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i18 &= -234881025;
                        }
                        i17 = i18 & (-1879048193);
                        if ((i12 & 1024) != 0) {
                            i16 &= -15;
                        }
                        if ((i12 & 2048) != 0) {
                            i16 &= -113;
                        }
                        dVar2 = dVar;
                        f2Var2 = f2Var;
                        j14 = j12;
                        j15 = j13;
                        f11 = f10;
                        d0Var2 = d0Var;
                        j17 = jE;
                        pVar7 = pVar6;
                        j16 = j11;
                    }
                    kVarP.U();
                    kVar = kVarP;
                    p.c(aVar, bVar, dVar2, pVar5, pVar7, pVar3, pVar4, f2Var2, j17, j16, j14, j15, f11, d0Var2, kVar, i17 & 2147483646, i16 & 8190);
                    dVar3 = dVar2;
                    pVar8 = pVar7;
                    f2Var3 = f2Var2;
                    j18 = j17;
                    j19 = j16;
                    j20 = j14;
                    j21 = j15;
                    f12 = f11;
                    d0Var3 = d0Var2;
                }
                eh.p pVar9 = pVar5;
                h2VarV = kVar.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new q(aVar, bVar, dVar3, pVar9, pVar8, pVar3, pVar4, f2Var3, j18, j19, j20, j21, f12, d0Var3, i10, i11, i12);
                    return;
                }
                return;
            }
            i18 |= 24576;
            pVar6 = pVar2;
            if ((196608 & i10) == 0) {
            }
            if ((1572864 & i10) == 0) {
            }
            if ((i10 & 12582912) == 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            if ((i11 & 6) == 0) {
            }
            if ((i11 & 48) == 0) {
            }
            i16 = i15 | 3456;
            if ((306783379 & i18) == 306783378) {
                kVarP.r0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i12 & 128) == 0) {
                    }
                    if ((i12 & 256) != 0) {
                    }
                    float f152 = a.f25428a;
                    long jE42 = f2.e(v0.e.f30269f, kVarP);
                    int i202 = (-1879048193) & i18;
                    if ((i12 & 1024) == 0) {
                    }
                    if ((i12 & 2048) == 0) {
                    }
                    float f162 = a.f25428a;
                    d0Var2 = new j3.d0(7);
                    pVar7 = pVar6;
                    j14 = jE2;
                    j15 = jE3;
                    f2Var2 = f2VarA;
                    i17 = i202;
                    f11 = f162;
                    j16 = jE42;
                    dVar2 = d.a.f1143b;
                    j17 = jE;
                    i16 = i16;
                    kVarP.U();
                    kVar = kVarP;
                    p.c(aVar, bVar, dVar2, pVar5, pVar7, pVar3, pVar4, f2Var2, j17, j16, j14, j15, f11, d0Var2, kVar, i17 & 2147483646, i16 & 8190);
                    dVar3 = dVar2;
                    pVar8 = pVar7;
                    f2Var3 = f2Var2;
                    j18 = j17;
                    j19 = j16;
                    j20 = j14;
                    j21 = j15;
                    f12 = f11;
                    d0Var3 = d0Var2;
                }
            }
            eh.p pVar92 = pVar5;
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        pVar5 = pVar;
        i14 = i12 & 16;
        if (i14 != 0) {
        }
        pVar6 = pVar2;
        if ((196608 & i10) == 0) {
        }
        if ((1572864 & i10) == 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        if ((i11 & 6) == 0) {
        }
        if ((i11 & 48) == 0) {
        }
        i16 = i15 | 3456;
        if ((306783379 & i18) == 306783378) {
        }
        eh.p pVar922 = pVar5;
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }
}
