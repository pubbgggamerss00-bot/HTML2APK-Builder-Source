package org.bouncycastle.cms.jcajce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import k4.i;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
class JceCMSKEMKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private JcaJceExtHelper helper;
    private final int kekLength;
    private PrivateKey privateKey;
    private final AlgorithmIdentifier symWrapAlgorithm;

    public JceCMSKEMKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm());
        this.helper = new DefaultJcaJceExtHelper();
        this.extraMappings = new HashMap();
        KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(algorithmIdentifier.getParameters());
        this.privateKey = privateKey;
        this.symWrapAlgorithm = algorithmIdentifier;
        this.kekLength = CMSUtils.getKekSize(kEMRecipientInfo.getWrap().getAlgorithm());
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws InvalidKeyException, OperatorException, InvalidAlgorithmParameterException {
        KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(this.symWrapAlgorithm.getParameters());
        AlgorithmIdentifier wrap = kEMRecipientInfo.getWrap();
        try {
            byte[] encoded = new CMSORIforKEMOtherInfo(wrap, this.kekLength, kEMRecipientInfo.getUkm()).getEncoded();
            if (!(this.privateKey instanceof RSAPrivateKey)) {
                Cipher cipherCreateAsymmetricWrapper = CMSUtils.createAsymmetricWrapper(this.helper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap());
                String wrapAlgorithmName = CMSUtils.getWrapAlgorithmName(wrap.getAlgorithm());
                cipherCreateAsymmetricWrapper.init(4, this.privateKey, new KTSParameterSpec.Builder(wrapAlgorithmName, this.kekLength * 8, encoded).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build());
                return new JceGenericKey(algorithmIdentifier, cipherCreateAsymmetricWrapper.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), wrapAlgorithmName, 3));
            }
            Cipher cipherCreateAsymmetricWrapper2 = CMSUtils.createAsymmetricWrapper(this.helper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap());
            try {
                String wrapAlgorithmName2 = CMSUtils.getWrapAlgorithmName(wrap.getAlgorithm());
                cipherCreateAsymmetricWrapper2.init(4, this.privateKey, new KTSParameterSpec.Builder(wrapAlgorithmName2, this.kekLength * 8, encoded).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build());
                return new JceGenericKey(algorithmIdentifier, cipherCreateAsymmetricWrapper2.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), wrapAlgorithmName2, 3));
            } catch (Exception e10) {
                throw new OperatorException("Unable to wrap contents key: " + e10.getMessage(), e10);
            }
        } catch (Exception e11) {
            throw new OperatorException(i.a(e11, new StringBuilder("exception encrypting key: ")), e11);
        }
    }

    public int getKekLength() {
        return this.kekLength;
    }

    public JceCMSKEMKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceCMSKEMKeyUnwrapper setProvider(String str) {
        this.helper = new NamedJcaJceExtHelper(str);
        return this;
    }

    public JceCMSKEMKeyUnwrapper setProvider(Provider provider) {
        this.helper = new ProviderJcaJceExtHelper(provider);
        return this;
    }
}
