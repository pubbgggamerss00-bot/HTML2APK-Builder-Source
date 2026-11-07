package org.bouncycastle.util;

/* loaded from: classes3.dex */
public class Bytes {
    public static final int BYTES = 1;
    public static final int SIZE = 8;

    public static void xor(int i10, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            bArr3[i13 + i14] = (byte) (bArr[i11 + i14] ^ bArr2[i12 + i14]);
        }
    }

    public static void xorTo(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + i13;
            bArr2[i14] = (byte) (bArr2[i14] ^ bArr[i11 + i13]);
        }
    }

    public static void xor(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    public static void xorTo(int i10, byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i11]);
        }
    }
}
