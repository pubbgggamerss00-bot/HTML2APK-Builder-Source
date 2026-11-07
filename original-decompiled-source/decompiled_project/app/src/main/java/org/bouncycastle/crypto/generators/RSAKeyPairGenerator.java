package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import m.b;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private RSAKeyGenerationParameters param;

    private static int getNumberOfIterations(int i10, int i11) {
        if (i10 >= 1536) {
            if (i11 <= 100) {
                return 3;
            }
            if (i11 <= 128) {
                return 4;
            }
            return b.a(i11, CertificateBody.profileType, 2, 4);
        }
        if (i10 >= 1024) {
            if (i11 <= 100) {
                return 4;
            }
            if (i11 <= 112) {
                return 5;
            }
            return b.a(i11, 111, 2, 5);
        }
        if (i10 < 512) {
            if (i11 <= 80) {
                return 40;
            }
            return b.a(i11, 79, 2, 40);
        }
        if (i11 <= 80) {
            return 5;
        }
        if (i11 <= 100) {
            return 7;
        }
        return b.a(i11, 99, 2, 7);
    }

    public BigInteger chooseRandomPrime(int i10, BigInteger bigInteger, BigInteger bigInteger2) throws IllegalArgumentException {
        for (int i11 = 0; i11 != i10 * 5; i11++) {
            BigInteger bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i10, 1, this.param.getRandom());
            BigInteger bigIntegerMod = bigIntegerCreateRandomPrime.mod(bigInteger);
            BigInteger bigInteger3 = ONE;
            if (!bigIntegerMod.equals(bigInteger3) && bigIntegerCreateRandomPrime.multiply(bigIntegerCreateRandomPrime).compareTo(bigInteger2) >= 0 && isProbablePrime(bigIntegerCreateRandomPrime) && bigInteger.gcd(bigIntegerCreateRandomPrime.subtract(bigInteger3)).equals(bigInteger3)) {
                return bigIntegerCreateRandomPrime;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws IllegalArgumentException {
        BigInteger bigIntegerChooseRandomPrime;
        BigInteger bigIntegerChooseRandomPrime2;
        BigInteger bigIntegerMultiply;
        RSAKeyPairGenerator rSAKeyPairGenerator = this;
        int strength = rSAKeyPairGenerator.param.getStrength();
        int i10 = (strength + 1) / 2;
        int i11 = strength - i10;
        int i12 = strength / 2;
        int i13 = i12 - 100;
        int i14 = strength / 3;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = strength >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i12);
        BigInteger bigInteger = ONE;
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger.shiftLeft(i13);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z10 = false;
        while (!z10) {
            BigInteger publicExponent = rSAKeyPairGenerator.param.getPublicExponent();
            do {
                bigIntegerChooseRandomPrime = rSAKeyPairGenerator.chooseRandomPrime(i10, publicExponent, bigIntegerShiftLeft);
                while (true) {
                    bigIntegerChooseRandomPrime2 = rSAKeyPairGenerator.chooseRandomPrime(i11, publicExponent, bigIntegerShiftLeft);
                    BigInteger bigIntegerAbs = bigIntegerChooseRandomPrime2.subtract(bigIntegerChooseRandomPrime).abs();
                    if (bigIntegerAbs.bitLength() >= i13 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                        bigIntegerMultiply = bigIntegerChooseRandomPrime.multiply(bigIntegerChooseRandomPrime2);
                        if (bigIntegerMultiply.bitLength() == strength) {
                            break;
                        }
                        bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime.max(bigIntegerChooseRandomPrime2);
                    } else {
                        rSAKeyPairGenerator = this;
                        strength = strength;
                    }
                }
            } while (WNafUtil.getNafWeight(bigIntegerMultiply) < i15);
            if (bigIntegerChooseRandomPrime.compareTo(bigIntegerChooseRandomPrime2) < 0) {
                bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime;
                bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime2;
            }
            BigInteger bigInteger2 = ONE;
            BigInteger bigIntegerSubtract = bigIntegerChooseRandomPrime.subtract(bigInteger2);
            BigInteger bigIntegerSubtract2 = bigIntegerChooseRandomPrime2.subtract(bigInteger2);
            int i16 = strength;
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                z10 = true;
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, bigIntegerMultiply, publicExponent, true), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigIntegerChooseRandomPrime, bigIntegerChooseRandomPrime2, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), BigIntegers.modOddInverse(bigIntegerChooseRandomPrime, bigIntegerChooseRandomPrime2), true));
            }
            rSAKeyPairGenerator = this;
            strength = i16;
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (RSAKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSAKeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), null, CryptoServicePurpose.KEYGEN));
    }

    public boolean isProbablePrime(BigInteger bigInteger) {
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.param.getRandom(), getNumberOfIterations(bigInteger.bitLength(), this.param.getCertainty()));
    }
}
