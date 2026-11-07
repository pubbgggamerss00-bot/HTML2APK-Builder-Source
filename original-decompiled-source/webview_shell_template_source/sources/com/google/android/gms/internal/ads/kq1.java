package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kq1 {
    public static long a(long j6, long j7) {
        long j8 = j6 + j7;
        if (((j6 ^ j7) < 0) || ((j6 ^ j8) >= 0)) {
            return j8;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j6 + ", " + j7 + ")");
    }

    public static long b(long j6, long j7, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j8 = j6 / j7;
        long j9 = j6 - (j7 * j8);
        if (j9 == 0) {
            return j8;
        }
        int i6 = ((int) ((j6 ^ j7) >> 63)) | 1;
        switch (jq1.f6154a[roundingMode.ordinal()]) {
            case 1:
                lq1.b(false);
                return j8;
            case 2:
                return j8;
            case 3:
                if (i6 >= 0) {
                    return j8;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return j8;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j9);
                long jAbs2 = jAbs - (Math.abs(j7) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j8) == 0)) {
                        return j8;
                    }
                } else if (jAbs2 <= 0) {
                    return j8;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j8 + i6;
    }

    public static long c(long j6, long j7) {
        lq1.a("a", j6);
        lq1.a("b", j7);
        if (j6 == 0) {
            return j7;
        }
        if (j7 == 0) {
            return j6;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long jNumberOfTrailingZeros = j6 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j7);
        long j8 = j7 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j8) {
            long j9 = jNumberOfTrailingZeros - j8;
            long j10 = (j9 >> 63) & j9;
            long j11 = (j9 - j10) - j10;
            jNumberOfTrailingZeros = j11 >> Long.numberOfTrailingZeros(j11);
            j8 += j10;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long d(long j6, long j7) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j7;
        }
        long j8 = j6 ^ j7;
        long j9 = (j8 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j7 == Long.MIN_VALUE) & (j6 < 0)))) {
            long j10 = j6 * j7;
            if (j6 == 0 || j10 / j6 == j7) {
                return j10;
            }
        }
        return j9;
    }
}
