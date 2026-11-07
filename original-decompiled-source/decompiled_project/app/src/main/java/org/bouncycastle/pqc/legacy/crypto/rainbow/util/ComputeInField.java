package org.bouncycastle.pqc.legacy.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class ComputeInField {
    private short[][] A;

    /* renamed from: x, reason: collision with root package name */
    short[] f20531x;

    private void computeZerosAbove() throws RuntimeException {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i10 = length - 1; i10 >= 0; i10--) {
                short[][] sArr = this.A;
                short s10 = sArr[i10][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i11 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i11 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s10, GF2Field.multElem(sArr2[length][i11], sInvElem));
                        short[] sArr3 = this.A[i10];
                        sArr3[i11] = GF2Field.addElem(sArr3[i11], sMultElem);
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeZerosUnder(boolean z10) throws RuntimeException {
        int length = z10 ? this.A.length * 2 : this.A.length + 1;
        int i10 = 0;
        while (i10 < this.A.length - 1) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                short[][] sArr = this.A;
                if (i12 < sArr.length) {
                    short s10 = sArr[i12][i10];
                    short sInvElem = GF2Field.invElem(sArr[i10][i10]);
                    if (sInvElem == 0) {
                        throw new IllegalStateException("Matrix not invertible! We have to choose another one!");
                    }
                    for (int i13 = i10; i13 < length; i13++) {
                        short sMultElem = GF2Field.multElem(s10, GF2Field.multElem(this.A[i10][i13], sInvElem));
                        short[] sArr2 = this.A[i12];
                        sArr2[i13] = GF2Field.addElem(sArr2[i13], sMultElem);
                    }
                    i12++;
                }
            }
        }
    }

    private void substitute() throws IllegalStateException {
        short sInvElem = GF2Field.invElem(this.A[r0.length - 1][r0.length - 1]);
        if (sInvElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr = this.f20531x;
        short[][] sArr2 = this.A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], sInvElem);
        for (int length = this.A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.A;
            short sAddElem = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(this.A[length][length2], this.f20531x[length2]));
            }
            short sInvElem2 = GF2Field.invElem(this.A[length][length]);
            if (sInvElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f20531x[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.addElem(sArr[i10][i11], sArr2[i10][i11]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr3[i10] = GF2Field.addElem(sArr[i10], sArr2[i10]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        try {
            int i10 = 0;
            this.A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr.length; i12++) {
                    this.A[i11][i12] = sArr[i11][i12];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.A[i11][length] = 0;
                }
                short[][] sArr2 = this.A;
                sArr2[i11][sArr2.length + i11] = 1;
            }
            computeZerosUnder(true);
            int i13 = 0;
            while (true) {
                short[][] sArr3 = this.A;
                if (i13 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i13][i13]);
                int i14 = i13;
                while (true) {
                    short[][] sArr4 = this.A;
                    if (i14 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i13];
                        sArr5[i14] = GF2Field.multElem(sArr5[i14], sInvElem);
                        i14++;
                    }
                }
                i13++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.A;
                if (i10 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i10][length2 - sArr9.length] = sArr9[i10][length2];
                        length2++;
                    }
                }
                i10++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s10, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = GF2Field.multElem(s10, sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s10, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr2[i10] = GF2Field.multElem(s10, sArr[i10]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.multElem(sArr[i10], sArr2[i11]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10] = GF2Field.addElem(sArr3[i10], GF2Field.multElem(sArr[i10][i11], sArr2[i11]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f20531x = new short[sArr.length];
            for (int i10 = 0; i10 < sArr.length; i10++) {
                for (int i11 = 0; i11 < sArr[0].length; i11++) {
                    this.A[i10][i11] = sArr[i10][i11];
                }
            }
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                short[] sArr3 = this.A[i12];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i12], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f20531x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                for (int i12 = 0; i12 < sArr2[0].length; i12++) {
                    short sMultElem = GF2Field.multElem(sArr[i10][i11], sArr2[i11][i12]);
                    short[] sArr3 = this.A[i10];
                    sArr3[i12] = GF2Field.addElem(sArr3[i12], sMultElem);
                }
            }
        }
        return this.A;
    }
}
