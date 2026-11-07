package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class LongPolynomial5 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial5(IntegerPolynomial integerPolynomial) {
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 4) / 5];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.numCoeffs; i12++) {
            long[] jArr = this.coeffs;
            jArr[i10] = jArr[i10] | (integerPolynomial.coeffs[i12] << i11);
            i11 += 12;
            if (i11 >= 60) {
                i10++;
                i11 = 0;
            }
        }
    }

    public LongPolynomial5 mult(TernaryPolynomial ternaryPolynomial) {
        long j10;
        int i10;
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 5, (((ternaryPolynomial.size() + 4) / 5) + this.coeffs.length) - 1);
        int[] ones = ternaryPolynomial.getOnes();
        for (int i11 = 0; i11 != ones.length; i11++) {
            int i12 = ones[i11];
            int i13 = i12 / 5;
            int i14 = i12 - (i13 * 5);
            int i15 = 0;
            while (true) {
                long[] jArr2 = this.coeffs;
                if (i15 < jArr2.length) {
                    long[] jArr3 = jArr[i14];
                    jArr3[i13] = (jArr3[i13] + jArr2[i15]) & 576319980446939135L;
                    i13++;
                    i15++;
                }
            }
        }
        int[] negOnes = ternaryPolynomial.getNegOnes();
        for (int i16 = 0; i16 != negOnes.length; i16++) {
            int i17 = negOnes[i16];
            int i18 = i17 / 5;
            int i19 = i17 - (i18 * 5);
            int i20 = 0;
            while (true) {
                long[] jArr4 = this.coeffs;
                if (i20 < jArr4.length) {
                    long[] jArr5 = jArr[i19];
                    jArr5[i18] = ((jArr5[i18] + 576601524159907840L) - jArr4[i20]) & 576319980446939135L;
                    i18++;
                    i20++;
                }
            }
        }
        long[] jArr6 = jArr[0];
        long[] jArrCopyOf = Arrays.copyOf(jArr6, jArr6.length + 1);
        for (int i21 = 1; i21 <= 4; i21++) {
            int i22 = i21 * 12;
            int i23 = 60 - i22;
            long j11 = (1 << i23) - 1;
            int length = jArr[i21].length;
            int i24 = 0;
            while (i24 < length) {
                long j12 = jArr[i21][i24];
                jArrCopyOf[i24] = (jArrCopyOf[i24] + ((j12 & j11) << i22)) & 576319980446939135L;
                i24++;
                jArrCopyOf[i24] = (jArrCopyOf[i24] + (j12 >> i23)) & 576319980446939135L;
            }
        }
        int i25 = (this.numCoeffs % 5) * 12;
        for (int length2 = this.coeffs.length - 1; length2 < jArrCopyOf.length; length2++) {
            long[] jArr7 = this.coeffs;
            if (length2 == jArr7.length - 1) {
                j10 = this.numCoeffs == 5 ? 0L : jArrCopyOf[length2] >> i25;
                i10 = 0;
            } else {
                j10 = jArrCopyOf[length2];
                i10 = (length2 * 5) - this.numCoeffs;
            }
            int i26 = i10 / 5;
            int i27 = i10 - (i26 * 5);
            long j13 = j10 << (i27 * 12);
            long j14 = j10 >> ((5 - i27) * 12);
            jArrCopyOf[i26] = (jArrCopyOf[i26] + j13) & 576319980446939135L;
            int i28 = i26 + 1;
            if (i28 < jArr7.length) {
                jArrCopyOf[i28] = (jArrCopyOf[i28] + j14) & 576319980446939135L;
            }
        }
        return new LongPolynomial5(jArrCopyOf, this.numCoeffs);
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.numCoeffs; i12++) {
            iArr[i12] = (int) ((this.coeffs[i10] >> i11) & 2047);
            i11 += 12;
            if (i11 >= 60) {
                i10++;
                i11 = 0;
            }
        }
        return new IntegerPolynomial(iArr);
    }

    private LongPolynomial5(long[] jArr, int i10) {
        this.coeffs = jArr;
        this.numCoeffs = i10;
    }
}
