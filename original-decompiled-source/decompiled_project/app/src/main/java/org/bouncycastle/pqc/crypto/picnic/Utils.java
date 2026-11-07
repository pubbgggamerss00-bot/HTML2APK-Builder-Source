package org.bouncycastle.pqc.crypto.picnic;

import m.b;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
class Utils {
    public static int ceil_log2(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 32 - nlz(i10 - 1);
    }

    public static byte getBit(byte[] bArr, int i10) {
        return (byte) ((bArr[i10 >>> 3] >>> ((i10 & 7) ^ 7)) & 1);
    }

    public static int getBitFromWordArray(int[] iArr, int i10) {
        return getBit(iArr, i10);
    }

    public static byte getCrumbAligned(byte[] bArr, int i10) {
        int i11 = bArr[i10 >>> 2] >>> (((i10 << 1) & 6) ^ 6);
        return (byte) (((i11 & 2) >> 1) | ((i11 & 1) << 1));
    }

    public static int getTrailingBitsMask(int i10) {
        int i11 = i10 & (-8);
        int i12 = ~((-1) << i11);
        int i13 = i10 & 7;
        return i13 != 0 ? (((65280 >>> i13) & 255) << i11) ^ i12 : i12;
    }

    private static int nlz(int i10) {
        int i11;
        if (i10 == 0) {
            return 32;
        }
        if ((i10 >>> 16) == 0) {
            i10 <<= 16;
            i11 = 17;
        } else {
            i11 = 1;
        }
        if ((i10 >>> 24) == 0) {
            i11 += 8;
            i10 <<= 8;
        }
        if ((i10 >>> 28) == 0) {
            i11 += 4;
            i10 <<= 4;
        }
        if ((i10 >>> 30) == 0) {
            i11 += 2;
            i10 <<= 2;
        }
        return i11 - (i10 >>> 31);
    }

    public static int numBytes(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return b.a(i10, 1, 8, 1);
    }

    public static int parity(byte[] bArr, int i10) {
        byte b10 = bArr[0];
        for (int i11 = 1; i11 < i10; i11++) {
            b10 = (byte) (b10 ^ bArr[i11]);
        }
        return Integers.bitCount(b10 & 255) & 1;
    }

    public static int parity16(int i10) {
        return Integers.bitCount(i10 & 65535) & 1;
    }

    public static int parity32(int i10) {
        return Integers.bitCount(i10) & 1;
    }

    public static int setBit(int i10, int i11, int i12) {
        int i13 = i11 ^ 7;
        return (i10 & (~(1 << i13))) | (i12 << i13);
    }

    public static void setBitInWordArray(int[] iArr, int i10, int i11) {
        setBit(iArr, i10, i11);
    }

    public static void zeroTrailingBits(int[] iArr, int i10) {
        if ((i10 & 31) != 0) {
            int i11 = i10 >>> 5;
            iArr[i11] = getTrailingBitsMask(i10) & iArr[i11];
        }
    }

    public static int getBit(int i10, int i11) {
        return (i10 >>> (i11 ^ 7)) & 1;
    }

    public static void setBit(byte[] bArr, int i10, byte b10) {
        int i11 = i10 >>> 3;
        int i12 = (i10 & 7) ^ 7;
        bArr[i11] = (byte) ((b10 << i12) | (bArr[i11] & (~(1 << i12))));
    }

    public static int getBit(int[] iArr, int i10) {
        return (iArr[i10 >>> 5] >>> ((i10 & 31) ^ 7)) & 1;
    }

    public static void setBit(int[] iArr, int i10, int i11) {
        int i12 = i10 >>> 5;
        int i13 = (i10 & 31) ^ 7;
        iArr[i12] = (i11 << i13) | (iArr[i12] & (~(1 << i13)));
    }
}
