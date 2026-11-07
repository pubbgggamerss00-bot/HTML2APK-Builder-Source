package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class SkipjackEngine implements BlockCipher {
    static final int BLOCK_SIZE = 8;
    static short[] ftable = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean encrypting;
    private int[] key0;
    private int[] key1;
    private int[] key2;
    private int[] key3;

    public SkipjackEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80));
    }

    private int g(int i10, int i11) {
        int i12 = (i11 >> 8) & 255;
        int i13 = i11 & 255;
        short[] sArr = ftable;
        int i14 = i12 ^ sArr[this.key0[i10] ^ i13];
        int i15 = i13 ^ sArr[this.key1[i10] ^ i14];
        int i16 = i14 ^ sArr[this.key2[i10] ^ i15];
        return (i16 << 8) + (sArr[this.key3[i10] ^ i16] ^ i15);
    }

    private CryptoServicePurpose getPurpose() {
        return this.key0 == null ? CryptoServicePurpose.ANY : this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }

    private int h(int i10, int i11) {
        int i12 = i11 & 255;
        int i13 = (i11 >> 8) & 255;
        short[] sArr = ftable;
        int i14 = i12 ^ sArr[this.key3[i10] ^ i13];
        int i15 = i13 ^ sArr[this.key2[i10] ^ i14];
        int i16 = i14 ^ sArr[this.key1[i10] ^ i15];
        return ((sArr[this.key0[i10] ^ i16] ^ i15) << 8) + i16;
    }

    public int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = (bArr[i10] << 8) + (bArr[i10 + 1] & 255);
        int i13 = (bArr[i10 + 2] << 8) + (bArr[i10 + 3] & 255);
        int i14 = (bArr[i10 + 4] << 8) + (bArr[i10 + 5] & 255);
        int i15 = (bArr[i10 + 6] << 8) + (bArr[i10 + 7] & 255);
        int i16 = 31;
        for (int i17 = 0; i17 < 2; i17++) {
            int i18 = 0;
            while (i18 < 8) {
                int iH = h(i16, i13);
                int i19 = (i14 ^ iH) ^ (i16 + 1);
                i16--;
                i18++;
                int i20 = i15;
                i15 = i12;
                i12 = iH;
                i13 = i19;
                i14 = i20;
            }
            int i21 = 0;
            while (i21 < 8) {
                int i22 = (i12 ^ i13) ^ (i16 + 1);
                int iH2 = h(i16, i13);
                i16--;
                i21++;
                int i23 = i15;
                i15 = i22;
                i12 = iH2;
                i13 = i14;
                i14 = i23;
            }
        }
        bArr2[i11] = (byte) (i12 >> 8);
        bArr2[i11 + 1] = (byte) i12;
        bArr2[i11 + 2] = (byte) (i13 >> 8);
        bArr2[i11 + 3] = (byte) i13;
        bArr2[i11 + 4] = (byte) (i14 >> 8);
        bArr2[i11 + 5] = (byte) i14;
        bArr2[i11 + 6] = (byte) (i15 >> 8);
        bArr2[i11 + 7] = (byte) i15;
        return 8;
    }

    public int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = (bArr[i10] << 8) + (bArr[i10 + 1] & 255);
        int iG = (bArr[i10 + 2] << 8) + (bArr[i10 + 3] & 255);
        int i13 = (bArr[i10 + 4] << 8) + (bArr[i10 + 5] & 255);
        int i14 = (bArr[i10 + 6] << 8) + (bArr[i10 + 7] & 255);
        int i15 = 0;
        for (int i16 = 0; i16 < 2; i16++) {
            int i17 = 0;
            while (i17 < 8) {
                int iG2 = g(i15, i12);
                i15++;
                i17++;
                int i18 = iG;
                iG = iG2;
                i12 = (i14 ^ iG2) ^ i15;
                i14 = i13;
                i13 = i18;
            }
            int i19 = 0;
            while (i19 < 8) {
                int i20 = i15 + 1;
                int i21 = (iG ^ i12) ^ i20;
                i19++;
                iG = g(i15, i12);
                i12 = i14;
                i14 = i13;
                i13 = i21;
                i15 = i20;
            }
        }
        bArr2[i11] = (byte) (i12 >> 8);
        bArr2[i11 + 1] = (byte) i12;
        bArr2[i11 + 2] = (byte) (iG >> 8);
        bArr2[i11 + 3] = (byte) iG;
        bArr2[i11 + 4] = (byte) (i13 >> 8);
        bArr2[i11 + 5] = (byte) i13;
        bArr2[i11 + 6] = (byte) (i14 >> 8);
        bArr2[i11 + 7] = (byte) i14;
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to SKIPJACK init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.encrypting = z10;
        this.key0 = new int[32];
        this.key1 = new int[32];
        this.key2 = new int[32];
        this.key3 = new int[32];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 * 4;
            this.key0[i10] = key[i11 % 10] & 255;
            this.key1[i10] = key[(i11 + 1) % 10] & 255;
            this.key2[i10] = key[(i11 + 2) % 10] & 255;
            this.key3[i10] = key[(i11 + 3) % 10] & 255;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, getPurpose()));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.key1 == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i10, bArr2, i11);
            return 8;
        }
        decryptBlock(bArr, i10, bArr2, i11);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
