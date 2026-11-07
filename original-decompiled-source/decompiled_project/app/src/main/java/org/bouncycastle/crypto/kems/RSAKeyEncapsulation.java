package org.bouncycastle.crypto.kems;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.KeyEncapsulation;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class RSAKeyEncapsulation implements KeyEncapsulation {
    private DerivationFunction kdf;
    private RSAKeyParameters key;
    private SecureRandom rnd;

    public RSAKeyEncapsulation(DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
    }

    public CipherParameters decrypt(byte[] bArr, int i10) {
        return decrypt(bArr, 0, bArr.length, i10);
    }

    public CipherParameters encrypt(byte[] bArr, int i10) {
        return encrypt(bArr, 0, i10);
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof RSAKeyParameters)) {
            throw new IllegalArgumentException("RSA key required");
        }
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.key = rSAKeyParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSAKem", ConstraintUtils.bitsOfSecurityFor(rSAKeyParameters.getModulus()), cipherParameters, this.key.isPrivate() ? CryptoServicePurpose.DECRYPTION : CryptoServicePurpose.ENCRYPTION));
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters decrypt(byte[] bArr, int i10, int i11, int i12) throws IllegalArgumentException {
        if (this.key.isPrivate()) {
            return new KeyParameter(new RSAKEMExtractor(this.key, i12, this.kdf).extractSecret(Arrays.copyOfRange(bArr, i10, i11 + i10)));
        }
        throw new IllegalArgumentException("Private key required for decryption");
    }

    @Override // org.bouncycastle.crypto.KeyEncapsulation
    public CipherParameters encrypt(byte[] bArr, int i10, int i11) throws IllegalArgumentException {
        if (this.key.isPrivate()) {
            throw new IllegalArgumentException("Public key required for encryption");
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = new RSAKEMGenerator(i11, this.kdf, this.rnd).generateEncapsulated(this.key);
        byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
        System.arraycopy(encapsulation, 0, bArr, i10, encapsulation.length);
        return new KeyParameter(secretWithEncapsulationGenerateEncapsulated.getSecret());
    }
}
