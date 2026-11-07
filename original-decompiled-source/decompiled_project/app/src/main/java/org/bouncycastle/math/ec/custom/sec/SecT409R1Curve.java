package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat448;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecT409R1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT409R1_AFFINE_ZS = {new SecT409FieldElement(ECConstants.ONE)};
    private static final int SECT409R1_DEFAULT_COORDS = 6;
    protected SecT409R1Point infinity;

    public SecT409R1Curve() {
        super(409, 87, 0, 0);
        this.infinity = new SecT409R1Point(this, null, null);
        this.f20173a = fromBigInteger(BigInteger.valueOf(1L));
        this.f20174b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT409R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final long[] jArr = new long[i11 * 14];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat448.copy64(((SecT409FieldElement) eCPoint.getRawXCoord()).f20224x, 0, jArr, i12);
            Nat448.copy64(((SecT409FieldElement) eCPoint.getRawYCoord()).f20224x, 0, jArr, i12 + 7);
            i12 += 14;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT409R1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT409R1Curve.this.createRawPoint(new SecT409FieldElement(jArr2), new SecT409FieldElement(jArr3), SecT409R1Curve.SECT409R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i14) {
                long[] jArrCreate64 = Nat448.create64();
                long[] jArrCreate642 = Nat448.create64();
                int i15 = 0;
                for (int i16 = 0; i16 < i11; i16++) {
                    long j10 = ((i16 ^ i14) - 1) >> 31;
                    for (int i17 = 0; i17 < 7; i17++) {
                        long j11 = jArrCreate64[i17];
                        long[] jArr2 = jArr;
                        jArrCreate64[i17] = j11 ^ (jArr2[i15 + i17] & j10);
                        jArrCreate642[i17] = jArrCreate642[i17] ^ (jArr2[(i15 + 7) + i17] & j10);
                    }
                    i15 += 14;
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i14) {
                long[] jArrCreate64 = Nat448.create64();
                long[] jArrCreate642 = Nat448.create64();
                int i15 = i14 * 14;
                for (int i16 = 0; i16 < 7; i16++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i16] = jArr2[i15 + i16];
                    jArrCreate642[i16] = jArr2[7 + i15 + i16];
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT409R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT409FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 409;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 409;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
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
        return new SecT409R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
