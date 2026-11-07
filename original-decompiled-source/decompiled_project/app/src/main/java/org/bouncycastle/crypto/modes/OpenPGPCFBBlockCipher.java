package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12;
        int i13 = this.blockSize;
        if (i10 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = this.count;
        int i15 = 2;
        int i16 = 0;
        if (i14 > i13) {
            byte b10 = bArr[i10];
            this.FR[i13 - 2] = b10;
            bArr2[i11] = encryptByte(b10, i13 - 2);
            byte b11 = bArr[i10 + 1];
            byte[] bArr3 = this.FR;
            int i17 = this.blockSize;
            bArr3[i17 - 1] = b11;
            bArr2[i11 + 1] = encryptByte(b11, i17 - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i15 < this.blockSize) {
                byte b12 = bArr[i10 + i15];
                int i18 = i15 - 2;
                this.FR[i18] = b12;
                bArr2[i11 + i15] = encryptByte(b12, i18);
                i15++;
            }
        } else {
            if (i14 != 0) {
                if (i14 == i13) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    byte b13 = bArr[i10];
                    byte b14 = bArr[i10 + 1];
                    bArr2[i11] = encryptByte(b13, 0);
                    bArr2[i11 + 1] = encryptByte(b14, 1);
                    byte[] bArr4 = this.FR;
                    System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                    byte[] bArr5 = this.FR;
                    int i19 = this.blockSize;
                    bArr5[i19 - 2] = b13;
                    bArr5[i19 - 1] = b14;
                    this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                    while (true) {
                        i12 = this.blockSize;
                        if (i15 >= i12) {
                            break;
                        }
                        byte b15 = bArr[i10 + i15];
                        int i20 = i15 - 2;
                        this.FR[i20] = b15;
                        bArr2[i11 + i15] = encryptByte(b15, i20);
                        i15++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i12 = this.blockSize;
                    if (i16 >= i12) {
                        break;
                    }
                    int i21 = i10 + i16;
                    this.FR[i16] = bArr[i21];
                    bArr2[i11 + i16] = encryptByte(bArr[i21], i16);
                    i16++;
                }
            }
            this.count += i12;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12;
        int i13 = this.blockSize;
        if (i10 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = this.count;
        int i15 = 2;
        int i16 = 0;
        if (i14 > i13) {
            byte[] bArr3 = this.FR;
            int i17 = i13 - 2;
            byte bEncryptByte = encryptByte(bArr[i10], i13 - 2);
            bArr2[i11] = bEncryptByte;
            bArr3[i17] = bEncryptByte;
            byte[] bArr4 = this.FR;
            int i18 = this.blockSize;
            int i19 = i18 - 1;
            byte bEncryptByte2 = encryptByte(bArr[i10 + 1], i18 - 1);
            bArr2[i11 + 1] = bEncryptByte2;
            bArr4[i19] = bEncryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i15 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i20 = i15 - 2;
                byte bEncryptByte3 = encryptByte(bArr[i10 + i15], i20);
                bArr2[i11 + i15] = bEncryptByte3;
                bArr5[i20] = bEncryptByte3;
                i15++;
            }
        } else {
            if (i14 != 0) {
                if (i14 == i13) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i11] = encryptByte(bArr[i10], 0);
                    bArr2[i11 + 1] = encryptByte(bArr[i10 + 1], 1);
                    byte[] bArr6 = this.FR;
                    System.arraycopy(bArr6, 2, bArr6, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i11, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i12 = this.blockSize;
                        if (i15 >= i12) {
                            break;
                        }
                        byte[] bArr7 = this.FR;
                        int i21 = i15 - 2;
                        byte bEncryptByte4 = encryptByte(bArr[i10 + i15], i21);
                        bArr2[i11 + i15] = bEncryptByte4;
                        bArr7[i21] = bEncryptByte4;
                        i15++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i12 = this.blockSize;
                    if (i16 >= i12) {
                        break;
                    }
                    byte[] bArr8 = this.FR;
                    byte bEncryptByte5 = encryptByte(bArr[i10 + i16], i16);
                    bArr2[i11 + i16] = bEncryptByte5;
                    bArr8[i16] = bEncryptByte5;
                    i16++;
                }
            }
            this.count += i12;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b10, int i10) {
        return (byte) (b10 ^ this.FRE[i10]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z10;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        return this.forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
