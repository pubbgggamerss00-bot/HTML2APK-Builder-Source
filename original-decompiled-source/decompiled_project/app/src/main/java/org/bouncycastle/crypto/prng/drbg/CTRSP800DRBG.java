package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes2.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static final byte[] K_BITS = Hex.decodeStrict("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private byte[] _Key;
    private byte[] _V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    public CTRSP800DRBG(BlockCipher blockCipher, int i10, int i11, EntropySource entropySource, byte[] bArr, byte[] bArr2) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i10;
        this._securityStrength = i11;
        this._seedLength = (blockCipher.getBlockSize() * 8) + i10;
        this._isTDEA = isTDEA(blockCipher);
        if (i11 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (getMaxSecurityStrength(blockCipher, i10) < i11) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        if (entropySource.entropySize() < i11) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        for (int i10 = 0; i10 < length; i10++) {
            Bytes.xor(blockSize, bArr5, 0, bArr4, i10 * blockSize, bArr6, 0);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        int i11 = i10 / 8;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i11, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = Byte.MIN_VALUE;
        int i12 = this._keySizeInBits;
        int i13 = (i12 / 8) + blockSize;
        byte[] bArr3 = new byte[i13];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i14 = i12 / 8;
        byte[] bArr6 = new byte[i14];
        System.arraycopy(K_BITS, 0, bArr6, 0, i14);
        int i15 = 0;
        while (true) {
            int i16 = i15 * blockSize;
            if (i16 * 8 >= (blockSize * 8) + this._keySizeInBits) {
                break;
            }
            copyIntToByteArray(bArr5, i15, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i17 = i13 - i16;
            if (i17 > blockSize) {
                i17 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i16, i17);
            i15++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i14);
        System.arraycopy(bArr3, i14, bArr7, 0, blockSize);
        byte[] bArr8 = new byte[i11];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i18 = 0;
        while (true) {
            int i19 = i18 * blockSize;
            if (i19 >= i11) {
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i20 = i11 - i19;
            if (i20 > blockSize) {
                i20 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i19, i20);
            i18++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArrBlock_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this._V = bArr5;
        CTR_DRBG_Update(bArrBlock_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this._V);
        this._reseedCounter = 1L;
    }

    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i10 = 0;
        while (true) {
            int i11 = i10 * blockSize;
            if (i11 >= bArr.length) {
                Bytes.xorTo(bArr.length, bArr, bArr4);
                System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
                System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
                return;
            } else {
                addOneTo(bArr3);
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                int i12 = length - i11;
                if (i12 > blockSize) {
                    i12 = blockSize;
                }
                System.arraycopy(bArr5, 0, bArr4, i11, i12);
                i10++;
            }
        }
    }

    private void addOneTo(byte[] bArr) {
        int i10 = 1;
        for (int i11 = 1; i11 <= bArr.length; i11++) {
            int i12 = (bArr[bArr.length - i11] & 255) + i10;
            i10 = i12 > 255 ? 1 : 0;
            bArr[bArr.length - i11] = (byte) i12;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i10, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i10) {
        if (isTDEA(blockCipher) && i10 == 168) {
            return 112;
        }
        if (blockCipher.getAlgorithmName().equals("AES")) {
            return i10;
        }
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        return blockCipher.getAlgorithmName().equals("DESede") || blockCipher.getAlgorithmName().equals("TDEA");
    }

    private void padKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        bArr2[i11] = (byte) (bArr[i10] & 254);
        int i12 = i10 + 1;
        bArr2[i11 + 1] = (byte) ((bArr[i10] << 7) | ((bArr[i12] & 252) >>> 1));
        int i13 = bArr[i12] << 6;
        int i14 = i10 + 2;
        bArr2[i11 + 2] = (byte) (i13 | ((bArr[i14] & 248) >>> 2));
        int i15 = bArr[i14] << 5;
        int i16 = i10 + 3;
        bArr2[i11 + 3] = (byte) (i15 | ((bArr[i16] & 240) >>> 3));
        int i17 = bArr[i16] << 4;
        int i18 = i10 + 4;
        bArr2[i11 + 4] = (byte) (i17 | ((bArr[i18] & 224) >>> 4));
        int i19 = bArr[i18] << 3;
        int i20 = i10 + 5;
        bArr2[i11 + 5] = (byte) (i19 | ((bArr[i20] & 192) >>> 5));
        int i21 = i10 + 6;
        bArr2[i11 + 6] = (byte) ((bArr[i20] << 2) | ((bArr[i21] & 128) >>> 6));
        int i22 = i11 + 7;
        bArr2[i22] = (byte) (bArr[i21] << 1);
        while (i11 <= i22) {
            byte b10 = bArr2[i11];
            bArr2[i11] = (byte) (((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) & 1) | (b10 & 254));
            i11++;
        }
    }

    public byte[] expandKey(byte[] bArr) {
        if (!this._isTDEA) {
            return bArr;
        }
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z10) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArrBlock_Cipher_df;
        boolean z11 = this._isTDEA;
        long j10 = this._reseedCounter;
        if (z11) {
            if (j10 > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j10 > AES_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z10) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArrBlock_Cipher_df = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        } else {
            bArrBlock_Cipher_df = new byte[this._seedLength / 8];
        }
        int length = this._V.length;
        byte[] bArr3 = new byte[length];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i10 = 0; i10 <= bArr.length / length; i10++) {
            int i11 = i10 * length;
            int length2 = bArr.length - i11 > length ? length : bArr.length - (this._V.length * i10);
            if (length2 != 0) {
                addOneTo(this._V);
                this._engine.processBlock(this._V, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i11, length2);
            }
        }
        CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        this._reseedCounter++;
        return bArr.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._V.length * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        CTR_DRBG_Reseed_algorithm(bArr);
    }
}
