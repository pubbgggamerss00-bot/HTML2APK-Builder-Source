package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public abstract class FiniteFields {
    static final FiniteField GF_2 = new PrimeField(BigInteger.valueOf(2));
    static final FiniteField GF_3 = new PrimeField(BigInteger.valueOf(3));

    public static PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10] <= iArr[i10 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
            }
        }
        return new GenericPolynomialExtensionField(GF_2, new GF2Polynomial(iArr));
    }

    public static FiniteField getPrimeField(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            int iIntValueExact = BigIntegers.intValueExact(bigInteger);
            if (iIntValueExact == 2) {
                return GF_2;
            }
            if (iIntValueExact == 3) {
                return GF_3;
            }
        }
        return new PrimeField(bigInteger);
    }
}
