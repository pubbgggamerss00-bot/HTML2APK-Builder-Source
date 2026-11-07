package org.bouncycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.cert.CertIOException;

/* loaded from: classes2.dex */
class CRMFUtil {
    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable);
        } catch (IOException e10) {
            throw new CertIOException(b.a(e10, new StringBuilder("cannot encode extension: ")), e10);
        }
    }

    public static void derEncodeToStream(ASN1Object aSN1Object, OutputStream outputStream) throws IOException {
        try {
            aSN1Object.encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
        } catch (IOException e10) {
            throw new CRMFRuntimeException(b.a(e10, new StringBuilder("unable to DER encode object: ")), e10);
        }
    }
}
