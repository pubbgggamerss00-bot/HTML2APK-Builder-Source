package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6761a;

    public static class a {
        public static boolean a(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11) throws z;

        public abstract int b(String str, byte[] bArr, int i10, int i11);

        public final boolean c(byte[] bArr, int i10, int i11) {
            return d(bArr, i10, i11) == 0;
        }

        public abstract int d(byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final String a(byte[] bArr, int i10, int i11) throws z {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    while (i14 < i12) {
                        byte b12 = bArr[i14];
                        if (b12 < 0) {
                            break;
                        }
                        i14++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                    i13 = i15;
                    i10 = i14;
                } else if (b11 < -32) {
                    if (i14 >= i12) {
                        throw z.b();
                    }
                    i10 += 2;
                    byte b13 = bArr[i14];
                    int i16 = i13 + 1;
                    if (b11 < -62 || a.a(b13)) {
                        throw z.b();
                    }
                    cArr[i13] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                    i13 = i16;
                } else {
                    if (b11 >= -16) {
                        if (i14 >= i12 - 2) {
                            throw z.b();
                        }
                        byte b14 = bArr[i14];
                        int i17 = i10 + 3;
                        byte b15 = bArr[i10 + 2];
                        i10 += 4;
                        byte b16 = bArr[i17];
                        int i18 = i13 + 1;
                        if (!a.a(b14)) {
                            if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && !a.a(b15) && !a.a(b16)) {
                                int i19 = ((b14 & 63) << 12) | ((b11 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                                cArr[i13] = (char) ((i19 >>> 10) + 55232);
                                cArr[i18] = (char) ((i19 & 1023) + 56320);
                                i13 += 2;
                            }
                        }
                        throw z.b();
                    }
                    if (i14 >= i12 - 1) {
                        throw z.b();
                    }
                    int i20 = i10 + 2;
                    byte b17 = bArr[i14];
                    i10 += 3;
                    byte b18 = bArr[i20];
                    int i21 = i13 + 1;
                    if (a.a(b17) || ((b11 == -32 && b17 < -96) || ((b11 == -19 && b17 >= -96) || a.a(b18)))) {
                        throw z.b();
                    }
                    cArr[i13] = (char) (((b17 & 63) << 6) | ((b11 & RegisterType.DOUBLE_HI) << 12) | (b18 & 63));
                    i13 = i21;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
                }
                i15++;
            }
            return i16;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final int d(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    i10 = i12;
                } else if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 < -62) {
                        return -1;
                    }
                    i10 += 2;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                } else if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        return s1.a(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 > -65) {
                        return -1;
                    }
                    if (b10 == -32 && b11 < -96) {
                        return -1;
                    }
                    if (b10 == -19 && b11 >= -96) {
                        return -1;
                    }
                    i10 += 3;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                } else {
                    if (i12 >= i11 - 2) {
                        return s1.a(bArr, i12, i11);
                    }
                    int i14 = i10 + 2;
                    byte b12 = bArr[i12];
                    if (b12 > -65) {
                        return -1;
                    }
                    if ((((b12 + 112) + (b10 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i15 = i10 + 3;
                    if (bArr[i14] > -65) {
                        return -1;
                    }
                    i10 += 4;
                    if (bArr[i15] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super(e1.c.a(i10, i11, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class e extends b {
        public static int e(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                b bVar = s1.f6761a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return s1.c(i10, r1.g(bArr, j10));
            }
            if (i11 == 2) {
                return s1.d(i10, r1.g(bArr, j10), r1.g(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final String a(byte[] bArr, int i10, int i11) throws z {
            Charset charset = y.f6818a;
            String str = new String(bArr, i10, i11, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw z.b();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final int b(String str, byte[] bArr, int i10, int i11) {
            long j10;
            long j11;
            long j12;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                r1.k(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    r1.k(bArr, j13, (byte) cCharAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                r1.k(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                r1.k(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                r1.k(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                r1.k(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    r1.k(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    r1.k(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    r1.k(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    r1.k(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    r1.k(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.s1.b
        public final int d(byte[] bArr, int i10, int i11) {
            int i12;
            if ((i10 | i11 | (bArr.length - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long j10 = i10;
            int i13 = (int) (i11 - j10);
            if (i13 >= 16) {
                int i14 = 8 - (((int) j10) & 7);
                long j11 = j10;
                i12 = 0;
                while (true) {
                    if (i12 >= i14) {
                        while (true) {
                            int i15 = i12 + 8;
                            if (i15 > i13) {
                                break;
                            }
                            if ((r1.f6751c.h(bArr, r1.f6754f + j11) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j11 += 8;
                            i12 = i15;
                        }
                        while (true) {
                            if (i12 >= i13) {
                                i12 = i13;
                                break;
                            }
                            long j12 = j11 + 1;
                            if (r1.g(bArr, j11) < 0) {
                                break;
                            }
                            i12++;
                            j11 = j12;
                        }
                    } else {
                        long j13 = j11 + 1;
                        if (r1.g(bArr, j11) < 0) {
                            break;
                        }
                        i12++;
                        j11 = j13;
                    }
                }
            } else {
                i12 = 0;
            }
            int i16 = i13 - i12;
            long j14 = j10 + i12;
            while (true) {
                byte bG = 0;
                while (true) {
                    if (i16 <= 0) {
                        break;
                    }
                    long j15 = j14 + 1;
                    bG = r1.g(bArr, j14);
                    if (bG < 0) {
                        j14 = j15;
                        break;
                    }
                    i16--;
                    j14 = j15;
                }
                if (i16 == 0) {
                    return 0;
                }
                int i17 = i16 - 1;
                if (bG < -32) {
                    if (i17 == 0) {
                        return bG;
                    }
                    i16 -= 2;
                    if (bG < -62) {
                        return -1;
                    }
                    long j16 = j14 + 1;
                    if (r1.g(bArr, j14) > -65) {
                        return -1;
                    }
                    j14 = j16;
                } else if (bG < -16) {
                    if (i17 < 2) {
                        return e(bArr, bG, j14, i17);
                    }
                    i16 -= 3;
                    long j17 = j14 + 1;
                    byte bG2 = r1.g(bArr, j14);
                    if (bG2 > -65) {
                        return -1;
                    }
                    if (bG == -32 && bG2 < -96) {
                        return -1;
                    }
                    if (bG == -19 && bG2 >= -96) {
                        return -1;
                    }
                    j14 += 2;
                    if (r1.g(bArr, j17) > -65) {
                        return -1;
                    }
                } else {
                    if (i17 < 3) {
                        return e(bArr, bG, j14, i17);
                    }
                    i16 -= 4;
                    long j18 = j14 + 1;
                    byte bG3 = r1.g(bArr, j14);
                    if (bG3 > -65) {
                        return -1;
                    }
                    if ((((bG3 + 112) + (bG << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j19 = 2 + j14;
                    if (r1.g(bArr, j18) > -65) {
                        return -1;
                    }
                    j14 += 3;
                    if (r1.g(bArr, j19) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f6761a = (r1.f6753e && r1.f6752d && !com.google.crypto.tink.shaded.protobuf.d.a()) ? new e() : new c();
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return c(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return d(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new d(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
