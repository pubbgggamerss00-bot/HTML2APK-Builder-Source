package mh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class s extends r {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(String str) {
        char c10;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        int length = str.length() - 1;
        int i11 = 0;
        while (true) {
            c10 = ' ';
            if (i11 > length || str.charAt(i11) > ' ') {
                break;
            }
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        while (length > i11 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i11) == '+' || str.charAt(i11) == '-') {
            i11++;
        }
        if (i11 > length) {
            return false;
        }
        if (str.charAt(i11) != '0') {
            z10 = true;
            z11 = false;
        } else {
            int i12 = i11 + 1;
            if (i12 > length) {
                return true;
            }
            if ((str.charAt(i12) | ' ') == 120) {
                int i13 = i11 + 2;
                int i14 = i13;
                while (true) {
                    if (i14 > length) {
                        z10 = z14;
                        break;
                    }
                    z10 = z14;
                    if (((str.charAt(i14) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i14++;
                    z14 = z10;
                }
                boolean z15 = i13 != i14 ? z10 : false;
                if (i14 <= length) {
                    if (str.charAt(i14) == '.') {
                        int i15 = i14 + 1;
                        int i16 = i15;
                        while (i16 <= length) {
                            char c11 = c10;
                            if (((str.charAt(i16) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i16++;
                            c10 = c11;
                        }
                        z13 = i15 != i16 ? z10 : false;
                        i14 = i16;
                    } else {
                        z13 = false;
                    }
                    if (z15 || z13) {
                        i11 = i14;
                    }
                    if (i11 != -1 || i11 > length) {
                        return false;
                    }
                    z11 = z10;
                }
                i11 = -1;
                if (i11 != -1) {
                }
                return false;
            }
        }
        if (!z11) {
            int i17 = i11;
            while (i17 <= length && ((str.charAt(i17) - '0') & 65535) < 10) {
                i17++;
            }
            boolean z16 = i11 != i17 ? z10 : false;
            if (i17 > length) {
                i11 = i17;
            } else {
                if (str.charAt(i17) == '.') {
                    int i18 = i17 + 1;
                    i10 = i18;
                    while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
                        i10++;
                    }
                    if (i18 != i10) {
                        z12 = z10;
                    }
                    if (!z16 || z12) {
                        i11 = i10;
                    } else {
                        String str2 = length == i10 + 2 ? "NaN" : length == i10 + 7 ? "Infinity" : null;
                        i11 = (str2 != null && x.v(str, str2, i10, false) == i10) ? length + 1 : -1;
                    }
                } else {
                    i10 = i17;
                }
                z12 = false;
                if (z16) {
                    i11 = i10;
                }
            }
            if (i11 == -1) {
                return false;
            }
            if (i11 > length) {
                return z10;
            }
        }
        int i19 = i11 + 1;
        int iCharAt = str.charAt(i11) | ' ';
        if (iCharAt != (z11 ? 112 : 101)) {
            if (z11 || (!(iCharAt == 102 || iCharAt == 100) || i19 <= length)) {
                return false;
            }
            return z10;
        }
        if (i19 > length) {
            return false;
        }
        if ((str.charAt(i19) == '+' || str.charAt(i19) == '-') && (i19 = i11 + 2) > length) {
            return false;
        }
        while (i19 <= length && ((str.charAt(i19) - '0') & 65535) < 10) {
            i19++;
        }
        if (i19 > length) {
            return z10;
        }
        if (i19 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i19) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z10;
        }
        return false;
    }

    public static final void f(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer g(String str) {
        boolean z10;
        int i10;
        int i11;
        kotlin.jvm.internal.r.e(str, "<this>");
        g8.w.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (kotlin.jvm.internal.r.f(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = PKIFailureInfo.systemUnavail;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long h(String str) {
        boolean z10;
        kotlin.jvm.internal.r.e(str, "<this>");
        g8.w.h(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (kotlin.jvm.internal.r.f(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j10 / 10;
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * 10;
            long j14 = iDigit;
            if (j13 < j10 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
