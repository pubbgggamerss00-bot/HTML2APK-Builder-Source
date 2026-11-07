package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* loaded from: classes2.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int bytesToWord(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToWord = bytesToWord(bArr, i10);
        int iBytesToWord2 = bytesToWord(bArr, i10 + 4);
        for (int i12 = this._noRounds; i12 >= 1; i12--) {
            int i13 = i12 * 2;
            iBytesToWord2 = rotateRight(iBytesToWord2 - this._S[i13 + 1], iBytesToWord) ^ iBytesToWord;
            iBytesToWord = rotateRight(iBytesToWord - this._S[i13], iBytesToWord2) ^ iBytesToWord2;
        }
        wordToBytes(iBytesToWord - this._S[0], bArr2, i11);
        wordToBytes(iBytesToWord2 - this._S[1], bArr2, i11 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBytesToWord = bytesToWord(bArr, i10) + this._S[0];
        int iBytesToWord2 = bytesToWord(bArr, i10 + 4) + this._S[1];
        for (int i12 = 1; i12 <= this._noRounds; i12++) {
            int i13 = i12 * 2;
            iBytesToWord = rotateLeft(iBytesToWord ^ iBytesToWord2, iBytesToWord2) + this._S[i13];
            iBytesToWord2 = rotateLeft(iBytesToWord2 ^ iBytesToWord, iBytesToWord) + this._S[i13 + 1];
        }
        wordToBytes(iBytesToWord, bArr2, i11);
        wordToBytes(iBytesToWord2, bArr2, i11 + 4);
        return 8;
    }

    private int rotateLeft(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 >>> (32 - i12)) | (i10 << i12);
    }

    private int rotateRight(int i10, int i11) {
        int i12 = i11 & 31;
        return (i10 << (32 - i12)) | (i10 >>> i12);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 4;
            iArr2[i11] = iArr2[i11] + ((bArr[i10] & 255) << ((i10 % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i12 = 1;
        while (true) {
            iArr = this._S;
            if (i12 >= iArr.length) {
                break;
            }
            iArr[i12] = iArr[i12 - 1] + Q32;
            i12++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int length3 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length2; i14++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length3] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length3] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i13] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i13] = iRotateLeft2;
            length3 = (length3 + 1) % this._S.length;
            i13 = (i13 + 1) % length;
        }
    }

    private void wordToBytes(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] key;
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            key = rC5Parameters.getKey();
            setKey(key);
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.a("invalid parameter passed to RC532 init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            setKey(key);
        }
        this.forEncryption = z10;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
