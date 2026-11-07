package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class RFC5649WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, 89, 89, -90};
    private final BlockCipher engine;
    private final byte[] preIV = new byte[4];
    private KeyParameter param = null;
    private boolean forWrapping = true;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        this.engine = blockCipher;
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i10 = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i10];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i10 != 0) {
            System.arraycopy(new byte[i10], 0, bArr2, length, i10);
        }
        return bArr2;
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i10, int i11, byte[] bArr2) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i10, bArr4, 0, 8);
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        this.engine.init(false, this.param);
        int i13 = (i11 / 8) - 1;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i13; i15 >= 1; i15--) {
                int i16 = (i15 - 1) * 8;
                System.arraycopy(bArr3, i16, bArr4, 8, 8);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int i19 = 8 - i18;
                    bArr4[i19] = (byte) (bArr4[i19] ^ ((byte) i17));
                    i17 >>>= 8;
                    i18++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 8, bArr3, i16, 8);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, 8);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forWrapping = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.preIV, 0, 4);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv, 0, this.preIV, 0, 4);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArrRfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        if (i12 <= 1) {
            throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] bArr3 = new byte[i11];
        byte[] bArr4 = new byte[8];
        if (i12 == 2) {
            this.engine.init(false, this.param);
            int blockSize = this.engine.getBlockSize();
            for (int i13 = 0; i13 < i11; i13 += blockSize) {
                this.engine.processBlock(bArr2, i13, bArr3, i13);
            }
            System.arraycopy(bArr3, 0, bArr4, 0, 8);
            int i14 = i11 - 8;
            bArrRfc3394UnwrapNoIvCheck = new byte[i14];
            System.arraycopy(bArr3, 8, bArrRfc3394UnwrapNoIvCheck, 0, i14);
        } else {
            bArrRfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i10, i11, bArr4);
        }
        int i15 = 4;
        byte[] bArr5 = new byte[4];
        System.arraycopy(bArr4, 0, bArr5, 0, 4);
        int iBigEndianToInt = Pack.bigEndianToInt(bArr4, 4);
        boolean zConstantTimeAreEqual = Arrays.constantTimeAreEqual(bArr5, this.preIV);
        int length = bArrRfc3394UnwrapNoIvCheck.length;
        if (iBigEndianToInt <= length - 8) {
            zConstantTimeAreEqual = false;
        }
        if (iBigEndianToInt > length) {
            zConstantTimeAreEqual = false;
        }
        int i16 = length - iBigEndianToInt;
        if (i16 >= 8 || i16 < 0) {
            zConstantTimeAreEqual = false;
        } else {
            i15 = i16;
        }
        byte[] bArr6 = new byte[i15];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, bArrRfc3394UnwrapNoIvCheck.length - i15, bArr6, 0, i15);
        if (!Arrays.constantTimeAreEqual(bArr6, new byte[i15])) {
            zConstantTimeAreEqual = false;
        }
        if (!zConstantTimeAreEqual) {
            throw new InvalidCipherTextException("checksum failed");
        }
        byte[] bArr7 = new byte[iBigEndianToInt];
        System.arraycopy(bArrRfc3394UnwrapNoIvCheck, 0, bArr7, 0, iBigEndianToInt);
        return bArr7;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(this.preIV, 0, bArr2, 0, 4);
        Pack.intToBigEndian(i11, bArr2, 4);
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, i10, bArr3, 0, i11);
        byte[] bArrPadPlaintext = padPlaintext(bArr3);
        if (bArrPadPlaintext.length != 8) {
            RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
            rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
            return rFC3394WrapEngine.wrap(bArrPadPlaintext, 0, bArrPadPlaintext.length);
        }
        int length = bArrPadPlaintext.length + 8;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        System.arraycopy(bArrPadPlaintext, 0, bArr4, 8, bArrPadPlaintext.length);
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        for (int i12 = 0; i12 < length; i12 += blockSize) {
            this.engine.processBlock(bArr4, i12, bArr4, i12);
        }
        return bArr4;
    }
}
