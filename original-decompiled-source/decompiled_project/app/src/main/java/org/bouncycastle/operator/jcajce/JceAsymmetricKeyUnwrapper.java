package org.bouncycastle.operator.jcajce;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;

/* loaded from: classes3.dex */
public class JceAsymmetricKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private PrivateKey privKey;
    private boolean unwrappedKeyMustBeEncodable;

    public JceAsymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[Catch: IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException | Exception -> 0x0057, TryCatch #4 {IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException | Exception -> 0x0057, blocks: (B:5:0x001e, B:7:0x002e, B:9:0x0039, B:8:0x0034), top: B:46:0x001e }] */
    @Override // org.bouncycastle.operator.KeyUnwrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws NoSuchAlgorithmException, IOException, InvalidKeyException, OperatorException, InvalidAlgorithmParameterException {
        byte[] encoded;
        try {
            Cipher cipherCreateAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
            AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters(getAlgorithmIdentifier());
            Key secretKeySpec = null;
            if (algorithmParametersCreateAlgorithmParameters != null) {
                try {
                    if (getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
                        cipherCreateAsymmetricWrapper.init(4, this.privKey);
                    } else {
                        cipherCreateAsymmetricWrapper.init(4, this.privKey, algorithmParametersCreateAlgorithmParameters);
                    }
                    Key keyUnwrap = cipherCreateAsymmetricWrapper.unwrap(bArr, this.helper.getKeyAlgorithmName(algorithmIdentifier.getAlgorithm()), 3);
                    if (!this.unwrappedKeyMustBeEncodable || ((encoded = keyUnwrap.getEncoded()) != null && encoded.length != 0)) {
                        secretKeySpec = keyUnwrap;
                    }
                } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException | Exception unused) {
                }
            }
            if (secretKeySpec == null) {
                if (algorithmParametersCreateAlgorithmParameters != null) {
                    cipherCreateAsymmetricWrapper.init(2, this.privKey, algorithmParametersCreateAlgorithmParameters);
                } else {
                    cipherCreateAsymmetricWrapper.init(2, this.privKey);
                }
                secretKeySpec = new SecretKeySpec(cipherCreateAsymmetricWrapper.doFinal(bArr), algorithmIdentifier.getAlgorithm().getId());
            }
            return new JceGenericKey(algorithmIdentifier, secretKeySpec);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new OperatorException("invalid algorithm parameters: " + e10.getMessage(), e10);
        } catch (InvalidKeyException e11) {
            throw new OperatorException("key invalid: " + e11.getMessage(), e11);
        } catch (BadPaddingException e12) {
            throw new OperatorException("bad padding: " + e12.getMessage(), e12);
        } catch (IllegalBlockSizeException e13) {
            throw new OperatorException("illegal blocksize: " + e13.getMessage(), e13);
        }
    }

    public JceAsymmetricKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyUnwrapper setMustProduceEncodableUnwrappedKey(boolean z10) {
        this.unwrappedKeyMustBeEncodable = z10;
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
