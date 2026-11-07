package org.bouncycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
class PKMACValueVerifier {
    private final PKMACBuilder builder;

    public PKMACValueVerifier(PKMACBuilder pKMACBuilder) {
        this.builder = pKMACBuilder;
    }

    public boolean isValid(PKMACValue pKMACValue, char[] cArr, SubjectPublicKeyInfo subjectPublicKeyInfo) throws CRMFException, IOException {
        this.builder.setParameters(PBMParameter.getInstance(pKMACValue.getAlgId().getParameters()));
        MacCalculator macCalculatorBuild = this.builder.build(cArr);
        OutputStream outputStream = macCalculatorBuild.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return Arrays.constantTimeAreEqual(macCalculatorBuild.getMac(), pKMACValue.getValue().getOctets());
        } catch (IOException e10) {
            throw new CRMFException(b.a(e10, new StringBuilder("exception encoding mac input: ")), e10);
        }
    }
}
