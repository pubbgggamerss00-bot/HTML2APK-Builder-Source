package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: classes2.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i10 = this.index;
        this.index = i10 + 1;
        return bArr[i10];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 1) | (i11 << 15);
        int i13 = (i10 >>> 2) | (i11 << 14);
        int i14 = (i10 >>> 4) | (i11 << 12);
        int i15 = (i10 >>> 10) | (i11 << 6);
        int i16 = iArr[2];
        int i17 = (i11 >>> 15) | (i16 << 1);
        int i18 = iArr[3];
        int i19 = (i16 >>> 11) | (i18 << 5);
        int i20 = iArr[4];
        int i21 = (i18 >>> 8) | (i20 << 8);
        int i22 = (i20 << 1) | (i18 >>> 15);
        int[] iArr2 = this.lfsr;
        int i23 = iArr2[0] >>> 3;
        int i24 = iArr2[1];
        int i25 = i23 | (i24 << 13);
        int i26 = iArr2[2];
        int i27 = (i24 >>> 9) | (i26 << 7);
        int i28 = (iArr2[3] << 2) | (i26 >>> 14);
        int i29 = iArr2[4];
        int i30 = i28 & i29;
        int i31 = ((((i27 ^ i22) ^ (i25 & i29)) ^ i30) ^ (i29 & i22)) ^ ((i25 & i27) & i28);
        int i32 = i25 & i28;
        return (((((((((i22 & i30) ^ (((i32 & i22) ^ ((i29 & i32) ^ i31)) ^ ((i27 & i28) & i22))) ^ i12) ^ i13) ^ i14) ^ i15) ^ i17) ^ i19) ^ i21) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 13) | (i11 << 3);
        int i13 = iArr[2];
        int i14 = (i11 >>> 7) | (i13 << 9);
        int i15 = iArr[3];
        int i16 = (i13 >>> 6) | (i15 << 10);
        int i17 = iArr[4];
        int i18 = (i15 >>> 3) | (i17 << 13);
        return (((i17 << 2) | (i15 >>> 14)) ^ ((((i10 ^ i12) ^ i14) ^ i16) ^ i18)) & 65535;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 9) | (i11 << 7);
        int i13 = (i10 >>> 14) | (i11 << 2);
        int i14 = (i10 >>> 15) | (i11 << 1);
        int i15 = iArr[2];
        int i16 = (i11 >>> 5) | (i15 << 11);
        int i17 = (i11 >>> 12) | (i15 << 4);
        int i18 = iArr[3];
        int i19 = (i15 >>> 1) | (i18 << 15);
        int i20 = (i15 >>> 5) | (i18 << 11);
        int i21 = (i15 >>> 13) | (i18 << 3);
        int i22 = iArr[4];
        int i23 = (i18 >>> 4) | (i22 << 12);
        int i24 = (i18 >>> 12) | (i22 << 4);
        int i25 = (i18 >>> 14) | (i22 << 2);
        int i26 = (i22 << 1) | (i18 >>> 15);
        int i27 = i26 & i24;
        int i28 = (((i10 ^ (((((((((i25 ^ i24) ^ i23) ^ i21) ^ i20) ^ i19) ^ i17) ^ i16) ^ i13) ^ i12)) ^ i27) ^ (i20 & i19)) ^ (i14 & i12);
        int i29 = i24 & i23;
        int i30 = i19 & i17 & i16;
        return (((((((((i26 & i21) & i17) & i12) ^ ((i28 ^ (i29 & i21)) ^ i30)) ^ ((i29 & i20) & i19)) ^ ((i27 & i16) & i14)) ^ (((i27 & i23) & i21) & i20)) ^ ((i30 & i14) & i12)) ^ (((((i23 & i21) & i20) & i19) & i17) & i16)) & 65535;
    }

    private void initGrain() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i10 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i12 = i11 + 1;
            iArr[i10] = ((bArr3[i11] & 255) | (bArr3[i12] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i10] = ((bArr4[i11] & 255) | (bArr4[i12] << 8)) & 65535;
            i11 += 2;
            i10++;
        }
    }

    private int[] shift(int[] iArr, int i10) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i10;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 10) {
            throw new IllegalArgumentException("Grain v1 key must be 80 bits long");
        }
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, Utils.getPurpose(z10)));
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ getKeyStream());
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        if (this.initialised) {
            return (byte) (b10 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
