package org.bouncycastle.jcajce.provider.symmetric;

import c2.u;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.ISO9797Alg3Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.c;
import org.bouncycastle.jcajce.provider.digest.d;
import org.bouncycastle.jcajce.provider.digest.e;
import org.bouncycastle.jcajce.provider.digest.f;
import org.bouncycastle.jcajce.provider.digest.g;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes.dex */
public final class DES {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws InvalidParameterSpecException {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new DESEngine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new CBCBlockCipherMac(new DESEngine()));
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new DESEngine()));
        }
    }

    public static class DES64 extends BaseMac {
        public DES64() {
            super(new CBCBlockCipherMac(new DESEngine(), 64));
        }
    }

    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new CBCBlockCipherMac(new DESEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new ISO9797Alg3Mac(new DESEngine()));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new ISO9797Alg3Mac(new DESEngine(), new ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new CFBBlockCipherMac(new DESEngine()));
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, int i10, int i11, int i12, int i13) {
            super(str, aSN1ObjectIdentifier);
            this.forCipher = z10;
            this.scheme = i10;
            this.digest = i11;
            this.keySize = i12;
            this.ivSize = i13;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() != null) {
                CipherParameters cipherParametersMakePBEParameters = this.forCipher ? PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize);
                DESParameters.setOddParity((cipherParametersMakePBEParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParametersMakePBEParameters).getParameters() : (KeyParameter) cipherParametersMakePBEParameters).getKey());
                return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, cipherParametersMakePBEParameters);
            }
            int i10 = this.scheme;
            if (i10 == 0 || i10 == 4) {
                return new PBKDF1Key(pBEKeySpec.getPassword(), this.scheme == 0 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
            }
            return new BCPBEKey(this.algName, this.algOid, i10, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new DESEngine());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
            if (!DESKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            try {
                return new DESKeySpec(secretKey.getEncoded());
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new DESKeyGenerator());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.generateKey(), this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i10, SecureRandom secureRandom) {
            super.engineInit(i10, secureRandom);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier.getId(), str);
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier.getId(), str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            d.b(str, "$ECB", "Cipher.DES", sb, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desCBC;
            c.b(configurableProvider, str, "$CBC", "Cipher", aSN1ObjectIdentifier);
            addAlias(configurableProvider, aSN1ObjectIdentifier, "DES");
            configurableProvider.addAlgorithm("Cipher.DESRFC3211WRAP", str + "$RFC3211");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            e.b(g.a("$CMAC", "Mac.DESCMAC", str, g.a("$KeyFactory", "SecretKeyFactory.DES", str, g.a("$KeyGenerator", "KeyGenerator.DES", str, sb2, configurableProvider), configurableProvider), configurableProvider), "$CBCMAC", configurableProvider, "Mac.DESMAC");
            d.b(str, "$DES64", "Mac.DESMAC64", u.b("Mac.DESMAC/CFB8", f.a("Alg.Alias.Mac.DES", "DESMAC", str, "$DESCFB8", configurableProvider), "Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8", configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", f.a("Alg.Alias.Mac.DES64", "DESMAC64", str, "$DES64with7816d4", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            d.b(str, "$DES9797Alg3", "Mac.DESWITHISO9797", u.b("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING", "Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING", configurableProvider), configurableProvider);
            d.b(str, "$DES9797Alg3with7816d4", "Mac.ISO9797ALG3WITHISO7816-4PADDING", u.b("Mac.ISO9797ALG3MAC", f.a("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797", str, "$DES9797Alg3", configurableProvider), "Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC", configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            StringBuilder sbA = b.a(configurableProvider, "Alg.Alias.AlgorithmParameters", "DES", str, aSN1ObjectIdentifier);
            sbA.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DES", sbA.toString());
            e.b(g.a("$PBEWithMD5", "Cipher.PBEWITHMD5ANDDES", str, g.a("$PBEWithMD2", "Cipher.PBEWITHMD2ANDDES", str, org.bouncycastle.jcajce.provider.digest.a.a("DES", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider), configurableProvider), configurableProvider), "$PBEWithSHA1", configurableProvider, "Cipher.PBEWITHSHA1ANDDES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier2, "PBEWITHMD2ANDDES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier3, "PBEWITHMD5ANDDES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier4, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            d.b(str, "$PBEWithSHA1KeyFactory", "SecretKeyFactory.PBEWITHSHA1ANDDES", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithMD5KeyFactory", "SecretKeyFactory.PBEWITHMD5ANDDES", org.bouncycastle.jcajce.provider.digest.b.a(str, "$PBEWithMD2KeyFactory", "SecretKeyFactory.PBEWITHMD2ANDDES", u.b("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES", "Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES", configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + aSN1ObjectIdentifier2, "PBEWITHMD2ANDDES");
            org.bouncycastle.jcajce.provider.asymmetric.b.a(org.bouncycastle.jcajce.provider.asymmetric.a.b("PBEWITHMD5ANDDES", "Alg.Alias.SecretKeyFactory.", new StringBuilder("Alg.Alias.SecretKeyFactory."), aSN1ObjectIdentifier3, configurableProvider), aSN1ObjectIdentifier4, configurableProvider, "PBEWITHSHA1ANDDES");
        }
    }

    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new CBCBlockCipher(new DESEngine()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, true, 0, 1, 64, 64);
        }
    }

    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new RFC3211WrapEngine(new DESEngine()), 8);
        }
    }

    private DES() {
    }
}
