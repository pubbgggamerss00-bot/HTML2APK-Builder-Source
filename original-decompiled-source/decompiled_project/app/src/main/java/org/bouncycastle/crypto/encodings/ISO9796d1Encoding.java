package org.bouncycastle.crypto.encodings;

import ad.k;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {RegisterType.DOUBLE_LO, 3, 5, 8, 9, 4, 2, RegisterType.DOUBLE_HI, 0, RegisterType.LONG_HI, RegisterType.FLOAT, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, RegisterType.DOUBLE_HI, 6, 1, 5, 2, RegisterType.FLOAT, 12, 3, 4, RegisterType.LONG_HI, 10, RegisterType.DOUBLE_LO, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i10, i11);
        int i12 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!bigIntegerMod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] bArrConvertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & RegisterType.DOUBLE_HI) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] = (byte) (((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 255) >>> 4) | (inverse[(bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 2] & 255) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b10 = bArrConvertOutputDecryptOnly[1];
        byte b11 = (byte) (bArr2[b10 & RegisterType.DOUBLE_HI] | (bArr2[(b10 & 255) >>> 4] << 4));
        bArrConvertOutputDecryptOnly[0] = b11;
        int i13 = 1;
        int i14 = 0;
        boolean z10 = false;
        for (int length = bArrConvertOutputDecryptOnly.length - 1; length >= bArrConvertOutputDecryptOnly.length - (i12 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b12 = bArrConvertOutputDecryptOnly[length];
            int i15 = bArr3[b12 & RegisterType.DOUBLE_HI] | (bArr3[(b12 & 255) >>> 4] << 4);
            int i16 = length - 1;
            byte b13 = bArrConvertOutputDecryptOnly[i16];
            if (((b13 ^ i15) & 255) != 0) {
                if (z10) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i13 = (b13 ^ i15) & 255;
                z10 = true;
                i14 = i16;
            }
        }
        bArrConvertOutputDecryptOnly[i14] = 0;
        int length2 = (bArrConvertOutputDecryptOnly.length - i14) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i17 = 0; i17 < length2; i17++) {
            bArr4[i17] = bArrConvertOutputDecryptOnly[k.b(i17, 2, i14, 1)];
        }
        this.padBits = i13 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        int i12 = this.bitSize;
        int i13 = (i12 + 7) / 8;
        byte[] bArr2 = new byte[i13];
        int i14 = 1;
        int i15 = this.padBits + 1;
        int i16 = (i12 + 13) / 16;
        int i17 = 0;
        while (i17 < i16) {
            if (i17 > i16 - i11) {
                int i18 = i16 - i17;
                System.arraycopy(bArr, (i10 + i11) - i18, bArr2, i13 - i16, i18);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13 - (i17 + i11), i11);
            }
            i17 += i11;
        }
        for (int i19 = i13 - (i16 * 2); i19 != i13; i19 += 2) {
            byte b10 = bArr2[(i19 / 2) + (i13 - i16)];
            byte[] bArr3 = shadows;
            bArr2[i19] = (byte) (bArr3[b10 & RegisterType.DOUBLE_HI] | (bArr3[(b10 & 255) >>> 4] << 4));
            bArr2[i19 + 1] = b10;
        }
        int i20 = i13 - (i11 * 2);
        bArr2[i20] = (byte) (bArr2[i20] ^ i15);
        int i21 = i13 - 1;
        bArr2[i21] = (byte) ((bArr2[i21] << 4) | 6);
        int i22 = 8 - ((this.bitSize - 1) % 8);
        if (i22 != 8) {
            byte b11 = (byte) (bArr2[0] & (255 >>> i22));
            bArr2[0] = b11;
            bArr2[0] = (byte) ((128 >>> i22) | b11);
            i14 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.engine.processBlock(bArr2, i14, i13 - i14);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z10, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z10;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i10, i11) : decodeBlock(bArr, i10, i11);
    }

    public void setPadBits(int i10) {
        if (i10 > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i10;
    }
}
