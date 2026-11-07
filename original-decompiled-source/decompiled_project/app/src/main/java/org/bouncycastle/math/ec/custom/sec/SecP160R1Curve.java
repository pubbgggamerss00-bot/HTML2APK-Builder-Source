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
public class SecP160R1Curve extends ECCurve.AbstractFp {
    private static final int SECP160R1_DEFAULT_COORDS = 2;
    protected SecP160R1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f20197q = SecP160R1FieldElement.Q;
    private static final ECFieldElement[] SECP160R1_AFFINE_ZS = {new SecP160R1FieldElement(ECConstants.ONE)};

    public SecP160R1Curve() {
        super(f20197q);
        this.infinity = new SecP160R1Point(this, null, null);
        this.f20173a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f20174b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000001F4C8F927AED3CA752257"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final int[] iArr = new int[i11 * 10];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawXCoord()).f20198x, 0, iArr, i12);
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawYCoord()).f20198x, 0, iArr, i12 + 5);
            i12 += 10;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP160R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP160R1Curve.this.createRawPoint(new SecP160R1FieldElement(iArr2), new SecP160R1FieldElement(iArr3), SecP160R1Curve.SECP160R1_AFFINE_ZS);
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
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f20197q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f20197q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.random(secureRandom, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.randomMult(secureRandom, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
