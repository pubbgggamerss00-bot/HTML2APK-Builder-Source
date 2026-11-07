package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;

/* loaded from: classes.dex */
public abstract class CompositeSignaturesConstants {
    public static final HashMap<ASN1ObjectIdentifier, CompositeName> ASN1IdentifierAlgorithmNameMap;
    public static final HashMap<ASN1ObjectIdentifier, CompositeName> ASN1IdentifierCompositeNameMap;
    public static final HashMap<CompositeName, ASN1ObjectIdentifier> compositeNameASN1IdentifierMap;
    public static final ASN1ObjectIdentifier[] supportedIdentifiers;

    public enum CompositeName {
        MLDSA44_RSA2048_PSS_SHA256("MLDSA44-RSA2048-PSS-SHA256"),
        MLDSA44_RSA2048_PKCS15_SHA256("MLDSA44-RSA2048-PKCS15-SHA256"),
        MLDSA44_Ed25519_SHA512("MLDSA44-Ed25519-SHA512"),
        MLDSA44_ECDSA_P256_SHA256("MLDSA44-ECDSA-P256-SHA256"),
        MLDSA44_ECDSA_brainpoolP256r1_SHA256("MLDSA44-ECDSA-brainpoolP256r1-SHA256"),
        MLDSA65_RSA3072_PSS_SHA512("MLDSA65-RSA3072-PSS-SHA512"),
        MLDSA65_RSA3072_PKCS15_SHA512("MLDSA65-RSA3072-PKCS15-SHA512"),
        MLDSA65_ECDSA_brainpoolP256r1_SHA512("MLDSA65-ECDSA-brainpoolP256r1-SHA512"),
        MLDSA65_ECDSA_P256_SHA512("MLDSA65-ECDSA-P256-SHA512"),
        MLDSA65_Ed25519_SHA512("MLDSA65-Ed25519-SHA512"),
        MLDSA87_ECDSA_P384_SHA512("MLDSA87-ECDSA-P384-SHA512"),
        MLDSA87_ECDSA_brainpoolP384r1_SHA512("MLDSA87-ECDSA-brainpoolP384r1-SHA512"),
        MLDSA87_Ed448_SHA512("MLDSA87-Ed448-SHA512"),
        Falcon512_ECDSA_P256_SHA256("Falcon512-ECDSA-P256-SHA256"),
        Falcon512_ECDSA_brainpoolP256r1_SHA256("Falcon512-ECDSA-brainpoolP256r1-SHA256"),
        Falcon512_Ed25519_SHA512("Falcon512-Ed25519-SHA512");


        /* renamed from: id, reason: collision with root package name */
        private final String f20114id;

        CompositeName(String str) {
            this.f20114id = str;
        }

        public String getId() {
            return this.f20114id;
        }
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = MiscObjectIdentifiers.id_MLDSA44_Ed25519_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = MiscObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = MiscObjectIdentifiers.id_MLDSA44_ECDSA_brainpoolP256r1_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = MiscObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = MiscObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = MiscObjectIdentifiers.id_MLDSA65_Ed25519_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = MiscObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = MiscObjectIdentifiers.id_MLDSA87_Ed448_SHA512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = MiscObjectIdentifiers.id_Falcon512_ECDSA_P256_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = MiscObjectIdentifiers.id_Falcon512_ECDSA_brainpoolP256r1_SHA256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = MiscObjectIdentifiers.id_Falcon512_Ed25519_SHA512;
        supportedIdentifiers = new ASN1ObjectIdentifier[]{aSN1ObjectIdentifier, aSN1ObjectIdentifier2, aSN1ObjectIdentifier3, aSN1ObjectIdentifier4, aSN1ObjectIdentifier5, aSN1ObjectIdentifier6, aSN1ObjectIdentifier7, aSN1ObjectIdentifier8, aSN1ObjectIdentifier9, aSN1ObjectIdentifier10, aSN1ObjectIdentifier11, aSN1ObjectIdentifier12, aSN1ObjectIdentifier13, aSN1ObjectIdentifier14, aSN1ObjectIdentifier15, aSN1ObjectIdentifier16};
        HashMap<CompositeName, ASN1ObjectIdentifier> map = new HashMap<>();
        compositeNameASN1IdentifierMap = map;
        map.put(CompositeName.MLDSA44_RSA2048_PSS_SHA256, aSN1ObjectIdentifier);
        map.put(CompositeName.MLDSA44_RSA2048_PKCS15_SHA256, aSN1ObjectIdentifier2);
        map.put(CompositeName.MLDSA44_ECDSA_P256_SHA256, aSN1ObjectIdentifier4);
        map.put(CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256, aSN1ObjectIdentifier5);
        map.put(CompositeName.MLDSA44_Ed25519_SHA512, aSN1ObjectIdentifier3);
        map.put(CompositeName.MLDSA65_RSA3072_PSS_SHA512, aSN1ObjectIdentifier6);
        map.put(CompositeName.MLDSA65_RSA3072_PKCS15_SHA512, aSN1ObjectIdentifier7);
        map.put(CompositeName.MLDSA65_ECDSA_P256_SHA512, aSN1ObjectIdentifier8);
        map.put(CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512, aSN1ObjectIdentifier9);
        map.put(CompositeName.MLDSA65_Ed25519_SHA512, aSN1ObjectIdentifier10);
        map.put(CompositeName.MLDSA87_ECDSA_P384_SHA512, aSN1ObjectIdentifier11);
        map.put(CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512, aSN1ObjectIdentifier12);
        map.put(CompositeName.MLDSA87_Ed448_SHA512, aSN1ObjectIdentifier13);
        map.put(CompositeName.Falcon512_ECDSA_P256_SHA256, aSN1ObjectIdentifier14);
        map.put(CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256, aSN1ObjectIdentifier15);
        map.put(CompositeName.Falcon512_Ed25519_SHA512, aSN1ObjectIdentifier16);
        ASN1IdentifierCompositeNameMap = new HashMap<>();
        for (Map.Entry<CompositeName, ASN1ObjectIdentifier> entry : map.entrySet()) {
            ASN1IdentifierCompositeNameMap.put(entry.getValue(), entry.getKey());
        }
        ASN1IdentifierAlgorithmNameMap = new HashMap<>();
        for (ASN1ObjectIdentifier aSN1ObjectIdentifier17 : supportedIdentifiers) {
            ASN1IdentifierAlgorithmNameMap.put(aSN1ObjectIdentifier17, ASN1IdentifierCompositeNameMap.get(aSN1ObjectIdentifier17));
        }
    }

    private CompositeSignaturesConstants() {
    }
}
