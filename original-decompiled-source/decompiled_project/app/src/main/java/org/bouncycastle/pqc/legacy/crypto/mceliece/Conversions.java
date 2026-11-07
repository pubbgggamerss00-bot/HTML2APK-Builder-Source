package org.bouncycastle.pqc.legacy.crypto.mceliece;

import java.math.BigInteger;
import org.bouncycastle.pqc.legacy.math.linearalgebra.BigIntUtils;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.legacy.math.linearalgebra.IntegerFunctions;

/* loaded from: classes3.dex */
final class Conversions {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private Conversions() {
    }

    public static byte[] decode(int i10, int i11, GF2Vector gF2Vector) {
        if (gF2Vector.getLength() != i10 || gF2Vector.getHammingWeight() != i11) {
            throw new IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int[] vecArray = gF2Vector.getVecArray();
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i10, i11);
        BigInteger bigIntegerAdd = ZERO;
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i12 - i11)).divide(BigInteger.valueOf(i12));
            i12--;
            if ((vecArray[i13 >> 5] & (1 << (i13 & 31))) != 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerBinomial);
                int i14 = i11 - 1;
                bigIntegerBinomial = i12 == i14 ? ONE : bigIntegerBinomial.multiply(BigInteger.valueOf(i11)).divide(BigInteger.valueOf(i12 - i14));
                i11 = i14;
            }
        }
        return BigIntUtils.toMinimalByteArray(bigIntegerAdd);
    }

    public static GF2Vector encode(int i10, int i11, byte[] bArr) {
        if (i10 < i11) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i10, i11);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(bigIntegerBinomial) >= 0) {
            throw new IllegalArgumentException("Encoded number too large.");
        }
        GF2Vector gF2Vector = new GF2Vector(i10);
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i12 - i11)).divide(BigInteger.valueOf(i12));
            i12--;
            if (bigIntegerBinomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i13);
                bigInteger = bigInteger.subtract(bigIntegerBinomial);
                int i14 = i11 - 1;
                bigIntegerBinomial = i12 == i14 ? ONE : bigIntegerBinomial.multiply(BigInteger.valueOf(i11)).divide(BigInteger.valueOf(i12 - i14));
                i11 = i14;
            }
        }
        return gF2Vector;
    }

    public static byte[] signConversion(int i10, int i11, byte[] bArr) {
        if (i10 < i11) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i10, i11);
        int iBitLength = bigIntegerBinomial.bitLength() - 1;
        int i12 = iBitLength >> 3;
        int i13 = iBitLength & 7;
        int i14 = 8;
        if (i13 == 0) {
            i12--;
            i13 = 8;
        }
        int i15 = i10 >> 3;
        int i16 = i10 & 7;
        if (i16 == 0) {
            i15--;
        } else {
            i14 = i16;
        }
        int i17 = i15 + 1;
        byte[] bArr2 = new byte[i17];
        if (bArr.length < i17) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            for (int length = bArr.length; length < i17; length++) {
                bArr2[length] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, i15);
            bArr2[i15] = (byte) (bArr[i15] & ((1 << i14) - 1));
        }
        BigInteger bigIntegerAdd = ZERO;
        int i18 = i10;
        for (int i19 = 0; i19 < i10; i19++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(new BigInteger(Integer.toString(i18 - i11))).divide(new BigInteger(Integer.toString(i18)));
            i18--;
            if (((byte) (bArr2[i19 >>> 3] & (1 << (i19 & 7)))) != 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerBinomial);
                int i20 = i11 - 1;
                bigIntegerBinomial = i18 == i20 ? ONE : bigIntegerBinomial.multiply(new BigInteger(Integer.toString(i11))).divide(new BigInteger(Integer.toString(i18 - i20)));
                i11 = i20;
            }
        }
        int i21 = i12 + 1;
        byte[] bArr3 = new byte[i21];
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= i21) {
            System.arraycopy(byteArray, 0, bArr3, 0, i12);
            bArr3[i12] = (byte) (((1 << i13) - 1) & byteArray[i12]);
            return bArr3;
        }
        System.arraycopy(byteArray, 0, bArr3, 0, byteArray.length);
        for (int length2 = byteArray.length; length2 < i21; length2++) {
            bArr3[length2] = 0;
        }
        return bArr3;
    }
}
