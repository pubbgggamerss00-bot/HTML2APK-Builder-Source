package org.bouncycastle.cert.crmf;

import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertRepMessage;
import org.bouncycastle.asn1.cmp.CertResponse;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: classes2.dex */
public class CertificateRepMessage {
    private final CMPCertificate[] caCerts;
    private final CertResponse[] resps;

    public CertificateRepMessage(CertRepMessage certRepMessage) {
        this.resps = certRepMessage.getResponse();
        this.caCerts = certRepMessage.getCaPubs();
    }

    public static CertificateRepMessage fromPKIBody(PKIBody pKIBody) {
        if (isCertificateRepMessage(pKIBody.getType())) {
            return new CertificateRepMessage(CertRepMessage.getInstance(pKIBody.getContent()));
        }
        throw new IllegalArgumentException("content of PKIBody wrong type: " + pKIBody.getType());
    }

    public static boolean isCertificateRepMessage(int i10) {
        return i10 == 1 || i10 == 3 || i10 == 8 || i10 == 14;
    }

    public CMPCertificate[] getCMPCertificates() {
        CMPCertificate[] cMPCertificateArr = this.caCerts;
        int length = cMPCertificateArr.length;
        CMPCertificate[] cMPCertificateArr2 = new CMPCertificate[length];
        System.arraycopy(cMPCertificateArr, 0, cMPCertificateArr2, 0, length);
        return cMPCertificateArr2;
    }

    public CertificateResponse[] getResponses() {
        int length = this.resps.length;
        CertificateResponse[] certificateResponseArr = new CertificateResponse[length];
        for (int i10 = 0; i10 != length; i10++) {
            certificateResponseArr[i10] = new CertificateResponse(this.resps[i10]);
        }
        return certificateResponseArr;
    }

    public X509CertificateHolder[] getX509Certificates() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            CMPCertificate[] cMPCertificateArr = this.caCerts;
            if (i10 == cMPCertificateArr.length) {
                return (X509CertificateHolder[]) arrayList.toArray(new X509CertificateHolder[0]);
            }
            if (cMPCertificateArr[i10].isX509v3PKCert()) {
                arrayList.add(new X509CertificateHolder(this.caCerts[i10].getX509v3PKCert()));
            }
            i10++;
        }
    }

    public boolean isOnlyX509PKCertificates() {
        boolean zIsX509v3PKCert = true;
        int i10 = 0;
        while (true) {
            CMPCertificate[] cMPCertificateArr = this.caCerts;
            if (i10 == cMPCertificateArr.length) {
                return zIsX509v3PKCert;
            }
            zIsX509v3PKCert &= cMPCertificateArr[i10].isX509v3PKCert();
            i10++;
        }
    }

    public CertRepMessage toASN1Structure() {
        return new CertRepMessage(this.caCerts, this.resps);
    }
}
