package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecP128R1Curve extends ECCurve.AbstractFp {
    private static final int SECP128R1_DEFAULT_COORDS = 2;
    protected SecP128R1Point infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f20194q = SecP128R1FieldElement.Q;
    private static final ECFieldElement[] SECP128R1_AFFINE_ZS = {new SecP128R1FieldElement(ECConstants.ONE)};

    public SecP128R1Curve() {
        super(f20194q);
        this.infinity = new SecP128R1Point(this, null, null);
        this.f20173a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f20174b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("E87579C11079F43DD824993C2CEE5ED3")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFE0000000075A30D1B9038A115"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final int[] iArr = new int[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawXCoord()).f20195x, 0, iArr, i12);
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawYCoord()).f20195x, 0, iArr, i12 + 4);
            i12 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP128R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP128R1Curve.this.createRawPoint(new SecP128R1FieldElement(iArr2), new SecP128R1FieldElement(iArr3), SecP128R1Curve.SECP128R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i14) {
                int[] iArrCreate = Nat128.create();
                int[] iArrCreate2 = Nat128.create();
                int i15 = 0;
                for (int i16 = 0; i16 < i11; i16++) {
                    int i17 = ((i16 ^ i14) - 1) >> 31;
                    for (int i18 = 0; i18 < 4; i18++) {
                        int i19 = iArrCreate[i18];
                        int[] iArr2 = iArr;
                        iArrCreate[i18] = i19 ^ (iArr2[i15 + i18] & i17);
                        iArrCreate2[i18] = iArrCreate2[i18] ^ (iArr2[(i15 + 4) + i18] & i17);
                    }
                    i15 += 8;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i14) {
                int[] iArrCreate = Nat128.create();
                int[] iArrCreate2 = Nat128.create();
                int i15 = i14 * 8;
                for (int i16 = 0; i16 < 4; i16++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i16] = iArr2[i15 + i16];
                    iArrCreate2[i16] = iArr2[4 + i15 + i16];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f20194q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f20194q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.random(secureRandom, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat128.create();
        SecP128R1Field.randomMult(secureRandom, iArrCreate);
        return new SecP128R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
