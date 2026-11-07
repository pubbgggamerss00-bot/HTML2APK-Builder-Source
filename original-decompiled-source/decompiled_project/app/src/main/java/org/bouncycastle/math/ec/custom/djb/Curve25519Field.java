package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class Curve25519Field {
    private static final long M = 4294967295L;
    private static final int P7 = Integer.MAX_VALUE;
    private static final int PInv = 19;
    static final int[] P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.add(iArr, iArr2, iArr3);
        if (Nat256.gte(iArr3, P)) {
            subPFrom(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat.add(16, iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        Nat.inc(8, iArr, iArr2);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    private static int addPExtTo(int[] iArr) {
        int[] iArr2 = PExt;
        long j10 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr[0] = (int) j10;
        long jIncAt = j10 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(8, iArr, 1);
        }
        long j11 = ((iArr[8] & 4294967295L) - 19) + jIncAt;
        iArr[8] = (int) j11;
        long jDecAt = j11 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(15, iArr, 9);
        }
        long j12 = (iArr[15] & 4294967295L) + (4294967295L & (iArr2[15] + 1)) + jDecAt;
        iArr[15] = (int) j12;
        return (int) (j12 >> 32);
    }

    private static int addPTo(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j10;
        long jDecAt = j10 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(7, iArr, 1);
        }
        long j11 = (4294967295L & iArr[7]) + 2147483648L + jDecAt;
        iArr[7] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = P;
            if (!Nat256.gte(iArrFromBigInteger, iArr)) {
                return iArrFromBigInteger;
            }
            Nat256.subFrom(iArr, iArrFromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat256.add(iArr, P, iArr2);
            Nat.shiftDownBit(8, iArr2, 0);
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.mulAddTo(iArr, iArr2, iArr3);
        if (Nat.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (Nat.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[7];
        Nat.shiftUpBit(8, iArr, 8, i10, iArr2, 0);
        int iMulByWordAddTo = Nat256.mulByWordAddTo(19, iArr, iArr2) << 1;
        int i11 = iArr2[7];
        iArr2[7] = Nat.addWordTo(7, (((i11 >>> 31) - (i10 >>> 31)) + iMulByWordAddTo) * 19, iArr2) + (Integer.MAX_VALUE & i11);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    public static void reduce27(int i10, int[] iArr) {
        int i11 = iArr[7];
        iArr[7] = Nat.addWordTo(7, ((i10 << 1) | (i11 >>> 31)) * 19, iArr) + (i11 & Integer.MAX_VALUE);
        if (Nat256.gte(iArr, P)) {
            subPFrom(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static int subPExtFrom(int[] iArr) {
        int[] iArr2 = PExt;
        long j10 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j10;
        long jDecAt = j10 >> 32;
        if (jDecAt != 0) {
            jDecAt = Nat.decAt(8, iArr, 1);
        }
        long j11 = (iArr[8] & 4294967295L) + 19 + jDecAt;
        iArr[8] = (int) j11;
        long jIncAt = j11 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(15, iArr, 9);
        }
        long j12 = ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1))) + jIncAt;
        iArr[15] = (int) j12;
        return (int) (j12 >> 32);
    }

    private static int subPFrom(int[] iArr) {
        long j10 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long jIncAt = j10 >> 32;
        if (jIncAt != 0) {
            jIncAt = Nat.incAt(7, iArr, 1);
        }
        long j11 = ((4294967295L & iArr[7]) - 2147483648L) + jIncAt;
        iArr[7] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            addPTo(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            addPExtTo(iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        Nat.shiftUpBit(8, iArr, 0, iArr2);
        if (Nat256.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }
}
