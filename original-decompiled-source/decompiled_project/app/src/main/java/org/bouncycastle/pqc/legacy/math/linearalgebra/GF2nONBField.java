package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes3.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i10, SecureRandom secureRandom) throws RuntimeException {
        super(secureRandom);
        if (i10 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i10;
        int i11 = i10 / 64;
        this.mLength = i11;
        int i12 = i10 & 63;
        this.mBit = i12;
        if (i12 == 0) {
            this.mBit = 64;
        } else {
            this.mLength = i11 + 1;
        }
        computeType();
        if (this.mType >= 3) {
            throw new RuntimeException("\nThe type of this field is " + this.mType);
        }
        this.mMult = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            int[] iArr = this.mMult[i13];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        computeMultMatrix();
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeMultMatrix() {
        int i10;
        int i11 = this.mType;
        if ((i11 & 7) == 0) {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i12 = this.mDegree * i11;
        int i13 = i12 + 1;
        int[] iArr = new int[i13];
        int iElementOfOrder = i11 == 1 ? 1 : i11 == 2 ? i12 : elementOfOrder(i11, i13);
        int i14 = 1;
        int i15 = 0;
        while (true) {
            i10 = this.mType;
            if (i15 >= i10) {
                break;
            }
            int i16 = i14;
            for (int i17 = 0; i17 < this.mDegree; i17++) {
                iArr[i16] = i17;
                i16 = (i16 << 1) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
            }
            i14 = (i14 * iElementOfOrder) % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            i15++;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
            int i18 = 1;
            while (i18 < i12) {
                int i19 = i18 + 1;
                int[] iArr2 = this.mMult[iArr[i19]];
                int i20 = i13 - i18;
                if (iArr2[0] == -1) {
                    iArr2[0] = iArr[i20];
                } else {
                    iArr2[1] = iArr[i20];
                }
                i18 = i19;
            }
            return;
        }
        int i21 = 1;
        while (i21 < i12) {
            int i22 = i21 + 1;
            int[] iArr3 = this.mMult[iArr[i22]];
            int i23 = i13 - i21;
            if (iArr3[0] == -1) {
                iArr3[0] = iArr[i23];
            } else {
                iArr3[1] = iArr[i23];
            }
            i21 = i22;
        }
        int i24 = this.mDegree >> 1;
        for (int i25 = 1; i25 <= i24; i25++) {
            int[][] iArr4 = this.mMult;
            int i26 = i25 - 1;
            int[] iArr5 = iArr4[i26];
            if (iArr5[0] == -1) {
                iArr5[0] = (i24 + i25) - 1;
            } else {
                iArr5[1] = (i24 + i25) - 1;
            }
            int[] iArr6 = iArr4[(i24 + i25) - 1];
            if (iArr6[0] == -1) {
                iArr6[0] = i26;
            } else {
                iArr6[1] = i26;
            }
        }
    }

    private void computeType() throws RuntimeException {
        if ((this.mDegree & 7) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.mType = 1;
        int iGcd = 0;
        while (iGcd != 1) {
            int i10 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i10)) {
                int iOrder = IntegerFunctions.order(2, i10);
                int i11 = this.mType;
                int i12 = this.mDegree;
                iGcd = IntegerFunctions.gcd((i11 * i12) / iOrder, i12);
            }
            this.mType++;
        }
        int i13 = this.mType - 1;
        this.mType = i13;
        if (i13 == 1) {
            int i14 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i14)) {
                int iOrder2 = IntegerFunctions.order(2, i14);
                int i15 = this.mDegree;
                if (IntegerFunctions.gcd((i15 << 1) / iOrder2, i15) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private int elementOfOrder(int i10, int i11) {
        int iOrder;
        Random random = new Random();
        int iNextInt = 0;
        while (iNextInt == 0) {
            int i12 = i11 - 1;
            iNextInt = random.nextInt() % i12;
            if (iNextInt < 0) {
                iNextInt += i12;
            }
        }
        while (true) {
            iOrder = IntegerFunctions.order(iNextInt, i11);
            if (iOrder % i10 == 0 && iOrder != 0) {
                break;
            }
            while (iNextInt == 0) {
                int i13 = i11 - 1;
                iNextInt = random.nextInt() % i13;
                if (iNextInt < 0) {
                    iNextInt += i13;
                }
            }
        }
        int i14 = iNextInt;
        for (int i15 = 2; i15 <= i10 / iOrder; i15++) {
            i14 *= iNextInt;
        }
        return i14;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeCOBMatrix(GF2nField gF2nField) throws RuntimeException {
        GF2nElement randomRoot;
        int i10 = this.mDegree;
        if (i10 != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[i10];
        for (int i11 = 0; i11 < this.mDegree; i11++) {
            gF2PolynomialArr[i11] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i12 = 1; i12 < this.mDegree; i12++) {
            gF2nElementArr[i12] = gF2nElementArr[i12 - 1].square();
        }
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            for (int i14 = 0; i14 < this.mDegree; i14++) {
                if (gF2nElementArr[i13].testBit(i14)) {
                    int i15 = this.mDegree;
                    gF2PolynomialArr[(i15 - i14) - 1].setBit((i15 - i13) - 1);
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public void computeFieldPolynomial() {
        int i10 = this.mType;
        if (i10 == 1) {
            this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
            return;
        }
        if (i10 == 2) {
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial2.addToThis(gF2Polynomial);
            GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i11 = 1;
            while (i11 < this.mDegree) {
                GF2Polynomial gF2PolynomialShiftLeft = gF2Polynomial4.shiftLeft();
                gF2PolynomialShiftLeft.addToThis(gF2Polynomial3);
                i11++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = gF2PolynomialShiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    public int getONBBit() {
        return this.mBit;
    }

    public int getONBLength() {
        return this.mLength;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nField
    public GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i10 = 1; i10 <= this.mDegree - 1; i10++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
        }
        return gF2nPolynomial.at(0);
    }

    public int[][] invMatrix(int[][] iArr) {
        int i10 = this.mDegree;
        int[] iArr2 = {i10, i10};
        Class cls = Integer.TYPE;
        int i11 = this.mDegree;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i11, i11);
        for (int i12 = 0; i12 < this.mDegree; i12++) {
            iArr3[i12][i12] = 1;
        }
        for (int i13 = 0; i13 < this.mDegree; i13++) {
            int i14 = i13;
            while (true) {
                int i15 = this.mDegree;
                if (i14 < i15) {
                    iArr[(i15 - 1) - i13][i14] = iArr[i13][i13];
                    i14++;
                }
            }
        }
        return null;
    }
}
