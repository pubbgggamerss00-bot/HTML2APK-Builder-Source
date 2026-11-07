package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes3.dex */
public class Point256 extends ASN1Object {

    /* renamed from: x, reason: collision with root package name */
    private final ASN1OctetString f20272x;

    /* renamed from: y, reason: collision with root package name */
    private final ASN1OctetString f20273y;

    public static class Builder {

        /* renamed from: x, reason: collision with root package name */
        private ASN1OctetString f20274x;

        /* renamed from: y, reason: collision with root package name */
        private ASN1OctetString f20275y;

        public Point256 createPoint256() {
            return new Point256(this.f20274x, this.f20275y);
        }

        public Builder setX(BigInteger bigInteger) {
            return setX(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setY(BigInteger bigInteger) {
            return setY(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.f20274x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.f20275y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.f20274x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.f20275y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point256(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString == null || aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException("x must be 32 bytes long");
        }
        if (aSN1OctetString2 == null || aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException("y must be 32 bytes long");
        }
        this.f20272x = aSN1OctetString;
        this.f20273y = aSN1OctetString2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point256 getInstance(Object obj) {
        if (obj instanceof Point256) {
            return (Point256) obj;
        }
        if (obj != null) {
            return new Point256(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.f20272x;
    }

    public ASN1OctetString getY() {
        return this.f20273y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f20272x, this.f20273y});
    }

    private Point256(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.f20272x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f20273y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException("x must be 32 bytes long");
        }
        if (aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException("y must be 32 bytes long");
        }
    }
}
