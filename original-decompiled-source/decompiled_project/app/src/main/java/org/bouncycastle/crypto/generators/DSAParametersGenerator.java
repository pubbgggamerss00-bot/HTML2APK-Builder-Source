package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes2.dex */
public class DSAParametersGenerator {
    private int L;
    private int N;
    private int certainty;
    private Digest digest;
    private int iterations;
    private SecureRandom random;
    private int usageIndex;
    private boolean use186_3;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    public DSAParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    private static BigInteger calculateGenerator_FIPS186_2(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
        BigInteger bigIntegerSubtract = bigInteger.subtract(TWO);
        do {
            bigIntegerModPow = BigIntegers.createRandomInRange(TWO, bigIntegerSubtract, secureRandom).modPow(bigIntegerDivide, bigInteger);
        } while (bigIntegerModPow.bitLength() <= 1);
        return bigIntegerModPow;
    }

    private static BigInteger calculateGenerator_FIPS186_3_Unverifiable(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return calculateGenerator_FIPS186_2(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger calculateGenerator_FIPS186_3_Verifiable(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i10) {
        BigInteger bigIntegerDivide = bigInteger.subtract(ONE).divide(bigInteger2);
        byte[] bArrDecodeStrict = Hex.decodeStrict("6767656E");
        int length = bArr.length + bArrDecodeStrict.length;
        byte[] bArr2 = new byte[length + 3];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecodeStrict, 0, bArr2, bArr.length, bArrDecodeStrict.length);
        bArr2[length] = (byte) i10;
        byte[] bArr3 = new byte[digest.getDigestSize()];
        for (int i11 = 1; i11 < 65536; i11++) {
            inc(bArr2);
            hash(digest, bArr2, bArr3, 0);
            BigInteger bigIntegerModPow = new BigInteger(1, bArr3).modPow(bigIntegerDivide, bigInteger);
            if (bigIntegerModPow.compareTo(TWO) >= 0) {
                return bigIntegerModPow;
            }
        }
        return null;
    }

    private DSAParameters generateParameters_FIPS186_2() {
        int i10 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i11 = this.L;
        int i12 = (i11 - 1) / 160;
        int i13 = i11 / 8;
        byte[] bArr5 = new byte[i13];
        if (!(this.digest instanceof SHA1Digest)) {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
        while (true) {
            this.random.nextBytes(bArr);
            hash(this.digest, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i10);
            inc(bArr3);
            hash(this.digest, bArr3, bArr3, 0);
            for (int i14 = 0; i14 != i10; i14++) {
                bArr4[i14] = (byte) (bArr2[i14] ^ bArr3[i14]);
            }
            bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (isProbablePrime(bigInteger)) {
                byte[] bArrClone = Arrays.clone(bArr);
                inc(bArrClone);
                int i15 = 0;
                while (i15 < 4096) {
                    for (int i16 = 1; i16 <= i12; i16++) {
                        inc(bArrClone);
                        hash(this.digest, bArrClone, bArr5, i13 - (i16 * 20));
                    }
                    int i17 = i13 - (i12 * 20);
                    inc(bArrClone);
                    hash(this.digest, bArrClone, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i17, bArr5, 0, i17);
                    bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.L && isProbablePrime(bigIntegerSubtract)) {
                        return new DSAParameters(bigIntegerSubtract, bigInteger, calculateGenerator_FIPS186_2(bigIntegerSubtract, bigInteger, this.random), new DSAValidationParameters(bArr, i15));
                    }
                    i15++;
                    i10 = 20;
                }
            }
        }
    }

    private DSAParameters generateParameters_FIPS186_3() {
        BigInteger bit;
        int i10;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerCalculateGenerator_FIPS186_3_Verifiable;
        Digest digest = this.digest;
        int digestSize = digest.getDigestSize() * 8;
        byte[] bArr = new byte[this.N / 8];
        int i11 = this.L;
        int i12 = (i11 - 1) / digestSize;
        int i13 = (i11 - 1) % digestSize;
        int i14 = i11 / 8;
        byte[] bArr2 = new byte[i14];
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.random.nextBytes(bArr);
            int i15 = 0;
            hash(digest, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(ONE.shiftLeft(this.N - 1)).setBit(0).setBit(this.N - 1);
            if (isProbablePrime(bit)) {
                byte[] bArrClone = Arrays.clone(bArr);
                int i16 = this.L * 4;
                i10 = 0;
                while (i10 < i16) {
                    for (int i17 = 1; i17 <= i12; i17++) {
                        inc(bArrClone);
                        hash(digest, bArrClone, bArr2, i14 - (i17 * digestSize2));
                    }
                    int i18 = i14 - (i12 * digestSize2);
                    inc(bArrClone);
                    hash(digest, bArrClone, bArr3, i15);
                    System.arraycopy(bArr3, digestSize2 - i18, bArr2, i15, i18);
                    bArr2[i15] = (byte) (bArr2[i15] | Byte.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    bigIntegerSubtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(ONE));
                    if (bigIntegerSubtract.bitLength() == this.L && isProbablePrime(bigIntegerSubtract)) {
                        break loop0;
                    }
                    i10++;
                    i15 = 0;
                }
            }
        }
        int i19 = this.usageIndex;
        return (i19 < 0 || (bigIntegerCalculateGenerator_FIPS186_3_Verifiable = calculateGenerator_FIPS186_3_Verifiable(digest, bigIntegerSubtract, bit, bArr, i19)) == null) ? new DSAParameters(bigIntegerSubtract, bit, calculateGenerator_FIPS186_3_Unverifiable(bigIntegerSubtract, bit, this.random), new DSAValidationParameters(bArr, i10)) : new DSAParameters(bigIntegerSubtract, bit, bigIntegerCalculateGenerator_FIPS186_3_Verifiable, new DSAValidationParameters(bArr, i10, this.usageIndex));
    }

    private static int getDefaultN(int i10) {
        return i10 > 1024 ? 256 : 160;
    }

    private static int getMinimumIterations(int i10) {
        if (i10 <= 1024) {
            return 40;
        }
        return (((i10 - 1) / 1024) * 8) + 48;
    }

    private static void hash(Digest digest, byte[] bArr, byte[] bArr2, int i10) {
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, i10);
    }

    private static void inc(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private boolean isProbablePrime(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.certainty);
    }

    public DSAParameters generateParameters() {
        return this.use186_3 ? generateParameters_FIPS186_3() : generateParameters_FIPS186_2();
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.L = i10;
        this.N = getDefaultN(i10);
        this.certainty = i11;
        this.iterations = Math.max(getMinimumIterations(this.L), (i11 + 1) / 2);
        this.random = secureRandom;
        this.use186_3 = false;
        this.usageIndex = -1;
    }

    public DSAParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    public void init(DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l10 = dSAParameterGenerationParameters.getL();
        int n10 = dSAParameterGenerationParameters.getN();
        if (l10 < 1024 || l10 > 3072 || l10 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (l10 == 1024 && n10 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (l10 == 2048 && n10 != 224 && n10 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (l10 == 3072 && n10 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.digest.getDigestSize() * 8 < n10) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.L = l10;
        this.N = n10;
        this.certainty = dSAParameterGenerationParameters.getCertainty();
        this.iterations = Math.max(getMinimumIterations(l10), (this.certainty + 1) / 2);
        this.random = dSAParameterGenerationParameters.getRandom();
        this.use186_3 = true;
        this.usageIndex = dSAParameterGenerationParameters.getUsageIndex();
    }
}
