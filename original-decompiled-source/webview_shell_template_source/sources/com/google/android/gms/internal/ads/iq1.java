package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iq1 {
    public static int a(int i6, int i7) {
        long j6 = i6 + i7;
        int i8 = (int) j6;
        if (j6 == i8) {
            return i8;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i6 + ", " + i7 + ")");
    }

    public static int b(int i6, int i7) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i7 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i8 = i6 / i7;
        int i9 = i6 - (i7 * i8);
        if (i9 == 0) {
            return i8;
        }
        int i10 = ((i6 ^ i7) >> 31) | 1;
        switch (hq1.f5457a[roundingMode.ordinal()]) {
            case 1:
                lq1.b(false);
                return i8;
            case 2:
                return i8;
            case 3:
                if (i10 >= 0) {
                    return i8;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return i8;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i9);
                int iAbs2 = iAbs - (Math.abs(i7) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i8;
                }
                if (iAbs2 <= 0) {
                    return i8;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i8 + i10;
    }
}
