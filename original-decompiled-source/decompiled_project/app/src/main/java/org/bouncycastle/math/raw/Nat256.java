package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.generators.a;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (iArr[i10 + 1] & 4294967295L) + (iArr2[i11 + 1] & 4294967295L) + (j10 >>> 32);
        iArr3[i12 + 1] = (int) j11;
        long j12 = (iArr[i10 + 2] & 4294967295L) + (iArr2[i11 + 2] & 4294967295L) + (j11 >>> 32);
        iArr3[i12 + 2] = (int) j12;
        long j13 = (iArr[i10 + 3] & 4294967295L) + (iArr2[i11 + 3] & 4294967295L) + (j12 >>> 32);
        iArr3[i12 + 3] = (int) j13;
        long j14 = (iArr[i10 + 4] & 4294967295L) + (iArr2[i11 + 4] & 4294967295L) + (j13 >>> 32);
        iArr3[i12 + 4] = (int) j14;
        long j15 = (iArr[i10 + 5] & 4294967295L) + (iArr2[i11 + 5] & 4294967295L) + (j14 >>> 32);
        iArr3[i12 + 5] = (int) j15;
        long j16 = (iArr[i10 + 6] & 4294967295L) + (iArr2[i11 + 6] & 4294967295L) + (j15 >>> 32);
        iArr3[i12 + 6] = (int) j16;
        long j17 = (iArr[i10 + 7] & 4294967295L) + (iArr2[i11 + 7] & 4294967295L) + (j16 >>> 32);
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L) + (iArr3[i12] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = (iArr[i10 + 1] & 4294967295L) + (iArr2[i11 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j10 >>> 32);
        iArr3[i12 + 1] = (int) j11;
        long j12 = (iArr[i10 + 2] & 4294967295L) + (iArr2[i11 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j11 >>> 32);
        iArr3[i12 + 2] = (int) j12;
        long j13 = (iArr[i10 + 3] & 4294967295L) + (iArr2[i11 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j12 >>> 32);
        iArr3[i12 + 3] = (int) j13;
        long j14 = (iArr[i10 + 4] & 4294967295L) + (iArr2[i11 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j13 >>> 32);
        iArr3[i12 + 4] = (int) j14;
        long j15 = (iArr[i10 + 5] & 4294967295L) + (iArr2[i11 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j14 >>> 32);
        iArr3[i12 + 5] = (int) j15;
        long j16 = (iArr[i10 + 6] & 4294967295L) + (iArr2[i11 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j15 >>> 32);
        iArr3[i12 + 6] = (int) j16;
        long j17 = (iArr[i10 + 7] & 4294967295L) + (iArr2[i11 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L) + (j16 >>> 32);
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addTo(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L) + (i12 & 4294967295L);
        iArr2[i11] = (int) j10;
        long j11 = (iArr[i10 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j10 >>> 32);
        iArr2[i11 + 1] = (int) j11;
        long j12 = (iArr[i10 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j11 >>> 32);
        iArr2[i11 + 2] = (int) j12;
        long j13 = (iArr[i10 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j12 >>> 32);
        iArr2[i11 + 3] = (int) j13;
        long j14 = (iArr[i10 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j13 >>> 32);
        iArr2[i11 + 4] = (int) j14;
        long j15 = (iArr[i10 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j14 >>> 32);
        iArr2[i11 + 5] = (int) j15;
        long j16 = (iArr[i10 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j15 >>> 32);
        iArr2[i11 + 6] = (int) j16;
        long j17 = (iArr[i10 + 7] & 4294967295L) + (4294967295L & iArr2[r12]) + (j16 >>> 32);
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        int i12 = (int) j10;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        long j11 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j10 >>> 32);
        int i13 = (int) j11;
        iArr[i10 + 1] = i13;
        iArr2[i11 + 1] = i13;
        long j12 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        int i14 = (int) j12;
        iArr[i10 + 2] = i14;
        iArr2[i11 + 2] = i14;
        long j13 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        int i15 = (int) j13;
        iArr[i10 + 3] = i15;
        iArr2[i11 + 3] = i15;
        long j14 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        int i16 = (int) j14;
        iArr[i10 + 4] = i16;
        iArr2[i11 + 4] = i16;
        long j15 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j14 >>> 32);
        int i17 = (int) j15;
        iArr[i10 + 5] = i17;
        iArr2[i11 + 5] = i17;
        long j16 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j15 >>> 32);
        int i18 = (int) j16;
        iArr[i10 + 6] = i18;
        iArr2[i11 + 6] = i18;
        long j17 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j16 >>> 32);
        int i19 = (int) j17;
        iArr[i10 + 7] = i19;
        iArr2[i11 + 7] = i19;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        iArr2[i11] = iArr[i10];
        iArr2[i11 + 1] = iArr[i10 + 1];
        iArr2[i11 + 2] = iArr[i10 + 2];
        iArr2[i11 + 3] = iArr[i10 + 3];
        iArr2[i11 + 4] = iArr[i10 + 4];
        iArr2[i11 + 5] = iArr[i10 + 5];
        iArr2[i11 + 6] = iArr[i10 + 6];
        iArr2[i11 + 7] = iArr[i10 + 7];
    }

    public static void copy64(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11] = jArr[i10];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        boolean zGte = gte(iArr, i10, iArr2, i11);
        if (zGte) {
            sub(iArr, i10, iArr2, i11, iArr3, i12);
            return zGte;
        }
        sub(iArr2, i11, iArr, i10, iArr3, i12);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i10 = 3; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i10 = 0; i10 < 8; i10++) {
            iArrCreate[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i10 = 0; i10 < 4; i10++) {
            jArrCreate64[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = iArr[0];
        } else {
            if ((i10 & 255) != i10) {
                return 0;
            }
            i11 = iArr[i10 >>> 5] >>> (i10 & 31);
        }
        return i11 & 1;
    }

    public static boolean gte(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 7; i12 >= 0; i12--) {
            int i13 = iArr[i10 + i12] ^ PKIFailureInfo.systemUnavail;
            int i14 = Integer.MIN_VALUE ^ iArr2[i11 + i12];
            if (i13 < i14) {
                return false;
            }
            if (i13 > i14) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i10 = 0; i10 < 8; i10++) {
            if (iArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        long j17 = iArr2[i11 + 7] & 4294967295L;
        long j18 = iArr[i10] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[i12] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[i12 + 1] = (int) j20;
        long j21 = (j18 * j12) + (j20 >>> 32);
        iArr3[i12 + 2] = (int) j21;
        long j22 = (j18 * j13) + (j21 >>> 32);
        iArr3[i12 + 3] = (int) j22;
        long j23 = (j18 * j14) + (j22 >>> 32);
        iArr3[i12 + 4] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[i12 + 5] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[i12 + 6] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[i12 + 7] = (int) j26;
        iArr3[i12 + 8] = (int) (j26 >>> 32);
        int i13 = 1;
        int i14 = i12;
        while (i13 < 8) {
            int i15 = i14 + 1;
            int i16 = i14;
            long j27 = iArr[i10 + i13] & 4294967295L;
            long j28 = (j27 * j10) + (iArr3[i15] & 4294967295L);
            iArr3[i15] = (int) j28;
            long j29 = (j27 * j11) + (iArr3[r3] & 4294967295L) + (j28 >>> 32);
            iArr3[i16 + 2] = (int) j29;
            long j30 = (j27 * j12) + (iArr3[r24] & 4294967295L) + (j29 >>> 32);
            iArr3[i16 + 3] = (int) j30;
            long j31 = (j27 * j13) + (iArr3[r24] & 4294967295L) + (j30 >>> 32);
            iArr3[i16 + 4] = (int) j31;
            long j32 = (j27 * j14) + (iArr3[r24] & 4294967295L) + (j31 >>> 32);
            iArr3[i16 + 5] = (int) j32;
            long j33 = (j27 * j15) + (iArr3[r24] & 4294967295L) + (j32 >>> 32);
            iArr3[i16 + 6] = (int) j33;
            long j34 = (j27 * j16) + (iArr3[r24] & 4294967295L) + (j33 >>> 32);
            iArr3[i16 + 7] = (int) j34;
            long j35 = (j27 * j17) + (iArr3[r24] & 4294967295L) + (j34 >>> 32);
            iArr3[i16 + 8] = (int) j35;
            iArr3[i16 + 9] = (int) (j35 >>> 32);
            i13++;
            i14 = i15;
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr[0] & 4294967295L;
        long j11 = iArr[1] & 4294967295L;
        long j12 = iArr[2] & 4294967295L;
        long j13 = iArr[3] & 4294967295L;
        long j14 = iArr[4] & 4294967295L;
        long j15 = iArr[5] & 4294967295L;
        long j16 = iArr[6] & 4294967295L;
        long j17 = iArr[7] & 4294967295L;
        long j18 = iArr2[0] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[0] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j20;
        long j21 = (j18 * j12) + (j20 >>> 32);
        iArr3[2] = (int) j21;
        long j22 = (j18 * j13) + (j21 >>> 32);
        iArr3[3] = (int) j22;
        long j23 = (j18 * j14) + (j22 >>> 32);
        iArr3[4] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[5] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[7] = (int) j26;
        iArr3[8] = (int) (j26 >>> 32);
        int i10 = 1;
        for (int i11 = 4; i10 < i11; i11 = 4) {
            long j27 = iArr2[i10] & 4294967295L;
            long j28 = j14;
            long j29 = (j27 * j10) + (iArr3[i10] & 4294967295L);
            iArr3[i10] = (int) j29;
            int i12 = i10 + 1;
            long j30 = (j27 * j11) + (iArr3[i12] & 4294967295L) + (j29 >>> 32);
            iArr3[i12] = (int) j30;
            long j31 = (j27 * j12) + (iArr3[r25] & 4294967295L) + (j30 >>> 32);
            iArr3[i10 + 2] = (int) j31;
            long j32 = (j27 * j13) + (iArr3[r25] & 4294967295L) + (j31 >>> 32);
            iArr3[i10 + 3] = (int) j32;
            long j33 = (j27 * j28) + (iArr3[r25] & 4294967295L) + (j32 >>> 32);
            iArr3[i10 + 4] = (int) j33;
            long j34 = (j27 * j15) + (iArr3[r25] & 4294967295L) + (j33 >>> 32);
            iArr3[i10 + 5] = (int) j34;
            long j35 = (j27 * j16) + (iArr3[r25] & 4294967295L) + (j34 >>> 32);
            iArr3[i10 + 6] = (int) j35;
            long j36 = j35 >>> 32;
            long j37 = (j27 * j17) + (iArr3[r14] & 4294967295L) + j36;
            iArr3[i10 + 7] = (int) j37;
            iArr3[i10 + 8] = (int) (j37 >>> 32);
            i10 = i12;
            j14 = j28;
        }
    }

    public static long mul33Add(int i10, int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j10 = i10 & 4294967295L;
        long j11 = iArr[i11] & 4294967295L;
        long j12 = (j10 * j11) + (iArr2[i12] & 4294967295L);
        iArr3[i13] = (int) j12;
        long j13 = iArr[i11 + 1] & 4294967295L;
        long j14 = (j10 * j13) + j11 + (iArr2[i12 + 1] & 4294967295L) + (j12 >>> 32);
        iArr3[i13 + 1] = (int) j14;
        long j15 = iArr[i11 + 2] & 4294967295L;
        long j16 = (j10 * j15) + j13 + (iArr2[i12 + 2] & 4294967295L) + (j14 >>> 32);
        iArr3[i13 + 2] = (int) j16;
        long j17 = iArr[i11 + 3] & 4294967295L;
        long j18 = (j10 * j17) + j15 + (iArr2[i12 + 3] & 4294967295L) + (j16 >>> 32);
        iArr3[i13 + 3] = (int) j18;
        long j19 = iArr[i11 + 4] & 4294967295L;
        long j20 = (j10 * j19) + j17 + (iArr2[i12 + 4] & 4294967295L) + (j18 >>> 32);
        iArr3[i13 + 4] = (int) j20;
        long j21 = iArr[i11 + 5] & 4294967295L;
        long j22 = (j10 * j21) + j19 + (iArr2[i12 + 5] & 4294967295L) + (j20 >>> 32);
        iArr3[i13 + 5] = (int) j22;
        long j23 = iArr[i11 + 6] & 4294967295L;
        long j24 = (j10 * j23) + j21 + (iArr2[i12 + 6] & 4294967295L) + (j22 >>> 32);
        iArr3[i13 + 6] = (int) j24;
        long j25 = iArr[i11 + 7] & 4294967295L;
        long j26 = (j10 * j25) + j23 + (4294967295L & iArr2[i12 + 7]) + (j24 >>> 32);
        iArr3[i13 + 7] = (int) j26;
        return (j26 >>> 32) + j25;
    }

    public static int mul33DWordAdd(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & 4294967295L;
        long j12 = j10 & 4294967295L;
        long j13 = (j11 * j12) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j13;
        long j14 = j10 >>> 32;
        long j15 = (j11 * j14) + j12;
        long j16 = j15 + (iArr[r4] & 4294967295L) + (j13 >>> 32);
        iArr[i11 + 1] = (int) j16;
        long j17 = j14 + (iArr[r4] & 4294967295L) + (j16 >>> 32);
        iArr[i11 + 2] = (int) j17;
        long j18 = (j17 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i11 + 3] = (int) j18;
        if ((j18 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i11, 4);
    }

    public static int mul33WordAdd(int i10, int i11, int[] iArr, int i12) {
        long j10 = i10 & 4294967295L;
        long j11 = i11 & 4294967295L;
        long j12 = (j10 * j11) + (iArr[i12] & 4294967295L);
        iArr[i12] = (int) j12;
        long j13 = j11 + (iArr[r5] & 4294967295L) + (j12 >>> 32);
        iArr[i12 + 1] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i12 + 2] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i12, 3);
    }

    public static int mulAddTo(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = iArr2[i11] & 4294967295L;
        long j11 = iArr2[i11 + 1] & 4294967295L;
        long j12 = iArr2[i11 + 2] & 4294967295L;
        long j13 = iArr2[i11 + 3] & 4294967295L;
        long j14 = iArr2[i11 + 4] & 4294967295L;
        long j15 = iArr2[i11 + 5] & 4294967295L;
        long j16 = iArr2[i11 + 6] & 4294967295L;
        long j17 = iArr2[i11 + 7] & 4294967295L;
        int i13 = i12;
        int i14 = 0;
        long j18 = 0;
        while (i14 < 8) {
            long j19 = j11;
            long j20 = iArr[i10 + i14] & 4294967295L;
            long j21 = (j20 * j10) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j21;
            int i15 = i13 + 1;
            long j22 = (j20 * j19) + (iArr3[i15] & 4294967295L) + (j21 >>> 32);
            iArr3[i15] = (int) j22;
            int i16 = i14;
            long j23 = (j20 * j12) + (iArr3[r5] & 4294967295L) + (j22 >>> 32);
            iArr3[i13 + 2] = (int) j23;
            long j24 = (j20 * j13) + (iArr3[r0] & 4294967295L) + (j23 >>> 32);
            iArr3[i13 + 3] = (int) j24;
            long j25 = (j20 * j14) + (iArr3[r0] & 4294967295L) + (j24 >>> 32);
            iArr3[i13 + 4] = (int) j25;
            long j26 = (j20 * j15) + (iArr3[r0] & 4294967295L) + (j25 >>> 32);
            iArr3[i13 + 5] = (int) j26;
            long j27 = (j20 * j16) + (iArr3[r0] & 4294967295L) + (j26 >>> 32);
            iArr3[i13 + 6] = (int) j27;
            long j28 = (j20 * j17) + (iArr3[r0] & 4294967295L) + (j27 >>> 32);
            iArr3[i13 + 7] = (int) j28;
            long j29 = (j28 >>> 32) + (iArr3[r16] & 4294967295L) + j18;
            iArr3[i13 + 8] = (int) j29;
            j18 = j29 >>> 32;
            i14 = i16 + 1;
            j11 = j19;
            i13 = i15;
        }
        return (int) j18;
    }

    public static int mulByWord(int i10, int[] iArr) {
        long j10 = i10 & 4294967295L;
        long j11 = (iArr[0] & 4294967295L) * j10;
        iArr[0] = (int) j11;
        long j12 = ((iArr[1] & 4294967295L) * j10) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = ((iArr[2] & 4294967295L) * j10) + (j12 >>> 32);
        iArr[2] = (int) j13;
        long j14 = ((iArr[3] & 4294967295L) * j10) + (j13 >>> 32);
        iArr[3] = (int) j14;
        long j15 = ((iArr[4] & 4294967295L) * j10) + (j14 >>> 32);
        iArr[4] = (int) j15;
        long j16 = ((iArr[5] & 4294967295L) * j10) + (j15 >>> 32);
        iArr[5] = (int) j16;
        long j17 = ((iArr[6] & 4294967295L) * j10) + (j16 >>> 32);
        iArr[6] = (int) j17;
        long j18 = (j10 * (4294967295L & iArr[7])) + (j17 >>> 32);
        iArr[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulByWordAddTo(int i10, int[] iArr, int[] iArr2) {
        long j10 = i10 & 4294967295L;
        long j11 = ((iArr2[0] & 4294967295L) * j10) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j11;
        long j12 = ((iArr2[1] & 4294967295L) * j10) + (iArr[1] & 4294967295L) + (j11 >>> 32);
        iArr2[1] = (int) j12;
        long j13 = ((iArr2[2] & 4294967295L) * j10) + (iArr[2] & 4294967295L) + (j12 >>> 32);
        iArr2[2] = (int) j13;
        long j14 = ((iArr2[3] & 4294967295L) * j10) + (iArr[3] & 4294967295L) + (j13 >>> 32);
        iArr2[3] = (int) j14;
        long j15 = ((iArr2[4] & 4294967295L) * j10) + (iArr[4] & 4294967295L) + (j14 >>> 32);
        iArr2[4] = (int) j15;
        long j16 = ((iArr2[5] & 4294967295L) * j10) + (iArr[5] & 4294967295L) + (j15 >>> 32);
        iArr2[5] = (int) j16;
        long j17 = ((iArr2[6] & 4294967295L) * j10) + (iArr[6] & 4294967295L) + (j16 >>> 32);
        iArr2[6] = (int) j17;
        long j18 = (j10 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j17 >>> 32);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulWord(int i10, int[] iArr, int[] iArr2, int i11) {
        long j10 = i10 & 4294967295L;
        long j11 = 0;
        int i12 = 0;
        do {
            long j12 = ((iArr[i12] & 4294967295L) * j10) + j11;
            iArr2[i11 + i12] = (int) j12;
            j11 = j12 >>> 32;
            i12++;
        } while (i12 < 8);
        return (int) j11;
    }

    public static int mulWordAddTo(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        long j10 = i10 & 4294967295L;
        long j11 = ((iArr[i11] & 4294967295L) * j10) + (iArr2[i12] & 4294967295L);
        iArr2[i12] = (int) j11;
        long j12 = ((iArr[i11 + 1] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j11 >>> 32);
        iArr2[i12 + 1] = (int) j12;
        long j13 = ((iArr[i11 + 2] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j12 >>> 32);
        iArr2[i12 + 2] = (int) j13;
        long j14 = ((iArr[i11 + 3] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j13 >>> 32);
        iArr2[i12 + 3] = (int) j14;
        long j15 = ((iArr[i11 + 4] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j14 >>> 32);
        iArr2[i12 + 4] = (int) j15;
        long j16 = ((iArr[i11 + 5] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j15 >>> 32);
        iArr2[i12 + 5] = (int) j16;
        long j17 = ((iArr[i11 + 6] & 4294967295L) * j10) + (iArr2[r8] & 4294967295L) + (j16 >>> 32);
        iArr2[i12 + 6] = (int) j17;
        long j18 = (j10 * (iArr[i11 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j17 >>> 32);
        iArr2[i12 + 7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulWordDwordAdd(int i10, long j10, int[] iArr, int i11) {
        long j11 = i10 & 4294967295L;
        long j12 = ((j10 & 4294967295L) * j11) + (iArr[i11] & 4294967295L);
        iArr[i11] = (int) j12;
        long j13 = j11 * (j10 >>> 32);
        long j14 = j13 + (iArr[r9] & 4294967295L) + (j12 >>> 32);
        iArr[i11 + 1] = (int) j14;
        long j15 = j14 >>> 32;
        long j16 = j15 + (iArr[r0] & 4294967295L);
        iArr[i11 + 2] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i11, 3);
    }

    public static void square(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = iArr[i10] & 4294967295L;
        int i12 = 0;
        int i13 = 16;
        int i14 = 7;
        while (true) {
            int i15 = i14 - 1;
            long j11 = iArr[i10 + i14] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[(i13 - 1) + i11] = (i12 << 31) | ((int) (j12 >>> 33));
            i13 -= 2;
            iArr2[i11 + i13] = (int) (j12 >>> 1);
            i12 = (int) j12;
            if (i15 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i12 << 31) & 4294967295L);
                iArr2[i11] = (int) j13;
                int i16 = ((int) (j13 >>> 32)) & 1;
                long j15 = iArr[i10 + 1] & 4294967295L;
                long j16 = (j15 * j10) + j14;
                int i17 = (int) j16;
                iArr2[i11 + 1] = (i17 << 1) | i16;
                long j17 = (iArr2[r8] & 4294967295L) + (j16 >>> 32);
                long j18 = iArr[i10 + 2] & 4294967295L;
                long j19 = (j18 * j10) + j17;
                int i18 = (int) j19;
                iArr2[i11 + 2] = (i18 << 1) | (i17 >>> 31);
                long jA = a.a(j18, j15, j19 >>> 32, iArr2[r9] & 4294967295L);
                long j20 = (iArr2[r24] & 4294967295L) + (jA >>> 32);
                long j21 = iArr[i10 + 3] & 4294967295L;
                long j22 = (iArr2[r6] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[r2] & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j10) + (jA & 4294967295L);
                int i19 = (int) j26;
                iArr2[i11 + 3] = (i18 >>> 31) | (i19 << 1);
                long jA2 = a.a(j21, j15, j26 >>> 32, j23);
                long jA3 = a.a(j21, j18, jA2 >>> 32, j25);
                long j27 = j24 + (jA3 >>> 32);
                long j28 = jA3 & 4294967295L;
                long j29 = iArr[i10 + 4] & 4294967295L;
                long j30 = (iArr2[r4] & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (iArr2[r5] & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j29 * j10) + (jA2 & 4294967295L);
                int i20 = (int) j34;
                iArr2[i11 + 4] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jA4 = a.a(j29, j15, j34 >>> 32, j28);
                long jA5 = a.a(j29, j18, jA4 >>> 32, j31);
                long jA6 = a.a(j29, j21, jA5 >>> 32, j33);
                long j35 = jA5 & 4294967295L;
                long j36 = j32 + (jA6 >>> 32);
                long j37 = iArr[i10 + 5] & 4294967295L;
                long j38 = (iArr2[r10] & 4294967295L) + (j36 >>> 32);
                long j39 = j36 & 4294967295L;
                long j40 = (iArr2[r6] & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (j37 * j10) + (jA4 & 4294967295L);
                int i22 = (int) j42;
                iArr2[i11 + 5] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jA7 = a.a(j37, j15, j42 >>> 32, j35);
                long jA8 = a.a(j37, j18, jA7 >>> 32, jA6 & 4294967295L);
                long jA9 = a.a(j37, j21, jA8 >>> 32, j39);
                long j43 = jA8 & 4294967295L;
                long jA10 = a.a(j37, j29, jA9 >>> 32, j41);
                long j44 = j40 + (jA10 >>> 32);
                long j45 = jA10 & 4294967295L;
                long j46 = iArr[i10 + 6] & 4294967295L;
                long j47 = (iArr2[r9] & 4294967295L) + (j44 >>> 32);
                long j48 = j44 & 4294967295L;
                long j49 = (iArr2[r11] & 4294967295L) + (j47 >>> 32);
                long j50 = j47 & 4294967295L;
                long j51 = (j46 * j10) + (jA7 & 4294967295L);
                int i24 = (int) j51;
                iArr2[i11 + 6] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long jA11 = a.a(j46, j15, j51 >>> 32, j43);
                long jA12 = a.a(j46, j18, jA11 >>> 32, jA9 & 4294967295L);
                long jA13 = a.a(j46, j21, jA12 >>> 32, j45);
                long j52 = jA12 & 4294967295L;
                long jA14 = a.a(j46, j29, jA13 >>> 32, j48);
                long j53 = jA13 & 4294967295L;
                long jA15 = a.a(j46, j37, jA14 >>> 32, j50);
                long j54 = jA14 & 4294967295L;
                long j55 = j49 + (jA15 >>> 32);
                long j56 = jA15 & 4294967295L;
                long j57 = iArr[i10 + 7] & 4294967295L;
                long j58 = (iArr2[r3] & 4294967295L) + (j55 >>> 32);
                long j59 = j55 & 4294967295L;
                long j60 = (iArr2[r2] & 4294967295L) + (j58 >>> 32);
                long j61 = j58 & 4294967295L;
                long j62 = (j57 * j10) + (jA11 & 4294967295L);
                int i26 = (int) j62;
                iArr2[i11 + 7] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long jA16 = a.a(j57, j15, j62 >>> 32, j52);
                long jA17 = a.a(j57, j18, jA16 >>> 32, j53);
                long jA18 = a.a(j57, j21, jA17 >>> 32, j54);
                long jA19 = a.a(j57, j29, jA18 >>> 32, j56);
                long jA20 = a.a(j57, j37, jA19 >>> 32, j59);
                long jA21 = a.a(j57, j46, jA20 >>> 32, j61);
                long j63 = j60 + (jA21 >>> 32);
                int i28 = (int) jA16;
                iArr2[i11 + 8] = (i28 << 1) | i27;
                int i29 = (int) jA17;
                iArr2[i11 + 9] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) jA18;
                iArr2[i11 + 10] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) jA19;
                iArr2[i11 + 11] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) jA20;
                iArr2[i11 + 12] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) jA21;
                iArr2[i11 + 13] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j63;
                iArr2[i11 + 14] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i11 + 15;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j63 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static int sub(int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j10 = (iArr[i10] & 4294967295L) - (iArr2[i11] & 4294967295L);
        iArr3[i12] = (int) j10;
        long j11 = ((iArr[i10 + 1] & 4294967295L) - (iArr2[i11 + 1] & 4294967295L)) + (j10 >> 32);
        iArr3[i12 + 1] = (int) j11;
        long j12 = ((iArr[i10 + 2] & 4294967295L) - (iArr2[i11 + 2] & 4294967295L)) + (j11 >> 32);
        iArr3[i12 + 2] = (int) j12;
        long j13 = ((iArr[i10 + 3] & 4294967295L) - (iArr2[i11 + 3] & 4294967295L)) + (j12 >> 32);
        iArr3[i12 + 3] = (int) j13;
        long j14 = ((iArr[i10 + 4] & 4294967295L) - (iArr2[i11 + 4] & 4294967295L)) + (j13 >> 32);
        iArr3[i12 + 4] = (int) j14;
        long j15 = ((iArr[i10 + 5] & 4294967295L) - (iArr2[i11 + 5] & 4294967295L)) + (j14 >> 32);
        iArr3[i12 + 5] = (int) j15;
        long j16 = ((iArr[i10 + 6] & 4294967295L) - (iArr2[i11 + 6] & 4294967295L)) + (j15 >> 32);
        iArr3[i12 + 6] = (int) j16;
        long j17 = ((iArr[i10 + 7] & 4294967295L) - (iArr2[i11 + 7] & 4294967295L)) + (j16 >> 32);
        iArr3[i12 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11) {
        long j10 = (iArr2[i11] & 4294967295L) - (iArr[i10] & 4294967295L);
        iArr2[i11] = (int) j10;
        long j11 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 1] & 4294967295L)) + (j10 >> 32);
        iArr2[i11 + 1] = (int) j11;
        long j12 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 2] & 4294967295L)) + (j11 >> 32);
        iArr2[i11 + 2] = (int) j12;
        long j13 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 3] & 4294967295L)) + (j12 >> 32);
        iArr2[i11 + 3] = (int) j13;
        long j14 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 4] & 4294967295L)) + (j13 >> 32);
        iArr2[i11 + 4] = (int) j14;
        long j15 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 5] & 4294967295L)) + (j14 >> 32);
        iArr2[i11 + 5] = (int) j15;
        long j16 = ((iArr2[r5] & 4294967295L) - (iArr[i10 + 6] & 4294967295L)) + (j15 >> 32);
        iArr2[i11 + 6] = (int) j16;
        long j17 = ((iArr2[r13] & 4294967295L) - (iArr[i10 + 7] & 4294967295L)) + (j16 >> 32);
        iArr2[i11 + 7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                Pack.intToBigEndian(i11, bArr, (7 - i10) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 4; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (3 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i10 = 7; i10 >= 0; i10--) {
            int i11 = iArr[i10] ^ PKIFailureInfo.systemUnavail;
            int i12 = Integer.MIN_VALUE ^ iArr2[i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr2[7] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = j18 * j10;
        iArr3[0] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j20;
        long j21 = (j18 * j12) + (j20 >>> 32);
        iArr3[2] = (int) j21;
        long j22 = (j18 * j13) + (j21 >>> 32);
        iArr3[3] = (int) j22;
        long j23 = (j18 * j14) + (j22 >>> 32);
        iArr3[4] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[5] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[7] = (int) j26;
        int i10 = (int) (j26 >>> 32);
        iArr3[8] = i10;
        int i11 = 1;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            long j27 = iArr[i11] & 4294967295L;
            long j28 = j14;
            long j29 = (j27 * j10) + (iArr3[i11] & 4294967295L);
            iArr3[i11] = (int) j29;
            int i13 = i11 + 1;
            long j30 = (j27 * j11) + (iArr3[i13] & 4294967295L) + (j29 >>> 32);
            iArr3[i13] = (int) j30;
            long j31 = (j27 * j12) + (iArr3[r25] & 4294967295L) + (j30 >>> 32);
            iArr3[i11 + 2] = (int) j31;
            long j32 = (j27 * j13) + (iArr3[r25] & 4294967295L) + (j31 >>> 32);
            iArr3[i11 + 3] = (int) j32;
            long j33 = (j27 * j28) + (iArr3[r25] & 4294967295L) + (j32 >>> 32);
            iArr3[i11 + 4] = (int) j33;
            long j34 = (j27 * j15) + (iArr3[r25] & 4294967295L) + (j33 >>> 32);
            iArr3[i11 + 5] = (int) j34;
            long j35 = (j27 * j16) + (iArr3[r25] & 4294967295L) + (j34 >>> 32);
            iArr3[i11 + 6] = (int) j35;
            long j36 = j35 >>> 32;
            long j37 = (j27 * j17) + (iArr3[r14] & 4294967295L) + j36;
            iArr3[i11 + 7] = (int) j37;
            iArr3[i11 + 8] = (int) (j37 >>> 32);
            i11 = i13;
            j14 = j28;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = iArr2[0] & 4294967295L;
        long j11 = iArr2[1] & 4294967295L;
        long j12 = iArr2[2] & 4294967295L;
        long j13 = iArr2[3] & 4294967295L;
        long j14 = iArr2[4] & 4294967295L;
        long j15 = iArr2[5] & 4294967295L;
        long j16 = iArr2[6] & 4294967295L;
        long j17 = iArr2[7] & 4294967295L;
        long j18 = 0;
        int i10 = 0;
        while (i10 < 8) {
            long j19 = iArr[i10] & 4294967295L;
            long j20 = (j19 * j10) + (iArr3[i10] & 4294967295L);
            int i11 = i10;
            iArr3[i11] = (int) j20;
            int i12 = i11 + 1;
            long j21 = (j19 * j11) + (iArr3[i12] & 4294967295L) + (j20 >>> 32);
            iArr3[i12] = (int) j21;
            long j22 = (j19 * j12) + (iArr3[r4] & 4294967295L) + (j21 >>> 32);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j19 * j13) + (iArr3[r4] & 4294967295L) + (j22 >>> 32);
            iArr3[i11 + 3] = (int) j23;
            long j24 = (j19 * j14) + (iArr3[r4] & 4294967295L) + (j23 >>> 32);
            iArr3[i11 + 4] = (int) j24;
            long j25 = (j19 * j15) + (iArr3[r4] & 4294967295L) + (j24 >>> 32);
            iArr3[i11 + 5] = (int) j25;
            long j26 = (j19 * j16) + (iArr3[r4] & 4294967295L) + (j25 >>> 32);
            iArr3[i11 + 6] = (int) j26;
            long j27 = (j19 * j17) + (iArr3[r4] & 4294967295L) + (j26 >>> 32);
            iArr3[i11 + 7] = (int) j27;
            long j28 = (j27 >>> 32) + (iArr3[r4] & 4294967295L) + j18;
            iArr3[i11 + 8] = (int) j28;
            j18 = j28 >>> 32;
            i10 = i12;
        }
        return (int) j18;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j10 = iArr[0] & 4294967295L;
        int i10 = 16;
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i12 - 1;
            long j11 = iArr[i12] & 4294967295L;
            long j12 = j11 * j11;
            iArr2[i10 - 1] = (i11 << 31) | ((int) (j12 >>> 33));
            i10 -= 2;
            iArr2[i10] = (int) (j12 >>> 1);
            i11 = (int) j12;
            if (i13 <= 0) {
                long j13 = j10 * j10;
                long j14 = (j13 >>> 33) | ((i11 << 31) & 4294967295L);
                iArr2[0] = (int) j13;
                int i14 = ((int) (j13 >>> 32)) & 1;
                long j15 = iArr[1] & 4294967295L;
                long j16 = (j15 * j10) + j14;
                int i15 = (int) j16;
                iArr2[1] = i14 | (i15 << 1);
                long j17 = iArr[2] & 4294967295L;
                long j18 = (j17 * j10) + (iArr2[2] & 4294967295L) + (j16 >>> 32);
                int i16 = (int) j18;
                iArr2[2] = (i16 << 1) | (i15 >>> 31);
                long jA = a.a(j17, j15, j18 >>> 32, iArr2[3] & 4294967295L);
                long j19 = (iArr2[4] & 4294967295L) + (jA >>> 32);
                long j20 = iArr[3] & 4294967295L;
                long j21 = (iArr2[5] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (iArr2[6] & 4294967295L) + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = (j20 * j10) + (jA & 4294967295L);
                int i17 = (int) j25;
                iArr2[3] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                long jA2 = a.a(j20, j15, j25 >>> 32, j22);
                long jA3 = a.a(j20, j17, jA2 >>> 32, j24);
                long j26 = j23 + (jA3 >>> 32);
                long j27 = jA3 & 4294967295L;
                long j28 = iArr[4] & 4294967295L;
                long j29 = (iArr2[7] & 4294967295L) + (j26 >>> 32);
                long j30 = (iArr2[8] & 4294967295L) + (j29 >>> 32);
                long j31 = j29 & 4294967295L;
                long j32 = (j28 * j10) + (jA2 & 4294967295L);
                int i19 = (int) j32;
                iArr2[4] = i18 | (i19 << 1);
                long jA4 = a.a(j28, j15, j32 >>> 32, j27);
                long jA5 = a.a(j28, j17, jA4 >>> 32, j26 & 4294967295L);
                long jA6 = a.a(j28, j20, jA5 >>> 32, j31);
                long j33 = jA5 & 4294967295L;
                long j34 = j30 + (jA6 >>> 32);
                long j35 = jA6 & 4294967295L;
                long j36 = iArr[5] & 4294967295L;
                long j37 = (iArr2[9] & 4294967295L) + (j34 >>> 32);
                long j38 = (j36 * j10) + (jA4 & 4294967295L);
                int i20 = (int) j38;
                iArr2[5] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long jA7 = a.a(j36, j15, j38 >>> 32, j33);
                long jA8 = a.a(j36, j17, jA7 >>> 32, j35);
                long jA9 = a.a(j36, j20, jA8 >>> 32, j34 & 4294967295L);
                long j39 = jA8 & 4294967295L;
                long jA10 = a.a(j36, j28, jA9 >>> 32, j37 & 4294967295L);
                long j40 = jA9 & 4294967295L;
                long j41 = (iArr2[10] & 4294967295L) + (j37 >>> 32) + (jA10 >>> 32);
                long j42 = iArr[6] & 4294967295L;
                long j43 = (iArr2[11] & 4294967295L) + (j41 >>> 32);
                long j44 = (iArr2[12] & 4294967295L) + (j43 >>> 32);
                long j45 = (j42 * j10) + (jA7 & 4294967295L);
                int i22 = (int) j45;
                iArr2[6] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jA11 = a.a(j42, j15, j45 >>> 32, j39);
                long jA12 = a.a(j42, j17, jA11 >>> 32, j40);
                long jA13 = a.a(j42, j20, jA12 >>> 32, jA10 & 4294967295L);
                long j46 = jA12 & 4294967295L;
                long jA14 = a.a(j42, j28, jA13 >>> 32, j41 & 4294967295L);
                long j47 = jA13 & 4294967295L;
                long jA15 = a.a(j42, j36, jA14 >>> 32, j43 & 4294967295L);
                long j48 = j44 + (jA15 >>> 32);
                long j49 = iArr[7] & 4294967295L;
                long j50 = (iArr2[13] & 4294967295L) + (j48 >>> 32);
                long j51 = (iArr2[14] & 4294967295L) + (j50 >>> 32);
                long j52 = j50 & 4294967295L;
                long j53 = (j49 * j10) + (jA11 & 4294967295L);
                int i24 = (int) j53;
                iArr2[7] = (i24 << 1) | i23;
                int i25 = i24 >>> 31;
                long jA16 = a.a(j49, j15, j53 >>> 32, j46);
                long jA17 = a.a(j49, j17, jA16 >>> 32, j47);
                long jA18 = a.a(j49, j20, jA17 >>> 32, jA14 & 4294967295L);
                long jA19 = a.a(j49, j28, jA18 >>> 32, jA15 & 4294967295L);
                long jA20 = a.a(j49, j36, jA19 >>> 32, j48 & 4294967295L);
                long jA21 = a.a(j49, j42, jA20 >>> 32, j52);
                long j54 = j51 + (jA21 >>> 32);
                int i26 = (int) jA16;
                iArr2[8] = (i26 << 1) | i25;
                int i27 = (int) jA17;
                iArr2[9] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) jA18;
                iArr2[10] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) jA19;
                iArr2[11] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) jA20;
                iArr2[12] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) jA21;
                iArr2[13] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j54;
                iArr2[14] = i36 | (i37 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j54 >>> 32))) << 1) | (i37 >>> 31);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        long j10 = ((iArr2[i11] & 4294967295L) - (iArr[i10] & 4294967295L)) + (i12 & 4294967295L);
        iArr2[i11] = (int) j10;
        long j11 = j10 >> 32;
        long j12 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 1] & 4294967295L)) + j11;
        iArr2[i11 + 1] = (int) j12;
        long j13 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 2] & 4294967295L)) + (j12 >> 32);
        iArr2[i11 + 2] = (int) j13;
        long j14 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 3] & 4294967295L)) + (j13 >> 32);
        iArr2[i11 + 3] = (int) j14;
        long j15 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 4] & 4294967295L)) + (j14 >> 32);
        iArr2[i11 + 4] = (int) j15;
        long j16 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 5] & 4294967295L)) + (j15 >> 32);
        iArr2[i11 + 5] = (int) j16;
        long j17 = ((iArr2[r4] & 4294967295L) - (iArr[i10 + 6] & 4294967295L)) + (j16 >> 32);
        iArr2[i11 + 6] = (int) j17;
        long j18 = ((iArr2[r12] & 4294967295L) - (iArr[i10 + 7] & 4294967295L)) + (j17 >> 32);
        iArr2[i11 + 7] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i10) {
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (i10 & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j10 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i10) {
        long j10 = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + (i10 & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }
}
