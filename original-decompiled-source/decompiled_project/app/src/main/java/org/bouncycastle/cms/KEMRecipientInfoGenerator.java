package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;

/* loaded from: classes2.dex */
public abstract class KEMRecipientInfoGenerator implements RecipientInfoGenerator {
    private IssuerAndSerialNumber issuerAndSerial;
    private byte[] subjectKeyIdentifier;
    protected final KEMKeyWrapper wrapper;

    public KEMRecipientInfoGenerator(IssuerAndSerialNumber issuerAndSerialNumber, KEMKeyWrapper kEMKeyWrapper) {
        this.issuerAndSerial = issuerAndSerialNumber;
        this.wrapper = kEMKeyWrapper;
    }

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public final RecipientInfo generate(GenericKey genericKey) throws CMSException {
        try {
            byte[] bArrGenerateWrappedKey = this.wrapper.generateWrappedKey(genericKey);
            IssuerAndSerialNumber issuerAndSerialNumber = this.issuerAndSerial;
            return new RecipientInfo(new OtherRecipientInfo(CMSObjectIdentifiers.id_ori_kem, new KEMRecipientInfo(issuerAndSerialNumber != null ? new RecipientIdentifier(issuerAndSerialNumber) : new RecipientIdentifier((ASN1OctetString) new DEROctetString(this.subjectKeyIdentifier)), this.wrapper.getAlgorithmIdentifier(), new DEROctetString(this.wrapper.getEncapsulation()), this.wrapper.getKdfAlgorithmIdentifier(), new ASN1Integer(this.wrapper.getKekLength()), null, this.wrapper.getWrapAlgorithmIdentifier(), new DEROctetString(bArrGenerateWrappedKey))));
        } catch (OperatorException e10) {
            throw new CMSException("exception wrapping content key: " + e10.getMessage(), e10);
        }
    }

    public KEMRecipientInfoGenerator(byte[] bArr, KEMKeyWrapper kEMKeyWrapper) {
        this.subjectKeyIdentifier = bArr;
        this.wrapper = kEMKeyWrapper;
    }
}
