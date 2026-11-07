package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class PaddedBlockCipher extends DefaultBufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iProcessBlock;
        int iProcessBlock2;
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (((DefaultBufferedBlockCipher) this).bufOff != blockSize) {
                iProcessBlock2 = 0;
            } else {
                if ((blockSize * 2) + i10 > bArr.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                iProcessBlock2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i10);
                ((DefaultBufferedBlockCipher) this).bufOff = 0;
            }
            byte b10 = (byte) (blockSize - ((DefaultBufferedBlockCipher) this).bufOff);
            while (true) {
                int i11 = ((DefaultBufferedBlockCipher) this).bufOff;
                if (i11 >= blockSize) {
                    break;
                }
                ((DefaultBufferedBlockCipher) this).buf[i11] = b10;
                ((DefaultBufferedBlockCipher) this).bufOff = i11 + 1;
            }
            iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i10 + iProcessBlock2) + iProcessBlock2;
        } else {
            if (((DefaultBufferedBlockCipher) this).bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
            int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i12 = bArr3[blockSize - 1] & 255;
            if (i12 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            int i13 = iProcessBlock3 - i12;
            System.arraycopy(bArr3, 0, bArr, i10, i13);
            iProcessBlock = i13;
        }
        reset();
        return iProcessBlock;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i11 % bArr.length;
        if (length != 0) {
            i11 -= length;
        } else if (!((DefaultBufferedBlockCipher) this).forEncryption) {
            return i11;
        }
        return i11 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i11 % bArr.length;
        return length == 0 ? i11 - bArr.length : i11 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int i11 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i10);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i12 = iProcessBlock;
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int i13 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i13 + 1;
        bArr3[i13] = b10;
        return i12;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i11);
        if (updateOutputSize > 0 && updateOutputSize + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i13 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i14 = length - i13;
        int iProcessBlock = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int iProcessBlock2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i12);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i11 -= i14;
            i10 += i14;
            iProcessBlock = iProcessBlock2;
            while (i11 > ((DefaultBufferedBlockCipher) this).buf.length) {
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, i10, bArr2, i12 + iProcessBlock);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i11);
        ((DefaultBufferedBlockCipher) this).bufOff += i11;
        return iProcessBlock;
    }
}
