package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes2.dex */
public abstract class RecipientInformation {
    protected AlgorithmIdentifier keyEncAlg;
    protected AlgorithmIdentifier messageAlgorithm;
    private RecipientOperator operator;
    private byte[] resultMac;
    protected RecipientId rid;
    protected CMSSecureReadable secureReadable;

    public RecipientInformation(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, CMSSecureReadable cMSSecureReadable) {
        this.keyEncAlg = algorithmIdentifier;
        this.messageAlgorithm = algorithmIdentifier2;
        this.secureReadable = cMSSecureReadable;
    }

    public byte[] getContent(Recipient recipient) throws CMSException {
        try {
            return CMSUtils.streamToByteArray(getContentStream(recipient).getContentStream());
        } catch (IOException e10) {
            throw new CMSException(b.a(e10, new StringBuilder("unable to parse internal stream: ")), e10);
        }
    }

    public byte[] getContentDigest() {
        CMSSecureReadable cMSSecureReadable = this.secureReadable;
        if (cMSSecureReadable instanceof CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) {
            return ((CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable) cMSSecureReadable).getDigest();
        }
        return null;
    }

    public CMSTypedStream getContentStream(Recipient recipient) throws CMSException, IOException {
        RecipientOperator recipientOperator = getRecipientOperator(recipient);
        this.operator = recipientOperator;
        if (recipientOperator.isAEADBased()) {
            ((CMSSecureReadableWithAAD) this.secureReadable).setAADStream(this.operator.getAADStream());
        } else if (this.secureReadable.hasAdditionalData()) {
            return new CMSTypedStream(this.secureReadable.getContentType(), this.secureReadable.getInputStream());
        }
        return new CMSTypedStream(this.secureReadable.getContentType(), this.operator.getInputStream(this.secureReadable.getInputStream()));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.secureReadable.getContentType();
    }

    public String getKeyEncryptionAlgOID() {
        return this.keyEncAlg.getAlgorithm().getId();
    }

    public byte[] getKeyEncryptionAlgParams() {
        try {
            return CMSUtils.encodeObj(this.keyEncAlg.getParameters());
        } catch (Exception e10) {
            throw new RuntimeException(org.bouncycastle.cert.ocsp.a.a("exception getting encryption parameters ", e10));
        }
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.keyEncAlg;
    }

    public byte[] getMac() {
        if (this.resultMac == null) {
            if (this.operator.isMacBased() && this.secureReadable.hasAdditionalData()) {
                try {
                    Streams.drain(this.operator.getInputStream(new ByteArrayInputStream(this.secureReadable.getAuthAttrSet().getEncoded(ASN1Encoding.DER))));
                } catch (IOException e10) {
                    throw new IllegalStateException(b.a(e10, new StringBuilder("unable to drain input: ")));
                }
            }
            this.resultMac = this.operator.getMac();
        }
        return this.resultMac;
    }

    public RecipientId getRID() {
        return this.rid;
    }

    public abstract RecipientOperator getRecipientOperator(Recipient recipient) throws CMSException, IOException;
}
