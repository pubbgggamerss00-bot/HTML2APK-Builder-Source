package org.bouncycastle.asn1.eac;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes2.dex */
class EACTagged {
    public static ASN1TaggedObject create(int i10, ASN1Sequence aSN1Sequence) {
        return new DERTaggedObject(false, 64, i10, (ASN1Encodable) aSN1Sequence);
    }

    public static ASN1TaggedObject create(int i10, PublicKeyDataObject publicKeyDataObject) {
        return new DERTaggedObject(false, 64, i10, (ASN1Encodable) publicKeyDataObject);
    }

    public static ASN1TaggedObject create(int i10, byte[] bArr) {
        return new DERTaggedObject(false, 64, i10, (ASN1Encodable) new DEROctetString(bArr));
    }
}
