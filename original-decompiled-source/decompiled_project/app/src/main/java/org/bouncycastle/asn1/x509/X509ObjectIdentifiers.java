package org.bouncycastle.asn1.x509;

import b.o;
import com.android.apksig.internal.oid.OidConstants;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes2.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier crlAccessMethod;
    public static final ASN1ObjectIdentifier id_PasswordBasedMac;
    public static final ASN1ObjectIdentifier id_ad;
    public static final ASN1ObjectIdentifier id_ad_caIssuers;
    public static final ASN1ObjectIdentifier id_ad_ocsp;
    public static final ASN1ObjectIdentifier id_ce;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake128;
    public static final ASN1ObjectIdentifier id_ecdsa_with_shake256;
    public static final ASN1ObjectIdentifier id_pe;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake128;
    public static final ASN1ObjectIdentifier id_rsassa_pss_shake256;
    public static final ASN1ObjectIdentifier ocspAccessMethod;
    public static final ASN1ObjectIdentifier commonName = o.c("2.5.4.3");
    public static final ASN1ObjectIdentifier countryName = o.c("2.5.4.6");
    public static final ASN1ObjectIdentifier localityName = o.c("2.5.4.7");
    public static final ASN1ObjectIdentifier stateOrProvinceName = o.c("2.5.4.8");
    public static final ASN1ObjectIdentifier organization = o.c("2.5.4.10");
    public static final ASN1ObjectIdentifier organizationalUnitName = o.c("2.5.4.11");
    public static final ASN1ObjectIdentifier id_at_telephoneNumber = o.c("2.5.4.20");
    public static final ASN1ObjectIdentifier id_at_name = o.c("2.5.4.41");
    public static final ASN1ObjectIdentifier id_at_organizationIdentifier = o.c("2.5.4.97");
    public static final ASN1ObjectIdentifier id_SHA1 = o.c(OidConstants.OID_DIGEST_SHA1);
    public static final ASN1ObjectIdentifier ripemd160 = o.c("1.3.36.3.2.1");
    public static final ASN1ObjectIdentifier ripemd160WithRSAEncryption = o.c("1.3.36.3.3.1.2");
    public static final ASN1ObjectIdentifier id_ea_rsa = o.c("2.5.8.1.1");

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_rsassa_pss_shake128 = aSN1ObjectIdentifier.branch("6.30");
        id_rsassa_pss_shake256 = aSN1ObjectIdentifier.branch("6.31");
        id_ecdsa_with_shake128 = aSN1ObjectIdentifier.branch("6.32");
        id_ecdsa_with_shake256 = aSN1ObjectIdentifier.branch("6.33");
        id_pe = aSN1ObjectIdentifier.branch("1");
        id_ce = new ASN1ObjectIdentifier("2.5.29");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("48");
        id_ad = aSN1ObjectIdentifierBranch;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern = aSN1ObjectIdentifierBranch.branch("2").intern();
        id_ad_caIssuers = aSN1ObjectIdentifierIntern;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern2 = aSN1ObjectIdentifierBranch.branch("1").intern();
        id_ad_ocsp = aSN1ObjectIdentifierIntern2;
        ocspAccessMethod = aSN1ObjectIdentifierIntern2;
        crlAccessMethod = aSN1ObjectIdentifierIntern;
        id_PasswordBasedMac = new ASN1ObjectIdentifier("1.2.840.113533.7.66.13");
    }
}
