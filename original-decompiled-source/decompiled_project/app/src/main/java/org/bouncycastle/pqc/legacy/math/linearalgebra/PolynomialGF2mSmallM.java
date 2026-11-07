package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;
import k1.q;
import k3.a;

/* loaded from: classes3.dex */
public class PolynomialGF2mSmallM {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    private int[] coefficients;
    private int degree;
    private GF2mField field;

    public PolynomialGF2mSmallM(GF2mField gF2mField) {
        this.field = gF2mField;
        this.degree = -1;
        this.coefficients = new int[1];
    }

    private static int computeDegree(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private int[] createRandomIrreduciblePolynomial(int i10, SecureRandom secureRandom) {
        int[] iArr = new int[i10 + 1];
        iArr[i10] = 1;
        iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
        for (int i11 = 1; i11 < i10; i11++) {
            iArr[i11] = this.field.getRandomElement(secureRandom);
        }
        while (!isIrreducible(iArr)) {
            int iNextInt = RandUtils.nextInt(secureRandom, i10);
            if (iNextInt == 0) {
                iArr[0] = this.field.getRandomNonZeroElement(secureRandom);
            } else {
                iArr[iNextInt] = this.field.getRandomElement(secureRandom);
            }
        }
        return iArr;
    }

    private static int headCoefficient(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return 0;
        }
        return iArr[iComputeDegree];
    }

    private static boolean isEqual(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree != computeDegree(iArr2)) {
            return false;
        }
        for (int i10 = 0; i10 <= iComputeDegree; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean isIrreducible(int[] iArr) {
        if (iArr[0] == 0) {
            return false;
        }
        int iComputeDegree = computeDegree(iArr) >> 1;
        int[] iArrNormalForm = {0, 1};
        int[] iArr2 = {0, 1};
        int degree = this.field.getDegree();
        for (int i10 = 0; i10 < iComputeDegree; i10++) {
            for (int i11 = degree - 1; i11 >= 0; i11--) {
                iArrNormalForm = modMultiply(iArrNormalForm, iArrNormalForm, iArr);
            }
            iArrNormalForm = normalForm(iArrNormalForm);
            if (computeDegree(gcd(add(iArrNormalForm, iArr2), iArr)) != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] normalForm(int[] iArr) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int i10 = iComputeDegree + 1;
        if (iArr.length == i10) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public PolynomialGF2mSmallM add(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM addMonomial(int i10) {
        int[] iArr = new int[i10 + 1];
        iArr[i10] = 1;
        return new PolynomialGF2mSmallM(this.field, add(this.coefficients, iArr));
    }

    public void addToThis(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.coefficients = add(this.coefficients, polynomialGF2mSmallM.coefficients);
        computeDegree();
    }

    public PolynomialGF2mSmallM[] div(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[][] iArrDiv = div(this.coefficients, polynomialGF2mSmallM.coefficients);
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrDiv[0]), new PolynomialGF2mSmallM(this.field, iArrDiv[1])};
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PolynomialGF2mSmallM)) {
            PolynomialGF2mSmallM polynomialGF2mSmallM = (PolynomialGF2mSmallM) obj;
            if (this.field.equals(polynomialGF2mSmallM.field) && this.degree == polynomialGF2mSmallM.degree && isEqual(this.coefficients, polynomialGF2mSmallM.coefficients)) {
                return true;
            }
        }
        return false;
    }

    public int evaluateAt(int i10) {
        int[] iArr = this.coefficients;
        int i11 = this.degree;
        int iMult = iArr[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            iMult = this.field.mult(iMult, i10) ^ this.coefficients[i12];
        }
        return iMult;
    }

