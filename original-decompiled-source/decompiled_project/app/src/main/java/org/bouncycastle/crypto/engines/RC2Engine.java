package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, RegisterType.CONFLICTED, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, RegisterType.FLOAT, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, RegisterType.REFERENCE, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, RegisterType.DOUBLE_LO, -38, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, RegisterType.UNINIT_THIS, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, RegisterType.DOUBLE_HI, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, RegisterType.UNINIT_REF, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, RegisterType.LONG_HI, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iRotateWordLeft = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10] & 255);
        for (int i12 = 60; i12 >= 44; i12 -= 4) {
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft, 11) - ((((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2)) + this.workingKey[i12 + 3]);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2, 13) - ((((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3)) + this.workingKey[i12 + 2]);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3, 14) - ((((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4)) + this.workingKey[i12 + 1]);
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4, 15) - ((((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft)) + this.workingKey[i12]);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft - iArr[iRotateWordLeft2 & 63];
        int iRotateWordLeft6 = iRotateWordLeft2 - iArr[iRotateWordLeft3 & 63];
        int iRotateWordLeft7 = iRotateWordLeft3 - iArr[iRotateWordLeft4 & 63];
        int iRotateWordLeft8 = iRotateWordLeft4 - iArr[iRotateWordLeft5 & 63];
        for (int i13 = 40; i13 >= 20; i13 -= 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5, 11) - ((((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft7 & iRotateWordLeft6)) + this.workingKey[i13 + 3]);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6, 13) - ((((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft8 & iRotateWordLeft7)) + this.workingKey[i13 + 2]);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7, 14) - ((((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft5 & iRotateWordLeft8)) + this.workingKey[i13 + 1]);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8, 15) - ((((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft6 & iRotateWordLeft5)) + this.workingKey[i13]);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 - iArr2[iRotateWordLeft6 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 - iArr2[iRotateWordLeft7 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 - iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 - iArr2[iRotateWordLeft9 & 63];
        for (int i14 = 16; i14 >= 0; i14 -= 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9, 11) - ((((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft11 & iRotateWordLeft10)) + this.workingKey[i14 + 3]);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10, 13) - ((((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft12 & iRotateWordLeft11)) + this.workingKey[i14 + 2]);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11, 14) - ((((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft9 & iRotateWordLeft12)) + this.workingKey[i14 + 1]);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12, 15) - ((((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft10 & iRotateWordLeft9)) + this.workingKey[i14]);
        }
        bArr2[i11] = (byte) iRotateWordLeft12;
        bArr2[i11 + 1] = (byte) (iRotateWordLeft12 >> 8);
        bArr2[i11 + 2] = (byte) iRotateWordLeft11;
        bArr2[i11 + 3] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i11 + 4] = (byte) iRotateWordLeft10;
        bArr2[i11 + 5] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i11 + 6] = (byte) iRotateWordLeft9;
        bArr2[i11 + 7] = (byte) (iRotateWordLeft9 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iRotateWordLeft = ((bArr[i10 + 7] & 255) << 8) + (bArr[i10 + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i10 + 5] & 255) << 8) + (bArr[i10 + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i10 + 3] & 255) << 8) + (bArr[i10 + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i10 + 1] & 255) << 8) + (bArr[i10] & 255);
        for (int i12 = 0; i12 <= 16; i12 += 4) {
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4 + ((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft) + this.workingKey[i12], 1);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3 + ((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4) + this.workingKey[i12 + 1], 2);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2 + ((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3) + this.workingKey[i12 + 2], 3);
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft + ((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2) + this.workingKey[i12 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft4 + iArr[iRotateWordLeft & 63];
        int iRotateWordLeft6 = iRotateWordLeft3 + iArr[iRotateWordLeft5 & 63];
        int iRotateWordLeft7 = iRotateWordLeft2 + iArr[iRotateWordLeft6 & 63];
        int iRotateWordLeft8 = iRotateWordLeft + iArr[iRotateWordLeft7 & 63];
        for (int i13 = 20; i13 <= 40; i13 += 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5 + ((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft7 & iRotateWordLeft8) + this.workingKey[i13], 1);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6 + ((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft8 & iRotateWordLeft5) + this.workingKey[i13 + 1], 2);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7 + ((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft5 & iRotateWordLeft6) + this.workingKey[i13 + 2], 3);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8 + ((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft6 & iRotateWordLeft7) + this.workingKey[i13 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 + iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 + iArr2[iRotateWordLeft9 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 + iArr2[iRotateWordLeft10 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 + iArr2[iRotateWordLeft11 & 63];
        for (int i14 = 44; i14 < 64; i14 += 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9 + ((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft11 & iRotateWordLeft12) + this.workingKey[i14], 1);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10 + ((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft12 & iRotateWordLeft9) + this.workingKey[i14 + 1], 2);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11 + ((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft9 & iRotateWordLeft10) + this.workingKey[i14 + 2], 3);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12 + ((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft10 & iRotateWordLeft11) + this.workingKey[i14 + 3], 5);
        }
        bArr2[i11] = (byte) iRotateWordLeft9;
        bArr2[i11 + 1] = (byte) (iRotateWordLeft9 >> 8);
        bArr2[i11 + 2] = (byte) iRotateWordLeft10;
        bArr2[i11 + 3] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i11 + 4] = (byte) iRotateWordLeft11;
        bArr2[i11 + 5] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i11 + 6] = (byte) iRotateWordLeft12;
        bArr2[i11 + 7] = (byte) (iRotateWordLeft12 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i10) {
        int[] iArr = new int[128];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        int length = bArr.length;
        if (length < 128) {
            int i12 = iArr[length - 1];
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                i12 = piTable[(i12 + iArr[i13]) & 255] & 255;
                int i15 = length + 1;
                iArr[length] = i12;
                if (i15 >= 128) {
                    break;
                }
                length = i15;
                i13 = i14;
            }
        }
        int i16 = (i10 + 7) >> 3;
        int i17 = 128 - i16;
        int i18 = piTable[(255 >> ((-i10) & 7)) & iArr[i17]] & 255;
        iArr[i17] = i18;
        for (int i19 = 127 - i16; i19 >= 0; i19--) {
            i18 = piTable[i18 ^ iArr[i19 + i16]] & 255;
            iArr[i19] = i18;
        }
        int[] iArr2 = new int[64];
        for (int i20 = 0; i20 != 64; i20++) {
            int i21 = i20 * 2;
            iArr2[i20] = iArr[i21] + (iArr[i21 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i10, int i11) {
        int i12 = i10 & 65535;
        return (i12 >> (16 - i11)) | (i12 << i11);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] key;
        this.encrypting = z10;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
            key = rC2Parameters.getKey();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.a("invalid parameter passed to RC2 init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length * 8);
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.workingKey == null) {
            throw new IllegalStateException("RC2 engine not initialised");
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
