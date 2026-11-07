package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes3.dex */
public class SecP521R1Point extends ECPoint.AbstractFp {
    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        char c10;
        int[] iArr;
        int[] iArr2;
        int i10;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f20186x;
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f20187y;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) eCPoint.getXCoord();
        SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement) eCPoint.getYCoord();
        SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement) this.zs[0];
        SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreate = Nat.create(33);
        int[] iArrCreate2 = Nat.create(17);
        int[] iArrCreate3 = Nat.create(17);
        int[] iArrCreate4 = Nat.create(17);
        int[] iArrCreate5 = Nat.create(17);
        boolean zIsOne = secP521R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP521R1FieldElement3.f20216x;
            iArr2 = secP521R1FieldElement4.f20216x;
            c10 = 0;
        } else {
            c10 = 0;
            SecP521R1Field.square(secP521R1FieldElement5.f20216x, iArrCreate4, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement3.f20216x, iArrCreate3, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement5.f20216x, iArrCreate4, iArrCreate);
            SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement4.f20216x, iArrCreate4, iArrCreate);
            iArr = iArrCreate3;
            iArr2 = iArrCreate4;
        }
        boolean zIsOne2 = secP521R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP521R1FieldElement.f20216x;
            iArr4 = secP521R1FieldElement2.f20216x;
            i10 = 17;
        } else {
            i10 = 17;
            SecP521R1Field.square(secP521R1FieldElement6.f20216x, iArrCreate5, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement.f20216x, iArrCreate2, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement6.f20216x, iArrCreate5, iArrCreate);
            SecP521R1Field.multiply(iArrCreate5, secP521R1FieldElement2.f20216x, iArrCreate5, iArrCreate);
            iArr3 = iArrCreate2;
            iArr4 = iArrCreate5;
        }
        int[] iArrCreate6 = Nat.create(i10);
        SecP521R1Field.subtract(iArr3, iArr, iArrCreate6);
        SecP521R1Field.subtract(iArr4, iArr2, iArrCreate3);
        int i11 = i10;
        if (Nat.isZero(i11, iArrCreate6)) {
            return Nat.isZero(i11, iArrCreate3) ? twice() : curve.getInfinity();
        }
        SecP521R1Field.square(iArrCreate6, iArrCreate4, iArrCreate);
        int[] iArrCreate7 = Nat.create(i11);
        SecP521R1Field.multiply(iArrCreate4, iArrCreate6, iArrCreate7, iArrCreate);
        SecP521R1Field.multiply(iArrCreate4, iArr3, iArrCreate4, iArrCreate);
        SecP521R1Field.multiply(iArr4, iArrCreate7, iArrCreate2, iArrCreate);
        SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(iArrCreate5);
        SecP521R1Field.square(iArrCreate3, secP521R1FieldElement7.f20216x, iArrCreate);
        int[] iArr5 = secP521R1FieldElement7.f20216x;
        SecP521R1Field.add(iArr5, iArrCreate7, iArr5);
        int[] iArr6 = secP521R1FieldElement7.f20216x;
        SecP521R1Field.subtract(iArr6, iArrCreate4, iArr6);
        int[] iArr7 = secP521R1FieldElement7.f20216x;
        SecP521R1Field.subtract(iArr7, iArrCreate4, iArr7);
        SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(iArrCreate7);
        SecP521R1Field.subtract(iArrCreate4, secP521R1FieldElement7.f20216x, secP521R1FieldElement8.f20216x);
        SecP521R1Field.multiply(secP521R1FieldElement8.f20216x, iArrCreate3, iArrCreate3, iArrCreate);
        SecP521R1Field.subtract(iArrCreate3, iArrCreate2, secP521R1FieldElement8.f20216x);
        SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(iArrCreate6);
        if (!zIsOne) {
            int[] iArr8 = secP521R1FieldElement9.f20216x;
            SecP521R1Field.multiply(iArr8, secP521R1FieldElement5.f20216x, iArr8, iArrCreate);
        }
        if (!zIsOne2) {
            int[] iArr9 = secP521R1FieldElement9.f20216x;
            SecP521R1Field.multiply(iArr9, secP521R1FieldElement6.f20216x, iArr9, iArrCreate);
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[1];
        eCFieldElementArr[c10] = secP521R1FieldElement9;
        return new SecP521R1Point(curve, secP521R1FieldElement7, secP521R1FieldElement8, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    public ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
        return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
    }

    public ECFieldElement eight(ECFieldElement eCFieldElement) {
        return four(two(eCFieldElement));
    }

    public ECFieldElement four(ECFieldElement eCFieldElement) {
        return two(two(eCFieldElement));
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP521R1Point(this.curve, this.f20186x, this.f20187y.negate(), this.zs);
    }

    public ECFieldElement three(ECFieldElement eCFieldElement) {
        return two(eCFieldElement).add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f20187y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f20187y;
        if (secP521R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f20186x;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) this.zs[0];
        int[] iArrCreate = Nat.create(33);
        int[] iArrCreate2 = Nat.create(17);
        int[] iArrCreate3 = Nat.create(17);
        int[] iArrCreate4 = Nat.create(17);
        SecP521R1Field.square(secP521R1FieldElement.f20216x, iArrCreate4, iArrCreate);
        int[] iArrCreate5 = Nat.create(17);
        SecP521R1Field.square(iArrCreate4, iArrCreate5, iArrCreate);
        boolean zIsOne = secP521R1FieldElement3.isOne();
        int[] iArr = secP521R1FieldElement3.f20216x;
        if (!zIsOne) {
            SecP521R1Field.square(iArr, iArrCreate3, iArrCreate);
            iArr = iArrCreate3;
        }
        SecP521R1Field.subtract(secP521R1FieldElement2.f20216x, iArr, iArrCreate2);
        SecP521R1Field.add(secP521R1FieldElement2.f20216x, iArr, iArrCreate3);
        SecP521R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3, iArrCreate);
        Nat.addBothTo(17, iArrCreate3, iArrCreate3, iArrCreate3);
        SecP521R1Field.reduce23(iArrCreate3);
        SecP521R1Field.multiply(iArrCreate4, secP521R1FieldElement2.f20216x, iArrCreate4, iArrCreate);
        Nat.shiftUpBits(17, iArrCreate4, 2, 0);
        SecP521R1Field.reduce23(iArrCreate4);
        Nat.shiftUpBits(17, iArrCreate5, 3, 0, iArrCreate2);
        SecP521R1Field.reduce23(iArrCreate2);
        SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(iArrCreate5);
        SecP521R1Field.square(iArrCreate3, secP521R1FieldElement4.f20216x, iArrCreate);
        int[] iArr2 = secP521R1FieldElement4.f20216x;
        SecP521R1Field.subtract(iArr2, iArrCreate4, iArr2);
        int[] iArr3 = secP521R1FieldElement4.f20216x;
        SecP521R1Field.subtract(iArr3, iArrCreate4, iArr3);
        SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(iArrCreate4);
        SecP521R1Field.subtract(iArrCreate4, secP521R1FieldElement4.f20216x, secP521R1FieldElement5.f20216x);
        int[] iArr4 = secP521R1FieldElement5.f20216x;
        SecP521R1Field.multiply(iArr4, iArrCreate3, iArr4, iArrCreate);
        int[] iArr5 = secP521R1FieldElement5.f20216x;
        SecP521R1Field.subtract(iArr5, iArrCreate2, iArr5);
        SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(iArrCreate3);
        SecP521R1Field.twice(secP521R1FieldElement.f20216x, secP521R1FieldElement6.f20216x);
        if (!zIsOne) {
            int[] iArr6 = secP521R1FieldElement6.f20216x;
            SecP521R1Field.multiply(iArr6, secP521R1FieldElement3.f20216x, iArr6, iArrCreate);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement4, secP521R1FieldElement5, new ECFieldElement[]{secP521R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        return this == eCPoint ? threeTimes() : isInfinity() ? eCPoint : eCPoint.isInfinity() ? twice() : this.f20187y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public ECFieldElement two(ECFieldElement eCFieldElement) {
        return eCFieldElement.add(eCFieldElement);
    }

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
