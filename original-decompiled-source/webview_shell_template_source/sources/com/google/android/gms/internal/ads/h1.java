package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f5200a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5201b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5202c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5203d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5204e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5205f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5206g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5207i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5208j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5209k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.fragment.app.f0 f5210l;

    public h1(List list, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f6, int i13, String str, androidx.fragment.app.f0 f0Var) {
        this.f5200a = list;
        this.f5201b = i6;
        this.f5202c = i7;
        this.f5203d = i8;
        this.f5204e = i9;
        this.f5205f = i10;
        this.f5206g = i11;
        this.h = i12;
        this.f5207i = f6;
        this.f5208j = i13;
        this.f5209k = str;
        this.f5210l = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h1 a(ex0 ex0Var, boolean z6, androidx.fragment.app.f0 f0Var) {
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        char c7;
        nc1 nc1Var;
        int i8;
        int i9 = 4;
        boolean z9 = true;
        if (z6) {
            try {
                ex0Var.k(4);
            } catch (ArrayIndexOutOfBoundsException e6) {
                e = e6;
                z8 = true;
                throw rn.a(e, "Error parsing".concat(z8 != z6 ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                ex0Var.k(21);
            } catch (ArrayIndexOutOfBoundsException e7) {
                e = e7;
                z7 = z9;
                z8 = z7;
                throw rn.a(e, "Error parsing".concat(z8 != z6 ? "HEVC config" : "L-HEVC config"));
            }
        }
        int iV = ex0Var.v() & 3;
        int iV2 = ex0Var.v();
        int i10 = ex0Var.f4417b;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iV2; i13++) {
            ex0Var.k(1);
            int iZ = ex0Var.z();
            for (int i14 = 0; i14 < iZ; i14++) {
                int iZ2 = ex0Var.z();
                i12 += iZ2 + 4;
                ex0Var.k(iZ2);
            }
        }
        ex0Var.j(i10);
        byte[] bArr = new byte[i12];
        androidx.fragment.app.f0 f0Var2 = f0Var;
        int i15 = 0;
        float f6 = 1.0f;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        String strC = null;
        int i23 = 0;
        while (i23 < iV2) {
            int iV3 = ex0Var.v() & 63;
            int iZ3 = ex0Var.z();
            z7 = z9;
            int i24 = i11;
            androidx.fragment.app.f0 f0VarD = f0Var2;
            while (i24 < iZ3) {
                try {
                    int iZ4 = ex0Var.z();
                    int i25 = i24;
                    System.arraycopy(uf1.f9551a, i11, bArr, i15, i9);
                    int i26 = i15 + 4;
                    System.arraycopy(ex0Var.f4416a, ex0Var.f4417b, bArr, i26, iZ4);
                    int i27 = 32;
                    if (iV3 == 32) {
                        if (i25 == 0) {
                            f0VarD = uf1.d(i26, i26 + iZ4, bArr);
                            i7 = i26;
                            i6 = iV;
                            c7 = '?';
                            i11 = 0;
                            i25 = 0;
                        }
                        i15 = i7 + iZ4;
                        ex0Var.k(iZ4);
                        iV = i6;
                        i24 = i25 + 1;
                        i9 = 4;
                    } else {
                        i27 = iV3;
                    }
                    i6 = iV;
                    int i28 = 8;
                    if (i27 != 33) {
                        i7 = i26;
                        if (i27 == 39 && i25 == 0) {
                            int i29 = i15 + 6;
                            int i30 = (i7 + iZ4) - 1;
                            while (true) {
                                byte b7 = bArr[i30];
                                if (b7 == 0) {
                                    if (i30 <= i29) {
                                        break;
                                    }
                                    i30--;
                                } else {
                                    if (b7 == 0) {
                                        c7 = '?';
                                        nc1Var = null;
                                        break;
                                    }
                                    if (i30 > i29) {
                                        lg1 lg1Var = new lg1(bArr, i29, i30 + 1);
                                        while (lg1Var.e(16)) {
                                            int iA = lg1Var.a(i28);
                                            int i31 = 0;
                                            while (iA == 255) {
                                                i31 += 255;
                                                iA = lg1Var.a(i28);
                                            }
                                            int i32 = i31 + iA;
                                            int iA2 = lg1Var.a(i28);
                                            int i33 = 0;
                                            while (iA2 == 255) {
                                                i33 += 255;
                                                iA2 = lg1Var.a(8);
                                            }
                                            int i34 = i33 + iA2;
                                            if (i34 == 0) {
                                                break;
                                            }
                                            if (lg1Var.e(i34)) {
                                                if (i32 == 176) {
                                                    int iG = lg1Var.g();
                                                    boolean zF = lg1Var.f();
                                                    int iG2 = zF ? lg1Var.g() : 0;
                                                    int iG3 = lg1Var.g();
                                                    int i35 = -1;
                                                    int i36 = 0;
                                                    while (i36 <= iG3) {
                                                        int iG4 = lg1Var.g();
                                                        lg1Var.g();
                                                        int i37 = i36;
                                                        int iA3 = lg1Var.a(6);
                                                        c7 = '?';
                                                        if (iA3 != 63) {
                                                            lg1Var.a(iA3 == 0 ? Math.max(0, iG - 30) : Math.max(0, (iA3 + iG) - 31));
                                                            if (zF) {
                                                                int iA4 = lg1Var.a(6);
                                                                if (iA4 == 63) {
                                                                    c7 = '?';
                                                                } else {
                                                                    lg1Var.a(iA4 == 0 ? Math.max(0, iG2 - 30) : Math.max(0, (iA4 + iG2) - 31));
                                                                }
                                                            }
                                                            if (lg1Var.f()) {
                                                                lg1Var.d(10);
                                                            }
                                                            i36 = i37 + 1;
                                                            i35 = iG4;
                                                        }
                                                        nc1Var = null;
                                                        break;
                                                    }
                                                    c7 = '?';
                                                    nc1Var = new nc1(i35);
                                                } else {
                                                    i28 = 8;
                                                }
                                            }
                                        }
                                        c7 = '?';
                                        nc1Var = null;
                                        break;
                                    }
                                }
                            }
                            nc1Var = null;
                            c7 = '?';
                            if (nc1Var != null && f0VarD != null) {
                                i11 = 0;
                                i21 = nc1Var.f7385a == ((z91) ((bo1) f0VarD.f1102t).get(0)).f11231b ? 4 : 5;
                            }
                        } else {
                            c7 = '?';
                        }
                        i11 = 0;
                    } else if (i25 == 0) {
                        ad1 ad1VarC = uf1.c(bArr, i26, i26 + iZ4, f0VarD);
                        int i38 = ad1VarC.f2657b + 8;
                        int i39 = ad1VarC.f2658c + 8;
                        int i40 = ad1VarC.h;
                        int i41 = ad1VarC.f2663i;
                        i7 = i26;
                        int i42 = ad1VarC.f2664j;
                        float f7 = ad1VarC.f2661f;
                        int i43 = ad1VarC.f2662g;
                        wa1 wa1Var = ad1VarC.f2656a;
                        if (wa1Var != null) {
                            i8 = i43;
                            strC = sl0.c(wa1Var.f10136a, wa1Var.f10137b, wa1Var.f10138c, wa1Var.f10139d, wa1Var.f10140e, wa1Var.f10141f);
                        } else {
                            i8 = i43;
                        }
                        i20 = i42;
                        f6 = f7;
                        i22 = i8;
                        c7 = '?';
                        i18 = i40;
                        i17 = i39;
                        i19 = i41;
                        i16 = i38;
                        i11 = 0;
                    } else {
                        i7 = i26;
                        c7 = '?';
                        i11 = 0;
                    }
                    i15 = i7 + iZ4;
                    ex0Var.k(iZ4);
                    iV = i6;
                    i24 = i25 + 1;
                    i9 = 4;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    e = e8;
                    z8 = z7;
                    throw rn.a(e, "Error parsing".concat(z8 != z6 ? "HEVC config" : "L-HEVC config"));
                }
            }
            i23++;
            f0Var2 = f0VarD;
            z9 = z7;
            i9 = 4;
        }
        z7 = z9;
        return new h1(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iV + 1, i16, i17, i18, i19, i20, i21, f6, i22, strC, f0Var2);
    }
}
