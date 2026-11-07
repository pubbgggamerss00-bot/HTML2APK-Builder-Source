package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2Vector extends Vector {

    /* renamed from: v, reason: collision with root package name */
    private int[] f20532v;

    public GF2Vector(int i10) {
        if (i10 < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.length = i10;
        this.f20532v = new int[(i10 + 31) >> 5];
    }

    public static GF2Vector OS2VP(int i10, byte[] bArr) {
        if (i10 < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i10 + 7) >> 3)) {
            return new GF2Vector(i10, LittleEndianConversions.toIntArray(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        GF2Vector gF2Vector = (GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        int[] iArrClone = IntUtils.clone(gF2Vector.f20532v);
        for (int length = iArrClone.length - 1; length >= 0; length--) {
            iArrClone[length] = iArrClone[length] ^ this.f20532v[length];
        }
        return new GF2Vector(this.length, iArrClone);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f20532v, gF2Vector.f20532v);
    }

    public GF2Vector extractLeftVector(int i10) {
        int i11 = this.length;
        if (i10 > i11) {
            throw new ArithmeticException("invalid length");
        }
        if (i10 == i11) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i10);
        int i12 = i10 >> 5;
        int i13 = i10 & 31;
        System.arraycopy(this.f20532v, 0, gF2Vector.f20532v, 0, i12);
        if (i13 != 0) {
            gF2Vector.f20532v[i12] = ((1 << i13) - 1) & this.f20532v[i12];
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i10) {
        int i11;
        int i12 = this.length;
        if (i10 > i12) {
            throw new ArithmeticException("invalid length");
        }
        if (i10 == i12) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i10);
        int i13 = this.length;
        int i14 = (i13 - i10) >> 5;
        int i15 = (i13 - i10) & 31;
        int i16 = (i10 + 31) >> 5;
        int i17 = 0;
        if (i15 == 0) {
            System.arraycopy(this.f20532v, i14, gF2Vector.f20532v, 0, i16);
            return gF2Vector;
        }
        while (true) {
            i11 = i16 - 1;
            if (i17 >= i11) {
                break;
            }
            int[] iArr = gF2Vector.f20532v;
            int[] iArr2 = this.f20532v;
            int i18 = i14 + 1;
            iArr[i17] = (iArr2[i14] >>> i15) | (iArr2[i18] << (32 - i15));
            i17++;
            i14 = i18;
        }
        int[] iArr3 = gF2Vector.f20532v;
        int[] iArr4 = this.f20532v;
        int i19 = i14 + 1;
        int i20 = iArr4[i14] >>> i15;
        iArr3[i11] = i20;
        if (i19 < iArr4.length) {
            iArr3[i11] = (iArr4[i19] << (32 - i15)) | i20;
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException("invalid index set");
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr2 = this.f20532v;
            int i11 = iArr[i10];
            if ((iArr2[i11 >> 5] & (1 << (i11 & 31))) != 0) {
                int[] iArr3 = gF2Vector.f20532v;
                int i12 = i10 >> 5;
                iArr3[i12] = (1 << (i10 & 31)) | iArr3[i12];
            }
        }
        return gF2Vector;
    }

    public int getBit(int i10) {
        if (i10 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        return (this.f20532v[i11] & (1 << i12)) >>> i12;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f20532v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f20532v;
            if (i10 >= iArr.length) {
                return i11;
            }
            int i12 = iArr[i10];
            for (int i13 = 0; i13 < 32; i13++) {
                if ((i12 & 1) != 0) {
                    i11++;
                }
                i12 >>>= 1;
            }
            i10++;
        }
    }

    public int[] getVecArray() {
        return this.f20532v;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public int hashCode() {
        return Arrays.hashCode(this.f20532v) + (this.length * 31);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f20532v.length - 1; length >= 0; length--) {
            if (this.f20532v[length] != 0) {
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
            throw new ArithmeticException("length mismatch");
        }
        GF2Vector gF2Vector = new GF2Vector(i10);
        for (int i11 = 0; i11 < vector.length; i11++) {
            int[] iArr = this.f20532v;
            int i12 = vector[i11];
            if ((iArr[i12 >> 5] & (1 << (i12 & 31))) != 0) {
                int[] iArr2 = gF2Vector.f20532v;
                int i13 = i11 >> 5;
                iArr2[i13] = (1 << (i11 & 31)) | iArr2[i13];
            }
        }
        return gF2Vector;
    }

    public void setBit(int i10) {
        if (i10 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f20532v;
        int i11 = i10 >> 5;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        int i10 = this.length;
        if (i10 % degree != 0) {
            throw new ArithmeticException("conversion is impossible");
        }
        int i11 = i10 / degree;
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f20532v[i12 >>> 5] >>> (i12 & 31)) & 1) == 1) {
                    iArr[i13] = iArr[i13] ^ (1 << degree2);
                }
                i12++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.length; i10++) {
            if (i10 != 0 && (i10 & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.f20532v[i10 >> 5] & (1 << (i10 & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }

    public GF2Vector(int i10, int i11, SecureRandom secureRandom) {
        if (i11 > i10) {
            throw new ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        this.length = i10;
        this.f20532v = new int[(i10 + 31) >> 5];
        int[] iArr = new int[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr[i12] = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i10);
            setBit(iArr[iNextInt]);
            i10--;
            iArr[iNextInt] = iArr[i10];
        }
    }

    public GF2Vector(int i10, SecureRandom secureRandom) {
        this.length = i10;
        int i11 = (i10 + 31) >> 5;
        this.f20532v = new int[i11];
        int i12 = i11 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            this.f20532v[i13] = secureRandom.nextInt();
        }
        int i14 = i10 & 31;
        if (i14 != 0) {
            int[] iArr = this.f20532v;
            iArr[i12] = ((1 << i14) - 1) & iArr[i12];
        }
    }

    public GF2Vector(int i10, int[] iArr) {
        if (i10 < 0) {
            throw new ArithmeticException("negative length");
        }
        this.length = i10;
        int i11 = (i10 + 31) >> 5;
        if (iArr.length != i11) {
            throw new ArithmeticException("length mismatch");
        }
        int[] iArrClone = IntUtils.clone(iArr);
        this.f20532v = iArrClone;
        int i12 = i10 & 31;
        if (i12 != 0) {
            int i13 = i11 - 1;
            iArrClone[i13] = ((1 << i12) - 1) & iArrClone[i13];
        }
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f20532v = IntUtils.clone(gF2Vector.f20532v);
    }

    public GF2Vector(int[] iArr, int i10) {
        this.f20532v = iArr;
        this.length = i10;
    }
}
