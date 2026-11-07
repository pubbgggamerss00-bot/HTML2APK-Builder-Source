package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* loaded from: classes3.dex */
public class DeltaCertificateRequestAttributeValue implements ASN1Encodable {
    private final ASN1Sequence attrSeq;
    private final Extensions extensions;
    private final AlgorithmIdentifier signatureAlgorithm;
    private final X500Name subject;
    private final SubjectPublicKeyInfo subjectPKInfo;

    public DeltaCertificateRequestAttributeValue(ASN1Sequence aSN1Sequence) {
        int i10;
        AlgorithmIdentifier algorithmIdentifier;
        this.attrSeq = aSN1Sequence;
        Extensions extensions = null;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.subject = X500Name.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0)), true);
            i10 = 1;
        } else {
            this.subject = null;
            i10 = 0;
        }
        this.subjectPKInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        int i11 = i10 + 1;
        if (i11 != aSN1Sequence.size()) {
            algorithmIdentifier = null;
            while (i11 < aSN1Sequence.size()) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i11));
                if (aSN1TaggedObject.getTagNo() == 1) {
                    extensions = Extensions.getInstance(aSN1TaggedObject, false);
                } else {
                    if (aSN1TaggedObject.getTagNo() != 2) {
                        throw new IllegalArgumentException("unknown tag");
                    }
                    algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                }
                i11++;
            }
        } else {
            algorithmIdentifier = null;
        }
        this.extensions = extensions;
        this.signatureAlgorithm = algorithmIdentifier;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public X500Name getSubject() {
        return this.subject;
    }

    public SubjectPublicKeyInfo getSubjectPKInfo() {
        return this.subjectPKInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.attrSeq;
    }

    public DeltaCertificateRequestAttributeValue(Attribute attribute) {
        this(ASN1Sequence.getInstance(attribute.getAttributeValues()[0]));
    }
}
