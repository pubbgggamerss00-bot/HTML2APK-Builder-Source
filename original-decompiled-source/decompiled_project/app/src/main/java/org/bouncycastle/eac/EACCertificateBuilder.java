package org.bouncycastle.eac;

import java.io.IOException;
import java.io.OutputStream;
import k4.i;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.eac.CVCertificate;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.bouncycastle.asn1.eac.CertificationAuthorityReference;
import org.bouncycastle.asn1.eac.PackedDate;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSigner;

/* loaded from: classes2.dex */
public class EACCertificateBuilder {
    private static final byte[] ZeroArray = {0};
    private PackedDate certificateEffectiveDate;
    private PackedDate certificateExpirationDate;
    private CertificateHolderAuthorization certificateHolderAuthorization;
    private CertificateHolderReference certificateHolderReference;
    private CertificationAuthorityReference certificationAuthorityReference;
    private PublicKeyDataObject publicKey;

    public EACCertificateBuilder(CertificationAuthorityReference certificationAuthorityReference, PublicKeyDataObject publicKeyDataObject, CertificateHolderReference certificateHolderReference, CertificateHolderAuthorization certificateHolderAuthorization, PackedDate packedDate, PackedDate packedDate2) {
        this.certificationAuthorityReference = certificationAuthorityReference;
        this.publicKey = publicKeyDataObject;
        this.certificateHolderReference = certificateHolderReference;
        this.certificateHolderAuthorization = certificateHolderAuthorization;
        this.certificateEffectiveDate = packedDate;
        this.certificateExpirationDate = packedDate2;
    }

    private CertificateBody buildBody() {
        return new CertificateBody(new DERTaggedObject(false, 64, 41, (ASN1Encodable) new DEROctetString(ZeroArray)), this.certificationAuthorityReference, this.publicKey, this.certificateHolderReference, this.certificateHolderAuthorization, this.certificateEffectiveDate, this.certificateExpirationDate);
    }

    public EACCertificateHolder build(EACSigner eACSigner) throws EACException, IOException {
        try {
            CertificateBody certificateBodyBuildBody = buildBody();
            OutputStream outputStream = eACSigner.getOutputStream();
            outputStream.write(certificateBodyBuildBody.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return new EACCertificateHolder(new CVCertificate(certificateBodyBuildBody, eACSigner.getSignature()));
        } catch (Exception e10) {
            throw new EACException(i.a(e10, new StringBuilder("unable to process signature: ")), e10);
        }
    }
}
