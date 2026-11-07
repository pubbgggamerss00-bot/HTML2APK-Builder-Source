package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class TEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int d_sum = -957401312;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private int _a;
    private int _b;
    private int _c;
    private int _d;
    private boolean _forEncryption;
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & 255) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & 255) | i11 | ((bArr[i10 + 2] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToInt = bytesToInt(bArr, i10);
        int iBytesToInt2 = bytesToInt(bArr, i10 + 4);
        int i12 = d_sum;
        for (int i13 = 0; i13 != 32; i13++) {
            iBytesToInt2 -= (((iBytesToInt << 4) + this._c) ^ (iBytesToInt + i12)) ^ ((iBytesToInt >>> 5) + this._d);
            iBytesToInt -= (((iBytesToInt2 << 4) + this._a) ^ (iBytesToInt2 + i12)) ^ ((iBytesToInt2 >>> 5) + this._b);
            i12 += 1640531527;
        }
        unpackInt(iBytesToInt, bArr2, i11);
        unpackInt(iBytesToInt2, bArr2, i11 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToInt = bytesToInt(bArr, i10);
        int iBytesToInt2 = bytesToInt(bArr, i10 + 4);
        int i12 = iBytesToInt;
        int i13 = 0;
        for (int i14 = 0; i14 != 32; i14++) {
            i13 -= 1640531527;
            i12 += (((iBytesToInt2 << 4) + this._a) ^ (iBytesToInt2 + i13)) ^ ((iBytesToInt2 >>> 5) + this._b);
            iBytesToInt2 += (((i12 << 4) + this._c) ^ (i12 + i13)) ^ ((i12 >>> 5) + this._d);
        }
        unpackInt(i12, bArr2, i11);
        unpackInt(iBytesToInt2, bArr2, i11 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this._a = bytesToInt(bArr, 0);
        this._b = bytesToInt(bArr, 4);
        this._c = bytesToInt(bArr, 8);
        this._d = bytesToInt(bArr, 12);
    }

    private void unpackInt(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to TEA init - ", cipherParameters));
        }
        this._forEncryption = z10;
        this._initialised = true;
        setKey(((KeyParameter) cipherParameters).getKey());
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
