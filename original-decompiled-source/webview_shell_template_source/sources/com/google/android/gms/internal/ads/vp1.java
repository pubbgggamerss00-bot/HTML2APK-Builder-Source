package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vp1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9914a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f9915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9919f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f9920g;
    public final boolean[] h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9921i;

    /* JADX WARN: Illegal instructions before constructor call */
    public vp1(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < cArr.length; i6++) {
            char c7 = cArr[i6];
            if (!(c7 < 128)) {
                throw new IllegalArgumentException(dm1.a("Non-ASCII character: %s", Character.valueOf(c7)));
            }
            if (!(bArr[c7] == -1)) {
                throw new IllegalArgumentException(dm1.a("Duplicate character: %s", Character.valueOf(c7)));
            }
            bArr[c7] = (byte) i6;
        }
        this(str, cArr, bArr, false);
    }

    public final int a(char c7) throws yp1 {
        if (c7 > 127) {
            throw new yp1("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        byte b7 = this.f9920g[c7];
        if (b7 != -1) {
            return b7;
        }
        if (c7 <= ' ' || c7 == 127) {
            throw new yp1("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c7))));
        }
        throw new yp1("Unrecognized character: " + c7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vp1)) {
            return false;
        }
        vp1 vp1Var = (vp1) obj;
        return this.f9921i == vp1Var.f9921i && Arrays.equals(this.f9915b, vp1Var.f9915b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9915b) + (true != this.f9921i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f9914a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vp1(String str, char[] cArr, byte[] bArr, boolean z6) {
        int iNumberOfLeadingZeros;
        this.f9914a = str;
        cArr.getClass();
        this.f9915b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (hq1.f5457a[roundingMode.ordinal()]) {
                    case 1:
                        lq1.b(((length + (-1)) & length) == 0);
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.f9917d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i6 = 1 << (3 - iNumberOfTrailingZeros);
                        this.f9918e = i6;
                        this.f9919f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.f9916c = length - 1;
                        this.f9920g = bArr;
                        boolean[] zArr = new boolean[i6];
                        for (int i7 = 0; i7 < this.f9919f; i7++) {
                            int i8 = this.f9917d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[iq1.b(i7 * 8, i8)] = true;
                        }
                        this.h = zArr;
                        this.f9921i = z6;
                        return;
                    case 4:
                    case 5:
                        iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.f9917d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i62 = 1 << (3 - iNumberOfTrailingZeros2);
                        this.f9918e = i62;
                        this.f9919f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                        this.f9916c = length - 1;
                        this.f9920g = bArr;
                        boolean[] zArr2 = new boolean[i62];
                        while (i7 < this.f9919f) {
                        }
                        this.h = zArr2;
                        this.f9921i = z6;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.f9917d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros22 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i622 = 1 << (3 - iNumberOfTrailingZeros22);
                        this.f9918e = i622;
                        this.f9919f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros22;
                        this.f9916c = length - 1;
                        this.f9920g = bArr;
                        boolean[] zArr22 = new boolean[i622];
                        while (i7 < this.f9919f) {
                        }
                        this.h = zArr22;
                        this.f9921i = z6;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e6) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(cArr.length, "Illegal alphabet length "), e6);
        }
    }
}
