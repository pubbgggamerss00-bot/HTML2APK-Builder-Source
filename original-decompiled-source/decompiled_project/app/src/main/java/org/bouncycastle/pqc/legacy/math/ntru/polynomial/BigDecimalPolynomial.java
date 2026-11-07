package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public class BigDecimalPolynomial {
    BigDecimal[] coeffs;
    private static final BigDecimal ZERO = new BigDecimal(d.L0);
    private static final BigDecimal ONE_HALF = new BigDecimal("0.5");

    public BigDecimalPolynomial(int i10) {
        this.coeffs = new BigDecimal[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.coeffs[i11] = ZERO;
        }
    }

    private BigDecimal[] copyOf(BigDecimal[] bigDecimalArr, int i10) {
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i10];
        if (bigDecimalArr.length < i10) {
            i10 = bigDecimalArr.length;
        }
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, i10);
        return bigDecimalArr2;
    }

    private BigDecimal[] copyOfRange(BigDecimal[] bigDecimalArr, int i10, int i11) {
        int length = i11 - i10;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[length];
        if (bigDecimalArr.length - i10 < length) {
            length = bigDecimalArr.length - i10;
        }
        System.arraycopy(bigDecimalArr, i10, bigDecimalArr2, 0, length);
        return bigDecimalArr2;
    }

    private BigDecimalPolynomial multRecursive(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr2.length;
        int i10 = 0;
        if (length <= 1) {
            BigDecimal[] bigDecimalArr3 = (BigDecimal[]) bigDecimalArr.clone();
            for (int i11 = 0; i11 < this.coeffs.length; i11++) {
                bigDecimalArr3[i11] = bigDecimalArr3[i11].multiply(bigDecimalPolynomial.coeffs[0]);
            }
            return new BigDecimalPolynomial(bigDecimalArr3);
        }
        int i12 = length / 2;
        BigDecimalPolynomial bigDecimalPolynomial2 = new BigDecimalPolynomial(copyOf(bigDecimalArr, i12));
        BigDecimalPolynomial bigDecimalPolynomial3 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr, i12, length));
        BigDecimalPolynomial bigDecimalPolynomial4 = new BigDecimalPolynomial(copyOf(bigDecimalArr2, i12));
        BigDecimalPolynomial bigDecimalPolynomial5 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr2, i12, length));
        BigDecimalPolynomial bigDecimalPolynomial6 = (BigDecimalPolynomial) bigDecimalPolynomial2.clone();
        bigDecimalPolynomial6.add(bigDecimalPolynomial3);
        BigDecimalPolynomial bigDecimalPolynomial7 = (BigDecimalPolynomial) bigDecimalPolynomial4.clone();
        bigDecimalPolynomial7.add(bigDecimalPolynomial5);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive = bigDecimalPolynomial2.multRecursive(bigDecimalPolynomial4);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive2 = bigDecimalPolynomial3.multRecursive(bigDecimalPolynomial5);
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive3 = bigDecimalPolynomial6.multRecursive(bigDecimalPolynomial7);
        bigDecimalPolynomialMultRecursive3.sub(bigDecimalPolynomialMultRecursive);
        bigDecimalPolynomialMultRecursive3.sub(bigDecimalPolynomialMultRecursive2);
        BigDecimalPolynomial bigDecimalPolynomial8 = new BigDecimalPolynomial((length * 2) - 1);
        int i13 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomialMultRecursive.coeffs;
            if (i13 >= bigDecimalArr4.length) {
                break;
            }
            bigDecimalPolynomial8.coeffs[i13] = bigDecimalArr4[i13];
            i13++;
        }
        int i14 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr5 = bigDecimalPolynomialMultRecursive3.coeffs;
            if (i14 >= bigDecimalArr5.length) {
                break;
            }
            BigDecimal[] bigDecimalArr6 = bigDecimalPolynomial8.coeffs;
            int i15 = i12 + i14;
            bigDecimalArr6[i15] = bigDecimalArr6[i15].add(bigDecimalArr5[i14]);
            i14++;
        }
        while (true) {
            BigDecimal[] bigDecimalArr7 = bigDecimalPolynomialMultRecursive2.coeffs;
            if (i10 >= bigDecimalArr7.length) {
                return bigDecimalPolynomial8;
            }
            BigDecimal[] bigDecimalArr8 = bigDecimalPolynomial8.coeffs;
            int i16 = (i12 * 2) + i10;
            bigDecimalArr8[i16] = bigDecimalArr8[i16].add(bigDecimalArr7[i10]);
            i10++;
        }
    }

    public void add(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i10 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i10 >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i10] = bigDecimalArr5[i10].add(bigDecimalArr4[i10]);
            i10++;
        }
    }

    public Object clone() {
        return new BigDecimalPolynomial((BigDecimal[]) this.coeffs.clone());
    }

    public BigDecimal[] getCoeffs() {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[bigDecimalArr.length];
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, bigDecimalArr.length);
        return bigDecimalArr2;
    }

    public void halve() {
        int i10 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr = this.coeffs;
            if (i10 >= bigDecimalArr.length) {
                return;
            }
            bigDecimalArr[i10] = bigDecimalArr[i10].multiply(ONE_HALF);
            i10++;
        }
    }

    public BigDecimalPolynomial mult(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr;
        int length = this.coeffs.length;
        if (bigDecimalPolynomial.coeffs.length != length) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigDecimalPolynomial bigDecimalPolynomialMultRecursive = multRecursive(bigDecimalPolynomial);
        if (bigDecimalPolynomialMultRecursive.coeffs.length > length) {
            int i10 = length;
            while (true) {
                bigDecimalArr = bigDecimalPolynomialMultRecursive.coeffs;
                if (i10 >= bigDecimalArr.length) {
                    break;
                }
                int i11 = i10 - length;
                bigDecimalArr[i11] = bigDecimalArr[i11].add(bigDecimalArr[i10]);
                i10++;
            }
            bigDecimalPolynomialMultRecursive.coeffs = copyOf(bigDecimalArr, length);
        }
        return bigDecimalPolynomialMultRecursive;
    }

    public BigIntPolynomial round() {
        int length = this.coeffs.length;
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(length);
        for (int i10 = 0; i10 < length; i10++) {
            bigIntPolynomial.coeffs[i10] = this.coeffs[i10].setScale(0, 6).toBigInteger();
        }
        return bigIntPolynomial;
    }

    public void sub(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = bigDecimalPolynomial.coeffs;
        int length = bigDecimalArr.length;
        BigDecimal[] bigDecimalArr2 = this.coeffs;
        if (length > bigDecimalArr2.length) {
            int length2 = bigDecimalArr2.length;
            this.coeffs = copyOf(bigDecimalArr2, bigDecimalArr.length);
            while (true) {
                BigDecimal[] bigDecimalArr3 = this.coeffs;
                if (length2 >= bigDecimalArr3.length) {
                    break;
                }
                bigDecimalArr3[length2] = ZERO;
                length2++;
            }
        }
        int i10 = 0;
        while (true) {
            BigDecimal[] bigDecimalArr4 = bigDecimalPolynomial.coeffs;
            if (i10 >= bigDecimalArr4.length) {
                return;
            }
            BigDecimal[] bigDecimalArr5 = this.coeffs;
            bigDecimalArr5[i10] = bigDecimalArr5[i10].subtract(bigDecimalArr4[i10]);
            i10++;
        }
    }

    public BigDecimalPolynomial(BigIntPolynomial bigIntPolynomial) {
        int length = bigIntPolynomial.coeffs.length;
        this.coeffs = new BigDecimal[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.coeffs[i10] = new BigDecimal(bigIntPolynomial.coeffs[i10]);
        }
    }

    public BigDecimalPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return mult(new BigDecimalPolynomial(bigIntPolynomial));
    }

    public BigDecimalPolynomial(BigDecimal[] bigDecimalArr) {
        this.coeffs = bigDecimalArr;
    }
}
