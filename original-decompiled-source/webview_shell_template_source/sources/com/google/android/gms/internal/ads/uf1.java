package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uf1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9551a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f9552b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9553c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f9554d = new int[10];

    public static int a(byte[] bArr, int i6, int i7, boolean[] zArr) {
        int i8 = i7 - i6;
        y5.r(i8 >= 0);
        if (i8 == 0) {
            return i7;
        }
        if (zArr[0]) {
            f(zArr);
            return i6 - 3;
        }
        if (i8 > 1 && zArr[1] && bArr[i6] == 1) {
            f(zArr);
            return i6 - 2;
        }
        if (i8 > 2 && zArr[2] && bArr[i6] == 0 && bArr[i6 + 1] == 1) {
            f(zArr);
            return i6 - 1;
        }
        int i9 = i7 - 1;
        int i10 = i6 + 2;
        while (i10 < i9) {
            byte b7 = bArr[i10];
            if ((b7 & 254) == 0) {
                int i11 = i10 - 2;
                if (bArr[i11] == 0 && bArr[i10 - 1] == 0 && b7 == 1) {
                    f(zArr);
                    return i11;
                }
                i10 = i11;
            }
            i10 += 3;
        }
        zArr[0] = i8 <= 2 ? !(i8 != 2 ? !(zArr[1] && bArr[i9] == 1) : !(zArr[2] && bArr[i7 + (-2)] == 0 && bArr[i9] == 1)) : bArr[i7 + (-3)] == 0 && bArr[i7 + (-2)] == 0 && bArr[i9] == 1;
        zArr[1] = i8 <= 1 ? zArr[2] && bArr[i9] == 0 : bArr[i7 + (-2)] == 0 && bArr[i9] == 0;
        zArr[2] = bArr[i9] == 0;
        return i7;
    }

    public static int b(int i6, byte[] bArr) {
        int i7;
        synchronized (f9553c) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i6) {
                while (true) {
                    try {
                        if (i8 >= i6 - 2) {
                            i8 = i6;
                            break;
                        }
                        int i10 = i8 + 1;
                        if (bArr[i8] == 0 && bArr[i10] == 0 && bArr[i8 + 2] == 3) {
                            break;
                        }
                        i8 = i10;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i8 < i6) {
                    int[] iArr = f9554d;
                    int length = iArr.length;
                    if (length <= i9) {
                        f9554d = Arrays.copyOf(iArr, length + length);
                    }
                    f9554d[i9] = i8;
                    i8 += 3;
                    i9++;
                }
            }
            i7 = i6 - i9;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = f9554d[i13] - i11;
                System.arraycopy(bArr, i11, bArr, i12, i14);
                int i15 = i12 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i12 = i15 + 2;
                bArr[i16] = 0;
                i11 += i14 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i12, i7 - i12);
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad1 c(byte[] bArr, int i6, int i7, androidx.fragment.app.f0 f0Var) {
        boolean z6;
        int i8;
        int i9;
        int i10;
        int iG;
        int iG2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iG3;
        int i16;
        float f6;
        int i17;
        int i18;
        int i19;
        int i20;
        int iA;
        int iB;
        ?? r6;
        lo loVar;
        int i21;
        int i22;
        boolean z7;
        int i23;
        s70 s70Var;
        ha1 ha1VarH = h(new lg1(bArr, i6, i7));
        lg1 lg1Var = new lg1(bArr, i6 + 2, i7);
        lg1Var.d(4);
        int iA2 = lg1Var.a(3);
        int i24 = ha1VarH.f5312b;
        boolean z8 = true;
        if (i24 == 0 || iA2 != 7) {
            z6 = false;
        } else {
            iA2 = 7;
            z6 = true;
        }
        if (f0Var != null) {
            bo1 bo1Var = (bo1) f0Var.f1102t;
            i8 = !bo1Var.isEmpty() ? ((z91) bo1Var.get(Math.min(i24, bo1Var.size() - 1))).f11230a : 0;
        }
        wa1 wa1VarI = null;
        if (!z6) {
            lg1Var.c();
            wa1VarI = i(lg1Var, true, iA2, null);
        } else if (f0Var != null) {
            ni0 ni0Var = (ni0) f0Var.s;
            int[] iArr = (int[]) ni0Var.f7448u;
            bo1 bo1Var2 = (bo1) ni0Var.f7447t;
            int i25 = iArr[i8];
            if (bo1Var2.size() > i25) {
                wa1VarI = (wa1) bo1Var2.get(i25);
            }
        }
        wa1 wa1Var = wa1VarI;
        lg1Var.g();
        if (z6) {
            int iA3 = lg1Var.f() ? lg1Var.a(8) : -1;
            if (f0Var != null && (s70Var = (s70) f0Var.f1103u) != null) {
                bo1 bo1Var3 = (bo1) s70Var.f8823t;
                if (iA3 == -1) {
                    iA3 = ((int[]) s70Var.f8824u)[i8];
                }
                if (iA3 != -1 && bo1Var3.size() > iA3) {
                    lb1 lb1Var = (lb1) bo1Var3.get(iA3);
                    int i26 = lb1Var.f6651a;
                    i10 = lb1Var.f6654d;
                    i9 = lb1Var.f6655e;
                    iG = lb1Var.f6652b;
                    iG2 = lb1Var.f6653c;
                }
            }
            i14 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            int iG4 = lg1Var.g();
            if (z6) {
                int iMax = -1;
                for (int i27 = true != lg1Var.f() ? iA2 : 0; i27 <= iA2; i27++) {
                    lg1Var.g();
                    iMax = Math.max(lg1Var.g(), iMax);
                    lg1Var.g();
                }
                i15 = iMax;
            } else {
                i15 = -1;
            }
            lg1Var.g();
            lg1Var.g();
            lg1Var.g();
            lg1Var.g();
            lg1Var.g();
            lg1Var.g();
            if (lg1Var.f()) {
                if (z6 && lg1Var.f()) {
                    lg1Var.d(6);
                } else if (lg1Var.f()) {
                    int i28 = 0;
                    while (i28 < 4) {
                        for (int i29 = 0; i29 < 6; i29 += i28 == 3 ? 3 : 1) {
                            if (lg1Var.f()) {
                                int iMin = Math.min(64, 1 << ((i28 + i28) + 4));
                                if (i28 > 1) {
                                    lg1Var.b();
                                }
                                for (int i30 = 0; i30 < iMin; i30++) {
                                    lg1Var.b();
                                }
                            } else {
                                lg1Var.g();
                            }
                        }
                        i28++;
                    }
                }
            }
            lg1Var.d(2);
            if (lg1Var.f()) {
                lg1Var.d(8);
                lg1Var.g();
                lg1Var.g();
                lg1Var.c();
            }
            iG3 = lg1Var.g();
            int[] iArr2 = new int[0];
            int[] iArrCopyOf = new int[0];
            i16 = 0;
            int i31 = -1;
            int i32 = -1;
            while (i16 < iG3) {
                if (i16 == 0 || !lg1Var.f()) {
                    i21 = iG3;
                    i22 = i8;
                    z7 = z8;
                    int iG5 = lg1Var.g();
                    int iG6 = lg1Var.g();
                    int[] iArr3 = new int[iG5];
                    int i33 = 0;
                    while (i33 < iG5) {
                        iArr3[i33] = (i33 > 0 ? iArr3[i33 - 1] : 0) - (lg1Var.g() + 1);
                        lg1Var.c();
                        i33++;
                    }
                    int[] iArr4 = new int[iG6];
                    int i34 = 0;
                    while (i34 < iG6) {
                        iArr4[i34] = lg1Var.g() + 1 + (i34 > 0 ? iArr4[i34 - 1] : 0);
                        lg1Var.c();
                        i34++;
                    }
                    i32 = iG5;
                    iArr2 = iArr3;
                    iArrCopyOf = iArr4;
                    i31 = iG6;
                } else {
                    z7 = z8;
                    int i35 = i32 + i31;
                    boolean zF = lg1Var.f();
                    int iG7 = lg1Var.g() + 1;
                    int i36 = 1 - ((zF ? 1 : 0) + (zF ? 1 : 0));
                    int i37 = i35 + 1;
                    i21 = iG3;
                    boolean[] zArr = new boolean[i37];
                    for (int i38 = 0; i38 <= i35; i38++) {
                        if (lg1Var.f()) {
                            zArr[i38] = z7;
                        } else {
                            zArr[i38] = lg1Var.f();
                        }
                    }
                    int i39 = i31 - 1;
                    int[] iArr5 = new int[i37];
                    int[] iArr6 = new int[i37];
                    int i40 = 0;
                    while (true) {
                        i23 = i36 * iG7;
                        if (i39 < 0) {
                            break;
                        }
                        int i41 = iArrCopyOf[i39] + i23;
                        if (i41 < 0 && zArr[i32 + i39]) {
                            iArr5[i40] = i41;
                            i40++;
                        }
                        i39--;
                    }
                    if (i23 < 0 && zArr[i35]) {
                        iArr5[i40] = i23;
                        i40++;
                    }
                    i22 = i8;
                    int[] iArr7 = iArr2;
                    int i42 = i40;
                    for (int i43 = 0; i43 < i32; i43++) {
                        int i44 = iArr7[i43] + i23;
                        if (i44 < 0 && zArr[i43]) {
                            iArr5[i42] = i44;
                            i42++;
                        }
                    }
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i42);
                    int i45 = 0;
                    for (int i46 = i32 - 1; i46 >= 0; i46--) {
                        int i47 = iArr7[i46] + i23;
                        if (i47 > 0 && zArr[i46]) {
                            iArr6[i45] = i47;
                            i45++;
                        }
                    }
                    if (i23 > 0 && zArr[i35]) {
                        iArr6[i45] = i23;
                        i45++;
                    }
                    int i48 = i45;
                    for (int i49 = 0; i49 < i31; i49++) {
                        int i50 = iArrCopyOf[i49] + i23;
                        if (i50 > 0 && zArr[i32 + i49]) {
                            iArr6[i48] = i50;
                            i48++;
                        }
                    }
                    iArrCopyOf = Arrays.copyOf(iArr6, i48);
                    i32 = i42;
                    i31 = i48;
                    iArr2 = iArrCopyOf2;
                }
                i16++;
                z8 = z7;
                i8 = i22;
                iG3 = i21;
            }
            int i51 = i8;
            boolean z9 = z8;
            if (lg1Var.f()) {
                int iG8 = lg1Var.g();
                for (int i52 = 0; i52 < iG8; i52++) {
                    lg1Var.d(iG4 + 5);
                }
            }
            lg1Var.d(2);
            float f7 = 1.0f;
            if (lg1Var.f()) {
                f6 = 1.0f;
                i17 = i14;
                i18 = -1;
                i19 = -1;
                i20 = -1;
            } else {
                if (lg1Var.f()) {
                    int iA4 = lg1Var.a(8);
                    if (iA4 == 255) {
                        int iA5 = lg1Var.a(16);
                        int iA6 = lg1Var.a(16);
                        if (iA5 != 0 && iA6 != 0) {
                            f7 = iA5 / iA6;
                        }
                    } else if (iA4 < 17) {
                        f7 = f9552b[iA4];
                    } else {
                        androidx.activity.m.g(iA4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (lg1Var.f()) {
                    lg1Var.c();
                }
                if (lg1Var.f()) {
                    lg1Var.d(3);
                    boolean z10 = z9 != lg1Var.f() ? 2 : z9;
                    if (lg1Var.f()) {
                        int iA7 = lg1Var.a(8);
                        int iA8 = lg1Var.a(8);
                        lg1Var.d(8);
                        iA = mb2.a(iA7);
                        iB = mb2.b(iA8);
                        r6 = z10;
                    } else {
                        iA = -1;
                        iB = -1;
                        r6 = z10;
                    }
                } else if (f0Var == null || (loVar = (lo) f0Var.f1104v) == null) {
                    iA = -1;
                    iB = -1;
                    r6 = -1;
                } else {
                    bo1 bo1Var4 = (bo1) loVar.f6798t;
                    int i53 = ((int[]) loVar.f6799u)[i51];
                    if (bo1Var4.size() > i53) {
                        sd1 sd1Var = (sd1) bo1Var4.get(i53);
                        int i54 = sd1Var.f8907a;
                        int i55 = sd1Var.f8908b;
                        iB = sd1Var.f8909c;
                        iA = i54;
                        r6 = i55;
                    }
                }
                if (lg1Var.f()) {
                    lg1Var.g();
                    lg1Var.g();
                }
                lg1Var.c();
                if (lg1Var.f()) {
                    i14 += i14;
                }
                i18 = iA;
                i20 = iB;
                f6 = f7;
                i19 = r6;
                i17 = i14;
            }
            return new ad1(wa1Var, i13, i12, i11, i17, f6, i15, i18, i19, i20);
        }
        int iG9 = lg1Var.g();
        if (iG9 == 3) {
            lg1Var.c();
            iG9 = 3;
        }
        int iG10 = lg1Var.g();
        int iG11 = lg1Var.g();
        if (lg1Var.f()) {
            int iG12 = lg1Var.g();
            int iG13 = lg1Var.g();
            int iG14 = lg1Var.g();
            int iG15 = lg1Var.g();
            iG10 -= (iG12 + iG13) * ((iG9 == 1 || iG9 == 2) ? 2 : 1);
            iG11 -= (iG14 + iG15) * (iG9 == 1 ? 2 : 1);
        }
        i9 = iG11;
        i10 = iG10;
        iG = lg1Var.g();
        iG2 = lg1Var.g();
        i11 = i10;
        i13 = iG;
        i14 = i9;
        i12 = iG2;
        int iG42 = lg1Var.g();
        if (z6) {
        }
        lg1Var.g();
        lg1Var.g();
        lg1Var.g();
        lg1Var.g();
        lg1Var.g();
        lg1Var.g();
        if (lg1Var.f()) {
        }
        lg1Var.d(2);
        if (lg1Var.f()) {
        }
        iG3 = lg1Var.g();
        int[] iArr22 = new int[0];
        int[] iArrCopyOf3 = new int[0];
        i16 = 0;
        int i312 = -1;
        int i322 = -1;
        while (i16 < iG3) {
        }
        int i512 = i8;
        boolean z92 = z8;
        if (lg1Var.f()) {
        }
        lg1Var.d(2);
        float f72 = 1.0f;
        if (lg1Var.f()) {
        }
        return new ad1(wa1Var, i13, i12, i11, i17, f6, i15, i18, i19, i20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.fragment.app.f0 d(int i6, int i7, byte[] bArr) {
        int[] iArr;
        lo loVar;
        boolean z6;
        int iA;
        boolean z7;
        int iA2;
        int iA3;
        int iA4;
        boolean z8;
        int i8;
        cp1 cp1Var;
        boolean[][] zArr;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i9;
        int i10;
        int i11;
        boolean zF;
        int i12;
        int i13;
        int i14;
        int i15;
        int iG;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        lg1 lg1Var = new lg1(bArr, i6, i7);
        h(lg1Var);
        lg1Var.d(4);
        boolean zF2 = lg1Var.f();
        boolean zF3 = lg1Var.f();
        int iA5 = lg1Var.a(6);
        int i18 = iA5 + 1;
        int iA6 = lg1Var.a(3);
        lg1Var.d(17);
        wa1 wa1VarI = i(lg1Var, true, iA6, null);
        for (int i19 = true != lg1Var.f() ? iA6 : 0; i19 <= iA6; i19++) {
            lg1Var.g();
            lg1Var.g();
            lg1Var.g();
        }
        int iA7 = lg1Var.a(6);
        int iG2 = lg1Var.g() + 1;
        int i20 = 6;
        ni0 ni0Var = new ni0(bo1.n(wa1VarI), new int[1]);
        boolean z11 = i18 >= 2 && iG2 >= 2;
        boolean z12 = zF2 && zF3;
        int i21 = iA7 + 1;
        if (!z11 || !z12 || i21 < i18) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iG2, i21);
        int i22 = 1;
        int[] iArr5 = new int[iG2];
        int[] iArr6 = new int[iG2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i23 = 1; i23 < iG2; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= iA7; i25++) {
                if (lg1Var.f()) {
                    iArr4[i23][i24] = i25;
                    iArr6[i23] = i25;
                    i24++;
                }
                iArr5[i23] = i24;
            }
        }
        if (lg1Var.f()) {
            lg1Var.d(64);
            if (lg1Var.f()) {
                lg1Var.g();
            }
            int iG3 = lg1Var.g();
            int i26 = 0;
            while (i26 < iG3) {
                lg1Var.g();
                if (i26 == 0 || lg1Var.f()) {
                    boolean zF4 = lg1Var.f();
                    boolean zF5 = lg1Var.f();
                    z10 = zF4;
                    z9 = zF5;
                    if (zF4 || zF5) {
                        zF = lg1Var.f();
                        if (zF) {
                            lg1Var.d(19);
                        }
                        lg1Var.d(8);
                        if (zF) {
                            lg1Var.d(4);
                        }
                        lg1Var.d(15);
                        i13 = zF4;
                        i12 = zF5;
                    }
                    i14 = 0;
                    while (i14 <= iA6) {
                        if (lg1Var.f() || lg1Var.f()) {
                            lg1Var.g();
                        } else {
                            if (lg1Var.f()) {
                                i15 = i26;
                                iG = 0;
                            }
                            int[][] iArr7 = iArr4;
                            i16 = i13 + i12;
                            int[] iArr8 = iArr6;
                            i17 = 0;
                            while (i17 < i16) {
                                int i27 = i16;
                                for (int i28 = 0; i28 <= iG; i28++) {
                                    lg1Var.g();
                                    lg1Var.g();
                                    if (zF) {
                                        lg1Var.g();
                                        lg1Var.g();
                                    }
                                    lg1Var.c();
                                }
                                i17++;
                                i16 = i27;
                            }
                            i14++;
                            iArr4 = iArr7;
                            i26 = i15;
                            iArr6 = iArr8;
                        }
                        i15 = i26;
                        iG = lg1Var.g();
                        int[][] iArr72 = iArr4;
                        i16 = i13 + i12;
                        int[] iArr82 = iArr6;
                        i17 = 0;
                        while (i17 < i16) {
                        }
                        i14++;
                        iArr4 = iArr72;
                        i26 = i15;
                        iArr6 = iArr82;
                    }
                    i26++;
                } else {
                    z10 = false;
                    z9 = false;
                }
                zF = false;
                i13 = z10;
                i12 = z9;
                i14 = 0;
                while (i14 <= iA6) {
                }
                i26++;
            }
        }
        int[][] iArr9 = iArr4;
        int[] iArr10 = iArr6;
        if (!lg1Var.f()) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int i29 = lg1Var.f6723d;
        if (i29 > 0) {
            lg1Var.d(8 - i29);
        }
        wa1 wa1VarI2 = i(lg1Var, false, iA6, wa1VarI);
        boolean zF6 = lg1Var.f();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean zF7 = lg1Var.f();
            zArr3[i31] = zF7;
            if (zF7) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int i32 = i30 + 1;
        int[] iArr11 = new int[i30];
        for (int i33 = 0; i33 < i30 - (zF6 ? 1 : 0); i33++) {
            iArr11[i33] = lg1Var.a(3);
        }
        int[] iArr12 = new int[i32];
        if (zF6) {
            for (int i34 = 1; i34 < i30; i34++) {
                for (int i35 = 0; i35 < i34; i35++) {
                    iArr12[i34] = iArr11[i35] + 1 + iArr12[i34];
                }
            }
            iArr12[i30] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) cls, i18, i30);
        int[] iArr14 = new int[i18];
        iArr14[0] = 0;
        boolean zF8 = lg1Var.f();
        int i36 = 1;
        while (i36 < i18) {
            if (zF8) {
                iArr14[i36] = lg1Var.a(i20);
            } else {
                iArr14[i36] = i36;
            }
            if (zF6) {
                i11 = i36;
                for (int i37 = 0; i37 < i30; i37++) {
                    iArr13[i11][i37] = (iArr14[i11] & ((1 << iArr12[r32]) - 1)) >> iArr12[i37];
                }
            } else {
                int i38 = 0;
                while (i38 < i30) {
                    iArr13[i36][i38] = lg1Var.a(iArr11[i38] + 1);
                    i38++;
                    i36 = i36;
                }
                i11 = i36;
            }
            i36 = i11 + 1;
            i20 = 6;
        }
        int[] iArr15 = new int[i21];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i18) {
            iArr15[iArr14[i40]] = -1;
            int[] iArr16 = iArr15;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    i10 = i22;
                    if (i41 == i10) {
                        iArr16[iArr14[i40]] = iArr13[i40][i42];
                        i41 = i10;
                    }
                    i42++;
                } else {
                    i10 = i22;
                }
                i41 += i10;
                i22 = i10;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        i39++;
                        break;
                    }
                    int i44 = i43;
                    if (iArr16[iArr14[i40]] == iArr16[iArr14[i43]]) {
                        break;
                    }
                    i43 = i44 + 1;
                }
            }
            i40++;
            iArr15 = iArr16;
            i22 = 1;
        }
        int[] iArr17 = iArr15;
        int iA8 = lg1Var.a(4);
        if (i39 < 2 || iA8 == 0) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int[] iArr18 = new int[i39];
        for (int i45 = 0; i45 < i39; i45++) {
            iArr18[i45] = lg1Var.a(iA8);
        }
        int[] iArr19 = new int[i21];
        for (int i46 = 0; i46 < i18; i46++) {
            iArr19[Math.min(iArr14[i46], iA7)] = i46;
        }
        yn1 yn1Var = new yn1();
        int i47 = 0;
        while (i47 <= iA7) {
            int[] iArr20 = iArr18;
            int i48 = i39;
            int iMin = Math.min(iArr17[i47], i48 - 1);
            int[] iArr21 = iArr19;
            yn1Var.q(new z91(iArr21[i47], iMin >= 0 ? iArr20[iMin] : -1));
            i47++;
            i39 = i48;
            iArr18 = iArr20;
            iArr19 = iArr21;
        }
        cp1 cp1VarT = yn1Var.t();
        if (((z91) cp1VarT.get(0)).f11231b == -1) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > iA7) {
                i49 = -1;
                break;
            }
            if (((z91) cp1VarT.get(i49)).f11231b != -1) {
                break;
            }
            i49++;
        }
        if (i49 == -1) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i50 = 1;
        while (i50 < i18) {
            boolean[][] zArr6 = zArr5;
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr7 = zArr4[i50];
                boolean[] zArr8 = zArr6[i50];
                boolean zF9 = lg1Var.f();
                zArr8[i51] = zF9;
                zArr7[i51] = zF9;
            }
            i50++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i52 = 1; i52 < i18; i52++) {
            int i53 = 0;
            while (i53 < iA5) {
                boolean[][] zArr10 = zArr4;
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr11 = zArr9[i52];
                        if (zArr11[i54] && zArr9[i54][i53]) {
                            zArr11[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
                i53++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr22 = new int[i21];
        for (int i55 = 0; i55 < i18; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr12[i55][i57] ? 1 : 0;
            }
            iArr22[iArr14[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i18; i59++) {
            if (iArr22[iArr14[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int[] iArr23 = new int[i18];
        int[] iArr24 = new int[iG2];
        if (lg1Var.f()) {
            iArr = iArr22;
            int i60 = 0;
            while (i60 < i18) {
                int i61 = i60;
                iArr23[i61] = lg1Var.a(3);
                i60 = i61 + 1;
            }
        } else {
            iArr = iArr22;
            Arrays.fill(iArr23, 0, i18, iA6);
        }
        int i62 = 0;
        while (i62 < iG2) {
            int i63 = i62;
            int[] iArr25 = iArr23;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i64 = 0; i64 < iArr5[i63]; i64++) {
                iMax = Math.max(iMax, iArr25[((z91) cp1VarT.get(iArr9[i63][i64])).f11230a]);
            }
            iArr26[i63] = iMax + 1;
            i62 = i63 + 1;
            iArr23 = iArr25;
            iArr24 = iArr26;
        }
        int[] iArr27 = iArr24;
        if (lg1Var.f()) {
            int i65 = 0;
            while (i65 < iA5) {
                int i66 = i65 + 1;
                int i67 = i66;
                while (i67 < i18) {
                    if (zArr12[i67][i65]) {
                        i9 = iA5;
                        lg1Var.d(3);
                    } else {
                        i9 = iA5;
                    }
                    i67++;
                    iA5 = i9;
                }
                i65 = i66;
            }
        }
        lg1Var.c();
        int iG4 = lg1Var.g() + 1;
        yn1 yn1Var2 = new yn1();
        yn1Var2.q(wa1VarI);
        if (iG4 > 1) {
            yn1Var2.q(wa1VarI2);
            for (int i68 = 2; i68 < iG4; i68++) {
                wa1VarI2 = i(lg1Var, lg1Var.f(), iA6, wa1VarI2);
                yn1Var2.q(wa1VarI2);
            }
        }
        cp1 cp1VarT2 = yn1Var2.t();
        int iG5 = lg1Var.g() + iG2;
        if (iG5 > iG2) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int iA9 = lg1Var.a(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iG5, i21);
        int[] iArr28 = new int[iG5];
        int i69 = 0;
        int[] iArr29 = new int[iG5];
        int i70 = 0;
        while (i70 < iG2) {
            iArr28[i70] = i69;
            int i71 = i70;
            int i72 = iArr10[i71];
            iArr29[i71] = i72;
            if (iA9 == 0) {
                zArr2 = zArr13;
                iArr2 = iArr28;
                iArr3 = iArr14;
                Arrays.fill(zArr13[i71], i69, iArr5[i71], true);
                iArr2[i71] = iArr5[i71];
            } else {
                zArr2 = zArr13;
                iArr2 = iArr28;
                iArr3 = iArr14;
                if (iA9 == 1) {
                    for (int i73 = 0; i73 < iArr5[i71]; i73++) {
                        zArr2[i71][i73] = iArr9[i71][i73] == i72;
                    }
                    iArr2[i71] = 1;
                } else {
                    i69 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                    i70 = i71 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr2;
                    iArr14 = iArr3;
                }
            }
            i69 = 0;
            i70 = i71 + 1;
            zArr13 = zArr2;
            iArr28 = iArr2;
            iArr14 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr14;
        int[] iArr32 = new int[i21];
        int i74 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i21;
        iArr33[i69] = iG5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i75 = 1;
        int i76 = 0;
        while (i75 < iG5) {
            if (iA9 == i74) {
                for (int i77 = 0; i77 < iArr5[i75]; i77++) {
                    zArr14[i75][i77] = lg1Var.f();
                    int i78 = iArr30[i75];
                    boolean z13 = zArr14[i75][i77];
                    iArr30[i75] = i78 + (z13 ? 1 : 0);
                    if (z13) {
                        iArr29[i75] = iArr9[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i8 = 0;
                if (iArr9[i75][0] == 0 && zArr14[i75][0]) {
                    i76 = 0;
                    for (int i79 = 1; i79 < iArr5[i75]; i79++) {
                        if (iArr9[i75][i79] == i49 && zArr14[i75][i49]) {
                            i76 = i75;
                        }
                    }
                } else {
                    i76 = 0;
                }
            } else {
                i8 = 0;
            }
            int i80 = i8;
            while (i80 < iArr5[i75]) {
                if (iG4 > 1) {
                    zArr15[i75][i80] = zArr14[i75][i80];
                    cp1Var = cp1VarT2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iA10 = gq1.a(iG4);
                    if (!zArr[i75][i80]) {
                        int i81 = ((z91) cp1VarT.get(iArr9[i75][i80])).f11230a;
                        int i82 = i8;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i82;
                            if (zArr9[i81][((z91) cp1VarT.get(iArr9[i75][i83])).f11230a]) {
                                zArr[i75][i80] = true;
                                break;
                            }
                            i82 = i83 + 1;
                        }
                    }
                    if (zArr[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            lg1Var.d(iA10);
                        } else {
                            iArr32[i80] = lg1Var.a(iA10);
                        }
                    }
                } else {
                    cp1Var = cp1VarT2;
                    zArr = zArr15;
                }
                i80++;
                cp1VarT2 = cp1Var;
                zArr15 = zArr;
            }
            cp1 cp1Var2 = cp1VarT2;
            boolean[][] zArr16 = zArr15;
            if (iArr30[i75] == 1 && iArr[iArr29[i75]] > 0) {
                lg1Var.c();
            }
            i75++;
            cp1VarT2 = cp1Var2;
            zArr15 = zArr16;
            i74 = 2;
        }
        cp1 cp1Var3 = cp1VarT2;
        boolean[][] zArr17 = zArr15;
        if (i76 == 0) {
            return new androidx.fragment.app.f0((cp1) null, ni0Var, (s70) null, (lo) null);
        }
        int iG6 = lg1Var.g();
        int i84 = iG6 + 1;
        en1.a(i84, "expectedSize");
        en1.a(i84, "initialCapacity");
        int[] iArr34 = new int[i18];
        Object[] objArrCopyOf = new Object[i84];
        int i85 = 0;
        int i86 = 0;
        boolean z14 = false;
        while (i85 < i84) {
            int i87 = i85;
            int iA11 = lg1Var.a(16);
            int iA12 = lg1Var.a(16);
            if (lg1Var.f()) {
                z7 = z14;
                iA2 = lg1Var.a(2);
                if (iA2 == 3) {
                    lg1Var.c();
                }
                iA3 = lg1Var.a(4);
                iA4 = lg1Var.a(4);
            } else {
                z7 = z14;
                iA2 = 0;
                iA3 = 0;
                iA4 = 0;
            }
            if (lg1Var.f()) {
                int iG7 = lg1Var.g();
                int iG8 = lg1Var.g();
                int iG9 = lg1Var.g();
                int iG10 = lg1Var.g();
                iA11 -= (iG7 + iG8) * ((iA2 == 1 || iA2 == 2) ? 2 : 1);
                iA12 -= (iG9 + iG10) * (iA2 == 1 ? 2 : 1);
            }
            lb1 lb1Var = new lb1(iA2, iA3, iA4, iA11, iA12);
            int length = objArrCopyOf.length;
            int iO = me.o(length, i86 + 1);
            if (iO > length || z7) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO);
                z8 = false;
            } else {
                z8 = z7;
            }
            objArrCopyOf[i86] = lb1Var;
            i86++;
            i85 = i87 + 1;
            z14 = z8;
        }
        if (i84 <= 1 || !lg1Var.f()) {
            for (int i88 = 1; i88 < i18; i88++) {
                iArr34[i88] = Math.min(i88, iG6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iA13 = gq1.a(i84);
            for (int i89 = 1; i89 < i18; i89++) {
                iArr34[i89] = lg1Var.a(iA13);
            }
        }
        s70 s70Var = new s70(bo1.k(objArrCopyOf, i86), iArr34);
        lg1Var.d(2);
        for (int i90 = 1; i90 < i18; i90++) {
            if (iArr[iArr31[i90]] == 0) {
                lg1Var.c();
            }
        }
        for (int i91 = 1; i91 < iG5; i91++) {
            boolean zF10 = lg1Var.f();
            int i92 = 0;
            while (i92 < iArr27[i91]) {
                if ((i92 <= 0 || !zF10) ? i92 == 0 : lg1Var.f()) {
                    for (int i93 = 0; i93 < iArr5[i91]; i93++) {
                        if (zArr17[i91][i93]) {
                            lg1Var.g();
                        }
                    }
                    lg1Var.g();
                    lg1Var.g();
                }
                i92++;
            }
        }
        int iG11 = lg1Var.g() + 2;
        if (lg1Var.f()) {
            lg1Var.d(iG11);
        } else {
            for (int i94 = 1; i94 < i18; i94++) {
                for (int i95 = 0; i95 < i94; i95++) {
                    if (zArr12[i94][i95]) {
                        lg1Var.d(iG11);
                    }
                }
            }
        }
        int iG12 = lg1Var.g();
        for (int i96 = 1; i96 <= iG12; i96++) {
            lg1Var.d(8);
        }
        if (lg1Var.f()) {
            int i97 = lg1Var.f6723d;
            if (i97 > 0) {
                lg1Var.d(8 - i97);
            }
            if (lg1Var.f() || lg1Var.f()) {
                lg1Var.c();
            }
            boolean zF11 = lg1Var.f();
            boolean zF12 = lg1Var.f();
            if (zF11 || zF12) {
                for (int i98 = 0; i98 < iG2; i98++) {
                    for (int i99 = 0; i99 < iArr27[i98]; i99++) {
                        boolean zF13 = zF11 ? lg1Var.f() : false;
                        boolean zF14 = zF12 ? lg1Var.f() : false;
                        if (zF13) {
                            lg1Var.d(32);
                        }
                        if (zF14) {
                            lg1Var.d(18);
                        }
                    }
                }
            }
            boolean zF15 = lg1Var.f();
            if (zF15) {
                z6 = true;
                iA = lg1Var.a(4) + 1;
            } else {
                z6 = true;
                iA = i18;
            }
            en1.a(iA, "expectedSize");
            en1.a(iA, "initialCapacity");
            int[] iArr35 = new int[i18];
            Object[] objArrCopyOf2 = new Object[iA];
            int i100 = 0;
            int i101 = 0;
            boolean z15 = false;
            while (i100 < iA) {
                lg1Var.d(3);
                int i102 = z6 != lg1Var.f() ? 2 : 1;
                int iA14 = mb2.a(lg1Var.a(8));
                boolean z16 = zF15;
                int iB = mb2.b(lg1Var.a(8));
                lg1Var.d(8);
                sd1 sd1Var = new sd1(iA14, i102, iB);
                int length2 = objArrCopyOf2.length;
                int iO2 = me.o(length2, i101 + 1);
                if (iO2 > length2 || z15) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iO2);
                    z15 = false;
                }
                objArrCopyOf2[i101] = sd1Var;
                i100++;
                i101++;
                z6 = true;
                zF15 = z16;
                z15 = z15;
            }
            if (zF15 && iA > 1) {
                for (int i103 = 0; i103 < i18; i103++) {
                    iArr35[i103] = lg1Var.a(4);
                }
            }
            loVar = new lo(bo1.k(objArrCopyOf2, i101), iArr35);
        } else {
            loVar = null;
        }
        return new androidx.fragment.app.f0(cp1VarT, new ni0(cp1Var3, iArr32), s70Var, loVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bf1 e(int i6, int i7, byte[] bArr) {
        int iG;
        int i8;
        int i9;
        int iG2;
        int i10;
        int i11;
        int iG3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f6;
        int i18;
        float f7;
        int iA;
        int iB;
        boolean zF;
        boolean zF2;
        int i19;
        lg1 lg1Var = new lg1(bArr, i6, i7);
        int iA2 = lg1Var.a(8);
        int iA3 = lg1Var.a(8);
        int iA4 = lg1Var.a(8);
        int iG4 = lg1Var.g();
        if (iA2 == 100 || iA2 == 110 || iA2 == 122 || iA2 == 244 || iA2 == 44 || iA2 == 83 || iA2 == 86 || iA2 == 118 || iA2 == 128) {
            iG = lg1Var.g();
            if (iG != 3) {
                lg1Var.f();
                i8 = 3;
            } else {
                i8 = iG;
            }
            i9 = 16;
            iG2 = lg1Var.g();
            int iG5 = lg1Var.g();
            lg1Var.c();
            if (lg1Var.f()) {
                int i20 = i8 != 3 ? 8 : 12;
                int i21 = 0;
                while (i21 < i20) {
                    if (lg1Var.f()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int iB2 = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i22; i24++) {
                            if (iB2 != 0) {
                                iB2 = ((lg1Var.b() + i23) + 256) % 256;
                            }
                            if (iB2 != 0) {
                                i23 = iB2;
                            }
                        }
                    }
                    i21++;
                }
            }
            i10 = iG5;
        } else if (iA2 == 138) {
            iA2 = 138;
            iG = lg1Var.g();
            if (iG != 3) {
            }
            i9 = 16;
            iG2 = lg1Var.g();
            int iG52 = lg1Var.g();
            lg1Var.c();
            if (lg1Var.f()) {
            }
            i10 = iG52;
        } else {
            iG = 1;
            i9 = 16;
            i10 = 0;
            iG2 = 0;
        }
        lg1Var.g();
        int iG6 = lg1Var.g();
        if (iG6 == 0) {
            lg1Var.g();
        } else if (iG6 == 1) {
            lg1Var.f();
            lg1Var.b();
            lg1Var.b();
            long jG = lg1Var.g();
            for (int i25 = 0; i25 < jG; i25++) {
                lg1Var.g();
            }
        }
        lg1Var.g();
        lg1Var.c();
        int iG7 = lg1Var.g() + 1;
        int iG8 = lg1Var.g() + 1;
        boolean zF3 = lg1Var.f();
        int i26 = 2 - (zF3 ? 1 : 0);
        if (!zF3) {
            lg1Var.c();
        }
        lg1Var.c();
        int i27 = iG7 * 16;
        int i28 = iG8 * i26 * 16;
        if (lg1Var.f()) {
            int iG9 = lg1Var.g();
            int iG10 = lg1Var.g();
            int iG11 = lg1Var.g();
            int iG12 = lg1Var.g();
            if (iG == 0) {
                i19 = 1;
            } else {
                i19 = iG == 3 ? 1 : 2;
                i26 *= iG == 1 ? 2 : 1;
            }
            i27 -= (iG9 + iG10) * i19;
            i28 -= (iG11 + iG12) * i26;
        }
        int i29 = i27;
        if (iA2 == 44 || iA2 == 86 || iA2 == 100 || iA2 == 110 || iA2 == 122) {
            i11 = iA2;
        } else {
            if (iA2 != 244) {
                iG3 = i9;
                i12 = iA2;
                int i30 = -1;
                if (lg1Var.f()) {
                    i13 = i28;
                    i14 = -1;
                    i15 = -1;
                    i16 = iG2;
                    i17 = iG3;
                    f6 = 1.0f;
                    i18 = -1;
                } else if (lg1Var.f()) {
                    int iA5 = lg1Var.a(8);
                    if (iA5 == 255) {
                        int i31 = i9;
                        int iA6 = lg1Var.a(i31);
                        int iA7 = lg1Var.a(i31);
                        if (iA6 != 0 && iA7 != 0) {
                            f7 = iA6 / iA7;
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        zF = lg1Var.f();
                        if (zF) {
                        }
                        zF2 = lg1Var.f();
                        if (zF2) {
                        }
                        if (!zF) {
                            lg1Var.c();
                            lg1Var.c();
                            if (lg1Var.f()) {
                            }
                            i15 = iB;
                            i14 = i30;
                            i16 = iG2;
                            f6 = f7;
                            i13 = i28;
                            i17 = iG3;
                            i18 = iA;
                        }
                    } else if (iA5 < 17) {
                        f7 = f9552b[iA5];
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        zF = lg1Var.f();
                        if (zF) {
                        }
                        zF2 = lg1Var.f();
                        if (zF2) {
                        }
                        if (!zF) {
                        }
                    } else {
                        androidx.activity.m.g(iA5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        f7 = 1.0f;
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        if (lg1Var.f()) {
                        }
                        zF = lg1Var.f();
                        if (zF) {
                        }
                        zF2 = lg1Var.f();
                        if (zF2) {
                        }
                        if (!zF) {
                        }
                    }
                } else {
                    f7 = 1.0f;
                    if (lg1Var.f()) {
                        lg1Var.c();
                    }
                    if (lg1Var.f()) {
                        iA = -1;
                        iB = -1;
                    } else {
                        lg1Var.d(3);
                        int i32 = true != lg1Var.f() ? 2 : 1;
                        if (lg1Var.f()) {
                            int iA8 = lg1Var.a(8);
                            int iA9 = lg1Var.a(8);
                            lg1Var.d(8);
                            iA = mb2.a(iA8);
                            iB = mb2.b(iA9);
                        } else {
                            iA = -1;
                            iB = -1;
                        }
                        i30 = i32;
                    }
                    if (lg1Var.f()) {
                        lg1Var.g();
                        lg1Var.g();
                    }
                    if (lg1Var.f()) {
                        lg1Var.d(65);
                    }
                    zF = lg1Var.f();
                    if (zF) {
                        j(lg1Var);
                    }
                    zF2 = lg1Var.f();
                    if (zF2) {
                        j(lg1Var);
                    }
                    if (!zF || zF2) {
                        lg1Var.c();
                    }
                    lg1Var.c();
                    if (lg1Var.f()) {
                        lg1Var.c();
                        lg1Var.g();
                        lg1Var.g();
                        lg1Var.g();
                        lg1Var.g();
                        iG3 = lg1Var.g();
                        lg1Var.g();
                    }
                    i15 = iB;
                    i14 = i30;
                    i16 = iG2;
                    f6 = f7;
                    i13 = i28;
                    i17 = iG3;
                    i18 = iA;
                }
                return new bf1(i12, iA3, iA4, iG4, i29, i13, f6, i16, i10, i18, i14, i15, i17);
            }
            i11 = 244;
        }
        if ((iA3 & 16) != 0) {
            i12 = i11;
            iG3 = 0;
        } else {
            iG3 = i9;
            i12 = i11;
        }
        int i302 = -1;
        if (lg1Var.f()) {
        }
        return new bf1(i12, iA3, iA4, iG4, i29, i13, f6, i16, i10, i18, i14, i15, i17);
    }

    public static void f(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean g(byte b7) {
        if (((b7 & 96) >> 5) != 0) {
            return true;
        }
        int i6 = b7 & 31;
        return (i6 == 1 || i6 == 9 || i6 == 14) ? false : true;
    }

    public static ha1 h(lg1 lg1Var) {
        lg1Var.c();
        int iA = lg1Var.a(6);
        int iA2 = lg1Var.a(6);
        lg1Var.a(3);
        return new ha1(iA, iA2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wa1 i(lg1 lg1Var, boolean z6, int i6, wa1 wa1Var) {
        int[] iArr;
        int i7;
        boolean z7;
        int i8;
        int i9;
        boolean zF;
        int iA;
        int i10;
        int[] iArr2 = new int[6];
        if (z6) {
            int iA2 = lg1Var.a(2);
            zF = lg1Var.f();
            iA = lg1Var.a(5);
            i10 = 0;
            for (int i11 = 0; i11 < 32; i11++) {
                if (lg1Var.f()) {
                    i10 |= 1 << i11;
                }
            }
            for (int i12 = 0; i12 < 6; i12++) {
                iArr2[i12] = lg1Var.a(8);
            }
            i7 = iA2;
        } else {
            if (wa1Var == null) {
                iArr = iArr2;
                i7 = 0;
                z7 = false;
                i8 = 0;
                i9 = 0;
                int iA3 = lg1Var.a(8);
                int i13 = 0;
                for (int i14 = 0; i14 < i6; i14++) {
                    if (lg1Var.f()) {
                        i13 += 88;
                    }
                    if (lg1Var.f()) {
                        i13 += 8;
                    }
                }
                lg1Var.d(i13);
                if (i6 > 0) {
                    int i15 = 8 - i6;
                    lg1Var.d(i15 + i15);
                }
                return new wa1(i7, z7, i8, i9, iArr, iA3);
            }
            int i16 = wa1Var.f10136a;
            zF = wa1Var.f10137b;
            iA = wa1Var.f10138c;
            i10 = wa1Var.f10139d;
            iArr2 = wa1Var.f10140e;
            i7 = i16;
        }
        iArr = iArr2;
        z7 = zF;
        i8 = iA;
        i9 = i10;
        int iA32 = lg1Var.a(8);
        int i132 = 0;
        while (i14 < i6) {
        }
        lg1Var.d(i132);
        if (i6 > 0) {
        }
        return new wa1(i7, z7, i8, i9, iArr, iA32);
    }

    public static void j(lg1 lg1Var) {
        int iG = lg1Var.g() + 1;
        lg1Var.d(8);
        for (int i6 = 0; i6 < iG; i6++) {
            lg1Var.g();
            lg1Var.g();
            lg1Var.c();
        }
        lg1Var.d(20);
    }
}
