package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes3.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        if (bigInteger.bitLength() > FixedPointUtil.getCombSize(curve)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int i10 = ((r1 + width) - 1) / width;
        ECPoint infinity = curve.getInfinity();
        int i11 = width * i10;
        int[] iArrFromBigInteger = Nat.fromBigInteger(i11, bigInteger);
        int i12 = i11 - 1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = 0;
            for (int i15 = i12 - i13; i15 >= 0; i15 -= i10) {
                int i16 = iArrFromBigInteger[i15 >>> 5] >>> (i15 & 31);
                i14 = ((i14 ^ (i16 >>> 1)) << 1) ^ i16;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i14));
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
