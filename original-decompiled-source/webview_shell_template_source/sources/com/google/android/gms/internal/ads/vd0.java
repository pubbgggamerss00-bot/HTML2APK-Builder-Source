package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vd0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9813b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9814c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9815d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9816e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9817f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9818g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f9819i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f9820j;

    /* renamed from: k, reason: collision with root package name */
    public int f9821k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f9822l;

    /* renamed from: m, reason: collision with root package name */
    public int f9823m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f9824n;

    /* renamed from: o, reason: collision with root package name */
    public int f9825o;

    /* renamed from: p, reason: collision with root package name */
    public int f9826p;

    /* renamed from: q, reason: collision with root package name */
    public int f9827q;

    /* renamed from: r, reason: collision with root package name */
    public int f9828r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f9829t;

    /* renamed from: u, reason: collision with root package name */
    public int f9830u;

    /* renamed from: v, reason: collision with root package name */
    public int f9831v;

    /* renamed from: w, reason: collision with root package name */
    public double f9832w;

    public vd0(int i6, int i7, float f6, float f7, int i8) {
        this.f9812a = i6;
        this.f9813b = i7;
        this.f9814c = f6;
        this.f9815d = f7;
        this.f9816e = i6 / i8;
        this.f9817f = i6 / 400;
        int i9 = i6 / 65;
        this.f9818g = i9;
        int i10 = i9 + i9;
        this.h = i10;
        this.f9819i = new short[i10];
        int i11 = i10 * i7;
        this.f9820j = new short[i11];
        this.f9822l = new short[i11];
        this.f9824n = new short[i11];
    }

    public static void d(int i6, int i7, short[] sArr, int i8, short[] sArr2, int i9, short[] sArr3, int i10) {
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = (i9 * i7) + i11;
            int i13 = (i10 * i7) + i11;
            int i14 = (i8 * i7) + i11;
            for (int i15 = 0; i15 < i6; i15++) {
                sArr[i14] = (short) (((sArr3[i13] * i15) + ((i6 - i15) * sArr2[i12])) / i6);
                i14 += i7;
                i12 += i7;
                i13 += i7;
            }
        }
    }

    public final int a(short[] sArr, int i6, int i7, int i8) {
        int i9 = 1;
        int i10 = 255;
        int i11 = 0;
        int i12 = 0;
        while (i7 <= i8) {
            int iAbs = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = this.f9813b * i6;
                iAbs += Math.abs(sArr[i14 + i13] - sArr[(i14 + i7) + i13]);
            }
            int i15 = iAbs * i11;
            int i16 = i9 * i7;
            if (i15 < i16) {
                i9 = iAbs;
            }
            if (i15 < i16) {
                i11 = i7;
            }
            int i17 = iAbs * i10;
            int i18 = i12 * i7;
            if (i17 > i18) {
                i12 = iAbs;
            }
            if (i17 > i18) {
                i10 = i7;
            }
            i7++;
        }
        this.f9830u = i9 / i11;
        this.f9831v = i12 / i10;
        return i11;
    }

    public final void b(short[] sArr, int i6, int i7) {
        short[] sArrF = f(this.f9822l, this.f9823m, i7);
        this.f9822l = sArrF;
        int i8 = this.f9823m;
        int i9 = this.f9813b;
        System.arraycopy(sArr, i6 * i9, sArrF, i8 * i9, i7 * i9);
        this.f9823m += i7;
    }

    public final void c(short[] sArr, int i6, int i7) {
        int i8;
        for (int i9 = 0; i9 < this.h / i7; i9++) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f9813b;
                i8 = i12 * i7;
                if (i10 < i8) {
                    i11 += sArr[(i8 * i9) + (i12 * i6) + i10];
                    i10++;
                }
            }
            this.f9819i[i9] = (short) (i11 / i8);
        }
    }

    public final void e() {
        float f6;
        double d7;
        int iA;
        int i6;
        int iRound;
        int iRound2;
        float f7;
        int i7;
        int i8;
        int i9;
        long j6;
        long j7;
        float f8 = this.f9814c;
        float f9 = this.f9815d;
        double d8 = f8 / f9;
        int i10 = this.f9823m;
        int i11 = this.f9812a;
        int i12 = this.f9813b;
        int i13 = 0;
        int i14 = 1;
        if (d8 > 1.00001d || d8 < 0.99999d) {
            int i15 = this.f9821k;
            int i16 = this.h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.f9828r;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        b(this.f9820j, i17, iMin);
                        this.f9828r -= iMin;
                        i17 += iMin;
                        f6 = f9;
                        d7 = d8;
                    } else {
                        short[] sArr = this.f9820j;
                        int i19 = i11 > 4000 ? i11 / 4000 : i14;
                        int i20 = this.f9818g;
                        int i21 = this.f9817f;
                        if (i12 == i14 && i19 == i14) {
                            iA = a(sArr, i17, i21, i20);
                            f6 = f9;
                            d7 = d8;
                        } else {
                            c(sArr, i17, i19);
                            f6 = f9;
                            d7 = d8;
                            short[] sArr2 = this.f9819i;
                            int iA2 = a(sArr2, i13, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = iA2 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                int i25 = i22 + i23;
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i12 == 1) {
                                    iA = a(sArr, i17, i21, i20);
                                } else {
                                    c(sArr, i17, 1);
                                    iA = a(sArr2, i13, i21, i20);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i26 = this.f9830u;
                        int i27 = this.f9831v;
                        if (i26 == 0 || (i6 = this.s) == 0 || i27 > i26 * 3 || i26 + i26 <= this.f9829t * 3) {
                            i6 = iA;
                        }
                        int i28 = i17 + i6;
                        this.f9829t = i26;
                        this.s = iA;
                        double d9 = i6;
                        if (d7 > 1.0d) {
                            short[] sArr3 = this.f9820j;
                            double d10 = d7 - 1.0d;
                            if (d7 >= 2.0d) {
                                double d11 = (d9 / d10) + this.f9832w;
                                iRound2 = (int) Math.round(d11);
                                this.f9832w = d11 - iRound2;
                            } else {
                                double d12 = ((d9 * (2.0d - d7)) / d10) + this.f9832w;
                                int iRound3 = (int) Math.round(d12);
                                this.f9828r = iRound3;
                                this.f9832w = d12 - iRound3;
                                iRound2 = i6;
                            }
                            short[] sArrF = f(this.f9822l, this.f9823m, iRound2);
                            this.f9822l = sArrF;
                            int i29 = i17;
                            int i30 = iRound2;
                            d(i30, this.f9813b, sArrF, this.f9823m, sArr3, i29, sArr3, i28);
                            this.f9823m += i30;
                            i17 = i6 + i30 + i29;
                        } else {
                            int i31 = i17;
                            short[] sArr4 = this.f9820j;
                            double d13 = 1.0d - d7;
                            if (d7 < 0.5d) {
                                double d14 = ((d9 * d7) / d13) + this.f9832w;
                                iRound = (int) Math.round(d14);
                                this.f9832w = d14 - iRound;
                            } else {
                                double d15 = ((d9 * ((d7 + d7) - 1.0d)) / d13) + this.f9832w;
                                int iRound4 = (int) Math.round(d15);
                                this.f9828r = iRound4;
                                this.f9832w = d15 - iRound4;
                                iRound = i6;
                            }
                            int i32 = i6 + iRound;
                            short[] sArrF2 = f(this.f9822l, this.f9823m, i32);
                            this.f9822l = sArrF2;
                            System.arraycopy(sArr4, i31 * i12, sArrF2, this.f9823m * i12, i6 * i12);
                            int i33 = iRound;
                            d(i33, this.f9813b, this.f9822l, this.f9823m + i6, sArr4, i28, sArr4, i31);
                            this.f9823m += i32;
                            i17 = i31 + i33;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i14 = 1;
                    f9 = f6;
                    d8 = d7;
                    i13 = 0;
                }
                int i34 = this.f9821k - i17;
                short[] sArr5 = this.f9820j;
                System.arraycopy(sArr5, i17 * i12, sArr5, 0, i34 * i12);
                this.f9821k = i34;
            }
            f7 = this.f9816e * f6;
            if (f7 != 1.0f || this.f9823m == i10) {
            }
            long j8 = i11;
            long j9 = (long) (i11 / f7);
            while (j9 != 0 && j8 != 0 && j9 % 2 == 0 && j8 % 2 == 0) {
                j9 /= 2;
                j8 /= 2;
            }
            int i35 = this.f9823m - i10;
            short[] sArrF3 = f(this.f9824n, this.f9825o, i35);
            this.f9824n = sArrF3;
            System.arraycopy(this.f9822l, i10 * i12, sArrF3, this.f9825o * i12, i35 * i12);
            this.f9823m = i10;
            this.f9825o += i35;
            int i36 = 0;
            while (true) {
                i7 = this.f9825o;
                i8 = i7 - 1;
                if (i36 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.f9826p + 1;
                    j6 = i9;
                    long j10 = j6 * j9;
                    j7 = this.f9827q;
                    if (j10 <= j7 * j8) {
                        break;
                    }
                    this.f9822l = f(this.f9822l, this.f9823m, 1);
                    int i37 = 0;
                    while (i37 < i12) {
                        short[] sArr6 = this.f9822l;
                        int i38 = this.f9823m * i12;
                        short[] sArr7 = this.f9824n;
                        int i39 = (i36 * i12) + i37;
                        short s = sArr7[i39];
                        short s3 = sArr7[i39 + i12];
                        long j11 = j9;
                        long j12 = (r11 + 1) * j11;
                        long j13 = j12 - (this.f9826p * j11);
                        long j14 = j12 - (this.f9827q * j8);
                        sArr6[i38 + i37] = (short) ((((j13 - j14) * s3) + (j14 * s)) / j13);
                        i37++;
                        j9 = j11;
                    }
                    this.f9827q++;
                    this.f9823m++;
                    j9 = j9;
                }
                long j15 = j9;
                this.f9826p = i9;
                if (j6 == j8) {
                    this.f9826p = 0;
                    y5.r(j7 == j15);
                    this.f9827q = 0;
                }
                i36++;
                j9 = j15;
            }
            if (i8 != 0) {
                short[] sArr8 = this.f9824n;
                System.arraycopy(sArr8, i8 * i12, sArr8, 0, (i7 - i8) * i12);
                this.f9825o -= i8;
                return;
            }
            return;
        }
        b(this.f9820j, 0, this.f9821k);
        this.f9821k = 0;
        f6 = f9;
        f7 = this.f9816e * f6;
        if (f7 != 1.0f) {
        }
    }

    public final short[] f(short[] sArr, int i6, int i7) {
        int length = sArr.length;
        int i8 = this.f9813b;
        int i9 = length / i8;
        return i6 + i7 <= i9 ? sArr : Arrays.copyOf(sArr, (((i9 * 3) / 2) + i7) * i8);
    }
}
