package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class ReedMuller {

    public static class Codeword {
        int[] type32 = new int[4];
        int[] type8 = new int[16];
    }

    private static int Bit0Mask(int i10) {
        return -(i10 & 1);
    }

    public static void decode(byte[] bArr, long[] jArr, int i10, int i11) {
        byte[] bArrClone = Arrays.clone(bArr);
        int length = jArr.length / 2;
        Codeword[] codewordArr = new Codeword[length];
        int[] iArr = new int[jArr.length * 2];
        Utils.fromLongArrayToByte32Array(iArr, jArr);
        for (int i12 = 0; i12 < length; i12++) {
            codewordArr[i12] = new Codeword();
            for (int i13 = 0; i13 < 4; i13++) {
                codewordArr[i12].type32[i13] = iArr[(i12 * 4) + i13];
            }
        }
        int[] iArr2 = new int[128];
        for (int i14 = 0; i14 < i10; i14++) {
            expandThenSum(iArr2, codewordArr, i14 * i11, i11);
            int[] iArr3 = new int[128];
            hadamardTransform(iArr2, iArr3);
            iArr3[0] = iArr3[0] - (i11 * 64);
            bArrClone[i14] = (byte) findPeaks(iArr3);
        }
        int[] iArr4 = new int[length * 4];
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int[] iArr5 = codewordArr[i16].type32;
            System.arraycopy(iArr5, 0, iArr4, i15, iArr5.length);
            i15 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr4);
        System.arraycopy(bArrClone, 0, bArr, 0, bArr.length);
    }

    public static void encode(long[] jArr, byte[] bArr, int i10, int i11) {
        byte[] bArrClone = Arrays.clone(bArr);
        int i12 = i10 * i11;
        Codeword[] codewordArr = new Codeword[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            codewordArr[i13] = new Codeword();
        }
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i14 * i11;
            encodeSub(codewordArr[i15], bArrClone[i14]);
            for (int i16 = 1; i16 < i11; i16++) {
                codewordArr[i15 + i16] = codewordArr[i15];
            }
        }
        int[] iArr = new int[i12 * 4];
        int i17 = 0;
        for (int i18 = 0; i18 < i12; i18++) {
            int[] iArr2 = codewordArr[i18].type32;
            System.arraycopy(iArr2, 0, iArr, i17, iArr2.length);
            i17 += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr);
    }

    public static void encodeSub(Codeword codeword, int i10) {
        int iBit0Mask = ((((Bit0Mask(i10 >> 7) ^ (Bit0Mask(i10) & (-1431655766))) ^ (Bit0Mask(i10 >> 1) & (-858993460))) ^ (Bit0Mask(i10 >> 2) & (-252645136))) ^ (Bit0Mask(i10 >> 3) & (-16711936))) ^ (Bit0Mask(i10 >> 4) & (-65536));
        codeword.type32[0] = iBit0Mask;
        int i11 = i10 >> 5;
        int iBit0Mask2 = iBit0Mask ^ Bit0Mask(i11);
        codeword.type32[1] = iBit0Mask2;
        int iBit0Mask3 = Bit0Mask(i10 >> 6) ^ iBit0Mask2;
        codeword.type32[3] = iBit0Mask3;
        codeword.type32[2] = iBit0Mask3 ^ Bit0Mask(i11);
    }

    private static void expandThenSum(int[] iArr, Codeword[] codewordArr, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            for (int i13 = 0; i13 < 32; i13++) {
                iArr[(i12 * 32) + i13] = (codewordArr[i10].type32[i12] >> i13) & 1;
            }
        }
        for (int i14 = 1; i14 < i11; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                for (int i16 = 0; i16 < 32; i16++) {
                    int i17 = (i15 * 32) + i16;
                    iArr[i17] = iArr[i17] + ((codewordArr[i14 + i10].type32[i15] >> i16) & 1);
                }
            }
        }
    }

    private static int findPeaks(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 128; i13++) {
            int i14 = iArr[i13];
            int i15 = i14 > 0 ? -1 : 0;
            int i16 = ((~i15) & (-i14)) | (i15 & i14);
            if (i16 > i12) {
                i10 = i14;
            }
            if (i16 > i12) {
                i11 = i13;
            }
            if (i16 > i12) {
                i12 = i16;
            }
        }
        return i11 | ((i10 > 0 ? 1 : 0) * 128);
    }

    private static void hadamardTransform(int[] iArr, int[] iArr2) {
        int[] iArrClone = Arrays.clone(iArr);
        int[] iArrClone2 = Arrays.clone(iArr2);
        int i10 = 0;
        while (i10 < 7) {
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = i11 * 2;
                int i13 = i12 + 1;
                iArrClone2[i11] = iArrClone[i12] + iArrClone[i13];
                iArrClone2[i11 + 64] = iArrClone[i12] - iArrClone[i13];
            }
            i10++;
            int[] iArr3 = iArrClone;
            iArrClone = iArrClone2;
            iArrClone2 = iArr3;
        }
        System.arraycopy(iArrClone2, 0, iArr, 0, iArr.length);
        System.arraycopy(iArrClone, 0, iArr2, 0, iArr2.length);
    }
}
