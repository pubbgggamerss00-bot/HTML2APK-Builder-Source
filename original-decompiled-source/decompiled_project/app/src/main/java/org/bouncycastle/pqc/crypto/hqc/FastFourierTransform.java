package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: classes3.dex */
class FastFourierTransform {
    public static void computeFFTBetas(int[] iArr, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = i10 - 1;
            if (i11 >= i12) {
                return;
            }
            iArr[i11] = 1 << (i12 - i11);
            i11++;
        }
    }

    public static void computeFFTRec(int[] iArr, int[] iArr2, int i10, int i11, int i12, int[] iArr3, int i13, int i14) {
        int i15;
        int i16;
        int[] iArr4;
        int i17 = 1;
        int i18 = 1 << (i13 - 2);
        int i19 = i14 - 2;
        int i20 = 1 << i19;
        int[] iArr5 = new int[i18];
        int[] iArr6 = new int[i18];
        int[] iArr7 = new int[i19];
        int[] iArr8 = new int[i19];
        int[] iArr9 = new int[i20];
        int[] iArr10 = new int[i20];
        int[] iArr11 = new int[i20];
        int[] iArr12 = new int[(i14 - i13) + 1];
        if (i12 == 1) {
            for (int i21 = 0; i21 < i11; i21++) {
                iArr12[i21] = GFCalculator.mult(iArr3[i21], iArr2[1]);
            }
            iArr[0] = iArr2[0];
            for (int i22 = 0; i22 < i11; i22++) {
                for (int i23 = 0; i23 < i17; i23++) {
                    iArr[i17 + i23] = iArr[i23] ^ iArr12[i22];
                }
                i17 <<= 1;
            }
            return;
        }
        int i24 = i11 - 1;
        if (iArr3[i24] != 1) {
            int i25 = 1 << i12;
            i15 = 1;
            i16 = 0;
            int iMult = 1;
            while (true) {
                iArr4 = iArr8;
                if (i17 >= i25) {
                    break;
                }
                iMult = GFCalculator.mult(iMult, iArr3[i24]);
                iArr2[i17] = GFCalculator.mult(iMult, iArr2[i17]);
                i17++;
                iArr8 = iArr4;
            }
        } else {
            i15 = 1;
            i16 = 0;
            iArr4 = iArr8;
        }
        computeRadix(iArr5, iArr6, iArr2, i12, i13);
        for (int i26 = i16; i26 < i24; i26++) {
            int iMult2 = GFCalculator.mult(iArr3[i26], GFCalculator.inverse(iArr3[i24]));
            iArr7[i26] = iMult2;
            iArr4[i26] = GFCalculator.mult(iMult2, iMult2) ^ iArr7[i26];
        }
        computeSubsetSum(iArr9, iArr7, i24);
        int i27 = i12 - 1;
        int[] iArr13 = iArr4;
        computeFFTRec(iArr10, iArr5, (i10 + 1) / 2, i24, i27, iArr13, i13, i14);
        int i28 = i15 << (i24 & 15);
        if (i10 <= 3) {
            iArr[i16] = iArr10[i16];
            iArr[i28] = iArr10[i16] ^ iArr6[i16];
            for (int i29 = i15; i29 < i28; i29++) {
                int iMult3 = iArr10[i29] ^ GFCalculator.mult(iArr9[i29], iArr6[i16]);
                iArr[i29] = iMult3;
                iArr[i28 + i29] = iMult3 ^ iArr6[i16];
            }
            return;
        }
        computeFFTRec(iArr11, iArr6, i10 / 2, i24, i27, iArr13, i13, i14);
        int i30 = i16;
        System.arraycopy(iArr11, i30, iArr, i28, i28);
        iArr[i30] = iArr10[i30];
        iArr[i28] = iArr10[i30] ^ iArr[i28];
        for (int i31 = i15; i31 < i28; i31++) {
            int iMult4 = iArr10[i31] ^ GFCalculator.mult(iArr9[i31], iArr11[i31]);
            iArr[i31] = iMult4;
            int i32 = i28 + i31;
            iArr[i32] = iMult4 ^ iArr[i32];
        }
    }

    public static void computeRadix(int[] iArr, int[] iArr2, int[] iArr3, int i10, int i11) {
        if (i10 == 1) {
            iArr[0] = iArr3[0];
            iArr2[0] = iArr3[1];
            return;
        }
        if (i10 == 2) {
            iArr[0] = iArr3[0];
            int i12 = iArr3[2];
            int i13 = iArr3[3];
            int i14 = i12 ^ i13;
            iArr[1] = i14;
            iArr2[0] = i14 ^ iArr3[1];
            iArr2[1] = i13;
            return;
        }
        if (i10 == 3) {
            iArr[0] = iArr3[0];
            int i15 = iArr3[4];
            int i16 = iArr3[6];
            iArr[2] = i15 ^ i16;
            int i17 = iArr3[7];
            iArr[3] = i16 ^ i17;
            int i18 = iArr3[3];
            int i19 = iArr3[5];
            int i20 = (i18 ^ i19) ^ i17;
            iArr2[1] = i20;
            iArr2[2] = i19 ^ i16;
            iArr2[3] = i17;
            int i21 = (iArr3[2] ^ iArr[2]) ^ i20;
            iArr[1] = i21;
            iArr2[0] = i21 ^ iArr3[1];
            return;
        }
        if (i10 != 4) {
            computeRadixBig(iArr, iArr2, iArr3, i10, i11);
            return;
        }
        int i22 = iArr3[8];
        int i23 = iArr3[12];
        iArr[4] = i22 ^ i23;
        int i24 = iArr3[14];
        iArr[6] = i23 ^ i24;
        int i25 = iArr3[15];
        iArr[7] = i24 ^ i25;
        int i26 = iArr3[11];
        int i27 = iArr3[13];
        int i28 = i26 ^ i27;
        iArr2[5] = i28;
        iArr2[6] = i27 ^ i24;
        iArr2[7] = i25;
        int i29 = iArr3[10];
        int i30 = (i23 ^ i29) ^ i28;
        iArr[5] = i30;
        int i31 = iArr3[9];
        iArr2[4] = i30 ^ (i31 ^ i27);
        iArr[0] = iArr3[0];
        int i32 = (iArr3[7] ^ i26) ^ i25;
        iArr2[3] = i32;
        int i33 = (i24 ^ (iArr3[6] ^ i29)) ^ i32;
        iArr[3] = i33;
        int i34 = (iArr3[4] ^ iArr[4]) ^ i33;
        int i35 = iArr2[3];
        iArr[2] = i34 ^ i35;
        int i36 = iArr3[3];
        int i37 = (((iArr3[5] ^ i36) ^ i31) ^ i27) ^ i35;
        iArr2[1] = i37;
        iArr2[2] = i33 ^ (i36 ^ i37);
        int i38 = (iArr3[2] ^ iArr[2]) ^ i37;
        iArr[1] = i38;
        iArr2[0] = i38 ^ iArr3[1];
    }

    public static void computeRadixBig(int[] iArr, int[] iArr2, int[] iArr3, int i10, int i11) {
        int i12 = 1 << (i10 - 2);
        int i13 = 1 << (i11 - 2);
        int i14 = i13 * 2;
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[i13];
        int[] iArr7 = new int[i13];
        int[] iArr8 = new int[i13];
        int[] iArr9 = new int[i13];
        int i15 = i12 * 3;
        int i16 = i12 * 2;
        Utils.copyBytes(iArr3, i15, iArr4, 0, i16);
        Utils.copyBytes(iArr3, i15, iArr4, i12, i16);
        Utils.copyBytes(iArr3, 0, iArr5, 0, i12 * 4);
        for (int i17 = 0; i17 < i12; i17++) {
            int i18 = iArr4[i17] ^ iArr3[i16 + i17];
            iArr4[i17] = i18;
            int i19 = i12 + i17;
            iArr5[i19] = iArr5[i19] ^ i18;
        }
        int i20 = i10 - 1;
        computeRadix(iArr6, iArr7, iArr4, i20, i11);
        computeRadix(iArr8, iArr9, iArr5, i20, i11);
        Utils.copyBytes(iArr8, 0, iArr, 0, i16);
        Utils.copyBytes(iArr6, 0, iArr, i12, i16);
        Utils.copyBytes(iArr9, 0, iArr2, 0, i16);
        Utils.copyBytes(iArr7, 0, iArr2, i12, i16);
    }

    public static void computeSubsetSum(int[] iArr, int[] iArr2, int i10) {
        iArr[0] = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                int i13 = 1 << i11;
                if (i12 < i13) {
                    iArr[i13 + i12] = iArr2[i11] ^ iArr[i12];
                    i12++;
                }
            }
        }
    }

    public static void fastFourierTransform(int[] iArr, int[] iArr2, int i10, int i11) {
        int i12 = 1 << i11;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[128];
        int[] iArr7 = new int[128];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[128];
        computeFFTBetas(iArr8, 8);
        computeSubsetSum(iArr9, iArr8, 7);
        computeRadix(iArr3, iArr4, iArr2, i11, i11);
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = iArr8[i13];
            iArr5[i13] = GFCalculator.mult(i14, i14) ^ iArr8[i13];
        }
        int i15 = i11 - 1;
        computeFFTRec(iArr6, iArr3, (i10 + 1) / 2, 7, i15, iArr5, i11, 8);
        computeFFTRec(iArr7, iArr4, i10 / 2, 7, i15, iArr5, i11, 8);
        System.arraycopy(iArr7, 0, iArr, 128, 128);
        iArr[0] = iArr6[0];
        iArr[128] = iArr[128] ^ iArr6[0];
        for (int i16 = 1; i16 < 128; i16++) {
            int iMult = iArr6[i16] ^ GFCalculator.mult(iArr9[i16], iArr7[i16]);
            iArr[i16] = iMult;
            int i17 = 128 + i16;
            iArr[i17] = iMult ^ iArr[i17];
        }
    }

    public static void fastFourierTransformGetError(byte[] bArr, int[] iArr, int i10, int[] iArr2) {
        int[] iArr3 = new int[7];
        int[] iArr4 = new int[i10];
        computeFFTBetas(iArr3, 8);
        computeSubsetSum(iArr4, iArr3, 7);
        byte unsigned16Bits = (byte) (bArr[0] ^ (Utils.toUnsigned16Bits((-iArr[0]) >> 15) ^ 1));
        bArr[0] = unsigned16Bits;
        bArr[0] = (byte) (unsigned16Bits ^ (Utils.toUnsigned16Bits((-iArr[i10]) >> 15) ^ 1));
        for (int i11 = 1; i11 < i10; i11++) {
            int i12 = 255 - iArr2[iArr4[i11]];
            bArr[i12] = (byte) (bArr[i12] ^ (Math.abs((-iArr[i11]) >> 15) ^ 1));
            int i13 = 255 - iArr2[iArr4[i11] ^ 1];
            bArr[i13] = (byte) (bArr[i13] ^ (Math.abs((-iArr[i10 + i11]) >> 15) ^ 1));
        }
    }
}
