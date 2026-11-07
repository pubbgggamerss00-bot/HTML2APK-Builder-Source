package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters;
import org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SM2KeyExchange {
    private final Digest digest;
    private ECDomainParameters ecParams;
    private ECPrivateKeyParameters ephemeralKey;
    private ECPoint ephemeralPubPoint;
    private boolean initiator;
    private ECPrivateKeyParameters staticKey;
    private ECPoint staticPubPoint;
    private byte[] userID;

    /* renamed from: w, reason: collision with root package name */
    private int f19876w;

    public SM2KeyExchange() {
        this(new SM3Digest());
    }

    private byte[] S1(Digest digest, ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 2);
        addFieldElement(digest, eCPoint.getAffineYCoord());
        digest.update(bArr, 0, bArr.length);
        return digestDoFinal();
    }

    private byte[] S2(Digest digest, ECPoint eCPoint, byte[] bArr) {
        digest.update((byte) 3);
        addFieldElement(digest, eCPoint.getAffineYCoord());
        digest.update(bArr, 0, bArr.length);
        return digestDoFinal();
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
    }

    private byte[] calculateInnerHash(Digest digest, ECPoint eCPoint, byte[] bArr, byte[] bArr2, ECPoint eCPoint2, ECPoint eCPoint3) {
        addFieldElement(digest, eCPoint.getAffineXCoord());
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        addFieldElement(digest, eCPoint2.getAffineXCoord());
        addFieldElement(digest, eCPoint2.getAffineYCoord());
        addFieldElement(digest, eCPoint3.getAffineXCoord());
        addFieldElement(digest, eCPoint3.getAffineYCoord());
        return digestDoFinal();
    }

    private ECPoint calculateU(SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters) {
        ECDomainParameters parameters = this.staticKey.getParameters();
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint eCPointCleanPoint2 = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        BigInteger bigIntegerReduce = reduce(this.ephemeralPubPoint.getAffineXCoord().toBigInteger());
        BigInteger bigIntegerReduce2 = reduce(eCPointCleanPoint2.getAffineXCoord().toBigInteger());
        BigInteger bigIntegerMod = this.ecParams.getH().multiply(this.staticKey.getD().add(bigIntegerReduce.multiply(this.ephemeralKey.getD()))).mod(this.ecParams.getN());
        return ECAlgorithms.sumOfTwoMultiplies(eCPointCleanPoint, bigIntegerMod, eCPointCleanPoint2, bigIntegerMod.multiply(bigIntegerReduce2).mod(this.ecParams.getN())).normalize();
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] getZ(Digest digest, byte[] bArr, ECPoint eCPoint) {
        addUserID(digest, bArr);
        addFieldElement(digest, this.ecParams.getCurve().getA());
        addFieldElement(digest, this.ecParams.getCurve().getB());
        addFieldElement(digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(digest, eCPoint.getAffineXCoord());
        addFieldElement(digest, eCPoint.getAffineYCoord());
        return digestDoFinal();
    }

    private byte[] kdf(ECPoint eCPoint, byte[] bArr, byte[] bArr2, int i10) {
        Memoable memoable;
        Memoable memoableCopy;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[Math.max(4, digestSize)];
        int i11 = (i10 + 7) / 8;
        byte[] bArr4 = new byte[i11];
        Digest digest = this.digest;
        if (digest instanceof Memoable) {
            addFieldElement(digest, eCPoint.getAffineXCoord());
            addFieldElement(this.digest, eCPoint.getAffineYCoord());
            this.digest.update(bArr, 0, bArr.length);
            this.digest.update(bArr2, 0, bArr2.length);
            memoable = (Memoable) this.digest;
            memoableCopy = memoable.copy();
        } else {
            memoable = null;
            memoableCopy = null;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            if (memoable != null) {
                memoable.reset(memoableCopy);
            } else {
                addFieldElement(this.digest, eCPoint.getAffineXCoord());
                addFieldElement(this.digest, eCPoint.getAffineYCoord());
                this.digest.update(bArr, 0, bArr.length);
                this.digest.update(bArr2, 0, bArr2.length);
            }
            i13++;
            Pack.intToBigEndian(i13, bArr3, 0);
            this.digest.update(bArr3, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int iMin = Math.min(digestSize, i11 - i12);
            System.arraycopy(bArr3, 0, bArr4, i12, iMin);
            i12 += iMin;
        }
        return bArr4;
    }

    private BigInteger reduce(BigInteger bigInteger) {
        return bigInteger.and(BigInteger.valueOf(1L).shiftLeft(this.f19876w).subtract(BigInteger.valueOf(1L))).setBit(this.f19876w);
    }

    public byte[] calculateKey(int i10, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] id2;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            id2 = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            id2 = new byte[0];
        }
        byte[] z10 = getZ(this.digest, this.userID, this.staticPubPoint);
        byte[] z11 = getZ(this.digest, id2, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint eCPointCalculateU = calculateU(sM2KeyExchangePublicParameters);
        return this.initiator ? kdf(eCPointCalculateU, z10, z11, i10) : kdf(eCPointCalculateU, z11, z10, i10);
    }

    public byte[][] calculateKeyWithConfirmation(int i10, byte[] bArr, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] id2;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            id2 = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            id2 = new byte[0];
        }
        if (this.initiator && bArr == null) {
            throw new IllegalArgumentException("if initiating, confirmationTag must be set");
        }
        byte[] z10 = getZ(this.digest, this.userID, this.staticPubPoint);
        byte[] z11 = getZ(this.digest, id2, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint eCPointCalculateU = calculateU(sM2KeyExchangePublicParameters);
        if (!this.initiator) {
            byte[] bArrKdf = kdf(eCPointCalculateU, z11, z10, i10);
            byte[] bArrCalculateInnerHash = calculateInnerHash(this.digest, eCPointCalculateU, z11, z10, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ(), this.ephemeralPubPoint);
            return new byte[][]{bArrKdf, S1(this.digest, eCPointCalculateU, bArrCalculateInnerHash), S2(this.digest, eCPointCalculateU, bArrCalculateInnerHash)};
        }
        byte[] bArrKdf2 = kdf(eCPointCalculateU, z10, z11, i10);
        byte[] bArrCalculateInnerHash2 = calculateInnerHash(this.digest, eCPointCalculateU, z10, z11, this.ephemeralPubPoint, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        if (Arrays.constantTimeAreEqual(S1(this.digest, eCPointCalculateU, bArrCalculateInnerHash2), bArr)) {
            return new byte[][]{bArrKdf2, S2(this.digest, eCPointCalculateU, bArrCalculateInnerHash2)};
        }
        throw new IllegalStateException("confirmation tag mismatch");
    }

    public void init(CipherParameters cipherParameters) {
        SM2KeyExchangePrivateParameters sM2KeyExchangePrivateParameters;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) parametersWithID.getParameters();
            this.userID = parametersWithID.getID();
        } else {
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) cipherParameters;
            this.userID = new byte[0];
        }
        this.initiator = sM2KeyExchangePrivateParameters.isInitiator();
        this.staticKey = sM2KeyExchangePrivateParameters.getStaticPrivateKey();
        this.ephemeralKey = sM2KeyExchangePrivateParameters.getEphemeralPrivateKey();
        this.ecParams = this.staticKey.getParameters();
        this.staticPubPoint = sM2KeyExchangePrivateParameters.getStaticPublicPoint();
        this.ephemeralPubPoint = sM2KeyExchangePrivateParameters.getEphemeralPublicPoint();
        this.f19876w = (this.ecParams.getCurve().getFieldSize() / 2) - 1;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("SM2KE", this.staticKey));
    }

    public SM2KeyExchange(Digest digest) {
        this.digest = digest;
    }
}
