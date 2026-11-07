package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat512;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SecP521R1Field {
    private static final int P16 = 511;
    static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, P16};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int iAdd = Nat.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iAdd > P16 || (iAdd == P16 && Nat.eq(16, iArr3, P))) {
            iAdd = (Nat.inc(16, iArr3) + iAdd) & P16;
        }
        iArr3[16] = iAdd;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int iInc = Nat.inc(16, iArr, iArr2) + iArr[16];
        if (iInc > P16 || (iInc == P16 && Nat.eq(16, iArr2, P))) {
            iInc = (Nat.inc(16, iArr2) + iInc) & P16;
        }
        iArr2[16] = iInc;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(521, bigInteger);
        if (Nat.eq(17, iArrFromBigInteger, P)) {
            Nat.zero(17, iArrFromBigInteger);
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (Nat.shiftDownBit(16, iArr, i10, iArr2) >>> 23) | (i10 >>> 1);
    }

    public static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat512.mul(iArr, iArr2, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        iArr3[32] = (i10 * i11) + Nat.mul31BothAdd(16, i10, iArr2, i11, iArr, iArr3, 16);
    }

    public static void implSquare(int[] iArr, int[] iArr2) {
        Nat512.square(iArr, iArr2);
        int i10 = iArr[16];
        iArr2[32] = (i10 * i10) + Nat.mulWordAddTo(16, i10 << 1, iArr, 0, iArr2, 16);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 17; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(33);
        implMultiply(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(17, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat.sub(17, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & P16;
        } while (Nat.lessThan(17, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[32];
        int iAddTo = Nat.addTo(16, iArr, iArr2) + (Nat.shiftDownBits(16, iArr, 16, 9, i10, iArr2, 0) >>> 23) + (i10 >>> 9);
        if (iAddTo > P16 || (iAddTo == P16 && Nat.eq(16, iArr2, P))) {
            iAddTo = (Nat.inc(16, iArr2) + iAddTo) & P16;
        }
        iArr2[16] = iAddTo;
    }

    public static void reduce23(int[] iArr) {
        int i10 = iArr[16];
        int iAddWordTo = Nat.addWordTo(16, i10 >>> 9, iArr) + (i10 & P16);
        if (iAddWordTo > P16 || (iAddWordTo == P16 && Nat.eq(16, iArr, P))) {
            iAddWordTo = (Nat.inc(16, iArr) + iAddWordTo) & P16;
        }
        iArr[16] = iAddWordTo;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrCreate = Nat.create(33);
        implSquare(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(iArr2, iArrCreate);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int iSub = (Nat.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iSub < 0) {
            iSub = (Nat.dec(16, iArr3) + iSub) & P16;
        }
        iArr3[16] = iSub;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (Nat.shiftUpBit(16, iArr, i10 << 23, iArr2) | (i10 << 1)) & P16;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        implMultiply(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        implSquare(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2, int[] iArr3) {
        implSquare(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(iArr2, iArr3);
            }
        }
    }
}
