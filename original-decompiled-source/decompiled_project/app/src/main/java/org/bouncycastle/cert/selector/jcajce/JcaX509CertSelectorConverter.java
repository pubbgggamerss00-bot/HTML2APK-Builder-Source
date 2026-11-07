package org.bouncycastle.cert.selector.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes2.dex */
public class JcaX509CertSelectorConverter {
    public X509CertSelector doConversion(X500Name x500Name, BigInteger bigInteger, byte[] bArr) throws IOException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        if (x500Name != null) {
            try {
                x509CertSelector.setIssuer(x500Name.getEncoded());
            } catch (IOException e10) {
                throw Exceptions.illegalArgumentException("unable to convert issuer: " + e10.getMessage(), e10);
            }
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(bigInteger);
        }
        if (bArr == null) {
            return x509CertSelector;
        }
        try {
            x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(bArr).getEncoded());
            return x509CertSelector;
        } catch (IOException e11) {
            throw Exceptions.illegalArgumentException("unable to convert subjectKeyIdentifier: " + e11.getMessage(), e11);
        }
    }

    public X509CertSelector getCertSelector(X509CertificateHolderSelector x509CertificateHolderSelector) {
        return doConversion(x509CertificateHolderSelector.getIssuer(), x509CertificateHolderSelector.getSerialNumber(), x509CertificateHolderSelector.getSubjectKeyIdentifier());
    }
}
