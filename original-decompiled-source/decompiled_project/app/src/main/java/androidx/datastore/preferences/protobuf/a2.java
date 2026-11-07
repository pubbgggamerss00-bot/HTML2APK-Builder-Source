package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1951a;

    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws e0 {
            if (!d(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !d(b12) && !d(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw e0.b();
        }

        public static void b(byte b10, byte b11, char[] cArr, int i10) throws e0 {
            if (b10 < -62 || d(b11)) {
                throw e0.b();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws e0 {
            if (d(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || d(b12)))) {
                throw e0.b();
            }
            cArr[i10] = (char) (((b10 & RegisterType.DOUBLE_HI) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }
    }

    public static abstract class b {
        public static String b(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (b10 < 0) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b12 = byteBuffer.get(i17);
                        if (b12 < 0) {
                            break;
                        }
                        i17++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (b11 < -32) {
                    if (i15 >= i12) {
                        throw e0.b();
                    }
                    i10 += 2;
                    a.b(b11, byteBuffer.get(i15), cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw e0.b();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.c(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw e0.b();
                    }
                    byte b13 = byteBuffer.get(i15);
                    int i19 = i10 + 3;
                    byte b14 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    a.a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        public abstract String a(byte[] bArr, int i10, int i11) throws e0;

        public abstract String c(ByteBuffer byteBuffer, int i10, int i11) throws e0;

        public abstract int d(String str, byte[] bArr, int i10, int i11);

        public abstract int e(byte[] bArr, int i10, int i11);
    }

    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final String a(byte[] bArr, int i10, int i11) throws e0 {
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
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b12 = bArr[i17];
                        if (b12 < 0) {
                            break;
                        }
                        i17++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (b11 < -32) {
                    if (i15 >= i12) {
                        throw e0.b();
                    }
                    i10 += 2;
                    a.b(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw e0.b();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.c(b11, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw e0.b();
                    }
                    byte b13 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    a.a(b11, b13, b14, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final String c(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            return b.b(byteBuffer, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final int d(String str, byte[] bArr, int i10, int i11) {
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

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final int e(byte[] bArr, int i10, int i11) {
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
                        return a2.a(bArr, i12, i11);
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
                        return a2.a(bArr, i12, i11);
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
        public static int f(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                b bVar = a2.f1951a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return a2.c(i10, z1.g(bArr, j10));
            }
            if (i11 == 2) {
                return a2.d(i10, z1.g(bArr, j10), z1.g(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final String a(byte[] bArr, int i10, int i11) throws e0 {
            Charset charset = d0.f2005a;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw e0.b();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final String c(ByteBuffer byteBuffer, int i10, int i11) throws e0 {
            long j10;
            byte bE;
            byte bE2;
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long j11 = z1.f2186c.j(byteBuffer, z1.f2190g) + i10;
            long j12 = i11 + j11;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (true) {
                j10 = 1;
                if (j11 >= j12 || (bE2 = z1.f2186c.e(j11)) < 0) {
                    break;
                }
                j11++;
                cArr[i12] = (char) bE2;
                i12++;
            }
            int i13 = i12;
            while (j11 < j12) {
                long j13 = j11 + j10;
                z1.e eVar = z1.f2186c;
                byte bE3 = eVar.e(j11);
                if (bE3 >= 0) {
                    int i14 = i13 + 1;
                    cArr[i13] = (char) bE3;
                    while (j13 < j12 && (bE = z1.f2186c.e(j13)) >= 0) {
                        j13 += j10;
                        cArr[i14] = (char) bE;
                        i14++;
                    }
                    i13 = i14;
                    j11 = j13;
                } else if (bE3 < -32) {
                    if (j13 >= j12) {
                        throw e0.b();
                    }
                    j11 += 2;
                    a.b(bE3, eVar.e(j13), cArr, i13);
                    i13++;
                } else if (bE3 < -16) {
                    if (j13 >= j12 - j10) {
                        throw e0.b();
                    }
                    long j14 = 2 + j11;
                    j11 += 3;
                    a.c(bE3, eVar.e(j13), eVar.e(j14), cArr, i13);
                    i13++;
                } else {
                    if (j13 >= j12 - 2) {
                        throw e0.b();
                    }
                    byte bE4 = eVar.e(j13);
                    long j15 = j11 + 3;
                    byte bE5 = eVar.e(2 + j11);
                    j11 += 4;
                    a.a(bE3, bE4, bE5, eVar.e(j15), cArr, i13);
                    i13 += 2;
                }
                j10 = 1;
            }
            return new String(cArr, 0, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final int d(String str, byte[] bArr, int i10, int i11) {
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
                z1.k(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    z1.k(bArr, j13, (byte) cCharAt2);
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
                                z1.k(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                z1.k(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                z1.k(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                z1.k(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    z1.k(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    z1.k(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    z1.k(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    z1.k(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    z1.k(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // androidx.datastore.preferences.protobuf.a2.b
        public final int e(byte[] bArr, int i10, int i11) {
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
                            if ((z1.f2186c.j(bArr, z1.f2189f + j11) & (-9187201950435737472L)) != 0) {
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
                            if (z1.g(bArr, j11) < 0) {
                                break;
                            }
                            i12++;
                            j11 = j12;
                        }
                    } else {
                        long j13 = j11 + 1;
                        if (z1.g(bArr, j11) < 0) {
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
                    bG = z1.g(bArr, j14);
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
                    if (z1.g(bArr, j14) > -65) {
                        return -1;
                    }
                    j14 = j16;
                } else if (bG < -16) {
                    if (i17 < 2) {
                        return f(bArr, bG, j14, i17);
                    }
                    i16 -= 3;
                    long j17 = j14 + 1;
                    byte bG2 = z1.g(bArr, j14);
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
                    if (z1.g(bArr, j17) > -65) {
                        return -1;
                    }
                } else {
                    if (i17 < 3) {
                        return f(bArr, bG, j14, i17);
                    }
                    i16 -= 4;
                    long j18 = j14 + 1;
                    byte bG3 = z1.g(bArr, j14);
                    if (bG3 > -65) {
                        return -1;
                    }
                    if ((((bG3 + 112) + (bG << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j19 = 2 + j14;
                    if (z1.g(bArr, j18) > -65) {
                        return -1;
                    }
                    j14 += 3;
                    if (z1.g(bArr, j19) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        f1951a = (z1.f2188e && z1.f2187d && !androidx.datastore.preferences.protobuf.c.a()) ? new e() : new c();
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
