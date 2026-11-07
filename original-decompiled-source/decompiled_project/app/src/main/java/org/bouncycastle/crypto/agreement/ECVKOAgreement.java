package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class ECVKOAgreement {
    private final Digest digest;
    private ECPrivateKeyParameters key;
    private BigInteger ukm;

    public ECVKOAgreement(Digest digest) {
        this.digest = digest;
    }

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.key.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException("ECVKO public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = parameters.getH().multiply(this.ukm).multiply(this.key.getD()).mod(parameters.getN());
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (eCPointCleanPoint.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECVKO");
        }
        ECPoint eCPointNormalize = eCPointCleanPoint.multiply(bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
        }
        byte[] encoded = eCPointNormalize.getEncoded(false);
        int length = encoded.length;
        int i10 = length / 2;
        int i11 = i10 * 2;
        int i12 = length - i11;
        Arrays.reverseInPlace(encoded, i12, i10);
        Arrays.reverseInPlace(encoded, length - i10, i10);
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.update(encoded, i12, i11);
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    public int getAgreementSize() {
        return this.digest.getDigestSize();
    }

    public int getFieldSize() {
        return (this.key.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    public void init(CipherParameters cipherParameters) {
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        this.key = (ECPrivateKeyParameters) parametersWithUKM.getParameters();
        this.ukm = new BigInteger(1, Arrays.reverse(parametersWithUKM.getUKM()));
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECVKO", this.key));
    }
}
