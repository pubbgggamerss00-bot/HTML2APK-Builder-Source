package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import com.yalantis.ucrop.view.CropImageView;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public final class IntegerFunctions {
    private static final long SMALL_PRIME_PRODUCT = 152125131763605L;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger FOUR = BigInteger.valueOf(4);
    private static final int[] SMALL_PRIMES = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
    private static SecureRandom sr = null;
    private static final int[] jacobiTable = {0, 1, 0, -1, 0, -1, 0, 1};

    private IntegerFunctions() {
    }

    public static BigInteger binomial(int i10, int i11) {
        BigInteger bigIntegerDivide = ONE;
        if (i10 == 0) {
            return i11 == 0 ? bigIntegerDivide : ZERO;
        }
        if (i11 > (i10 >>> 1)) {
            i11 = i10 - i11;
        }
        for (int i12 = 1; i12 <= i11; i12++) {
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(i10 - (i12 - 1))).divide(BigInteger.valueOf(i12));
        }
        return bigIntegerDivide;
    }

    public static int bitCount(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>>= 1;
        }
        return i11;
    }

    public static int ceilLog(int i10) {
        int i11 = 0;
        int i12 = 1;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public static int ceilLog256(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 8;
        }
        return i11;
    }

    public static BigInteger divideAndRound(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.signum() < 0 ? divideAndRound(bigInteger.negate(), bigInteger2).negate() : bigInteger2.signum() < 0 ? divideAndRound(bigInteger, bigInteger2.negate()).negate() : bigInteger.shiftLeft(1).add(bigInteger2).divide(bigInteger2.shiftLeft(1));
    }

    public static int[] extGCD(int i10, int i11) {
        BigInteger[] bigIntegerArrExtgcd = extgcd(BigInteger.valueOf(i10), BigInteger.valueOf(i11));
        return new int[]{bigIntegerArrExtgcd[0].intValue(), bigIntegerArrExtgcd[1].intValue(), bigIntegerArrExtgcd[2].intValue()};
    }

    public static BigInteger[] extgcd(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = ONE;
        BigInteger bigIntegerDivide = ZERO;
        if (bigInteger2.signum() != 0) {
            BigInteger bigInteger4 = bigInteger;
            BigInteger bigInteger5 = bigInteger2;
            while (bigInteger5.signum() != 0) {
                BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger4.divideAndRemainder(bigInteger5);
                BigInteger bigInteger6 = bigIntegerArrDivideAndRemainder[0];
                BigInteger bigInteger7 = bigIntegerArrDivideAndRemainder[1];
                BigInteger bigInteger8 = bigIntegerDivide;
                bigIntegerDivide = bigInteger3.subtract(bigInteger6.multiply(bigIntegerDivide));
                bigInteger3 = bigInteger8;
                bigInteger4 = bigInteger5;
                bigInteger5 = bigInteger7;
            }
            bigIntegerDivide = bigInteger4.subtract(bigInteger.multiply(bigInteger3)).divide(bigInteger2);
            bigInteger = bigInteger4;
        }
        return new BigInteger[]{bigInteger, bigInteger3, bigIntegerDivide};
    }

    public static float floatPow(float f10, int i10) {
        float f11 = 1.0f;
        while (i10 > 0) {
            f11 *= f10;
            i10--;
        }
        return f11;
    }

    public static int floorLog(int i10) {
        if (i10 <= 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = i10 >>> 1; i12 > 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static int gcd(int i10, int i11) {
        return BigInteger.valueOf(i10).gcd(BigInteger.valueOf(i11)).intValue();
    }

    public static float intRoot(int i10, int i11) {
        float fFloatPow;
        float fFloatPow2 = i10 / i11;
        float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (Math.abs(f10 - fFloatPow2) > 1.0E-4d) {
            while (true) {
                fFloatPow = floatPow(fFloatPow2, i11);
                if (Float.isInfinite(fFloatPow)) {
                    fFloatPow2 = (fFloatPow2 + f10) / 2.0f;
                }
            }
            f10 = fFloatPow2;
            fFloatPow2 -= (fFloatPow - i10) / (floatPow(fFloatPow2, i11 - 1) * i11);
        }
        return fFloatPow2;
    }

    public static byte[] integerToOctets(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int iBitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 1, bArr, 0, iBitLength);
        return bArr;
    }

    public static boolean isIncreasing(int[] iArr) {
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (iArr[i10 - 1] >= iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int isPower(int i10, int i11) {
        if (i10 <= 0) {
            return -1;
        }
        int i12 = 0;
        while (i10 > 1) {
            if (i10 % i11 != 0) {
                return -1;
            }
            i10 /= i11;
            i12++;
        }
        return i12;
    }

    public static boolean isPrime(int i10) {
        if (i10 < 2) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if ((i10 & 1) == 0) {
            return false;
        }
        if (i10 < 42) {
            int i11 = 0;
            while (true) {
                int[] iArr = SMALL_PRIMES;
                if (i11 >= iArr.length) {
                    break;
                }
                if (i10 == iArr[i11]) {
                    return true;
                }
                i11++;
            }
        }
        if (i10 % 3 == 0 || i10 % 5 == 0 || i10 % 7 == 0 || i10 % 11 == 0 || i10 % 13 == 0 || i10 % 17 == 0 || i10 % 19 == 0 || i10 % 23 == 0 || i10 % 29 == 0 || i10 % 31 == 0 || i10 % 37 == 0 || i10 % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf(i10).isProbablePrime(20);
    }

    public static int jacobi(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerAdd = ZERO;
        if (bigInteger2.equals(bigIntegerAdd)) {
            return bigInteger.abs().equals(ONE) ? 1 : 0;
        }
        if (!bigInteger.testBit(0) && !bigInteger2.testBit(0)) {
            return 0;
        }
        long j10 = 1;
        if (bigInteger2.signum() == -1) {
            bigInteger2 = bigInteger2.negate();
            if (bigInteger.signum() == -1) {
                j10 = -1;
            }
        }
        while (!bigInteger2.testBit(0)) {
            bigIntegerAdd = bigIntegerAdd.add(ONE);
            bigInteger2 = bigInteger2.divide(TWO);
        }
        if (bigIntegerAdd.testBit(0)) {
            j10 *= jacobiTable[bigInteger.intValue() & 7];
        }
        if (bigInteger.signum() < 0) {
            if (bigInteger2.testBit(1)) {
                j10 = -j10;
            }
            bigInteger = bigInteger.negate();
        }
        while (bigInteger.signum() != 0) {
            BigInteger bigIntegerAdd2 = ZERO;
            while (!bigInteger.testBit(0)) {
                bigIntegerAdd2 = bigIntegerAdd2.add(ONE);
                bigInteger = bigInteger.divide(TWO);
            }
            if (bigIntegerAdd2.testBit(0)) {
                j10 *= jacobiTable[bigInteger2.intValue() & 7];
            }
            if (bigInteger.compareTo(bigInteger2) >= 0) {
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = bigInteger;
                bigInteger = bigInteger3;
            } else if (bigInteger2.testBit(1) && bigInteger.testBit(1)) {
                j10 = -j10;
            }
            BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger);
            bigInteger2 = bigInteger;
            bigInteger = bigIntegerSubtract;
        }
        if (bigInteger2.equals(ONE)) {
            return (int) j10;
        }
        return 0;
    }

    public static BigInteger leastCommonMultiple(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        BigInteger bigIntegerDivide = bigIntegerArr[0];
        for (int i10 = 1; i10 < length; i10++) {
            bigIntegerDivide = bigIntegerDivide.multiply(bigIntegerArr[i10]).divide(bigIntegerDivide.gcd(bigIntegerArr[i10]));
        }
        return bigIntegerDivide;
    }

    public static int leastDiv(int i10) {
        if (i10 < 0) {
            i10 = -i10;
        }
        if (i10 == 0) {
            return 1;
        }
        if ((i10 & 1) == 0) {
            return 2;
        }
        for (int i11 = 3; i11 <= i10 / i11; i11 += 2) {
            if (i10 % i11 == 0) {
                return i11;
            }
        }
        return i10;
    }

    public static double log(double d10) {
        double d11 = 1.0d;
        if (d10 > 0.0d && d10 < 1.0d) {
            return -log(1.0d / d10);
        }
        int i10 = 0;
        double d12 = d10;
        while (d12 > 2.0d) {
            d12 /= 2.0d;
            i10++;
            d11 *= 2.0d;
        }
        return i10 + logBKM(d10 / d11);
    }

    private static double logBKM(double d10) {
        double[] dArr = {1.0d, 0.5849625007211562d, 0.32192809488736235d, 0.16992500144231237d, 0.0874628412503394d, 0.044394119358453436d, 0.02236781302845451d, 0.01122725542325412d, 0.005624549193878107d, 0.0028150156070540383d, 0.0014081943928083889d, 7.042690112466433E-4d, 3.5217748030102726E-4d, 1.7609948644250602E-4d, 8.80524301221769E-5d, 4.4026886827316716E-5d, 2.2013611360340496E-5d, 1.1006847667481442E-5d, 5.503434330648604E-6d, 2.751719789561283E-6d, 1.375860550841138E-6d, 6.879304394358497E-7d, 3.4396526072176454E-7d, 1.7198264061184464E-7d, 8.599132286866321E-8d, 4.299566207501687E-8d, 2.1497831197679756E-8d, 1.0748915638882709E-8d, 5.374457829452062E-9d, 2.687228917228708E-9d, 1.3436144592400231E-9d, 6.718072297764289E-10d, 3.3590361492731876E-10d, 1.6795180747343547E-10d, 8.397590373916176E-11d, 4.1987951870191886E-11d, 2.0993975935248694E-11d, 1.0496987967662534E-11d, 5.2484939838408146E-12d, 2.624246991922794E-12d, 1.3121234959619935E-12d, 6.56061747981146E-13d, 3.2803087399061026E-13d, 1.6401543699531447E-13d, 8.200771849765956E-14d, 4.1003859248830365E-14d, 2.0501929624415328E-14d, 1.02509648122077E-14d, 5.1254824061038595E-15d, 2.5627412030519317E-15d, 1.2813706015259665E-15d, 6.406853007629834E-16d, 3.203426503814917E-16d, 1.6017132519074588E-16d, 8.008566259537294E-17d, 4.004283129768647E-17d, 2.0021415648843235E-17d, 1.0010707824421618E-17d, 5.005353912210809E-18d, 2.5026769561054044E-18d, 1.2513384780527022E-18d, 6.256692390263511E-19d, 3.1283461951317555E-19d, 1.5641730975658778E-19d, 7.820865487829389E-20d, 3.9104327439146944E-20d, 1.9552163719573472E-20d, 9.776081859786736E-21d, 4.888040929893368E-21d, 2.444020464946684E-21d, 1.222010232473342E-21d, 6.11005116236671E-22d, 3.055025581183355E-22d, 1.5275127905916775E-22d, 7.637563952958387E-23d, 3.818781976479194E-23d, 1.909390988239597E-23d, 9.546954941197984E-24d, 4.773477470598992E-24d, 2.386738735299496E-24d, 1.193369367649748E-24d, 5.96684683824874E-25d, 2.98342341912437E-25d, 1.491711709562185E-25d, 7.458558547810925E-26d, 3.7292792739054626E-26d, 1.8646396369527313E-26d, 9.323198184763657E-27d, 4.661599092381828E-27d, 2.330799546190914E-27d, 1.165399773095457E-27d, 5.826998865477285E-28d, 2.9134994327386427E-28d, 1.4567497163693213E-28d, 7.283748581846607E-29d, 3.6418742909233034E-29d, 1.8209371454616517E-29d, 9.104685727308258E-30d, 4.552342863654129E-30d, 2.2761714318270646E-30d};
        double d11 = 1.0d;
        double d12 = 0.0d;
        double d13 = 1.0d;
        for (int i10 = 0; i10 < 53; i10++) {
            double d14 = (d11 * d13) + d11;
            if (d14 <= d10) {
                d12 += dArr[i10];
                d11 = d14;
            }
            d13 *= 0.5d;
        }
        return d12;
    }

    public static int maxPower(int i10) {
        int i11 = 0;
        if (i10 != 0) {
            for (int i12 = 1; (i10 & i12) == 0; i12 <<= 1) {
                i11++;
            }
        }
        return i11;
    }

    public static long mod(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 < 0 ? j12 + j11 : j12;
    }

    public static int modInverse(int i10, int i11) {
        return BigInteger.valueOf(i10).modInverse(BigInteger.valueOf(i11)).intValue();
    }

    public static int modPow(int i10, int i11, int i12) {
        if (i12 <= 0) {
            return 0;
        }
        long j10 = i12;
        if (j10 * j10 > 2147483647L || i11 < 0) {
            return 0;
        }
        int i13 = ((i10 % i12) + i12) % i12;
        int i14 = 1;
        while (i11 > 0) {
            if ((i11 & 1) == 1) {
                i14 = (i14 * i13) % i12;
            }
            i13 = (i13 * i13) % i12;
            i11 >>>= 1;
        }
        return i14;
    }

    public static BigInteger nextPrime(long j10) {
        if (j10 <= 1) {
            return BigInteger.valueOf(2L);
        }
        if (j10 == 2) {
            return BigInteger.valueOf(3L);
        }
        boolean z10 = false;
        long j11 = 0;
        for (long j12 = j10 + 1 + (j10 & 1); j12 <= (j10 << 1) && !z10; j12 += 2) {
            for (long j13 = 3; j13 <= (j12 >> 1) && !z10; j13 += 2) {
                if (j12 % j13 == 0) {
                    z10 = true;
                }
            }
            if (!z10) {
                j11 = j12;
            }
            z10 = !z10;
        }
        return BigInteger.valueOf(j11);
    }

    public static BigInteger nextProbablePrime(BigInteger bigInteger) {
        return nextProbablePrime(bigInteger, 20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0012, code lost:
    
        r2 = r2 - 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int nextSmallerPrime(int i10) {
        int i11;
        if (i10 <= 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if ((i10 & 1) == 0) {
            i11 = i10 - 1;
            while (i11 > 3 && !isPrime(i11)) {
            }
            return i11;
        }
        i11 -= 2;
    }

    public static BigInteger octetsToInteger(byte[] bArr) {
        return octetsToInteger(bArr, 0, bArr.length);
    }

    public static int order(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 == 0) {
            throw new IllegalArgumentException(i10 + " is not an element of Z/(" + i11 + "Z)^*; it is not meaningful to compute its order.");
        }
        int i13 = 1;
        while (i12 != 1) {
            i12 = (i12 * i10) % i11;
            if (i12 < 0) {
                i12 += i11;
            }
            i13++;
        }
        return i13;
    }

    public static boolean passesSmallPrimeTest(BigInteger bigInteger) {
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, CertificateBody.profileType, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499};
        for (int i10 = 0; i10 < 239; i10++) {
            if (bigInteger.mod(BigInteger.valueOf(iArr[i10])).equals(ZERO)) {
                return false;
            }
        }
        return true;
    }

    public static int pow(int i10, int i11) {
        int i12 = 1;
        while (i11 > 0) {
            if ((i11 & 1) == 1) {
                i12 *= i10;
            }
            i10 *= i10;
            i11 >>>= 1;
        }
        return i12;
    }

    public static BigInteger randomize(BigInteger bigInteger) {
        if (sr == null) {
            sr = CryptoServicesRegistrar.getSecureRandom();
        }
        return randomize(bigInteger, sr);
    }

    public static BigInteger reduceInto(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.subtract(bigInteger2).mod(bigInteger3.subtract(bigInteger2)).add(bigInteger2);
    }

    public static BigInteger squareRoot(BigInteger bigInteger) {
        int i10;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerMultiply = ZERO;
        if (bigInteger.compareTo(bigIntegerMultiply) < 0) {
            throw new ArithmeticException("cannot extract root of negative number" + bigInteger + ".");
        }
        int iBitLength = bigInteger.bitLength();
        if ((iBitLength & 1) != 0) {
            int i11 = iBitLength - 1;
            bigIntegerAdd = bigIntegerMultiply;
            bigIntegerMultiply = bigIntegerMultiply.add(ONE);
            i10 = i11;
        } else {
            i10 = iBitLength;
            bigIntegerAdd = bigIntegerMultiply;
        }
        while (i10 > 0) {
            BigInteger bigInteger2 = FOUR;
            BigInteger bigIntegerMultiply2 = bigIntegerAdd.multiply(bigInteger2);
            int i12 = bigInteger.testBit(i10 + (-1)) ? 2 : 0;
            i10 -= 2;
            bigIntegerAdd = bigIntegerMultiply2.add(BigInteger.valueOf((bigInteger.testBit(i10) ? 1 : 0) + i12));
            BigInteger bigIntegerMultiply3 = bigIntegerMultiply.multiply(bigInteger2);
            BigInteger bigInteger3 = ONE;
            BigInteger bigIntegerAdd2 = bigIntegerMultiply3.add(bigInteger3);
            bigIntegerMultiply = bigIntegerMultiply.multiply(TWO);
            if (bigIntegerAdd.compareTo(bigIntegerAdd2) != -1) {
                bigIntegerMultiply = bigIntegerMultiply.add(bigInteger3);
                bigIntegerAdd = bigIntegerAdd.subtract(bigIntegerAdd2);
            }
        }
        return bigIntegerMultiply;
    }

    public static int ceilLog(BigInteger bigInteger) {
        int i10 = 0;
        for (BigInteger bigIntegerShiftLeft = ONE; bigIntegerShiftLeft.compareTo(bigInteger) < 0; bigIntegerShiftLeft = bigIntegerShiftLeft.shiftLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static int ceilLog256(long j10) {
        if (j10 == 0) {
            return 1;
        }
        if (j10 < 0) {
            j10 = -j10;
        }
        int i10 = 0;
        while (j10 > 0) {
            i10++;
            j10 >>>= 8;
        }
        return i10;
    }

    public static BigInteger[] divideAndRound(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        for (int i10 = 0; i10 < bigIntegerArr.length; i10++) {
            bigIntegerArr2[i10] = divideAndRound(bigIntegerArr[i10], bigInteger);
        }
        return bigIntegerArr2;
    }

    public static int floorLog(BigInteger bigInteger) {
        int i10 = -1;
        for (BigInteger bigIntegerShiftLeft = ONE; bigIntegerShiftLeft.compareTo(bigInteger) <= 0; bigIntegerShiftLeft = bigIntegerShiftLeft.shiftLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static double log(long j10) {
        return floorLog(BigInteger.valueOf(j10)) + logBKM(j10 / (1 << r0));
    }

    public static long modInverse(long j10, long j11) {
        return BigInteger.valueOf(j10).modInverse(BigInteger.valueOf(j11)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BigInteger nextProbablePrime(BigInteger bigInteger, int i10) {
        if (bigInteger.signum() >= 0 && bigInteger.signum() != 0) {
            BigInteger bigInteger2 = ONE;
            if (!bigInteger.equals(bigInteger2)) {
                BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
                if (!bigIntegerAdd.testBit(0)) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger2);
                }
                while (true) {
                    if (bigIntegerAdd.bitLength() > 6) {
                        long jLongValue = bigIntegerAdd.remainder(BigInteger.valueOf(SMALL_PRIME_PRODUCT)).longValue();
                        if (jLongValue % 3 != 0 && jLongValue % 5 != 0 && jLongValue % 7 != 0 && jLongValue % 11 != 0 && jLongValue % 13 != 0 && jLongValue % 17 != 0 && jLongValue % 19 != 0 && jLongValue % 23 != 0 && jLongValue % 29 != 0 && jLongValue % 31 != 0 && jLongValue % 37 != 0 && jLongValue % 41 != 0) {
                            if (bigIntegerAdd.bitLength() < 4 || bigIntegerAdd.isProbablePrime(i10)) {
                                break;
                            }
                        }
                    }
                    bigIntegerAdd = bigIntegerAdd.add(TWO);
                }
                return bigIntegerAdd;
            }
        }
        return TWO;
    }

    public static BigInteger octetsToInteger(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, i10, bArr2, 1, i11);
        return new BigInteger(bArr2);
    }

    public static long pow(long j10, int i10) {
        long j11 = 1;
        while (i10 > 0) {
            if ((i10 & 1) == 1) {
                j11 *= j10;
            }
            j10 *= j10;
            i10 >>>= 1;
        }
        return j11;
    }

    public static BigInteger randomize(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (secureRandom == null && (secureRandom = sr) == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        for (int i10 = 0; i10 < 20; i10++) {
            bigIntegerValueOf = BigIntegers.createRandomBigInteger(iBitLength, secureRandom);
            if (bigIntegerValueOf.compareTo(bigInteger) < 0) {
                return bigIntegerValueOf;
            }
        }
        return bigIntegerValueOf.mod(bigInteger);
    }
}
