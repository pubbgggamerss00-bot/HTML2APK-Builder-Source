package org.bouncycastle.jcajce.provider.symmetric;

import b.o;
import c2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.AESWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CCMModeCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.c;
import org.bouncycastle.jcajce.provider.digest.d;
import org.bouncycastle.jcajce.provider.digest.e;
import org.bouncycastle.jcajce.provider.digest.f;
import org.bouncycastle.jcajce.provider.digest.g;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;

/* loaded from: classes.dex */
public final class AES {
    private static final Map<String, String> generalAesAttributes;

    public static class AESCCMMAC extends BaseMac {

        public static class CCMMac implements Mac {
            private final CCMModeCipher ccm;
            private int macLength;

            private CCMMac() {
                this.ccm = CCMBlockCipher.newInstance(AESEngine.newInstance());
                this.macLength = 8;
            }

            @Override // org.bouncycastle.crypto.Mac
            public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
                try {
                    return this.ccm.doFinal(bArr, 0);
                } catch (InvalidCipherTextException e10) {
                    throw new IllegalStateException("exception on doFinal(): " + e10.toString());
                }
            }

            @Override // org.bouncycastle.crypto.Mac
            public String getAlgorithmName() {
                return this.ccm.getAlgorithmName() + "Mac";
            }

            @Override // org.bouncycastle.crypto.Mac
            public int getMacSize() {
                return this.macLength;
            }

            @Override // org.bouncycastle.crypto.Mac
            public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
                this.ccm.init(true, cipherParameters);
                this.macLength = this.ccm.getMac().length;
            }

