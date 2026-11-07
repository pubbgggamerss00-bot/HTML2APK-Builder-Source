package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        int multiBlockSize = getMultiBlockSize();
        int iProcessBlock = 0;
        for (int i13 = 0; i13 != i11; i13++) {
            iProcessBlock += processBlock(bArr, i10, bArr2, i12 + iProcessBlock);
            i10 += multiBlockSize;
        }
        return iProcessBlock;
    }
}
