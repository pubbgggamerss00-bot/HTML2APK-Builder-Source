package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: classes2.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private byte[] blockBuffer;
    private AsymmetricBlockCipher engine;
    private byte[] fallback;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private int pLen;
    private SecureRandom random;
    private boolean useStrictLength;

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
    }

    private static int checkPkcs1Encoding1(byte[] bArr) {
        int i10 = 0;
        int i11 = -((bArr[0] & 255) ^ 1);
        int i12 = 0;
        for (int i13 = 1; i13 < bArr.length; i13++) {
            int i14 = bArr[i13] & 255;
            int i15 = (i14 - 1) >> 31;
            i10 ^= ((~i12) & i13) & i15;
            i12 |= i15;
            i11 |= ~((((i14 ^ 255) - 1) >> 31) | i12);
        }
        return ((bArr.length - 1) - i10) | (((i10 - 9) | i11) >> 31);
    }

    private static int checkPkcs1Encoding2(byte[] bArr) {
        int i10 = 0;
        int i11 = -((bArr[0] & 255) ^ 2);
        int i12 = 0;
        for (int i13 = 1; i13 < bArr.length; i13++) {
            int i14 = ((bArr[i13] & 255) - 1) >> 31;
            i10 ^= ((~i12) & i13) & i14;
            i12 |= i14;
        }
        return ((bArr.length - 1) - i10) | ((i11 | (i10 - 9)) >> 31);
    }

    private byte[] decodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.forPrivateKey && this.pLen != -1) {
            return decodeBlockOrRandom(bArr, i10, i11);
        }
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i10, i11);
        boolean z10 = this.useStrictLength & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr2 = bArrProcessBlock.length < outputBlockSize ? this.blockBuffer : bArrProcessBlock;
        int iCheckPkcs1Encoding2 = this.forPrivateKey ? checkPkcs1Encoding2(bArr2) : checkPkcs1Encoding1(bArr2);
        try {
            if (iCheckPkcs1Encoding2 < 0) {
                throw new InvalidCipherTextException("block incorrect");
            }
            if (z10) {
                throw new InvalidCipherTextException("block incorrect size");
            }
            byte[] bArr3 = new byte[iCheckPkcs1Encoding2];
            System.arraycopy(bArr2, bArr2.length - iCheckPkcs1Encoding2, bArr3, 0, iCheckPkcs1Encoding2);
            return bArr3;
        } finally {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr4 = this.blockBuffer;
            Arrays.fill(bArr4, 0, Math.max(0, bArr4.length - bArrProcessBlock.length), (byte) 0);
        }
    }

    private byte[] decodeBlockOrRandom(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (!this.forPrivateKey) {
            throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing");
        }
        int i12 = this.pLen;
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[i12];
            this.random.nextBytes(bArr2);
        }
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i10, i11);
        byte[] bArr3 = (bArrProcessBlock.length == outputBlockSize || (!this.useStrictLength && bArrProcessBlock.length >= outputBlockSize)) ? bArrProcessBlock : this.blockBuffer;
        int iCheckPkcs1Encoding2 = checkPkcs1Encoding2(bArr3, i12);
        int length = bArr3.length - i12;
        byte[] bArr4 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr4[i13] = (byte) ((bArr3[length + i13] & (~iCheckPkcs1Encoding2)) | (bArr2[i13] & iCheckPkcs1Encoding2));
        }
        Arrays.fill(bArrProcessBlock, (byte) 0);
        byte[] bArr5 = this.blockBuffer;
        Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (i11 > getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i12 = 1; i12 != (inputBlockSize - i11) - 1; i12++) {
                bArr2[i12] = -1;
            }
        } else {
            this.random.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i13 = 1; i13 != (inputBlockSize - i11) - 1; i13++) {
                while (bArr2[i13] == 0) {
                    bArr2[i13] = (byte) this.random.nextInt();
                }
            }
        }
        int i14 = inputBlockSize - i11;
        bArr2[i14 - 1] = 0;
        System.arraycopy(bArr, i10, bArr2, i14, i11);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private boolean useStrict() {
        if (Properties.isOverrideSetTo(NOT_STRICT_LENGTH_ENABLED_PROPERTY, true)) {
            return false;
        }
        return !Properties.isOverrideSetTo(STRICT_LENGTH_ENABLED_PROPERTY, false);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            asymmetricKeyParameter = (AsymmetricKeyParameter) parametersWithRandom.getParameters();
        } else {
            asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
            if (!asymmetricKeyParameter.isPrivate() && z10) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
        }
        this.engine.init(z10, cipherParameters);
        this.forPrivateKey = asymmetricKeyParameter.isPrivate();
        this.forEncryption = z10;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
        if (this.pLen > 0 && this.fallback == null && this.random == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i10, i11) : decodeBlock(bArr, i10, i11);
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, int i10) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.pLen = i10;
    }

    private static int checkPkcs1Encoding2(byte[] bArr, int i10) {
        int i11 = -((bArr[0] & 255) ^ 2);
        int length = (bArr.length - 1) - i10;
        int i12 = (length - 9) | i11;
        for (int i13 = 1; i13 < length; i13++) {
            i12 |= (bArr[i13] & 255) - 1;
        }
        return ((-(bArr[length] & 255)) | i12) >> 31;
    }

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher, byte[] bArr) {
        this.pLen = -1;
        this.fallback = null;
        this.engine = asymmetricBlockCipher;
        this.useStrictLength = useStrict();
        this.fallback = bArr;
        this.pLen = bArr.length;
    }
}
