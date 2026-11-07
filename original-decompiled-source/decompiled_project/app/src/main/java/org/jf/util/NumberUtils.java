package org.jf.util;

import java.text.DecimalFormat;

/* loaded from: classes3.dex */
public class NumberUtils {
    private static final int canonicalFloatNaN = Float.floatToRawIntBits(Float.NaN);
    private static final int maxFloat = Float.floatToRawIntBits(Float.MAX_VALUE);
    private static final int piFloat = Float.floatToRawIntBits(3.1415927f);
    private static final int eFloat = Float.floatToRawIntBits(2.7182817f);
    private static final long canonicalDoubleNaN = Double.doubleToRawLongBits(Double.NaN);
    private static final long maxDouble = Double.doubleToLongBits(Double.MAX_VALUE);
    private static final long piDouble = Double.doubleToLongBits(3.141592653589793d);
    private static final long eDouble = Double.doubleToLongBits(2.718281828459045d);
    private static final DecimalFormat format = new DecimalFormat("0.####################E0");

    public static boolean isLikelyDouble(long j10) {
        if (j10 == canonicalDoubleNaN || j10 == maxDouble || j10 == piDouble || j10 == eDouble) {
            return true;
        }
        if (j10 != Long.MAX_VALUE && j10 != Long.MIN_VALUE) {
            double dLongBitsToDouble = Double.longBitsToDouble(j10);
            if (Double.isNaN(dLongBitsToDouble)) {
                return false;
            }
            DecimalFormat decimalFormat = format;
            String str = decimalFormat.format(j10);
            String str2 = decimalFormat.format(dLongBitsToDouble);
            int iIndexOf = str2.indexOf(46);
            int iIndexOf2 = str2.indexOf("E");
            int iIndexOf3 = str2.indexOf("000");
            if (iIndexOf3 <= iIndexOf || iIndexOf3 >= iIndexOf2) {
                int iIndexOf4 = str2.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    str2 = str2.substring(0, iIndexOf4) + str2.substring(iIndexOf2);
                }
            } else {
                str2 = str2.substring(0, iIndexOf3) + str2.substring(iIndexOf2);
            }
            if (str2.length() < str.length()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLikelyFloat(int i10) {
        if (i10 == canonicalFloatNaN || i10 == maxFloat || i10 == piFloat || i10 == eFloat) {
            return true;
        }
        if (i10 != Integer.MAX_VALUE && i10 != Integer.MIN_VALUE) {
            int i11 = i10 >> 24;
            int i12 = (i10 >> 16) & 255;
            int i13 = 65535 & i10;
            if ((i11 == 127 || i11 == 1) && i12 < 31 && i13 < 4095) {
                return false;
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            if (Float.isNaN(fIntBitsToFloat)) {
                return false;
            }
            DecimalFormat decimalFormat = format;
            String str = decimalFormat.format(i10);
            String str2 = decimalFormat.format(fIntBitsToFloat);
            int iIndexOf = str2.indexOf(46);
            int iIndexOf2 = str2.indexOf("E");
            int iIndexOf3 = str2.indexOf("000");
            if (iIndexOf3 <= iIndexOf || iIndexOf3 >= iIndexOf2) {
                int iIndexOf4 = str2.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    str2 = str2.substring(0, iIndexOf4) + str2.substring(iIndexOf2);
                }
            } else {
                str2 = str2.substring(0, iIndexOf3) + str2.substring(iIndexOf2);
            }
            if (str2.length() < str.length()) {
                return true;
            }
        }
        return false;
    }
}
