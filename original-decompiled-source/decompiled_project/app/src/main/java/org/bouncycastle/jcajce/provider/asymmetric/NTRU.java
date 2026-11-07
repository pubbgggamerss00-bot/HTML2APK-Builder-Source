package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: classes.dex */
public class NTRU {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntru.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
            StringBuilder sb = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_ntru;
            StringBuilder sbB = a.b("NTRU", "Alg.Alias.KeyGenerator.", sb, aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.ntruhps2048509;
            StringBuilder sbB2 = a.b("NTRU", "Alg.Alias.KeyGenerator.", sbB, aSN1ObjectIdentifier2, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.ntruhps2048677;
            StringBuilder sbB3 = a.b("NTRU", "Alg.Alias.KeyGenerator.", sbB2, aSN1ObjectIdentifier3, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.ntruhps4096821;
            StringBuilder sbB4 = a.b("NTRU", "Alg.Alias.KeyGenerator.", sbB3, aSN1ObjectIdentifier4, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.ntruhps40961229;
            StringBuilder sbB5 = a.b("NTRU", "Alg.Alias.KeyGenerator.", sbB4, aSN1ObjectIdentifier5, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.ntruhrss701;
            StringBuilder sbB6 = a.b("NTRU", "Alg.Alias.KeyGenerator.", sbB5, aSN1ObjectIdentifier6, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.ntruhrss1373;
            sbB6.append(aSN1ObjectIdentifier7);
            configurableProvider.addAlgorithm(sbB6.toString(), "NTRU");
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            configurableProvider.addAlgorithm(d.a(configurableProvider, d.a(configurableProvider, d.a(configurableProvider, d.a(configurableProvider, d.a(configurableProvider, d.a(configurableProvider, d.a(configurableProvider, "Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base", "Alg.Alias.Cipher.", aSN1ObjectIdentifier), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier2), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier3), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier4), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier5), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier6), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier7), "NTRU");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier6, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier7, "NTRU", nTRUKeyFactorySpi);
        }
    }
}
