package org.bouncycastle.jcajce;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;

/* loaded from: classes.dex */
public class CompositePublicKey implements PublicKey {
    private final ASN1ObjectIdentifier algorithmIdentifier;
    private final List<PublicKey> keys;

    public CompositePublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey... publicKeyArr) {
        this.algorithmIdentifier = aSN1ObjectIdentifier;
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided for the composite public key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (PublicKey publicKey : publicKeyArr) {
            arrayList.add(publicKey);
        }
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompositePublicKey) {
            CompositePublicKey compositePublicKey = (CompositePublicKey) obj;
            if (compositePublicKey.getAlgorithmIdentifier().equals((ASN1Primitive) this.algorithmIdentifier) && this.keys.equals(compositePublicKey.keys)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return CompositeSignaturesConstants.ASN1IdentifierAlgorithmNameMap.get(this.algorithmIdentifier).getId();
    }

    public ASN1ObjectIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i10 = 0; i10 < this.keys.size(); i10++) {
            aSN1EncodableVector.add(this.algorithmIdentifier.equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key) ? SubjectPublicKeyInfo.getInstance(this.keys.get(i10).getEncoded()) : SubjectPublicKeyInfo.getInstance(this.keys.get(i10).getEncoded()).getPublicKeyData());
        }
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(this.algorithmIdentifier), new DERSequence(aSN1EncodableVector)).getEncoded(ASN1Encoding.DER);
        } catch (IOException e10) {
            throw new IllegalStateException(b.a(e10, new StringBuilder("unable to encode composite public key: ")));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public List<PublicKey> getPublicKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public CompositePublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            if (!Arrays.asList(CompositeSignaturesConstants.supportedIdentifiers).contains(subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            CompositePublicKey compositePublicKey = (CompositePublicKey) new KeyFactorySpi().generatePublic(subjectPublicKeyInfo);
            if (compositePublicKey == null) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            this.keys = compositePublicKey.getPublicKeys();
            this.algorithmIdentifier = compositePublicKey.getAlgorithmIdentifier();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public CompositePublicKey(PublicKey... publicKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, publicKeyArr);
    }
}
