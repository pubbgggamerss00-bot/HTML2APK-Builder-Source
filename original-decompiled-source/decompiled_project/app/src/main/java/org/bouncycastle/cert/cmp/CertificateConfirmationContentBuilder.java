package org.bouncycastle.cert.cmp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertConfirmContent;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculatorProvider;

/* loaded from: classes2.dex */
public class CertificateConfirmationContentBuilder {
    private List<CMPCertificate> acceptedCerts;
    private List<ASN1Integer> acceptedReqIds;
    private List<AlgorithmIdentifier> acceptedSignatureAlgorithms;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateConfirmationContentBuilder() {
        this(new DefaultDigestAlgorithmIdentifierFinder());
    }

    public CertificateConfirmationContentBuilder addAcceptedCertificate(CMPCertificate cMPCertificate, AlgorithmIdentifier algorithmIdentifier, ASN1Integer aSN1Integer) {
        this.acceptedCerts.add(cMPCertificate);
        this.acceptedSignatureAlgorithms.add(algorithmIdentifier);
        this.acceptedReqIds.add(aSN1Integer);
        return this;
    }

    public CertificateConfirmationContent build(DigestCalculatorProvider digestCalculatorProvider) throws CMPException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.acceptedCerts.size());
        for (int i10 = 0; i10 != this.acceptedCerts.size(); i10++) {
            aSN1EncodableVector.add(new CertStatus(CMPUtil.calculateCertHash(this.acceptedCerts.get(i10), this.acceptedSignatureAlgorithms.get(i10), digestCalculatorProvider, this.digestAlgFinder), this.acceptedReqIds.get(i10)));
        }
        return new CertificateConfirmationContent(CertConfirmContent.getInstance(new DERSequence(aSN1EncodableVector)), this.digestAlgFinder);
    }

    public CertificateConfirmationContentBuilder(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.acceptedCerts = new ArrayList();
        this.acceptedSignatureAlgorithms = new ArrayList();
        this.acceptedReqIds = new ArrayList();
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
    }

    public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) {
        return addAcceptedCertificate(x509CertificateHolder, new ASN1Integer(bigInteger));
    }

    public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder x509CertificateHolder, ASN1Integer aSN1Integer) {
        return addAcceptedCertificate(new CMPCertificate(x509CertificateHolder.toASN1Structure()), x509CertificateHolder.getSignatureAlgorithm(), aSN1Integer);
    }
}
