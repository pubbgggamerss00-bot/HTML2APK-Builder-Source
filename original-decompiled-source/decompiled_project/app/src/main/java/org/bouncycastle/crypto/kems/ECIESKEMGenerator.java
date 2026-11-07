package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class ECIESKEMGenerator implements EncapsulatedSecretGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private DerivationFunction kdf;
    private final int keySize;
    private SecureRandom rnd;

    public ECIESKEMGenerator(int i10, DerivationFunction derivationFunction, SecureRandom secureRandom) {
        this.keySize = i10;
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    private ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public static byte[] deriveKey(boolean z10, DerivationFunction derivationFunction, int i10, byte[] bArr, byte[] bArr2) {
        if (!z10) {
            byte[] bArrConcatenate = Arrays.concatenate(bArr, bArr2);
            Arrays.fill(bArr2, (byte) 0);
            bArr2 = bArrConcatenate;
        }
        try {
            derivationFunction.init(new KDFParameters(bArr2, null));
            byte[] bArr3 = new byte[i10];
            derivationFunction.generateBytes(bArr3, 0, i10);
            return bArr3;
        } finally {
            Arrays.fill(bArr2, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        if (!(asymmetricKeyParameter instanceof ECKeyParameters)) {
            throw new IllegalArgumentException("EC key required");
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(eCPublicKeyParameters.getParameters().getCurve()), asymmetricKeyParameter, CryptoServicePurpose.ENCRYPTION));
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n10 = parameters.getN();
        BigInteger h10 = parameters.getH();
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(ONE, n10, this.rnd);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), bigIntegerCreateRandomInRange), eCPublicKeyParameters.getQ().multiply(this.OldCofactorMode ? bigIntegerCreateRandomInRange.multiply(h10).mod(n10) : bigIntegerCreateRandomInRange)};
        curve.normalizeAll(eCPointArr);
        ECPoint eCPoint = eCPointArr[0];
        ECPoint eCPoint2 = eCPointArr[1];
        byte[] encoded = eCPoint.getEncoded(false);
        byte[] bArr = new byte[encoded.length];
        System.arraycopy(encoded, 0, bArr, 0, encoded.length);
        return new SecretWithEncapsulationImpl(deriveKey(this.SingleHashMode, this.kdf, this.keySize, encoded, eCPoint2.getAffineXCoord().getEncoded()), bArr);
    }

    public ECIESKEMGenerator(int i10, DerivationFunction derivationFunction, SecureRandom secureRandom, boolean z10, boolean z11, boolean z12) {
        this.kdf = derivationFunction;
        this.rnd = secureRandom;
        this.keySize = i10;
        this.CofactorMode = z10;
        if (z10) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z11;
        }
        this.SingleHashMode = z12;
    }
}
