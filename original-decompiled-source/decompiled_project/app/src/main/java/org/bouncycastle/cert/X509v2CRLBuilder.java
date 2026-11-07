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
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes2.dex */
public class X509v2CRLBuilder {
    private ExtensionsGenerator extGenerator;
    private V2TBSCertListGenerator tbsGen;

    public X509v2CRLBuilder(X500Name x500Name, Date date) {
        this.tbsGen = new V2TBSCertListGenerator();
        this.extGenerator = new ExtensionsGenerator();
        this.tbsGen.setIssuer(x500Name);
        this.tbsGen.setThisUpdate(new Time(date));
    }

    private Extension doGetExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.extGenerator.isEmpty()) {
            return null;
        }
        return this.extGenerator.generate().getExtension(aSN1ObjectIdentifier);
    }

    private static CertificateList generateCRLStructure(TBSCertList tBSCertList, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertList);
        aSN1EncodableVector.add(algorithmIdentifier);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return CertificateList.getInstance(new DERSequence(aSN1EncodableVector));
    }

    private static X509CRLHolder generateFullCRL(ContentSigner contentSigner, TBSCertList tBSCertList) {
        try {
            return new X509CRLHolder(generateCRLStructure(tBSCertList, contentSigner.getAlgorithmIdentifier(), generateSig(contentSigner, tBSCertList)));
        } catch (IOException e10) {
            throw Exceptions.illegalStateException("cannot produce certificate signature", e10);
        }
    }

    private static byte[] generateSig(ContentSigner contentSigner, ASN1Object aSN1Object) throws IOException {
        OutputStream outputStream = contentSigner.getOutputStream();
        aSN1Object.encodeTo(outputStream, ASN1Encoding.DER);
        outputStream.close();
        return contentSigner.getSignature();
    }

    public X509v2CRLBuilder addCRL(X509CRLHolder x509CRLHolder) {
        TBSCertList tBSCertList = x509CRLHolder.toASN1Structure().getTBSCertList();
        if (tBSCertList != null) {
            Enumeration revokedCertificateEnumeration = tBSCertList.getRevokedCertificateEnumeration();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                this.tbsGen.addCRLEntry(ASN1Sequence.getInstance(((ASN1Encodable) revokedCertificateEnumeration.nextElement()).toASN1Primitive()));
            }
        }
        return this;
    }

    public X509v2CRLBuilder addCRLEntry(BigInteger bigInteger, Date date, int i10) {
        this.tbsGen.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), i10);
        return this;
    }

    public X509v2CRLBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws CertIOException {
        CertUtils.addExtension(this.extGenerator, aSN1ObjectIdentifier, z10, aSN1Encodable);
        return this;
    }

    public X509CRLHolder build(ContentSigner contentSigner) {
        this.tbsGen.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.extGenerator.isEmpty()) {
            this.tbsGen.setExtensions(this.extGenerator.generate());
        }
        return generateFullCRL(contentSigner, this.tbsGen.generateTBSCertList());
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return doGetExtension(aSN1ObjectIdentifier) != null;
    }

    public X509v2CRLBuilder removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.extGenerator = CertUtils.doRemoveExtension(this.extGenerator, aSN1ObjectIdentifier);
        return this;
    }

    public X509v2CRLBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) throws CertIOException {
        try {
            this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER)));
            return this;
        } catch (IOException e10) {
            throw new CertIOException(b.a(e10, new StringBuilder("cannot encode extension: ")), e10);
        }
    }

    public X509v2CRLBuilder setNextUpdate(Date date) {
        return setNextUpdate(new Time(date));
    }

    public X509v2CRLBuilder setThisUpdate(Date date) {
        return setThisUpdate(new Time(date));
    }

    public X509v2CRLBuilder(X500Name x500Name, Date date, Locale locale) {
        this.tbsGen = new V2TBSCertListGenerator();
        this.extGenerator = new ExtensionsGenerator();
        this.tbsGen.setIssuer(x500Name);
        this.tbsGen.setThisUpdate(new Time(date, locale));
    }

    public X509v2CRLBuilder addCRLEntry(BigInteger bigInteger, Date date, int i10, Date date2) {
        this.tbsGen.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), i10, new ASN1GeneralizedTime(date2));
        return this;
    }

    public X509v2CRLBuilder addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) throws CertIOException {
        this.extGenerator.addExtension(aSN1ObjectIdentifier, z10, bArr);
        return this;
    }

    public X509CRLHolder build(ContentSigner contentSigner, boolean z10, ContentSigner contentSigner2) {
        this.tbsGen.setSignature(null);
        try {
            this.extGenerator.addExtension(Extension.altSignatureAlgorithm, z10, contentSigner2.getAlgorithmIdentifier());
            this.tbsGen.setExtensions(this.extGenerator.generate());
            try {
                this.extGenerator.addExtension(Extension.altSignatureValue, z10, new DERBitString(generateSig(contentSigner2, this.tbsGen.generatePreTBSCertList())));
                this.tbsGen.setSignature(contentSigner.getAlgorithmIdentifier());
                this.tbsGen.setExtensions(this.extGenerator.generate());
                TBSCertList tBSCertListGenerateTBSCertList = this.tbsGen.generateTBSCertList();
                return new X509CRLHolder(generateCRLStructure(tBSCertListGenerateTBSCertList, contentSigner.getAlgorithmIdentifier(), generateSig(contentSigner, tBSCertListGenerateTBSCertList)));
            } catch (IOException e10) {
                throw Exceptions.illegalArgumentException("cannot produce certificate signature", e10);
            }
        } catch (IOException e11) {
            throw Exceptions.illegalStateException("cannot add altSignatureAlgorithm extension", e11);
        }
    }

    public X509v2CRLBuilder setNextUpdate(Date date, Locale locale) {
        return setNextUpdate(new Time(date, locale));
    }

    public X509v2CRLBuilder setThisUpdate(Date date, Locale locale) {
        return setThisUpdate(new Time(date, locale));
    }

    public X509v2CRLBuilder(X500Name x500Name, Time time) {
        this.tbsGen = new V2TBSCertListGenerator();
        this.extGenerator = new ExtensionsGenerator();
        this.tbsGen.setIssuer(x500Name);
        this.tbsGen.setThisUpdate(time);
    }

    public X509v2CRLBuilder addCRLEntry(BigInteger bigInteger, Date date, Extensions extensions) {
        this.tbsGen.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), extensions);
        return this;
    }

    public X509v2CRLBuilder addExtension(Extension extension) throws CertIOException {
        this.extGenerator.addExtension(extension);
        return this;
    }

    public X509v2CRLBuilder setNextUpdate(Time time) {
        this.tbsGen.setNextUpdate(time);
        return this;
    }

    public X509v2CRLBuilder setThisUpdate(Time time) {
        this.tbsGen.setThisUpdate(time);
        return this;
    }

    public X509v2CRLBuilder(X509CRLHolder x509CRLHolder) {
        V2TBSCertListGenerator v2TBSCertListGenerator = new V2TBSCertListGenerator();
        this.tbsGen = v2TBSCertListGenerator;
        v2TBSCertListGenerator.setIssuer(x509CRLHolder.getIssuer());
        this.tbsGen.setThisUpdate(new Time(x509CRLHolder.getThisUpdate()));
        Date nextUpdate = x509CRLHolder.getNextUpdate();
        if (nextUpdate != null) {
            this.tbsGen.setNextUpdate(new Time(nextUpdate));
        }
        addCRL(x509CRLHolder);
        this.extGenerator = new ExtensionsGenerator();
        Extensions extensions = x509CRLHolder.getExtensions();
        if (extensions != null) {
            Enumeration enumerationOids = extensions.oids();
            while (enumerationOids.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
                if (!Extension.altSignatureAlgorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) && !Extension.altSignatureValue.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    this.extGenerator.addExtension(extensions.getExtension(aSN1ObjectIdentifier));
                }
            }
        }
    }

    public X509v2CRLBuilder replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, new Extension(aSN1ObjectIdentifier, z10, bArr));
        return this;
    }

    public X509v2CRLBuilder replaceExtension(Extension extension) throws CertIOException {
        this.extGenerator = CertUtils.doReplaceExtension(this.extGenerator, extension);
        return this;
    }
}
