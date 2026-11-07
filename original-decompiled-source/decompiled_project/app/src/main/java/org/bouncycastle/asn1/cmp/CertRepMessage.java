package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes2.dex */
public class CertRepMessage extends ASN1Object {
    private final ASN1Sequence caPubs;
    private final ASN1Sequence response;

    private CertRepMessage(ASN1Sequence aSN1Sequence) {
        int i10 = 0;
        if (aSN1Sequence.size() > 1) {
            this.caPubs = ASN1Sequence.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 1;
        } else {
            this.caPubs = null;
        }
        this.response = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10));
    }

    public static CertRepMessage getInstance(Object obj) {
        if (obj instanceof CertRepMessage) {
            return (CertRepMessage) obj;
        }
        if (obj != null) {
            return new CertRepMessage(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CMPCertificate[] getCaPubs() {
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i10 = 0; i10 != size; i10++) {
            cMPCertificateArr[i10] = CMPCertificate.getInstance(this.caPubs.getObjectAt(i10));
        }
        return cMPCertificateArr;
    }

    public CertResponse[] getResponse() {
        int size = this.response.size();
        CertResponse[] certResponseArr = new CertResponse[size];
        for (int i10 = 0; i10 != size; i10++) {
            certResponseArr[i10] = CertResponse.getInstance(this.response.getObjectAt(i10));
        }
        return certResponseArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Sequence aSN1Sequence = this.caPubs;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.response);
        return new DERSequence(aSN1EncodableVector);
    }

    public CertRepMessage(CMPCertificate[] cMPCertificateArr, CertResponse[] certResponseArr) {
        if (certResponseArr == null) {
            throw new IllegalArgumentException("'response' cannot be null");
        }
        if (cMPCertificateArr == null || cMPCertificateArr.length == 0) {
            this.caPubs = null;
        } else {
            this.caPubs = new DERSequence(cMPCertificateArr);
        }
        this.response = new DERSequence(certResponseArr);
    }
}
