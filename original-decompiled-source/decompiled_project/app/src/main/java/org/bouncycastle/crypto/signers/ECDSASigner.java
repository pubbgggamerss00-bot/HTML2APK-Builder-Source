package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes2.dex */
public class ECDSASigner implements ECConstants, DSAExt {
    private final DSAKCalculator kCalculator;
    private ECKeyParameters key;
    private SecureRandom random;

    public ECDSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        int iBitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        return iBitLength < length ? bigInteger2.shiftRight(length - iBitLength) : bigInteger2;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n10 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n10, bArr);
        BigInteger d10 = ((ECPrivateKeyParameters) this.key).getD();
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(n10, d10, bArr);
        } else {
            this.kCalculator.init(n10, this.random);
        }
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger().mod(n10);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger)) {
                BigInteger bigIntegerMod2 = BigIntegers.modOddInverse(n10, bigIntegerNextK).multiply(bigIntegerCalculateE.add(d10.multiply(bigIntegerMod))).mod(n10);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    return new BigInteger[]{bigIntegerMod, bigIntegerMod2};
                }
            }
        }
    }

    public ECFieldElement getDenominator(int i10, ECPoint eCPoint) {
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return eCPoint.getZCoord(0).square();
            }
            if (i10 != 6 && i10 != 7) {
                return null;
            }
        }
        return eCPoint.getZCoord(0);
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public BigInteger getOrder() {
        return this.key.getParameters().getN();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // org.bouncycastle.crypto.DSA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(boolean z10, CipherParameters cipherParameters) {
        ECKeyParameters eCKeyParameters;
        SecureRandom random;
        if (!z10) {
            eCKeyParameters = (ECPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (ECPrivateKeyParameters) parametersWithRandom.getParameters();
                random = parametersWithRandom.getRandom();
                CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECDSA", this.key, z10));
                this.random = initSecureRandom((z10 || this.kCalculator.isDeterministic()) ? false : true, random);
            }
            eCKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        }
        this.key = eCKeyParameters;
        random = null;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECDSA", this.key, z10));
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
        BigInteger cofactor;
        ECFieldElement denominator;
        ECDomainParameters parameters = this.key.getParameters();
        BigInteger n10 = parameters.getN();
        BigInteger bigIntegerCalculateE = calculateE(n10, bArr);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n10) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n10) >= 0) {
            return false;
        }
        BigInteger bigIntegerModOddInverseVar = BigIntegers.modOddInverseVar(n10, bigInteger2);
        ECPoint eCPointSumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(parameters.getG(), bigIntegerCalculateE.multiply(bigIntegerModOddInverseVar).mod(n10), ((ECPublicKeyParameters) this.key).getQ(), bigInteger.multiply(bigIntegerModOddInverseVar).mod(n10));
        if (eCPointSumOfTwoMultiplies.isInfinity()) {
            return false;
        }
        ECCurve curve = eCPointSumOfTwoMultiplies.getCurve();
        if (curve == null || (cofactor = curve.getCofactor()) == null || cofactor.compareTo(ECConstants.EIGHT) > 0 || (denominator = getDenominator(curve.getCoordinateSystem(), eCPointSumOfTwoMultiplies)) == null || denominator.isZero()) {
            return eCPointSumOfTwoMultiplies.normalize().getAffineXCoord().toBigInteger().mod(n10).equals(bigInteger);
        }
        ECFieldElement xCoord = eCPointSumOfTwoMultiplies.getXCoord();
        while (curve.isValidFieldElement(bigInteger)) {
            if (curve.fromBigInteger(bigInteger).multiply(denominator).equals(xCoord)) {
                return true;
            }
            bigInteger = bigInteger.add(n10);
        }
        return false;
    }

    public ECDSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }
}
