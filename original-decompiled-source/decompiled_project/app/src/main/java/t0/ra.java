package t0;

import android.view.View;
import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26895a = 16;

    /* JADX WARN: Removed duplicated region for block: B:101:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, eh.p pVar, eh.p pVar2, eh.p pVar3, eh.p pVar4, int i10, long j10, long j11, z.u1 u1Var, f1.b bVar, x0.j jVar, int i11, int i12) {
        eh.p pVar5;
        int i13;
        eh.p pVar6;
        int i14;
        eh.p pVar7;
        long j12;
        z.u1 u1Var2;
        int i15;
        eh.p pVar8;
        eh.p pVar9;
        eh.p pVar10;
        long j13;
        int i16;
        int i17;
        int i18;
        long j14;
        eh.p pVar11;
        long j15;
        androidx.compose.ui.d dVar2;
        int i19;
        int i20;
        boolean z10;
        Object objG;
        u0.t0 t0Var;
        boolean zK;
        Object objG2;
        x0.k kVar;
        z.u1 u1Var3;
        int i21;
        long j16;
        long j17;
        x0.h2 h2VarV;
        int i22;
        x0.k kVarP = jVar.p(-1219521777);
        int i23 = i11 | 6;
        int i24 = i12 & 2;
        if (i24 != 0) {
            i23 = i11 | 54;
        } else {
            if ((i11 & 48) == 0) {
                pVar5 = pVar;
                i23 |= kVarP.l(pVar5) ? 32 : 16;
            }
            i13 = i12 & 4;
            if (i13 == 0) {
                i23 |= 384;
            } else {
                if ((i11 & 384) == 0) {
                    pVar6 = pVar2;
                    i23 |= kVarP.l(pVar6) ? 256 : 128;
                }
                int i25 = i23 | 3072;
                i14 = i12 & 16;
                if (i14 != 0) {
                    i25 = i23 | 27648;
                } else {
                    if ((i11 & 24576) == 0) {
                        pVar7 = pVar4;
                        i25 |= kVarP.l(pVar7) ? 16384 : 8192;
                    }
                    int i26 = i25 | 196608;
                    if ((1572864 & i11) != 0) {
                        if ((i12 & 64) == 0) {
                            j12 = j10;
                            if (kVarP.j(j12)) {
                                i22 = PKIFailureInfo.badCertTemplate;
                            }
                            i26 |= i22;
                        } else {
                            j12 = j10;
                        }
                        i22 = PKIFailureInfo.signerNotTrusted;
                        i26 |= i22;
                    } else {
                        j12 = j10;
                    }
                    int i27 = i26 | 4194304;
                    if ((i12 & 256) != 0) {
                        u1Var2 = u1Var;
                        int i28 = kVarP.K(u1Var2) ? 67108864 : 33554432;
                        i15 = i27 | i28;
                        if ((306783379 & i15) == 306783378 && kVarP.s()) {
                            kVarP.v();
                            pVar10 = pVar3;
                            i21 = i10;
                            kVar = kVarP;
                            pVar8 = pVar5;
                            pVar9 = pVar6;
                            j16 = j12;
                            u1Var3 = u1Var2;
                            j17 = j11;
                            pVar11 = pVar7;
                            dVar2 = dVar;
                        } else {
                            kVarP.r0();
                            if ((i11 & 1) != 0 || kVarP.a0()) {
                                pVar8 = i24 == 0 ? l2.f26346a : pVar5;
                                pVar9 = i13 == 0 ? l2.f26347b : pVar6;
                                pVar10 = l2.f26348c;
                                if (i14 != 0) {
                                    pVar7 = l2.f26349d;
                                }
                                if ((i12 & 64) == 0) {
                                    j13 = ((e2) kVarP.f(f2.f25858a)).f25768n;
                                    i15 &= -3670017;
                                } else {
                                    j13 = j12;
                                }
                                long jB = f2.b(j13, kVarP);
                                int i29 = i15 & (-29360129);
                                i16 = i12 & 256;
                                i17 = 2;
                                d.a aVar = d.a.f1143b;
                                if (i16 == 0) {
                                    WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                                    i18 = i15 & (-264241153);
                                    u1Var2 = x1.a.c(kVarP).f34673g;
                                } else {
                                    i18 = i29;
                                }
                                j14 = jB;
                                pVar11 = pVar7;
                                j15 = j13;
                                dVar2 = aVar;
                            } else {
                                kVarP.v();
                                if ((i12 & 64) != 0) {
                                    i15 &= -3670017;
                                }
                                int i30 = i15 & (-29360129);
                                if ((i12 & 256) != 0) {
                                    i30 = i15 & (-264241153);
                                }
                                pVar10 = pVar3;
                                i17 = i10;
                                j14 = j11;
                                i18 = i30;
                                pVar8 = pVar5;
                                pVar9 = pVar6;
                                j15 = j12;
                                pVar11 = pVar7;
                                dVar2 = dVar;
                            }
                            kVarP.U();
                            i19 = (234881024 & i18) ^ 100663296;
                            if (i19 > 67108864 || !kVarP.K(u1Var2)) {
                                i20 = 100663296;
                                if ((i18 & 100663296) != 67108864) {
                                    z10 = false;
                                }
                                objG = kVarP.g();
                                j.a.C0321a c0321a = j.a.f31715a;
                                if (z10 || objG == c0321a) {
                                    objG = new u0.t0(u1Var2);
                                    kVarP.C(objG);
                                }
                                t0Var = (u0.t0) objG;
                                zK = ((i19 <= 67108864 && kVarP.K(u1Var2)) || (i18 & i20) == 67108864) | kVarP.K(t0Var);
                                objG2 = kVarP.g();
                                if (zK || objG2 == c0321a) {
                                    objG2 = new ja(t0Var, u1Var2);
                                    kVarP.C(objG2);
                                }
                                h2.i<z.u1> iVar = z.y1.f34693a;
                                kVar = kVarP;
                                md.a(androidx.compose.ui.c.a(dVar2, j2.c3.f14686a, new z.z1((eh.l) objG2)), null, j15, j14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1979205334, new ka(i17, pVar8, bVar, pVar10, pVar11, t0Var, pVar9), kVarP), kVar, ((i18 >> 12) & 896) | 12582912, 114);
                                u1Var3 = u1Var2;
                                i21 = i17;
                                j16 = j15;
                                j17 = j14;
                            } else {
                                i20 = 100663296;
                            }
                            z10 = true;
                            objG = kVarP.g();
                            j.a.C0321a c0321a2 = j.a.f31715a;
                            if (z10) {
                                objG = new u0.t0(u1Var2);
                                kVarP.C(objG);
                                t0Var = (u0.t0) objG;
                                if (i19 <= 67108864) {
                                    zK = ((i19 <= 67108864 && kVarP.K(u1Var2)) || (i18 & i20) == 67108864) | kVarP.K(t0Var);
                                    objG2 = kVarP.g();
                                    if (zK) {
                                        objG2 = new ja(t0Var, u1Var2);
                                        kVarP.C(objG2);
                                        h2.i<z.u1> iVar2 = z.y1.f34693a;
                                        kVar = kVarP;
                                        md.a(androidx.compose.ui.c.a(dVar2, j2.c3.f14686a, new z.z1((eh.l) objG2)), null, j15, j14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1979205334, new ka(i17, pVar8, bVar, pVar10, pVar11, t0Var, pVar9), kVarP), kVar, ((i18 >> 12) & 896) | 12582912, 114);
                                        u1Var3 = u1Var2;
                                        i21 = i17;
                                        j16 = j15;
                                        j17 = j14;
                                    }
                                } else {
                                    zK = ((i19 <= 67108864 && kVarP.K(u1Var2)) || (i18 & i20) == 67108864) | kVarP.K(t0Var);
                                    objG2 = kVarP.g();
                                    if (zK) {
                                    }
                                }
                            }
                        }
                        h2VarV = kVar.V();
                        if (h2VarV != null) {
                            h2VarV.f31703d = new la(dVar2, pVar8, pVar9, pVar10, pVar11, i21, j16, j17, u1Var3, bVar, i11, i12);
                            return;
                        }
                        return;
                    }
                    u1Var2 = u1Var;
                    i15 = i27 | i28;
                    if ((306783379 & i15) == 306783378) {
                        kVarP.r0();
                        if ((i11 & 1) != 0) {
                            if (i24 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            pVar10 = l2.f26348c;
                            if (i14 != 0) {
                            }
                            if ((i12 & 64) == 0) {
                            }
                            long jB2 = f2.b(j13, kVarP);
                            int i292 = i15 & (-29360129);
                            i16 = i12 & 256;
                            i17 = 2;
                            d.a aVar2 = d.a.f1143b;
                            if (i16 == 0) {
                            }
                            j14 = jB2;
                            pVar11 = pVar7;
                            j15 = j13;
                            dVar2 = aVar2;
                            kVarP.U();
                            i19 = (234881024 & i18) ^ 100663296;
                            if (i19 > 67108864) {
                                i20 = 100663296;
                                if ((i18 & 100663296) != 67108864) {
                                    z10 = true;
                                }
                                objG = kVarP.g();
                                j.a.C0321a c0321a22 = j.a.f31715a;
                                if (z10) {
                                }
                            }
                        }
                    }
                    h2VarV = kVar.V();
                    if (h2VarV != null) {
                    }
                }
                pVar7 = pVar4;
                int i262 = i25 | 196608;
                if ((1572864 & i11) != 0) {
                }
                int i272 = i262 | 4194304;
                if ((i12 & 256) != 0) {
                }
                i15 = i272 | i28;
                if ((306783379 & i15) == 306783378) {
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                }
            }
            pVar6 = pVar2;
            int i252 = i23 | 3072;
            i14 = i12 & 16;
            if (i14 != 0) {
            }
            pVar7 = pVar4;
            int i2622 = i252 | 196608;
            if ((1572864 & i11) != 0) {
            }
            int i2722 = i2622 | 4194304;
            if ((i12 & 256) != 0) {
            }
            i15 = i2722 | i28;
            if ((306783379 & i15) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        pVar5 = pVar;
        i13 = i12 & 4;
        if (i13 == 0) {
        }
        pVar6 = pVar2;
        int i2522 = i23 | 3072;
        i14 = i12 & 16;
        if (i14 != 0) {
        }
        pVar7 = pVar4;
        int i26222 = i2522 | 196608;
        if ((1572864 & i11) != 0) {
        }
        int i27222 = i26222 | 4194304;
        if ((i12 & 256) != 0) {
        }
        i15 = i27222 | i28;
        if ((306783379 & i15) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    public static final void b(int i10, eh.p pVar, f1.b bVar, eh.p pVar2, eh.p pVar3, z.u1 u1Var, eh.p pVar4, x0.j jVar, int i11) {
        int i12;
        f1.b bVar2;
        z.u1 u1Var2;
        eh.p pVar5;
        x0.k kVarP = jVar.p(-975511942);
        if ((i11 & 6) == 0) {
            i12 = (kVarP.i(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            bVar2 = bVar;
            i12 |= kVarP.l(bVar2) ? 256 : 128;
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= kVarP.l(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= kVarP.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            u1Var2 = u1Var;
            i12 |= kVarP.K(u1Var2) ? 131072 : 65536;
        } else {
            u1Var2 = u1Var;
        }
        if ((1572864 & i11) == 0) {
            pVar5 = pVar4;
            i12 |= kVarP.l(pVar5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            pVar5 = pVar4;
        }
        if ((i12 & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean z10 = ((i12 & 896) == 256) | ((i12 & 112) == 32) | ((i12 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | ((458752 & i12) == 131072) | ((57344 & i12) == 16384) | ((i12 & 14) == 4) | ((3670016 & i12) == 1048576);
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                pa paVar = new pa(pVar, pVar2, pVar3, i10, u1Var2, pVar5, bVar2);
                kVarP.C(paVar);
                objG = paVar;
            }
            g2.p1.a(null, (eh.p) objG, kVarP, 0, 1);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new qa(i10, pVar, bVar, pVar2, pVar3, u1Var, pVar4, i11);
        }
    }
}
