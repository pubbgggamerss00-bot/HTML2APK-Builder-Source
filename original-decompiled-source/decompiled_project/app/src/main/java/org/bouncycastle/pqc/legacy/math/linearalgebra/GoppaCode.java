package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* renamed from: h, reason: collision with root package name */
        private GF2Matrix f20534h;

        /* renamed from: p, reason: collision with root package name */
        private Permutation f20535p;

        /* renamed from: s, reason: collision with root package name */
        private GF2Matrix f20536s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f20536s = gF2Matrix;
            this.f20534h = gF2Matrix2;
            this.f20535p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f20536s;
        }

        public Permutation getPermutation() {
            return this.f20535p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f20534h;
        }
    }

    public static class MatrixSet {

        /* renamed from: g, reason: collision with root package name */
        private GF2Matrix f20537g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f20537g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f20537g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        GF2Matrix gF2Matrix2;
        boolean z10;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z10 = true;
            } catch (ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z10 = false;
            }
            if (z10) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i10 = 1;
        int i11 = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i12 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, degree2, i11);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, degree2, i11);
        for (int i13 = 0; i13 < i11; i13++) {
            iArr2[0][i13] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i13));
        }
        for (int i14 = 1; i14 < degree2; i14++) {
            for (int i15 = 0; i15 < i11; i15++) {
                iArr2[i14][i15] = gF2mField.mult(iArr2[i14 - 1][i15], i15);
            }
        }
        for (int i16 = 0; i16 < degree2; i16++) {
            for (int i17 = i12; i17 < i11; i17++) {
                int i18 = i12;
                while (i18 <= i16) {
                    int[] iArr3 = iArr[i16];
                    iArr3[i17] = gF2mField.add(iArr3[i17], gF2mField.mult(iArr2[i18][i17], polynomialGF2mSmallM.getCoefficient((degree2 + i18) - i16)));
                    i18++;
                    i10 = i10;
                    i12 = i12;
                }
            }
        }
        int i19 = i10;
        int i20 = i12;
        int[] iArr4 = new int[2];
        iArr4[i19] = (i11 + 31) >>> 5;
        iArr4[i20] = degree2 * degree;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iArr4);
        for (int i21 = i20; i21 < i11; i21++) {
            int i22 = i21 >>> 5;
            int i23 = i19 << (i21 & 31);
            for (int i24 = i20; i24 < degree2; i24++) {
                int i25 = iArr[i24][i21];
                for (int i26 = i20; i26 < degree; i26++) {
                    if (((i25 >>> i26) & 1) != 0) {
                        int[] iArr6 = iArr5[(((i24 + 1) * degree) - i26) - 1];
                        iArr6[i22] = iArr6[i22] ^ i23;
                    }
                }
            }
        }
        return new GF2Matrix(i11, iArr5);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] polynomialGF2mSmallMArrModPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArrModPolynomialToFracton[0];
            PolynomialGF2mSmallM polynomialGF2mSmallMMultiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArrModPolynomialToFracton[1];
            PolynomialGF2mSmallM polynomialGF2mSmallMAdd = polynomialGF2mSmallMMultiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMAdd.multWithElement(gF2mField.inverse(polynomialGF2mSmallMAdd.getHeadCoefficient()));
            for (int i10 = 0; i10 < degree; i10++) {
                if (polynomialGF2mSmallMMultWithElement.evaluateAt(i10) == 0) {
                    gF2Vector2.setBit(i10);
                }
            }
        }
        return gF2Vector2;
    }
}
