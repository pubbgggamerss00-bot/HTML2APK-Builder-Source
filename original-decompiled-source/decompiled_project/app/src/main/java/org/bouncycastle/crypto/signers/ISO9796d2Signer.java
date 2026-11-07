package org.bouncycastle.crypto.signers;

import j2.y;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
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
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    private void clearBlock(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z10;
        int i10 = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i10 > bArr3.length) {
            z10 = bArr3.length <= bArr2.length;
            for (int i11 = 0; i11 != this.mBuf.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                }
            }
            return z10;
        }
        z10 = i10 == bArr2.length;
        for (int i12 = 0; i12 != bArr2.length; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                z10 = false;
            }
        }
        return z10;
    }

    private boolean returnFalse(byte[] bArr) {
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int length;
        int i10;
        int i11;
        int i12;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr = this.block;
            length = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i10 = 8;
        } else {
            byte[] bArr3 = this.block;
            length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int length2 = bArr4.length - 2;
            int i13 = this.trailer;
            bArr4[length2] = (byte) (i13 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i13;
            i10 = 16;
        }
        int i14 = this.messageLength;
        int i15 = ((((digestSize + i14) * 8) + i10) + 4) - this.keyBits;
        if (i15 > 0) {
            int i16 = i14 - ((i15 + 7) / 8);
            i11 = length - i16;
            System.arraycopy(this.mBuf, 0, this.block, i11, i16);
            this.recoveredMessage = new byte[i16];
            i12 = 96;
        } else {
            i11 = length - i14;
            System.arraycopy(this.mBuf, 0, this.block, i11, i14);
            this.recoveredMessage = new byte[this.messageLength];
            i12 = 64;
        }
        int i17 = i11 - 1;
        if (i17 > 0) {
            for (int i18 = i17; i18 != 0; i18--) {
                this.block[i18] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i17] = (byte) (bArr5[i17] ^ 1);
            bArr5[0] = RegisterType.FLOAT;
            bArr5[0] = (byte) (11 | i12);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i12);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] bArrProcessBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        this.fullMessage = (i12 & 32) == 0;
        byte[] bArr8 = this.mBuf;
        byte[] bArr9 = this.recoveredMessage;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.messageLength = 0;
        clearBlock(this.mBuf);
        clearBlock(this.block);
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
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z10, rSAKeyParameters);
        int iBitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = iBitLength;
        byte[] bArr = new byte[(iBitLength + 7) / 8];
        this.block = bArr;
        int i10 = this.trailer;
        int length = bArr.length;
        if (i10 == 188) {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.digest.update(b10);
        int i10 = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i10 < bArr.length) {
            bArr[i10] = b10;
        }
        this.messageLength = i10 + 1;
    }

    @Override // org.bouncycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        int i10;
        byte[] bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((bArrProcessBlock[0] & 192) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & RegisterType.DOUBLE_HI) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
            i10 = 1;
        } else {
            i10 = 2;
            int i11 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
            Integer trailer = ISOTrailers.getTrailer(this.digest);
            if (trailer == null) {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            int iIntValue = trailer.intValue();
            if (i11 != iIntValue && (iIntValue != 15052 || i11 != 16588)) {
                throw new IllegalStateException(y.a(i11, "signer initialised with wrong digest for trailer "));
            }
        }
        int i12 = 0;
        while (i12 != bArrProcessBlock.length && ((bArrProcessBlock[i12] & RegisterType.DOUBLE_HI) ^ 10) != 0) {
            i12++;
        }
        int i13 = i12 + 1;
        int length = ((bArrProcessBlock.length - i10) - this.digest.getDigestSize()) - i13;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((bArrProcessBlock[0] & 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(bArrProcessBlock, i13, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(bArrProcessBlock, i13, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = bArrProcessBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArrProcessBlock;
        int i10;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                bArrProcessBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!Arrays.areEqual(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrProcessBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((bArrProcessBlock[0] & 192) ^ 64) == 0 && ((bArrProcessBlock[bArrProcessBlock.length - 1] & RegisterType.DOUBLE_HI) ^ 12) == 0) {
            if (((bArrProcessBlock[bArrProcessBlock.length - 1] & 255) ^ 188) == 0) {
                i10 = 1;
            } else {
                i10 = 2;
                int i11 = ((bArrProcessBlock[bArrProcessBlock.length - 2] & 255) << 8) | (bArrProcessBlock[bArrProcessBlock.length - 1] & 255);
                Integer trailer = ISOTrailers.getTrailer(this.digest);
                if (trailer == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int iIntValue = trailer.intValue();
                if (i11 != iIntValue && (iIntValue != 15052 || i11 != 16588)) {
                    throw new IllegalStateException(y.a(i11, "signer initialised with wrong digest for trailer "));
                }
            }
            int i12 = 0;
            while (i12 != bArrProcessBlock.length && ((bArrProcessBlock[i12] & RegisterType.DOUBLE_HI) ^ 10) != 0) {
                i12++;
            }
            int i13 = i12 + 1;
            int digestSize = this.digest.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (bArrProcessBlock.length - i10) - digestSize;
            int i14 = length - i13;
            if (i14 <= 0) {
                return returnFalse(bArrProcessBlock);
            }
            if ((bArrProcessBlock[0] & 32) == 0) {
                this.fullMessage = true;
                if (this.messageLength > i14) {
                    return returnFalse(bArrProcessBlock);
                }
                this.digest.reset();
                this.digest.update(bArrProcessBlock, i13, i14);
                this.digest.doFinal(bArr3, 0);
                boolean z10 = true;
                for (int i15 = 0; i15 != digestSize; i15++) {
                    int i16 = length + i15;
                    byte b10 = (byte) (bArrProcessBlock[i16] ^ bArr3[i15]);
                    bArrProcessBlock[i16] = b10;
                    if (b10 != 0) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr4 = new byte[i14];
                this.recoveredMessage = bArr4;
                System.arraycopy(bArrProcessBlock, i13, bArr4, 0, bArr4.length);
            } else {
                this.fullMessage = false;
                this.digest.doFinal(bArr3, 0);
                boolean z11 = true;
                for (int i17 = 0; i17 != digestSize; i17++) {
                    int i18 = length + i17;
                    byte b11 = (byte) (bArrProcessBlock[i18] ^ bArr3[i17]);
                    bArrProcessBlock[i18] = b11;
                    if (b11 != 0) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    return returnFalse(bArrProcessBlock);
                }
                byte[] bArr5 = new byte[i14];
                this.recoveredMessage = bArr5;
                System.arraycopy(bArrProcessBlock, i13, bArr5, 0, bArr5.length);
            }
            if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
                return returnFalse(bArrProcessBlock);
            }
            clearBlock(this.mBuf);
            clearBlock(bArrProcessBlock);
            this.messageLength = 0;
            return true;
        }
        return returnFalse(bArrProcessBlock);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z10) {
        int iIntValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
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
        while (i11 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        this.digest.update(bArr, i10, i11);
        this.messageLength += i11;
    }
}
