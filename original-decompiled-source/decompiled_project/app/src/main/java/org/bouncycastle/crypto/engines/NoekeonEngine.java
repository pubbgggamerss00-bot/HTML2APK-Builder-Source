package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f19988k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i10 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i10 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i10 + 12);
        int[] iArr = this.f19988k;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = 16;
        while (true) {
            int i17 = iBigEndianToInt ^ iBigEndianToInt3;
            int iRotateLeft = i17 ^ (Integers.rotateLeft(i17, 8) ^ Integers.rotateLeft(i17, 24));
            int i18 = iBigEndianToInt2 ^ i13;
            int i19 = iBigEndianToInt4 ^ i15;
            int i20 = i18 ^ i19;
            int iRotateLeft2 = i20 ^ (Integers.rotateLeft(i20, 24) ^ Integers.rotateLeft(i20, 8));
            int i21 = i18 ^ iRotateLeft;
            int i22 = (iBigEndianToInt3 ^ i14) ^ iRotateLeft2;
            int i23 = i19 ^ iRotateLeft;
            int i24 = ((iBigEndianToInt ^ i12) ^ iRotateLeft2) ^ (roundConstants[i16] & 255);
            i16--;
            if (i16 < 0) {
                Pack.intToBigEndian(i24, bArr2, i11);
                Pack.intToBigEndian(i21, bArr2, i11 + 4);
                Pack.intToBigEndian(i22, bArr2, i11 + 8);
                Pack.intToBigEndian(i23, bArr2, i11 + 12);
                return 16;
            }
            int iRotateLeft3 = Integers.rotateLeft(i21, 1);
            int iRotateLeft4 = Integers.rotateLeft(i22, 5);
            int iRotateLeft5 = Integers.rotateLeft(i23, 2);
            int i25 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i26 = ~i25;
            int i27 = i24 ^ (iRotateLeft4 & i26);
            int i28 = (iRotateLeft4 ^ (i26 ^ iRotateLeft5)) ^ i27;
            int i29 = i25 ^ (i27 | i28);
            int i30 = iRotateLeft5 ^ (i28 & i29);
            iBigEndianToInt2 = Integers.rotateLeft(i29, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i28, 27);
            int iRotateLeft6 = Integers.rotateLeft(i27, 30);
            iBigEndianToInt = i30;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i10);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i10 + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i10 + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i10 + 12);
        int[] iArr = this.f19988k;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        while (true) {
            int i18 = iBigEndianToInt ^ (roundConstants[i12] & 255);
            int i19 = i18 ^ iBigEndianToInt3;
            int iRotateLeft = i19 ^ (Integers.rotateLeft(i19, 8) ^ Integers.rotateLeft(i19, 24));
            int i20 = iBigEndianToInt2 ^ i15;
            int i21 = iBigEndianToInt4 ^ i17;
            int i22 = i14;
            int i23 = i20 ^ i21;
            int iRotateLeft2 = i23 ^ (Integers.rotateLeft(i23, 24) ^ Integers.rotateLeft(i23, 8));
            int i24 = (i18 ^ i13) ^ iRotateLeft2;
            int i25 = i20 ^ iRotateLeft;
            int i26 = (iBigEndianToInt3 ^ i16) ^ iRotateLeft2;
            int i27 = i21 ^ iRotateLeft;
            i12++;
            if (i12 > 16) {
                Pack.intToBigEndian(i24, bArr2, i11);
                Pack.intToBigEndian(i25, bArr2, i11 + 4);
                Pack.intToBigEndian(i26, bArr2, i11 + 8);
                Pack.intToBigEndian(i27, bArr2, i11 + 12);
                return 16;
            }
            i14 = i22;
            int iRotateLeft3 = Integers.rotateLeft(i25, i14);
            int iRotateLeft4 = Integers.rotateLeft(i26, 5);
            int iRotateLeft5 = Integers.rotateLeft(i27, 2);
            int i28 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i29 = ~i28;
            int i30 = i24 ^ (iRotateLeft4 & i29);
            int i31 = (iRotateLeft4 ^ (i29 ^ iRotateLeft5)) ^ i30;
            int i32 = i28 ^ (i30 | i31);
            int i33 = iRotateLeft5 ^ (i31 & i32);
            iBigEndianToInt2 = Integers.rotateLeft(i32, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i31, 27);
            int iRotateLeft6 = Integers.rotateLeft(i30, 30);
            iBigEndianToInt = i33;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.a("invalid parameter passed to Noekeon init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.f19988k, 0, 4);
        if (!z10) {
            int[] iArr = this.f19988k;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            int i14 = i10 ^ i12;
            int iRotateLeft = i14 ^ (Integers.rotateLeft(i14, 8) ^ Integers.rotateLeft(i14, 24));
            int i15 = i11 ^ i13;
            int iRotateLeft2 = (Integers.rotateLeft(i15, 8) ^ Integers.rotateLeft(i15, 24)) ^ i15;
            int i16 = i11 ^ iRotateLeft;
            int i17 = i13 ^ iRotateLeft;
            int[] iArr2 = this.f19988k;
            iArr2[0] = i10 ^ iRotateLeft2;
            iArr2[1] = i16;
            iArr2[2] = i12 ^ iRotateLeft2;
            iArr2[3] = i17;
        }
        this._forEncryption = z10;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i10, bArr2, i11) : decryptBlock(bArr, i10, bArr2, i11);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
