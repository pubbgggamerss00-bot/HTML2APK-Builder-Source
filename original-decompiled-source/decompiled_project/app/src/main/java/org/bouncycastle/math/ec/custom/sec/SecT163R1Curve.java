package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecT163R1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT163R1_AFFINE_ZS = {new SecT163FieldElement(ECConstants.ONE)};
    private static final int SECT163R1_DEFAULT_COORDS = 6;
    protected SecT163R1Point infinity;

    public SecT163R1Curve() {
        super(163, 3, 6, 7);
        this.infinity = new SecT163R1Point(this, null, null);
        this.f20173a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f20174b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.order = new BigInteger(1, Hex.decodeStrict("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT163R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final long[] jArr = new long[i11 * 6];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawXCoord()).f20219x, 0, jArr, i12);
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawYCoord()).f20219x, 0, jArr, i12 + 3);
            i12 += 6;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT163R1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT163R1Curve.this.createRawPoint(new SecT163FieldElement(jArr2), new SecT163FieldElement(jArr3), SecT163R1Curve.SECT163R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i14) {
                long[] jArrCreate64 = Nat192.create64();
                long[] jArrCreate642 = Nat192.create64();
                int i15 = 0;
                for (int i16 = 0; i16 < i11; i16++) {
                    long j10 = ((i16 ^ i14) - 1) >> 31;
                    for (int i17 = 0; i17 < 3; i17++) {
                        long j11 = jArrCreate64[i17];
                        long[] jArr2 = jArr;
                        jArrCreate64[i17] = j11 ^ (jArr2[i15 + i17] & j10);
                        jArrCreate642[i17] = jArrCreate642[i17] ^ (jArr2[(i15 + 3) + i17] & j10);
                    }
                    i15 += 6;
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i14) {
                long[] jArrCreate64 = Nat192.create64();
                long[] jArrCreate642 = Nat192.create64();
                int i15 = i14 * 6;
                for (int i16 = 0; i16 < 3; i16++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i16] = jArr2[i15 + i16];
                    jArrCreate642[i16] = jArr2[3 + i15 + i16];
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT163FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
