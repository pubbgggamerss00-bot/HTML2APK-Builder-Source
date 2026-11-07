package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertOrEncCert;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.asn1.cmp.CertifiedKeyPair;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.crmf.EncryptedKey;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSEnvelopedData;

/* loaded from: classes2.dex */
public class CertificateResponseBuilder {
    private CertifiedKeyPair certKeyPair;
    private final ASN1Integer certReqId;
    private ASN1OctetString rspInfo;
    private final PKIStatusInfo statusInfo;

    public CertificateResponseBuilder(ASN1Integer aSN1Integer, PKIStatusInfo pKIStatusInfo) {
        this.certReqId = aSN1Integer;
        this.statusInfo = pKIStatusInfo;
    }

    public CertificateResponse build() {
        return new CertificateResponse(new CertResponse(this.certReqId, this.statusInfo, this.certKeyPair, this.rspInfo));
    }

    public CertificateResponseBuilder withCertificate(CMPCertificate cMPCertificate) {
        if (this.certKeyPair != null) {
            throw new IllegalStateException("certificate in response already set");
        }
        this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(cMPCertificate));
        return this;
    }

    public CertificateResponseBuilder withResponseInfo(byte[] bArr) {
        if (this.rspInfo != null) {
            throw new IllegalStateException("response info already set");
        }
        this.rspInfo = new DEROctetString(bArr);
        return this;
    }

    public CertificateResponseBuilder withCertificate(X509CertificateHolder x509CertificateHolder) {
        if (this.certKeyPair != null) {
            throw new IllegalStateException("certificate in response already set");
        }
        this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(new CMPCertificate(x509CertificateHolder.toASN1Structure())));
        return this;
    }

    public CertificateResponseBuilder withCertificate(CMSEnvelopedData cMSEnvelopedData) {
        if (this.certKeyPair != null) {
            throw new IllegalStateException("certificate in response already set");
        }
        this.certKeyPair = new CertifiedKeyPair(new CertOrEncCert(new EncryptedKey(EnvelopedData.getInstance(cMSEnvelopedData.toASN1Structure().getContent()))));
        return this;
    }
}
