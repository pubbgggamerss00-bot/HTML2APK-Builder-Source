package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes2.dex */
public class KEMRecipientInformation extends RecipientInformation {
    private KEMRecipientInfo info;

    public KEMRecipientInformation(KEMRecipientInfo kEMRecipientInfo, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable) {
        KeyTransRecipientId keyTransRecipientId;
        super(kEMRecipientInfo.getKem(), algorithmIdentifier, cMSSecureReadable);
        this.info = kEMRecipientInfo;
        RecipientIdentifier recipientIdentifier = kEMRecipientInfo.getRecipientIdentifier();
        boolean zIsTagged = recipientIdentifier.isTagged();
        ASN1Encodable id2 = recipientIdentifier.getId();
        if (zIsTagged) {
            keyTransRecipientId = new KeyTransRecipientId(ASN1OctetString.getInstance(id2).getOctets());
        } else {
            IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id2);
            keyTransRecipientId = new KeyTransRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        }
        this.rid = keyTransRecipientId;
    }

    @Override // org.bouncycastle.cms.RecipientInformation
    public RecipientOperator getRecipientOperator(Recipient recipient) throws CMSException {
        return ((KEMRecipient) recipient).getRecipientOperator(new AlgorithmIdentifier(this.keyEncAlg.getAlgorithm(), this.info), this.messageAlgorithm, this.info.getEncryptedKey().getOctets());
    }
}