            @Override // org.bouncycastle.crypto.Mac
            public void reset() {
                this.ccm.reset();
            }

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte b10) throws IllegalStateException {
                this.ccm.processAADByte(b10);
            }

            @Override // org.bouncycastle.crypto.Mac
            public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
                this.ccm.processAADBytes(bArr, i10, i11);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(AESEngine.newInstance()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(GCMBlockCipher.newInstance(AESEngine.newInstance())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws InvalidParameterSpecException {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("AES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws IOException {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CCM");
                algorithmParametersCreateParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws IOException {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GCM");
                algorithmParametersCreateParametersInstance.init(new GCMParameters(bArr, 16).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private CCMParameters ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.ccmParams = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.ccmParams = CCMParameters.getInstance(bArr);
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private GCMParameters gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.gcmParams = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.gcmParams = GCMParameters.getInstance(bArr);
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i10) {
            super("AES", i10, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            d.b(str, "$AlgParams", "AlgorithmParameters.AES", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sbB = org.bouncycastle.jcajce.provider.asymmetric.a.b("AES", "Alg.Alias.AlgorithmParameters.", sb2, aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sbB2 = org.bouncycastle.jcajce.provider.asymmetric.a.b("AES", "Alg.Alias.AlgorithmParameters.", sbB, aSN1ObjectIdentifier2, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder sbA = org.bouncycastle.jcajce.provider.digest.a.a("AES", str, sbB2, aSN1ObjectIdentifier3, configurableProvider);
            sbA.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sbA.toString());
            StringBuilder sb3 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_GCM;
            StringBuilder sbB3 = org.bouncycastle.jcajce.provider.asymmetric.a.b("GCM", "Alg.Alias.AlgorithmParameters.", sb3, aSN1ObjectIdentifier4, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder sbB4 = org.bouncycastle.jcajce.provider.asymmetric.a.b("GCM", "Alg.Alias.AlgorithmParameters.", sbB3, aSN1ObjectIdentifier5, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_GCM;
            StringBuilder sbA2 = org.bouncycastle.jcajce.provider.digest.a.a("GCM", str, sbB4, aSN1ObjectIdentifier6, configurableProvider);
            sbA2.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sbA2.toString());
            StringBuilder sb4 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CCM;
            StringBuilder sbB5 = org.bouncycastle.jcajce.provider.asymmetric.a.b("CCM", "Alg.Alias.AlgorithmParameters.", sb4, aSN1ObjectIdentifier7, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder sbB6 = org.bouncycastle.jcajce.provider.asymmetric.a.b("CCM", "Alg.Alias.AlgorithmParameters.", sbB5, aSN1ObjectIdentifier8, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CCM;
            e.b(org.bouncycastle.jcajce.provider.digest.a.a("CCM", str, sbB6, aSN1ObjectIdentifier9, configurableProvider), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, "AES");
            StringBuilder sbB7 = org.bouncycastle.jcajce.provider.asymmetric.a.b("AES", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier2, configurableProvider);
            sbB7.append(aSN1ObjectIdentifier3);
            configurableProvider.addAlgorithm(sbB7.toString(), "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            d.b(str, "$ECB", "Cipher.AES", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_ECB;
            c.b(configurableProvider, str, "$ECB", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_ECB;
            c.b(configurableProvider, str, "$ECB", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, o.a(a.a("$CBC", "Cipher", b.a(configurableProvider, "Cipher", o.a(new StringBuilder(), str, "$CBC"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$CBC"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
            c.b(configurableProvider, str, "$OFB", "Cipher", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
            c.b(configurableProvider, str, "$OFB", "Cipher", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
            c.b(configurableProvider, str, "$OFB", "Cipher", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            c.b(configurableProvider, str, "$CFB", "Cipher", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_CFB;
            c.b(configurableProvider, str, "$CFB", "Cipher", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes256_CFB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str + "$CFB");
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes128_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier19, "AESWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier20, "AESWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier21, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            e.b(sb5, "$WrapPad", configurableProvider, "Cipher.AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes128_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier22, "AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes192_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier23, "AESWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_wrap_pad;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier24, "AESWRAPPAD");
            configurableProvider.addAlgorithm(org.bouncycastle.jcajce.provider.asymmetric.d.a(configurableProvider, org.bouncycastle.jcajce.provider.asymmetric.d.a(configurableProvider, org.bouncycastle.jcajce.provider.asymmetric.d.a(configurableProvider, "AlgorithmParameterGenerator.CCM", f.a("Cipher.AESRFC5649WRAP", f.a("Cipher.AESRFC3211WRAP", f.a("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", str, "$RFC3211Wrap", configurableProvider), str, "$RFC5649Wrap", configurableProvider), str, "$AlgParamGenCCM", configurableProvider), "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier7), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier8), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier9), "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            e.b(sb6, "$CCM", configurableProvider, "Cipher.CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier7, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier8, "CCM");
            StringBuilder sbA3 = b.a(configurableProvider, "Alg.Alias.Cipher", "CCM", str, aSN1ObjectIdentifier9);
            sbA3.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sbA3.toString());
            StringBuilder sbB8 = org.bouncycastle.jcajce.provider.asymmetric.a.b("GCM", "Alg.Alias.AlgorithmParameterGenerator.", org.bouncycastle.jcajce.provider.asymmetric.a.b("GCM", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier4, configurableProvider), aSN1ObjectIdentifier5, configurableProvider);
            sbB8.append(aSN1ObjectIdentifier6);
            configurableProvider.addAlgorithm(sbB8.toString(), "GCM");
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            d.b(str, "$GCM", "Cipher.GCM", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier4, "GCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier5, "GCM");
            StringBuilder sbA4 = g.a("$AESCMAC", "Mac.AESCMAC", str, b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen192", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(org.bouncycastle.jcajce.provider.digest.b.a(str, "$KeyGen", "KeyGenerator.AESWRAPPAD", a.a("$KeyGen256", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen128", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen192", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen256", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen128", "KeyGenerator", g.a("$KeyGen", "KeyGenerator.AESWRAP", str, b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen256", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen256", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen192", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen192", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen128", "KeyGenerator", b.a(configurableProvider, "KeyGenerator", o.a(a.a("$KeyGen128", "KeyGenerator", g.a("$KeyGen256", "KeyGenerator.2.16.840.1.101.3.4.42", str, g.a("$KeyGen192", "KeyGenerator.2.16.840.1.101.3.4.22", str, g.a("$KeyGen128", "KeyGenerator.2.16.840.1.101.3.4.2", str, g.a("$KeyGen", "KeyGenerator.AES", str, b.a(configurableProvider, "Alg.Alias.Cipher", "GCM", str, aSN1ObjectIdentifier6), configurableProvider), configurableProvider), configurableProvider), configurableProvider), aSN1ObjectIdentifier10, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier13, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier16), aSN1ObjectIdentifier11, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier14, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier17), aSN1ObjectIdentifier12, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier3), aSN1ObjectIdentifier15, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier18), configurableProvider), aSN1ObjectIdentifier19, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier20), aSN1ObjectIdentifier21, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier4), aSN1ObjectIdentifier5, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier6), aSN1ObjectIdentifier7, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier8), aSN1ObjectIdentifier9, configurableProvider), configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier22), aSN1ObjectIdentifier23, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier24), configurableProvider);
            sbA4.append("$AESCCMMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", sbA4.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier7.getId(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier8.getId(), "AESCCMMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier9.getId(), "AESCCMMAC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc;
            e.b(g.a("$PBEWithSHA256AESCBC192", "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str, g.a("$PBEWithSHA256AESCBC128", "Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str, g.a("$PBEWithSHA1AESCBC256", "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str, g.a("$PBEWithSHA1AESCBC192", "Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str, g.a("$PBEWithSHA1AESCBC128", "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str, b.a(configurableProvider, "Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", str, aSN1ObjectIdentifier30), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), "$PBEWithSHA256AESCBC256", configurableProvider, "Cipher.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            d.b(str, "$KeyFactory", "SecretKeyFactory.AES", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", u.b("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC", "Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC", configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("SecretKeyFactory", NISTObjectIdentifiers.aes, str + "$KeyFactory");
            d.b(str, "$PBEWithSHA256And256BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithSHA256And192BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithSHA256And128BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithSHAAnd256BitAESBC", "SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithSHAAnd192BitAESBC", "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithSHAAnd128BitAESBC", "SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithMD5And256BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithMD5And192BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithMD5And128BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", new StringBuilder(), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier25.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier26.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier27.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier28.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier29.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier30.getId(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", k3.a.a(str, "$KeyGen128"));
            addPoly1305Algorithm(configurableProvider, "AES", k3.a.a(str, "$Poly1305"), k3.a.a(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(AESEngine.newInstance()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(AESEngine.newInstance()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(AESEngine.newInstance()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new AESWrapPadEngine());
        }
    }

    static {
        HashMap map = new HashMap();
        generalAesAttributes = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
    }

    private AES() {
    }
}
