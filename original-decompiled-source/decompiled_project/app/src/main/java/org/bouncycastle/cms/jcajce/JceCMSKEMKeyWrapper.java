package org.bouncycastle.cms.jcajce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import k4.i;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.KEMKeyWrapper;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.pqc.jcajce.interfaces.KyberPublicKey;
import org.bouncycastle.pqc.jcajce.interfaces.NTRUKey;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.NTRUParameterSpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* loaded from: classes2.dex */
class JceCMSKEMKeyWrapper extends KEMKeyWrapper {
    private static Map encLengths;
    private byte[] encapsulation;
    private Map extraMappings;
    private JcaJceExtHelper helper;
    private AlgorithmIdentifier kdfAlgorithm;
    private final int kekLength;
    private PublicKey publicKey;
    private SecureRandom random;
    private final AlgorithmIdentifier symWrapAlgorithm;

    static {
        HashMap map = new HashMap();
        encLengths = map;
        map.put(KyberParameterSpec.kyber512.getName(), Integers.valueOf(768));
        encLengths.put(KyberParameterSpec.kyber768.getName(), Integers.valueOf(1088));
        encLengths.put(KyberParameterSpec.kyber1024.getName(), Integers.valueOf(1568));
        encLengths.put(NTRUParameterSpec.ntruhps2048509.getName(), Integers.valueOf(699));
        encLengths.put(NTRUParameterSpec.ntruhps2048677.getName(), Integers.valueOf(930));
        encLengths.put(NTRUParameterSpec.ntruhps4096821.getName(), Integers.valueOf(1230));
        encLengths.put(NTRUParameterSpec.ntruhrss701.getName(), Integers.valueOf(1138));
    }

    public JceCMSKEMKeyWrapper(PublicKey publicKey, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(publicKey instanceof RSAPublicKey ? new AlgorithmIdentifier(ISOIECObjectIdentifiers.id_kem_rsa) : SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm());
        this.helper = new DefaultJcaJceExtHelper();
        this.extraMappings = new HashMap();
        this.kdfAlgorithm = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, DERNull.INSTANCE));
        this.publicKey = publicKey;
        this.symWrapAlgorithm = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        this.kekLength = CMSUtils.getKekSize(aSN1ObjectIdentifier);
    }

    private int getKemEncLength(PublicKey publicKey) {
        Map map;
        String name;
        if (publicKey instanceof KyberPublicKey) {
            map = encLengths;
            name = ((KyberPublicKey) publicKey).getParameterSpec().getName();
        } else {
            if (!(publicKey instanceof NTRUKey)) {
                return 0;
            }
            map = encLengths;
            name = ((NTRUKey) publicKey).getParameterSpec().getName();
        }
        return ((Integer) map.get(name)).intValue();
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws IllegalBlockSizeException, InvalidKeyException, OperatorException, InvalidAlgorithmParameterException {
        try {
            byte[] encoded = new CMSORIforKEMOtherInfo(this.symWrapAlgorithm, this.kekLength).getEncoded();
            if (this.publicKey instanceof RSAPublicKey) {
                Cipher cipherCreateAsymmetricWrapper = CMSUtils.createAsymmetricWrapper(this.helper, getAlgorithmIdentifier().getAlgorithm(), new HashMap());
                try {
                    cipherCreateAsymmetricWrapper.init(3, this.publicKey, new KTSParameterSpec.Builder(CMSUtils.getWrapAlgorithmName(this.symWrapAlgorithm.getAlgorithm()), this.kekLength * 8, encoded).withKdfAlgorithm(this.kdfAlgorithm).build(), this.random);
                    byte[] bArrWrap = cipherCreateAsymmetricWrapper.wrap(CMSUtils.getJceKey(genericKey));
                    int iBitLength = (((RSAPublicKey) this.publicKey).getModulus().bitLength() + 7) / 8;
                    this.encapsulation = Arrays.copyOfRange(bArrWrap, 0, iBitLength);
                    return Arrays.copyOfRange(bArrWrap, iBitLength, bArrWrap.length);
                } catch (Exception e10) {
                    throw new OperatorException("Unable to wrap contents key: " + e10.getMessage(), e10);
                }
            }
            Cipher cipherCreateAsymmetricWrapper2 = CMSUtils.createAsymmetricWrapper(this.helper, getAlgorithmIdentifier().getAlgorithm(), new HashMap());
            try {
                cipherCreateAsymmetricWrapper2.init(3, this.publicKey, new KTSParameterSpec.Builder(CMSUtils.getWrapAlgorithmName(this.symWrapAlgorithm.getAlgorithm()), this.kekLength * 8, encoded).withKdfAlgorithm(this.kdfAlgorithm).build(), this.random);
                byte[] bArrWrap2 = cipherCreateAsymmetricWrapper2.wrap(CMSUtils.getJceKey(genericKey));
                int kemEncLength = getKemEncLength(this.publicKey);
                this.encapsulation = Arrays.copyOfRange(bArrWrap2, 0, kemEncLength);
                return Arrays.copyOfRange(bArrWrap2, kemEncLength, bArrWrap2.length);
            } catch (Exception e11) {
                throw new OperatorException("Unable to wrap contents key: " + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            throw new OperatorException(i.a(e12, new StringBuilder("unable to wrap contents key: ")), e12);
        }
        throw new OperatorException(i.a(e12, new StringBuilder("unable to wrap contents key: ")), e12);
    }

    @Override // org.bouncycastle.cms.KEMKeyWrapper
    public byte[] getEncapsulation() {
        return this.encapsulation;
    }

    @Override // org.bouncycastle.cms.KEMKeyWrapper
    public AlgorithmIdentifier getKdfAlgorithmIdentifier() {
        return this.kdfAlgorithm;
    }

    @Override // org.bouncycastle.cms.KEMKeyWrapper
    public int getKekLength() {
        return this.kekLength;
    }

    @Override // org.bouncycastle.cms.KEMKeyWrapper
    public AlgorithmIdentifier getWrapAlgorithmIdentifier() {
        return this.symWrapAlgorithm;
    }

    public JceCMSKEMKeyWrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceCMSKEMKeyWrapper setKDF(AlgorithmIdentifier algorithmIdentifier) {
        this.kdfAlgorithm = algorithmIdentifier;
        return this;
    }

    public JceCMSKEMKeyWrapper setProvider(String str) {
        this.helper = new NamedJcaJceExtHelper(str);
        return this;
    }

    public JceCMSKEMKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceCMSKEMKeyWrapper setProvider(Provider provider) {
        this.helper = new ProviderJcaJceExtHelper(provider);
        return this;
    }
}
