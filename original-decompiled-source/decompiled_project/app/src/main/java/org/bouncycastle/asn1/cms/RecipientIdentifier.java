package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import p.i0;

/* loaded from: classes2.dex */
public class RecipientIdentifier extends ASN1Object implements ASN1Choice {

    /* renamed from: id, reason: collision with root package name */
    private ASN1Encodable f19820id;

    public RecipientIdentifier(ASN1OctetString aSN1OctetString) {
        this.f19820id = new DERTaggedObject(false, 0, (ASN1Encodable) aSN1OctetString);
    }

    public static RecipientIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof RecipientIdentifier)) {
            return (RecipientIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new RecipientIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new RecipientIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new RecipientIdentifier((ASN1Primitive) obj);
        }
        throw new IllegalArgumentException(i0.a(obj, "Illegal object in RecipientIdentifier: "));
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f19820id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : IssuerAndSerialNumber.getInstance(aSN1Encodable);
    }

    public boolean isTagged() {
        return this.f19820id instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f19820id.toASN1Primitive();
    }

    public RecipientIdentifier(ASN1Primitive aSN1Primitive) {
        this.f19820id = aSN1Primitive;
    }

    public RecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f19820id = issuerAndSerialNumber;
    }
}
