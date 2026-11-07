package org.bouncycastle.pqc.legacy.math.linearalgebra;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2mVector extends Vector {
    private GF2mField field;
    private int[] vector;

    public GF2mVector(GF2mField gF2mField, byte[] bArr) {
        this.field = new GF2mField(gF2mField);
        int i10 = 8;
        int i11 = 1;
        while (gF2mField.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        int length = bArr.length / i11;
        this.length = length;
        this.vector = new int[length];
        int i12 = 0;
        for (int i13 = 0; i13 < this.vector.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                int[] iArr = this.vector;
                iArr[i13] = ((bArr[i12] & 255) << i14) | iArr[i13];
                i14 += 8;
                i12++;
            }
            if (!gF2mField.isElementOfThisField(this.vector[i13])) {
                throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2mVector)) {
            return false;
        }
        GF2mVector gF2mVector = (GF2mVector) obj;
        if (this.field.equals(gF2mVector.field)) {
            return IntUtils.equals(this.vector, gF2mVector.vector);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i10 = 8;
        int i11 = 1;
        while (this.field.getDegree() > i10) {
            i11++;
            i10 += 8;
        }
        byte[] bArr = new byte[this.vector.length * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < this.vector.length; i13++) {
            int i14 = 0;
            while (i14 < i10) {
                bArr[i12] = (byte) (this.vector[i13] >>> i14);
                i14 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public GF2mField getField() {
        return this.field;
    }

    public int[] getIntArrayForm() {
        return IntUtils.clone(this.vector);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.vector) + (this.field.hashCode() * 31);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.vector.length - 1; length >= 0; length--) {
            if (this.vector[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        int i10 = this.length;
        if (i10 != vector.length) {
            throw new ArithmeticException("permutation size and vector size mismatch");
        }
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < vector.length; i11++) {
            iArr[i11] = this.vector[vector[i11]];
        }
        return new GF2mVector(this.field, iArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.vector.length; i10++) {
            for (int i11 = 0; i11 < this.field.getDegree(); i11++) {
                stringBuffer.append(((1 << (i11 & 31)) & this.vector[i10]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    public GF2mVector(GF2mField gF2mField, int[] iArr) {
        this.field = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.vector = IntUtils.clone(iArr);
    }

    public GF2mVector(GF2mVector gF2mVector) {
        this.field = new GF2mField(gF2mVector.field);
        this.length = gF2mVector.length;
        this.vector = IntUtils.clone(gF2mVector.vector);
    }
}
