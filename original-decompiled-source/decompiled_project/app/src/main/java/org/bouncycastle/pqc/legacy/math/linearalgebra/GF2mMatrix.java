package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.lang.reflect.Array;
import k1.q;
import k3.a;

/* loaded from: classes3.dex */
public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i10 = 8;
        int i11 = 1;
        while (gF2mField.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length < 5) {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        int i12 = ((((bArr[3] & 255) << 24) ^ ((bArr[2] & 255) << 16)) ^ ((bArr[1] & 255) << 8)) ^ (bArr[0] & 255);
        this.numRows = i12;
        int i13 = i11 * i12;
        if (i12 > 0) {
            int i14 = 4;
            if ((bArr.length - 4) % i13 == 0) {
                int length = (bArr.length - 4) / i13;
                this.numColumns = length;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, length);
                for (int i15 = 0; i15 < this.numRows; i15++) {
                    for (int i16 = 0; i16 < this.numColumns; i16++) {
                        int i17 = 0;
                        while (i17 < i10) {
                            int[] iArr = this.matrix[i15];
                            iArr[i16] = iArr[i16] ^ ((bArr[i14] & 255) << i17);
                            i17 += 8;
                            i14++;
                        }
                        if (!this.field.isElementOfThisField(this.matrix[i15][i16])) {
                            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                        }
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i10);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i10) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i10);
        }
    }

    private static void swapColumns(int[][] iArr, int i10, int i11) {
        int[] iArr2 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = iArr2;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i10;
        int i11 = this.numRows;
        if (i11 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[] iArr = {i11, i11};
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i12 = this.numRows - 1; i12 >= 0; i12--) {
            iArr2[i12] = IntUtils.clone(this.matrix[i12]);
        }
        int i13 = this.numRows;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i13, i13);
        for (int i14 = this.numRows - 1; i14 >= 0; i14--) {
            iArr3[i14][i14] = 1;
        }
        for (int i15 = 0; i15 < this.numRows; i15++) {
            if (iArr2[i15][i15] == 0) {
                int i16 = i15 + 1;
                boolean z10 = false;
                while (i16 < this.numRows) {
                    if (iArr2[i16][i15] != 0) {
                        swapColumns(iArr2, i15, i16);
                        swapColumns(iArr3, i15, i16);
                        i16 = this.numRows;
                        z10 = true;
                    }
                    i16++;
                }
                if (!z10) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            int iInverse = this.field.inverse(iArr2[i15][i15]);
            multRowWithElementThis(iArr2[i15], iInverse);
            multRowWithElementThis(iArr3[i15], iInverse);
            for (int i17 = 0; i17 < this.numRows; i17++) {
                if (i17 != i15 && (i10 = iArr2[i17][i15]) != 0) {
                    int[] iArrMultRowWithElement = multRowWithElement(iArr2[i15], i10);
                    int[] iArrMultRowWithElement2 = multRowWithElement(iArr3[i15], i10);
                    addToRow(iArrMultRowWithElement, iArr2[i17]);
                    addToRow(iArrMultRowWithElement2, iArr3[i17]);
                }
            }
        }
        return new GF2mMatrix(this.field, iArr3);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mMatrix)) {
            GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
            if (this.field.equals(gF2mMatrix.field)) {
                int i10 = gF2mMatrix.numRows;
                int i11 = this.numColumns;
                if (i10 == i11 && gF2mMatrix.numColumns == i11) {
                    for (int i12 = 0; i12 < this.numRows; i12++) {
                        for (int i13 = 0; i13 < this.numColumns; i13++) {
                            if (this.matrix[i12][i13] != gF2mMatrix.matrix[i12][i13]) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i10 = 8;
        int i11 = 1;
        while (this.field.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        int i12 = this.numRows;
        int i13 = this.numColumns * i12 * i11;
        int i14 = 4;
        byte[] bArr = new byte[i13 + 4];
        bArr[0] = (byte) (i12 & 255);
        bArr[1] = (byte) ((i12 >>> 8) & 255);
        bArr[2] = (byte) ((i12 >>> 16) & 255);
        bArr[3] = (byte) ((i12 >>> 24) & 255);
        for (int i15 = 0; i15 < this.numRows; i15++) {
            for (int i16 = 0; i16 < this.numColumns; i16++) {
                int i17 = 0;
                while (i17 < i10) {
                    bArr[i14] = (byte) (this.matrix[i15][i16] >>> i17);
                    i17 += 8;
                    i14++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = (((this.field.hashCode() * 31) + this.numRows) * 31) + this.numColumns;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.numColumns; i11++) {
                iHashCode = (iHashCode * 31) + this.matrix[i10][i11];
            }
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.numColumns; i11++) {
                if (this.matrix[i10][i11] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public String toString() {
        String strA = this.numRows + " x " + this.numColumns + " Matrix over " + this.field.toString() + ": \n";
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.numColumns; i11++) {
                StringBuilder sbA = q.a(strA);
                sbA.append(this.field.elementToStr(this.matrix[i10][i11]));
                sbA.append(" : ");
                strA = sbA.toString();
            }
            strA = a.a(strA, "\n");
        }
        return strA;
    }

    public GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException("Not implemented.");
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        int i10 = gF2mMatrix.numRows;
        this.numRows = i10;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[i10][];
        for (int i11 = 0; i11 < this.numRows; i11++) {
            this.matrix[i11] = IntUtils.clone(gF2mMatrix.matrix[i11]);
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }
}
