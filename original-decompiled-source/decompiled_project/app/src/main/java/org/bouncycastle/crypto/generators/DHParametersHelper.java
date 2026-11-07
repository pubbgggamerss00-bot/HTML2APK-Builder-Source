package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
class DHParametersHelper {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public static BigInteger[] generateSafePrimes(int i10, int i11, SecureRandom secureRandom) throws IllegalArgumentException {
        int i12 = i10 - 1;
        int i13 = i10 >>> 2;
        while (true) {
            BigInteger bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i12, 2, secureRandom);
            BigInteger bigIntegerAdd = bigIntegerCreateRandomPrime.shiftLeft(1).add(ONE);
            if (bigIntegerAdd.isProbablePrime(i11) && (i11 <= 2 || bigIntegerCreateRandomPrime.isProbablePrime(i11 - 2))) {
                if (WNafUtil.getNafWeight(bigIntegerAdd) >= i13) {
                    return new BigInteger[]{bigIntegerAdd, bigIntegerCreateRandomPrime};
                }
            }
        }
    }

    public static BigInteger selectGenerator(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
        do {
            BigInteger bigInteger3 = TWO;
            bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger3, bigIntegerSubtract, secureRandom).modPow(bigInteger3, bigInteger);
        } while (bigIntegerModPow.equals(ONE));
        return bigIntegerModPow;
    }
}
