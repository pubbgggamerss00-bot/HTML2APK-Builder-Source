package com.google.crypto.tink.shaded.protobuf;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* loaded from: classes2.dex */
public final class l1 {
    public static String a(h hVar) {
        StringBuilder sb = new StringBuilder(hVar.size());
        for (int i10 = 0; i10 < hVar.size(); i10++) {
            byte bA = hVar.a(i10);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bA);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final g2.m0 b(z.i1 i1Var, int i10, int i11, int i12, int i13, int i14, g2.o0 o0Var, List list, g2.g1[] g1VarArr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        float f10;
        long j10;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j11 = i14;
        int i22 = i16 - i15;
        int[] iArr2 = new int[i22];
        int i23 = i15;
        int iMax = 0;
        int i24 = 0;
        int i25 = 0;
        int iMin = 0;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (i23 < i16) {
            g2.k0 k0Var = (g2.k0) list2.get(i23);
            float fD = b8.n.d(b8.n.c(k0Var));
            if (fD > CropImageView.DEFAULT_ASPECT_RATIO) {
                f11 += fD;
                i24++;
                j10 = j11;
                i19 = i23;
            } else {
                int i26 = i12 - i25;
                g2.g1 g1VarP = g1VarArr[i23];
                j10 = j11;
                if (g1VarP == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i24;
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i19 = i23;
                        i20 = i24;
                        i21 = i26 < 0 ? 0 : i26;
                    }
                    g1VarP = k0Var.P(i1Var.e(0, i21, i13, false));
                } else {
                    i19 = i23;
                    i20 = i24;
                }
                g2.g1 g1Var = g1VarP;
                int iJ = i1Var.j(g1Var);
                int iB = i1Var.b(g1Var);
                iArr2[i19 - i15] = iJ;
                int i27 = i26 - iJ;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i14, i27);
                i25 += iJ + iMin;
                iMax = Math.max(iMax, iB);
                g1VarArr[i19] = g1Var;
                i24 = i20;
            }
            i23 = i19 + 1;
            j11 = j10;
        }
        long j12 = j11;
        if (i24 == 0) {
            i25 -= iMin;
            i18 = 0;
        } else {
            long j13 = (r22 - 1) * j12;
            long jRound = ((i12 != Integer.MAX_VALUE ? i12 : i10) - i25) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i28 = i15; i28 < i16; i28++) {
                jRound -= Math.round(b8.n.d(b8.n.c((g2.k0) list2.get(i28))) * f12);
            }
            int i29 = i15;
            int i30 = iMax;
            int i31 = 0;
            while (i29 < i16) {
                if (g1VarArr[i29] == null) {
                    g2.k0 k0Var2 = (g2.k0) list2.get(i29);
                    f10 = f12;
                    z.j1 j1VarC = b8.n.c(k0Var2);
                    float fD2 = b8.n.d(j1VarC);
                    if (fD2 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                        a0.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j14 = jRound - iSignum;
                    int iMax2 = Math.max(0, Math.round(fD2 * f10) + iSignum);
                    g2.g1 g1VarP2 = k0Var2.P(i1Var.e((!(j1VarC != null ? j1VarC.f34558b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iJ2 = i1Var.j(g1VarP2);
                    int iB2 = i1Var.b(g1VarP2);
                    iArr2[i29 - i15] = iJ2;
                    i31 += iJ2;
                    int iMax3 = Math.max(i30, iB2);
                    g1VarArr[i29] = g1VarP2;
                    i30 = iMax3;
                    jRound = j14;
                } else {
                    f10 = f12;
                }
                i29++;
                list2 = list;
                f12 = f10;
            }
            i18 = (int) (i31 + j13);
            int i32 = i12 - i25;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i32) {
                i18 = i32;
            }
            iMax = i30;
        }
        int i33 = i18 + i25;
        if (i33 < 0) {
            i33 = 0;
        }
        int iMax4 = Math.max(i33, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr3 = new int[i22];
        i1Var.d(iMax4, iArr2, iArr3, o0Var);
        return i1Var.a(g1VarArr, o0Var, iArr3, iMax4, iMax5, iArr, i17, i15, i16);
    }
}
