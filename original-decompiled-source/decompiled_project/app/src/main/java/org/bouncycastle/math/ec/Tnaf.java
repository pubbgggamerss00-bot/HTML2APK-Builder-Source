package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigInteger2 = ECConstants.THREE;
        BigInteger bigIntegerNegate2 = bigInteger2.negate();
        MINUS_THREE = bigIntegerNegate2;
        BigInteger bigInteger3 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigInteger2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger3), null, new ZTauElement(bigIntegerNegate2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null, new ZTauElement(bigInteger2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigInteger3)};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, int i10, int i11) {
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i10 - r0) - 2) + b10));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i10)));
        int i12 = (((i10 + 5) / 2) + i11) - i11;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i12);
        if (bigIntegerAdd.testBit(i12 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(bigIntegerShiftRight, i11);
    }

    public static BigInteger[] getLucas(byte b10, int i10, boolean z10) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z10) {
            bigInteger = ECConstants.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b10);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerSubtract = ECConstants.ONE;
        }
        int i11 = 1;
        while (i11 < i10) {
            i11++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b10 < 0 ? bigIntegerSubtract.negate() : bigIntegerSubtract).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte getMu(int i10) {
        return (byte) (i10 == 0 ? -1 : 1);
    }

    public static ECPoint.AbstractF2m[] getPreComp(ECPoint.AbstractF2m abstractF2m, byte b10) {
        ECPoint.AbstractF2m abstractF2m2 = (ECPoint.AbstractF2m) abstractF2m.negate();
        byte[][] bArr = b10 == 0 ? alpha0Tnaf : alpha1Tnaf;
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr.length + 1) >>> 1];
        abstractF2mArr[0] = abstractF2m;
        int length = bArr.length;
        for (int i10 = 3; i10 < length; i10 += 2) {
            abstractF2mArr[i10 >>> 1] = multiplyFromTnaf(abstractF2m, abstractF2m2, bArr[i10]);
        }
        abstractF2m.getCurve().normalizeAll(abstractF2mArr);
        return abstractF2mArr;
    }

    public static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] getSi(int i10, int i11, BigInteger bigInteger) {
        byte mu = getMu(i11);
        int shiftsForCofactor = getShiftsForCofactor(bigInteger);
        BigInteger[] lucas = getLucas(mu, (i10 + 3) - i11, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        BigInteger bigInteger2 = ECConstants.ONE;
        return new BigInteger[]{bigInteger2.add(lucas[1]).shiftRight(shiftsForCofactor), bigInteger2.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    public static BigInteger getTw(byte b10, int i10) {
        if (i10 == 4) {
            return b10 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b10, i10, false);
        BigInteger bit = ECConstants.ZERO.setBit(i10);
        return lucas[0].shiftLeft(1).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static ECPoint.AbstractF2m multiplyFromTnaf(ECPoint.AbstractF2m abstractF2m, ECPoint.AbstractF2m abstractF2m2, byte[] bArr) {
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i10 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i10++;
            byte b10 = bArr[length];
            if (b10 != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i10).add(b10 > 0 ? abstractF2m : abstractF2m2);
                i10 = 0;
            }
        }
        return i10 > 0 ? abstractF2m3.tauPow(i10) : abstractF2m3;
    }

    public static ECPoint.AbstractF2m multiplyRTnaf(ECPoint.AbstractF2m abstractF2m, BigInteger bigInteger) {
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int iIntValue = abstractF2m2.getA().toBigInteger().intValue();
        return multiplyTnaf(abstractF2m, partModReduction(abstractF2m2, bigInteger, (byte) iIntValue, getMu(iIntValue), (byte) 10));
    }

    public static ECPoint.AbstractF2m multiplyTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(abstractF2m, (ECPoint.AbstractF2m) abstractF2m.negate(), tauAdicNaf(getMu(((ECCurve.AbstractF2m) abstractF2m.getCurve()).getA()), zTauElement));
    }

    public static BigInteger norm(byte b10, ZTauElement zTauElement) {
        BigInteger bigIntegerSubtract;
        BigInteger bigInteger = zTauElement.f20188u;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        if (b10 == 1) {
            bigIntegerSubtract = zTauElement.f20189v.shiftLeft(1).add(zTauElement.f20188u);
        } else {
            if (b10 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerSubtract = zTauElement.f20189v.shiftLeft(1).subtract(zTauElement.f20188u);
        }
        return bigIntegerSubtract.multiply(zTauElement.f20189v).add(bigIntegerMultiply);
    }

    public static ZTauElement partModReduction(ECCurve.AbstractF2m abstractF2m, BigInteger bigInteger, byte b10, byte b11, byte b12) {
        BigInteger bigIntegerSubtract;
        int fieldSize = abstractF2m.getFieldSize();
        BigInteger[] si = abstractF2m.getSi();
        BigInteger bigIntegerAdd = b11 == 1 ? si[0].add(si[1]) : si[0].subtract(si[1]);
        if (abstractF2m.isKoblitz()) {
            BigInteger bigInteger2 = ECConstants.ONE;
            bigIntegerSubtract = bigInteger2.shiftLeft(fieldSize).add(bigInteger2).subtract(abstractF2m.getOrder().multiply(abstractF2m.getCofactor()));
        } else {
            bigIntegerSubtract = getLucas(b11, fieldSize, true)[1];
        }
        BigInteger bigInteger3 = bigIntegerSubtract;
        ZTauElement zTauElementRound = round(approximateDivisionByN(bigInteger, si[0], bigInteger3, b10, fieldSize, b12), approximateDivisionByN(bigInteger, si[1], bigInteger3, b10, fieldSize, b12), b11);
        return new ZTauElement(bigInteger.subtract(bigIntegerAdd.multiply(zTauElementRound.f20188u)).subtract(si[1].multiply(zTauElementRound.f20189v).shiftLeft(1)), si[1].multiply(zTauElementRound.f20188u).subtract(si[0].multiply(zTauElementRound.f20189v)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.compareTo(r9) >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZTauElement round(SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2, byte b10) {
        SimpleBigDecimal simpleBigDecimalAdd;
        SimpleBigDecimal simpleBigDecimalSubtract;
        if (simpleBigDecimal2.getScale() != simpleBigDecimal.getScale()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i10 = -1;
        int i11 = 1;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerRound = simpleBigDecimal.round();
        BigInteger bigIntegerRound2 = simpleBigDecimal2.round();
        SimpleBigDecimal simpleBigDecimalSubtract2 = simpleBigDecimal.subtract(bigIntegerRound);
        SimpleBigDecimal simpleBigDecimalSubtract3 = simpleBigDecimal2.subtract(bigIntegerRound2);
        SimpleBigDecimal simpleBigDecimalAdd2 = simpleBigDecimalSubtract2.add(simpleBigDecimalSubtract2);
        SimpleBigDecimal simpleBigDecimalAdd3 = b10 == 1 ? simpleBigDecimalAdd2.add(simpleBigDecimalSubtract3) : simpleBigDecimalAdd2.subtract(simpleBigDecimalSubtract3);
        SimpleBigDecimal simpleBigDecimalAdd4 = simpleBigDecimalSubtract3.add(simpleBigDecimalSubtract3).add(simpleBigDecimalSubtract3);
        SimpleBigDecimal simpleBigDecimalAdd5 = simpleBigDecimalAdd4.add(simpleBigDecimalSubtract3);
        if (b10 == 1) {
            simpleBigDecimalAdd = simpleBigDecimalSubtract2.subtract(simpleBigDecimalAdd4);
            simpleBigDecimalSubtract = simpleBigDecimalSubtract2.add(simpleBigDecimalAdd5);
        } else {
            simpleBigDecimalAdd = simpleBigDecimalSubtract2.add(simpleBigDecimalAdd4);
            simpleBigDecimalSubtract = simpleBigDecimalSubtract2.subtract(simpleBigDecimalAdd5);
        }
        BigInteger bigInteger = ECConstants.ONE;
        byte b11 = 0;
        if (simpleBigDecimalAdd3.compareTo(bigInteger) >= 0) {
            if (simpleBigDecimalAdd.compareTo(MINUS_ONE) < 0) {
                i11 = 0;
                b11 = b10;
            }
        } else if (simpleBigDecimalSubtract.compareTo(ECConstants.TWO) < 0) {
            i11 = 0;
        }
        if (simpleBigDecimalAdd3.compareTo(MINUS_ONE) >= 0) {
            if (simpleBigDecimalSubtract.compareTo(MINUS_TWO) < 0) {
            }
            i10 = i11;
            return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i10)), bigIntegerRound2.add(BigInteger.valueOf(b11)));
        }
        b11 = (byte) (-b10);
        i10 = i11;
        return new ZTauElement(bigIntegerRound.add(BigInteger.valueOf(i10)), bigIntegerRound2.add(BigInteger.valueOf(b11)));
    }

    public static ECPoint.AbstractF2m tau(ECPoint.AbstractF2m abstractF2m) {
        return abstractF2m.tau();
    }

    public static byte[] tauAdicNaf(byte b10, ZTauElement zTauElement) {
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b10, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 : 34];
        BigInteger bigIntegerClearBit = zTauElement.f20188u;
        BigInteger bigInteger = zTauElement.f20189v;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            BigInteger bigInteger2 = ECConstants.ZERO;
            if (bigIntegerClearBit.equals(bigInteger2) && bigInteger.equals(bigInteger2)) {
                int i12 = i10 + 1;
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, 0, bArr2, 0, i12);
                return bArr2;
            }
            if (bigIntegerClearBit.testBit(0)) {
                byte bIntValue = (byte) ECConstants.TWO.subtract(bigIntegerClearBit.subtract(bigInteger.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                bArr[i11] = bIntValue;
                bigIntegerClearBit = bIntValue == 1 ? bigIntegerClearBit.clearBit(0) : bigIntegerClearBit.add(ECConstants.ONE);
                i10 = i11;
            } else {
                bArr[i11] = 0;
            }
            BigInteger bigIntegerShiftRight = bigIntegerClearBit.shiftRight(1);
            BigInteger bigIntegerAdd = b10 == 1 ? bigInteger.add(bigIntegerShiftRight) : bigInteger.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerClearBit.shiftRight(1).negate();
            i11++;
            bigIntegerClearBit = bigIntegerAdd;
            bigInteger = bigIntegerNegate;
        }
    }

    public static byte[] tauAdicWNaf(byte b10, ZTauElement zTauElement, int i10, int i11, ZTauElement[] zTauElementArr) {
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = norm(b10, zTauElement).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + i10 : i10 + 34];
        int i12 = (1 << i10) - 1;
        int i13 = 32 - i10;
        BigInteger bigIntegerSubtract = zTauElement.f20188u;
        BigInteger bigIntegerSubtract2 = zTauElement.f20189v;
        int i14 = 0;
        while (true) {
            if (bigIntegerSubtract.bitLength() <= 62 && bigIntegerSubtract2.bitLength() <= 62) {
                break;
            }
            if (bigIntegerSubtract.testBit(0)) {
                int iIntValue = (bigIntegerSubtract2.intValue() * i11) + bigIntegerSubtract.intValue();
                int i15 = iIntValue & i12;
                bArr[i14] = (byte) ((iIntValue << i13) >> i13);
                bigIntegerSubtract = bigIntegerSubtract.subtract(zTauElementArr[i15].f20188u);
                bigIntegerSubtract2 = bigIntegerSubtract2.subtract(zTauElementArr[i15].f20189v);
            }
            i14++;
            BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(1);
            BigInteger bigIntegerAdd = b10 == 1 ? bigIntegerSubtract2.add(bigIntegerShiftRight) : bigIntegerSubtract2.subtract(bigIntegerShiftRight);
            BigInteger bigIntegerNegate = bigIntegerShiftRight.negate();
            bigIntegerSubtract = bigIntegerAdd;
            bigIntegerSubtract2 = bigIntegerNegate;
        }
        long jLongValueExact = BigIntegers.longValueExact(bigIntegerSubtract);
        long jLongValueExact2 = BigIntegers.longValueExact(bigIntegerSubtract2);
        while ((jLongValueExact | jLongValueExact2) != 0) {
            if ((1 & jLongValueExact) != 0) {
                int i16 = (((int) jLongValueExact2) * i11) + ((int) jLongValueExact);
                int i17 = i16 & i12;
                bArr[i14] = (byte) ((i16 << i13) >> i13);
                jLongValueExact -= zTauElementArr[i17].f20188u.intValue();
                jLongValueExact2 -= zTauElementArr[i17].f20189v.intValue();
            }
            i14++;
            long j10 = jLongValueExact >> 1;
            long j11 = b10 == 1 ? jLongValueExact2 + j10 : jLongValueExact2 - j10;
            jLongValueExact2 = -j10;
            jLongValueExact = j11;
        }
        return bArr;
    }

    public static byte getMu(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return abstractF2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static BigInteger[] getSi(ECCurve.AbstractF2m abstractF2m) {
        if (abstractF2m.isKoblitz()) {
            return getSi(abstractF2m.getFieldSize(), abstractF2m.getA().toBigInteger().intValue(), abstractF2m.getCofactor());
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static SimpleBigDecimal norm(byte b10, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal simpleBigDecimalSubtract;
        SimpleBigDecimal simpleBigDecimalMultiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal simpleBigDecimalMultiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal simpleBigDecimalShiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b10 == 1) {
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.add(simpleBigDecimalMultiply2);
        } else {
            if (b10 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            simpleBigDecimalSubtract = simpleBigDecimalMultiply.subtract(simpleBigDecimalMultiply2);
        }
        return simpleBigDecimalSubtract.add(simpleBigDecimalShiftLeft);
    }

    public static byte getMu(ECFieldElement eCFieldElement) {
        return (byte) (eCFieldElement.isZero() ? -1 : 1);
    }
}
