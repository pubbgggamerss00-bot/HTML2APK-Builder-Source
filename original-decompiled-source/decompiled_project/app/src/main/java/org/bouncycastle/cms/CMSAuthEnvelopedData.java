package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthEnvelopedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: classes2.dex */
public class CMSAuthEnvelopedData implements Encodable {
    private ASN1Set authAttrs;
    private AlgorithmIdentifier authEncAlg;
    ContentInfo contentInfo;
    private byte[] mac;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private ASN1Set unauthAttrs;

    public CMSAuthEnvelopedData(InputStream inputStream) throws CMSException {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public AttributeTable getAuthAttrs() {
        ASN1Set aSN1Set = this.authAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return this.contentInfo.getEncoded();
    }

    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnauthAttrs() {
        ASN1Set aSN1Set = this.unauthAttrs;
        if (aSN1Set == null) {
            return null;
        }
        return new AttributeTable(aSN1Set);
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSAuthEnvelopedData(ContentInfo contentInfo) throws CMSException {
        this.contentInfo = contentInfo;
        AuthEnvelopedData authEnvelopedData = AuthEnvelopedData.getInstance(contentInfo.getContent());
        if (authEnvelopedData.getOriginatorInfo() != null) {
            this.originatorInfo = new OriginatorInformation(authEnvelopedData.getOriginatorInfo());
        }
        ASN1Set recipientInfos = authEnvelopedData.getRecipientInfos();
        final EncryptedContentInfo authEncryptedContentInfo = authEnvelopedData.getAuthEncryptedContentInfo();
        this.authEncAlg = authEncryptedContentInfo.getContentEncryptionAlgorithm();
        this.mac = authEnvelopedData.getMac().getOctets();
        CMSSecureReadableWithAAD cMSSecureReadableWithAAD = new CMSSecureReadableWithAAD() { // from class: org.bouncycastle.cms.CMSAuthEnvelopedData.1
            private OutputStream aadStream;

            @Override // org.bouncycastle.cms.CMSSecureReadableWithAAD
            public OutputStream getAADStream() {
                return this.aadStream;
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public ASN1Set getAuthAttrSet() {
                return CMSAuthEnvelopedData.this.authAttrs;
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public ASN1ObjectIdentifier getContentType() {
                return authEncryptedContentInfo.getContentType();
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public InputStream getInputStream() throws IOException {
                if (this.aadStream != null && CMSAuthEnvelopedData.this.authAttrs != null) {
                    this.aadStream.write(CMSAuthEnvelopedData.this.authAttrs.getEncoded(ASN1Encoding.DER));
                }
                return new InputStreamWithMAC(new ByteArrayInputStream(authEncryptedContentInfo.getEncryptedContent().getOctets()), CMSAuthEnvelopedData.this.mac);
            }

            @Override // org.bouncycastle.cms.CMSSecureReadableWithAAD
            public byte[] getMAC() {
                return Arrays.clone(CMSAuthEnvelopedData.this.mac);
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public boolean hasAdditionalData() {
                return (this.aadStream == null || CMSAuthEnvelopedData.this.authAttrs == null) ? false : true;
            }

            @Override // org.bouncycastle.cms.CMSSecureReadableWithAAD
            public void setAADStream(OutputStream outputStream) {
                this.aadStream = outputStream;
            }

            @Override // org.bouncycastle.cms.CMSSecureReadable
            public void setAuthAttrSet(ASN1Set aSN1Set) {
            }
        };
        this.authAttrs = authEnvelopedData.getAuthAttrs();
        this.unauthAttrs = authEnvelopedData.getUnauthAttrs();
        this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(recipientInfos, this.authEncAlg, cMSSecureReadableWithAAD);
    }

    public CMSAuthEnvelopedData(byte[] bArr) throws CMSException {
        this(CMSUtils.readContentInfo(bArr));
    }
}
