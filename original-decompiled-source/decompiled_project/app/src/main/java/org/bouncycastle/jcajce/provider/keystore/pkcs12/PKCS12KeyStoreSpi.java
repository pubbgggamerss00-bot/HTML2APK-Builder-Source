package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import i8.n;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.internal.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import p.i0;

/* loaded from: classes.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private ASN1ObjectIdentifier keyAlgorithm;
    private IgnoresCaseHashtable keys;
    private IgnoresCaseHashtable localIds;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
    private AlgorithmIdentifier macAlgorithm = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
    private int itCount = 102400;
    private int saltLength = 20;

    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore3DES() {
            BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
            BCJcaJceHelper bCJcaJceHelper2 = new BCJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(bCJcaJceHelper, new PKCS12KeyStoreSpi(bCJcaJceHelper2, aSN1ObjectIdentifier, aSN1ObjectIdentifier));
        }
    }

    public static class BCPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_CBC, NISTObjectIdentifiers.id_aes128_CBC));
        }
    }

    public static class BCPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256GCM() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_GCM, NISTObjectIdentifiers.id_aes128_GCM));
        }
    }

    public class CertId {

        /* renamed from: id, reason: collision with root package name */
        byte[] f20135id;

        public CertId(PublicKey publicKey) {
            this.f20135id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).getKeyIdentifier();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.f20135id, ((CertId) obj).f20135id);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f20135id);
        }

        public CertId(byte[] bArr) {
            this.f20135id = bArr;
        }
    }

    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new DefaultJcaJceHelper(), new PKCS12KeyStoreSpi(new DefaultJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore3DES() {
            DefaultJcaJceHelper defaultJcaJceHelper = new DefaultJcaJceHelper();
            DefaultJcaJceHelper defaultJcaJceHelper2 = new DefaultJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
            super(defaultJcaJceHelper, new PKCS12KeyStoreSpi(defaultJcaJceHelper2, aSN1ObjectIdentifier, aSN1ObjectIdentifier));
        }
    }

    public static class DefPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_CBC, NISTObjectIdentifiers.id_aes128_CBC));
        }
    }

    public static class DefPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256GCM() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_GCM, NISTObjectIdentifiers.id_aes128_GCM));
        }
    }

    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        public DefaultSecretKeyProvider() {
            HashMap map = new HashMap();
            map.put(new ASN1ObjectIdentifier("1.2.840.113533.7.66.10"), Integers.valueOf(128));
            map.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            map.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            map.put(NISTObjectIdentifiers.id_aes128_GCM, Integers.valueOf(128));
            map.put(NISTObjectIdentifiers.id_aes256_GCM, Integers.valueOf(256));
            map.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            map.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            map.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            map.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(map);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        this.keyAlgorithm = aSN1ObjectIdentifier;
        this.certAlgorithm = aSN1ObjectIdentifier2;
        try {
            this.certFact = jcaJceHelper.createCertificateFactory("X.509");
        } catch (Exception e10) {
            throw new IllegalArgumentException(a.a(e10, new StringBuilder("can't create cert factory - ")));
        }
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i10, char[] cArr, boolean z10, byte[] bArr2) throws Exception {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i10);
        Mac macCreateMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        macCreateMac.init(new PKCS12Key(cArr, z10), pBEParameterSpec);
        macCreateMac.update(bArr2);
        return macCreateMac.doFinal();
    }

    private Cipher createCipher(int i10, char[] cArr, AlgorithmIdentifier algorithmIdentifier) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec gOST28147ParameterSpec;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKey secretKeyGenerateSecret = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId()).generateSecret(pBKDF2Params.isDefaultPrf() ? new PBEKeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2)) : new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        Cipher cipherCreateCipher = this.helper.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
        } else {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(parameters);
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1ObjectIdentifier)) {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmIdentifier2.getAlgorithm().getId(), BouncyCastleProvider.PROVIDER_NAME);
                try {
                    algorithmParameters.init(aSN1Sequence.getEncoded());
                    cipherCreateCipher.init(i10, secretKeyGenerateSecret, algorithmParameters);
                    return cipherCreateCipher;
                } catch (IOException e10) {
                    throw new InvalidKeySpecException(e10.getMessage());
                }
            }
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        cipherCreateCipher.init(i10, secretKeyGenerateSecret, gOST28147ParameterSpec);
        return cipherCreateCipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SafeBag createSafeBag(String str, Certificate certificate) throws CertificateEncodingException {
        DERSequence dERSequence;
        CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate.getEncoded()));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        boolean z10 = false;
        if (certificate instanceof PKCS12BagAttributeCarrier) {
            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificate;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
            ASN1BMPString aSN1BMPString = (ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
            if ((aSN1BMPString == null || !aSN1BMPString.getString().equals(str)) && str != null) {
                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, new DERBMPString(str));
            }
            Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
            while (bagAttributeKeys.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier2);
                    aSN1EncodableVector2.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                    aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
                    z10 = true;
                }
            }
        }
        if (!z10) {
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            aSN1EncodableVector3.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
            aSN1EncodableVector3.add(new DERSet(new DERBMPString(str)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
        }
        if (certificate instanceof X509Certificate) {
            Extensions extensions = TBSCertificate.getInstance(((X509Certificate) certificate).getTBSCertificate()).getExtensions();
            if (extensions != null) {
                Extension extension = extensions.getExtension(Extension.extendedKeyUsage);
                if (extension != null) {
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                    aSN1EncodableVector4.add(new DERSet(ExtendedKeyUsage.getInstance(extension.getParsedValue()).getUsages()));
                    aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
                } else {
                    ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                    aSN1EncodableVector5.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                    aSN1EncodableVector5.add(new DERSet(KeyPurposeId.anyExtendedKeyUsage));
                    dERSequence = new DERSequence(aSN1EncodableVector5);
                }
            } else {
                ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                aSN1EncodableVector6.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                aSN1EncodableVector6.add(new DERSet(KeyPurposeId.anyExtendedKeyUsage));
                dERSequence = new DERSequence(aSN1EncodableVector6);
            }
            aSN1EncodableVector.add(dERSequence);
        }
        return new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        try {
            return new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
        } catch (Exception unused) {
            throw new RuntimeException("error creating key");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doStore(OutputStream outputStream, char[] cArr, boolean z10) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AlgorithmIdentifier algorithmIdentifier;
        MacData macData;
        boolean z11;
        Enumeration enumeration;
        byte[] bArrWrapKey;
        AlgorithmIdentifier algorithmIdentifier2;
        boolean z12;
        int size = this.keys.size();
        String str = ASN1Encoding.BER;
        if (size == 0) {
            if (cArr == null) {
                Enumeration enumerationKeys = this.certs.keys();
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                while (enumerationKeys.hasMoreElements()) {
                    try {
                        String str2 = (String) enumerationKeys.nextElement();
                        aSN1EncodableVector.add(createSafeBag(str2, (Certificate) this.certs.get(str2)));
                    } catch (CertificateEncodingException e10) {
                        throw new IOException("Error encoding certificate: " + e10.toString());
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.data;
                if (z10) {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(new ContentInfo(aSN1ObjectIdentifier, new DEROctetString(new DERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.DER);
                    return;
                } else {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(new ContentInfo(aSN1ObjectIdentifier, new BEROctetString(new BERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.BER);
                    return;
                }
            }
        } else if (cArr == null) {
            throw new NullPointerException("no password supplied for PKCS#12 KeyStore");
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str3 = (String) enumerationKeys2.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str3);
            if (isPBKDF2(this.keyAlgorithm)) {
                enumeration = enumerationKeys2;
                PBKDF2Params pBKDF2Params = new PBKDF2Params(bArr, MIN_ITERATIONS, getKeyLength(this.keyAlgorithm), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, DERNull.INSTANCE));
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.keyAlgorithm;
                EncryptionScheme encryptionScheme = new EncryptionScheme(aSN1ObjectIdentifier2, getAlgParams(aSN1ObjectIdentifier2));
                algorithmIdentifier2 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, pBKDF2Params), encryptionScheme));
                bArrWrapKey = wrapKey(encryptionScheme, privateKey, pBKDF2Params, cArr);
            } else {
                enumeration = enumerationKeys2;
                PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, MIN_ITERATIONS);
                byte[] bArrWrapKey2 = wrapKey(this.keyAlgorithm.getId(), privateKey, pKCS12PBEParams, cArr);
                AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(this.keyAlgorithm, pKCS12PBEParams.toASN1Primitive());
                bArrWrapKey = bArrWrapKey2;
                algorithmIdentifier2 = algorithmIdentifier3;
            }
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(algorithmIdentifier2, bArrWrapKey);
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            if (privateKey instanceof PKCS12BagAttributeCarrier) {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                ASN1BMPString aSN1BMPString = (ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier3);
                if (aSN1BMPString == null || !aSN1BMPString.getString().equals(str3)) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier3, new DERBMPString(str3));
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                if (pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier4) == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier4, createSubjectKeyId(engineGetCertificate(str3).getPublicKey()));
                }
                Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                z12 = false;
                while (bagAttributeKeys.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier5 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(aSN1ObjectIdentifier5);
                    aSN1EncodableVector4.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier5)));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector4));
                    z12 = true;
                }
            } else {
                z12 = false;
            }
            if (!z12) {
                ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                Certificate certificateEngineGetCertificate = engineGetCertificate(str3);
                aSN1EncodableVector5.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector5.add(new DERSet(createSubjectKeyId(certificateEngineGetCertificate.getPublicKey())));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector5));
                ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                aSN1EncodableVector6.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector6.add(new DERSet(new DERBMPString(str3)));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector6));
            }
            aSN1EncodableVector2.add(new SafeBag(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector3)));
            enumerationKeys2 = enumeration;
        }
        BEROctetString bEROctetString = new BEROctetString(new DERSequence(aSN1EncodableVector2).getEncoded(ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        if (isPBKDF2(this.certAlgorithm)) {
            PBKDF2Params pBKDF2Params2 = new PBKDF2Params(bArr2, MIN_ITERATIONS, getKeyLength(this.certAlgorithm), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, DERNull.INSTANCE));
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.id_PBES2;
            KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, pBKDF2Params2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = this.certAlgorithm;
            algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier6, new PBES2Parameters(keyDerivationFunc, new EncryptionScheme(aSN1ObjectIdentifier7, getAlgParams(aSN1ObjectIdentifier7))));
        } else {
            algorithmIdentifier = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, MIN_ITERATIONS).toASN1Primitive());
        }
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys3 = this.keys.keys();
        while (enumerationKeys3.hasMoreElements()) {
            try {
                String str4 = (String) enumerationKeys3.nextElement();
                Certificate certificateEngineGetCertificate2 = engineGetCertificate(str4);
                AlgorithmIdentifier algorithmIdentifier4 = algorithmIdentifier;
                CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificateEngineGetCertificate2.getEncoded()));
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                if (certificateEngineGetCertificate2 instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) certificateEngineGetCertificate2;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                    ASN1BMPString aSN1BMPString2 = (ASN1BMPString) pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier8);
                    if (aSN1BMPString2 == null || !aSN1BMPString2.getString().equals(str4)) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier8, new DERBMPString(str4));
                    }
                    ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                    if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier9) == null) {
                        pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier9, createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey()));
                    }
                    Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                    z11 = false;
                    while (bagAttributeKeys2.hasMoreElements()) {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                        Enumeration enumeration2 = bagAttributeKeys2;
                        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
                        aSN1EncodableVector9.add(aSN1ObjectIdentifier10);
                        aSN1EncodableVector9.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier10)));
                        aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector9));
                        bagAttributeKeys2 = enumeration2;
                        str = str;
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
                String str5 = str;
                if (!z11) {
                    ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                    aSN1EncodableVector10.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                    aSN1EncodableVector10.add(new DERSet(createSubjectKeyId(certificateEngineGetCertificate2.getPublicKey())));
                    aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector10));
                    ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                    aSN1EncodableVector11.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                    aSN1EncodableVector11.add(new DERSet(new DERBMPString(str4)));
                    aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector11));
                }
                aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector8)));
                hashtable.put(certificateEngineGetCertificate2, certificateEngineGetCertificate2);
                algorithmIdentifier = algorithmIdentifier4;
                str = str5;
            } catch (CertificateEncodingException e11) {
                throw new IOException("Error encoding certificate: " + e11.toString());
            }
        }
        AlgorithmIdentifier algorithmIdentifier5 = algorithmIdentifier;
        String str6 = str;
        Enumeration enumerationKeys4 = this.certs.keys();
        while (enumerationKeys4.hasMoreElements()) {
            try {
                String str7 = (String) enumerationKeys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str7);
                if (this.keys.get(str7) == null) {
                    aSN1EncodableVector7.add(createSafeBag(str7, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e12) {
                throw new IOException("Error encoding certificate: " + e12.toString());
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration enumerationKeys5 = this.chainCerts.keys();
        while (enumerationKeys5.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) enumerationKeys5.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    CertBag certBag2 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate2.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                    if (certificate2 instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) certificate2;
                        Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            if (!aSN1ObjectIdentifier11.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                                aSN1EncodableVector13.add(aSN1ObjectIdentifier11);
                                aSN1EncodableVector13.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier11)));
                                aSN1EncodableVector12.add(new DERSequence(aSN1EncodableVector13));
                            }
                        }
                    }
                    aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector12)));
                }
            } catch (CertificateEncodingException e13) {
                throw new IOException("Error encoding certificate: " + e13.toString());
            }
        }
        byte[] bArrCryptData = cryptData(true, algorithmIdentifier5, cArr, false, new DERSequence(aSN1EncodableVector7).getEncoded(ASN1Encoding.DER));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.data;
        ContentInfo contentInfo = new ContentInfo(aSN1ObjectIdentifier12, new BEROctetString(new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(aSN1ObjectIdentifier12, bEROctetString), new ContentInfo(PKCSObjectIdentifiers.encryptedData, new EncryptedData(aSN1ObjectIdentifier12, algorithmIdentifier5, new BEROctetString(bArrCryptData)).toASN1Primitive())}).getEncoded(z10 ? ASN1Encoding.DER : str6)));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        byte[] octets = ((ASN1OctetString) contentInfo.getContent()).getOctets();
        if (this.keyAlgorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) {
            macData = null;
        } else {
            try {
                macData = new MacData(new DigestInfo(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.getAlgorithm(), bArr3, this.itCount, cArr, false, octets)), bArr3, this.itCount);
            } catch (Exception e14) {
                throw new IOException(a.a(e14, new StringBuilder("error constructing MAC: ")));
            }
        }
        new Pfx(contentInfo, macData).encodeTo(outputStream, z10 ? ASN1Encoding.DER : str6);
    }

    private ASN1Primitive getAlgParams(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC)) {
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            return new DEROctetString(bArr);
        }
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_GCM) && !aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) {
            throw new IllegalStateException("unknown encryption OID in getAlgParams()");
        }
        byte[] bArr2 = new byte[12];
        this.random.nextBytes(bArr2);
        return new GCMParameters(bArr2, 16).toASN1Primitive();
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        Digest digestCreateSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[digestCreateSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        digestCreateSHA1.update(bytes, 0, bytes.length);
        digestCreateSHA1.doFinal(bArr, 0);
        return bArr;
    }

    private static int getKeyLength(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) ? 32 : 16;
    }

    private Set getUsedCertificateSet() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        HashSet hashSet = new HashSet();
        Enumeration enumerationKeys = this.keys.keys();
        while (enumerationKeys.hasMoreElements()) {
            Certificate[] certificateArrEngineGetCertificateChain = engineGetCertificateChain((String) enumerationKeys.nextElement());
            for (int i10 = 0; i10 != certificateArrEngineGetCertificateChain.length; i10++) {
                hashSet.add(certificateArrEngineGetCertificateChain[i10]);
            }
        }
        Enumeration enumerationKeys2 = this.certs.keys();
        while (enumerationKeys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) enumerationKeys2.nextElement()));
        }
        return hashSet;
    }

    private static boolean isPBKDF2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_GCM);
    }

    private void processKeyBag(SafeBag safeBag) throws IOException {
        PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag.getBagValue()));
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
        Enumeration objects = safeBag.getBagAttributes().getObjects();
        ASN1OctetString aSN1OctetString = null;
        String string = null;
        while (objects.hasMoreElements()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(objects.nextElement());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
            if (aSN1Set.size() > 0) {
                ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                if (bagAttribute == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                    throw new IOException("attempt to add existing attribute with different value");
                }
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                    string = ((ASN1BMPString) aSN1Primitive).getString();
                    this.keys.put(string, privateKey);
                } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                }
            }
        }
        String str = new String(Hex.encode(aSN1OctetString.getOctets()));
        if (string == null) {
            this.keys.put(str, privateKey);
        } else {
            this.localIds.put(string, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    private boolean processShroudedKeyBag(SafeBag safeBag, char[] cArr, boolean z10) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        String string;
        ASN1OctetString aSN1OctetString;
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag.getBagValue());
        PrivateKey privateKeyUnwrapKey = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z10);
        ASN1OctetString aSN1OctetString2 = null;
        if (safeBag.getBagAttributes() != null) {
            Enumeration objects = safeBag.getBagAttributes().getObjects();
            string = null;
            ASN1OctetString aSN1OctetString3 = null;
            while (objects.hasMoreElements()) {
                ASN1Sequence aSN1Sequence = (ASN1Sequence) objects.nextElement();
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
                ASN1Set aSN1Set = (ASN1Set) aSN1Sequence.getObjectAt(1);
                if (aSN1Set.size() > 0) {
                    ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                    aSN1OctetString = aSN1Primitive;
                    if (privateKeyUnwrapKey instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKeyUnwrapKey;
                        ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                        if (bagAttribute != null) {
                            boolean zEquals = bagAttribute.toASN1Primitive().equals(aSN1Primitive);
                            aSN1OctetString = aSN1Primitive;
                            if (!zEquals) {
                                throw new IOException("attempt to add existing attribute with different value");
                            }
                        } else {
                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                            aSN1OctetString = aSN1Primitive;
                        }
                    }
                } else {
                    aSN1OctetString = 0;
                }
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                    string = ((ASN1BMPString) aSN1OctetString).getString();
                    this.keys.put(string, privateKeyUnwrapKey);
                } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    aSN1OctetString3 = aSN1OctetString;
                }
            }
            aSN1OctetString2 = aSN1OctetString3;
        } else {
            string = null;
        }
        if (aSN1OctetString2 == null) {
            this.keys.put("unmarked", privateKeyUnwrapKey);
            return true;
        }
        String str = new String(Hex.encode(aSN1OctetString2.getOctets()));
        if (string == null) {
            this.keys.put(str, privateKeyUnwrapKey);
        } else {
            this.localIds.put(string, str);
        }
        return false;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int iIntValueExact = BigIntegers.intValueExact(bigInteger);
        if (iIntValueExact < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        BigInteger bigIntegerAsBigInteger = Properties.asBigInteger(PKCS12_MAX_IT_COUNT_PROPERTY);
        if (bigIntegerAsBigInteger == null || BigIntegers.intValueExact(bigIntegerAsBigInteger) >= iIntValueExact) {
            return iIntValueExact;
        }
        StringBuilder sbB = i0.b(iIntValueExact, "iteration count ", " greater than ");
        sbB.append(BigIntegers.intValueExact(bigIntegerAsBigInteger));
        throw new IllegalStateException(sbB.toString());
    }

    public byte[] cryptData(boolean z10, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z11, byte[] bArr) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i10 = z10 ? 1 : 2;
        if (!algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                throw new IOException(org.bouncycastle.cms.a.a("unknown PBE algorithm: ", algorithm));
            }
            try {
                return createCipher(i10, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (Exception e10) {
                throw new IOException(a.a(e10, new StringBuilder("exception decrypting data - ")));
            }
        }
        PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
        try {
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), BigIntegers.intValueExact(pKCS12PBEParams.getIterations()));
            PKCS12Key pKCS12Key = new PKCS12Key(cArr, z11);
            Cipher cipherCreateCipher = this.helper.createCipher(algorithm.getId());
            cipherCreateCipher.init(i10, pKCS12Key, pBEParameterSpec);
            return cipherCreateCipher.doFinal(bArr);
        } catch (Exception e11) {
            throw new IOException(a.a(e11, new StringBuilder("exception decrypting data - ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        String str2;
        Certificate certificate;
        Certificate certificate2 = (Certificate) this.certs.remove(str);
        if (certificate2 != null) {
            this.chainCerts.remove(new CertId(certificate2.getPublicKey()));
        }
        if (((Key) this.keys.remove(str)) == null || (str2 = (String) this.localIds.remove(str)) == null || (certificate = (Certificate) this.keyCerts.remove(str2)) == null) {
            return;
        }
        this.chainCerts.remove(new CertId(certificate.getPublicKey()));
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificate.");
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        return (Certificate) (str2 != null ? this.keyCerts.get(str2) : this.keyCerts.get(str));
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration enumerationElements = this.certs.elements();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationElements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) enumerationElements.nextElement();
            String str = (String) enumerationKeys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration enumerationElements2 = this.keyCerts.elements();
        Enumeration enumerationKeys2 = this.keyCerts.keys();
        while (enumerationElements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) enumerationElements2.nextElement();
            String str2 = (String) enumerationKeys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        byte[] keyIdentifier;
        if (str == null) {
            throw new IllegalArgumentException("null alias passed to getCertificateChain.");
        }
        Certificate[] certificateArr = null;
        if (!engineIsKeyEntry(str)) {
            return null;
        }
        Certificate certificateEngineGetCertificate = engineGetCertificate(str);
        if (certificateEngineGetCertificate != null) {
            Vector vector = new Vector();
            while (certificateEngineGetCertificate != null) {
                X509Certificate x509Certificate = (X509Certificate) certificateEngineGetCertificate;
                byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                Certificate certificate = (extensionValue == null || (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) == null) ? null : (Certificate) this.chainCerts.get(new CertId(keyIdentifier));
                if (certificate == null) {
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                        Enumeration enumerationKeys = this.chainCerts.keys();
                        while (true) {
                            if (!enumerationKeys.hasMoreElements()) {
                                break;
                            }
                            X509Certificate x509Certificate2 = (X509Certificate) this.chainCerts.get(enumerationKeys.nextElement());
                            if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    certificate = x509Certificate2;
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!vector.contains(certificateEngineGetCertificate)) {
                    vector.addElement(certificateEngineGetCertificate);
                    if (certificate != certificateEngineGetCertificate) {
                        certificateEngineGetCertificate = certificate;
                    }
                }
                certificateEngineGetCertificate = null;
            }
            int size = vector.size();
            certificateArr = new Certificate[size];
            for (int i10 = 0; i10 != size; i10++) {
                certificateArr[i10] = (Certificate) vector.elementAt(i10);
            }
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            throw new NullPointerException("alias == null");
        }
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        throw new IllegalArgumentException("null alias passed to getKey.");
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0353  */
    /* JADX WARN: Type inference failed for: r3v8, types: [org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.security.cert.Certificate] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [org.bouncycastle.asn1.ASN1OctetString] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        char[] cArr2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zProcessShroudedKeyBag;
        ?? r62;
        String string;
        int i10;
        boolean z13;
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        int i11 = bufferedInputStream.read();
        if (i11 < 0) {
            throw new EOFException("no data in keystore stream");
        }
        if (i11 != 48) {
            throw new IOException("stream does not represent a PKCS12 key store");
        }
        bufferedInputStream.reset();
        try {
            Pfx pfx = Pfx.getInstance(new ASN1InputStream(bufferedInputStream).readObject());
            ContentInfo authSafe = pfx.getAuthSafe();
            Vector vector = new Vector();
            if (pfx.getMacData() == null) {
                cArr2 = cArr;
                z10 = false;
                z11 = true;
            } else {
                if (cArr == null) {
                    throw new NullPointerException("no password supplied when one expected");
                }
                MacData macData = pfx.getMacData();
                DigestInfo mac = macData.getMac();
                this.macAlgorithm = mac.getAlgorithmId();
                byte[] salt = macData.getSalt();
                this.itCount = validateIterationCount(macData.getIterationCount());
                this.saltLength = salt.length;
                byte[] octets = ((ASN1OctetString) authSafe.getContent()).getOctets();
                try {
                    cArr2 = cArr;
                    byte[] bArrCalculatePbeMac = calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr2, false, octets);
                    byte[] digest = mac.getDigest();
                    if (Arrays.constantTimeAreEqual(bArrCalculatePbeMac, digest)) {
                        z10 = false;
                    } else {
                        if (cArr2.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!Arrays.constantTimeAreEqual(calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr2, true, octets), digest)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        z10 = true;
                    }
                    z11 = false;
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new IOException(a.a(e11, new StringBuilder("error constructing MAC: ")));
                }
            }
            AnonymousClass1 anonymousClass1 = null;
            this.keys = new IgnoresCaseHashtable();
            this.localIds = new IgnoresCaseHashtable();
            if (authSafe.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                ContentInfo[] contentInfo = AuthenticatedSafe.getInstance(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                z12 = true;
                int i12 = 0;
                zProcessShroudedKeyBag = false;
                while (i12 != contentInfo.length) {
                    if (contentInfo[i12].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo[i12].getContent()).getOctets());
                        for (int i13 = 0; i13 != aSN1Sequence.size(); i13++) {
                            SafeBag safeBag = SafeBag.getInstance(aSN1Sequence.getObjectAt(i13));
                            if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                zProcessShroudedKeyBag = processShroudedKeyBag(safeBag, cArr2, z10);
                                z12 = false;
                            } else if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag);
                            } else if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                processKeyBag(safeBag);
                            } else {
                                System.out.println("extra in data " + safeBag.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag));
                            }
                        }
                        z13 = z10;
                    } else if (contentInfo[i12].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
                        EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i12].getContent());
                        char[] cArr3 = cArr2;
                        boolean z14 = z10;
                        byte[] bArrCryptData = cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr3, z14, encryptedData.getContent().getOctets());
                        z13 = z14;
                        cArr2 = cArr3;
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(bArrCryptData);
                        for (int i14 = 0; i14 != aSN1Sequence2.size(); i14++) {
                            SafeBag safeBag2 = SafeBag.getInstance(aSN1Sequence2.getObjectAt(i14));
                            if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag2);
                            } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                zProcessShroudedKeyBag = processShroudedKeyBag(safeBag2, cArr2, z13);
                            } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                processKeyBag(safeBag2);
                            } else {
                                System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag2));
                            }
                        }
                        z12 = false;
                    } else {
                        z13 = z10;
                        System.out.println("extra " + contentInfo[i12].getContentType().getId());
                        System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i12].getContent()));
                    }
                    i12++;
                    z10 = z13;
                }
            } else {
                z12 = true;
                zProcessShroudedKeyBag = false;
            }
            this.certs = new IgnoresCaseHashtable();
            this.chainCerts = new Hashtable();
            this.keyCerts = new Hashtable();
            int i15 = 0;
            while (i15 != vector.size()) {
                SafeBag safeBag3 = (SafeBag) vector.elementAt(i15);
                CertBag certBag = CertBag.getInstance(safeBag3.getBagValue());
                if (!certBag.getCertId().equals((ASN1Primitive) PKCSObjectIdentifiers.x509Certificate)) {
                    throw new RuntimeException("Unsupported certificate type: " + certBag.getCertId());
                }
                try {
                    ?? GenerateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                    if (safeBag3.getBagAttributes() != null) {
                        Enumeration objects = safeBag3.getBagAttributes().getObjects();
                        r62 = anonymousClass1;
                        string = r62;
                        while (objects.hasMoreElements()) {
                            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(objects.nextElement());
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence3.getObjectAt(0));
                            ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence3.getObjectAt(1));
                            if (aSN1Set.size() > 0) {
                                ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                if (GenerateCertificate instanceof PKCS12BagAttributeCarrier) {
                                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) GenerateCertificate;
                                    ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                    if (bagAttribute != null) {
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                            String hexString = Hex.toHexString(((ASN1OctetString) aSN1Primitive).getOctets());
                                            if (this.keys.keys.containsKey(hexString) || this.localIds.keys.containsKey(hexString)) {
                                            }
                                        }
                                        if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                            throw new IOException("attempt to add existing attribute with different value");
                                        }
                                    } else {
                                        i10 = i15;
                                        if (aSN1Set.size() > 1) {
                                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Set);
                                        } else {
                                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                                        }
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            r62 = r62;
                                            if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                r62 = (ASN1OctetString) aSN1Primitive;
                                            }
                                        } else {
                                            string = ((ASN1BMPString) aSN1Primitive).getString();
                                            r62 = r62;
                                        }
                                    }
                                }
                                i10 = i15;
                                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                }
                            } else {
                                i10 = i15;
                                r62 = r62;
                            }
                            i15 = i10;
                        }
                    } else {
                        r62 = 0;
                        string = null;
                    }
                    int i16 = i15;
                    this.chainCerts.put(new CertId(GenerateCertificate.getPublicKey()), GenerateCertificate);
                    if (!zProcessShroudedKeyBag) {
                        if (r62 != 0) {
                            this.keyCerts.put(new String(Hex.encode(r62.getOctets())), GenerateCertificate);
                        }
                        if (string != null) {
                            this.certs.put(string, GenerateCertificate);
                        }
                    } else if (this.keyCerts.isEmpty()) {
                        String str = new String(Hex.encode(createSubjectKeyId(GenerateCertificate.getPublicKey()).getKeyIdentifier()));
                        this.keyCerts.put(str, GenerateCertificate);
                        IgnoresCaseHashtable ignoresCaseHashtable = this.keys;
                        ignoresCaseHashtable.put(str, ignoresCaseHashtable.remove("unmarked"));
                    }
                    i15 = i16 + 1;
                    anonymousClass1 = null;
                } catch (Exception e12) {
                    throw new RuntimeException(e12.toString());
                }
            }
            if (z11 && z12 && cArr2 != null && cArr2.length != 0 && !Properties.isOverrideSet("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                throw new IOException("password supplied for keystore that does not require one");
            }
        } catch (Exception e13) {
            throw new IOException(e13.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) throws IOException {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        if (this.keys.get(str) != null) {
            throw new KeyStoreException(n.d("There is a key entry with the name ", str, "."));
        }
        this.certs.put(str, certificate);
        this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i10 = 0; i10 != certificateArr.length; i10++) {
                this.chainCerts.put(new CertId(certificateArr[i10].getPublicKey()), certificateArr[i10]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration enumerationKeys = this.certs.keys();
        while (enumerationKeys.hasMoreElements()) {
            hashtable.put(enumerationKeys.nextElement(), "cert");
        }
        Enumeration enumerationKeys2 = this.keys.keys();
        while (enumerationKeys2.hasMoreElements()) {
            String str = (String) enumerationKeys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        doStore(outputStream, cArr, false);
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z10) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        Cipher cipherCreateCipher;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), validateIterationCount(pKCS12PBEParams.getIterations()));
                cipherCreateCipher = this.helper.createCipher(algorithm.getId());
                cipherCreateCipher.init(4, new PKCS12Key(cArr, z10), pBEParameterSpec);
            } else {
                if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                    throw new IOException(org.bouncycastle.cms.a.a("exception unwrapping private key - cannot recognise: ", algorithm));
                }
                cipherCreateCipher = createCipher(4, cArr, algorithmIdentifier);
            }
            return (PrivateKey) cipherCreateCipher.unwrap(bArr, "", 2);
        } catch (Exception e10) {
            throw new IOException(a.a(e10, new StringBuilder("exception unwrapping private key - ")));
        }
    }

    public byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) throws InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), BigIntegers.intValueExact(pKCS12PBEParams.getIterations()));
            Cipher cipherCreateCipher = this.helper.createCipher(str);
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipherCreateCipher.wrap(key);
        } catch (Exception e10) {
            throw new IOException(a.a(e10, new StringBuilder("exception encrypting data - ")));
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new RuntimeException("operation not supported");
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'param' arg cannot be null");
        }
        boolean z10 = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z10 && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            throw new IllegalArgumentException("No support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
        }
        if (z10) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                throw new IllegalArgumentException("No support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
            }
            engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
        }
    }

    public byte[] wrapKey(EncryptionScheme encryptionScheme, Key key, PBKDF2Params pBKDF2Params, char[] cArr) throws NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, pBKDF2Params.getSalt(), BigIntegers.intValueExact(pBKDF2Params.getIterationCount()), BigIntegers.intValueExact(pBKDF2Params.getKeyLength()) * 8);
        try {
            SecretKeyFactory secretKeyFactoryCreateSecretKeyFactory = this.helper.createSecretKeyFactory("PBKDF2withHMacSHA256");
            Cipher cipherCreateCipher = this.helper.createCipher(encryptionScheme.getAlgorithm().getId());
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(encryptionScheme.getAlgorithm().getId());
            algorithmParameters.init(encryptionScheme.getParameters().toASN1Primitive().getEncoded());
            cipherCreateCipher.init(3, secretKeyFactoryCreateSecretKeyFactory.generateSecret(pBEKeySpec), algorithmParameters);
            return cipherCreateCipher.wrap(key);
        } catch (Exception e10) {
            throw new IOException(a.a(e10, new StringBuilder("exception encrypting data - ")));
        }
    }
}
