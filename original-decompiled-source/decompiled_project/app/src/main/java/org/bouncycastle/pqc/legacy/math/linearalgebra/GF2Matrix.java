package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(int i10, char c10) {
        this(i10, c10, new SecureRandom());
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i10) {
        for (int length = iArr2.length - 1; length >= i10; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i10, SecureRandom secureRandom) {
        this.numRows = i10;
        this.numColumns = i10;
        int i11 = (i10 + 31) >>> 5;
        this.length = i11;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        for (int i12 = 0; i12 < this.numRows; i12++) {
            int i13 = i12 >>> 5;
            int i14 = i12 & 31;
            int i15 = 31 - i14;
            int i16 = 1 << i14;
            for (int i17 = 0; i17 < i13; i17++) {
                this.matrix[i12][i17] = secureRandom.nextInt();
            }
            this.matrix[i12][i13] = i16 | (secureRandom.nextInt() >>> i15);
            while (true) {
                i13++;
                if (i13 < this.length) {
                    this.matrix[i12][i13] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i10, SecureRandom secureRandom) {
        this.numRows = i10;
        this.numColumns = i10;
        int i11 = (i10 + 31) >>> 5;
        this.length = i11;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom));
        int[] vector = new Permutation(i10, secureRandom).getVector();
        for (int i12 = 0; i12 < i10; i12++) {
            System.arraycopy(gF2Matrix.matrix[i12], 0, this.matrix[vector[i12]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i10, SecureRandom secureRandom) {
        int i11;
        this.numRows = i10;
        this.numColumns = i10;
        int i12 = (i10 + 31) >>> 5;
        this.length = i12;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i12);
        int i13 = i10 & 31;
        int i14 = i13 == 0 ? -1 : (1 << i13) - 1;
        for (int i15 = 0; i15 < this.numRows; i15++) {
            int i16 = i15 >>> 5;
            int i17 = i15 & 31;
            for (int i18 = 0; i18 < i16; i18++) {
                this.matrix[i15][i18] = 0;
            }
            this.matrix[i15][i16] = (secureRandom.nextInt() | 1) << i17;
            while (true) {
                i16++;
                i11 = this.length;
                if (i16 < i11) {
                    this.matrix[i15][i16] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i15];
            int i19 = i11 - 1;
            iArr[i19] = iArr[i19] & i14;
        }
    }

    private void assignUnitMatrix(int i10) {
        this.numRows = i10;
        this.numColumns = i10;
        int i11 = (i10 + 31) >>> 5;
        this.length = i11;
        int[] iArr = {i10, i11};
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iArr);
        for (int i12 = 0; i12 < this.numRows; i12++) {
            for (int i13 = 0; i13 < this.length; i13++) {
                this.matrix[i12][i13] = 0;
            }
        }
        for (int i14 = 0; i14 < this.numRows; i14++) {
            this.matrix[i14][i14 >>> 5] = 1 << (i14 & 31);
        }
    }

    private void assignZeroMatrix(int i10, int i11) {
        this.numRows = i10;
        this.numColumns = i11;
        int i12 = (i11 + 31) >>> 5;
        this.length = i12;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i12);
        for (int i13 = 0; i13 < this.numRows; i13++) {
            for (int i14 = 0; i14 < this.length; i14++) {
                this.matrix[i13][i14] = 0;
            }
        }
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i10, SecureRandom secureRandom) {
        int i11 = (i10 + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i10, Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i10, secureRandom);
        int[] vector = permutation.getVector();
        int i12 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        for (int i13 = 0; i13 < i10; i13++) {
            System.arraycopy(gF2Matrix3.matrix[vector[i13]], 0, iArr[i13], 0, i11);
        }
        GF2Matrix gF2Matrix4 = new GF2Matrix(i10, iArr);
        GF2Matrix gF2Matrix5 = new GF2Matrix(i10, 'I');
        int i14 = 0;
        while (i14 < i10) {
            int i15 = i14 >>> 5;
            int i16 = i12 << (i14 & 31);
            int i17 = i14 + 1;
            int i18 = i17;
            while (i18 < i10) {
                if ((gF2Matrix.matrix[i18][i15] & i16) != 0) {
                    int i19 = 0;
                    while (i19 <= i15) {
                        int i20 = i12;
                        int[][] iArr2 = gF2Matrix5.matrix;
                        int[] iArr3 = iArr2[i18];
                        iArr3[i19] = iArr3[i19] ^ iArr2[i14][i19];
                        i19++;
                        i12 = i20;
                    }
                }
                i18++;
                i12 = i12;
            }
            i14 = i17;
        }
        int i21 = i12;
        GF2Matrix gF2Matrix6 = new GF2Matrix(i10, 'I');
        for (int i22 = i10 - 1; i22 >= 0; i22--) {
            int i23 = i22 >>> 5;
            int i24 = i21 << (i22 & 31);
            for (int i25 = i22 - 1; i25 >= 0; i25--) {
                if ((gF2Matrix2.matrix[i25][i23] & i24) != 0) {
                    for (int i26 = i23; i26 < i11; i26++) {
                        int[][] iArr4 = gF2Matrix6.matrix;
                        int[] iArr5 = iArr4[i25];
                        iArr5[i26] = iArr4[i22][i26] ^ iArr5[i26];
                    }
                }
            }
        }
        return new GF2Matrix[]{gF2Matrix4, (GF2Matrix) gF2Matrix6.rightMultiply(gF2Matrix5.rightMultiply(permutation))};
    }

    private static void swapRows(int[][] iArr, int i10, int i11) {
        int[] iArr2 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = iArr2;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i10 = this.numRows;
        if (i10 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[] iArr = {i10, this.length};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i11 = this.numRows - 1; i11 >= 0; i11--) {
            iArr2[i11] = IntUtils.clone(this.matrix[i11]);
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, this.numRows, this.length);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr3[i12][i12 >> 5] = 1 << (i12 & 31);
        }
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >> 5;
            int i15 = 1 << (i13 & 31);
            if ((iArr2[i13][i14] & i15) == 0) {
                int i16 = i13 + 1;
                boolean z10 = false;
                while (i16 < this.numRows) {
                    if ((iArr2[i16][i14] & i15) != 0) {
                        swapRows(iArr2, i13, i16);
                        swapRows(iArr3, i13, i16);
                        i16 = this.numRows;
                        z10 = true;
                    }
                    i16++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                if (i17 != i13) {
                    int[] iArr4 = iArr2[i17];
                    if ((iArr4[i14] & i15) != 0) {
                        addToRow(iArr2[i13], iArr4, i14);
                        addToRow(iArr3[i13], iArr3[i17], 0);
                    }
                }
            }
        }
        return new GF2Matrix(this.numColumns, iArr3);
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        int i10 = 0;
        while (true) {
            int i11 = this.numRows;
            if (i10 >= i11) {
                return new GF2Matrix(i11, iArr);
            }
            for (int i12 = 0; i12 < this.numColumns; i12++) {
                int i13 = i10 >>> 5;
                int i14 = i10 & 31;
                if (((this.matrix[i10][i12 >>> 5] >>> (i12 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i12];
                    iArr2[i13] = (1 << i14) | iArr2[i13];
                }
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Matrix)) {
            return false;
        }
        GF2Matrix gF2Matrix = (GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.length != gF2Matrix.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.numRows; i10++) {
            if (!IntUtils.equals(this.matrix[i10], gF2Matrix.matrix[i10])) {
                return false;
            }
        }
        return true;
    }

    public GF2Matrix extendLeftCompactForm() {
        int i10 = this.numColumns;
        int i11 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, i10 + i11);
        int i12 = this.numRows;
        int i13 = (i12 - 1) + this.numColumns;
        int i14 = i12 - 1;
        while (i14 >= 0) {
            System.arraycopy(this.matrix[i14], 0, gF2Matrix.matrix[i14], 0, this.length);
            int[] iArr = gF2Matrix.matrix[i14];
            int i15 = i13 >> 5;
            iArr[i15] = iArr[i15] | (1 << (i13 & 31));
            i14--;
            i13--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i10;
        int i11 = this.numRows;
        GF2Matrix gF2Matrix = new GF2Matrix(i11, this.numColumns + i11);
        int i12 = this.numRows;
        int i13 = i12 >> 5;
        int i14 = i12 & 31;
        for (int i15 = i12 - 1; i15 >= 0; i15--) {
            int[] iArr = gF2Matrix.matrix[i15];
            int i16 = i15 >> 5;
            iArr[i16] = iArr[i16] | (1 << (i15 & 31));
            int i17 = 0;
            if (i14 != 0) {
                int i18 = i13;
                while (true) {
                    i10 = this.length;
                    if (i17 >= i10 - 1) {
                        break;
                    }
                    int i19 = this.matrix[i15][i17];
                    int[] iArr2 = gF2Matrix.matrix[i15];
                    int i20 = i18 + 1;
                    iArr2[i18] = iArr2[i18] | (i19 << i14);
                    iArr2[i20] = iArr2[i20] | (i19 >>> (32 - i14));
                    i17++;
                    i18 = i20;
                }
                int i21 = this.matrix[i15][i10 - 1];
                int[] iArr3 = gF2Matrix.matrix[i15];
                int i22 = i18 + 1;
                iArr3[i18] = iArr3[i18] | (i21 << i14);
                if (i22 < gF2Matrix.length) {
                    iArr3[i22] = iArr3[i22] | (i21 >>> (32 - i14));
                }
            } else {
                System.arraycopy(this.matrix[i15], 0, iArr, i13, this.length);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i10 = (this.numColumns + 7) >>> 3;
        int i11 = this.numRows;
        int i12 = 8;
        byte[] bArr = new byte[(i10 * i11) + 8];
        LittleEndianConversions.I2OSP(i11, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i13 = this.numColumns;
        int i14 = i13 >>> 5;
        int i15 = i13 & 31;
        for (int i16 = 0; i16 < this.numRows; i16++) {
            int i17 = 0;
            while (i17 < i14) {
                LittleEndianConversions.I2OSP(this.matrix[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.matrix[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i10 = this.numColumns & 31;
        int i11 = this.length;
        if (i10 != 0) {
            i11--;
        }
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (int i12 = 0; i12 < this.numRows; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.matrix[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    d10 += (i14 >>> i15) & 1;
                    d11 += 1.0d;
                }
            }
            int i16 = this.matrix[i12][this.length - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                d10 += (i16 >>> i17) & 1;
                d11 += 1.0d;
            }
        }
        return d10 / d11;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public GF2Matrix getLeftSubMatrix() {
        int i10 = this.numColumns;
        int i11 = this.numRows;
        if (i10 <= i11) {
            throw new ArithmeticException("empty submatrix");
        }
        int i12 = (i11 + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i12);
        int i13 = this.numRows;
        int i14 = (1 << (i13 & 31)) - 1;
        if (i14 == 0) {
            i14 = -1;
        }
        for (int i15 = i13 - 1; i15 >= 0; i15--) {
            System.arraycopy(this.matrix[i15], 0, iArr[i15], 0, i12);
            int[] iArr2 = iArr[i15];
            int i16 = i12 - 1;
            iArr2[i16] = iArr2[i16] & i14;
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public int getLength() {
        return this.length;
    }

    public GF2Matrix getRightSubMatrix() {
        int i10;
        int i11 = this.numColumns;
        int i12 = this.numRows;
        if (i11 <= i12) {
            throw new ArithmeticException("empty submatrix");
        }
        int i13 = i12 >> 5;
        int i14 = i12 & 31;
        GF2Matrix gF2Matrix = new GF2Matrix(i12, i11 - i12);
        for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
            int i16 = 0;
            if (i14 != 0) {
                int i17 = i13;
                while (true) {
                    i10 = gF2Matrix.length;
                    if (i16 >= i10 - 1) {
                        break;
                    }
                    int[] iArr = gF2Matrix.matrix[i15];
                    int[] iArr2 = this.matrix[i15];
                    int i18 = i17 + 1;
                    iArr[i16] = (iArr2[i17] >>> i14) | (iArr2[i18] << (32 - i14));
                    i16++;
                    i17 = i18;
                }
                int[] iArr3 = gF2Matrix.matrix[i15];
                int[] iArr4 = this.matrix[i15];
                int i19 = i17 + 1;
                iArr3[i10 - 1] = iArr4[i17] >>> i14;
                if (i19 < this.length) {
                    int i20 = i10 - 1;
                    iArr3[i20] = iArr3[i20] | (iArr4[i19] << (32 - i14));
                }
            } else {
                System.arraycopy(this.matrix[i15], i13, gF2Matrix.matrix[i15], 0, gF2Matrix.length);
            }
        }
        return gF2Matrix;
    }

    public int[] getRow(int i10) {
        return this.matrix[i10];
    }

    public int hashCode() {
        int iHashCode = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            iHashCode = (iHashCode * 31) + Arrays.hashCode(this.matrix[i10]);
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.length; i11++) {
                if (this.matrix[i10][i11] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i10 = this.numRows;
        if (length != i10) {
            throw new ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[i10][];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            iArr[i11] = IntUtils.clone(this.matrix[vector[i11]]);
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i10 = this.numRows;
        int[] iArr = new int[((this.numColumns + i10) + 31) >>> 5];
        int i11 = i10 >>> 5;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 1;
            do {
                if ((vecArray[i13] & i14) != 0) {
                    for (int i15 = 0; i15 < this.length; i15++) {
                        iArr[i15] = iArr[i15] ^ this.matrix[i12][i15];
                    }
                    int i16 = this.numColumns;
                    int i17 = (i16 + i12) >>> 5;
                    iArr[i17] = (1 << ((i16 + i12) & 31)) | iArr[i17];
                }
                i12++;
                i14 <<= 1;
            } while (i14 != 0);
        }
        int i18 = 1 << (this.numRows & 31);
        for (int i19 = 1; i19 != i18; i19 <<= 1) {
            if ((vecArray[i11] & i19) != 0) {
                for (int i20 = 0; i20 < this.length; i20++) {
                    iArr[i20] = iArr[i20] ^ this.matrix[i12][i20];
                }
                int i21 = this.numColumns;
                int i22 = (i21 + i12) >>> 5;
                iArr[i22] = (1 << ((i21 + i12) & 31)) | iArr[i22];
            }
            i12++;
        }
        return new GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2Matrix)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.numRows != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = (GF2Matrix) matrix;
        GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
        int i10 = this.numColumns & 31;
        int i11 = this.length;
        if (i10 != 0) {
            i11--;
        }
        for (int i12 = 0; i12 < this.numRows; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = this.matrix[i12][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    if (((1 << i16) & i15) != 0) {
                        for (int i17 = 0; i17 < gF2Matrix.length; i17++) {
                            int[] iArr = gF2Matrix2.matrix[i12];
                            iArr[i17] = iArr[i17] ^ gF2Matrix.matrix[i13][i17];
                        }
                    }
                    i13++;
                }
            }
            int i18 = this.matrix[i12][this.length - 1];
            for (int i19 = 0; i19 < i10; i19++) {
                if (((1 << i19) & i18) != 0) {
                    for (int i20 = 0; i20 < gF2Matrix.length; i20++) {
                        int[] iArr2 = gF2Matrix2.matrix[i12];
                        iArr2[i20] = iArr2[i20] ^ gF2Matrix.matrix[i13][i20];
                    }
                }
                i13++;
            }
        }
        return gF2Matrix2;
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i10;
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int i11 = this.numRows;
        int[] iArr = new int[(i11 + 31) >>> 5];
        int i12 = i11 >> 5;
        int i13 = i11 & 31;
        int i14 = 0;
        while (true) {
            int i15 = this.numRows;
            if (i14 >= i15) {
                return new GF2Vector(iArr, i15);
            }
            int i16 = i14 >> 5;
            int i17 = i14 & 31;
            int i18 = (vecArray[i16] >>> i17) & 1;
            int i19 = i12;
            int i20 = 0;
            if (i13 != 0) {
                while (true) {
                    i10 = this.length;
                    if (i20 >= i10 - 1) {
                        break;
                    }
                    int i21 = i19 + 1;
                    i18 ^= ((vecArray[i19] >>> i13) | (vecArray[i21] << (32 - i13))) & this.matrix[i14][i20];
                    i20++;
                    i19 = i21;
                }
                int i22 = i19 + 1;
                int i23 = vecArray[i19] >>> i13;
                if (i22 < vecArray.length) {
                    i23 |= vecArray[i22] << (32 - i13);
                }
                i18 ^= this.matrix[i14][i10 - 1] & i23;
            } else {
                while (i20 < this.length) {
                    i18 ^= vecArray[i19] & this.matrix[i14][i20];
                    i20++;
                    i19++;
                }
            }
            int i24 = 0;
            for (int i25 = 0; i25 < 32; i25++) {
                i24 ^= i18 & 1;
                i18 >>>= 1;
            }
            if (i24 == 1) {
                iArr[i16] = iArr[i16] | (1 << i17);
            }
            i14++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public String toString() {
        int i10 = this.numColumns & 31;
        int i11 = this.length;
        if (i10 != 0) {
            i11--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < this.numRows; i12++) {
            stringBuffer.append(i12 + ": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.matrix[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i16 = this.matrix[i12][this.length - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public GF2Matrix(int i10, char c10, SecureRandom secureRandom) {
        if (i10 <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c10 == 'I') {
            assignUnitMatrix(i10);
            return;
        }
        if (c10 == 'L') {
            assignRandomLowerTriangularMatrix(i10, secureRandom);
            return;
        }
        if (c10 == 'R') {
            assignRandomRegularMatrix(i10, secureRandom);
        } else if (c10 == 'U') {
            assignRandomUpperTriangularMatrix(i10, secureRandom);
        } else {
            if (c10 != 'Z') {
                throw new ArithmeticException("Unknown matrix type.");
            }
            assignZeroMatrix(i10, i10);
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.length];
        int i10 = this.numRows;
        int i11 = i10 >> 5;
        int i12 = 1 << (i10 & 31);
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 1;
            do {
                if ((vecArray[i14] & i15) != 0) {
                    for (int i16 = 0; i16 < this.length; i16++) {
                        iArr[i16] = iArr[i16] ^ this.matrix[i13][i16];
                    }
                }
                i13++;
                i15 <<= 1;
            } while (i15 != 0);
        }
        for (int i17 = 1; i17 != i12; i17 <<= 1) {
            if ((vecArray[i11] & i17) != 0) {
                for (int i18 = 0; i18 < this.length; i18++) {
                    iArr[i18] = iArr[i18] ^ this.matrix[i13][i18];
                }
            }
            i13++;
        }
        return new GF2Vector(iArr, this.numColumns);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int length = vector.length;
        int i10 = this.numColumns;
        if (length != i10) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, i10);
        for (int i11 = this.numColumns - 1; i11 >= 0; i11--) {
            int i12 = i11 >>> 5;
            int i13 = i11 & 31;
            int i14 = vector[i11];
            int i15 = i14 >>> 5;
            int i16 = i14 & 31;
            for (int i17 = this.numRows - 1; i17 >= 0; i17--) {
                int[] iArr = gF2Matrix.matrix[i17];
                iArr[i12] = iArr[i12] | (((this.matrix[i17][i15] >>> i16) & 1) << i13);
            }
        }
        return gF2Matrix;
    }

    private GF2Matrix(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        assignZeroMatrix(i10, i11);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i10 = 0;
        while (true) {
            int i11 = this.numRows;
            if (i10 >= i11) {
                return new GF2Vector(iArr, i11);
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.length; i13++) {
                i12 ^= this.matrix[i10][i13] & vecArray[i13];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < 32; i15++) {
                i14 ^= (i12 >>> i15) & 1;
            }
            if (i14 == 1) {
                int i16 = i10 >>> 5;
                iArr[i16] = iArr[i16] | (1 << (i10 & 31));
            }
            i10++;
        }
    }

    public GF2Matrix(int i10, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i10 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i10;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i11 = i10 & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int[] iArr3 = iArr[i13];
            int i14 = this.length - 1;
            iArr3[i14] = iArr3[i14] & i12;
        }
        this.matrix = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length][];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = IntUtils.clone(gF2Matrix.matrix[i10]);
            i10++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 4);
        this.numColumns = iOS2IP;
        int i10 = this.numRows;
        int i11 = ((iOS2IP + 7) >>> 3) * i10;
        if (i10 > 0) {
            int i12 = 8;
            if (i11 == bArr.length - 8) {
                int i13 = (iOS2IP + 31) >>> 5;
                this.length = i13;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i13);
                int i14 = this.numColumns;
                int i15 = i14 >> 5;
                int i16 = i14 & 31;
                for (int i17 = 0; i17 < this.numRows; i17++) {
                    int i18 = 0;
                    while (i18 < i15) {
                        this.matrix[i17][i18] = LittleEndianConversions.OS2IP(bArr, i12);
                        i18++;
                        i12 += 4;
                    }
                    int i19 = 0;
                    while (i19 < i16) {
                        int[] iArr = this.matrix[i17];
                        iArr[i15] = ((bArr[i12] & 255) << i19) ^ iArr[i15];
                        i19 += 8;
                        i12++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
