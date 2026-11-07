package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* loaded from: classes.dex */
public class SHA256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(SHA256Digest.newInstance());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = SHA256Digest.newInstance(this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(SHA256Digest.newInstance()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            d.b(str, "$Digest", "MessageDigest.SHA-256", sb, configurableProvider);
            StringBuilder sbC = l.b.c(configurableProvider, "Alg.Alias.MessageDigest.SHA256", "SHA-256", "Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
            e.b(a.a("SHA-256", str, sbC, aSN1ObjectIdentifier, configurableProvider), "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACSHA256");
            addHMACAlgorithm(configurableProvider, "SHA256", f.a("Mac.PBEWITHHMACSHA256", f.a(org.bouncycastle.jcajce.provider.asymmetric.d.a(configurableProvider, "Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256", "Alg.Alias.SecretKeyFactory.", aSN1ObjectIdentifier), "PBEWITHHMACSHA256", str, "$HashMac", configurableProvider), str, "$HashMac", configurableProvider), k3.a.a(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
            addHMACAlias(configurableProvider, "SHA256", aSN1ObjectIdentifier);
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}
