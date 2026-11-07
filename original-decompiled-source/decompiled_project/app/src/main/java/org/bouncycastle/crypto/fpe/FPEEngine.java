package org.bouncycastle.crypto.fpe;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public abstract class FPEEngine {
    protected final BlockCipher baseCipher;
    protected boolean forEncryption;
    protected FPEParameters fpeParameters;

    public FPEEngine(BlockCipher blockCipher) {
        this.baseCipher = blockCipher;
    }

    public static byte[] toByteArray(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i10 = 0; i10 != sArr.length; i10++) {
            Pack.shortToBigEndian(sArr[i10], bArr, i10 * 2);
        }
        return bArr;
    }

    public static short[] toShortArray(byte[] bArr) {
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
        }
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 != length; i10++) {
            sArr[i10] = Pack.bigEndianToShort(bArr, i10 * 2);
        }
        return sArr;
    }

    public abstract int decryptBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    public abstract int encryptBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    public abstract String getAlgorithmName();

    public abstract void init(boolean z10, CipherParameters cipherParameters);

    public int processBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.fpeParameters == null) {
            throw new IllegalStateException("FPE engine not initialized");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("input length cannot be negative");
        }
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("buffer value is null");
        }
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length >= i12 + i11) {
            return this.forEncryption ? encryptBlock(bArr, i10, i11, bArr2, i12) : decryptBlock(bArr, i10, i11, bArr2, i12);
        }
        throw new OutputLengthException("output buffer too short");
    }
}
