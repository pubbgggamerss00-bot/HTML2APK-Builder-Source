package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import ad.b;
import java.security.SecureRandom;
import org.bouncycastle.pqc.legacy.math.ntru.util.Util;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class DenseTernaryPolynomial extends IntegerPolynomial implements TernaryPolynomial {
    public DenseTernaryPolynomial(int i10) {
        super(i10);
        checkTernarity();
    }

    private void checkTernarity() {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 == iArr.length) {
                return;
            }
            i10 = iArr[i11];
            if (i10 < -1 || i10 > 1) {
                break;
            } else {
                i11++;
            }
        }
        throw new IllegalStateException(b.b(i10, "Illegal value: ", ", must be one of {-1, 0, 1}"));
    }

    public static DenseTernaryPolynomial generateRandom(int i10, int i11, int i12, SecureRandom secureRandom) {
        return new DenseTernaryPolynomial(Util.generateRandomTernary(i10, i11, i12, secureRandom));
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        int length = this.coeffs.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.coeffs[i11] == -1) {
                iArr[i10] = i11;
                i10++;
            }
        }
        return Arrays.copyOf(iArr, i10);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        int length = this.coeffs.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.coeffs[i11] == 1) {
                iArr[i10] = i11;
                i10++;
            }
        }
        return Arrays.copyOf(iArr, i10);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial, org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i10) {
        if (i10 != 2048) {
            return super.mult(integerPolynomial, i10);
        }
        IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomial.clone();
        integerPolynomial2.modPositive(2048);
        return new LongPolynomial5(integerPolynomial2).mult(this).toIntegerPolynomial();
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.coeffs.length;
    }

    public DenseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    public static DenseTernaryPolynomial generateRandom(int i10, SecureRandom secureRandom) {
        DenseTernaryPolynomial denseTernaryPolynomial = new DenseTernaryPolynomial(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            denseTernaryPolynomial.coeffs[i11] = secureRandom.nextInt(3) - 1;
        }
        return denseTernaryPolynomial;
    }

    public DenseTernaryPolynomial(int[] iArr) {
        super(iArr);
        checkTernarity();
    }
}
