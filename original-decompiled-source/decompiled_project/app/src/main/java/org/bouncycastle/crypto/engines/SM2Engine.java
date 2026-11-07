package org.bouncycastle.crypto.engines;

import ad.k;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SM2Engine {
    private int curveLength;
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private boolean forEncryption;
    private final Mode mode;
    private SecureRandom random;

    /* renamed from: org.bouncycastle.crypto.engines.SM2Engine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode = iArr;
            try {
                iArr[Mode.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    public SM2Engine() {
        this(new SM3Digest());
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.curveLength, eCFieldElement.toBigInteger());
        digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
    }

    private byte[] decrypt(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        int i12;
        int i13 = (this.curveLength * 2) + 1;
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, i10, bArr2, 0, i13);
        ECPoint eCPointDecodePoint = this.ecParams.getCurve().decodePoint(bArr2);
        if (eCPointDecodePoint.multiply(this.ecParams.getH()).isInfinity()) {
            throw new InvalidCipherTextException("[h]C1 at infinity");
        }
        ECPoint eCPointNormalize = eCPointDecodePoint.multiply(((ECPrivateKeyParameters) this.ecKey).getD()).normalize();
        int digestSize = this.digest.getDigestSize();
        int i14 = (i11 - i13) - digestSize;
        byte[] bArr3 = new byte[i14];
        Mode mode = this.mode;
        Mode mode2 = Mode.C1C3C2;
        if (mode == mode2) {
            System.arraycopy(bArr, i10 + i13 + digestSize, bArr3, 0, i14);
        } else {
            System.arraycopy(bArr, i10 + i13, bArr3, 0, i14);
        }
        kdf(this.digest, eCPointNormalize, bArr3);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        addFieldElement(this.digest, eCPointNormalize.getAffineXCoord());
        this.digest.update(bArr3, 0, i14);
        addFieldElement(this.digest, eCPointNormalize.getAffineYCoord());
        this.digest.doFinal(bArr4, 0);
        if (this.mode == mode2) {
            i12 = 0;
            for (int i15 = 0; i15 != digestSize2; i15++) {
                i12 |= bArr4[i15] ^ bArr[(i10 + i13) + i15];
            }
        } else {
            i12 = 0;
            for (int i16 = 0; i16 != digestSize2; i16++) {
                i12 |= bArr4[i16] ^ bArr[m.a.a(i10, i13, i14, i16)];
            }
        }
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(bArr4, (byte) 0);
        if (i12 == 0) {
            return bArr3;
        }
        Arrays.fill(bArr3, (byte) 0);
        throw new InvalidCipherTextException("invalid cipher text");
    }

    private byte[] encrypt(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] encoded;
        ECPoint eCPointNormalize;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        do {
            BigInteger bigIntegerNextK = nextK();
            encoded = eCMultiplierCreateBasePointMultiplier.multiply(this.ecParams.getG(), bigIntegerNextK).normalize().getEncoded(false);
            eCPointNormalize = ((ECPublicKeyParameters) this.ecKey).getQ().multiply(bigIntegerNextK).normalize();
            kdf(this.digest, eCPointNormalize, bArr2);
        } while (notEncrypted(bArr2, bArr, i10));
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        addFieldElement(this.digest, eCPointNormalize.getAffineXCoord());
        this.digest.update(bArr, i10, i11);
        addFieldElement(this.digest, eCPointNormalize.getAffineYCoord());
        this.digest.doFinal(bArr3, 0);
        return AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode[this.mode.ordinal()] != 1 ? Arrays.concatenate(encoded, bArr2, bArr3) : Arrays.concatenate(encoded, bArr3, bArr2);
    }

    private void kdf(Digest digest, ECPoint eCPoint, byte[] bArr) {
        Memoable memoable;
        Memoable memoableCopy;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (digest instanceof Memoable) {
            addFieldElement(digest, eCPoint.getAffineXCoord());
            addFieldElement(digest, eCPoint.getAffineYCoord());
            memoable = (Memoable) digest;
            memoableCopy = memoable.copy();
        } else {
            memoable = null;
            memoableCopy = null;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (memoable != null) {
                memoable.reset(memoableCopy);
            } else {
                addFieldElement(digest, eCPoint.getAffineXCoord());
                addFieldElement(digest, eCPoint.getAffineYCoord());
            }
            i11++;
            Pack.intToBigEndian(i11, bArr2, 0);
            digest.update(bArr2, 0, 4);
            digest.doFinal(bArr2, 0);
            int iMin = Math.min(digestSize, bArr.length - i10);
            Bytes.xorTo(iMin, bArr2, 0, bArr, i10);
            i10 += iMin;
        }
    }

    private BigInteger nextK() {
        int iBitLength = this.ecParams.getN().bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.random);
            if (!bigIntegerCreateRandomBigInteger.equals(BigIntegers.ZERO) && bigIntegerCreateRandomBigInteger.compareTo(this.ecParams.getN()) < 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
    }

    private boolean notEncrypted(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            if (bArr[i11] != bArr2[i10 + i11]) {
                return false;
            }
        }
        return true;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public int getOutputSize(int i10) {
        return this.digest.getDigestSize() + k.b(this.curveLength, 2, 1, i10);
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        if (z10) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
            this.ecKey = eCKeyParameters;
            this.ecParams = eCKeyParameters.getParameters();
            if (((ECPublicKeyParameters) this.ecKey).getQ().multiply(this.ecParams.getH()).isInfinity()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.random = parametersWithRandom.getRandom();
        } else {
            ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters2;
            this.ecParams = eCKeyParameters2.getParameters();
        }
        this.curveLength = (this.ecParams.getCurve().getFieldSize() + 7) / 8;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("SM2", ConstraintUtils.bitsOfSecurityFor(this.ecParams.getCurve()), this.ecKey, Utils.getPurpose(z10)));
    }

    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (i10 + i11 > bArr.length || i11 == 0) {
            throw new DataLengthException("input buffer too short");
        }
        return this.forEncryption ? encrypt(bArr, i10, i11) : decrypt(bArr, i10, i11);
    }

    public SM2Engine(Digest digest) {
        this(digest, Mode.C1C2C3);
    }

    public SM2Engine(Digest digest, Mode mode) {
        if (mode == null) {
            throw new IllegalArgumentException("mode cannot be NULL");
        }
        this.digest = digest;
        this.mode = mode;
    }

    public SM2Engine(Mode mode) {
        this(new SM3Digest(), mode);
    }
}
