package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.crmf.CertReqMessages;
import org.bouncycastle.asn1.crmf.CertReqMsg;

/* loaded from: classes2.dex */
public class CertificateReqMessages {
    private final CertReqMsg[] reqs;

    public CertificateReqMessages(CertReqMessages certReqMessages) {
        this.reqs = certReqMessages.toCertReqMsgArray();
    }

    public static CertificateReqMessages fromPKIBody(PKIBody pKIBody) {
        if (isCertificateRequestMessages(pKIBody.getType())) {
            return new CertificateReqMessages(CertReqMessages.getInstance(pKIBody.getContent()));
        }
        throw new IllegalArgumentException("content of PKIBody wrong type: " + pKIBody.getType());
    }

    public static boolean isCertificateRequestMessages(int i10) {
        return i10 == 0 || i10 == 2 || i10 == 7 || i10 == 9 || i10 == 13;
    }

    public CertificateRequestMessage[] getRequests() {
        int length = this.reqs.length;
        CertificateRequestMessage[] certificateRequestMessageArr = new CertificateRequestMessage[length];
        for (int i10 = 0; i10 != length; i10++) {
            certificateRequestMessageArr[i10] = new CertificateRequestMessage(this.reqs[i10]);
        }
        return certificateRequestMessageArr;
    }

    public CertReqMessages toASN1Structure() {
        return new CertReqMessages(this.reqs);
    }
}
