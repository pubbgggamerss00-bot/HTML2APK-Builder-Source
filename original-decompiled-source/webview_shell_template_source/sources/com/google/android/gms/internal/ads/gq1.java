package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5123a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(double d7) {
        boolean zC;
        RoundingMode roundingMode = RoundingMode.CEILING;
        sl1.e("x must be positive and finite", d7 > 0.0d && me0.m(d7));
        int exponent = Math.getExponent(d7);
        if (Math.getExponent(d7) < -1022) {
            return a(d7 * 4.503599627370496E15d) - 52;
        }
        switch (fq1.f4772a[roundingMode.ordinal()]) {
            case 1:
                lq1.b(c(d7));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z = !c(d7);
                return !z ? exponent + 1 : exponent;
            case 4:
                z = exponent < 0;
                zC = c(d7);
                z &= !zC;
                if (!z) {
                }
                break;
            case 5:
                z = exponent >= 0;
                zC = c(d7);
                z &= !zC;
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d7) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean b(double d7) {
        if (me0.m(d7)) {
            return d7 == 0.0d || 52 - Long.numberOfTrailingZeros(me0.d(d7)) <= Math.getExponent(d7);
        }
        return false;
    }

    public static boolean c(double d7) {
        if (d7 > 0.0d && me0.m(d7)) {
            long jD = me0.d(d7);
            if ((jD & ((-1) + jD)) == 0) {
                return true;
            }
        }
        return false;
    }
}
