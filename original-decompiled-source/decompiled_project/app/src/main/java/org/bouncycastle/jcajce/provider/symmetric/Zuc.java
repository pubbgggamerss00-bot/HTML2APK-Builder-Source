package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.digest.d;
import org.bouncycastle.jcajce.provider.digest.f;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes.dex */
public class Zuc {

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Zuc IV";
        }
    }

    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            d.b(str, "$ZucMac256", "Mac.ZUC-256", org.bouncycastle.jcajce.provider.digest.b.a(str, "$ZucMac128", "Mac.ZUC-128", org.bouncycastle.jcajce.provider.digest.b.a(str, "$AlgParams", "AlgorithmParameters.ZUC-256", org.bouncycastle.jcajce.provider.digest.b.a(str, "$KeyGen256", "KeyGenerator.ZUC-256", org.bouncycastle.jcajce.provider.digest.b.a(str, "$Zuc256", "Cipher.ZUC-256", org.bouncycastle.jcajce.provider.digest.b.a(str, "$AlgParams", "AlgorithmParameters.ZUC-128", org.bouncycastle.jcajce.provider.digest.b.a(str, "$KeyGen128", "KeyGenerator.ZUC-128", org.bouncycastle.jcajce.provider.digest.b.a(str, "$Zuc128", "Cipher.ZUC-128", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", f.a("Mac.ZUC-256-64", f.a("Alg.Alias.Mac.ZUC-256-128", "ZUC-256", str, "$ZucMac256_64", configurableProvider), str, "$ZucMac256_32", configurableProvider));
        }
    }

    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new Zuc128Engine(), 16, 128);
        }
    }

    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new Zuc256Engine(), 25, 256);
        }
    }

    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new Zuc128Mac());
        }
    }

    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new Zuc256Mac(128));
        }
    }

    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new Zuc256Mac(32));
        }
    }

    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new Zuc256Mac(64));
        }
    }

    private Zuc() {
    }
}
