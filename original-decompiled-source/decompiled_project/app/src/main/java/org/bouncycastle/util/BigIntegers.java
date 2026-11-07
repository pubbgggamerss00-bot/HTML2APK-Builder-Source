package org.bouncycastle.util;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes3.dex */
public final class BigIntegers {
    private static final int MAX_ITERATIONS = 1000;
    public static final BigInteger ZERO = BigInteger.valueOf(0);
    public static final BigInteger ONE = BigInteger.valueOf(1);
    public static final BigInteger TWO = BigInteger.valueOf(2);
    private static final BigInteger THREE = BigInteger.valueOf(3);
    private static final BigInteger SMALL_PRIMES_PRODUCT = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    private static final int MAX_SMALL = BigInteger.valueOf(743).bitLength();

    public static class Cache {
        private final Map<BigInteger, Boolean> values = new WeakHashMap();
        private final BigInteger[] preserve = new BigInteger[8];
        private int preserveCounter = 0;

        public synchronized void add(BigInteger bigInteger) {
            this.values.put(bigInteger, Boolean.TRUE);
            BigInteger[] bigIntegerArr = this.preserve;
            int i10 = this.preserveCounter;
            bigIntegerArr[i10] = bigInteger;
            this.preserveCounter = (i10 + 1) % bigIntegerArr.length;
        }

        public synchronized void clear() {
            this.values.clear();
            int i10 = 0;
            while (true) {
                BigInteger[] bigIntegerArr = this.preserve;
                if (i10 != bigIntegerArr.length) {
                    bigIntegerArr[i10] = null;
                    i10++;
                }
            }
        }

        public synchronized boolean contains(BigInteger bigInteger) {
            return this.values.containsKey(bigInteger);
        }

        public synchronized int size() {
            return this.values.size();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void asUnsignedByteArray(BigInteger bigInteger, byte[] bArr, int i10, int i11) {
        int i12;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i11) {
            System.arraycopy(byteArray, 0, bArr, i10, i11);
            return;
        }
        if (byteArray[0] == 0) {
            i12 = byteArray.length == 1 ? 0 : 1;
        }
        int length = byteArray.length - i12;
        if (length > i11) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        int i13 = (i11 - length) + i10;
        Arrays.fill(bArr, i10, i13, (byte) 0);
        System.arraycopy(byteArray, i12, bArr, i13, length);
    }

    public static byte byteValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 7) {
            return bigInteger.byteValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    private static byte[] createRandom(int i10, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i10 < 1) {
            throw new IllegalArgumentException("bitLength must be at least 1");
        }
        int i11 = (i10 + 7) / 8;
        byte[] bArr = new byte[i11];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i11 * 8) - i10))));
        return bArr;
    }

    public static BigInteger createRandomBigInteger(int i10, SecureRandom secureRandom) {
        return new BigInteger(1, createRandom(i10, secureRandom));
    }

    public static BigInteger createRandomInRange(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomBigInteger;
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            bigIntegerCreateRandomBigInteger = createRandomInRange(ZERO, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i10 = 0; i10 < 1000; i10++) {
                BigInteger bigIntegerCreateRandomBigInteger2 = createRandomBigInteger(bigInteger2.bitLength(), secureRandom);
                if (bigIntegerCreateRandomBigInteger2.compareTo(bigInteger) >= 0 && bigIntegerCreateRandomBigInteger2.compareTo(bigInteger2) <= 0) {
                    return bigIntegerCreateRandomBigInteger2;
                }
            }
            bigIntegerCreateRandomBigInteger = createRandomBigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return bigIntegerCreateRandomBigInteger.add(bigInteger);
    }

    public static BigInteger createRandomPrime(int i10, int i11, SecureRandom secureRandom) throws IllegalArgumentException {
        BigInteger bigInteger;
        if (i10 < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        }
        if (i10 == 2) {
            return secureRandom.nextInt() < 0 ? TWO : THREE;
        }
        do {
            byte[] bArrCreateRandom = createRandom(i10, secureRandom);
            bArrCreateRandom[0] = (byte) (((byte) (1 << (7 - ((bArrCreateRandom.length * 8) - i10)))) | bArrCreateRandom[0]);
            int length = bArrCreateRandom.length - 1;
            bArrCreateRandom[length] = (byte) (bArrCreateRandom[length] | 1);
            bigInteger = new BigInteger(1, bArrCreateRandom);
            if (i10 > MAX_SMALL) {
                while (!bigInteger.gcd(SMALL_PRIMES_PRODUCT).equals(ONE)) {
                    bigInteger = bigInteger.add(TWO);
                }
            }
        } while (!bigInteger.isProbablePrime(i11));
        return bigInteger;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static int getUnsignedByteLength(BigInteger bigInteger) {
        if (bigInteger.equals(ZERO)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static int intValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    public static long longValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new ArithmeticException("BigInteger out of long range");
    }

    public static BigInteger modOddInverse(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int iBitLength = bigInteger.bitLength();
        int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
        int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
        int length = iArrFromBigInteger.length;
        int[] iArrCreate = Nat.create(length);
        if (Mod.modOddInverse(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate) != 0) {
            return Nat.toBigInteger(length, iArrCreate);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static BigInteger modOddInverseVar(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        BigInteger bigInteger3 = ONE;
        if (bigInteger.equals(bigInteger3)) {
            return ZERO;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        int iBitLength = bigInteger.bitLength();
        int[] iArrFromBigInteger = Nat.fromBigInteger(iBitLength, bigInteger);
        int[] iArrFromBigInteger2 = Nat.fromBigInteger(iBitLength, bigInteger2);
        int length = iArrFromBigInteger.length;
        int[] iArrCreate = Nat.create(length);
        if (Mod.modOddInverseVar(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate)) {
            return Nat.toBigInteger(length, iArrCreate);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public static boolean modOddIsCoprime(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int iBitLength = bigInteger.bitLength();
        return Mod.modOddIsCoprime(Nat.fromBigInteger(iBitLength, bigInteger), Nat.fromBigInteger(iBitLength, bigInteger2)) != 0;
    }

    public static boolean modOddIsCoprimeVar(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.bitLength() > bigInteger.bitLength()) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(ONE)) {
            return true;
        }
        int iBitLength = bigInteger.bitLength();
        return Mod.modOddIsCoprimeVar(Nat.fromBigInteger(iBitLength, bigInteger), Nat.fromBigInteger(iBitLength, bigInteger2));
    }

    public static short shortValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 15) {
            return bigInteger.shortValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    public static byte[] asUnsignedByteArray(int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i10) {
            return byteArray;
        }
        int i11 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i11 = 1;
        }
        int length = byteArray.length - i11;
        if (length > i10) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, i11, bArr, i10 - length, length);
        return bArr;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr, int i10, int i11) {
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static byte[] asUnsignedByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
