package org.bouncycastle.cert;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;

/* loaded from: classes2.dex */
public class DeltaCertificateTool {
    public static X509CertificateHolder extractDeltaCertificate(X509CertificateHolder x509CertificateHolder) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x509CertificateHolder.getExtension(Extension.deltaCertificateDescriptor).getParsedValue());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x509CertificateHolder.toASN1Structure().getTBSCertificate().toASN1Primitive());
        ASN1Encodable[] array = aSN1Sequence2.toArray();
        array[0] = aSN1Sequence2.getObjectAt(0);
        array[1] = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        int i10 = 2;
        while (objectAt instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                array[2] = ASN1Sequence.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                array[3] = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 2) {
                array[4] = ASN1Sequence.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 3) {
                array[5] = ASN1Sequence.getInstance((ASN1TaggedObject) objectAt, true);
            }
            int i11 = i10 + 1;
            ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i10);
            i10 = i11;
            objectAt = objectAt2;
        }
        array[6] = objectAt;
        if (array[2] == null) {
            array[2] = aSN1Sequence2.getObjectAt(2);
        }
        if (array[3] == null) {
            array[3] = aSN1Sequence2.getObjectAt(3);
        }
        if (array[4] == null) {
            array[4] = aSN1Sequence2.getObjectAt(4);
        }
        if (array[5] == null) {
            array[5] = aSN1Sequence2.getObjectAt(5);
        }
        ExtensionsGenerator extensionsGeneratorExtractExtensions = extractExtensions(aSN1Sequence2);
        if (i10 < aSN1Sequence.size() - 1) {
            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            if (aSN1TaggedObject2.getTagNo() != 4) {
                throw new IllegalArgumentException("malformed delta extension");
            }
            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1TaggedObject2, false);
            for (int i12 = 0; i12 != aSN1Sequence3.size(); i12++) {
                extensionsGeneratorExtractExtensions.replaceExtension(Extension.getInstance(aSN1Sequence3.getObjectAt(i12)));
            }
            array[7] = new DERTaggedObject(3, extensionsGeneratorExtractExtensions.generate());
        } else if (extensionsGeneratorExtractExtensions.isEmpty()) {
            array[7] = null;
        } else {
            array[7] = new DERTaggedObject(3, extensionsGeneratorExtractExtensions.generate());
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        for (int i13 = 0; i13 != array.length; i13++) {
            ASN1Encodable aSN1Encodable = array[i13];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(aSN1Encodable);
            }
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector2.add(ASN1Sequence.getInstance(array[2]));
        aSN1EncodableVector2.add(ASN1BitString.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)));
        return new X509CertificateHolder(Certificate.getInstance(new DERSequence(aSN1EncodableVector2)));
    }

    private static ExtensionsGenerator extractExtensions(ASN1Sequence aSN1Sequence) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)), true);
        ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
        for (int i10 = 0; i10 != aSN1Sequence2.size(); i10++) {
            Extension extension = Extension.getInstance(aSN1Sequence2.getObjectAt(i10));
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) extension.getExtnId())) {
                extensionsGenerator.addExtension(extension);
            }
        }
        return extensionsGenerator;
    }

    public static Extension makeDeltaCertificateExtension(boolean z10, X509CertificateHolder x509CertificateHolder) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(x509CertificateHolder.getSerialNumber()));
        aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) x509CertificateHolder.getSignatureAlgorithm()));
        aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) x509CertificateHolder.getIssuer()));
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
        aSN1EncodableVector2.add(x509CertificateHolder.toASN1Structure().getStartDate());
        aSN1EncodableVector2.add(x509CertificateHolder.toASN1Structure().getEndDate());
        aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) new DERSequence(aSN1EncodableVector2)));
        aSN1EncodableVector.add(new DERTaggedObject(false, 3, (ASN1Encodable) x509CertificateHolder.getSubject()));
        aSN1EncodableVector.add(x509CertificateHolder.getSubjectPublicKeyInfo());
        if (x509CertificateHolder.getExtensions() != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, (ASN1Encodable) x509CertificateHolder.getExtensions()));
        }
        aSN1EncodableVector.add(new DERBitString(x509CertificateHolder.getSignature()));
        return new Extension(Extension.deltaCertificateDescriptor, z10, new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
    }
}
