package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BigIntPolynomial {
    private static final double LOG_10_2 = Math.log10(2.0d);
    BigInteger[] coeffs;

    public BigIntPolynomial(int i10) {
        this.coeffs = new BigInteger[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.coeffs[i11] = Constants.BIGINT_ZERO;
        }
    }

    public static BigIntPolynomial generateRandomSmall(int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(Constants.BIGINT_ONE);
        }
        for (int i14 = 0; i14 < i12; i14++) {
            arrayList.add(BigInteger.valueOf(-1L));
        }
        while (arrayList.size() < i10) {
            arrayList.add(Constants.BIGINT_ZERO);
        }
        Collections.shuffle(arrayList, CryptoServicesRegistrar.getSecureRandom());
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(i10);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            bigIntPolynomial.coeffs[i15] = (BigInteger) arrayList.get(i15);
        }
        return bigIntPolynomial;
    }

    private BigInteger maxCoeffAbs() {
        BigInteger bigIntegerAbs = this.coeffs[0].abs();
        int i10 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return bigIntegerAbs;
            }
            BigInteger bigIntegerAbs2 = bigIntegerArr[i10].abs();
            if (bigIntegerAbs2.compareTo(bigIntegerAbs) > 0) {
                bigIntegerAbs = bigIntegerAbs2;
            }
            i10++;
        }
    }

    private BigIntPolynomial multRecursive(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = this.coeffs;
        BigInteger[] bigIntegerArr2 = bigIntPolynomial.coeffs;
        int length = bigIntegerArr2.length;
        int i10 = 0;
        if (length <= 1) {
            BigInteger[] bigIntegerArrClone = Arrays.clone(bigIntegerArr);
            for (int i11 = 0; i11 < this.coeffs.length; i11++) {
                bigIntegerArrClone[i11] = bigIntegerArrClone[i11].multiply(bigIntPolynomial.coeffs[0]);
            }
            return new BigIntPolynomial(bigIntegerArrClone);
        }
        int i12 = length / 2;
        BigIntPolynomial bigIntPolynomial2 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr, i12));
        BigIntPolynomial bigIntPolynomial3 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr, i12, length));
        BigIntPolynomial bigIntPolynomial4 = new BigIntPolynomial(Arrays.copyOf(bigIntegerArr2, i12));
        BigIntPolynomial bigIntPolynomial5 = new BigIntPolynomial(Arrays.copyOfRange(bigIntegerArr2, i12, length));
        BigIntPolynomial bigIntPolynomial6 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial6.add(bigIntPolynomial3);
        BigIntPolynomial bigIntPolynomial7 = (BigIntPolynomial) bigIntPolynomial4.clone();
        bigIntPolynomial7.add(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive = bigIntPolynomial2.multRecursive(bigIntPolynomial4);
        BigIntPolynomial bigIntPolynomialMultRecursive2 = bigIntPolynomial3.multRecursive(bigIntPolynomial5);
        BigIntPolynomial bigIntPolynomialMultRecursive3 = bigIntPolynomial6.multRecursive(bigIntPolynomial7);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive);
        bigIntPolynomialMultRecursive3.sub(bigIntPolynomialMultRecursive2);
        BigIntPolynomial bigIntPolynomial8 = new BigIntPolynomial((length * 2) - 1);
        int i13 = 0;
        while (true) {
            BigInteger[] bigIntegerArr3 = bigIntPolynomialMultRecursive.coeffs;
            if (i13 >= bigIntegerArr3.length) {
                break;
            }
            bigIntPolynomial8.coeffs[i13] = bigIntegerArr3[i13];
            i13++;
        }
        int i14 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomialMultRecursive3.coeffs;
            if (i14 >= bigIntegerArr4.length) {
                break;
            }
            BigInteger[] bigIntegerArr5 = bigIntPolynomial8.coeffs;
            int i15 = i12 + i14;
            bigIntegerArr5[i15] = bigIntegerArr5[i15].add(bigIntegerArr4[i14]);
            i14++;
        }
        while (true) {
            BigInteger[] bigIntegerArr6 = bigIntPolynomialMultRecursive2.coeffs;
            if (i10 >= bigIntegerArr6.length) {
                return bigIntPolynomial8;
            }
            BigInteger[] bigIntegerArr7 = bigIntPolynomial8.coeffs;
            int i16 = (i12 * 2) + i10;
            bigIntegerArr7[i16] = bigIntegerArr7[i16].add(bigIntegerArr6[i10]);
            i10++;
        }
    }

    public void add(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i10 >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i10] = bigIntegerArr5[i10].add(bigIntegerArr4[i10]);
            i10++;
        }
    }

    public Object clone() {
        return new BigIntPolynomial((BigInteger[]) this.coeffs.clone());
    }

    public BigDecimalPolynomial div(BigDecimal bigDecimal, int i10) {
        BigDecimal bigDecimalDivide = Constants.BIGDEC_ONE.divide(bigDecimal, ((int) (maxCoeffAbs().bitLength() * LOG_10_2)) + 1 + i10 + 1, 6);
        BigDecimalPolynomial bigDecimalPolynomial = new BigDecimalPolynomial(this.coeffs.length);
        for (int i11 = 0; i11 < this.coeffs.length; i11++) {
            bigDecimalPolynomial.coeffs[i11] = new BigDecimal(this.coeffs[i11]).multiply(bigDecimalDivide).setScale(i10, 6);
        }
        return bigDecimalPolynomial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.areEqual(this.coeffs, ((BigIntPolynomial) obj).coeffs);
    }

    public BigInteger[] getCoeffs() {
        return Arrays.clone(this.coeffs);
    }

    public int getMaxCoeffLength() {
        return ((int) (maxCoeffAbs().bitLength() * LOG_10_2)) + 1;
    }

    public int hashCode() {
        return 31 + Arrays.hashCode(this.coeffs);
    }

    public void mod(BigInteger bigInteger) {
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i10] = bigIntegerArr[i10].mod(bigInteger);
            i10++;
        }
    }

    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr;
        int length = this.coeffs.length;
        if (bigIntPolynomial.coeffs.length != length) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigIntPolynomial bigIntPolynomialMultRecursive = multRecursive(bigIntPolynomial);
        if (bigIntPolynomialMultRecursive.coeffs.length > length) {
            int i10 = length;
            while (true) {
                bigIntegerArr = bigIntPolynomialMultRecursive.coeffs;
                if (i10 >= bigIntegerArr.length) {
                    break;
                }
                int i11 = i10 - length;
                bigIntegerArr[i11] = bigIntegerArr[i11].add(bigIntegerArr[i10]);
                i10++;
            }
            bigIntPolynomialMultRecursive.coeffs = Arrays.copyOf(bigIntegerArr, length);
        }
        return bigIntPolynomialMultRecursive;
    }

    public void sub(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        BigInteger[] bigIntegerArr2 = this.coeffs;
        if (length > bigIntegerArr2.length) {
            int length2 = bigIntegerArr2.length;
            this.coeffs = Arrays.copyOf(bigIntegerArr2, bigIntegerArr.length);
            while (true) {
                BigInteger[] bigIntegerArr3 = this.coeffs;
                if (length2 >= bigIntegerArr3.length) {
                    break;
                }
                bigIntegerArr3[length2] = Constants.BIGINT_ZERO;
                length2++;
            }
        }
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr4 = bigIntPolynomial.coeffs;
            if (i10 >= bigIntegerArr4.length) {
                return;
            }
            BigInteger[] bigIntegerArr5 = this.coeffs;
            bigIntegerArr5[i10] = bigIntegerArr5[i10].subtract(bigIntegerArr4[i10]);
            i10++;
        }
    }

    public BigInteger sumCoeffs() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return bigIntegerAdd;
            }
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerArr[i10]);
            i10++;
        }
    }

    public BigIntPolynomial(IntegerPolynomial integerPolynomial) {
        this.coeffs = new BigInteger[integerPolynomial.coeffs.length];
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i10] = BigInteger.valueOf(integerPolynomial.coeffs[i10]);
            i10++;
        }
    }

    public void add(BigIntPolynomial bigIntPolynomial, BigInteger bigInteger) {
        add(bigIntPolynomial);
        mod(bigInteger);
    }

    public void div(BigInteger bigInteger) {
        BigInteger bigIntegerDivide = bigInteger.add(Constants.BIGINT_ONE).divide(BigInteger.valueOf(2L));
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i10] = bigIntegerArr[i10].compareTo(Constants.BIGINT_ZERO) > 0 ? this.coeffs[i10].add(bigIntegerDivide) : this.coeffs[i10].add(bigIntegerDivide.negate());
            BigInteger[] bigIntegerArr2 = this.coeffs;
            bigIntegerArr2[i10] = bigIntegerArr2[i10].divide(bigInteger);
            i10++;
        }
    }

    public void mult(int i10) {
        mult(BigInteger.valueOf(i10));
    }

    public BigIntPolynomial(BigInteger[] bigIntegerArr) {
        this.coeffs = bigIntegerArr;
    }

    public void mult(BigInteger bigInteger) {
        int i10 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = this.coeffs;
            if (i10 >= bigIntegerArr.length) {
                return;
            }
            bigIntegerArr[i10] = bigIntegerArr[i10].multiply(bigInteger);
            i10++;
        }
    }
}
