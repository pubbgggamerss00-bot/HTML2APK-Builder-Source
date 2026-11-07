package org.bouncycastle.asn1.x500.style;

import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: classes2.dex */
public class BCStrictStyle extends BCStyle {
    public static final X500NameStyle INSTANCE = new BCStrictStyle();

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle, org.bouncycastle.asn1.x500.X500NameStyle
    public boolean areEqual(X500Name x500Name, X500Name x500Name2) {
        if (x500Name.size() != x500Name2.size()) {
            return false;
        }
        RDN[] rDNs = x500Name.getRDNs();
        RDN[] rDNs2 = x500Name2.getRDNs();
        for (int i10 = 0; i10 != rDNs.length; i10++) {
            if (!rdnAreEqual(rDNs[i10], rDNs2[i10])) {
                return false;
            }
        }
        return true;
    }
}
