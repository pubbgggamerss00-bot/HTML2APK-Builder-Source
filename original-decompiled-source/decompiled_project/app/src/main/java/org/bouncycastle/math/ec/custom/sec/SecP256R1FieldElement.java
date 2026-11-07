package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SecP256R1FieldElement extends ECFieldElement.AbstractFp {
    public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: x, reason: collision with root package name */
    protected int[] f20212x;

    public SecP256R1FieldElement() {
        this.f20212x = Nat256.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.add(this.f20212x, ((SecP256R1FieldElement) eCFieldElement).f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.addOne(this.f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.inv(((SecP256R1FieldElement) eCFieldElement).f20212x, iArrCreate);
        SecP256R1Field.multiply(iArrCreate, this.f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return Nat256.eq(this.f20212x, ((SecP256R1FieldElement) obj).f20212x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f20212x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.inv(this.f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat256.isOne(this.f20212x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat256.isZero(this.f20212x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.multiply(this.f20212x, ((SecP256R1FieldElement) eCFieldElement).f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.negate(this.f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f20212x;
        if (Nat256.isZero(iArr) || Nat256.isOne(iArr)) {
            return this;
        }
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        SecP256R1Field.square(iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 2, iArrCreate2, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate2, 4, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 8, iArrCreate2, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate2, 16, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 32, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 96, iArrCreate, iArrCreateExt);
        SecP256R1Field.multiply(iArrCreate, iArr, iArrCreate, iArrCreateExt);
        SecP256R1Field.squareN(iArrCreate, 94, iArrCreate, iArrCreateExt);
        SecP256R1Field.square(iArrCreate, iArrCreate2, iArrCreateExt);
        if (Nat256.eq(iArr, iArrCreate2)) {
            return new SecP256R1FieldElement(iArrCreate);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.square(this.f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat256.create();
        SecP256R1Field.subtract(this.f20212x, ((SecP256R1FieldElement) eCFieldElement).f20212x, iArrCreate);
        return new SecP256R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat256.getBit(this.f20212x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat256.toBigInteger(this.f20212x);
    }

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f20212x = SecP256R1Field.fromBigInteger(bigInteger);
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f20212x = iArr;
    }
}
