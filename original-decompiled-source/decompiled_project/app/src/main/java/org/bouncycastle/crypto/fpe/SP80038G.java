package org.bouncycastle.crypto.fpe;

import j2.y;
import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
    static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    public static int calculateB_FF1(int i10, int i11) {
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i10);
        int iBitLength = iNumberOfTrailingZeros * i11;
        int i12 = i10 >>> iNumberOfTrailingZeros;
        if (i12 != 1) {
            iBitLength += BigInteger.valueOf(i12).pow(i11).bitLength();
        }
        return (iBitLength + 7) / 8;
    }

    public static BigInteger[] calculateModUV(BigInteger bigInteger, int i10, int i11) {
        BigInteger bigIntegerPow = bigInteger.pow(i10);
        BigInteger[] bigIntegerArr = {bigIntegerPow, bigIntegerPow};
        if (i11 != i10) {
            bigIntegerArr[1] = bigIntegerPow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    public static byte[] calculateP_FF1(int i10, byte b10, int i11, int i12) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i10 >> 8), (byte) i10, 10, b10, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i11, bArr, 8);
        Pack.intToBigEndian(i12, bArr, 12);
        return bArr;
    }

    public static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        byte b12 = bArr[2];
        byte b13 = bArr[3];
        return new byte[]{b10, b11, b12, (byte) (b13 & 240), bArr[4], bArr[5], bArr[6], (byte) (b13 << 4)};
    }

    public static BigInteger calculateY_FF1(BlockCipher blockCipher, byte[] bArr, int i10, int i11, int i12, byte[] bArr2, short[] sArr, RadixConverter radixConverter) throws IllegalStateException, DataLengthException {
        int length = bArr.length;
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        int i13 = ((-(length + i10 + 1)) & 15) + length;
        int i14 = i13 + 1 + i10;
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i13] = (byte) i12;
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr3, i14 - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArrPrf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i11 > 16) {
            int i15 = (i11 + 15) / 16;
            byte[] bArr4 = new byte[i15 * 16];
            int iBigEndianToInt = Pack.bigEndianToInt(bArrPrf, 12);
            System.arraycopy(bArrPrf, 0, bArr4, 0, 16);
            for (int i16 = 1; i16 < i15; i16++) {
                int i17 = i16 * 16;
                System.arraycopy(bArrPrf, 0, bArr4, i17, 12);
                Pack.intToBigEndian(iBigEndianToInt ^ i16, bArr4, i17 + 12);
                blockCipher.processBlock(bArr4, i17, bArr4, i17);
            }
            bArrPrf = bArr4;
        }
        return num(bArrPrf, 0, i11);
    }

    public static BigInteger calculateY_FF3(BlockCipher blockCipher, byte[] bArr, int i10, int i11, short[] sArr, RadixConverter radixConverter) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(Pack.bigEndianToInt(bArr, i10) ^ i11, bArr2, 0);
        BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr), bArr2, 4, 12);
        Arrays.reverseInPlace(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        Arrays.reverseInPlace(bArr2);
        return num(bArr2, 0, 16);
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z10, int i10, byte[] bArr, int i11, int i12) {
        checkCipher(blockCipher);
        if (i10 < 2 || i10 > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z10, i10, bArr, i11, i12);
    }

    public static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkData(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        checkLength(z10, i10, i12);
        for (int i13 = 0; i13 < i12; i13++) {
            if ((bArr[i11 + i13] & 255) >= i10) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void checkLength(boolean z10, int i10, int i11) {
        int iFloor;
        if (i11 >= 2) {
            double d10 = i10;
            if (Math.pow(d10, i11) >= 1000000.0d) {
                if (!z10 && i11 > (iFloor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d10))) * 2)) {
                    throw new IllegalArgumentException(y.a(iFloor, "maximum input length is "));
                }
                return;
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    public static short[] decFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i10, int i11, int i12, short[] sArr, short[] sArr2) throws IllegalStateException, DataLengthException {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i12);
        int i13 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i11, i10, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i11, i12);
        int i14 = 9;
        short[] sArr3 = sArr2;
        int i15 = i11;
        short[] sArr4 = sArr;
        while (i14 >= 0) {
            int i16 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i17 = i14;
            i15 = i10 - i15;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).subtract(calculateY_FF1(blockCipher, bArr, i16, i13, i17, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i17 & 1]), i15, sArr3);
            i14 = i17 - 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i16;
        }
        return Arrays.concatenate(sArr4, sArr3);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i10, int i11, int i12, short[] sArr, short[] sArr2) throws IllegalStateException, DataLengthException {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i11, i12);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i13 = 7;
        while (i13 >= 0) {
            i12 = i10 - i12;
            int i14 = i13 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr4).subtract(calculateY_FF3(blockCipher2, bArr, 4 - (i14 * 4), i13, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i14]), i12, sArr4);
            i13--;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr3);
        Arrays.reverseInPlace(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    public static byte[] decryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i10, i11);
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        return toByte(decFF1(blockCipher, radixConverter, bArr, i11, i12, i13, toShort(bArr2, i10, i12), toShort(bArr2, i10 + i12, i13)));
    }

    public static short[] decryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i10, i11);
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i10, sArr2, 0, i12);
        System.arraycopy(sArr, i10 + i12, sArr3, 0, i13);
        return decFF1(blockCipher, radixConverter, bArr, i11, i12, i13, sArr2, sArr3);
    }

    public static byte[] decryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i10, i11);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, radixConverter, bArr, bArr2, i10, i11);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] decryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i10, i11);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i10, i11);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] decryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i10, i11);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i10, i11);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] encFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i10, int i11, int i12, short[] sArr, short[] sArr2) throws IllegalStateException, DataLengthException {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i12);
        int i13 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i11, i10, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i11, i12);
        int i14 = 0;
        short[] sArr3 = sArr;
        int i15 = i12;
        short[] sArr4 = sArr2;
        while (i14 < 10) {
            int i16 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i17 = i14;
            i15 = i10 - i15;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).add(calculateY_FF1(blockCipher, bArr, i16, i13, i17, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i17 & 1]), i15, sArr3);
            i14 = i17 + 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i16;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i10, int i11, int i12, short[] sArr, short[] sArr2) throws IllegalStateException, DataLengthException {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i11, i12);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr2;
        int i13 = 0;
        while (i13 < 8) {
            i11 = i10 - i11;
            int i14 = i13 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr).add(calculateY_FF3(blockCipher2, bArr, 4 - (i14 * 4), i13, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i14]), i11, sArr);
            i13++;
            short[] sArr4 = sArr3;
            sArr3 = sArr;
            sArr = sArr4;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr3);
        return Arrays.concatenate(sArr, sArr3);
    }

    public static byte[] encryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i10, i11);
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        return toByte(encFF1(blockCipher, radixConverter, bArr, i11, i12, i13, toShort(bArr2, i10, i12), toShort(bArr2, i10 + i12, i13)));
    }

    public static short[] encryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i10, i11);
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        short[] sArr2 = new short[i12];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i10, sArr2, 0, i12);
        System.arraycopy(sArr, i10 + i12, sArr3, 0, i13);
        return encFF1(blockCipher, radixConverter, bArr, i11, i12, i13, sArr2, sArr3);
    }

    public static byte[] encryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i10, i11);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, radixConverter, bArr, bArr2, i10, i11);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] encryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i10, i11);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i10, i11);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i10, i11);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i10, i11);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    public static short[] encryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i10, i11);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, radixConverter, bArr, sArr, i10, i11);
        }
        throw new IllegalArgumentException();
    }

    public static byte[] implDecryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        return toByte(decFF3_1(blockCipher, radixConverter, bArr, i11, i12, i13, toShort(bArr2, i10, i13), toShort(bArr2, i10 + i13, i12)));
    }

    public static short[] implDecryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i10, sArr2, 0, i13);
        System.arraycopy(sArr, i10 + i13, sArr3, 0, i12);
        return decFF3_1(blockCipher, radixConverter, bArr, i11, i12, i13, sArr2, sArr3);
    }

    public static byte[] implEncryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i10, int i11) {
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        return toByte(encFF3_1(blockCipher, radixConverter, bArr, i11, i12, i13, toShort(bArr2, i10, i13), toShort(bArr2, i10 + i13, i12)));
    }

    public static short[] implEncryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i10, int i11) {
        int i12 = i11 / 2;
        int i13 = i11 - i12;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i12];
        System.arraycopy(sArr, i10, sArr2, 0, i13);
        System.arraycopy(sArr, i10 + i13, sArr3, 0, i12);
        return encFF3_1(blockCipher, radixConverter, bArr, i11, i12, i13, sArr2, sArr3);
    }

    public static BigInteger num(byte[] bArr, int i10, int i11) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i10, i11 + i10));
    }

    public static byte[] prf(BlockCipher blockCipher, byte[] bArr) throws IllegalStateException, DataLengthException {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < length; i10++) {
            Bytes.xorTo(16, bArr, i10 * 16, bArr2, 0);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) sArr[i10];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i10, int i11) {
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            sArr[i12] = (short) (bArr[i10 + i12] & 255);
        }
        return sArr;
    }

    public static void checkArgs(BlockCipher blockCipher, boolean z10, int i10, short[] sArr, int i11, int i12) {
        checkCipher(blockCipher);
        if (i10 < 2 || i10 > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z10, i10, sArr, i11, i12);
    }

    public static void checkData(boolean z10, int i10, short[] sArr, int i11, int i12) {
        checkLength(z10, i10, i12);
        for (int i13 = 0; i13 < i12; i13++) {
            if ((sArr[i11 + i13] & HPKE.aead_EXPORT_ONLY) >= i10) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }
}
