package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class EciesP256EncryptedKey extends ASN1Object {

    /* renamed from: c, reason: collision with root package name */
    private final ASN1OctetString f20265c;

    /* renamed from: t, reason: collision with root package name */
    private final ASN1OctetString f20266t;

    /* renamed from: v, reason: collision with root package name */
    private final EccP256CurvePoint f20267v;

    public static class Builder {

        /* renamed from: c, reason: collision with root package name */
        private ASN1OctetString f20268c;

        /* renamed from: t, reason: collision with root package name */
        private ASN1OctetString f20269t;

        /* renamed from: v, reason: collision with root package name */
        private EccP256CurvePoint f20270v;

        public EciesP256EncryptedKey createEciesP256EncryptedKey() {
            return new EciesP256EncryptedKey(this.f20270v, this.f20268c, this.f20269t);
        }

        public Builder setC(ASN1OctetString aSN1OctetString) {
            this.f20268c = aSN1OctetString;
            return this;
        }

        public Builder setT(ASN1OctetString aSN1OctetString) {
            this.f20269t = aSN1OctetString;
            return this;
        }

        public Builder setV(EccP256CurvePoint eccP256CurvePoint) {
            this.f20270v = eccP256CurvePoint;
            return this;
        }

        public Builder setC(byte[] bArr) {
            this.f20268c = new DEROctetString(Arrays.clone(bArr));
            return this;
        }

        public Builder setT(byte[] bArr) {
            this.f20269t = new DEROctetString(Arrays.clone(bArr));
            return this;
        }
    }

    private EciesP256EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("expected sequence size of 3");
        }
        this.f20267v = EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0));
        this.f20265c = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f20266t = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EciesP256EncryptedKey getInstance(Object obj) {
        if (obj instanceof EciesP256EncryptedKey) {
            return (EciesP256EncryptedKey) obj;
        }
        if (obj != null) {
            return new EciesP256EncryptedKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getC() {
        return this.f20265c;
    }

    public ASN1OctetString getT() {
        return this.f20266t;
    }

    public EccP256CurvePoint getV() {
        return this.f20267v;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f20267v, this.f20265c, this.f20266t});
    }

    public EciesP256EncryptedKey(EccP256CurvePoint eccP256CurvePoint, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.f20267v = eccP256CurvePoint;
        this.f20265c = aSN1OctetString;
        this.f20266t = aSN1OctetString2;
    }
}
