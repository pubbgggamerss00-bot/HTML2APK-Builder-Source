package org.bouncycastle.cert;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.DeltaCertificateDescriptor;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.a;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes2.dex */
public class X509v3CertificateBuilder {
    private ExtensionsGenerator extGenerator;
    private V3TBSCertificateGenerator tbsGen;

    public X509v3CertificateBuilder(X500Name x500Name, BigInteger bigInteger, Date date, Date date2, Locale locale, X500Name x500Name2, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new Time(date, locale), new Time(date2, locale), x500Name2, subjectPublicKeyInfo);
    }

    public static DERBitString booleanToBitString(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i10 = 0; i10 != zArr.length; i10++) {
            int i11 = i10 / 8;
            bArr[i11] = (byte) (bArr[i11] | (zArr[i10] ? 1 << (7 - (i10 % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new DERBitString(bArr) : new DERBitString(bArr, 8 - length);
    }

    private Extension doGetExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.extGenerator.isEmpty()) {
            return null;
        }
        return this.extGenerator.generate().getExtension(aSN1ObjectIdentifier);
    }

    private static byte[] generateSig(ContentSigner contentSigner, ASN1Object aSN1Object) throws IOException {
        OutputStream outputStream = contentSigner.getOutputStream();
        aSN1Object.encodeTo(outputStream, ASN1Encoding.DER);
        outputStream.close();
        return contentSigner.getSignature();
    }

    private static Certificate generateStructure(TBSCertificate tBSCertificate, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(algorithmIdentifier);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return Certificate.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public X509v3CertificateBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            this.extGenerator.addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable);
            return this;
        } catch (IOException e10) {
            throw new CertIOException(b.a(e10, new StringBuilder("cannot encode extension: ")), e10);
        }
    }

    public X509CertificateHolder build(ContentSigner contentSigner) {
        this.tbsGen.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.extGenerator.isEmpty()) {
            ExtensionsGenerator extensionsGenerator = this.extGenerator;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
            if (extensionsGenerator.hasExtension(aSN1ObjectIdentifier)) {
                Extension extension = this.extGenerator.getExtension(aSN1ObjectIdentifier);
                try {
                    this.extGenerator.replaceExtension(aSN1ObjectIdentifier, extension.isCritical(), DeltaCertificateDescriptor.getInstance(extension.getParsedValue()).trimTo(this.tbsGen.generateTBSCertificate(), this.extGenerator.generate()));
                } catch (IOException e10) {
                    throw new IllegalStateException(b.a(e10, new StringBuilder("unable to replace deltaCertificateDescriptor: ")));
                }
            }
            this.tbsGen.setExtensions(this.extGenerator.generate());
        }
        try {
            TBSCertificate tBSCertificateGenerateTBSCertificate = this.tbsGen.generateTBSCertificate();
            return new X509CertificateHolder(generateStructure(tBSCertificateGenerateTBSCertificate, contentSigner.getAlgorithmIdentifier(), generateSig(contentSigner, tBSCertificateGenerateTBSCertificate)));
        } catch (IOException e11) {
            throw Exceptions.illegalArgumentException("cannot produce certificate signature", e11);
        }
    }

    public X509v3CertificateBuilder copyAndAddExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, X509CertificateHolder x509CertificateHolder) {
        Extension extension = x509CertificateHolder.toASN1Structure().getTBSCertificate().getExtensions().getExtension(aSN1ObjectIdentifier);
        if (extension == null) {
            throw new NullPointerException(a.c("extension ", aSN1ObjectIdentifier, " not present"));
        }
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z10, extension.getExtnValue().getOctets());
        return this;
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier) != null;
    }

    public X509v3CertificateBuilder removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.extGenerator = CertUtils.doRemoveExtension(this.extGenerator, aSN1ObjectIdentifier);
        return this;
    }

    public X509v3CertificateBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER)));
            return this;
        } catch (IOException e10) {
            throw new CertIOException(b.a(e10, new StringBuilder("cannot encode extension: ")), e10);
        }
    }

    public X509v3CertificateBuilder setIssuerUniqueID(boolean[] zArr) {
        this.tbsGen.setIssuerUniqueID(booleanToBitString(zArr));
        return this;
    }

    public X509v3CertificateBuilder setSubjectUniqueID(boolean[] zArr) {
        this.tbsGen.setSubjectUniqueID(booleanToBitString(zArr));
        return this;
    }

    public X509v3CertificateBuilder(X500Name x500Name, BigInteger bigInteger, Date date, Date date2, X500Name x500Name2, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new Time(date), new Time(date2), x500Name2, subjectPublicKeyInfo);
    }

    public X509v3CertificateBuilder(X500Name x500Name, BigInteger bigInteger, Time time, Time time2, X500Name x500Name2, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        V3TBSCertificateGenerator v3TBSCertificateGenerator = new V3TBSCertificateGenerator();
        this.tbsGen = v3TBSCertificateGenerator;
        v3TBSCertificateGenerator.setSerialNumber(new ASN1Integer(bigInteger));
        this.tbsGen.setIssuer(x500Name);
        this.tbsGen.setStartDate(time);
        this.tbsGen.setEndDate(time2);
        this.tbsGen.setSubject(x500Name2);
        this.tbsGen.setSubjectPublicKeyInfo(subjectPublicKeyInfo);
        this.extGenerator = new ExtensionsGenerator();
    }

    public X509v3CertificateBuilder(X509CertificateHolder x509CertificateHolder) {
        V3TBSCertificateGenerator v3TBSCertificateGenerator = new V3TBSCertificateGenerator();
        this.tbsGen = v3TBSCertificateGenerator;
        v3TBSCertificateGenerator.setSerialNumber(new ASN1Integer(x509CertificateHolder.getSerialNumber()));
        this.tbsGen.setIssuer(x509CertificateHolder.getIssuer());
        this.tbsGen.setStartDate(new Time(x509CertificateHolder.getNotBefore()));
        this.tbsGen.setEndDate(new Time(x509CertificateHolder.getNotAfter()));
        this.tbsGen.setSubject(x509CertificateHolder.getSubject());
        this.tbsGen.setSubjectPublicKeyInfo(x509CertificateHolder.getSubjectPublicKeyInfo());
        this.extGenerator = new ExtensionsGenerator();
        Extensions extensions = x509CertificateHolder.getExtensions();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (!Extension.subjectAltPublicKeyInfo.equals((ASN1Primitive) aSN1ObjectIdentifier) && !Extension.altSignatureAlgorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) && !Extension.altSignatureValue.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                this.extGenerator.addExtension(extensions.getExtension(aSN1ObjectIdentifier));
            }
        }
    }

    public X509v3CertificateBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) throws CertIOException {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z10, bArr);
        return this;
    }

    public X509CertificateHolder build(ContentSigner contentSigner, boolean z10, ContentSigner contentSigner2) {
        try {
            this.extGenerator.addExtension(Extension.altSignatureAlgorithm, z10, contentSigner2.getAlgorithmIdentifier());
            ExtensionsGenerator extensionsGenerator = this.extGenerator;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.deltaCertificateDescriptor;
            if (extensionsGenerator.hasExtension(aSN1ObjectIdentifier)) {
                this.tbsGen.setSignature(contentSigner.getAlgorithmIdentifier());
                Extension extension = this.extGenerator.getExtension(aSN1ObjectIdentifier);
                DeltaCertificateDescriptor deltaCertificateDescriptor = DeltaCertificateDescriptor.getInstance(extension.getParsedValue());
                try {
                    ExtensionsGenerator extensionsGenerator2 = new ExtensionsGenerator();
                    extensionsGenerator2.addExtension(this.extGenerator.generate());
                    extensionsGenerator2.addExtension(Extension.altSignatureValue, false, (ASN1Encodable) DERNull.INSTANCE);
                    this.extGenerator.replaceExtension(aSN1ObjectIdentifier, extension.isCritical(), deltaCertificateDescriptor.trimTo(this.tbsGen.generateTBSCertificate(), extensionsGenerator2.generate()));
                } catch (IOException e10) {
                    throw new IllegalStateException(b.a(e10, new StringBuilder("unable to replace deltaCertificateDescriptor: ")));
                }
            }
            this.tbsGen.setSignature(null);
            this.tbsGen.setExtensions(this.extGenerator.generate());
            try {
                this.extGenerator.addExtension(Extension.altSignatureValue, z10, new DERBitString(generateSig(contentSigner2, this.tbsGen.generatePreTBSCertificate())));
                this.tbsGen.setSignature(contentSigner.getAlgorithmIdentifier());
                this.tbsGen.setExtensions(this.extGenerator.generate());
                TBSCertificate tBSCertificateGenerateTBSCertificate = this.tbsGen.generateTBSCertificate();
                return new X509CertificateHolder(generateStructure(tBSCertificateGenerateTBSCertificate, contentSigner.getAlgorithmIdentifier(), generateSig(contentSigner, tBSCertificateGenerateTBSCertificate)));
            } catch (IOException e11) {
                throw Exceptions.illegalArgumentException("cannot produce certificate signature", e11);
            }
        } catch (IOException e12) {
            throw Exceptions.illegalStateException("cannot add altSignatureAlgorithm extension", e12);
        }
    }

    public X509v3CertificateBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z10, bArr));
        return this;
    }

    public X509v3CertificateBuilder addExtension(Extension extension) throws CertIOException {
        this.extGenerator.addExtension(extension);
        return this;
    }

    public X509v3CertificateBuilder replaceExtension(Extension extension) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, extension);
        return this;
    }
}
