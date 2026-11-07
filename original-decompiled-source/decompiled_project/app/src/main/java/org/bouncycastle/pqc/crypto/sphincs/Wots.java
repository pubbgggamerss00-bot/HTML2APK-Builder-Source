package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.DataLengthException;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    private static void clear(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 != i11; i12++) {
            bArr[i12 + i10] = 0;
        }
    }

    public static void expand_seed(byte[] bArr, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalArgumentException {
        clear(bArr, i10, WOTS_SIGBYTES);
        Seed.prg(bArr, i10, 2144L, bArr2, i11);
    }

    public static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14 + i10] = bArr2[i14 + i11];
        }
        for (int i15 = 0; i15 < i13 && i15 < 16; i15++) {
            hashFunctions.hash_n_n_mask(bArr, i10, bArr, i10, bArr3, (i15 * 32) + i12);
        }
    }

    public void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        expand_seed(bArr, i10, bArr2, i11);
        for (int i13 = 0; i13 < 67; i13++) {
            int i14 = (i13 * 32) + i10;
            gen_chain(hashFunctions, bArr, i14, bArr, i14, bArr3, i12, 15);
        }
    }

    public void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws DataLengthException, IllegalArgumentException {
        int[] iArr = new int[67];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 64) {
            byte b10 = bArr2[i12 / 2];
            iArr[i12] = b10 & RegisterType.DOUBLE_HI;
            int i14 = (b10 & 255) >>> 4;
            iArr[i12 + 1] = i14;
            i13 = (15 - i14) + (15 - iArr[i12]) + i13;
            i12 += 2;
        }
        while (i12 < 67) {
            iArr[i12] = i13 & 15;
            i13 >>>= 4;
            i12++;
        }
        byte[] bArr5 = bArr;
        expand_seed(bArr5, i10, bArr3, 0);
        while (i11 < 67) {
            int i15 = (i11 * 32) + i10;
            gen_chain(hashFunctions, bArr5, i15, bArr, i15, bArr4, 0, iArr[i11]);
            i11++;
            bArr5 = bArr;
        }
    }

    public void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i11 = 0;
        int i12 = 0;
        while (i11 < 64) {
            byte b10 = bArr3[i11 / 2];
            iArr[i11] = b10 & RegisterType.DOUBLE_HI;
            int i13 = (b10 & 255) >>> 4;
            iArr[i11 + 1] = i13;
            i12 = (15 - i13) + (15 - iArr[i11]) + i12;
            i11 += 2;
        }
        while (i11 < 67) {
            iArr[i11] = i12 & 15;
            i12 >>>= 4;
            i11++;
        }
        for (int i14 = 0; i14 < 67; i14++) {
            int i15 = i14 * 32;
            int i16 = iArr[i14];
            gen_chain(hashFunctions, bArr, i15, bArr2, i10 + i15, bArr4, i16 * 32, 15 - i16);
        }
    }
}
