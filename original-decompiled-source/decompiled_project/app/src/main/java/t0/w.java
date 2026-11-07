package t0;

import androidx.compose.ui.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final j3.p0 f27264a = new j3.p0(14);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, eh.a aVar, androidx.compose.ui.d dVar, long j10, t.u1 u1Var, j3.p0 p0Var, q1.f2 f2Var, long j11, float f10, float f11, t.v vVar, f1.b bVar, x0.j jVar, int i10, int i11, int i12) {
        eh.a aVar2;
        androidx.compose.ui.d dVar2;
        q1.f2 f2Var2;
        long jE;
        int i13;
        int i14;
        float f12;
        int i15;
        float f13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.d dVar3;
        t.v vVar2;
        float f14;
        j3.p0 p0Var2;
        t.u1 u1Var2;
        float f15;
        long j12;
        long j13;
        Object objG;
        j.a.C0321a c0321a;
        s.s0 s0Var;
        Object objG2;
        x0.n1 n1Var;
        f3.d dVar4;
        boolean zK;
        Object objG3;
        j3.p0 p0Var3;
        x0.k kVar;
        long j14;
        androidx.compose.ui.d dVar5;
        t.u1 u1Var3;
        long j15;
        float f16;
        float f17;
        t.v vVar3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(1431928300);
        int i21 = (kVarP.c(z10) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            i21 |= kVarP.l(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        int i22 = i12 & 4;
        if (i22 != 0) {
            i21 |= 384;
        } else {
            if ((i10 & 384) == 0) {
                dVar2 = dVar;
                i21 |= kVarP.K(dVar2) ? 256 : 128;
            }
            int i23 = i21 | 207872;
            if ((1572864 & i10) != 0) {
                f2Var2 = f2Var;
                i23 |= kVarP.K(f2Var2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                f2Var2 = f2Var;
            }
            if ((i12 & 128) != 0) {
                jE = j11;
                int i24 = kVarP.j(jE) ? 8388608 : 4194304;
                i13 = i23 | i24;
                i14 = i12 & 256;
                if (i14 != 0) {
                    i13 |= 100663296;
                    f12 = f10;
                } else {
                    f12 = f10;
                    if ((i10 & 100663296) == 0) {
                        i13 |= kVarP.h(f12) ? 67108864 : 33554432;
                    }
                }
                i15 = i12 & 512;
                if (i15 == 0) {
                    f13 = f11;
                    if ((i10 & 805306368) == 0) {
                        i16 = 32;
                        i13 |= kVarP.h(f13) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i17 = i12 & 1024;
                    if (i17 == 0) {
                        i18 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        i18 = i11 | (kVarP.K(vVar) ? 4 : 2);
                    } else {
                        i18 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        i18 |= kVarP.l(bVar) ? i16 : 16;
                    }
                    i19 = i13;
                    if ((i13 & 306783379) != 306783378 && (i18 & 19) == 18 && kVarP.s()) {
                        kVarP.v();
                        j14 = j10;
                        f16 = f12;
                        kVar = kVarP;
                        dVar5 = dVar2;
                        j15 = jE;
                        u1Var3 = u1Var;
                        vVar3 = vVar;
                        f17 = f13;
                        p0Var3 = p0Var;
                    } else {
                        kVarP.r0();
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            androidx.compose.ui.d dVar6 = i22 == 0 ? d.a.f1143b : dVar2;
                            float f18 = 0;
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(f18) << i16) | (Float.floatToRawIntBits(f18) & BodyPartID.bodyIdMax);
                            t.u1 u1VarC = ph.m0.c(kVarP);
                            int i25 = i19 & (-57345);
                            androidx.compose.ui.d dVar7 = dVar6;
                            if ((i12 & 128) == 0) {
                                float f19 = n5.f26502a;
                                float f20 = v0.s.f30477a;
                                jE = f2.e(v0.d.f30254t, kVarP);
                                i20 = i19 & (-29417473);
                            } else {
                                i20 = i25;
                            }
                            float f21 = i14 == 0 ? n5.f26502a : f10;
                            float f22 = i15 == 0 ? n5.f26503b : f13;
                            j3.p0 p0Var4 = f27264a;
                            if (i17 == 0) {
                                dVar3 = dVar7;
                                f14 = f22;
                                p0Var2 = p0Var4;
                                vVar2 = null;
                            } else {
                                dVar3 = dVar7;
                                vVar2 = vVar;
                                f14 = f22;
                                p0Var2 = p0Var4;
                            }
                            u1Var2 = u1VarC;
                            f15 = f21;
                            j12 = jE;
                            j13 = jFloatToRawIntBits;
                        } else {
                            kVarP.v();
                            i20 = i19 & (-57345);
                            if ((i12 & 128) != 0) {
                                i20 = i19 & (-29417473);
                            }
                            u1Var2 = u1Var;
                            p0Var2 = p0Var;
                            vVar2 = vVar;
                            f15 = f12;
                            f14 = f13;
                            dVar3 = dVar2;
                            j12 = jE;
                            j13 = j10;
                        }
                        kVarP.U();
                        objG = kVarP.g();
                        c0321a = j.a.f31715a;
                        if (objG == c0321a) {
                            objG = new s.s0(Boolean.FALSE);
                            kVarP.C(objG);
                        }
                        s0Var = (s.s0) objG;
                        s0Var.f23917c.setValue(Boolean.valueOf(z10));
                        if (!((Boolean) s0Var.f23916b.getValue()).booleanValue() || ((Boolean) s0Var.f23917c.getValue()).booleanValue()) {
                            objG2 = kVarP.g();
                            if (objG2 == c0321a) {
                                objG2 = bg.b.h(new q1.l2(q1.l2.f21718b));
                                kVarP.C(objG2);
                            }
                            n1Var = (x0.n1) objG2;
                            dVar4 = (f3.d) kVarP.f(j2.j2.f14779h);
                            zK = kVarP.K(dVar4);
                            objG3 = kVarP.g();
                            if (!zK || objG3 == c0321a) {
                                objG3 = new u0.f0(j13, dVar4, new u(n1Var));
                                kVarP.C(objG3);
                            }
                            j3.k.a((u0.f0) objG3, aVar2, p0Var2, f1.c.b(2126968933, new s(dVar3, s0Var, n1Var, u1Var2, f2Var2, j12, f15, f14, vVar2, bVar), kVarP), kVarP, (i20 & 112) | 3456, 0);
                        }
                        p0Var3 = p0Var2;
                        kVar = kVarP;
                        j14 = j13;
                        dVar5 = dVar3;
                        u1Var3 = u1Var2;
                        j15 = j12;
                        f16 = f15;
                        f17 = f14;
                        vVar3 = vVar2;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new t(z10, aVar, dVar5, j14, u1Var3, p0Var3, f2Var, j15, f16, f17, vVar3, bVar, i10, i11, i12);
                        return;
                    }
                    return;
                }
                i13 |= 805306368;
                f13 = f11;
                i16 = 32;
                i17 = i12 & 1024;
                if (i17 == 0) {
                }
                if ((i11 & 48) == 0) {
                }
                i19 = i13;
                if ((i13 & 306783379) != 306783378) {
                    kVarP.r0();
                    if ((i10 & 1) != 0) {
                        if (i22 == 0) {
                        }
                        float f182 = 0;
                        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f182) << i16) | (Float.floatToRawIntBits(f182) & BodyPartID.bodyIdMax);
                        t.u1 u1VarC2 = ph.m0.c(kVarP);
                        int i252 = i19 & (-57345);
                        androidx.compose.ui.d dVar72 = dVar6;
                        if ((i12 & 128) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        j3.p0 p0Var42 = f27264a;
                        if (i17 == 0) {
                        }
                        u1Var2 = u1VarC2;
                        f15 = f21;
                        j12 = jE;
                        j13 = jFloatToRawIntBits2;
                        kVarP.U();
                        objG = kVarP.g();
                        c0321a = j.a.f31715a;
                        if (objG == c0321a) {
                        }
                        s0Var = (s.s0) objG;
                        s0Var.f23917c.setValue(Boolean.valueOf(z10));
                        if (!((Boolean) s0Var.f23916b.getValue()).booleanValue()) {
                            objG2 = kVarP.g();
                            if (objG2 == c0321a) {
                            }
                            n1Var = (x0.n1) objG2;
                            dVar4 = (f3.d) kVarP.f(j2.j2.f14779h);
                            zK = kVarP.K(dVar4);
                            objG3 = kVarP.g();
                            if (!zK) {
                                objG3 = new u0.f0(j13, dVar4, new u(n1Var));
                                kVarP.C(objG3);
                                j3.k.a((u0.f0) objG3, aVar2, p0Var2, f1.c.b(2126968933, new s(dVar3, s0Var, n1Var, u1Var2, f2Var2, j12, f15, f14, vVar2, bVar), kVarP), kVarP, (i20 & 112) | 3456, 0);
                                p0Var3 = p0Var2;
                                kVar = kVarP;
                                j14 = j13;
                                dVar5 = dVar3;
                                u1Var3 = u1Var2;
                                j15 = j12;
                                f16 = f15;
                                f17 = f14;
                                vVar3 = vVar2;
                            }
                        }
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            } else {
                jE = j11;
            }
            i13 = i23 | i24;
            i14 = i12 & 256;
            if (i14 != 0) {
            }
            i15 = i12 & 512;
            if (i15 == 0) {
            }
            i16 = 32;
            i17 = i12 & 1024;
            if (i17 == 0) {
            }
            if ((i11 & 48) == 0) {
            }
            i19 = i13;
            if ((i13 & 306783379) != 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        int i232 = i21 | 207872;
        if ((1572864 & i10) != 0) {
        }
        if ((i12 & 128) != 0) {
        }
        i13 = i232 | i24;
        i14 = i12 & 256;
        if (i14 != 0) {
        }
        i15 = i12 & 512;
        if (i15 == 0) {
        }
        i16 = 32;
        i17 = i12 & 1024;
        if (i17 == 0) {
        }
        if ((i11 & 48) == 0) {
        }
        i19 = i13;
        if ((i13 & 306783379) != 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(eh.p pVar, eh.a aVar, androidx.compose.ui.d dVar, eh.p pVar2, eh.p pVar3, boolean z10, o5 o5Var, z.f1 f1Var, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        eh.p pVar4;
        int i14;
        boolean z11;
        int i15;
        o5 o5Var2;
        int i16;
        o5 o5Var3;
        int i17;
        androidx.compose.ui.d dVar3;
        z.f1 f1Var2;
        o5 o5Var4;
        boolean z12;
        eh.p pVar5;
        x0.k kVar;
        boolean z13;
        o5 o5Var5;
        z.f1 f1Var3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(1826340448);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else {
            if ((i10 & 384) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= kVarP.l(pVar2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 == 0) {
                i12 |= 24576;
            } else {
                if ((i10 & 24576) == 0) {
                    pVar4 = pVar3;
                    i12 |= kVarP.l(pVar4) ? 16384 : 8192;
                }
                i14 = i11 & 32;
                if (i14 == 0) {
                    if ((196608 & i10) == 0) {
                        z11 = z10;
                        i12 |= kVarP.c(z11) ? 131072 : 65536;
                    }
                    if ((1572864 & i10) == 0) {
                        i12 |= PKIFailureInfo.signerNotTrusted;
                    }
                    i15 = i12 | 113246208;
                    if ((38347923 & i15) == 38347922 || !kVarP.s()) {
                        kVarP.r0();
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            androidx.compose.ui.d dVar4 = i18 == 0 ? d.a.f1143b : dVar2;
                            if (i13 != 0) {
                                pVar4 = null;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            }
                            float f10 = n5.f26502a;
                            e2 e2Var = (e2) kVarP.f(f2.f25858a);
                            o5Var2 = e2Var.X;
                            if (o5Var2 != null) {
                                i16 = -3670017;
                                o5Var3 = new o5(f2.d(e2Var, v0.r.f30466i), f2.d(e2Var, v0.r.f30468k), f2.d(e2Var, v0.r.f30474q), q1.b1.c(v0.r.f30461d, f2.d(e2Var, v0.r.f30460c)), q1.b1.c(v0.r.f30463f, f2.d(e2Var, v0.r.f30462e)), q1.b1.c(v0.r.f30465h, f2.d(e2Var, v0.r.f30464g)));
                                e2Var.X = o5Var3;
                            } else {
                                i16 = -3670017;
                                o5Var3 = o5Var2;
                            }
                            i17 = i15 & i16;
                            dVar3 = dVar4;
                            f1Var2 = n5.f26504c;
                            o5Var4 = o5Var3;
                            z12 = z11;
                            pVar5 = pVar4;
                        } else {
                            kVarP.v();
                            i17 = i15 & (-3670017);
                            o5Var4 = o5Var;
                            f1Var2 = f1Var;
                            dVar3 = dVar2;
                            pVar5 = pVar4;
                            z12 = z11;
                        }
                        kVarP.U();
                        kVar = kVarP;
                        z5.b(pVar, aVar, dVar3, pVar2, pVar5, z12, o5Var4, f1Var2, kVar, i17 & 268435454);
                        dVar2 = dVar3;
                        pVar4 = pVar5;
                        z13 = z12;
                        o5Var5 = o5Var4;
                        f1Var3 = f1Var2;
                    } else {
                        kVarP.v();
                        f1Var3 = f1Var;
                        kVar = kVarP;
                        z13 = z11;
                        o5Var5 = o5Var;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new v(pVar, aVar, dVar2, pVar2, pVar4, z13, o5Var5, f1Var3, i10, i11);
                        return;
                    }
                    return;
                }
                i12 |= 196608;
                z11 = z10;
                if ((1572864 & i10) == 0) {
                }
                i15 = i12 | 113246208;
                if ((38347923 & i15) == 38347922) {
                    kVarP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        float f102 = n5.f26502a;
                        e2 e2Var2 = (e2) kVarP.f(f2.f25858a);
                        o5Var2 = e2Var2.X;
                        if (o5Var2 != null) {
                        }
                        i17 = i15 & i16;
                        dVar3 = dVar4;
                        f1Var2 = n5.f26504c;
                        o5Var4 = o5Var3;
                        z12 = z11;
                        pVar5 = pVar4;
                        kVarP.U();
                        kVar = kVarP;
                        z5.b(pVar, aVar, dVar3, pVar2, pVar5, z12, o5Var4, f1Var2, kVar, i17 & 268435454);
                        dVar2 = dVar3;
                        pVar4 = pVar5;
                        z13 = z12;
                        o5Var5 = o5Var4;
                        f1Var3 = f1Var2;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            pVar4 = pVar3;
            i14 = i11 & 32;
            if (i14 == 0) {
            }
            z11 = z10;
            if ((1572864 & i10) == 0) {
            }
            i15 = i12 | 113246208;
            if ((38347923 & i15) == 38347922) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        if ((i10 & 3072) == 0) {
        }
        i13 = i11 & 16;
        if (i13 == 0) {
        }
        pVar4 = pVar3;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        z11 = z10;
        if ((1572864 & i10) == 0) {
        }
        i15 = i12 | 113246208;
        if ((38347923 & i15) == 38347922) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
