package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class RadixConverter {
    private static final int DEFAULT_POWERS_TO_CACHE = 10;
    private static final double LOG_LONG_MAX_VALUE = Math.log(9.223372036854776E18d);
    private final int digitsGroupLength;
    private final BigInteger[] digitsGroupSpacePowers;
    private final BigInteger digitsGroupSpaceSize;
    private final int radix;

    public RadixConverter(int i10) {
        this(i10, 10);
    }

    private long fromEncoding(int i10, int i11, short[] sArr) {
        long j10 = 0;
        while (i10 < i11) {
            j10 = (j10 * this.radix) + (sArr[i10] & HPKE.aead_EXPORT_ONLY);
            i10++;
        }
        return j10;
    }

    private BigInteger[] precomputeDigitsGroupPowers(int i10, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr = new BigInteger[i10];
        BigInteger bigIntegerMultiply = bigInteger;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerArr[i11] = bigIntegerMultiply;
            bigIntegerMultiply = bigIntegerMultiply.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    private int toEncoding(long j10, int i10, short[] sArr) {
        int i11;
        for (int i12 = 0; i12 < this.digitsGroupLength && i10 >= 0; i12++) {
            if (j10 == 0) {
                i11 = i10 - 1;
                sArr[i10] = 0;
            } else {
                i11 = i10 - 1;
                int i13 = this.radix;
                sArr[i10] = (short) (j10 % i13);
                j10 /= i13;
            }
            i10 = i11;
        }
        if (j10 == 0) {
            return i10;
        }
        throw new IllegalStateException("Failed to convert decimal number");
    }

    public int getDigitsGroupLength() {
        return this.digitsGroupLength;
    }

    public int getRadix() {
        return this.radix;
    }

    public RadixConverter(int i10, int i11) {
        this.radix = i10;
        int iFloor = (int) Math.floor(LOG_LONG_MAX_VALUE / Math.log(i10));
        this.digitsGroupLength = iFloor;
        BigInteger bigIntegerPow = BigInteger.valueOf(i10).pow(iFloor);
        this.digitsGroupSpaceSize = bigIntegerPow;
        this.digitsGroupSpacePowers = precomputeDigitsGroupPowers(i11, bigIntegerPow);
    }

    public BigInteger fromEncoding(short[] sArr) {
        BigInteger bigIntegerMultiply = BigIntegers.ONE;
        int length = sArr.length;
        int i10 = length - this.digitsGroupLength;
        BigInteger bigIntegerAdd = null;
        int i11 = 0;
        while (true) {
            int i12 = this.digitsGroupLength;
            if (i10 <= (-i12)) {
                return bigIntegerAdd;
            }
            if (i10 < 0) {
                i12 += i10;
                i10 = 0;
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(fromEncoding(i10, Math.min(i12 + i10, length), sArr));
            if (i11 == 0) {
                bigIntegerAdd = bigIntegerValueOf;
            } else {
                BigInteger[] bigIntegerArr = this.digitsGroupSpacePowers;
                bigIntegerMultiply = i11 <= bigIntegerArr.length ? bigIntegerArr[i11 - 1] : bigIntegerMultiply.multiply(this.digitsGroupSpaceSize);
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerValueOf.multiply(bigIntegerMultiply));
            }
            i11++;
            i10 -= this.digitsGroupLength;
        }
    }

    public void toEncoding(BigInteger bigInteger, int i10, short[] sArr) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException();
        }
        int encoding = i10 - 1;
        do {
            if (bigInteger.equals(BigInteger.ZERO)) {
                sArr[encoding] = 0;
                encoding--;
            } else {
                BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger.divideAndRemainder(this.digitsGroupSpaceSize);
                BigInteger bigInteger2 = bigIntegerArrDivideAndRemainder[0];
                encoding = toEncoding(bigIntegerArrDivideAndRemainder[1].longValue(), encoding, sArr);
                bigInteger = bigInteger2;
            }
        } while (encoding >= 0);
        if (bigInteger.signum() != 0) {
            throw new IllegalArgumentException();
        }
    }
}
