package org.bouncycastle.math.ec.rfc8032;

/* loaded from: classes3.dex */
abstract class Codec {
    public static int decode16(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static int decode24(byte[] bArr, int i10) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public static int decode32(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void encode24(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
    }

    public static void encode32(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    public static void encode56(long j10, byte[] bArr, int i10) {
        encode32((int) j10, bArr, i10);
        encode24((int) (j10 >>> 32), bArr, i10 + 4);
    }

    public static void decode32(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = decode32(bArr, (i13 * 4) + i10);
        }
    }

    public static void encode32(int[] iArr, int i10, int i11, byte[] bArr, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            encode32(iArr[i10 + i13], bArr, (i13 * 4) + i12);
        }
    }
}
