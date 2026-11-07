package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import ad.b;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.pqc.legacy.math.ntru.util.ArrayEncoder;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SparseTernaryPolynomial implements TernaryPolynomial {
    private static final int BITS_PER_INDEX = 11;
    private int N;
    private int[] negOnes;
    private int[] ones;

    public SparseTernaryPolynomial(int i10, int[] iArr, int[] iArr2) {
        this.N = i10;
        this.ones = iArr;
        this.negOnes = iArr2;
    }

    public static SparseTernaryPolynomial fromBinary(InputStream inputStream, int i10, int i11, int i12) throws IOException {
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(2047);
        return new SparseTernaryPolynomial(i10, ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((i11 * iNumberOfLeadingZeros) + 7) / 8), i11, 2048), ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((iNumberOfLeadingZeros * i12) + 7) / 8), i12, 2048));
    }

    public static SparseTernaryPolynomial generateRandom(int i10, int i11, int i12, SecureRandom secureRandom) {
        return new SparseTernaryPolynomial(Util.generateRandomTernary(i10, i11, i12, secureRandom));
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public void clear() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.ones;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.negOnes;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = 0;
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial = (SparseTernaryPolynomial) obj;
        return this.N == sparseTernaryPolynomial.N && Arrays.areEqual(this.negOnes, sparseTernaryPolynomial.negOnes) && Arrays.areEqual(this.ones, sparseTernaryPolynomial.ones);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        return this.negOnes;
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        return this.ones;
    }

    public int hashCode() {
        return Arrays.hashCode(this.ones) + ((Arrays.hashCode(this.negOnes) + ((this.N + 31) * 31)) * 31);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        int i10 = this.N;
        if (length != i10) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < this.N; i12++) {
            bigIntegerArr2[i12] = BigInteger.ZERO;
        }
        int i13 = 0;
        while (true) {
            int[] iArr = this.ones;
            if (i13 == iArr.length) {
                break;
            }
            int i14 = iArr[i13];
            int i15 = this.N;
            int i16 = (i15 - 1) - i14;
            for (int i17 = i15 - 1; i17 >= 0; i17--) {
                bigIntegerArr2[i17] = bigIntegerArr2[i17].add(bigIntegerArr[i16]);
                i16--;
                if (i16 < 0) {
                    i16 = this.N - 1;
                }
            }
            i13++;
        }
        while (true) {
            int[] iArr2 = this.negOnes;
            if (i11 == iArr2.length) {
                return new BigIntPolynomial(bigIntegerArr2);
            }
            int i18 = iArr2[i11];
            int i19 = this.N;
            int i20 = (i19 - 1) - i18;
            for (int i21 = i19 - 1; i21 >= 0; i21--) {
                bigIntegerArr2[i21] = bigIntegerArr2[i21].subtract(bigIntegerArr[i20]);
                i20--;
                if (i20 < 0) {
                    i20 = this.N - 1;
                }
            }
            i11++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.N;
    }

    public byte[] toBinary() {
        byte[] bArrEncodeModQ = ArrayEncoder.encodeModQ(this.ones, 2048);
        byte[] bArrEncodeModQ2 = ArrayEncoder.encodeModQ(this.negOnes, 2048);
        byte[] bArrCopyOf = Arrays.copyOf(bArrEncodeModQ, bArrEncodeModQ.length + bArrEncodeModQ2.length);
        System.arraycopy(bArrEncodeModQ2, 0, bArrCopyOf, bArrEncodeModQ.length, bArrEncodeModQ2.length);
        return bArrCopyOf;
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.N];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.ones;
            if (i11 == iArr2.length) {
                break;
            }
            iArr[iArr2[i11]] = 1;
            i11++;
        }
        while (true) {
            int[] iArr3 = this.negOnes;
            if (i10 == iArr3.length) {
                return new IntegerPolynomial(iArr);
            }
            iArr[iArr3[i10]] = -1;
            i10++;
        }
    }

    public SparseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial, org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int i10 = this.N;
        if (length != i10) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr3 = this.ones;
            if (i12 == iArr3.length) {
                break;
            }
            int i13 = iArr3[i12];
            int i14 = this.N;
            int i15 = (i14 - 1) - i13;
            for (int i16 = i14 - 1; i16 >= 0; i16--) {
                iArr2[i16] = iArr2[i16] + iArr[i15];
                i15--;
                if (i15 < 0) {
                    i15 = this.N - 1;
                }
            }
            i12++;
        }
        while (true) {
            int[] iArr4 = this.negOnes;
            if (i11 == iArr4.length) {
                return new IntegerPolynomial(iArr2);
            }
            int i17 = iArr4[i11];
            int i18 = this.N;
            int i19 = (i18 - 1) - i17;
            for (int i20 = i18 - 1; i20 >= 0; i20--) {
                iArr2[i20] = iArr2[i20] - iArr[i19];
                i19--;
                if (i19 < 0) {
                    i19 = this.N - 1;
                }
            }
            i11++;
        }
    }

    public SparseTernaryPolynomial(int[] iArr) {
        int length = iArr.length;
        this.N = length;
        this.ones = new int[length];
        this.negOnes = new int[length];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.N; i12++) {
            int i13 = iArr[i12];
            if (i13 == -1) {
                this.negOnes[i11] = i12;
                i11++;
            } else if (i13 == 0) {
                continue;
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(b.b(i13, "Illegal value: ", ", must be one of {-1, 0, 1}"));
                }
                this.ones[i10] = i12;
                i10++;
            }
        }
        this.ones = Arrays.copyOf(this.ones, i10);
        this.negOnes = Arrays.copyOf(this.negOnes, i11);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i10) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i10);
        return integerPolynomialMult;
    }
}
