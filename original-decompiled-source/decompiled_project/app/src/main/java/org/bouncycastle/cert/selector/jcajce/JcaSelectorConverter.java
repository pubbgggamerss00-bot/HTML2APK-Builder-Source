package org.bouncycastle.cert.selector.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: classes2.dex */
public class JcaSelectorConverter {
    public X509CertificateHolderSelector getCertificateHolderSelector(X509CertSelector x509CertSelector) {
        try {
            X500Name x500Name = X500Name.getInstance(x509CertSelector.getIssuerAsBytes());
            BigInteger serialNumber = x509CertSelector.getSerialNumber();
            byte[] subjectKeyIdentifier = x509CertSelector.getSubjectKeyIdentifier();
            return new X509CertificateHolderSelector(x500Name, serialNumber, subjectKeyIdentifier != null ? ASN1OctetString.getInstance(subjectKeyIdentifier).getOctets() : null);
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.a(e10, new StringBuilder("unable to convert issuer: ")));
        }
    }
}
