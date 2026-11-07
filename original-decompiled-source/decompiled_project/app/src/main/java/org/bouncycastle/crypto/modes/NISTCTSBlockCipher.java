package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class NISTCTSBlockCipher extends DefaultBufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i10, BlockCipher blockCipher) {
        this.type = i10;
        ((DefaultBufferedBlockCipher) this).cipher = CBCBlockCipher.newInstance(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockSize * 2];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (((DefaultBufferedBlockCipher) this).bufOff + i10 > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        int i11 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i12 = i11 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (i11 < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (i11 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i13 = this.type;
                if (i13 == 2 || i13 == 3) {
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr3, 0, i12);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i12 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i10, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i10 + blockSize, i12);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i10, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i10 + blockSize, i12);
                    }
                } else {
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10, i12);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - i12, bArr3, 0, i12);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i10 + i12, blockSize);
                }
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        } else {
            if (i11 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i11 > blockSize) {
                int i14 = this.type;
                if (i14 == 3 || (i14 == 2 && (((DefaultBufferedBlockCipher) this).buf.length - i11) % blockSize != 0)) {
                    BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
                    if (blockCipher instanceof CBCModeCipher) {
                        ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    }
                    for (int i15 = blockSize; i15 != ((DefaultBufferedBlockCipher) this).bufOff; i15++) {
                        int i16 = i15 - blockSize;
                        bArr4[i16] = (byte) (bArr2[i16] ^ ((DefaultBufferedBlockCipher) this).buf[i15]);
                    }
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr2, 0, i12);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i10);
                } else {
                    ((CBCModeCipher) ((DefaultBufferedBlockCipher) this).cipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - blockSize, bArr4, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    if (i12 != blockSize) {
                        System.arraycopy(bArr4, i12, bArr2, i12, blockSize - i12);
                    }
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10, blockSize);
                    for (int i17 = 0; i17 != i12; i17++) {
                        bArr4[i17] = (byte) (bArr4[i17] ^ ((DefaultBufferedBlockCipher) this).buf[i17]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i10 + blockSize, i12);
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        }
        int i18 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i18;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        return i10 + ((DefaultBufferedBlockCipher) this).bufOff;
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
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i13 = this.blockSize;
            System.arraycopy(bArr3, i13, bArr3, 0, i13);
            ((DefaultBufferedBlockCipher) this).bufOff = this.blockSize;
            i12 = iProcessBlock;
        }
        byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
        int i14 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i14 + 1;
        bArr4[i14] = b10;
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
        int i15 = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i12);
            byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((DefaultBufferedBlockCipher) this).bufOff = blockSize;
            i11 -= i14;
            i10 += i14;
            while (i11 > blockSize) {
                System.arraycopy(bArr, i10, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, blockSize);
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i12 + iProcessBlock);
                byte[] bArr5 = ((DefaultBufferedBlockCipher) this).buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i11 -= blockSize;
                i10 += blockSize;
            }
            i15 = iProcessBlock;
        }
        System.arraycopy(bArr, i10, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i11);
        ((DefaultBufferedBlockCipher) this).bufOff += i11;
        return i15;
    }
}
