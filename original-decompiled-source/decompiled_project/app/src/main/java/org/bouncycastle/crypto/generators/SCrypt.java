package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import r1.f;

/* loaded from: classes2.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i10) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = i10 * 2; i13 > 0; i13--) {
            Xor(iArr2, iArr, i11, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i12, 16);
            i12 = (length + i11) - i12;
            i11 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        int i14 = i11 * 128;
        byte[] bArrSingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i12 * i14);
        int[] iArr = null;
        try {
            int length = bArrSingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(bArrSingleIterationPBKDF2, 0, iArr);
            int i15 = 0;
            for (int i16 = i10 * i11; i10 - i15 > 2 && i16 > 1024; i16 >>>= 1) {
                i15++;
            }
            int i17 = i14 >>> 2;
            for (int i18 = 0; i18 < length; i18 += i17) {
                SMix(iArr, i18, i10, i15, i11);
            }
            Pack.intToLittleEndian(iArr, bArrSingleIterationPBKDF2, 0);
            byte[] bArrSingleIterationPBKDF22 = SingleIterationPBKDF2(bArr, bArrSingleIterationPBKDF2, i13);
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            return bArrSingleIterationPBKDF22;
        } catch (Throwable th2) {
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            throw th2;
        }
    }

    private static void SMix(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 >>> i12;
        int i15 = 1 << i12;
        int i16 = i14 - 1;
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i11) - i12;
        int i17 = i13 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i17];
        int[] iArr5 = new int[i17];
        int[][] iArr6 = new int[i15][];
        try {
            System.arraycopy(iArr, i10, iArr5, 0, i17);
            int i18 = 0;
            while (i18 < i15) {
                int[] iArr7 = new int[i14 * i17];
                iArr6[i18] = iArr7;
                int i19 = iNumberOfTrailingZeros;
                int i20 = i15;
                int i21 = 0;
                for (int i22 = 0; i22 < i14; i22 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i21, i17);
                    int i23 = i21 + i17;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i13);
                    System.arraycopy(iArr4, 0, iArr7, i23, i17);
                    i21 = i23 + i17;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i13);
                }
                i18++;
                iNumberOfTrailingZeros = i19;
                i15 = i20;
            }
            int i24 = iNumberOfTrailingZeros;
            int i25 = i11 - 1;
            for (int i26 = 0; i26 < i11; i26++) {
                int i27 = iArr5[i17 - 16] & i25;
                System.arraycopy(iArr6[i27 >>> i24], (i27 & i16) * i17, iArr4, 0, i17);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i13);
            }
            System.arraycopy(iArr5, 0, iArr, i10, i17);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th2) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th2;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i10) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(SHA256Digest.newInstance());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i10 * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i10, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i10 + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i10 <= 1 || !isPowerOf2(i10)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i11 == 1 && i10 >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i14 = Integer.MAX_VALUE / (i11 * 1024);
        if (i12 < 1 || i12 > i14) {
            throw new IllegalArgumentException(f.a(i14, i11, "Parallelisation parameter p must be >= 1 and <= ", " (based on block size r of ", ")"));
        }
        if (i13 >= 1) {
            return MFcrypt(bArr, bArr2, i10, i11, i12, i13);
        }
        throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
    }

    private static boolean isPowerOf2(int i10) {
        return (i10 & (i10 + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
