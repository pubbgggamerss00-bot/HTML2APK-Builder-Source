package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class DSASigner implements DSAExt {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int iBitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[iBitLength];
        System.arraycopy(bArr, 0, bArr2, 0, iBitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger getRandomizer(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomBigInteger(7, CryptoServicesRegistrar.getSecureRandom(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q10, bArr);
        BigInteger x10 = ((DSAPrivateKeyParameters) this.key).getX();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(q10, x10, bArr);
        } else {
            this.kCalculator.init(q10, this.random);
        }
        BigInteger bigIntegerNextK = this.kCalculator.nextK();
        BigInteger bigIntegerMod = parameters.getG().modPow(bigIntegerNextK.add(getRandomizer(q10, this.random)), parameters.getP()).mod(q10);
        return new BigInteger[]{bigIntegerMod, BigIntegers.modOddInverse(q10, bigIntegerNextK).multiply(bigIntegerCalculateE.add(x10.multiply(bigIntegerMod))).mod(q10)};
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getQ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // org.bouncycastle.crypto.DSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z10, CipherParameters cipherParameters) {
        DSAKeyParameters dSAKeyParameters;
        SecureRandom random;
        if (!z10) {
            dSAKeyParameters = (DSAPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
                CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z10));
                this.random = initSecureRandom((z10 || this.kCalculator.isDeterministic()) ? false : true, random);
            }
            dSAKeyParameters = (DSAPrivateKeyParameters) cipherParameters;
        }
        this.key = dSAKeyParameters;
        random = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DSA", this.key, z10));
        this.random = initSecureRandom((z10 || this.kCalculator.isDeterministic()) ? false : true, random);
    }

    public SecureRandom initSecureRandom(boolean z10, SecureRandom secureRandom) {
        if (z10) {
            return CryptoServicesRegistrar.getSecureRandom(secureRandom);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerCalculateE = calculateE(q10, bArr);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (bigIntegerValueOf.compareTo(bigInteger) >= 0 || q10.compareTo(bigInteger) <= 0 || bigIntegerValueOf.compareTo(bigInteger2) >= 0 || q10.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(q10, bigInteger2);
        BigInteger bigIntegerMod = bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(q10);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModOddInverseVar).mod(q10);
        BigInteger p10 = parameters.getP();
        return parameters.getG().modPow(bigIntegerMod, p10).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigIntegerMod2, p10)).mod(p10).mod(q10).equals(bigInteger);
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
