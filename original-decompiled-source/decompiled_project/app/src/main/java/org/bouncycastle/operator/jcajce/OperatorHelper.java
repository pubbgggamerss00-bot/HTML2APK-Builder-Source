package org.bouncycastle.operator.jcajce;

import androidx.security.crypto.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
class OperatorHelper {
    private static final Map asymmetricWrapperAlgNames;
    private static final Map oids;
    private static DefaultSignatureNameFinder sigFinder;
    private static final Map symmetricKeyAlgNames;
    private static final Map symmetricWrapperAlgNames;
    private static final Map symmetricWrapperKeySizes;
    private JcaJceHelper helper;

    public static class OpCertificateException extends CertificateException {
        private Throwable cause;

        public OpCertificateException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    static {
        HashMap map = new HashMap();
        oids = map;
        HashMap map2 = new HashMap();
        asymmetricWrapperAlgNames = map2;
        HashMap map3 = new HashMap();
        symmetricWrapperAlgNames = map3;
        HashMap map4 = new HashMap();
        symmetricKeyAlgNames = map4;
        HashMap map5 = new HashMap();
        symmetricWrapperKeySizes = map5;
        sigFinder = new DefaultSignatureNameFinder();
        map.put(OIWObjectIdentifiers.idSHA1, "SHA1");
        map.put(NISTObjectIdentifiers.id_sha224, "SHA224");
        map.put(NISTObjectIdentifiers.id_sha256, "SHA256");
        map.put(NISTObjectIdentifiers.id_sha384, "SHA384");
        map.put(NISTObjectIdentifiers.id_sha512, "SHA512");
        map.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
        map.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
        map.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
        map2.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        map2.put(OIWObjectIdentifiers.elGamalAlgorithm, "Elgamal/ECB/PKCS1Padding");
        map2.put(PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA/ECB/OAEPPadding");
        map2.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
        map3.put(aSN1ObjectIdentifier, "DESEDEWrap");
        map3.put(PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2Wrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
        map3.put(aSN1ObjectIdentifier2, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_wrap;
        map3.put(aSN1ObjectIdentifier3, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_wrap;
        map3.put(aSN1ObjectIdentifier4, "AESWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia128_wrap;
        map3.put(aSN1ObjectIdentifier5, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia192_wrap;
        map3.put(aSN1ObjectIdentifier6, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NTTObjectIdentifiers.id_camellia256_wrap;
        map3.put(aSN1ObjectIdentifier7, "CamelliaWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
        map3.put(aSN1ObjectIdentifier8, "SEEDWrap");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.des_EDE3_CBC;
        map3.put(aSN1ObjectIdentifier9, "DESede");
        map5.put(aSN1ObjectIdentifier, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier2, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier3, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier4, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier5, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier6, Integers.valueOf(192));
        map5.put(aSN1ObjectIdentifier7, Integers.valueOf(256));
        map5.put(aSN1ObjectIdentifier8, Integers.valueOf(128));
        map5.put(aSN1ObjectIdentifier9, Integers.valueOf(192));
        map4.put(NISTObjectIdentifiers.aes, "AES");
        map4.put(NISTObjectIdentifiers.id_aes128_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes192_CBC, "AES");
        map4.put(NISTObjectIdentifiers.id_aes256_CBC, "AES");
        map4.put(aSN1ObjectIdentifier9, "DESede");
        map4.put(PKCSObjectIdentifiers.RC2_CBC, "RC2");
    }

    public OperatorHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String digestName = MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int iIndexOf = digestName.indexOf(45);
        if (iIndexOf <= 0 || digestName.startsWith("SHA3")) {
            return digestName;
        }
        return digestName.substring(0, iIndexOf) + digestName.substring(iIndexOf + 1);
    }

    private static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        return sigFinder.getAlgorithmName(algorithmIdentifier);
    }

    private boolean notDefaultPSSParams(ASN1Sequence aSN1Sequence) throws GeneralSecurityException {
        if (aSN1Sequence != null && aSN1Sequence.size() != 0) {
            RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Sequence);
            if (!rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1) || !rSASSAPSSparams.getHashAlgorithm().equals(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()))) {
                return true;
            }
            if (rSASSAPSSparams.getSaltLength().intValue() != createDigest(rSASSAPSSparams.getHashAlgorithm()).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    public X509Certificate convertCertificate(X509CertificateHolder x509CertificateHolder) throws CertificateException {
        try {
            return (X509Certificate) this.helper.createCertificateFactory("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e10) {
            throw new OpCertificateException(b.a(e10, new StringBuilder("cannot get encoded form of certificate: ")), e10);
        } catch (NoSuchProviderException e11) {
            throw new OpCertificateException("cannot find factory provider: " + e11.getMessage(), e11);
        }
    }

    public PublicKey convertPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws OperatorCreationException {
        try {
            return this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (IOException e10) {
            throw new OperatorCreationException(b.a(e10, new StringBuilder("cannot get encoded form of key: ")), e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new OperatorCreationException("cannot create key factory: " + e11.getMessage(), e11);
        } catch (NoSuchProviderException e12) {
            throw new OperatorCreationException("cannot find factory provider: " + e12.getMessage(), e12);
        } catch (InvalidKeySpecException e13) {
            throw new OperatorCreationException("cannot create key factory: " + e13.getMessage(), e13);
        }
    }

    public AlgorithmParameters createAlgorithmParameters(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException, IOException {
        AlgorithmParameters algorithmParametersCreateAlgorithmParameters;
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.rsaEncryption)) {
            return null;
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSAES_OAEP)) {
            try {
                algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("OAEP");
            } catch (NoSuchAlgorithmException unused) {
            } catch (NoSuchProviderException e10) {
                throw new OperatorCreationException("cannot create algorithm parameters: " + e10.getMessage(), e10);
            }
        } else {
            algorithmParametersCreateAlgorithmParameters = null;
        }
        if (algorithmParametersCreateAlgorithmParameters == null) {
            try {
                algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(algorithmIdentifier.getAlgorithm().getId());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            } catch (NoSuchProviderException e11) {
                throw new OperatorCreationException("cannot create algorithm parameters: " + e11.getMessage(), e11);
            }
        }
        try {
            algorithmParametersCreateAlgorithmParameters.init(algorithmIdentifier.getParameters().toASN1Primitive().getEncoded());
            return algorithmParametersCreateAlgorithmParameters;
        } catch (IOException e12) {
            throw new OperatorCreationException(b.a(e12, new StringBuilder("cannot initialise algorithm parameters: ")), e12);
        }
    }

    public Cipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) throws OperatorCreationException {
        try {
            String str = !map.isEmpty() ? (String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return this.helper.createCipher("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create cipher: ")), e10);
        }
    }

    public Cipher createCipher(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create cipher: ")), e10);
        }
    }

    public MessageDigest createDigest(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException {
        JcaJceHelper jcaJceHelper;
        String digestName;
        try {
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256_len)) {
                jcaJceHelper = this.helper;
                digestName = "SHAKE256-" + ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue();
            } else {
                if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128_len)) {
                    return this.helper.createMessageDigest("SHAKE128-" + ASN1Integer.getInstance(algorithmIdentifier.getParameters()).getValue());
                }
                jcaJceHelper = this.helper;
                digestName = MessageDigestUtils.getDigestName(algorithmIdentifier.getAlgorithm());
            }
            return jcaJceHelper.createMessageDigest(digestName);
        } catch (NoSuchAlgorithmException e10) {
            Map map = oids;
            if (map.get(algorithmIdentifier.getAlgorithm()) == null) {
                throw e10;
            }
            return this.helper.createMessageDigest((String) map.get(algorithmIdentifier.getAlgorithm()));
        }
    }

    public KeyAgreement createKeyAgreement(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            return this.helper.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create key agreement: ")), e10);
        }
    }