    public PolynomialGF2mSmallM gcd(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, gcd(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public int getCoefficient(int i10) {
        if (i10 < 0 || i10 > this.degree) {
            return 0;
        }
        return this.coefficients[i10];
    }

    public int getDegree() {
        int[] iArr = this.coefficients;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] getEncoded() {
        int i10 = 8;
        int i11 = 1;
        while (this.field.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        byte[] bArr = new byte[this.coefficients.length * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < this.coefficients.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (this.coefficients[i13] >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public int getHeadCoefficient() {
        int i10 = this.degree;
        if (i10 == -1) {
            return 0;
        }
        return this.coefficients[i10];
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode();
        int i10 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i10 >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i10];
            i10++;
        }
    }

    public PolynomialGF2mSmallM mod(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, mod(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modDiv(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modDiv(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM modInverse(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, modDiv(new int[]{1}, this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public PolynomialGF2mSmallM modMultiply(PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM polynomialGF2mSmallM2) {
        return new PolynomialGF2mSmallM(this.field, modMultiply(this.coefficients, polynomialGF2mSmallM.coefficients, polynomialGF2mSmallM2.coefficients));
    }

    public PolynomialGF2mSmallM[] modPolynomialToFracton(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i10 = polynomialGF2mSmallM.degree >> 1;
        int[] iArrNormalForm = normalForm(polynomialGF2mSmallM.coefficients);
        int[] iArrMod = mod(this.coefficients, polynomialGF2mSmallM.coefficients);
        int[] iArr = {0};
        int[] iArr2 = {1};
        while (computeDegree(iArrMod) > i10) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArr3 = iArrDiv[1];
            int[] iArrAdd = add(iArr, modMultiply(iArrDiv[0], iArr2, polynomialGF2mSmallM.coefficients));
            iArr = iArr2;
            iArr2 = iArrAdd;
            iArrNormalForm = iArrMod;
            iArrMod = iArr3;
        }
        return new PolynomialGF2mSmallM[]{new PolynomialGF2mSmallM(this.field, iArrMod), new PolynomialGF2mSmallM(this.field, iArr2)};
    }

    public PolynomialGF2mSmallM modSquareMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i10 = 0;
        while (true) {
            int[] iArr3 = this.coefficients;
            if (i10 >= iArr3.length) {
                break;
            }
            GF2mField gF2mField = this.field;
            int i11 = iArr3[i10];
            iArr2[i10] = gF2mField.mult(i11, i11);
            i10++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            for (int i13 = 0; i13 < length; i13++) {
                int[] iArr4 = polynomialGF2mSmallMArr[i13].coefficients;
                if (i12 < iArr4.length) {
                    iArr[i12] = this.field.add(iArr[i12], this.field.mult(iArr4[i12], iArr2[i13]));
                }
            }
        }
        return new PolynomialGF2mSmallM(this.field, iArr);
    }

    public PolynomialGF2mSmallM modSquareRoot(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int[] iArrClone = IntUtils.clone(this.coefficients);
        int[] iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        while (!isEqual(iArrModMultiply, this.coefficients)) {
            iArrClone = normalForm(iArrModMultiply);
            iArrModMultiply = modMultiply(iArrClone, iArrClone, polynomialGF2mSmallM.coefficients);
        }
        return new PolynomialGF2mSmallM(this.field, iArrClone);
    }

    public PolynomialGF2mSmallM modSquareRootMatrix(PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int length = polynomialGF2mSmallMArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr2 = polynomialGF2mSmallMArr[i11].coefficients;
                if (i10 < iArr2.length) {
                    int[] iArr3 = this.coefficients;
                    if (i11 < iArr3.length) {
                        iArr[i10] = this.field.add(iArr[i10], this.field.mult(iArr2[i10], iArr3[i11]));
                    }
                }
            }
        }
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.field.sqRoot(iArr[i12]);
        }
        return new PolynomialGF2mSmallM(this.field, iArr);
    }

    public void multThisWithElement(int i10) {
        if (!this.field.isElementOfThisField(i10)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.coefficients = multWithElement(this.coefficients, i10);
        computeDegree();
    }

    public PolynomialGF2mSmallM multWithElement(int i10) {
        if (!this.field.isElementOfThisField(i10)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new PolynomialGF2mSmallM(this.field, multWithElement(this.coefficients, i10));
    }

    public PolynomialGF2mSmallM multWithMonomial(int i10) {
        return new PolynomialGF2mSmallM(this.field, multWithMonomial(this.coefficients, i10));
    }

    public PolynomialGF2mSmallM multiply(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        return new PolynomialGF2mSmallM(this.field, multiply(this.coefficients, polynomialGF2mSmallM.coefficients));
    }

    public String toString() {
        String string = " Polynomial over " + this.field.toString() + ": \n";
        for (int i10 = 0; i10 < this.coefficients.length; i10++) {
            StringBuilder sbA = q.a(string);
            sbA.append(this.field.elementToStr(this.coefficients[i10]));
            sbA.append("Y^");
            sbA.append(i10);
            sbA.append("+");
            string = sbA.toString();
        }
        return a.a(string, ";");
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i10) {
        this.field = gF2mField;
        this.degree = i10;
        int[] iArr = new int[i10 + 1];
        this.coefficients = iArr;
        iArr[i10] = 1;
    }

    private int[] add(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.field.add(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private void computeDegree() {
        int length = this.coefficients.length;
        do {
            this.degree = length - 1;
            length = this.degree;
            if (length < 0) {
                return;
            }
        } while (this.coefficients[length] == 0);
    }

    private int[][] div(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        int iComputeDegree2 = computeDegree(iArr) + 1;
        if (iComputeDegree == -1) {
            throw new ArithmeticException("Division by zero.");
        }
        int[][] iArr3 = {new int[1], new int[iComputeDegree2]};
        int iInverse = this.field.inverse(headCoefficient(iArr2));
        iArr3[0][0] = 0;
        int[] iArr4 = iArr3[1];
        System.arraycopy(iArr, 0, iArr4, 0, iArr4.length);
        while (iComputeDegree <= computeDegree(iArr3[1])) {
            int[] iArr5 = {this.field.mult(headCoefficient(iArr3[1]), iInverse)};
            int[] iArrMultWithElement = multWithElement(iArr2, iArr5[0]);
            int iComputeDegree3 = computeDegree(iArr3[1]) - iComputeDegree;
            int[] iArrMultWithMonomial = multWithMonomial(iArrMultWithElement, iComputeDegree3);
            iArr3[0] = add(multWithMonomial(iArr5, iComputeDegree3), iArr3[0]);
            iArr3[1] = add(iArrMultWithMonomial, iArr3[1]);
        }
        return iArr3;
    }

    private int[] gcd(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) == -1) {
            return iArr2;
        }
        while (computeDegree(iArr2) != -1) {
            int[] iArrMod = mod(iArr, iArr2);
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            int length2 = iArrMod.length;
            int[] iArr4 = new int[length2];
            System.arraycopy(iArrMod, 0, iArr4, 0, length2);
            iArr2 = iArr4;
            iArr = iArr3;
        }
        return multWithElement(iArr, this.field.inverse(headCoefficient(iArr)));
    }

    private int[] mod(int[] iArr, int[] iArr2) {
        int iComputeDegree = computeDegree(iArr2);
        if (iComputeDegree == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArrAdd = new int[length];
        int iInverse = this.field.inverse(headCoefficient(iArr2));
        System.arraycopy(iArr, 0, iArrAdd, 0, length);
        while (iComputeDegree <= computeDegree(iArrAdd)) {
            iArrAdd = add(multWithElement(multWithMonomial(iArr2, computeDegree(iArrAdd) - iComputeDegree), this.field.mult(headCoefficient(iArrAdd), iInverse)), iArrAdd);
        }
        return iArrAdd;
    }

    private int[] modDiv(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrNormalForm = normalForm(iArr3);
        int[] iArrMod = mod(iArr2, iArr3);
        int[] iArrNormalForm2 = {0};
        int[] iArrMod2 = mod(iArr, iArr3);
        while (computeDegree(iArrMod) != -1) {
            int[][] iArrDiv = div(iArrNormalForm, iArrMod);
            int[] iArrNormalForm3 = normalForm(iArrMod);
            int[] iArrNormalForm4 = normalForm(iArrDiv[1]);
            int[] iArrAdd = add(iArrNormalForm2, modMultiply(iArrDiv[0], iArrMod2, iArr3));
            iArrNormalForm2 = normalForm(iArrMod2);
            iArrMod2 = normalForm(iArrAdd);
            iArrNormalForm = iArrNormalForm3;
            iArrMod = iArrNormalForm4;
        }
        return multWithElement(iArrNormalForm2, this.field.inverse(headCoefficient(iArrNormalForm)));
    }

    private int[] modMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        return mod(multiply(iArr, iArr2), iArr3);
    }

    private int[] multWithElement(int[] iArr, int i10) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1 || i10 == 0) {
            return new int[1];
        }
        if (i10 == 1) {
            return IntUtils.clone(iArr);
        }
        int[] iArr2 = new int[iComputeDegree + 1];
        while (iComputeDegree >= 0) {
            iArr2[iComputeDegree] = this.field.mult(iArr[iComputeDegree], i10);
            iComputeDegree--;
        }
        return iArr2;
    }

    private static int[] multWithMonomial(int[] iArr, int i10) {
        int iComputeDegree = computeDegree(iArr);
        if (iComputeDegree == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iComputeDegree + i10 + 1];
        System.arraycopy(iArr, 0, iArr2, i10, iComputeDegree + 1);
        return iArr2;
    }

    private int[] multiply(int[] iArr, int[] iArr2) {
        if (computeDegree(iArr) < computeDegree(iArr2)) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArrNormalForm = normalForm(iArr);
        int[] iArrNormalForm2 = normalForm(iArr2);
        if (iArrNormalForm2.length == 1) {
            return multWithElement(iArrNormalForm, iArrNormalForm2[0]);
        }
        int length = iArrNormalForm.length;
        int length2 = iArrNormalForm2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        if (length2 != length) {
            int[] iArr4 = new int[length2];
            int i10 = length - length2;
            int[] iArr5 = new int[i10];
            System.arraycopy(iArrNormalForm, 0, iArr4, 0, length2);
            System.arraycopy(iArrNormalForm, length2, iArr5, 0, i10);
            return add(multiply(iArr4, iArrNormalForm2), multWithMonomial(multiply(iArr5, iArrNormalForm2), length2));
        }
        int i11 = (length + 1) >>> 1;
        int i12 = length - i11;
        int[] iArr6 = new int[i11];
        int[] iArr7 = new int[i11];
        int[] iArr8 = new int[i12];
        int[] iArr9 = new int[i12];
        System.arraycopy(iArrNormalForm, 0, iArr6, 0, i11);
        System.arraycopy(iArrNormalForm, i11, iArr8, 0, i12);
        System.arraycopy(iArrNormalForm2, 0, iArr7, 0, i11);
        System.arraycopy(iArrNormalForm2, i11, iArr9, 0, i12);
        int[] iArrAdd = add(iArr6, iArr8);
        int[] iArrAdd2 = add(iArr7, iArr9);
        int[] iArrMultiply = multiply(iArr6, iArr7);
        int[] iArrMultiply2 = multiply(iArrAdd, iArrAdd2);
        int[] iArrMultiply3 = multiply(iArr8, iArr9);
        return add(multWithMonomial(add(add(add(iArrMultiply2, iArrMultiply), iArrMultiply3), multWithMonomial(iArrMultiply3, i11)), i11), iArrMultiply);
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int i10, char c10, SecureRandom secureRandom) {
        this.field = gF2mField;
        if (c10 == 'I') {
            this.coefficients = createRandomIrreduciblePolynomial(i10, secureRandom);
            computeDegree();
        } else {
            throw new IllegalArgumentException(" Error: type " + c10 + " is not defined for GF2smallmPolynomial");
        }
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i10 = 8;
        int i11 = 1;
        while (gF2mField.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.coefficients = new int[bArr.length / i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.coefficients;
            if (i12 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                computeDegree();
                return;
            }
            int i14 = 0;
            while (i14 < i10) {
                int[] iArr2 = this.coefficients;
                iArr2[i12] = ((bArr[i13] & 255) << i14) ^ iArr2[i12];
                i14 += 8;
                i13++;
            }
            if (!this.field.isElementOfThisField(this.coefficients[i12])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i12++;
        }
    }

    public PolynomialGF2mSmallM(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.coefficients = normalForm(iArr);
        computeDegree();
    }

    public PolynomialGF2mSmallM(GF2mVector gF2mVector) {
        this(gF2mVector.getField(), gF2mVector.getIntArrayForm());
    }

    public PolynomialGF2mSmallM(PolynomialGF2mSmallM polynomialGF2mSmallM) {
        this.field = polynomialGF2mSmallM.field;
        this.degree = polynomialGF2mSmallM.degree;
        this.coefficients = IntUtils.clone(polynomialGF2mSmallM.coefficients);
    }
}
