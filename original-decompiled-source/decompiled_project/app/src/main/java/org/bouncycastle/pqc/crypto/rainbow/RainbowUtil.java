package org.bouncycastle.pqc.crypto.rainbow;

import ad.k;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RainbowUtil {
    public static short[][] cloneArray(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr2[i10] = Arrays.clone(sArr[i10]);
        }
        return sArr2;
    }

    public static byte[] convertArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            bArr[i10] = (byte) sArr[i10];
        }
        return bArr;
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= sArr[length] == sArr2[length];
        }
        return z10;
    }

    public static short[][][] generate_random(SecureRandom secureRandom, int i10, int i11, int i12, boolean z10) {
        byte[] bArr = new byte[z10 ? (((i11 + 1) * i11) / 2) * i10 : i10 * i11 * i12];
        secureRandom.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i10, i11, i12);
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            for (int i15 = 0; i15 < i12; i15++) {
                for (int i16 = 0; i16 < i10; i16++) {
                    if (!z10 || i14 <= i15) {
                        sArr[i16][i14][i15] = (short) (bArr[i13] & 255);
                        i13++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][] generate_random_2d(SecureRandom secureRandom, int i10, int i11) {
        byte[] bArr = new byte[i10 * i11];
        secureRandom.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sArr[i13][i12] = (short) (bArr[(i12 * i10) + i13] & 255);
            }
        }
        return sArr;
    }

    public static byte[] getEncoded(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                bArr[(i10 * length) + i11] = (byte) sArr[i11][i10];
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, int i10) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        if (i10 == digestSize) {
            return bArr2;
        }
        if (i10 < digestSize) {
            return Arrays.copyOf(bArr2, i10);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, digestSize);
        while (true) {
            i10 -= digestSize;
            if (i10 < digestSize) {
                break;
            }
            digest.update(bArr2, 0, digestSize);
            bArr2 = new byte[digestSize];
            digest.doFinal(bArr2, 0);
            bArrCopyOf = Arrays.concatenate(bArrCopyOf, bArr2);
        }
        if (i10 <= 0) {
            return bArrCopyOf;
        }
        digest.update(bArr2, 0, digestSize);
        byte[] bArr3 = new byte[digestSize];
        digest.doFinal(bArr3, 0);
        int length = bArrCopyOf.length;
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, length + i10);
        System.arraycopy(bArr3, 0, bArrCopyOf2, length, i10);
        return bArrCopyOf2;
    }

    public static int loadEncoded(short[][] sArr, byte[] bArr, int i10) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length; i12++) {
                sArr[i12][i11] = (short) (bArr[k.b(i11, length, i10, i12)] & 255);
            }
        }
        return length * length2;
    }

    public static short[][][] cloneArray(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = Arrays.clone(sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public static short[] convertArray(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sArr[i10] = (short) (bArr[i10] & 255);
        }
        return sArr;
    }

    public static boolean equals(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }

    public static byte[] getEncoded(short[][][] sArr, boolean z10) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z10 ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i10 = 0;
        for (int i11 = 0; i11 < length2; i11++) {
            for (int i12 = 0; i12 < length3; i12++) {
                for (short[][] sArr3 : sArr) {
                    if (!z10 || i11 <= i12) {
                        bArr[i10] = (byte) sArr3[i11][i12];
                        i10++;
                    }
                }
            }
        }
        return bArr;
    }

    public static byte[] hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int digestSize = digest.getDigestSize();
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        if (bArr3.length == digestSize) {
            digest.doFinal(bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[digestSize];
        digest.doFinal(bArr4, 0);
        if (bArr3.length < digestSize) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr3.length);
            return bArr3;
        }
        System.arraycopy(bArr4, 0, bArr3, 0, digestSize);
        int length = bArr3.length - digestSize;
        int i10 = digestSize;
        while (length >= digestSize) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i10, digestSize);
            length -= digestSize;
            i10 += digestSize;
        }
        if (length > 0) {
            digest.update(bArr4, 0, digestSize);
            digest.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i10, length);
        }
        return bArr3;
    }

    public static int loadEncoded(short[][][] sArr, byte[] bArr, int i10, boolean z10) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            for (int i13 = 0; i13 < length2; i13++) {
                for (short[][] sArr3 : sArr) {
                    if (!z10 || i12 <= i13) {
                        sArr3[i12][i13] = (short) (bArr[i11 + i10] & 255);
                        i11++;
                    }
                }
            }
        }
        return i11;
    }

    public static boolean equals(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            zEquals &= equals(sArr[length], sArr2[length]);
        }
        return zEquals;
    }
}
