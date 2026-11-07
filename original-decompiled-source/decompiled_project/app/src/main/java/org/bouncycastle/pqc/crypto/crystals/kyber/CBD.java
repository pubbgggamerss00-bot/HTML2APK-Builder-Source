package org.bouncycastle.pqc.crypto.crystals.kyber;

/* loaded from: classes3.dex */
final class CBD {
    private static long convertByteTo24BitUnsignedInt(byte[] bArr, int i10) {
        return ((bArr[i10 + 2] & 255) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    private static long convertByteTo32BitUnsignedInt(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void kyberCBD(Poly poly, byte[] bArr, int i10) {
        if (i10 != 3) {
            for (int i11 = 0; i11 < 32; i11++) {
                long jConvertByteTo32BitUnsignedInt = convertByteTo32BitUnsignedInt(bArr, i11 * 4);
                long j10 = (jConvertByteTo32BitUnsignedInt & 1431655765) + ((jConvertByteTo32BitUnsignedInt >> 1) & 1431655765);
                for (int i12 = 0; i12 < 8; i12++) {
                    int i13 = i12 * 4;
                    poly.setCoeffIndex((i11 * 8) + i12, (short) (((short) ((j10 >> i13) & 3)) - ((short) (3 & (j10 >> (i13 + i10))))));
                }
            }
            return;
        }
        for (int i14 = 0; i14 < 64; i14++) {
            long jConvertByteTo24BitUnsignedInt = convertByteTo24BitUnsignedInt(bArr, i14 * 3);
            long j11 = (jConvertByteTo24BitUnsignedInt & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 1) & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 2) & 2396745);
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = i15 * 6;
                poly.setCoeffIndex((i14 * 4) + i15, (short) (((short) ((j11 >> i16) & 7)) - ((short) (7 & (j11 >> (i16 + 3))))));
            }
        }
    }
}