    public KeyPairGenerator createKeyPairGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws CMSException {
        try {
            return this.helper.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new CMSException(a.a(e10, new StringBuilder("cannot create key agreement: ")), e10);
        }
    }

    public Signature createRawSignature(AlgorithmIdentifier algorithmIdentifier) throws InvalidAlgorithmParameterException {
        try {
            String signatureName = getSignatureName(algorithmIdentifier);
            String str = "NONE" + signatureName.substring(signatureName.indexOf("WITH"));
            Signature signatureCreateSignature = this.helper.createSignature(str);
            if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(str);
                AlgorithmParametersUtils.loadParameters(algorithmParametersCreateAlgorithmParameters, algorithmIdentifier.getParameters());
                signatureCreateSignature.setParameter((PSSParameterSpec) algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
            }
            return signatureCreateSignature;
        } catch (Exception unused) {
            return null;
        }
    }

    public Signature createSignature(AlgorithmIdentifier algorithmIdentifier) throws GeneralSecurityException, IOException {
        Signature signatureCreateSignature;
        String signatureName = getSignatureName(algorithmIdentifier);
        try {
            signatureCreateSignature = this.helper.createSignature(signatureName);
        } catch (NoSuchAlgorithmException e10) {
            if (!signatureName.endsWith("WITHRSAANDMGF1")) {
                throw e10;
            }
            signatureCreateSignature = this.helper.createSignature(signatureName.substring(0, signatureName.indexOf(87)) + "WITHRSASSA-PSS");
        }
        if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(algorithmIdentifier.getParameters());
            if (notDefaultPSSParams(aSN1Sequence)) {
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("PSS");
                    algorithmParametersCreateAlgorithmParameters.init(aSN1Sequence.getEncoded());
                    signatureCreateSignature.setParameter(algorithmParametersCreateAlgorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e11) {
                    throw new GeneralSecurityException(b.a(e11, new StringBuilder("unable to process PSS parameters: ")));
                }
            }
        }
        return signatureCreateSignature;
    }

    public Cipher createSymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws OperatorCreationException {
        try {
            String str = (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.helper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.helper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e10) {
            throw new OperatorCreationException(a.a(e10, new StringBuilder("cannot create cipher: ")), e10);
        }
    }

    public String getKeyAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) symmetricKeyAlgNames.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    public int getKeySizeInBits(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) symmetricWrapperKeySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    public String getWrappingAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) symmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
    }
}
