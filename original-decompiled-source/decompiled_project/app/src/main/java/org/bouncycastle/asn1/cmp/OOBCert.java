package org.bouncycastle.asn1.cmp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import p.i0;

/* loaded from: classes2.dex */
public class OOBCert extends CMPCertificate {
    public OOBCert(int i10, ASN1Object aSN1Object) {
        super(i10, aSN1Object);
    }

    public static OOBCert getInstance(Object obj) {
        if (obj == null || (obj instanceof OOBCert)) {
            return (OOBCert) obj;
        }
        if (obj instanceof CMPCertificate) {
            try {
                return getInstance((Object) ((CMPCertificate) obj).getEncoded());
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            }
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Invalid encoding in OOBCert");
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new OOBCert(Certificate.getInstance(obj));
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(i0.a(obj, "Invalid object: "));
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj, 128);
        return new OOBCert(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getExplicitBaseObject());
    }

    public OOBCert(AttributeCertificate attributeCertificate) {
        super(1, attributeCertificate);
    }

    public OOBCert(Certificate certificate) {
        super(certificate);
    }

    public static OOBCert getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (aSN1TaggedObject == null) {
            return null;
        }
        if (z10) {
            return getInstance((Object) aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("tag must be explicit");
    }
}
