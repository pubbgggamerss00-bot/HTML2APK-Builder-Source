package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: classes3.dex */
public class DeltaCertificateRequestAttributeValueBuilder {
    private AlgorithmIdentifier signatureAlgorithm;
    private X500Name subject;
    private final SubjectPublicKeyInfo subjectPublicKey;

    public DeltaCertificateRequestAttributeValueBuilder(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.subjectPublicKey = subjectPublicKeyInfo;
    }

    public DeltaCertificateRequestAttributeValue build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        X500Name x500Name = this.subject;
        if (x500Name != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) x500Name));
        }
        aSN1EncodableVector.add(this.subjectPublicKey);
        AlgorithmIdentifier algorithmIdentifier = this.signatureAlgorithm;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) algorithmIdentifier));
        }
        return new DeltaCertificateRequestAttributeValue(new Attribute(new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.2"), new DERSet(new DERSequence(aSN1EncodableVector))));
    }

    public DeltaCertificateRequestAttributeValueBuilder setSignatureAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        this.signatureAlgorithm = algorithmIdentifier;
        return this;
    }

    public DeltaCertificateRequestAttributeValueBuilder setSubject(X500Name x500Name) {
        this.subject = x500Name;
        return this;
    }
}
