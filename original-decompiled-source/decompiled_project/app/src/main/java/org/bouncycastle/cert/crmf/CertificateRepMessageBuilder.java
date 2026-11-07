package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertRepMessage;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: classes2.dex */
public class CertificateRepMessageBuilder {
    private final CMPCertificate[] caCerts;
    private final List<CertResponse> responses = new ArrayList();

    public CertificateRepMessageBuilder(X509CertificateHolder... x509CertificateHolderArr) {
        this.caCerts = new CMPCertificate[x509CertificateHolderArr.length];
        for (int i10 = 0; i10 != x509CertificateHolderArr.length; i10++) {
            this.caCerts[i10] = new CMPCertificate(x509CertificateHolderArr[i10].toASN1Structure());
        }
    }

    public CertificateRepMessageBuilder addCertificateResponse(CertificateResponse certificateResponse) {
        this.responses.add(certificateResponse.toASN1Structure());
        return this;
    }

    public CertificateRepMessage build() {
        CMPCertificate[] cMPCertificateArr = this.caCerts;
        CertRepMessage certRepMessage = cMPCertificateArr.length != 0 ? new CertRepMessage(cMPCertificateArr, (CertResponse[]) this.responses.toArray(new CertResponse[0])) : new CertRepMessage(null, (CertResponse[]) this.responses.toArray(new CertResponse[0]));
        this.responses.clear();
        return new CertificateRepMessage(certRepMessage);
    }
}
