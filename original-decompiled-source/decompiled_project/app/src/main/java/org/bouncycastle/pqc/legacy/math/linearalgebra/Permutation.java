package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;
import k3.a;
import org.bouncycastle.util.Arrays;
import v5.b;

/* loaded from: classes3.dex */
public class Permutation {
    private int[] perm;

    public Permutation(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i10];
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.perm[i11] = i11;
        }
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 : iArr) {
            if (i10 < 0 || i10 >= length || zArr[i10]) {
                return false;
            }
            zArr[i10] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int iCeilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * iCeilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i10 = 0; i10 < length; i10++) {
            LittleEndianConversions.I2OSP(this.perm[i10], bArr, (i10 * iCeilLog256) + 4, iCeilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            throw new IllegalArgumentException("length mismatch");
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String string = "[" + this.perm[0];
        for (int i10 = 1; i10 < this.perm.length; i10++) {
            StringBuilder sbA = b.a(string, ", ");
            sbA.append(this.perm[i10]);
            string = sbA.toString();
        }
        return a.a(string, "]");
    }

    public Permutation(int i10, SecureRandom secureRandom) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i12);
            i12--;
            this.perm[i13] = iArr[iNextInt];
            iArr[iNextInt] = iArr[i12];
        }
    }

    public Permutation(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int iCeilLog256 = IntegerFunctions.ceilLog256(iOS2IP - 1);
        if (bArr.length != (iOS2IP * iCeilLog256) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.perm = new int[iOS2IP];
        for (int i10 = 0; i10 < iOS2IP; i10++) {
            this.perm[i10] = LittleEndianConversions.OS2IP(bArr, (i10 * iCeilLog256) + 4, iCeilLog256);
        }
        if (!isPermutation(this.perm)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public Permutation(int[] iArr) {
        if (!isPermutation(iArr)) {
            throw new IllegalArgumentException("array is not a permutation vector");
        }
        this.perm = IntUtils.clone(iArr);
    }
}
