package org.bouncycastle.cms.jcajce;

import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KEMRecipient;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.operator.OperatorException;

/* loaded from: classes2.dex */
public abstract class JceKEMRecipient implements KEMRecipient {
    protected EnvelopedDataHelper contentHelper;
    protected Map extraMappings;
    protected EnvelopedDataHelper helper;
    private PrivateKey recipientKey;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public JceKEMRecipient(PrivateKey privateKey) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new HashMap();
        this.validateKeySize = false;
        this.recipientKey = CMSUtils.cleanPrivateKey(privateKey);
    }

    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws DataLengthException, CMSException, IllegalArgumentException {
        KEMRecipientInfo.getInstance(algorithmIdentifier.getParameters());
        JceCMSKEMKeyUnwrapper jceCMSKEMKeyUnwrapper = (JceCMSKEMKeyUnwrapper) this.helper.createKEMUnwrapper(algorithmIdentifier, this.recipientKey);
        if (!this.extraMappings.isEmpty()) {
            for (ASN1ObjectIdentifier aSN1ObjectIdentifier : this.extraMappings.keySet()) {
                jceCMSKEMKeyUnwrapper.setAlgorithmMapping(aSN1ObjectIdentifier, (String) this.extraMappings.get(aSN1ObjectIdentifier));
            }
        }
        try {
            Key jceKey = this.helper.getJceKey(algorithmIdentifier2, jceCMSKEMKeyUnwrapper.generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (!this.validateKeySize) {
                return jceKey;
            }
            this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            return jceKey;
        } catch (OperatorException e10) {
            throw new CMSException("exception unwrapping key: " + e10.getMessage(), e10);
        }
    }

    public JceKEMRecipient setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceKEMRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKEMRecipient setKeySizeValidation(boolean z10) {
        this.validateKeySize = z10;
        return this;
    }

    public JceKEMRecipient setMustProduceEncodableUnwrappedKey(boolean z10) {
        this.unwrappedKeyMustBeEncodable = z10;
        return this;
    }

    public JceKEMRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public JceKEMRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKEMRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }
}
