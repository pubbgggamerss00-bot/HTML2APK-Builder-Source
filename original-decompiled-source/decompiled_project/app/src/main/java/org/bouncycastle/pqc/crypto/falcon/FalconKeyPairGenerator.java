package org.bouncycastle.pqc.crypto.falcon;

import androidx.datastore.preferences.protobuf.e;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class FalconKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int logn;
    private FalconNIST nist;
    private int noncelen;
    private FalconKeyGenerationParameters params;
    private int pk_size;
    private SecureRandom random;
    private int sk_size;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[][] bArrCrypto_sign_keypair = this.nist.crypto_sign_keypair(new byte[this.pk_size], 0, new byte[this.sk_size], 0);
        FalconParameters parameters = this.params.getParameters();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new FalconPublicKeyParameters(parameters, bArrCrypto_sign_keypair[0]), (AsymmetricKeyParameter) new FalconPrivateKeyParameters(parameters, bArrCrypto_sign_keypair[1], bArrCrypto_sign_keypair[2], bArrCrypto_sign_keypair[3], bArrCrypto_sign_keypair[0]));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (FalconKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        FalconKeyGenerationParameters falconKeyGenerationParameters = (FalconKeyGenerationParameters) keyGenerationParameters;
        this.logn = falconKeyGenerationParameters.getParameters().getLogN();
        int nonceLength = falconKeyGenerationParameters.getParameters().getNonceLength();
        this.noncelen = nonceLength;
        this.nist = new FalconNIST(this.logn, nonceLength, this.random);
        int i10 = 1 << this.logn;
        int i11 = i10 == 1024 ? 5 : (i10 == 256 || i10 == 512) ? 6 : (i10 == 64 || i10 == 128) ? 7 : 8;
        this.pk_size = e.a(i10, 14, 8, 1);
        this.sk_size = (((i11 * 2) * i10) / 8) + 1 + i10;
    }
}
