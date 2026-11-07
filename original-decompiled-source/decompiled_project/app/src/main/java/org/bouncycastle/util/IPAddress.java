package org.bouncycastle.util;

/* loaded from: classes3.dex */
public class IPAddress {
    private static boolean isParseable(String str, int i10, int i11, int i12, int i13, boolean z10, int i14, int i15) {
        int i16 = i11 - i10;
        if ((i16 > i13) || (i16 < 1)) {
            return false;
        }
        if (((i16 > 1) && (!z10)) && Character.digit(str.charAt(i10), i12) <= 0) {
            return false;
        }
        int i17 = 0;
        while (i10 < i11) {
            int i18 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), i12);
            if (iDigit < 0) {
                return false;
            }
            i17 = (i17 * i12) + iDigit;
            i10 = i18;
        }
        return (i17 >= i14) & (i17 <= i15);
    }

    private static boolean isParseableIPv4Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 2, false, 0, 32);
    }

    private static boolean isParseableIPv4Octet(String str, int i10, int i11) {
        return isParseable(str, i10, i11, 10, 3, true, 0, 255);
    }

    private static boolean isParseableIPv6Mask(String str) {
        return isParseable(str, 0, str.length(), 10, 3, false, 1, 128);
    }

    private static boolean isParseableIPv6Segment(String str, int i10, int i11) {
        return isParseable(str, i10, i11, 16, 4, true, 0, 65535);
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int length = str.length();
        if (length < 7 || length > 15) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            int iIndexOf = str.indexOf(46, i10);
            if (!isParseableIPv4Octet(str, i10, iIndexOf)) {
                return false;
            }
            i10 = iIndexOf + 1;
        }
        return isParseableIPv4Octet(str, i10, length);
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv4(strSubstring) && (isValidIPv4(strSubstring2) || isParseableIPv4Mask(strSubstring2));
    }

    public static boolean isValidIPv6(String str) {
        int iIndexOf;
        if (str.length() == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != ':' && Character.digit(cCharAt, 16) < 0) {
            return false;
        }
        String strConcat = str.concat(":");
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < strConcat.length() && (iIndexOf = strConcat.indexOf(58, i10)) >= i10) {
            if (i11 == 8) {
                return false;
            }
            if (i10 != iIndexOf) {
                String strSubstring = strConcat.substring(i10, iIndexOf);
                if (iIndexOf == strConcat.length() - 1 && strSubstring.indexOf(46) > 0) {
                    i11++;
                    if (i11 == 8 || !isValidIPv4(strSubstring)) {
                        return false;
                    }
                } else if (!isParseableIPv6Segment(strConcat, i10, iIndexOf)) {
                    return false;
                }
            } else {
                if (iIndexOf != 1 && iIndexOf != strConcat.length() - 1 && z10) {
                    return false;
                }
                z10 = true;
            }
            i10 = iIndexOf + 1;
            i11++;
        }
        return i11 == 8 || z10;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int iIndexOf = str.indexOf("/");
        if (iIndexOf < 1) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        return isValidIPv6(strSubstring) && (isValidIPv6(strSubstring2) || isParseableIPv6Mask(strSubstring2));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
