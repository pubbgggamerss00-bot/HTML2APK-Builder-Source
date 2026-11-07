package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class dk2 extends fk2 {
    @Override // com.google.android.gms.internal.ads.fk2
    public final gk2 e(pa2[] pa2VarArr, ui2 ui2Var, oh2 oh2Var, zy zyVar) {
        boolean z6;
        int[] iArr;
        ui2 ui2Var2 = ui2Var;
        int[] iArr2 = new int[3];
        a00[][] a00VarArr = new a00[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = ui2Var2.f9567a;
            a00VarArr[i6] = new a00[i7];
            iArr3[i6] = new int[i7][];
        }
        int i8 = 2;
        int[] iArr4 = new int[2];
        for (int i9 = 0; i9 < 2; i9++) {
            iArr4[i9] = pa2VarArr[i9].r();
        }
        int i10 = 0;
        while (i10 < ui2Var2.f9567a) {
            a00 a00VarA = ui2Var2.a(i10);
            int i11 = a00VarA.f2533c;
            w[] wVarArr = a00VarA.f2534d;
            int i12 = a00VarA.f2531a;
            int i13 = i8;
            int i14 = 0;
            int i15 = 0;
            boolean z7 = true;
            while (i14 < i8) {
                pa2 pa2Var = pa2VarArr[i14];
                int iMax = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    iMax = Math.max(iMax, pa2Var.o(wVarArr[i16]) & 7);
                }
                boolean z8 = iArr2[i14] == 0;
                if (iMax > i15) {
                    z7 = z8;
                } else if (iMax == i15 && i11 == 5 && !z7 && z8) {
                    z7 = true;
                } else {
                    i14++;
                    i8 = 2;
                }
                i15 = iMax;
                i13 = i14;
                i14++;
                i8 = 2;
            }
            if (i13 == i8) {
                iArr = new int[i12];
            } else {
                pa2 pa2Var2 = pa2VarArr[i13];
                int[] iArr5 = new int[i12];
                for (int i17 = 0; i17 < i12; i17++) {
                    iArr5[i17] = pa2Var2.o(wVarArr[i17]);
                }
                iArr = iArr5;
            }
            int i18 = iArr2[i13];
            a00VarArr[i13][i18] = a00VarA;
            iArr3[i13][i18] = iArr;
            iArr2[i13] = i18 + 1;
            i10++;
            ui2Var2 = ui2Var;
            i8 = 2;
        }
        int i19 = i8;
        ui2[] ui2VarArr = new ui2[i19];
        String[] strArr = new String[i19];
        int[] iArr6 = new int[i19];
        int i20 = 0;
        while (i20 < i19) {
            int i21 = iArr2[i20];
            ui2VarArr[i20] = new ui2((a00[]) j31.f(a00VarArr[i20], i21));
            iArr3[i20] = (int[][]) j31.f(iArr3[i20], i21);
            strArr[i20] = pa2VarArr[i20].k();
            iArr6[i20] = pa2VarArr[i20].f8008t;
            i20++;
            i19 = 2;
        }
        int i22 = i19;
        ck2 ck2Var = new ck2(iArr6, ui2VarArr, iArr4, iArr3, new ui2((a00[]) j31.f(a00VarArr[i22], iArr2[i22])));
        Pair pairG = g(ck2Var, iArr3, iArr4);
        ek2[] ek2VarArr = (ek2[]) pairG.second;
        List[] listArr = new List[ek2VarArr.length];
        for (int i23 = 0; i23 < ek2VarArr.length; i23++) {
            ek2 ek2Var = ek2VarArr[i23];
            listArr[i23] = ek2Var != null ? bo1.n(ek2Var) : cp1.f3636w;
        }
        yn1 yn1Var = new yn1();
        int i24 = 0;
        while (i24 < 2) {
            ui2 ui2Var3 = ui2VarArr[i24];
            List list = listArr[i24];
            int i25 = 0;
            while (i25 < ui2Var3.f9567a) {
                a00 a00VarA2 = ui2Var3.a(i25);
                int i26 = a00VarA2.f2531a;
                int i27 = ui2VarArr[i24].a(i25).f2531a;
                int[] iArr7 = new int[i27];
                int i28 = 0;
                int i29 = 0;
                while (i29 < i27) {
                    List[] listArr2 = listArr;
                    int i30 = i24;
                    if ((iArr3[i24][i25][i29] & 7) == 4) {
                        iArr7[i28] = i29;
                        i28++;
                    }
                    i29++;
                    listArr = listArr2;
                    i24 = i30;
                }
                List[] listArr3 = listArr;
                int i31 = i24;
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i28);
                String str = null;
                int iMin = 16;
                ui2[] ui2VarArr2 = ui2VarArr;
                int i32 = 0;
                boolean z9 = false;
                int i33 = 0;
                while (i32 < iArrCopyOf.length) {
                    int[] iArr8 = iArrCopyOf;
                    String str2 = ui2VarArr2[i31].a(i25).f2534d[iArrCopyOf[i32]].f9978m;
                    int i34 = i33 + 1;
                    if (i33 == 0) {
                        str = str2;
                    } else {
                        z9 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, iArr3[i31][i25][i32] & 24);
                    i32++;
                    i33 = i34;
                    iArrCopyOf = iArr8;
                }
                if (z9) {
                    iMin = Math.min(iMin, ck2Var.f3616c[i31]);
                }
                boolean z10 = iMin != 0;
                int[] iArr9 = new int[i26];
                boolean[] zArr = new boolean[i26];
                for (int i35 = 0; i35 < i26; i35++) {
                    iArr9[i35] = iArr3[i31][i25][i35] & 7;
                    int i36 = 0;
                    while (true) {
                        if (i36 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        ek2 ek2Var2 = (ek2) list.get(i36);
                        if (ek2Var2.zzg().equals(a00VarA2) && ek2Var2.b(i35) != -1) {
                            z6 = true;
                            break;
                        }
                        i36++;
                    }
                    zArr[i35] = z6;
                }
                yn1Var.q(new b50(a00VarA2, z10, iArr9, zArr));
                i25++;
                listArr = listArr3;
                ui2VarArr = ui2VarArr2;
                i24 = i31;
            }
            i24++;
        }
        int i37 = 0;
        while (true) {
            ui2 ui2Var4 = ck2Var.f3617d;
            if (i37 >= ui2Var4.f9567a) {
                return new gk2((rc2[]) pairG.first, (ak2[]) pairG.second, new w50(yn1Var.t()), ck2Var);
            }
            a00 a00VarA3 = ui2Var4.a(i37);
            int i38 = a00VarA3.f2531a;
            int[] iArr10 = new int[i38];
            Arrays.fill(iArr10, 0);
            yn1Var.q(new b50(a00VarA3, false, iArr10, new boolean[i38]));
            i37++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fk2
    public final void f(Object obj) {
    }

    public abstract Pair g(ck2 ck2Var, int[][][] iArr, int[] iArr2);
}
