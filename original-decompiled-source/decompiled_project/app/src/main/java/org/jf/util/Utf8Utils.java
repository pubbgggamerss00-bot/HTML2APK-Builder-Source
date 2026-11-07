package org.jf.util;

import org.bouncycastle.asn1.BERTags;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public final class Utf8Utils {
    private static final ThreadLocal<char[]> localBuffer = new ThreadLocal<char[]>() { // from class: org.jf.util.Utf8Utils.1
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[256];
        }
    };

    public static byte[] stringToUtf8Bytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else if (cCharAt < 2048) {
                bArr[i10] = (byte) (((cCharAt >> 6) & 31) | 192);
                bArr[i10 + 1] = (byte) ((cCharAt & '?') | 128);
                i10 += 2;
            } else {
                bArr[i10] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i10 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt & '?') | 128);
                i10 += 3;
            }
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    private static String throwBadUtf8(int i10, int i11) {
        throw new IllegalArgumentException("bad utf-8 byte " + Hex.u1(i10) + " at offset " + Hex.u4(i11));
    }

    public static String utf8BytesToString(byte[] bArr, int i10, int i11) {
        char c10;
        int i12;
        ThreadLocal<char[]> threadLocal = localBuffer;
        char[] cArr = threadLocal.get();
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
            threadLocal.set(cArr);
        }
        int i13 = 0;
        while (i11 > 0) {
            byte b10 = bArr[i10];
            int i14 = b10 & 255;
            switch (i14 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i11--;
                    if (i14 != 0) {
                        c10 = (char) i14;
                        i10++;
                        break;
                    } else {
                        return throwBadUtf8(i14, i10);
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return throwBadUtf8(i14, i10);
                case 12:
                case 13:
                    i11 -= 2;
                    if (i11 < 0) {
                        return throwBadUtf8(i14, i10);
                    }
                    int i15 = i10 + 1;
                    byte b11 = bArr[i15];
                    int i16 = b11 & 255;
                    if ((b11 & 192) != 128) {
                        return throwBadUtf8(i16, i15);
                    }
                    int i17 = ((b10 & 31) << 6) | (b11 & 63);
                    if (i17 != 0 && i17 < 128) {
                        return throwBadUtf8(i16, i15);
                    }
                    c10 = (char) i17;
                    i10 += 2;
                    break;
                case 14:
                    i11 -= 3;
                    if (i11 < 0) {
                        return throwBadUtf8(i14, i10);
                    }
                    int i18 = i10 + 1;
                    byte b12 = bArr[i18];
                    int i19 = b12 & 255;
                    if ((b12 & 192) != 128) {
                        return throwBadUtf8(i19, i18);
                    }
                    int i20 = i10 + 2;
                    byte b13 = bArr[i20];
                    int i21 = b13 & 255;
                    if ((b13 & 192) == 128 && (i12 = ((b10 & RegisterType.DOUBLE_HI) << 12) | ((b12 & 63) << 6) | (b13 & 63)) >= 2048) {
                        c10 = (char) i12;
                        i10 += 3;
                        break;
                    }
                    return throwBadUtf8(i21, i20);
            }
            cArr[i13] = c10;
            i13++;
        }
        return new String(cArr, 0, i13);
    }

    public static String utf8BytesWithUtf16LengthToString(byte[] bArr, int i10, int i11) {
        return utf8BytesWithUtf16LengthToString(bArr, i10, i11, null);
    }

    public static String utf8BytesWithUtf16LengthToString(byte[] bArr, int i10, int i11, int[] iArr) {
        char c10;
        ThreadLocal<char[]> threadLocal = localBuffer;
        char[] cArr = threadLocal.get();
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
            threadLocal.set(cArr);
        }
        int i12 = i10;
        int i13 = 0;
        while (i11 > 0) {
            byte b10 = bArr[i12];
            int i14 = b10 & 255;
            switch (i14 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (i14 != 0) {
                        c10 = (char) i14;
                        i12++;
                        break;
                    } else {
                        return throwBadUtf8(i14, i12);
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return throwBadUtf8(i14, i12);
                case 12:
                case 13:
                    int i15 = i12 + 1;
                    byte b11 = bArr[i15];
                    int i16 = b11 & 255;
                    if ((b11 & 192) != 128) {
                        return throwBadUtf8(i16, i15);
                    }
                    int i17 = ((b10 & 31) << 6) | (b11 & 63);
                    if (i17 != 0 && i17 < 128) {
                        return throwBadUtf8(i16, i15);
                    }
                    c10 = (char) i17;
                    i12 += 2;
                    break;
                case 14:
                    int i18 = i12 + 1;
                    byte b12 = bArr[i18];
                    int i19 = b12 & 255;
                    if ((b12 & 192) == 128) {
                        int i20 = i12 + 2;
                        byte b13 = bArr[i20];
                        int i21 = b13 & 255;
                        if ((b13 & 192) == 128) {
                            int i22 = ((b10 & RegisterType.DOUBLE_HI) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                            if (i22 >= 2048) {
                                c10 = (char) i22;
                                i12 += 3;
                                break;
                            } else {
                                return throwBadUtf8(i21, i20);
                            }
                        } else {
                            return throwBadUtf8(i21, i20);
                        }
                    } else {
                        return throwBadUtf8(i19, i18);
                    }
            }
            cArr[i13] = c10;
            i13++;
            i11--;
        }
        if (iArr != null && iArr.length > 0) {
            int i23 = i12 - i10;
            iArr[0] = i23;
            iArr[0] = i23;
        }
        return new String(cArr, 0, i13);
    }
}
