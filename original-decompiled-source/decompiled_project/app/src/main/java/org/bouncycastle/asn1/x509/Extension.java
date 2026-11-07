package org.bouncycastle.asn1.x509;

import b.o;
import com.google.android.recaptcha.internal.e;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.c;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class Extension extends ASN1Object {
    private boolean critical;
    private ASN1ObjectIdentifier extnId;
    private ASN1OctetString value;
    public static final ASN1ObjectIdentifier subjectDirectoryAttributes = o.c("2.5.29.9");
    public static final ASN1ObjectIdentifier subjectKeyIdentifier = o.c("2.5.29.14");
    public static final ASN1ObjectIdentifier keyUsage = o.c("2.5.29.15");
    public static final ASN1ObjectIdentifier privateKeyUsagePeriod = o.c("2.5.29.16");
    public static final ASN1ObjectIdentifier subjectAlternativeName = o.c("2.5.29.17");
    public static final ASN1ObjectIdentifier issuerAlternativeName = o.c("2.5.29.18");
    public static final ASN1ObjectIdentifier basicConstraints = o.c("2.5.29.19");
    public static final ASN1ObjectIdentifier cRLNumber = o.c("2.5.29.20");
    public static final ASN1ObjectIdentifier reasonCode = o.c("2.5.29.21");
    public static final ASN1ObjectIdentifier instructionCode = o.c("2.5.29.23");
    public static final ASN1ObjectIdentifier invalidityDate = o.c("2.5.29.24");
    public static final ASN1ObjectIdentifier deltaCRLIndicator = o.c("2.5.29.27");
    public static final ASN1ObjectIdentifier issuingDistributionPoint = o.c("2.5.29.28");
    public static final ASN1ObjectIdentifier certificateIssuer = o.c("2.5.29.29");
    public static final ASN1ObjectIdentifier nameConstraints = o.c("2.5.29.30");
    public static final ASN1ObjectIdentifier cRLDistributionPoints = o.c("2.5.29.31");
    public static final ASN1ObjectIdentifier certificatePolicies = o.c("2.5.29.32");
    public static final ASN1ObjectIdentifier policyMappings = o.c("2.5.29.33");
    public static final ASN1ObjectIdentifier authorityKeyIdentifier = o.c("2.5.29.35");
    public static final ASN1ObjectIdentifier policyConstraints = o.c("2.5.29.36");
    public static final ASN1ObjectIdentifier extendedKeyUsage = o.c("2.5.29.37");
    public static final ASN1ObjectIdentifier freshestCRL = o.c("2.5.29.46");
    public static final ASN1ObjectIdentifier inhibitAnyPolicy = o.c("2.5.29.54");
    public static final ASN1ObjectIdentifier authorityInfoAccess = o.c("1.3.6.1.5.5.7.1.1");
    public static final ASN1ObjectIdentifier subjectInfoAccess = o.c("1.3.6.1.5.5.7.1.11");
    public static final ASN1ObjectIdentifier logoType = o.c("1.3.6.1.5.5.7.1.12");
    public static final ASN1ObjectIdentifier biometricInfo = o.c("1.3.6.1.5.5.7.1.2");
    public static final ASN1ObjectIdentifier qCStatements = o.c("1.3.6.1.5.5.7.1.3");
    public static final ASN1ObjectIdentifier auditIdentity = o.c("1.3.6.1.5.5.7.1.4");
    public static final ASN1ObjectIdentifier noRevAvail = o.c("2.5.29.56");
    public static final ASN1ObjectIdentifier targetInformation = o.c("2.5.29.55");
    public static final ASN1ObjectIdentifier expiredCertsOnCRL = o.c("2.5.29.60");
    public static final ASN1ObjectIdentifier subjectAltPublicKeyInfo = o.c("2.5.29.72");
    public static final ASN1ObjectIdentifier altSignatureAlgorithm = o.c("2.5.29.73");
    public static final ASN1ObjectIdentifier altSignatureValue = o.c("2.5.29.74");
    public static final ASN1ObjectIdentifier deltaCertificateDescriptor = new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.1");

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Boolean aSN1Boolean, ASN1OctetString aSN1OctetString) {
        this(aSN1ObjectIdentifier, aSN1Boolean.isTrue(), aSN1OctetString);
    }

    private static ASN1Primitive convertValueToObject(Extension extension) throws IllegalArgumentException {
        try {
            return ASN1Primitive.fromByteArray(extension.getExtnValue().getOctets());
        } catch (IOException e10) {
            throw new IllegalArgumentException(c.a("can't convert extension: ", e10));
        }
    }

    public static Extension create(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws IOException {
        return new Extension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded());
    }

    public static Extension getInstance(Object obj) {
        if (obj instanceof Extension) {
            return (Extension) obj;
        }
        if (obj != null) {
            return new Extension(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (!(obj instanceof Extension)) {
            return false;
        }
        Extension extension = (Extension) obj;
        return extension.getExtnId().equals((ASN1Primitive) getExtnId()) && extension.getExtnValue().equals((ASN1Primitive) getExtnValue()) && extension.isCritical() == isCritical();
    }

    public ASN1ObjectIdentifier getExtnId() {
        return this.extnId;
    }

    public ASN1OctetString getExtnValue() {
        return this.value;
    }

    public ASN1Encodable getParsedValue() {
        return convertValueToObject(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isCritical() ? getExtnValue().hashCode() ^ getExtnId().hashCode() : ~(getExtnValue().hashCode() ^ getExtnId().hashCode());
    }

    public boolean isCritical() {
        return this.critical;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.extnId);
        if (this.critical) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(true));
        }
        return e.b(aSN1EncodableVector, this.value, aSN1EncodableVector);
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1OctetString aSN1OctetString) {
        this.extnId = aSN1ObjectIdentifier;
        this.critical = z10;
        this.value = aSN1OctetString;
    }

    public Extension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        this(aSN1ObjectIdentifier, z10, new DEROctetString(Arrays.clone(bArr)));
    }

    private Extension(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 2) {
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = false;
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException(i8.e.b(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
            }
            this.extnId = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.critical = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(1)).isTrue();
            objectAt = aSN1Sequence.getObjectAt(2);
        }
        this.value = ASN1OctetString.getInstance(objectAt);
    }
}
