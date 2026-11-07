package org.bouncycastle.crypto.signers;

import j2.y;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSalt;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class ISO9796d2PSSSigner implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int hLen;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private int preMStart;
    private byte[] preSig;
    private int preTLength;
    private SecureRandom random;
    private byte[] recoveredMessage;
    private int saltLength;
    private byte[] standardSalt;
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10) {
        this(asymmetricBlockCipher, digest, i10, false);
    }

    private void ItoOSP(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    private void LtoOSP(long j10, byte[] bArr) {
        bArr[0] = (byte) (j10 >>> 56);
        bArr[1] = (byte) (j10 >>> 48);
        bArr[2] = (byte) (j10 >>> 40);
        bArr[3] = (byte) (j10 >>> 32);
        bArr[4] = (byte) (j10 >>> 24);
        bArr[5] = (byte) (j10 >>> 16);
        bArr[6] = (byte) (j10 >>> 8);
        bArr[7] = (byte) j10;
    }

    private void clearBlock(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z10 = this.messageLength == bArr2.length;
        for (int i10 = 0; i10 != bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                z10 = false;
            }
        }
        return z10;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        byte[] bArr2 = new byte[i12];
        byte[] bArr3 = new byte[this.hLen];
        byte[] bArr4 = new byte[4];
        this.digest.reset();
        int i14 = 0;
        while (true) {
            i13 = this.hLen;
            if (i14 >= i12 / i13) {
                break;
            }
            ItoOSP(i14, bArr4);
            this.digest.update(bArr, i10, i11);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i15 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i14 * i15, i15);
            i14++;
        }
        if (i13 * i14 < i12) {
            ItoOSP(i14, bArr4);
            this.digest.update(bArr, i10, i11);
            this.digest.update(bArr4, 0, 4);
            this.digest.doFinal(bArr3, 0);
            int i16 = this.hLen;
            System.arraycopy(bArr3, 0, bArr2, i14 * i16, i12 - (i14 * i16));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        LtoOSP(this.messageLength * 8, bArr2);
        this.digest.update(bArr2, 0, 8);
        this.digest.update(this.mBuf, 0, this.messageLength);
        this.digest.update(bArr, 0, digestSize);
        byte[] bArr3 = this.standardSalt;
        if (bArr3 == null) {
            bArr3 = new byte[this.saltLength];
            this.random.nextBytes(bArr3);
        }
        this.digest.update(bArr3, 0, bArr3.length);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.digest.doFinal(bArr4, 0);
        int i10 = this.trailer == 188 ? 1 : 2;
        byte[] bArr5 = this.block;
        int length = bArr5.length;
        int i11 = this.messageLength;
        int length2 = (((length - i11) - bArr3.length) - this.hLen) - i10;
        bArr5[length2 - 1] = 1;
        System.arraycopy(this.mBuf, 0, bArr5, length2, i11);
        System.arraycopy(bArr3, 0, this.block, length2 + this.messageLength, bArr3.length);
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, digestSize2, (this.block.length - this.hLen) - i10);
        for (int i12 = 0; i12 != bArrMaskGeneratorFunction1.length; i12++) {
            byte[] bArr6 = this.block;
            bArr6[i12] = (byte) (bArr6[i12] ^ bArrMaskGeneratorFunction1[i12]);
        }
        byte[] bArr7 = this.block;
        int length3 = bArr7.length;
        int i13 = this.hLen;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i13) - i10, i13);
        int i14 = this.trailer;
        if (i14 == 188) {
            byte[] bArr8 = this.block;
            bArr8[bArr8.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr9 = this.block;
            bArr9[bArr9.length - 2] = (byte) (i14 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i14;
        }
        byte[] bArr10 = this.block;
        bArr10[0] = (byte) (bArr10[0] & Byte.MAX_VALUE);
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr10, 0, bArr10.length);
        int i15 = this.messageLength;
        byte[] bArr11 = new byte[i15];
        this.recoveredMessage = bArr11;
        byte[] bArr12 = this.mBuf;
        this.fullMessage = i15 <= bArr12.length;
        System.arraycopy(bArr12, 0, bArr11, 0, bArr11.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        this.messageLength = 0;
        return bArrProcessBlock;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters;
        SecureRandom secureRandom;
        int length = this.saltLength;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithRandom.getParameters();
            if (z10) {
                secureRandom = parametersWithRandom.getRandom();
                this.random = secureRandom;
            }
        } else if (cipherParameters instanceof ParametersWithSalt) {
            ParametersWithSalt parametersWithSalt = (ParametersWithSalt) cipherParameters;
            rSAKeyParameters = (RSAKeyParameters) parametersWithSalt.getParameters();
            byte[] salt = parametersWithSalt.getSalt();
            this.standardSalt = salt;
            length = salt.length;
            if (salt.length != this.saltLength) {
                throw new IllegalArgumentException("Fixed salt is of wrong length");
            }
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters;
            if (z10) {
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
                this.random = secureRandom;
            }
        }
        this.cipher.init(z10, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i10 = this.trailer;
        int length2 = bArr.length;
        if (i10 == 188) {
            this.mBuf = new byte[((length2 - this.digest.getDigestSize()) - length) - 2];
        } else {
            this.mBuf = new byte[((length2 - this.digest.getDigestSize()) - length) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        byte[] bArr = this.mBuf;
        if (bArr != null) {
            clearBlock(bArr);
        }
        byte[] bArr2 = this.recoveredMessage;
        if (bArr2 != null) {
            clearBlock(bArr2);
            this.recoveredMessage = null;
        }
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        if (this.preSig == null) {
            int i10 = this.messageLength;
            byte[] bArr = this.mBuf;
            if (i10 < bArr.length) {
                this.messageLength = i10 + 1;
                bArr[i10] = b10;
                return;
            }
        }
        this.digest.update(b10);
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i10;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        int length = bArrProcessBlock.length;
        int i11 = this.keyBits;
        if (length < (i11 + 7) / 8) {
            int i12 = (i11 + 7) / 8;
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArrProcessBlock, 0, bArr2, i12 - bArrProcessBlock.length, bArrProcessBlock.length);
            clearBlock(bArrProcessBlock);
            bArrProcessBlock = bArr2;
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i10 = 1;
        } else {
            i10 = 2;
            int i13 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i13 != iIntValue && (iIntValue != 15052 || i13 != 16588)) {
                throw new IllegalStateException(y.a(i13, "signer initialised with wrong digest for trailer "));
            }
        }
        this.digest.doFinal(new byte[this.hLen], 0);
        int length2 = bArrProcessBlock.length;
        int i14 = this.hLen;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArrProcessBlock, (length2 - i14) - i10, i14, (bArrProcessBlock.length - i14) - i10);
        for (int i15 = 0; i15 != bArrMaskGeneratorFunction1.length; i15++) {
            bArrProcessBlock[i15] = (byte) (bArrProcessBlock[i15] ^ bArrMaskGeneratorFunction1[i15]);
        }
        bArrProcessBlock[0] = (byte) (bArrProcessBlock[0] & Byte.MAX_VALUE);
        int i16 = 0;
        while (i16 != bArrProcessBlock.length && bArrProcessBlock[i16] != 1) {
            i16++;
        }
        int i17 = i16 + 1;
        if (i17 >= bArrProcessBlock.length) {
            clearBlock(bArrProcessBlock);
        }
        this.fullMessage = i17 > 1;
        byte[] bArr3 = new byte[(bArrMaskGeneratorFunction1.length - i17) - this.saltLength];
        this.recoveredMessage = bArr3;
        System.arraycopy(bArrProcessBlock, i17, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.recoveredMessage;
        System.arraycopy(bArr4, 0, this.mBuf, 0, bArr4.length);
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        this.preMStart = i17;
        this.preTLength = i10;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        int i10 = this.hLen;
        byte[] bArr2 = new byte[i10];
        this.digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.preSig;
        if (bArr3 == null) {
            try {
                updateWithRecoveredMessage(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.preBlock;
        int i11 = this.preMStart;
        int i12 = this.preTLength;
        this.preSig = null;
        this.preBlock = null;
        byte[] bArr5 = new byte[8];
        LtoOSP(this.recoveredMessage.length * 8, bArr5);
        this.digest.update(bArr5, 0, 8);
        byte[] bArr6 = this.recoveredMessage;
        if (bArr6.length != 0) {
            this.digest.update(bArr6, 0, bArr6.length);
        }
        this.digest.update(bArr2, 0, i10);
        byte[] bArr7 = this.standardSalt;
        if (bArr7 != null) {
            this.digest.update(bArr7, 0, bArr7.length);
        } else {
            this.digest.update(bArr4, i11 + this.recoveredMessage.length, this.saltLength);
        }
        int digestSize = this.digest.getDigestSize();
        byte[] bArr8 = new byte[digestSize];
        this.digest.doFinal(bArr8, 0);
        int length = (bArr4.length - i12) - digestSize;
        boolean z10 = true;
        for (int i13 = 0; i13 != digestSize; i13++) {
            if (bArr8[i13] != bArr4[length + i13]) {
                z10 = false;
            }
        }
        clearBlock(bArr4);
        clearBlock(bArr8);
        if (!z10) {
            this.fullMessage = false;
            this.messageLength = 0;
            clearBlock(this.recoveredMessage);
            return false;
        }
        if (this.messageLength == 0 || isSameAs(this.mBuf, this.recoveredMessage)) {
            this.messageLength = 0;
            clearBlock(this.mBuf);
            return true;
        }
        this.messageLength = 0;
        clearBlock(this.mBuf);
        return false;
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i10, boolean z10) {
        int iIntValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        this.hLen = digest.getDigestSize();
        this.saltLength = i10;
        if (z10) {
            iIntValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + digest.getAlgorithmName());
            }
            iIntValue = trailer.intValue();
        }
        this.trailer = iIntValue;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        if (this.preSig == null) {
            while (i11 > 0 && this.messageLength < this.mBuf.length) {
                update(bArr[i10]);
                i10++;
                i11--;
            }
        }
        if (i11 > 0) {
            this.digest.update(bArr, i10, i11);
        }
    }
}
