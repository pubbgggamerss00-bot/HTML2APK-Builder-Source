package org.bouncycastle.pqc.crypto.falcon;

/* loaded from: classes3.dex */
class FalconConversions {
    private int toUnsignedInt(byte b10) {
        return b10 & 255;
    }

    private long toUnsignedLong(byte b10) {
        return b10 & 255;
    }

    public int bytes_to_int(byte[] bArr, int i10) {
        return (toUnsignedInt(bArr[i10 + 3]) << 24) | toUnsignedInt(bArr[i10]) | (toUnsignedInt(bArr[i10 + 1]) << 8) | (toUnsignedInt(bArr[i10 + 2]) << 16);
    }

    public int[] bytes_to_int_array(byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = bytes_to_int(bArr, (i12 * 4) + i10);
        }
        return iArr;
    }

    public long bytes_to_long(byte[] bArr, int i10) {
        return (toUnsignedLong(bArr[i10 + 7]) << 56) | toUnsignedLong(bArr[i10]) | (toUnsignedLong(bArr[i10 + 1]) << 8) | (toUnsignedLong(bArr[i10 + 2]) << 16) | (toUnsignedLong(bArr[i10 + 3]) << 24) | (toUnsignedLong(bArr[i10 + 4]) << 32) | (toUnsignedLong(bArr[i10 + 5]) << 40) | (toUnsignedLong(bArr[i10 + 6]) << 48);
    }

    public byte[] int_to_bytes(int i10) {
        return new byte[]{(byte) i10, (byte) (i10 >>> 8), (byte) (i10 >>> 16), (byte) (i10 >>> 24)};
    }

    public byte[] long_to_bytes(long j10) {
        return new byte[]{(byte) j10, (byte) (j10 >>> 8), (byte) (j10 >>> 16), (byte) (j10 >>> 24), (byte) (j10 >>> 32), (byte) (j10 >>> 40), (byte) (j10 >>> 48), (byte) (j10 >>> 56)};
    }
}
