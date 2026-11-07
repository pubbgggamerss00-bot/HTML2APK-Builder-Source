package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes2.dex */
public class OOBCertHash extends ASN1Object {
    private final CertId certId;
    private final AlgorithmIdentifier hashAlg;
    private final ASN1BitString hashVal;

    private OOBCertHash(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        int i10 = size - 1;
        this.hashVal = ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i10));
        AlgorithmIdentifier algorithmIdentifier = null;
        CertId certId = null;
        for (int i11 = size - 2; i11 >= 0; i11--) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i11);
            if (aSN1TaggedObject.hasContextTag(0)) {
                algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, true);
            } else {
                if (!aSN1TaggedObject.hasContextTag(1)) {
                    throw new IllegalArgumentException("unknown tag " + ASN1Util.getTagText(aSN1TaggedObject));
                }
                certId = CertId.getInstance(aSN1TaggedObject, true);
            }
        }
        this.hashAlg = algorithmIdentifier;
        this.certId = certId;
    }

    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i10, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, i10, aSN1Encodable));
        }
    }

    public static OOBCertHash getInstance(Object obj) {
        if (obj instanceof OOBCertHash) {
            return (OOBCertHash) obj;
        }
        if (obj != null) {
            return new OOBCertHash(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertId getCertId() {
        return this.certId;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.hashAlg;
    }

    public ASN1BitString getHashVal() {
        return this.hashVal;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        addOptional(aSN1EncodableVector, 0, this.hashAlg);
        addOptional(aSN1EncodableVector, 1, this.certId);
        aSN1EncodableVector.add(this.hashVal);
        return new DERSequence(aSN1EncodableVector);
    }

    public OOBCertHash(AlgorithmIdentifier algorithmIdentifier, CertId certId, DERBitString dERBitString) {
        this.hashAlg = algorithmIdentifier;
        this.certId = certId;
        this.hashVal = dERBitString;
    }

    public OOBCertHash(AlgorithmIdentifier algorithmIdentifier, CertId certId, byte[] bArr) {
        this(algorithmIdentifier, certId, new DERBitString(bArr));
    }
}
