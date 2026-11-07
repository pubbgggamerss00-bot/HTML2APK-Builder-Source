package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthenticatedDataParser;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSEnvelopedHelper;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CMSAuthenticatedDataParser extends CMSContentInfoParser {
    private boolean authAttrNotRead;
    private ASN1Set authAttrSet;
    private AttributeTable authAttrs;
    AuthenticatedDataParser authData;
    private byte[] mac;
    private AlgorithmIdentifier macAlg;
    private OriginatorInformation originatorInfo;
    RecipientInformationStore recipientInfoStore;
    private CMSSecureReadable secureReadable;
    private boolean unauthAttrNotRead;
    private AttributeTable unauthAttrs;

    public CMSAuthenticatedDataParser(InputStream inputStream) throws CMSException, IOException {
        this(inputStream, (DigestCalculatorProvider) null);
    }

    private ASN1Set getAuthAttrSet() throws IOException {
        if (this.authAttrs == null && this.authAttrNotRead) {
            ASN1SetParser authAttrs = this.authData.getAuthAttrs();
            if (authAttrs != null) {
                this.authAttrSet = (ASN1Set) authAttrs.toASN1Primitive();
            }
            this.authAttrNotRead = false;
            this.secureReadable.setAuthAttrSet(this.authAttrSet);
        }
        return this.authAttrSet;
    }

    public AttributeTable getAuthAttrs() throws IOException {
        ASN1Set authAttrSet;
        if (this.authAttrs == null && this.authAttrNotRead && (authAttrSet = getAuthAttrSet()) != null) {
            this.authAttrs = new AttributeTable(authAttrSet);
        }
        return this.authAttrs;
    }

    public byte[] getContentDigest() {
        AttributeTable attributeTable = this.authAttrs;
        if (attributeTable != null) {
            return ASN1OctetString.getInstance(attributeTable.get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets();
        }
        return null;
    }

    public byte[] getMac() throws IOException {
        if (this.mac == null) {
            getAuthAttrs();
            this.mac = this.authData.getMac().getOctets();
        }
        return Arrays.clone(this.mac);
    }

    public String getMacAlgOID() {
        return this.macAlg.getAlgorithm().toString();
    }

    public byte[] getMacAlgParams() {
        try {
            return CMSUtils.encodeObj(this.macAlg.getParameters());
        } catch (Exception e10) {
            throw new RuntimeException(org.bouncycastle.cert.ocsp.a.a("exception getting encryption parameters ", e10));
        }
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.macAlg;
    }

    public OriginatorInformation getOriginatorInfo() {
        return this.originatorInfo;
    }

    public RecipientInformationStore getRecipientInfos() {
        return this.recipientInfoStore;
    }

    public AttributeTable getUnauthAttrs() throws IOException {
        if (this.unauthAttrs == null && this.unauthAttrNotRead) {
            this.unauthAttrNotRead = false;
            this.unauthAttrs = CMSUtils.getAttributesTable(this.authData.getUnauthAttrs());
        }
        return this.unauthAttrs;
    }

    public CMSAuthenticatedDataParser(InputStream inputStream, DigestCalculatorProvider digestCalculatorProvider) throws CMSException, IOException {
        super(inputStream);
        this.authAttrNotRead = true;
        AuthenticatedDataParser authenticatedDataParser = new AuthenticatedDataParser((ASN1SequenceParser) this._contentInfo.getContent(16));
        this.authData = authenticatedDataParser;
        OriginatorInfo originatorInfo = authenticatedDataParser.getOriginatorInfo();
        if (originatorInfo != null) {
            this.originatorInfo = new OriginatorInformation(originatorInfo);
        }
        ASN1Set aSN1Set = ASN1Set.getInstance(this.authData.getRecipientInfos().toASN1Primitive());
        this.macAlg = this.authData.getMacAlgorithm();
        AlgorithmIdentifier digestAlgorithm = this.authData.getDigestAlgorithm();
        if (digestAlgorithm == null) {
            ContentInfoParser encapsulatedContentInfo = this.authData.getEncapsulatedContentInfo();
            CMSEnvelopedHelper.CMSAuthEnveSecureReadable cMSAuthEnveSecureReadable = new CMSEnvelopedHelper.CMSAuthEnveSecureReadable(this.macAlg, encapsulatedContentInfo.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo.getContent(4)).getOctetStream()));
            this.secureReadable = cMSAuthEnveSecureReadable;
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, cMSAuthEnveSecureReadable);
            return;
        }
        if (digestCalculatorProvider == null) {
            throw new CMSException("a digest calculator provider is required if authenticated attributes are present");
        }
        ContentInfoParser encapsulatedContentInfo2 = this.authData.getEncapsulatedContentInfo();
        try {
            CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable cMSDigestAuthenticatedSecureReadable = new CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable(digestCalculatorProvider.get(digestAlgorithm), encapsulatedContentInfo2.getContentType(), new CMSProcessableInputStream(((ASN1OctetStringParser) encapsulatedContentInfo2.getContent(4)).getOctetStream()));
            this.secureReadable = cMSDigestAuthenticatedSecureReadable;
            this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.macAlg, cMSDigestAuthenticatedSecureReadable);
        } catch (OperatorCreationException e10) {
            throw new CMSException("unable to create digest calculator: " + e10.getMessage(), e10);
        }
    }

    public CMSAuthenticatedDataParser(byte[] bArr) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public CMSAuthenticatedDataParser(byte[] bArr, DigestCalculatorProvider digestCalculatorProvider) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr), digestCalculatorProvider);
    }
}
