package org.bouncycastle.pqc.jcajce.provider;

import l.b;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;

/* loaded from: classes3.dex */
public class HQC {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.hqc.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyGeneratorSpi");
            HQCKeyFactorySpi hQCKeyFactorySpi = new HQCKeyFactorySpi();
            StringBuilder sbC = b.c(configurableProvider, "Cipher.HQC", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_hqc;
            org.bouncycastle.jcajce.provider.asymmetric.b.a(sbC, aSN1ObjectIdentifier, configurableProvider, "HQC");
            addCipherAlgorithm(configurableProvider, "HQC128", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC128", BCObjectIdentifiers.hqc128);
            addCipherAlgorithm(configurableProvider, "HQC192", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC192", BCObjectIdentifiers.hqc192);
            addCipherAlgorithm(configurableProvider, "HQC256", "org.bouncycastle.pqc.jcajce.provider.hqc.HQCCipherSpi$HQC256", BCObjectIdentifiers.hqc256);
            registerOid(configurableProvider, aSN1ObjectIdentifier, "HQC", hQCKeyFactorySpi);
        }
    }
}
