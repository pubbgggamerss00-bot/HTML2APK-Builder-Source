package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecP160R2Curve extends ECCurve.AbstractFp {
    private static final int SECP160R2_DEFAULT_COORDS = 2;
    protected SecP160R2Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f20199q = SecP160R2FieldElement.Q;
    private static final ECFieldElement[] SECP160R2_AFFINE_ZS = {new SecP160R2FieldElement(ECConstants.ONE)};

    public SecP160R2Curve() {
        super(f20199q);
        this.infinity = new SecP160R2Point(this, null, null);
        this.f20173a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f20174b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000000351EE786A818F3A1A16B"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160R2Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final int[] iArr = new int[i11 * 10];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawXCoord()).f20200x, 0, iArr, i12);
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawYCoord()).f20200x, 0, iArr, i12 + 5);
            i12 += 10;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP160R2Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP160R2Curve.this.createRawPoint(new SecP160R2FieldElement(iArr2), new SecP160R2FieldElement(iArr3), SecP160R2Curve.SECP160R2_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i14) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i15 = 0;
                for (int i16 = 0; i16 < i11; i16++) {
                    int i17 = ((i16 ^ i14) - 1) >> 31;
                    for (int i18 = 0; i18 < 5; i18++) {
                        int i19 = iArrCreate[i18];
                        int[] iArr2 = iArr;
                        iArrCreate[i18] = i19 ^ (iArr2[i15 + i18] & i17);
                        iArrCreate2[i18] = iArrCreate2[i18] ^ (iArr2[(i15 + 5) + i18] & i17);
                    }
                    i15 += 10;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i14) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i15 = i14 * 10;
                for (int i16 = 0; i16 < 5; i16++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i16] = iArr2[i15 + i16];
                    iArrCreate2[i16] = iArr2[5 + i15 + i16];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R2FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f20199q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f20199q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.random(secureRandom, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R2Field.randomMult(secureRandom, iArrCreate);
        return new SecP160R2FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
