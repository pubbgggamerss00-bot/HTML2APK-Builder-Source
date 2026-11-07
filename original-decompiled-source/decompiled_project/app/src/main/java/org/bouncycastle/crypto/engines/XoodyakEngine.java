package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class XoodyakEngine implements AEADCipher {
    private byte[] K;
    private int Rabsorb;
    private boolean aadFinished;
    private boolean encrypted;
    private boolean forEncryption;
    private byte[] iv;
    private MODE mode;
    private int phase;
    private byte[] state;
    private byte[] tag;
    private final int f_bPrime = 48;
    private final int Rkout = 24;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int NLANES = 12;
    private final int NROWS = 3;
    private final int NCOLUMS = 4;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    final int Rkin = 44;
    private final int[] RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, DilithiumEngine.DilithiumPolyT0PackedBytes, 18};
    private boolean initialised = false;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();

    public enum MODE {
        ModeHash,
        ModeKeyed
    }

    private void AbsorbAny(byte[] bArr, int i10, int i11, int i12, int i13) {
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0);
            }
            int iMin = Math.min(i11, i12);
            Down(bArr, i10, iMin, i13);
            i10 += iMin;
            i11 -= iMin;
            if (i11 == 0) {
                return;
            } else {
                i13 = 0;
            }
        }
    }

    private int ROTL32(int i10, int i11) {
        return (i10 >>> ((32 - i11) & 31)) ^ (i10 << (i11 & 31));
    }

    private void Up(byte[] bArr, int i10, int i11) {
        int i12;
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i11);
        }
        int i13 = 12;
        int[] iArr = new int[12];
        Pack.littleEndianToInt(this.state, 0, iArr, 0, 12);
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                iArr3[i15] = (iArr[index(i15, 1)] ^ iArr[index(i15, 0)]) ^ iArr[index(i15, 2)];
            }
            int i16 = 0;
            while (true) {
                i12 = 3;
                if (i16 >= 4) {
                    break;
                }
                int i17 = iArr3[3 & (i16 + 3)];
                iArr4[i16] = ROTL32(i17, 14) ^ ROTL32(i17, 5);
                i16++;
            }
            for (int i18 = 0; i18 < 4; i18++) {
                for (int i19 = 0; i19 < 3; i19++) {
                    int iIndex = index(i18, i19);
                    iArr[iIndex] = iArr[iIndex] ^ iArr4[i18];
                }
            }
            for (int i20 = 0; i20 < 4; i20++) {
                iArr2[index(i20, 0)] = iArr[index(i20, 0)];
                iArr2[index(i20, 1)] = iArr[index(i20 + 3, 1)];
                iArr2[index(i20, 2)] = ROTL32(iArr[index(i20, 2)], 11);
            }
            iArr2[0] = iArr2[0] ^ this.RC[i14];
            int i21 = 0;
            while (i21 < 4) {
                int i22 = 0;
                while (i22 < i12) {
                    int i23 = i22 + 1;
                    iArr[index(i21, i22)] = ((~iArr2[index(i21, i23)]) & iArr2[index(i21, i22 + 2)]) ^ iArr2[index(i21, i22)];
                    i22 = i23;
                    i12 = 3;
                }
                i21++;
                i12 = 3;
            }
            for (int i24 = 0; i24 < 4; i24++) {
                iArr2[index(i24, 0)] = iArr[index(i24, 0)];
                iArr2[index(i24, 1)] = ROTL32(iArr[index(i24, 1)], 1);
                iArr2[index(i24, 2)] = ROTL32(iArr[index(i24 + 2, 2)], 8);
            }
            i13 = 12;
            System.arraycopy(iArr2, 0, iArr, 0, 12);
        }
        Pack.intToLittleEndian(iArr, 0, i13, this.state, 0);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, 0, i10);
        }
    }

    private int encrypt(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = new byte[24];
        int i13 = this.encrypted ? 0 : 128;
        int i14 = i11;
        while (true) {
            if (i14 == 0 && this.encrypted) {
                return i11;
            }
            int iMin = Math.min(i14, 24);
            if (this.forEncryption) {
                System.arraycopy(bArr, i10, bArr3, 0, iMin);
            }
            Up(null, 0, i13);
            int i15 = 0;
            while (i15 < iMin) {
                bArr2[i12 + i15] = (byte) (bArr[i10] ^ this.state[i15]);
                i15++;
                i10++;
            }
            if (this.forEncryption) {
                Down(bArr3, 0, iMin, 0);
            } else {
                Down(bArr2, i12, iMin, 0);
            }
            i12 += iMin;
            i14 -= iMin;
            this.encrypted = true;
            i13 = 0;
        }
    }

    private int index(int i10, int i11) {
        return (i10 % 4) + ((i11 % 3) * 4);
    }

    private void processAAD() {
        if (this.aadFinished) {
            return;
        }
        byte[] byteArray = this.aadData.toByteArray();
        AbsorbAny(byteArray, 0, byteArray.length, this.Rabsorb, 3);
        this.aadFinished = true;
    }

    public void Down(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i13 < i11) {
            byte[] bArr2 = this.state;
            bArr2[i13] = (byte) (bArr[i10] ^ bArr2[i13]);
            i13++;
            i10++;
        }
        byte[] bArr3 = this.state;
        bArr3[i11] = (byte) (bArr3[i11] ^ 1);
        byte b10 = bArr3[47];
        if (this.mode == MODE.ModeHash) {
            i12 &= 1;
        }
        bArr3[47] = (byte) (b10 ^ i12);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        int i11;
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        byte[] byteArray = this.message.toByteArray();
        int size = this.message.size();
        boolean z10 = this.forEncryption;
        if ((z10 && size + 16 + i10 > bArr.length) || (!z10 && (size - 16) + i10 > bArr.length)) {
            throw new OutputLengthException("output buffer too short");
        }
        processAAD();
        if (this.forEncryption) {
            encrypt(byteArray, 0, size, bArr, i10);
            byte[] bArr2 = new byte[16];
            this.tag = bArr2;
            Up(bArr2, 16, 64);
            System.arraycopy(this.tag, 0, bArr, i10 + size, 16);
            i11 = size + 16;
        } else {
            i11 = size - 16;
            encrypt(byteArray, 0, i11, bArr, i10);
            byte[] bArr3 = new byte[16];
            this.tag = bArr3;
            Up(bArr3, 16, 64);
            int i12 = i11;
            int i13 = 0;
            while (i13 < 16) {
                int i14 = i12 + 1;
                if (this.tag[i13] != byteArray[i12]) {
                    throw new IllegalArgumentException("Mac does not match");
                }
                i13++;
                i12 = i14;
            }
        }
        reset(false);
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Xoodyak AEAD";
    }

    public int getBlockSize() {
        return 24;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        return i10 + 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z10;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Xoodyak init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.iv = iv;
        if (iv == null || iv.length != 16) {
            throw new IllegalArgumentException("Xoodyak requires exactly 16 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Xoodyak init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        this.K = key;
        if (key.length != 16) {
            throw new IllegalArgumentException("Xoodyak key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        this.state = new byte[48];
        this.tag = new byte[16];
        this.initialised = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        if (!this.aadFinished) {
            this.aadData.write(b10);
            return;
        }
        StringBuilder sb = new StringBuilder("AAD cannot be added after reading a full block(");
        sb.append(getBlockSize());
        sb.append(" bytes) of input for ");
        sb.append(this.forEncryption ? "encryption" : "decryption");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (!this.aadFinished) {
            if (i10 + i11 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            this.aadData.write(bArr, i10, i11);
        } else {
            StringBuilder sb = new StringBuilder("AAD cannot be added after reading a full block(");
            sb.append(getBlockSize());
            sb.append(" bytes) of input for ");
            sb.append(this.forEncryption ? "encryption" : "decryption");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        return processBytes(new byte[]{b10}, 0, 1, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        if (this.mode != MODE.ModeKeyed) {
            throw new IllegalArgumentException("Xoodyak has not been initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.message.write(bArr, i10, i11);
        int size = this.message.size() - (this.forEncryption ? 0 : 16);
        if (size < getBlockSize()) {
            return 0;
        }
        byte[] byteArray = this.message.toByteArray();
        int blockSize = getBlockSize() * (size / getBlockSize());
        if (blockSize + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        processAAD();
        encrypt(byteArray, 0, blockSize, bArr2, i12);
        this.message.reset();
        this.message.write(byteArray, blockSize, byteArray.length - blockSize);
        return blockSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        reset(true);
    }

    private void reset(boolean z10) {
        if (z10) {
            this.tag = null;
        }
        Arrays.fill(this.state, (byte) 0);
        this.aadFinished = false;
        this.encrypted = false;
        this.phase = 2;
        this.message.reset();
        this.aadData.reset();
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.iv.length;
        byte[] bArr2 = new byte[44];
        this.mode = MODE.ModeKeyed;
        this.Rabsorb = 44;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.iv, 0, bArr2, length, length2);
        int i10 = length + length2;
        bArr2[i10] = (byte) length2;
        AbsorbAny(bArr2, 0, i10 + 1, this.Rabsorb, 2);
    }
}
