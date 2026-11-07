package org.bouncycastle.cms;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import v5.b;

/* loaded from: classes2.dex */
public class DefaultCMSSignatureAlgorithmNameGenerator implements CMSSignatureAlgorithmNameGenerator {
    private final Map digestAlgs;
    private final Map encryptionAlgs;
    private final Map simpleAlgs;

    public DefaultCMSSignatureAlgorithmNameGenerator() {
        HashMap map = new HashMap();
        this.encryptionAlgs = map;
        HashMap map2 = new HashMap();
        this.digestAlgs = map2;
        HashMap map3 = new HashMap();
        this.simpleAlgs = map3;
        addEntries(NISTObjectIdentifiers.dsa_with_sha224, "SHA224", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha256, "SHA256", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha384, "SHA384", "DSA");
        addEntries(NISTObjectIdentifiers.dsa_with_sha512, "SHA512", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, "SHA3-224", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, "SHA3-256", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, "SHA3-384", "DSA");
        addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, "SHA3-512", "DSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        addEntries(aSN1ObjectIdentifier, "SHA3-224", "RSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        addEntries(aSN1ObjectIdentifier2, "SHA3-256", "RSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        addEntries(aSN1ObjectIdentifier3, "SHA3-384", "RSA");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        addEntries(aSN1ObjectIdentifier4, "SHA3-512", "RSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "SHA3-224", "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, "SHA3-256", "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "SHA3-384", "ECDSA");
        addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "SHA3-512", "ECDSA");
        addEntries(OIWObjectIdentifiers.dsaWithSHA1, "SHA1", "DSA");
        addEntries(OIWObjectIdentifiers.md4WithRSA, "MD4", "RSA");
        addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
        addEntries(OIWObjectIdentifiers.md5WithRSA, "MD5", "RSA");
        addEntries(OIWObjectIdentifiers.sha1WithRSA, "SHA1", "RSA");
        addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, "MD2", "RSA");
        addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
        addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, "MD5", "RSA");
        addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, "SHA1", "RSA");
        addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224", "RSA");
        addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256", "RSA");
        addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384", "RSA");
        addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512", "RSA");
        addEntries(PKCSObjectIdentifiers.sha512_224WithRSAEncryption, "SHA512(224)", "RSA");
        addEntries(PKCSObjectIdentifiers.sha512_256WithRSAEncryption, "SHA512(256)", "RSA");
        addEntries(aSN1ObjectIdentifier, "SHA3-224", "RSA");
        addEntries(aSN1ObjectIdentifier2, "SHA3-256", "RSA");
        addEntries(aSN1ObjectIdentifier3, "SHA3-384", "RSA");
        addEntries(aSN1ObjectIdentifier4, "SHA3-512", "RSA");
        addEntries(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, "SHAKE128", "RSAPSS");
        addEntries(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, "SHAKE256", "RSAPSS");
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128", "RSA");
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160", "RSA");
        addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256", "RSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384", "ECDSA");
        addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512", "ECDSA");
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake128, "SHAKE128", "ECDSA");
        addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake256, "SHAKE256", "ECDSA");
        addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1", "DSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512", "ECDSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "SHA1", "RSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "SHA256", "RSA");
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, "SHA1", "RSAandMGF1");
        addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, "SHA256", "RSAandMGF1");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, "SHA3-224", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, "SHA3-256", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, "SHA3-384", "PLAIN-ECDSA");
        addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, "SHA3-512", "PLAIN-ECDSA");
        addEntries(GMObjectIdentifiers.sm2sign_with_sha256, "SHA256", "SM2");
        addEntries(GMObjectIdentifiers.sm2sign_with_sm3, "SM3", "SM2");
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA512, "SHA512", "SPHINCS256");
        addEntries(BCObjectIdentifiers.sphincs256_with_SHA3_512, "SHA3-512", "SPHINCS256");
        addEntries(BCObjectIdentifiers.picnic_with_shake256, "SHAKE256", "Picnic");
        addEntries(BCObjectIdentifiers.picnic_with_sha512, "SHA512", "Picnic");
        addEntries(BCObjectIdentifiers.picnic_with_sha3_512, "SHA3-512", "Picnic");
        map.put(X9ObjectIdentifiers.id_dsa, "DSA");
        map.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
        map.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
        map.put(X509ObjectIdentifiers.id_ea_rsa, "RSA");
        map.put(PKCSObjectIdentifiers.id_RSASSA_PSS, "RSAandMGF1");
        map.put(CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
        map.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        map.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
        map.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
        map.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
        map.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
        map.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
        map.put(X9ObjectIdentifiers.id_ecPublicKey, "ECDSA");
        map2.put(PKCSObjectIdentifiers.md2, "MD2");
        map2.put(PKCSObjectIdentifiers.md4, "MD4");
        map2.put(PKCSObjectIdentifiers.md5, "MD5");
        map2.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map2.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map2.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map2.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map2.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map2.put(NISTObjectIdentifiers.id_sha512_224, "SHA512(224)");
        map2.put(NISTObjectIdentifiers.id_sha512_256, "SHA512(256)");
        map2.put(NISTObjectIdentifiers.id_shake128, "SHAKE128");
        map2.put(NISTObjectIdentifiers.id_shake256, "SHAKE256");
        map2.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
        map2.put(NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
        map2.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
        map2.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
        map2.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map2.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map2.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map2.put(CryptoProObjectIdentifiers.gostR3411, "GOST3411");
        map2.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.2.1"), "GOST3411");
        map2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, "GOST3411-2012-256");
        map2.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, "GOST3411-2012-512");
        map2.put(GMObjectIdentifiers.sm3, "SM3");
        map3.put(EdECObjectIdentifiers.id_Ed25519, EdDSAParameterSpec.Ed25519);
        map3.put(EdECObjectIdentifiers.id_Ed448, EdDSAParameterSpec.Ed448);
        map3.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, "LMS");
        map3.put(MiscObjectIdentifiers.id_alg_composite, "COMPOSITE");
        map3.put(BCObjectIdentifiers.falcon_512, "Falcon-512");
        map3.put(BCObjectIdentifiers.falcon_1024, "Falcon-1024");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.dilithium2;
        map3.put(aSN1ObjectIdentifier5, "Dilithium2");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.dilithium3;
        map3.put(aSN1ObjectIdentifier6, "Dilithium3");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.dilithium5;
        map3.put(aSN1ObjectIdentifier7, "Dilithium5");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_128s, "SPHINCS+-SHA2-128s");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_128f, "SPHINCS+-SHA2-128f");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_192s, "SPHINCS+-SHA2-192s");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_192f, "SPHINCS+-SHA2-192f");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_256s, "SPHINCS+-SHA2-256s");
        map3.put(BCObjectIdentifiers.sphincsPlus_sha2_256f, "SPHINCS+-SHA2-256f");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_128s, "SPHINCS+-SHAKE-128s");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_128f, "SPHINCS+-SHAKE-128f");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_192s, "SPHINCS+-SHAKE-192s");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_192f, "SPHINCS+-SHAKE-192f");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_256s, "SPHINCS+-SHAKE-256s");
        map3.put(BCObjectIdentifiers.sphincsPlus_shake_256f, "SPHINCS+-SHAKE-256f");
        map3.put(aSN1ObjectIdentifier5, "Dilithium2");
        map3.put(aSN1ObjectIdentifier6, "Dilithium3");
        map3.put(aSN1ObjectIdentifier7, "Dilithium5");
        map3.put(BCObjectIdentifiers.picnic_signature, "Picnic");
    }

    private void addEntries(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, String str2) {
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
        this.encryptionAlgs.put(aSN1ObjectIdentifier, str2);
    }

    private String getDigestAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) this.digestAlgs.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private String getEncryptionAlgName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) this.encryptionAlgs.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    @Override // org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator
    public String getSignatureName(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier2.getAlgorithm();
        String str = (String) this.simpleAlgs.get(algorithm);
        if (str != null) {
            return str;
        }
        if (algorithm.on(BCObjectIdentifiers.sphincsPlus)) {
            return "SPHINCSPlus";
        }
        String digestAlgName = getDigestAlgName(algorithm);
        if (!digestAlgName.equals(algorithm.getId())) {
            StringBuilder sbA = b.a(digestAlgName, "with");
            sbA.append(getEncryptionAlgName(algorithm));
            return sbA.toString();
        }
        return getDigestAlgName(algorithmIdentifier.getAlgorithm()) + "with" + getEncryptionAlgName(algorithm);
    }

    public void setSigningDigestAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.digestAlgs.put(aSN1ObjectIdentifier, str);
    }

    public void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.encryptionAlgs.put(aSN1ObjectIdentifier, str);
    }
}
