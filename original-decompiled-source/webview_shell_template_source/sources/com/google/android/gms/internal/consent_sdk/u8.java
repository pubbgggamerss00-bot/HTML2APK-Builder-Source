package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u8 {
    static {
        if (s8.f11892e && s8.f11891d) {
            int i6 = a6.f11630a;
        }
    }

    public static int a(String str, byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        char cCharAt;
        int length = str.length();
        int i11 = 0;
        while (true) {
            i8 = i6 + i7;
            if (i11 >= length || (i10 = i11 + i6) >= i8 || (cCharAt = str.charAt(i11)) >= 128) {
                break;
            }
            bArr[i10] = (byte) cCharAt;
            i11++;
        }
        if (i11 == length) {
            return i6 + length;
        }
        int i12 = i6 + i11;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 128 && i12 < i8) {
                bArr[i12] = (byte) cCharAt2;
                i12++;
            } else if (cCharAt2 < 2048 && i12 <= i8 - 2) {
                bArr[i12] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i12 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i12 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i12 > i8 - 3) {
                    if (i12 > i8 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i9 = i11 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i9)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new t8(i11, length);
                    }
                    int i13 = i11 + 1;
                    if (i13 != str.length()) {
                        char cCharAt3 = str.charAt(i13);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i14 = i12 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i14] = (byte) ((codePoint & 63) | 128);
                            i11 = i13;
                        } else {
                            i11 = i13;
                        }
                    }
                    throw new t8(i11 - 1, length);
                }
                bArr[i12] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i12 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i12 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i12 += 3;
            }
            i11++;
        }
        return i12;
    }

    public static int b(String str) {
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < length && str.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
                i7++;
            } else {
                int length2 = str.length();
                while (i7 < length2) {
                    char cCharAt2 = str.charAt(i7);
                    if (cCharAt2 < 2048) {
                        i6 += (127 - cCharAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i7) < 65536) {
                                throw new t8(i7, length2);
                            }
                            i7++;
                        }
                    }
                    i7++;
                }
                i8 += i6;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i8 + 4294967296L));
    }
}
