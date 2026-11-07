package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import p5.m0;

/* loaded from: classes2.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 3; i12 >= 0; i12--) {
            i11 = (i11 << 8) + (bArr[i12 + i10] & 255);
        }
        return i11;
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToWord = bytesToWord(bArr, i10);
        int iBytesToWord2 = bytesToWord(bArr, i10 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i10 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i10 + 12);
        int[] iArr = this._S;
        int i12 = iBytesToWord3 - iArr[43];
        int iRotateRight = iBytesToWord - iArr[42];
        int i13 = 20;
        while (i13 >= 1) {
            int iRotateLeft = rotateLeft(m0.a(iRotateRight, 2, 1, iRotateRight), 5);
            int iRotateLeft2 = rotateLeft(m0.a(i12, 2, 1, i12), 5);
            int i14 = i13 * 2;
            int iRotateRight2 = rotateRight(iBytesToWord2 - this._S[i14 + 1], iRotateLeft) ^ iRotateLeft2;
            i13--;
            int i15 = iRotateRight;
            iRotateRight = rotateRight(iBytesToWord4 - this._S[i14], iRotateLeft2) ^ iRotateLeft;
            iBytesToWord4 = i12;
            i12 = iRotateRight2;
            iBytesToWord2 = i15;
        }
        int[] iArr2 = this._S;
        int i16 = iBytesToWord4 - iArr2[1];
        int i17 = iBytesToWord2 - iArr2[0];
        wordToBytes(iRotateRight, bArr2, i11);
        wordToBytes(i17, bArr2, i11 + 4);
        wordToBytes(i12, bArr2, i11 + 8);
        wordToBytes(i16, bArr2, i11 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToWord = bytesToWord(bArr, i10);
        int iBytesToWord2 = bytesToWord(bArr, i10 + 4);
        int iBytesToWord3 = bytesToWord(bArr, i10 + 8);
        int iBytesToWord4 = bytesToWord(bArr, i10 + 12);
        int[] iArr = this._S;
        int i12 = iBytesToWord2 + iArr[0];
        int i13 = iBytesToWord4 + iArr[1];
        int i14 = 1;
        while (i14 <= 20) {
            int iRotateLeft = rotateLeft(m0.a(i12, 2, 1, i12), 5);
            int iRotateLeft2 = rotateLeft(m0.a(i13, 2, 1, i13), 5);
            int i15 = i14 * 2;
            int iRotateLeft3 = rotateLeft(iBytesToWord ^ iRotateLeft, iRotateLeft2) + this._S[i15];
            int iRotateLeft4 = rotateLeft(iBytesToWord3 ^ iRotateLeft2, iRotateLeft) + this._S[i15 + 1];
            i14++;
            iBytesToWord3 = i13;
            i13 = iRotateLeft3;
            iBytesToWord = i12;
            i12 = iRotateLeft4;
        }
        int[] iArr2 = this._S;
        int i16 = iBytesToWord + iArr2[42];
        int i17 = iBytesToWord3 + iArr2[43];
        wordToBytes(i16, bArr2, i11);
        wordToBytes(i12, bArr2, i11 + 4);
        wordToBytes(i17, bArr2, i11 + 8);
        wordToBytes(i13, bArr2, i11 + 12);
        return 16;
    }

    private int rotateLeft(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    private int rotateRight(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i10 = length3 / 4;
            iArr2[i10] = (iArr2[i10] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i11 = 1;
        while (true) {
            iArr = this._S;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = iArr[i11 - 1] + Q32;
            i11++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length4; i13++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length5] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length5] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i12] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i12] = iRotateLeft2;
            length5 = (length5 + 1) % this._S.length;
            i12 = (i12 + 1) % length2;
        }
    }

    private void wordToBytes(int i10, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12 + i11] = (byte) i10;
            i10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to RC6 init - ", cipherParameters));
        }
        this.forEncryption = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i10 + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i11 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
