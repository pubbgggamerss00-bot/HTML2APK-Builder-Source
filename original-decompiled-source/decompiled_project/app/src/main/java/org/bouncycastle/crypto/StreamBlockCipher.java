package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public abstract class StreamBlockCipher extends DefaultMultiBlockCipher implements StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b10);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        int i13 = i10 + i11;
        if (i13 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        while (i10 < i13) {
            bArr2[i12] = calculateByte(bArr[i10]);
            i12++;
            i10++;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b10) {
        return calculateByte(b10);
    }
}
