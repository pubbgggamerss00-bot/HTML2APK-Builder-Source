package org.bouncycastle.cert;

import i8.n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import k4.i;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AltSignatureAlgorithm;
import org.bouncycastle.asn1.x509.AltSignatureValue;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

/* loaded from: classes2.dex */
public class X509CertificateHolder implements Encodable, Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient Extensions extensions;
    private transient Certificate x509Certificate;

    public X509CertificateHolder(Certificate certificate) {
        init(certificate);
    }

    private void init(Certificate certificate) {
        this.x509Certificate = certificate;
        this.extensions = certificate.getTBSCertificate().getExtensions();
    }

    private static Certificate parseBytes(byte[] bArr) throws IOException {
        try {
            return Certificate.getInstance(CertUtils.parseNonEmptyASN1(bArr));
        } catch (ClassCastException e10) {
            throw new CertIOException("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new CertIOException(n.c(e11, new StringBuilder("malformed data: ")), e11);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Certificate.getInstance(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateHolder) {
            return this.x509Certificate.equals(((X509CertificateHolder) obj).x509Certificate);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.x509Certificate.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.extensions);
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return X500Name.getInstance(this.x509Certificate.getIssuer());
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Date getNotAfter() {
        return this.x509Certificate.getEndDate().getDate();
    }

    public Date getNotBefore() {
        return this.x509Certificate.getStartDate().getDate();
    }

    public BigInteger getSerialNumber() {
        return this.x509Certificate.getSerialNumber().getValue();
    }

    public byte[] getSignature() {
        return this.x509Certificate.getSignature().getOctets();
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.x509Certificate.getSignatureAlgorithm();
    }

    public X500Name getSubject() {
        return X500Name.getInstance(this.x509Certificate.getSubject());
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.x509Certificate.getSubjectPublicKeyInfo();
    }

    public int getVersion() {
        return this.x509Certificate.getVersionNumber();
    }

    public int getVersionNumber() {
        return this.x509Certificate.getVersionNumber();
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.x509Certificate.hashCode();
    }

    public boolean isAlternativeSignatureValid(ContentVerifierProvider contentVerifierProvider) throws IOException, CertException {
        TBSCertificate tBSCertificate = this.x509Certificate.getTBSCertificate();
        AltSignatureAlgorithm altSignatureAlgorithmFromExtensions = AltSignatureAlgorithm.fromExtensions(tBSCertificate.getExtensions());
        AltSignatureValue altSignatureValueFromExtensions = AltSignatureValue.fromExtensions(tBSCertificate.getExtensions());
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(AlgorithmIdentifier.getInstance(altSignatureAlgorithmFromExtensions.toASN1Primitive()));
            OutputStream outputStream = contentVerifier.getOutputStream();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(tBSCertificate.toASN1Primitive());
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (int i10 = 0; i10 != aSN1Sequence.size() - 1; i10++) {
                if (i10 != 2) {
                    aSN1EncodableVector.add(aSN1Sequence.getObjectAt(i10));
                }
            }
            aSN1EncodableVector.add(CertUtils.trimExtensions(3, tBSCertificate.getExtensions()));
            new DERSequence(aSN1EncodableVector).encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(altSignatureValueFromExtensions.getSignature().getOctets());
        } catch (Exception e10) {
            throw new CertException(i.a(e10, new StringBuilder("unable to process signature: ")), e10);
        }
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) throws IOException, CertException {
        TBSCertificate tBSCertificate = this.x509Certificate.getTBSCertificate();
        if (!CertUtils.isAlgIdEqual(tBSCertificate.getSignature(), this.x509Certificate.getSignatureAlgorithm())) {
            throw new CertException("signature invalid - algorithm identifier mismatch");
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertificate.getSignature());
            OutputStream outputStream = contentVerifier.getOutputStream();
            tBSCertificate.encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (Exception e10) {
            throw new CertException(i.a(e10, new StringBuilder("unable to process signature: ")), e10);
        }
    }

    public boolean isValidOn(Date date) {
        return (date.before(this.x509Certificate.getStartDate().getDate()) || date.after(this.x509Certificate.getEndDate().getDate())) ? false : true;
    }

    public Certificate toASN1Structure() {
        return this.x509Certificate;
    }

    public X509CertificateHolder(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }
}
