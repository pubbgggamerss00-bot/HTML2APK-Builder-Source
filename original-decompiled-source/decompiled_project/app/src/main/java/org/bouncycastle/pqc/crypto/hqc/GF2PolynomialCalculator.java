package org.bouncycastle.pqc.crypto.hqc;

/* loaded from: classes3.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    public GF2PolynomialCalculator(int i10, int i11, long j10) {
        this.VEC_N_SIZE_64 = i10;
        this.PARAM_N = i11;
        this.RED_MASK = j10;
    }

    public static void addLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = jArr2[i10] ^ jArr3[i10];
        }
    }

    private void base_mul(long[] jArr, int i10, long j10, long j11) {
        int i11;
        long[] jArr2;
        int i12 = 16;
        int i13 = 0;
        long j12 = j11 & 1152921504606846975L;
        boolean z10 = true;
        long j13 = j12 << 1;
        long j14 = j13 ^ j12;
        long j15 = j12 << 2;
        long j16 = j15 ^ j12;
        long j17 = j14 << 1;
        long j18 = j17 ^ j12;
        long j19 = j12 << 3;
        long j20 = j16 << 1;
        long j21 = j14 << 2;
        long j22 = j18 << 1;
        long[] jArr3 = {0, j12, j13, j14, j15, j16, j17, j18, j19, j19 ^ j12, j20, j20 ^ j12, j21, j21 ^ j12, j22, j12 ^ j22};
        long j23 = 15;
        long j24 = j10 & 15;
        int i14 = 0;
        long j25 = 0;
        while (true) {
            i11 = i13;
            if (i14 >= 16) {
                break;
            }
            long j26 = j24 - i14;
            j25 ^= jArr3[i14] & (-(1 - ((j26 | (-j26)) >>> 63)));
            i14++;
            i13 = i11;
            j23 = j23;
        }
        long j27 = j23;
        byte b10 = 4;
        long j28 = 0;
        while (b10 < 64) {
            long j29 = (j10 >> b10) & j27;
            int i15 = i11;
            long j30 = 0;
            while (true) {
                jArr2 = jArr3;
                if (i15 < i12) {
                    long j31 = j29 - i15;
                    j30 ^= jArr2[i15] & (-(1 - ((j31 | (-j31)) >>> 63)));
                    i15++;
                    jArr3 = jArr2;
                    z10 = z10;
                    i12 = 16;
                }
            }
            j25 ^= j30 << b10;
            j28 ^= j30 >>> (64 - b10);
            b10 = (byte) (b10 + 4);
            jArr3 = jArr2;
            i12 = 16;
        }
        boolean z11 = z10;
        long[] jArr4 = new long[4];
        jArr4[i11] = -((j11 >> 60) & 1);
        jArr4[z11 ? 1 : 0] = -((j11 >> 61) & 1);
        jArr4[2] = -((j11 >> 62) & 1);
        jArr4[3] = -((j11 >> 63) & 1);
        long j32 = jArr4[i11];
        long j33 = jArr4[z11 ? 1 : 0];
        long j34 = jArr4[2];
        long j35 = jArr4[3];
        long j36 = (((j28 ^ (j32 & (j10 >>> 4))) ^ ((j10 >>> 3) & j33)) ^ ((j10 >>> 2) & j34)) ^ ((j10 >>> (z11 ? 1L : 0L)) & j35);
        jArr[i10] = (((((j10 << 60) & j32) ^ j25) ^ ((j10 << 61) & j33)) ^ ((j10 << 62) & j34)) ^ ((j10 << 63) & j35);
        jArr[i10 + 1] = j36;
    }

    private void karatsuba(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, int i13, long[] jArr4, int i14) {
        if (i13 == 1) {
            base_mul(jArr, i10, jArr2[i11], jArr3[i12]);
            return;
        }
        int i15 = i13 / 2;
        int i16 = (i13 + 1) / 2;
        int i17 = i14 + i16;
        int i18 = i17 + i16;
        int i19 = (i16 * 2) + i10;
        int i20 = (i16 * 4) + i14;
        karatsuba(jArr, i10, jArr2, i11, jArr3, i12, i16, jArr4, i20);
        karatsuba(jArr, i19, jArr2, i11 + i16, jArr3, i12 + i16, i15, jArr4, i20);
        karatsuba_add1(jArr4, i14, jArr4, i17, jArr2, i11, jArr3, i12, i16, i15);
        karatsuba(jArr4, i18, jArr4, i14, jArr4, i17, i16, jArr4, i20);
        karatsuba_add2(jArr, i10, jArr4, i18, jArr, i19, i16, i15);
    }

    private void karatsuba_add1(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i16 + i14;
            jArr[i16 + i10] = jArr3[i16 + i12] ^ jArr3[i17 + i12];
            jArr2[i16 + i11] = jArr4[i16 + i13] ^ jArr4[i17 + i13];
        }
        if (i15 < i14) {
            jArr[i10 + i15] = jArr3[i12 + i15];
            jArr2[i15 + i11] = jArr4[i15 + i13];
        }
    }

    private void karatsuba_add2(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, int i13, int i14) {
        int i15;
        int i16 = 0;
        while (true) {
            i15 = i13 * 2;
            if (i16 >= i15) {
                break;
            }
            int i17 = i16 + i11;
            jArr2[i17] = jArr2[i17] ^ jArr[i16 + i10];
            i16++;
        }
        for (int i18 = 0; i18 < i14 * 2; i18++) {
            int i19 = i18 + i11;
            jArr2[i19] = jArr2[i19] ^ jArr3[i18 + i12];
        }
        for (int i20 = 0; i20 < i15; i20++) {
            int i21 = i20 + i13 + i10;
            jArr[i21] = jArr[i21] ^ jArr2[i20 + i11];
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i10 = 0;
        while (true) {
            int i11 = this.VEC_N_SIZE_64;
            if (i10 >= i11) {
                int i12 = i11 - 1;
                jArr[i12] = jArr[i12] & this.RED_MASK;
                return;
            }
            long j10 = jArr2[(i10 + i11) - 1];
            int i13 = this.PARAM_N;
            jArr[i10] = (jArr2[i10] ^ (j10 >>> (i13 & 63))) ^ (jArr2[i11 + i10] << ((int) (64 - (i13 & 63))));
            i10++;
        }
    }

    public void multLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        int i10 = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[(i10 << 1) + 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i10, new long[i10 << 3], 0);
        reduce(jArr, jArr4);
    }
}
