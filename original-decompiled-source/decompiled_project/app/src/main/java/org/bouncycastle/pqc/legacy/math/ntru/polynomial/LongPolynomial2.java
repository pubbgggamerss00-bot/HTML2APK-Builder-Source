package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class LongPolynomial2 {
    private long[] coeffs;
    private int numCoeffs;

    private LongPolynomial2(int i10) {
        this.coeffs = new long[i10];
    }

    private void add(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i10 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i10 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i10] = (jArr4[i10] + jArr3[i10]) & 34342963199L;
            i10++;
        }
    }

    private LongPolynomial2 multRecursive(LongPolynomial2 longPolynomial2) {
        long[] jArr = this.coeffs;
        long[] jArr2 = longPolynomial2.coeffs;
        int length = jArr2.length;
        int i10 = 0;
        if (length <= 32) {
            int i11 = length * 2;
            LongPolynomial2 longPolynomial22 = new LongPolynomial2(new long[i11]);
            for (int i12 = 0; i12 < i11; i12++) {
                for (int iMax = Math.max(0, (i12 - length) + 1); iMax <= Math.min(i12, length - 1); iMax++) {
                    long j10 = jArr[i12 - iMax] * jArr2[iMax];
                    long[] jArr3 = longPolynomial22.coeffs;
                    jArr3[i12] = (jArr3[i12] + (j10 & ((j10 & 2047) + 34342961152L))) & 34342963199L;
                    int i13 = i12 + 1;
                    jArr3[i13] = (jArr3[i13] + ((j10 >>> 48) & 2047)) & 34342963199L;
                }
            }
            return longPolynomial22;
        }
        int i14 = length / 2;
        LongPolynomial2 longPolynomial23 = new LongPolynomial2(Arrays.copyOf(jArr, i14));
        LongPolynomial2 longPolynomial24 = new LongPolynomial2(Arrays.copyOfRange(jArr, i14, length));
        LongPolynomial2 longPolynomial25 = new LongPolynomial2(Arrays.copyOf(jArr2, i14));
        LongPolynomial2 longPolynomial26 = new LongPolynomial2(Arrays.copyOfRange(jArr2, i14, length));
        LongPolynomial2 longPolynomial27 = (LongPolynomial2) longPolynomial23.clone();
        longPolynomial27.add(longPolynomial24);
        LongPolynomial2 longPolynomial28 = (LongPolynomial2) longPolynomial25.clone();
        longPolynomial28.add(longPolynomial26);
        LongPolynomial2 longPolynomial2MultRecursive = longPolynomial23.multRecursive(longPolynomial25);
        LongPolynomial2 longPolynomial2MultRecursive2 = longPolynomial24.multRecursive(longPolynomial26);
        LongPolynomial2 longPolynomial2MultRecursive3 = longPolynomial27.multRecursive(longPolynomial28);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive);
        longPolynomial2MultRecursive3.sub(longPolynomial2MultRecursive2);
        LongPolynomial2 longPolynomial29 = new LongPolynomial2(length * 2);
        int i15 = 0;
        while (true) {
            long[] jArr4 = longPolynomial2MultRecursive.coeffs;
            if (i15 >= jArr4.length) {
                break;
            }
            longPolynomial29.coeffs[i15] = jArr4[i15] & 34342963199L;
            i15++;
        }
        int i16 = 0;
        while (true) {
            long[] jArr5 = longPolynomial2MultRecursive3.coeffs;
            if (i16 >= jArr5.length) {
                break;
            }
            long[] jArr6 = longPolynomial29.coeffs;
            int i17 = i14 + i16;
            jArr6[i17] = (jArr6[i17] + jArr5[i16]) & 34342963199L;
            i16++;
        }
        while (true) {
            long[] jArr7 = longPolynomial2MultRecursive2.coeffs;
            if (i10 >= jArr7.length) {
                return longPolynomial29;
            }
            long[] jArr8 = longPolynomial29.coeffs;
            int i18 = (i14 * 2) + i10;
            jArr8[i18] = (jArr8[i18] + jArr7[i10]) & 34342963199L;
            i10++;
        }
    }

    private void sub(LongPolynomial2 longPolynomial2) {
        long[] jArr = longPolynomial2.coeffs;
        int length = jArr.length;
        long[] jArr2 = this.coeffs;
        if (length > jArr2.length) {
            this.coeffs = Arrays.copyOf(jArr2, jArr.length);
        }
        int i10 = 0;
        while (true) {
            long[] jArr3 = longPolynomial2.coeffs;
            if (i10 >= jArr3.length) {
                return;
            }
            long[] jArr4 = this.coeffs;
            jArr4[i10] = 34342963199L & ((jArr4[i10] + 140737496743936L) - jArr3[i10]);
            i10++;
        }
    }

    public Object clone() {
        LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[]) this.coeffs.clone());
        longPolynomial2.numCoeffs = this.numCoeffs;
        return longPolynomial2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongPolynomial2) {
            return Arrays.areEqual(this.coeffs, ((LongPolynomial2) obj).coeffs);
        }
        return false;
    }

    public LongPolynomial2 mult(LongPolynomial2 longPolynomial2) {
        long[] jArr;
        long[] jArr2;
        int length = this.coeffs.length;
        if (longPolynomial2.coeffs.length != length || this.numCoeffs != longPolynomial2.numCoeffs) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        LongPolynomial2 longPolynomial2MultRecursive = multRecursive(longPolynomial2);
        if (longPolynomial2MultRecursive.coeffs.length > length) {
            if (this.numCoeffs % 2 == 0) {
                int i10 = length;
                while (true) {
                    jArr2 = longPolynomial2MultRecursive.coeffs;
                    if (i10 >= jArr2.length) {
                        break;
                    }
                    int i11 = i10 - length;
                    jArr2[i11] = (jArr2[i11] + jArr2[i10]) & 34342963199L;
                    i10++;
                }
                longPolynomial2MultRecursive.coeffs = Arrays.copyOf(jArr2, length);
            } else {
                int i12 = length;
                while (true) {
                    jArr = longPolynomial2MultRecursive.coeffs;
                    if (i12 >= jArr.length) {
                        break;
                    }
                    int i13 = i12 - length;
                    long j10 = jArr[i13] + (jArr[i12 - 1] >> 24);
                    jArr[i13] = j10;
                    long j11 = j10 + ((2047 & jArr[i12]) << 24);
                    jArr[i13] = j11;
                    jArr[i13] = j11 & 34342963199L;
                    i12++;
                }
                long[] jArrCopyOf = Arrays.copyOf(jArr, length);
                longPolynomial2MultRecursive.coeffs = jArrCopyOf;
                int length2 = jArrCopyOf.length - 1;
                jArrCopyOf[length2] = jArrCopyOf[length2] & 2047;
            }
        }
        LongPolynomial2 longPolynomial22 = new LongPolynomial2(longPolynomial2MultRecursive.coeffs);
        longPolynomial22.numCoeffs = this.numCoeffs;
        return longPolynomial22;
    }

    public void mult2And(int i10) {
        long j10 = i10;
        long j11 = (j10 << 24) + j10;
        int i11 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i11 >= jArr.length) {
                return;
            }
            jArr[i11] = (jArr[i11] << 1) & j11;
            i11++;
        }
    }

    public void subAnd(LongPolynomial2 longPolynomial2, int i10) {
        long j10 = i10;
        long j11 = (j10 << 24) + j10;
        int i11 = 0;
        while (true) {
            long[] jArr = longPolynomial2.coeffs;
            if (i11 >= jArr.length) {
                return;
            }
            long[] jArr2 = this.coeffs;
            jArr2[i11] = ((jArr2[i11] + 140737496743936L) - jArr[i11]) & j11;
            i11++;
        }
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long[] jArr = this.coeffs;
            if (i10 >= jArr.length) {
                return new IntegerPolynomial(iArr);
            }
            int i12 = i11 + 1;
            long j10 = jArr[i10];
            iArr[i11] = (int) (j10 & 2047);
            if (i12 < this.numCoeffs) {
                i11 += 2;
                iArr[i12] = (int) ((j10 >> 24) & 2047);
            } else {
                i11 = i12;
            }
            i10++;
        }
    }

    public LongPolynomial2(IntegerPolynomial integerPolynomial) {
        long j10;
        int length = integerPolynomial.coeffs.length;
        this.numCoeffs = length;
        this.coeffs = new long[(length + 1) / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.numCoeffs) {
            int i12 = i10 + 1;
            int i13 = integerPolynomial.coeffs[i10];
            while (i13 < 0) {
                i13 += 2048;
            }
            if (i12 < this.numCoeffs) {
                i10 += 2;
                j10 = integerPolynomial.coeffs[i12];
            } else {
                i10 = i12;
                j10 = 0;
            }
            while (j10 < 0) {
                j10 += 2048;
            }
            this.coeffs[i11] = i13 + (j10 << 24);
            i11++;
        }
    }

    private LongPolynomial2(long[] jArr) {
        this.coeffs = jArr;
    }
}
