package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecT239K1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT239K1_AFFINE_ZS = {new SecT239FieldElement(ECConstants.ONE)};
    private static final int SECT239K1_DEFAULT_COORDS = 6;
    protected SecT239K1Point infinity;

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.infinity = new SecT239K1Point(this, null, null);
        this.f20173a = fromBigInteger(BigInteger.valueOf(0L));
        this.f20174b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final long[] jArr = new long[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawXCoord()).f20222x, 0, jArr, i12);
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawYCoord()).f20222x, 0, jArr, i12 + 4);
            i12 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT239K1Curve.this.createRawPoint(new SecT239FieldElement(jArr2), new SecT239FieldElement(jArr3), SecT239K1Curve.SECT239K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i14) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate642 = Nat256.create64();
                int i15 = 0;
                for (int i16 = 0; i16 < i11; i16++) {
                    long j10 = ((i16 ^ i14) - 1) >> 31;
                    for (int i17 = 0; i17 < 4; i17++) {
                        long j11 = jArrCreate64[i17];
                        long[] jArr2 = jArr;
                        jArrCreate64[i17] = j11 ^ (jArr2[i15 + i17] & j10);
                        jArrCreate642[i17] = jArrCreate642[i17] ^ (jArr2[(i15 + 4) + i17] & j10);
                    }
                    i15 += 8;
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i14) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate642 = Nat256.create64();
                int i15 = i14 * 8;
                for (int i16 = 0; i16 < 4; i16++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i16] = jArr2[i15 + i16];
                    jArrCreate642[i16] = jArr2[4 + i15 + i16];
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
