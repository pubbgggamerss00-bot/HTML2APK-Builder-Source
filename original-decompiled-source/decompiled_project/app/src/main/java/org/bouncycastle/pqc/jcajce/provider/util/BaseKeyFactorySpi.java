package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cms.a;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.bike.b;

/* loaded from: classes3.dex */
public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final ASN1ObjectIdentifier keyOid;
    private final Set<ASN1ObjectIdentifier> keyOids;

    public BaseKeyFactorySpi(Set<ASN1ObjectIdentifier> set) {
        this.keyOid = null;
        this.keyOids = set;
    }

    private void checkAlgorithm(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws InvalidKeySpecException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.keyOid;
        if (aSN1ObjectIdentifier2 != null) {
            if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new InvalidKeySpecException(a.a("incorrect algorithm OID for key: ", aSN1ObjectIdentifier));
            }
        } else if (!this.keyOids.contains(aSN1ObjectIdentifier)) {
            throw new InvalidKeySpecException(a.a("incorrect algorithm OID for key: ", aSN1ObjectIdentifier));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(b.a(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            return generatePrivate(privateKeyInfo);
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            return generatePublic(subjectPublicKeyInfo);
        } catch (Exception e10) {
            throw new InvalidKeySpecException(e10.toString());
        }
    }

    public BaseKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.keyOid = aSN1ObjectIdentifier;
        this.keyOids = null;
    }
}
