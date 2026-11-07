package org.bouncycastle.cert.dane;

import j2.y;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes2.dex */
public class DANEEntryFactory {
    private final DANEEntrySelectorFactory selectorFactory;

    public DANEEntryFactory(DigestCalculator digestCalculator) {
        this.selectorFactory = new DANEEntrySelectorFactory(digestCalculator);
    }

    public DANEEntry createEntry(String str, int i10, X509CertificateHolder x509CertificateHolder) throws DANEException {
        if (i10 < 0 || i10 > 3) {
            throw new DANEException(y.a(i10, "unknown certificate usage: "));
        }
        return new DANEEntry(this.selectorFactory.createSelector(str).getDomainName(), new byte[]{(byte) i10, 0, 0}, x509CertificateHolder);
    }

    public DANEEntry createEntry(String str, X509CertificateHolder x509CertificateHolder) throws DANEException {
        return createEntry(str, 3, x509CertificateHolder);
    }
}
