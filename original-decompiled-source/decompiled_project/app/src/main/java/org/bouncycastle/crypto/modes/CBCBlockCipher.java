package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultMultiBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CBCBlockCipher extends DefaultMultiBlockCipher implements CBCModeCipher {
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.cbcV = new byte[blockSize];
        this.cbcNextV = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12 = this.blockSize;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i10, this.cbcNextV, 0, i12);
        int iProcessBlock = this.cipher.processBlock(bArr, i10, bArr2, i11);
        for (int i13 = 0; i13 < this.blockSize; i13++) {
            int i14 = i11 + i13;
            bArr2[i14] = (byte) (bArr2[i14] ^ this.cbcV[i13]);
        }
        byte[] bArr3 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = bArr3;
        return iProcessBlock;
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (this.blockSize + i10 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i12 = 0; i12 < this.blockSize; i12++) {
            byte[] bArr3 = this.cbcV;
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr[i10 + i12]);
        }
        int iProcessBlock = this.cipher.processBlock(this.cbcV, 0, bArr2, i11);
        byte[] bArr4 = this.cbcV;
        System.arraycopy(bArr2, i11, bArr4, 0, bArr4.length);
        return iProcessBlock;
    }

    public static CBCModeCipher newInstance(BlockCipher blockCipher) {
        return new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.CBCModeCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = this.encrypting;
        this.encrypting = z10;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != this.blockSize) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(iv, 0, this.IV, 0, iv.length);
            cipherParameters = parametersWithIV.getParameters();
        } else {
            Arrays.fill(this.IV, (byte) 0);
        }
        reset();
        if (cipherParameters != null) {
            this.cipher.init(z10, cipherParameters);
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        return this.encrypting ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cbcV, 0, bArr.length);
        Arrays.fill(this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }
}
