package org.bouncycastle.math.ec;

import ad.k;
import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes3.dex */
public class ECAlgorithms {
    public static ECPoint cleanPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.decodePoint(eCPoint.getEncoded(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static ECPoint implCheckResult(ECPoint eCPoint) {
        if (eCPoint.isValidPartial()) {
            return eCPoint;
        }
        throw new IllegalStateException("Invalid result");
    }

    private static ECPoint implShamirsTrickFixedPoint(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECPoint eCPointAdd;
        ECPoint offset;
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize || bigInteger2.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute2 = FixedPointUtil.precompute(eCPoint2);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        ECLookupTable lookupTable2 = fixedPointPreCompInfoPrecompute2.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        if (width != fixedPointPreCompInfoPrecompute2.getWidth()) {
            FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
            eCPointAdd = fixedPointCombMultiplier.multiply(eCPoint, bigInteger);
            offset = fixedPointCombMultiplier.multiply(eCPoint2, bigInteger2);
        } else {
            int i10 = ((combSize + width) - 1) / width;
            ECPoint infinity = curve.getInfinity();
            int i11 = width * i10;
            int[] iArrFromBigInteger = Nat.fromBigInteger(i11, bigInteger);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(i11, bigInteger2);
            int i12 = i11 - 1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = 0;
                int i15 = 0;
                for (int i16 = i12 - i13; i16 >= 0; i16 -= i10) {
                    int i17 = i16 >>> 5;
                    int i18 = i16 & 31;
                    int i19 = iArrFromBigInteger[i17] >>> i18;
                    i14 = ((i14 ^ (i19 >>> 1)) << 1) ^ i19;
                    int i20 = iArrFromBigInteger2[i17] >>> i18;
                    i15 = ((i15 ^ (i20 >>> 1)) << 1) ^ i20;
                }
                infinity = infinity.twicePlus(lookupTable.lookupVar(i14).add(lookupTable2.lookupVar(i15)));
            }
            eCPointAdd = infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
            offset = fixedPointPreCompInfoPrecompute2.getOffset();
        }
        return eCPointAdd.add(offset);
    }

    public static ECPoint implShamirsTrickJsf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPoint2, eCPoint.subtract(eCPoint2), eCPoint, eCPoint.add(eCPoint2)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] bArrGenerateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = bArrGenerateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            byte b10 = bArrGenerateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[k.b((b10 << 24) >> 28, 3, 4, (b10 << 28) >> 28)]);
        }
    }

    public static ECPoint implShamirsTrickWNaf(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() < 0;
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int windowSize = WNafUtil.getWindowSize(bigIntegerAbs.bitLength(), 8);
        int windowSize2 = WNafUtil.getWindowSize(bigIntegerAbs2.bitLength(), 8);
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, windowSize, true);
        WNafPreCompInfo wNafPreCompInfoPrecompute2 = WNafUtil.precompute(eCPoint2, windowSize2, true);
        int combSize = FixedPointUtil.getCombSize(eCPoint.getCurve());
        if (!z10 && !z11 && bigInteger.bitLength() <= combSize && bigInteger2.bitLength() <= combSize && wNafPreCompInfoPrecompute.isPromoted() && wNafPreCompInfoPrecompute2.isPromoted()) {
            return implShamirsTrickFixedPoint(eCPoint, bigInteger, eCPoint2, bigInteger2);
        }
        int iMin = Math.min(8, wNafPreCompInfoPrecompute.getWidth());
        int iMin2 = Math.min(8, wNafPreCompInfoPrecompute2.getWidth());
        return implShamirsTrickWNaf(z10 ? wNafPreCompInfoPrecompute.getPreCompNeg() : wNafPreCompInfoPrecompute.getPreComp(), z10 ? wNafPreCompInfoPrecompute.getPreComp() : wNafPreCompInfoPrecompute.getPreCompNeg(), WNafUtil.generateWindowNaf(iMin, bigIntegerAbs), z11 ? wNafPreCompInfoPrecompute2.getPreCompNeg() : wNafPreCompInfoPrecompute2.getPreComp(), z11 ? wNafPreCompInfoPrecompute2.getPreComp() : wNafPreCompInfoPrecompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMin2, bigIntegerAbs2));
    }

    public static ECPoint implSumOfMultiplies(ECEndomorphism eCEndomorphism, ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        ECPoint[] eCPointArr2 = eCPointArr;
        int length = eCPointArr2.length;
        int i10 = length << 1;
        boolean[] zArr = new boolean[i10];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i10];
        byte[][] bArr = new byte[i10][];
        ECPointMap pointMap = eCEndomorphism.getPointMap();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 << 1;
            int i13 = i12 + 1;
            BigInteger bigInteger = bigIntegerArr[i12];
            zArr[i12] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i13];
            zArr[i13] = bigInteger2.signum() < 0;
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int windowSize = WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()), 8);
            ECPoint eCPoint = eCPointArr2[i11];
            WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, windowSize, true);
            WNafPreCompInfo wNafPreCompInfoPrecomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), pointMap, wNafPreCompInfoPrecompute, true);
            int iMin = Math.min(8, wNafPreCompInfoPrecompute.getWidth());
            int iMin2 = Math.min(8, wNafPreCompInfoPrecomputeWithPointMap.getWidth());
            wNafPreCompInfoArr[i12] = wNafPreCompInfoPrecompute;
            wNafPreCompInfoArr[i13] = wNafPreCompInfoPrecomputeWithPointMap;
            bArr[i12] = WNafUtil.generateWindowNaf(iMin, bigIntegerAbs);
            bArr[i13] = WNafUtil.generateWindowNaf(iMin2, bigIntegerAbs2);
            i11++;
            eCPointArr2 = eCPointArr;
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint implSumOfMultipliesGLV(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i10 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            BigInteger[] bigIntegerArrDecomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i12].mod(order));
            int i13 = i11 + 1;
            bigIntegerArr2[i11] = bigIntegerArrDecomposeScalar[0];
            i11 += 2;
            bigIntegerArr2[i13] = bigIntegerArrDecomposeScalar[1];
        }
        if (gLVEndomorphism.hasEfficientPointMap()) {
            return implSumOfMultiplies(gLVEndomorphism, eCPointArr, bigIntegerArr2);
        }
        ECPoint[] eCPointArr2 = new ECPoint[i10];
        int i14 = 0;
        for (ECPoint eCPoint : eCPointArr) {
            ECPoint eCPointMapPoint = EndoUtil.mapPoint(gLVEndomorphism, eCPoint);
            int i15 = i14 + 1;
            eCPointArr2[i14] = eCPoint;
            i14 += 2;
            eCPointArr2[i15] = eCPointMapPoint;
        }
        return implSumOfMultiplies(eCPointArr2, bigIntegerArr2);
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(FiniteField finiteField) {
        return finiteField.getDimension() > 1 && finiteField.getCharacteristic().equals(ECConstants.TWO) && (finiteField instanceof PolynomialExtensionField);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(FiniteField finiteField) {
        return finiteField.getDimension() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i10, int i11) {
        montgomeryTrick(eCFieldElementArr, i10, i11, null);
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i10 = 1; i10 < iBitLength; i10++) {
                eCPoint = eCPoint.twice();
                if (bigIntegerAbs.testBit(i10)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        return implCheckResult(implShamirsTrickJsf(eCPoint, bigInteger, importPoint(eCPoint.getCurve(), eCPoint2), bigInteger2));
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i10 = 1; i10 < length; i10++) {
                    eCPointArr2[i10] = importPoint(curve, eCPointArr[i10]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? implCheckResult(implSumOfMultipliesGLV(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : implCheckResult(implSumOfMultiplies(eCPointArr2, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECPoint eCPointImplSumOfMultipliesGLV;
        ECCurve curve = eCPoint.getCurve();
        ECPoint eCPointImportPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            eCPointImplSumOfMultipliesGLV = eCPoint.multiply(bigInteger).add(eCPointImportPoint.multiply(bigInteger2));
        } else {
            ECEndomorphism endomorphism = curve.getEndomorphism();
            eCPointImplSumOfMultipliesGLV = endomorphism instanceof GLVEndomorphism ? implSumOfMultipliesGLV(new ECPoint[]{eCPoint, eCPointImportPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism) : implShamirsTrickWNaf(eCPoint, bigInteger, eCPointImportPoint, bigInteger2);
        }
        return implCheckResult(eCPointImplSumOfMultipliesGLV);
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        throw new IllegalStateException("Invalid point");
    }

    public static ECPoint implShamirsTrickWNaf(ECEndomorphism eCEndomorphism, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() < 0;
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()), 8), true);
        WNafPreCompInfo wNafPreCompInfoPrecomputeWithPointMap = WNafUtil.precomputeWithPointMap(EndoUtil.mapPoint(eCEndomorphism, eCPoint), eCEndomorphism.getPointMap(), wNafPreCompInfoPrecompute, true);
        int iMin = Math.min(8, wNafPreCompInfoPrecompute.getWidth());
        int iMin2 = Math.min(8, wNafPreCompInfoPrecomputeWithPointMap.getWidth());
        return implShamirsTrickWNaf(z10 ? wNafPreCompInfoPrecompute.getPreCompNeg() : wNafPreCompInfoPrecompute.getPreComp(), z10 ? wNafPreCompInfoPrecompute.getPreComp() : wNafPreCompInfoPrecompute.getPreCompNeg(), WNafUtil.generateWindowNaf(iMin, bigIntegerAbs), z11 ? wNafPreCompInfoPrecomputeWithPointMap.getPreCompNeg() : wNafPreCompInfoPrecomputeWithPointMap.getPreComp(), z11 ? wNafPreCompInfoPrecomputeWithPointMap.getPreComp() : wNafPreCompInfoPrecomputeWithPointMap.getPreCompNeg(), WNafUtil.generateWindowNaf(iMin2, bigIntegerAbs2));
    }

    public static ECPoint implSumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i10 = 0; i10 < length; i10++) {
            BigInteger bigInteger = bigIntegerArr[i10];
            zArr[i10] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPointArr[i10], WNafUtil.getWindowSize(bigIntegerAbs.bitLength(), 8), true);
            int iMin = Math.min(8, wNafPreCompInfoPrecompute.getWidth());
            wNafPreCompInfoArr[i10] = wNafPreCompInfoPrecompute;
            bArr[i10] = WNafUtil.generateWindowNaf(iMin, bigIntegerAbs);
        }
        return implSumOfMultiplies(zArr, wNafPreCompInfoArr, bArr);
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i10, int i11, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i11];
        int i12 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i10];
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11) {
                break;
            }
            eCFieldElementArr2[i13] = eCFieldElementArr2[i12].multiply(eCFieldElementArr[i10 + i13]);
            i12 = i13;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i12] = eCFieldElementArr2[i12].multiply(eCFieldElement);
        }
        ECFieldElement eCFieldElementInvert = eCFieldElementArr2[i12].invert();
        while (i12 > 0) {
            int i14 = i12 - 1;
            int i15 = i12 + i10;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i15];
            eCFieldElementArr[i15] = eCFieldElementArr2[i14].multiply(eCFieldElementInvert);
            eCFieldElementInvert = eCFieldElementInvert.multiply(eCFieldElement2);
            i12 = i14;
        }
        eCFieldElementArr[i10] = eCFieldElementInvert;
    }

    private static ECPoint implShamirsTrickWNaf(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPointAdd;
        int iMax = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i10 = iMax - 1;
        int i11 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i10 >= 0) {
            byte b10 = i10 < bArr.length ? bArr[i10] : (byte) 0;
            byte b11 = i10 < bArr2.length ? bArr2[i10] : (byte) 0;
            if ((b10 | b11) == 0) {
                i11++;
            } else {
                if (b10 != 0) {
                    eCPointAdd = infinity.add((b10 < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b10) >>> 1]);
                } else {
                    eCPointAdd = infinity;
                }
                if (b11 != 0) {
                    eCPointAdd = eCPointAdd.add((b11 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b11) >>> 1]);
                }
                if (i11 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i11);
                    i11 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i10--;
        }
        return i11 > 0 ? eCPointTwicePlus.timesPow2(i11) : eCPointTwicePlus;
    }

    private static ECPoint implSumOfMultiplies(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int iMax = 0;
        for (byte[] bArr2 : bArr) {
            iMax = Math.max(iMax, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i10 = iMax - 1;
        int i11 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i10 >= 0) {
            ECPoint eCPointAdd = infinity;
            for (int i12 = 0; i12 < length; i12++) {
                byte[] bArr3 = bArr[i12];
                byte b10 = i10 < bArr3.length ? bArr3[i10] : (byte) 0;
                if (b10 != 0) {
                    int iAbs = Math.abs((int) b10);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i12];
                    eCPointAdd = eCPointAdd.add(((b10 < 0) == zArr[i12] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[iAbs >>> 1]);
                }
            }
            if (eCPointAdd == infinity) {
                i11++;
            } else {
                if (i11 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i11);
                    i11 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i10--;
        }
        return i11 > 0 ? eCPointTwicePlus.timesPow2(i11) : eCPointTwicePlus;
    }
}
