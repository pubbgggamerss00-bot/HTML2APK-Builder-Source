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

/* loaded from: classes2.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;
    private final byte[] iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
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
            System.arraycopy(DEFAULT_IV, 0, this.iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv, 0, this.iv, 0, 8);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArr2;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i11 < 16) {
            throw new InvalidCipherTextException("unwrap data too short");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        int i13 = 1;
        this.engine.init(!this.wrapCipherMode, this.param);
        byte[] bArr3 = this.iv;
        byte[] bArr4 = new byte[i11 - bArr3.length];
        byte[] bArr5 = new byte[bArr3.length];
        byte[] bArr6 = new byte[bArr3.length + 8];
        int i14 = i12 - 1;
        if (i14 == 1) {
            this.engine.processBlock(bArr, i10, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr5, 0, this.iv.length);
            System.arraycopy(bArr6, this.iv.length, bArr4, 0, 8);
        } else {
            System.arraycopy(bArr, i10, bArr5, 0, bArr3.length);
            byte[] bArr7 = this.iv;
            System.arraycopy(bArr, bArr7.length + i10, bArr4, 0, i11 - bArr7.length);
            for (int i15 = 5; i15 >= 0; i15--) {
                int i16 = i14;
                while (i16 >= i13) {
                    System.arraycopy(bArr5, 0, bArr6, 0, this.iv.length);
                    int i17 = (i16 - 1) * 8;
                    System.arraycopy(bArr4, i17, bArr6, this.iv.length, 8);
                    int i18 = (i14 * i15) + i16;
                    int i19 = i13;
                    while (i18 != 0) {
                        int i20 = i13;
                        int length = this.iv.length - i19;
                        bArr6[length] = (byte) (bArr6[length] ^ ((byte) i18));
                        i18 >>>= 8;
                        i19++;
                        i13 = i20;
                    }
                    this.engine.processBlock(bArr6, 0, bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr5, 0, 8);
                    System.arraycopy(bArr6, 8, bArr4, i17, 8);
                    i16--;
                    i13 = i13;
                }
            }
        }
        if (i14 != i13) {
            if (!Arrays.constantTimeAreEqual(bArr5, this.iv)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        } else if (!Arrays.constantTimeAreEqual(bArr5, this.iv)) {
            System.arraycopy(bArr, i10, bArr5, 0, this.iv.length);
            byte[] bArr8 = this.iv;
            System.arraycopy(bArr, i10 + bArr8.length, bArr4, 0, i11 - bArr8.length);
            int i21 = 5;
            while (true) {
                bArr2 = this.iv;
                if (i21 < 0) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr6, 0, bArr2.length);
                System.arraycopy(bArr4, 0, bArr6, this.iv.length, 8);
                int i22 = (i14 * i21) + 1;
                int i23 = 1;
                while (i22 != 0) {
                    int length2 = this.iv.length - i23;
                    bArr6[length2] = (byte) (((byte) i22) ^ bArr6[length2]);
                    i22 >>>= 8;
                    i23++;
                }
                this.engine.processBlock(bArr6, 0, bArr6, 0);
                System.arraycopy(bArr6, 0, bArr5, 0, 8);
                System.arraycopy(bArr6, 8, bArr4, 0, 8);
                i21--;
            }
            if (!Arrays.constantTimeAreEqual(bArr5, bArr2)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i11 < 8) {
            throw new DataLengthException("wrap data must be at least 8 bytes");
        }
        int i12 = i11 / 8;
        if (i12 * 8 != i11) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        this.engine.init(this.wrapCipherMode, this.param);
        byte[] bArr2 = this.iv;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, this.iv.length, i11);
        if (i12 == 1) {
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[this.iv.length + 8];
        for (int i13 = 0; i13 != 6; i13++) {
            for (int i14 = 1; i14 <= i12; i14++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                int i15 = i14 * 8;
                System.arraycopy(bArr3, i15, bArr4, this.iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i16 = (i12 * i13) + i14;
                int i17 = 1;
                while (i16 != 0) {
                    int length = this.iv.length - i17;
                    bArr4[length] = (byte) (((byte) i16) ^ bArr4[length]);
                    i16 >>>= 8;
                    i17++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i15, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z10) {
        this.iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z10;
    }
}
