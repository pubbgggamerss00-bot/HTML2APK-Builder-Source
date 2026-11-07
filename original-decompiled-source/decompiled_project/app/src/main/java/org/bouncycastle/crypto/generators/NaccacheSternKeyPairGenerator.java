package org.bouncycastle.crypto.generators;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;
import p.i0;

/* loaded from: classes2.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, CertificateBody.profileType, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i10) {
        Vector vector = new Vector(i10);
        for (int i11 = 0; i11 != i10; i11++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i11]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i10, int i11, SecureRandom secureRandom) throws IllegalArgumentException {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i10, i11, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i10);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i10) {
        int iNextInt;
        int i11;
        if (((-i10) & i10) == i10) {
            return (int) ((i10 * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i11 = iNextInt % i10;
        } while ((i10 - 1) + (iNextInt - i11) < 0);
        return i11;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            vector3.addElement(vector.elementAt(i10));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() throws IllegalArgumentException {
        long j10;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z10;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigIntegerMod;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        int i10;
        PrintStream printStream;
        StringBuilder sb;
        int i11;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        int i12;
        SecureRandom secureRandom2;
        int i13;
        BigInteger bigInteger8;
        BigInteger bigInteger9;
        int i14;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i15 = 0; i15 < vectorPermuteList.size() / 2; i15++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i15));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j11 = 0;
        while (true) {
            j10 = j11 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z10 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z10;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    BigInteger bigInteger10 = bigIntegerShiftLeft;
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger3 = bigInteger10;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i16 = strength;
                    secureRandom2 = random;
                    i13 = certainty;
                    bigInteger8 = bigIntegerGeneratePrime3;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    if (z10) {
                        PrintStream printStream2 = System.out;
                        i14 = i16;
                        StringBuilder sbB = i0.b(i14, "key size too small. Should be ", " but is actually ");
                        sbB.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbB.toString());
                    } else {
                        i14 = i16;
                    }
                } else {
                    i14 = strength;
                    secureRandom2 = random;
                    i13 = certainty;
                    bigInteger3 = bigIntegerShiftLeft;
                    bigInteger9 = bigIntegerGeneratePrime4;
                    bigInteger8 = bigIntegerGeneratePrime3;
                }
            } else {
                secureRandom2 = random;
                i13 = certainty;
                z10 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
                bigInteger3 = bigIntegerShiftLeft;
                bigInteger9 = bigIntegerGeneratePrime4;
                bigInteger8 = bigIntegerGeneratePrime3;
                i14 = strength;
            }
            bigIntegerGeneratePrime3 = bigInteger8;
            strength = i14;
            bigIntegerGeneratePrime4 = bigInteger9;
            j11 = j10;
            zIsDebug = z10;
            bigIntegerShiftLeft2 = bigInteger2;
            bigIntegerShiftLeft = bigInteger3;
            random = secureRandom2;
            certainty = i13;
        }
        BigInteger bigInteger11 = bigIntegerGeneratePrime4;
        if (z10) {
            bigInteger4 = bigIntegerGeneratePrime3;
            System.out.println("needed " + j10 + " tries to generate p and q.");
        } else {
            bigInteger4 = bigIntegerGeneratePrime3;
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z10) {
            System.out.println("generating g");
        }
        long j12 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger5 = bigIntegerAdd2;
            int i17 = 0;
            while (i17 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i17));
                while (true) {
                    j12++;
                    i11 = i17;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i12 = certainty;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        i17 = i11;
                        random = secureRandom;
                        certainty = i12;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i17 = i11 + 1;
                random = secureRandom;
                certainty = i12;
            }
            SecureRandom secureRandom3 = random;
            int i18 = certainty;
            bigIntegerMod = ONE;
            for (int i19 = 0; i19 < vectorPermuteList.size(); i19++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i19)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i19)), bigIntegerMultiply)).mod(bigIntegerMultiply);
            }
            int i20 = 0;
            while (true) {
                if (i20 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger12 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger12)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger12)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply).equals(bigInteger12)) {
                                bigInteger6 = bigInteger4;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger12)) {
                                    bigInteger7 = bigInteger11;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger7), bigIntegerMultiply).equals(bigInteger12)) {
                                        break;
                                    }
                                    if (z10) {
                                        i10 = strength;
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (z10) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger7 = bigInteger11;
                                }
                            } else if (z10) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb.append(bigIntegerMod);
                                printStream.println(sb.toString());
                            }
                        } else if (z10) {
                            printStream = System.out;
                            sb = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb.append(bigIntegerMod);
                            printStream.println(sb.toString());
                        }
                    } else if (z10) {
                        printStream = System.out;
                        sb = new StringBuilder("g has order phi(n)/4\n g:");
                        sb.append(bigIntegerMod);
                        printStream.println(sb.toString());
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i20)), bigIntegerMultiply).equals(ONE)) {
                    i20++;
                } else if (z10) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i20) + "\n g: " + bigIntegerMod);
                }
            }
            bigInteger7 = bigInteger11;
            bigInteger6 = bigInteger4;
            i10 = strength;
            bigInteger4 = bigInteger6;
            strength = i10;
            random = secureRandom3;
            certainty = i18;
            bigInteger11 = bigInteger7;
            bigIntegerAdd2 = bigInteger5;
        }
        if (z10) {
            System.out.println("needed " + j12 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb2 = new StringBuilder("a:.......... ");
            sb2.append(bigInteger6);
            printStream3.println(sb2.toString());
            System.out.println("b:.......... " + bigInteger7);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger5);
            System.out.println("n:.......... " + bigIntegerMultiply);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
