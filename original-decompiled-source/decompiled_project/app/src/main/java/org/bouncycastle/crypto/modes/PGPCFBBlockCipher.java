package org.bouncycastle.crypto.modes;

import ad.k;
import m.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class PGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;
    private boolean inlineIv;
    private byte[] tmp;

    public PGPCFBBlockCipher(BlockCipher blockCipher, boolean z10) {
        this.cipher = blockCipher;
        this.inlineIv = z10;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
        this.tmp = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12 = this.blockSize;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i13 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i14 = 0; i14 < this.blockSize; i14++) {
            bArr2[i11 + i14] = encryptByte(bArr[i10 + i14], i14);
        }
        while (true) {
            int i15 = this.blockSize;
            if (i13 >= i15) {
                return i15;
            }
            this.FR[i13] = bArr[i10 + i13];
            i13++;
        }
    }

    private int decryptBlockWithIV(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12;
        int i13 = this.blockSize;
        if (i10 + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = this.count;
        if (i14 == 0) {
            for (int i15 = 0; i15 < this.blockSize; i15++) {
                this.FR[i15] = bArr[i10 + i15];
            }
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            this.count += this.blockSize;
            return 0;
        }
        if (i14 != i13) {
            if (i14 >= i13 + 2) {
                System.arraycopy(bArr, i10, this.tmp, 0, i13);
                bArr2[i11] = encryptByte(this.tmp[0], this.blockSize - 2);
                bArr2[i11 + 1] = encryptByte(this.tmp[1], this.blockSize - 1);
                System.arraycopy(this.tmp, 0, this.FR, this.blockSize - 2, 2);
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i16 = 0;
                while (true) {
                    i12 = this.blockSize;
                    if (i16 >= i12 - 2) {
                        break;
                    }
                    bArr2[i11 + i16 + 2] = encryptByte(this.tmp[i16 + 2], i16);
                    i16++;
                }
                System.arraycopy(this.tmp, 2, this.FR, 0, i12 - 2);
            }
            return this.blockSize;
        }
        System.arraycopy(bArr, i10, this.tmp, 0, i13);
        byte[] bArr3 = this.FR;
        System.arraycopy(bArr3, 2, bArr3, 0, this.blockSize - 2);
        byte[] bArr4 = this.FR;
        int i17 = this.blockSize;
        byte[] bArr5 = this.tmp;
        bArr4[i17 - 2] = bArr5[0];
        bArr4[i17 - 1] = bArr5[1];
        this.cipher.processBlock(bArr4, 0, this.FRE, 0);
        int i18 = 0;
        while (true) {
            int i19 = this.blockSize;
            if (i18 >= i19 - 2) {
                System.arraycopy(this.tmp, 2, this.FR, 0, i19 - 2);
                this.count += 2;
                return this.blockSize - 2;
            }
            bArr2[i11 + i18] = encryptByte(this.tmp[i18 + 2], i18);
            i18++;
        }
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12 = this.blockSize;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i13 = 0;
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        for (int i14 = 0; i14 < this.blockSize; i14++) {
            bArr2[i11 + i14] = encryptByte(bArr[i10 + i14], i14);
        }
        while (true) {
            int i15 = this.blockSize;
            if (i13 >= i15) {
                return i15;
            }
            this.FR[i13] = bArr2[i11 + i13];
            i13++;
        }
    }

    private int encryptBlockWithIV(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12;
        int i13;
        int i14 = this.blockSize;
        if (i10 + i14 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int i15 = this.count;
        if (i15 != 0) {
            if (i15 >= i14 + 2) {
                if (i14 + i11 > bArr2.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                int i16 = 0;
                while (true) {
                    i12 = this.blockSize;
                    if (i16 >= i12) {
                        break;
                    }
                    bArr2[i11 + i16] = encryptByte(bArr[i10 + i16], i16);
                    i16++;
                }
                System.arraycopy(bArr2, i11, this.FR, 0, i12);
            }
            return this.blockSize;
        }
        if (k.b(i14, 2, i11, 2) > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i17 = 0;
        while (true) {
            i13 = this.blockSize;
            if (i17 >= i13) {
                break;
            }
            bArr2[i11 + i17] = encryptByte(this.IV[i17], i17);
            i17++;
        }
        System.arraycopy(bArr2, i11, this.FR, 0, i13);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i18 = this.blockSize;
        bArr2[i11 + i18] = encryptByte(this.IV[i18 - 2], 0);
        int i19 = this.blockSize;
        bArr2[i11 + i19 + 1] = encryptByte(this.IV[i19 - 1], 1);
        System.arraycopy(bArr2, i11 + 2, this.FR, 0, this.blockSize);
        this.cipher.processBlock(this.FR, 0, this.FRE, 0);
        int i20 = 0;
        while (true) {
            int i21 = this.blockSize;
            if (i20 >= i21) {
                System.arraycopy(bArr2, i11 + i21 + 2, this.FR, 0, i21);
                int i22 = this.count;
                int i23 = this.blockSize;
                this.count = k.b(i23, 2, 2, i22);
                return (i23 * 2) + 2;
            }
            bArr2[a.a(i11, i21, 2, i20)] = encryptByte(bArr[i10 + i20], i20);
            i20++;
        }
    }

    private byte encryptByte(byte b10, int i10) {
        return (byte) (b10 ^ this.FRE[i10]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        StringBuilder sb;
        String str;
        if (this.inlineIv) {
            sb = new StringBuilder();
            sb.append(this.cipher.getAlgorithmName());
            str = "/PGPCFBwithIV";
        } else {
            sb = new StringBuilder();
            sb.append(this.cipher.getAlgorithmName());
            str = "/PGPCFB";
        }
        sb.append(str);
        return sb.toString();
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
        BlockCipher blockCipher;
        this.forEncryption = z10;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i10 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i10 >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i10] = 0;
                    i10++;
                }
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            blockCipher = this.cipher;
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        return this.inlineIv ? this.forEncryption ? encryptBlockWithIV(bArr, i10, bArr2, i11) : decryptBlockWithIV(bArr, i10, bArr2, i11) : this.forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.FR;
            if (i10 == bArr.length) {
                this.cipher.reset();
                return;
            }
            if (this.inlineIv) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = this.IV[i10];
            }
            i10++;
        }
    }
}
