package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        final int iMin = Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == iMin) {
                    wNafPreCompInfo.setPromotionCountdown(0);
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                wNafPreCompInfo2.setPromotionCountdown(0);
                wNafPreCompInfo2.setConfWidth(iMin);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i10 = iBitLength >> 1;
        int[] iArr = new int[i10];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i11 = iBitLength - 1;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i13 < i11) {
            if (bigIntegerXor.testBit(i13)) {
                iArr[i12] = i14 | ((bigInteger.testBit(i13) ? -1 : 1) << 16);
                i13++;
                i14 = 1;
                i12++;
            } else {
                i14++;
            }
            i13++;
        }
        int i15 = i12 + 1;
        iArr[i12] = 65536 | i14;
        return i10 > i15 ? trim(iArr, i15) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int iBitLength = (bigInteger.bitLength() / i10) + 1;
        int[] iArr = new int[iBitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int iIntValue = bigInteger.intValue() & i12;
                if (z10) {
                    iIntValue++;
                }
                z10 = (iIntValue & i13) != 0;
                if (z10) {
                    iIntValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                iArr[i15] = i14 | (iIntValue << 16);
                i14 = i10;
                i15++;
            }
        }
        return iBitLength > i15 ? trim(iArr, i15) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[iMax];
        BigInteger bigIntegerShiftRight = bigInteger;
        BigInteger bigIntegerShiftRight2 = bigInteger2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if ((i10 | i11) == 0 && bigIntegerShiftRight.bitLength() <= i12 && bigIntegerShiftRight2.bitLength() <= i12) {
                break;
            }
            int iIntValue = (bigIntegerShiftRight.intValue() >>> i12) + i10;
            int i14 = iIntValue & 7;
            int iIntValue2 = (bigIntegerShiftRight2.intValue() >>> i12) + i11;
            int i15 = iIntValue2 & 7;
            int i16 = iIntValue & 1;
            if (i16 != 0) {
                i16 -= iIntValue & 2;
                if (i14 + i16 == 4 && (iIntValue2 & 3) == 2) {
                    i16 = -i16;
                }
            }
            int i17 = iIntValue2 & 1;
            if (i17 != 0) {
                i17 -= iIntValue2 & 2;
                if (i15 + i17 == 4 && (iIntValue & 3) == 2) {
                    i17 = -i17;
                }
            }
            if ((i10 << 1) == i16 + 1) {
                i10 ^= 1;
            }
            if ((i11 << 1) == i17 + 1) {
                i11 ^= 1;
            }
            i12++;
            if (i12 == 30) {
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(30);
                bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(30);
                i12 = 0;
            }
            bArr[i13] = (byte) ((i17 & 15) | (i16 << 4));
            i13++;
        }
        return iMax > i13 ? trim(bArr, i13) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i10 = iBitLength - 1;
        byte[] bArr = new byte[i10];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i11 = 1;
        while (i11 < i10) {
            if (bigIntegerXor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int iIntValue = bigInteger.intValue() & i12;
                if (z10) {
                    iIntValue++;
                }
                z10 = (iIntValue & i13) != 0;
                if (z10) {
                    iIntValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                int i16 = i15 + i14;
                bArr[i16] = (byte) iIntValue;
                i15 = i16 + 1;
                i14 = i10;
            }
        }
        return iBitLength > i15 ? trim(bArr, i15) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i10) {
        return getWindowSize(i10, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static WNafPreCompInfo precompute(final ECPoint eCPoint, final int i10, final boolean z10) {
        final ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo, int i11, int i12, boolean z11) {
                if (wNafPreCompInfo == null || wNafPreCompInfo.getWidth() < Math.max(wNafPreCompInfo.getConfWidth(), i11) || !checkTable(wNafPreCompInfo.getPreComp(), i12)) {
                    return false;
                }
                return !z11 || checkTable(wNafPreCompInfo.getPreCompNeg(), i12);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i11) {
                return eCPointArr != null && eCPointArr.length >= i11;
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[PHI: r14
              0x00ef: PHI (r14v6 org.bouncycastle.math.ec.ECPoint) = 
              (r14v4 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
             binds: [B:28:0x0091, B:30:0x009d, B:32:0x00a5, B:34:0x00af, B:40:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                ECPoint eCPointTwice;
                ECPoint[] eCPointArrResizeTable;
                ECPoint[] eCPointArrResizeTable2;
                int length;
                int i11;
                ECPoint eCPointCreatePoint;
                int coordinateSystem;
                ECFieldElement zCoord = null;
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int iMax = Math.max(2, Math.min(16, i10));
                if (checkExisting(wNafPreCompInfo, iMax, 1 << (iMax - 2), z10)) {
                    wNafPreCompInfo.decrementPromotionCountdown();
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPromotionCountdown(wNafPreCompInfo.decrementPromotionCountdown());
                    wNafPreCompInfo2.setConfWidth(wNafPreCompInfo.getConfWidth());
                    eCPointArrResizeTable = wNafPreCompInfo.getPreComp();
                    eCPointArrResizeTable2 = wNafPreCompInfo.getPreCompNeg();
                    eCPointTwice = wNafPreCompInfo.getTwice();
                } else {
                    eCPointTwice = null;
                    eCPointArrResizeTable = null;
                    eCPointArrResizeTable2 = null;
                }
                int iMin = Math.min(16, Math.max(wNafPreCompInfo2.getConfWidth(), iMax));
                int i12 = 1 << (iMin - 2);
                int length2 = 0;
                if (eCPointArrResizeTable == null) {
                    eCPointArrResizeTable = WNafUtil.EMPTY_POINTS;
                    length = 0;
                } else {
                    length = eCPointArrResizeTable.length;
                }
                if (length < i12) {
                    eCPointArrResizeTable = WNafUtil.resizeTable(eCPointArrResizeTable, i12);
                    if (i12 == 1) {
                        eCPointArrResizeTable[0] = eCPoint.normalize();
                    } else {
                        if (length == 0) {
                            eCPointArrResizeTable[0] = eCPoint;
                            i11 = 1;
                        } else {
                            i11 = length;
                        }
                        if (i12 == 2) {
                            eCPointArrResizeTable[1] = eCPoint.threeTimes();
                        } else {
                            ECPoint eCPointAdd = eCPointArrResizeTable[i11 - 1];
                            if (eCPointTwice == null) {
                                eCPointTwice = eCPointArrResizeTable[0].twice();
                                if (eCPointTwice.isInfinity() || !ECAlgorithms.isFpCurve(curve) || curve.getFieldSize() < 64 || !((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                    eCPointCreatePoint = eCPointTwice;
                                } else {
                                    zCoord = eCPointTwice.getZCoord(0);
                                    eCPointCreatePoint = curve.createPoint(eCPointTwice.getXCoord().toBigInteger(), eCPointTwice.getYCoord().toBigInteger());
                                    ECFieldElement eCFieldElementSquare = zCoord.square();
                                    eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                                    if (length == 0) {
                                        eCPointArrResizeTable[0] = eCPointAdd;
                                    }
                                }
                                while (i11 < i12) {
                                    eCPointAdd = eCPointAdd.add(eCPointCreatePoint);
                                    eCPointArrResizeTable[i11] = eCPointAdd;
                                    i11++;
                                }
                            }
                        }
                        curve.normalizeAll(eCPointArrResizeTable, length, i12 - length, zCoord);
                    }
                }
                if (z10) {
                    if (eCPointArrResizeTable2 == null) {
                        eCPointArrResizeTable2 = new ECPoint[i12];
                    } else {
                        length2 = eCPointArrResizeTable2.length;
                        if (length2 < i12) {
                            eCPointArrResizeTable2 = WNafUtil.resizeTable(eCPointArrResizeTable2, i12);
                        }
                    }
                    while (length2 < i12) {
                        eCPointArrResizeTable2[length2] = eCPointArrResizeTable[length2].negate();
                        length2++;
                    }
                }
                wNafPreCompInfo2.setPreComp(eCPointArrResizeTable);
                wNafPreCompInfo2.setPreCompNeg(eCPointArrResizeTable2);
                wNafPreCompInfo2.setTwice(eCPointTwice);
                wNafPreCompInfo2.setWidth(iMin);
                return wNafPreCompInfo2;
            }
        });
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, final ECPointMap eCPointMap, final WNafPreCompInfo wNafPreCompInfo, final boolean z10) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo2, int i10, int i11, boolean z11) {
                if (wNafPreCompInfo2 == null || wNafPreCompInfo2.getWidth() < i10 || !checkTable(wNafPreCompInfo2.getPreComp(), i11)) {
                    return false;
                }
                return !z11 || checkTable(wNafPreCompInfo2.getPreCompNeg(), i11);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i10) {
                return eCPointArr != null && eCPointArr.length >= i10;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int width = wNafPreCompInfo.getWidth();
                if (checkExisting(wNafPreCompInfo2, width, wNafPreCompInfo.getPreComp().length, z10)) {
                    wNafPreCompInfo2.decrementPromotionCountdown();
                    return wNafPreCompInfo2;
                }
                WNafPreCompInfo wNafPreCompInfo3 = new WNafPreCompInfo();
                wNafPreCompInfo3.setPromotionCountdown(wNafPreCompInfo.getPromotionCountdown());
                ECPoint twice = wNafPreCompInfo.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                ECPoint[] preComp = wNafPreCompInfo.getPreComp();
                int length = preComp.length;
                ECPoint[] eCPointArr = new ECPoint[length];
                for (int i10 = 0; i10 < preComp.length; i10++) {
                    eCPointArr[i10] = eCPointMap.map(preComp[i10]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z10) {
                    ECPoint[] eCPointArr2 = new ECPoint[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        eCPointArr2[i11] = eCPointArr[i11].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i10) {
        ECPoint[] eCPointArr2 = new ECPoint[i10];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i10, int i11) {
        return getWindowSize(i10, DEFAULT_WINDOW_SIZE_CUTOFFS, i11);
    }

    private static int[] trim(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public static int getWindowSize(int i10, int[] iArr) {
        return getWindowSize(i10, iArr, 16);
    }

    public static int getWindowSize(int i10, int[] iArr, int i11) {
        int i12 = 0;
        while (i12 < iArr.length && i10 >= iArr[i12]) {
            i12++;
        }
        return Math.max(2, Math.min(i11, i12 + 2));
    }
}
