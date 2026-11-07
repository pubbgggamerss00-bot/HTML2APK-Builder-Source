package org.bouncycastle.cms.jcajce;

import androidx.security.crypto.a;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCaptureStream;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class JceCMSContentEncryptorBuilder {
    private static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
    private static final byte[] hkdfSalt = Strings.toByteArray("The Cryptographic Message Syntax");
    private AlgorithmIdentifier algorithmIdentifier;
    private AlgorithmParameters algorithmParameters;
    private final ASN1ObjectIdentifier encryptionOID;
    private EnvelopedDataHelper helper;
    private ASN1ObjectIdentifier kdfAlgorithm;
    private final int keySize;
    private SecureRandom random;

    public class CMSAuthOutputEncryptor extends CMSOutEncryptor implements OutputAEADEncryptor {
        private MacCaptureStream macOut;

        public CMSAuthOutputEncryptor(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, int i10, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws DataLengthException, CMSException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
            super();
            init(aSN1ObjectIdentifier, aSN1ObjectIdentifier2, i10, algorithmParameters, secureRandom);
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public OutputStream getAADStream() {
            if (JceCMSContentEncryptorBuilder.checkForAEAD()) {
                return new JceAADStream(this.cipher);
            }
            return null;
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithmIdentifier;
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public GenericKey getKey() {
            return new JceGenericKey(this.algorithmIdentifier, this.encKey);
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public byte[] getMAC() {
            return this.macOut.getMac();
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            this.macOut = new MacCaptureStream(outputStream, GCMParameters.getInstance((JceCMSContentEncryptorBuilder.this.kdfAlgorithm != null ? AlgorithmIdentifier.getInstance(this.algorithmIdentifier.getParameters()) : this.algorithmIdentifier).getParameters()).getIcvLen());
            return new CipherOutputStream(this.macOut, this.cipher);
        }
    }

    public class CMSOutEncryptor {
        protected AlgorithmIdentifier algorithmIdentifier;
        protected Cipher cipher;
        protected SecretKey encKey;

        private CMSOutEncryptor() {
        }

        private void applyKdf(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws DataLengthException, CMSException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
            HKDFBytesGenerator hKDFBytesGenerator = new HKDFBytesGenerator(new SHA256Digest());
            byte[] encoded = this.encKey.getEncoded();
            try {
                hKDFBytesGenerator.init(new HKDFParameters(encoded, JceCMSContentEncryptorBuilder.hkdfSalt, this.algorithmIdentifier.getEncoded(ASN1Encoding.DER)));
                hKDFBytesGenerator.generateBytes(encoded, 0, encoded.length);
                try {
                    this.cipher.init(1, new SecretKeySpec(encoded, this.encKey.getAlgorithm()), algorithmParameters, secureRandom);
                    this.algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, this.algorithmIdentifier);
                } catch (GeneralSecurityException e10) {
                    throw new CMSException(a.a(e10, new StringBuilder("unable to initialize cipher: ")), e10);
                }
            } catch (IOException e11) {
                throw new CMSException("unable to encode enc algorithm parameters", e11);
            }
        }

        public void init(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, int i10, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws DataLengthException, CMSException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
            KeyGenerator keyGeneratorCreateKeyGenerator = JceCMSContentEncryptorBuilder.this.helper.createKeyGenerator(aSN1ObjectIdentifier2);
            SecureRandom secureRandom2 = CryptoServicesRegistrar.getSecureRandom(secureRandom);
            if (i10 < 0) {
                keyGeneratorCreateKeyGenerator.init(secureRandom2);
            } else {
                keyGeneratorCreateKeyGenerator.init(i10, secureRandom2);
            }
            this.cipher = JceCMSContentEncryptorBuilder.this.helper.createCipher(aSN1ObjectIdentifier2);
            this.encKey = keyGeneratorCreateKeyGenerator.generateKey();
            if (algorithmParameters == null) {
                algorithmParameters = JceCMSContentEncryptorBuilder.this.helper.generateParameters(aSN1ObjectIdentifier2, this.encKey, secureRandom2);
            }
            if (algorithmParameters != null) {
                this.algorithmIdentifier = JceCMSContentEncryptorBuilder.this.helper.getAlgorithmIdentifier(aSN1ObjectIdentifier2, algorithmParameters);
                if (aSN1ObjectIdentifier != null) {
                    applyKdf(aSN1ObjectIdentifier, algorithmParameters, secureRandom2);
                    return;
                }
                try {
                    this.cipher.init(1, this.encKey, algorithmParameters, secureRandom2);
                    return;
                } catch (GeneralSecurityException e10) {
                    throw new CMSException(a.a(e10, new StringBuilder("unable to initialize cipher: ")), e10);
                }
            }
            try {
                this.cipher.init(1, this.encKey, algorithmParameters, secureRandom2);
                AlgorithmParameters parameters = this.cipher.getParameters();
                this.algorithmIdentifier = JceCMSContentEncryptorBuilder.this.helper.getAlgorithmIdentifier(aSN1ObjectIdentifier2, parameters);
                if (aSN1ObjectIdentifier != null) {
                    applyKdf(aSN1ObjectIdentifier, parameters, secureRandom2);
                }
            } catch (GeneralSecurityException e11) {
                throw new CMSException(a.a(e11, new StringBuilder("unable to initialize cipher: ")), e11);
            }
        }
    }

    public class CMSOutputEncryptor extends CMSOutEncryptor implements OutputEncryptor {
        public CMSOutputEncryptor(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, int i10, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws DataLengthException, CMSException, InvalidKeyException, IllegalArgumentException, InvalidAlgorithmParameterException {
            super();
            init(aSN1ObjectIdentifier, aSN1ObjectIdentifier2, i10, algorithmParameters, secureRandom);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.algorithmIdentifier;
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public GenericKey getKey() {
            return new JceGenericKey(this.algorithmIdentifier, this.encKey);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public OutputStream getOutputStream(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.cipher);
        }
    }

    public JceCMSContentEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, KEY_SIZE_PROVIDER.getKeySize(aSN1ObjectIdentifier));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkForAEAD() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return Boolean.valueOf(Cipher.class.getMethod("updateAAD", byte[].class) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue();
    }

    public OutputEncryptor build() throws CMSException, IOException {
        ASN1Encodable parameters;
        if (this.algorithmParameters != null) {
            return this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random) : new CMSOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random);
        }
        AlgorithmIdentifier algorithmIdentifier = this.algorithmIdentifier;
        if (algorithmIdentifier != null && (parameters = algorithmIdentifier.getParameters()) != null && !parameters.equals(DERNull.INSTANCE)) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(this.algorithmIdentifier.getAlgorithm());
                this.algorithmParameters = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(parameters.toASN1Primitive().getEncoded());
            } catch (Exception e10) {
                throw new CMSException(org.bouncycastle.asn1.a.a(e10, new StringBuilder("unable to process provided algorithmIdentifier: ")), e10);
            }
        }
        return this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random) : new CMSOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random);
    }

    public JceCMSContentEncryptorBuilder setAlgorithmParameters(AlgorithmParameters algorithmParameters) {
        this.algorithmParameters = algorithmParameters;
        return this;
    }

    public JceCMSContentEncryptorBuilder setEnableSha256HKdf(boolean z10) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (z10) {
            aSN1ObjectIdentifier = CMSObjectIdentifiers.id_alg_cek_hkdf_sha256;
        } else {
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.kdfAlgorithm;
            if (aSN1ObjectIdentifier2 == null) {
                return this;
            }
            if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) CMSObjectIdentifiers.id_alg_cek_hkdf_sha256)) {
                throw new IllegalStateException("SHA256 HKDF not enabled");
            }
            aSN1ObjectIdentifier = null;
        }
        this.kdfAlgorithm = aSN1ObjectIdentifier;
        return this;
    }

    public JceCMSContentEncryptorBuilder setProvider(String str) {
        this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public JceCMSContentEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceCMSContentEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10) {
        this.helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.encryptionOID = aSN1ObjectIdentifier;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(aSN1ObjectIdentifier);
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.des_EDE3_CBC)) {
            if (i10 != 168 && i10 != keySize) {
                throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.keySize = 168;
            return;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.desCBC)) {
            if (i10 != 56 && i10 != keySize) {
                throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.keySize = 56;
            return;
        }
        if (keySize > 0 && keySize != i10) {
            throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
        }
        this.keySize = i10;
    }

    public JceCMSContentEncryptorBuilder setProvider(Provider provider) {
        this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }

    public JceCMSContentEncryptorBuilder(AlgorithmIdentifier algorithmIdentifier) {
        this(algorithmIdentifier.getAlgorithm(), KEY_SIZE_PROVIDER.getKeySize(algorithmIdentifier.getAlgorithm()));
        this.algorithmIdentifier = algorithmIdentifier;
    }
}
