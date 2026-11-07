package org.bouncycastle.pkcs;

import java.io.IOException;
import java.io.OutputStream;
import k4.i;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: classes3.dex */
class MacDataGenerator {
    private PKCS12MacCalculatorBuilder builder;

    public MacDataGenerator(PKCS12MacCalculatorBuilder pKCS12MacCalculatorBuilder) {
        this.builder = pKCS12MacCalculatorBuilder;
    }

    public MacData build(char[] cArr, byte[] bArr) throws IOException, PKCSException {
        try {
            MacCalculator macCalculatorBuild = this.builder.build(cArr);
            OutputStream outputStream = macCalculatorBuild.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            AlgorithmIdentifier algorithmIdentifier = macCalculatorBuild.getAlgorithmIdentifier();
            DigestInfo digestInfo = new DigestInfo(this.builder.getDigestAlgorithmIdentifier(), macCalculatorBuild.getMac());
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            return new MacData(digestInfo, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        } catch (Exception e10) {
            throw new PKCSException(i.a(e10, new StringBuilder("unable to process data: ")), e10);
        }
    }
}
