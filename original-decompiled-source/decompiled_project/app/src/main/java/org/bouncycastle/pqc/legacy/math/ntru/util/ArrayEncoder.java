package org.bouncycastle.pqc.legacy.math.ntru.util;

import ad.k;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ArrayEncoder {
    private static final int[] COEFF1_TABLE = {0, 0, 0, 1, 1, 1, -1, -1};
    private static final int[] COEFF2_TABLE = {0, 1, -1, 0, 1, -1, 0, 1};
    private static final int[] BIT1_TABLE = {1, 1, 1, 0, 0, 0, 1, 0, 1};
    private static final int[] BIT2_TABLE = {1, 1, 1, 1, 0, 0, 0, 1, 0};
    private static final int[] BIT3_TABLE = {1, 0, 1, 0, 0, 1, 1, 1, 0};

    public static int[] decodeMod3Sves(byte[] bArr, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length * 8) {
            int bit = getBit(bArr, i11);
            int i13 = i11 + 2;
            int bit2 = getBit(bArr, i11 + 1);
            i11 += 3;
            int iB = k.b(bit2, 2, bit * 4, getBit(bArr, i13));
            int i14 = i12 + 1;
            iArr[i12] = COEFF1_TABLE[iB];
            i12 += 2;
            iArr[i14] = COEFF2_TABLE[iB];
            if (i12 > i10 - 2) {
                break;
            }
        }
        return iArr;
    }

    public static int[] decodeMod3Tight(InputStream inputStream, int i10) throws IOException {
        return decodeMod3Tight(Util.readFullLength(inputStream, (int) Math.ceil(((Math.log(3.0d) * i10) / Math.log(2.0d)) / 8.0d)), i10);
    }

    public static int[] decodeModQ(InputStream inputStream, int i10, int i11) throws IOException {
        return decodeModQ(Util.readFullLength(inputStream, (((31 - Integer.numberOfLeadingZeros(i11)) * i10) + 7) / 8), i10, i11);
    }

    public static byte[] encodeMod3Sves(int[] iArr) {
        byte[] bArr = new byte[((((iArr.length * 3) + 1) / 2) + 7) / 8];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < (iArr.length / 2) * 2) {
            int i13 = i10 + 1;
            int i14 = iArr[i10] + 1;
            i10 += 2;
            int i15 = iArr[i13] + 1;
            if (i14 == 0 && i15 == 0) {
                throw new IllegalStateException("Illegal encoding!");
            }
            int i16 = (i14 * 3) + i15;
            int[] iArr2 = {BIT1_TABLE[i16], BIT2_TABLE[i16], BIT3_TABLE[i16]};
            for (int i17 = 0; i17 < 3; i17++) {
                bArr[i12] = (byte) (bArr[i12] | (iArr2[i17] << i11));
                if (i11 == 7) {
                    i12++;
                    i11 = 0;
                } else {
                    i11++;
                }
            }
        }
        return bArr;
    }

    public static byte[] encodeMod3Tight(int[] iArr) {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int length = iArr.length - 1; length >= 0; length--) {
            bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.valueOf(3L)).add(BigInteger.valueOf(iArr[length] + 1));
        }
        int iBitLength = (BigInteger.valueOf(3L).pow(iArr.length).bitLength() + 7) / 8;
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= iBitLength) {
            return byteArray.length > iBitLength ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr, iBitLength - byteArray.length, byteArray.length);
        return bArr;
    }

    public static byte[] encodeModQ(int[] iArr, int i10) {
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i10);
        byte[] bArr = new byte[((iArr.length * iNumberOfLeadingZeros) + 7) / 8];
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            for (int i14 = 0; i14 < iNumberOfLeadingZeros; i14++) {
                bArr[i12] = (byte) ((((i13 >> i14) & 1) << i11) | bArr[i12]);
                if (i11 == 7) {
                    i12++;
                    i11 = 0;
                } else {
                    i11++;
                }
            }
        }
        return bArr;
    }

    private static int getBit(byte[] bArr, int i10) {
        return ((bArr[i10 / 8] & 255) >> (i10 % 8)) & 1;
    }

    public static int[] decodeMod3Tight(byte[] bArr, int i10) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iIntValue = bigInteger.mod(BigInteger.valueOf(3L)).intValue();
            int i12 = iIntValue - 1;
            iArr[i11] = i12;
            if (i12 > 1) {
                iArr[i11] = iIntValue - 4;
            }
            bigInteger = bigInteger.divide(BigInteger.valueOf(3L));
        }
        return iArr;
    }

    public static int[] decodeModQ(byte[] bArr, int i10, int i11) {
        int[] iArr = new int[i10];
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i11);
        int i12 = i10 * iNumberOfLeadingZeros;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 > 0 && i14 % iNumberOfLeadingZeros == 0) {
                i13++;
            }
            iArr[i13] = iArr[i13] + (getBit(bArr, i14) << (i14 % iNumberOfLeadingZeros));
        }
        return iArr;
    }
}
