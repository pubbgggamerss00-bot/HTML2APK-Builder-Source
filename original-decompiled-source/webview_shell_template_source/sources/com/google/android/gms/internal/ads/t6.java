package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t6 extends s6 {

    /* renamed from: n, reason: collision with root package name */
    public gk2 f9113n;

    /* renamed from: o, reason: collision with root package name */
    public int f9114o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9115p;

    /* renamed from: q, reason: collision with root package name */
    public w1 f9116q;

    /* renamed from: r, reason: collision with root package name */
    public xj1 f9117r;

    @Override // com.google.android.gms.internal.ads.s6
    public final long a(ex0 ex0Var) {
        byte b7 = ex0Var.f4416a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        gk2 gk2Var = this.f9113n;
        y5.k(gk2Var);
        w1 w1Var = (w1) gk2Var.f5084b;
        int i6 = !((v1[]) gk2Var.f5087e)[(b7 >> 1) & (255 >>> (8 - gk2Var.f5083a))].f9684a ? w1Var.f10009e : w1Var.f10010f;
        int i7 = this.f9115p ? (this.f9114o + i6) / 4 : 0;
        byte[] bArr = ex0Var.f4416a;
        int length = bArr.length;
        int i8 = ex0Var.f4418c + 4;
        if (length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
            ex0Var.h(bArrCopyOf.length, bArrCopyOf);
        } else {
            ex0Var.i(i8);
        }
        long j6 = i7;
        byte[] bArr2 = ex0Var.f4416a;
        int i9 = ex0Var.f4418c;
        bArr2[i9 - 4] = (byte) (j6 & 255);
        bArr2[i9 - 3] = (byte) ((j6 >>> 8) & 255);
        bArr2[i9 - 2] = (byte) ((j6 >>> 16) & 255);
        bArr2[i9 - 1] = (byte) ((j6 >>> 24) & 255);
        this.f9115p = true;
        this.f9114o = i6;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void b(boolean z6) {
        super.b(z6);
        if (z6) {
            this.f9113n = null;
            this.f9116q = null;
            this.f9117r = null;
        }
        this.f9114o = 0;
        this.f9115p = false;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final boolean c(ex0 ex0Var, long j6, com.google.android.gms.ads.mediation.customevent.a aVar) throws rn {
        gk2 gk2Var;
        int i6;
        int i7;
        int i8;
        long jFloor;
        if (this.f9113n != null) {
            ((w) aVar.f2372t).getClass();
            return false;
        }
        w1 w1Var = this.f9116q;
        int i9 = 1;
        if (w1Var == null) {
            x1.c(1, ex0Var, false);
            ex0Var.s();
            int iV = ex0Var.v();
            int iS = ex0Var.s();
            int iR = ex0Var.r();
            int i10 = iR <= 0 ? -1 : iR;
            int iR2 = ex0Var.r();
            int i11 = iR2 <= 0 ? -1 : iR2;
            ex0Var.r();
            int iV2 = ex0Var.v();
            int iPow = (int) Math.pow(2.0d, iV2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iV2 & 240) >> 4);
            ex0Var.v();
            this.f9116q = new w1(iV, iS, i10, i11, iPow, iPow2, Arrays.copyOf(ex0Var.f4416a, ex0Var.f4418c));
        } else {
            int i12 = 4;
            xj1 xj1Var = this.f9117r;
            if (xj1Var == null) {
                this.f9117r = x1.b(ex0Var, true, true);
            } else {
                int i13 = ex0Var.f4418c;
                byte[] bArr = new byte[i13];
                System.arraycopy(ex0Var.f4416a, 0, bArr, 0, i13);
                int i14 = w1Var.f10005a;
                int i15 = 5;
                x1.c(5, ex0Var, false);
                int iV3 = ex0Var.v() + 1;
                byte[] bArr2 = ex0Var.f4416a;
                u1 u1Var = new u1();
                u1Var.f9424d = bArr2;
                u1Var.f9421a = bArr2.length;
                int i16 = 8;
                u1Var.b(ex0Var.f4417b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 < iV3) {
                        int i20 = i16;
                        if (u1Var.a(24) != 5653314) {
                            throw rn.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((u1Var.f9422b * 8) + u1Var.f9423c));
                        }
                        int iA = u1Var.a(16);
                        int iA2 = u1Var.a(24);
                        if (u1Var.c()) {
                            u1Var.b(i15);
                            int iA3 = 0;
                            while (iA3 < iA2) {
                                int i21 = iA2 - iA3;
                                int i22 = 0;
                                while (i21 > 0) {
                                    i21 >>>= 1;
                                    i22++;
                                }
                                iA3 += u1Var.a(i22);
                            }
                        } else {
                            boolean zC = u1Var.c();
                            for (int i23 = 0; i23 < iA2; i23++) {
                                if (!zC) {
                                    u1Var.b(i15);
                                } else if (u1Var.c()) {
                                    u1Var.b(i15);
                                }
                            }
                        }
                        int i24 = i12;
                        int iA4 = u1Var.a(i24);
                        if (iA4 > 2) {
                            throw rn.a(null, "lookup type greater than 2 not decodable: " + iA4);
                        }
                        if (iA4 != i9) {
                            if (iA4 != 2) {
                                i7 = i9;
                                i8 = iV3;
                            }
                            i17++;
                            i16 = i20;
                            iV3 = i8;
                            i9 = i7;
                            i12 = 4;
                            i15 = 5;
                        } else {
                            i18 = iA4;
                        }
                        u1Var.b(32);
                        u1Var.b(32);
                        int iA5 = u1Var.a(i24) + i9;
                        u1Var.b(i9);
                        if (i18 != i9) {
                            i7 = i9;
                            i8 = iV3;
                            jFloor = iA * iA2;
                        } else if (iA != 0) {
                            i7 = i9;
                            i8 = iV3;
                            jFloor = (long) Math.floor(Math.pow(iA2, 1.0d / iA));
                        } else {
                            i7 = i9;
                            i8 = iV3;
                            jFloor = 0;
                        }
                        u1Var.b((int) (jFloor * iA5));
                        i17++;
                        i16 = i20;
                        iV3 = i8;
                        i9 = i7;
                        i12 = 4;
                        i15 = 5;
                    } else {
                        int i25 = i9;
                        int i26 = i16;
                        int i27 = 6;
                        int iA6 = u1Var.a(6) + 1;
                        for (int i28 = 0; i28 < iA6; i28++) {
                            if (u1Var.a(16) != 0) {
                                throw rn.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iA7 = u1Var.a(6) + 1;
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            if (i29 < iA7) {
                                int iA8 = u1Var.a(i19);
                                if (iA8 == 0) {
                                    int i31 = i26;
                                    u1Var.b(i31);
                                    u1Var.b(16);
                                    u1Var.b(16);
                                    u1Var.b(6);
                                    u1Var.b(i31);
                                    int iA9 = u1Var.a(4) + 1;
                                    int i32 = 0;
                                    while (i32 < iA9) {
                                        u1Var.b(i31);
                                        i32++;
                                        i31 = 8;
                                    }
                                } else {
                                    if (iA8 != i25) {
                                        throw rn.a(null, "floor type greater than 1 not decodable: " + iA8);
                                    }
                                    int iA10 = u1Var.a(5);
                                    int[] iArr = new int[iA10];
                                    int i33 = -1;
                                    for (int i34 = 0; i34 < iA10; i34++) {
                                        int iA11 = u1Var.a(4);
                                        iArr[i34] = iA11;
                                        if (iA11 > i33) {
                                            i33 = iA11;
                                        }
                                    }
                                    int i35 = i33 + 1;
                                    int[] iArr2 = new int[i35];
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        iArr2[i36] = u1Var.a(i30) + 1;
                                        int iA12 = u1Var.a(2);
                                        if (iA12 > 0) {
                                            i6 = i26;
                                            u1Var.b(i6);
                                        } else {
                                            i6 = i26;
                                        }
                                        int i37 = i35;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << iA12); i39 = 1) {
                                            u1Var.b(i6);
                                            i38++;
                                            i6 = 8;
                                        }
                                        i36++;
                                        i35 = i37;
                                        i26 = 8;
                                        i30 = 3;
                                    }
                                    u1Var.b(2);
                                    int iA13 = u1Var.a(4);
                                    int i40 = 0;
                                    int i41 = 0;
                                    for (int i42 = 0; i42 < iA10; i42++) {
                                        i40 += iArr2[iArr[i42]];
                                        while (i41 < i40) {
                                            u1Var.b(iA13);
                                            i41++;
                                        }
                                    }
                                }
                                i29++;
                                i26 = 8;
                                i27 = 6;
                                i19 = 16;
                                i25 = 1;
                            } else {
                                int iA14 = u1Var.a(i27) + 1;
                                int i43 = 0;
                                while (i43 < iA14) {
                                    if (u1Var.a(16) > 2) {
                                        throw rn.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    u1Var.b(24);
                                    u1Var.b(24);
                                    u1Var.b(24);
                                    int iA15 = u1Var.a(i27) + 1;
                                    int i44 = 8;
                                    u1Var.b(8);
                                    int[] iArr3 = new int[iA15];
                                    for (int i45 = 0; i45 < iA15; i45++) {
                                        iArr3[i45] = ((u1Var.c() ? u1Var.a(5) : 0) * 8) + u1Var.a(3);
                                    }
                                    int i46 = 0;
                                    while (i46 < iA15) {
                                        int i47 = 0;
                                        while (i47 < i44) {
                                            if ((iArr3[i46] & (1 << i47)) != 0) {
                                                u1Var.b(i44);
                                            }
                                            i47++;
                                            i44 = 8;
                                        }
                                        i46++;
                                        i44 = 8;
                                    }
                                    i43++;
                                    i27 = 6;
                                }
                                int iA16 = u1Var.a(i27) + 1;
                                for (int i48 = 0; i48 < iA16; i48++) {
                                    int iA17 = u1Var.a(16);
                                    if (iA17 != 0) {
                                        qs0.c("VorbisUtil", "mapping type other than 0 not supported: " + iA17);
                                    } else {
                                        int iA18 = u1Var.c() ? u1Var.a(4) + 1 : 1;
                                        if (u1Var.c()) {
                                            int iA19 = u1Var.a(8) + 1;
                                            for (int i49 = 0; i49 < iA19; i49++) {
                                                int i50 = i14 - 1;
                                                int i51 = i50;
                                                int i52 = 0;
                                                while (i51 > 0) {
                                                    i51 >>>= 1;
                                                    i52++;
                                                }
                                                u1Var.b(i52);
                                                int i53 = 0;
                                                while (i50 > 0) {
                                                    i50 >>>= 1;
                                                    i53++;
                                                }
                                                u1Var.b(i53);
                                            }
                                        }
                                        if (u1Var.a(2) != 0) {
                                            throw rn.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iA18 > 1) {
                                            for (int i54 = 0; i54 < i14; i54++) {
                                                u1Var.b(4);
                                            }
                                        }
                                        for (int i55 = 0; i55 < iA18; i55++) {
                                            u1Var.b(8);
                                            u1Var.b(8);
                                            u1Var.b(8);
                                        }
                                    }
                                }
                                int iA20 = u1Var.a(6);
                                int i56 = iA20 + 1;
                                v1[] v1VarArr = new v1[i56];
                                for (int i57 = 0; i57 < i56; i57++) {
                                    boolean zC2 = u1Var.c();
                                    u1Var.a(16);
                                    u1Var.a(16);
                                    u1Var.a(8);
                                    v1VarArr[i57] = new v1(zC2);
                                }
                                if (!u1Var.c()) {
                                    throw rn.a(null, "framing bit after modes not set as expected");
                                }
                                int i58 = 0;
                                while (iA20 > 0) {
                                    iA20 >>>= 1;
                                    i58++;
                                }
                                gk2Var = new gk2(w1Var, xj1Var, bArr, v1VarArr, i58);
                            }
                        }
                    }
                }
            }
        }
        gk2Var = null;
        this.f9113n = gk2Var;
        if (gk2Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        w1 w1Var2 = (w1) gk2Var.f5084b;
        arrayList.add(w1Var2.f10011g);
        arrayList.add((byte[]) gk2Var.f5086d);
        qh qhVarA = x1.a(bo1.m((String[]) ((xj1) gk2Var.f5085c).f10619t));
        tk2 tk2Var = new tk2();
        tk2Var.c("audio/vorbis");
        tk2Var.f9326g = w1Var2.f10008d;
        tk2Var.h = w1Var2.f10007c;
        tk2Var.A = w1Var2.f10005a;
        tk2Var.B = w1Var2.f10006b;
        tk2Var.f9333o = arrayList;
        tk2Var.f9328j = qhVarA;
        aVar.f2372t = new w(tk2Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void d(long j6) {
        this.f8810g = j6;
        this.f9115p = j6 != 0;
        w1 w1Var = this.f9116q;
        this.f9114o = w1Var != null ? w1Var.f10009e : 0;
    }
}
