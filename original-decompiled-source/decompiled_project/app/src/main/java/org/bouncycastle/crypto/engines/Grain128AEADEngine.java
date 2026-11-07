package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class Grain128AEADEngine implements AEADCipher {
    private static final int STATE_SIZE = 4;
    private int[] authAcc;
    private int[] authSr;
    private int[] lfsr;
    private byte[] mac;
    private int[] nfsr;
    private byte[] workingIV;
    private byte[] workingKey;
    private boolean initialised = false;
    private boolean aadFinished = false;
    private ErasableOutputStream aadData = new ErasableOutputStream();

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    private void accumulate() {
        int[] iArr = this.authAcc;
        int i10 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i10 ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
    }

    private void authShift(int i10) {
        int[] iArr = this.authSr;
        int i11 = iArr[0] >>> 1;
        int i12 = iArr[1];
        iArr[0] = i11 | (i12 << 31);
        iArr[1] = (i10 << 31) | (i12 >>> 1);
    }

    private void doProcessAADBytes(byte[] bArr, int i10, int i11) {
        int i12;
        byte[] bArr2;
        if (i11 < 128) {
            bArr2 = new byte[i11 + 1];
            bArr2[0] = (byte) i11;
            i12 = 0;
        } else {
            int iLen_length = len_length(i11);
            byte[] bArr3 = new byte[iLen_length + 1 + i11];
            bArr3[0] = (byte) (iLen_length | 128);
            int i13 = i11;
            int i14 = 0;
            while (i14 < iLen_length) {
                i14++;
                bArr3[i14] = (byte) i13;
                i13 >>>= 8;
            }
            i12 = iLen_length;
            bArr2 = bArr3;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            bArr2[1 + i12 + i15] = bArr[i10 + i15];
        }
        for (byte b10 : bArr2) {
            for (int i16 = 0; i16 < 8; i16++) {
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int i17 = -((b10 >> i16) & 1);
                int[] iArr = this.authAcc;
                int i18 = iArr[0];
                int[] iArr2 = this.authSr;
                iArr[0] = i18 ^ (iArr2[0] & i17);
                iArr[1] = (i17 & iArr2[1]) ^ iArr[1];
                authShift(getOutput());
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
            }
        }
    }

    private byte[] getKeyStream(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = bArr[i10 + i13];
            byte b11 = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                int output = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int i15 = (b10 >> i14) & 1;
                b11 = (byte) (b11 | ((output ^ i15) << i14));
                int i16 = -i15;
                int[] iArr = this.authAcc;
                int i17 = iArr[0];
                int[] iArr2 = this.authSr;
                iArr[0] = i17 ^ (iArr2[0] & i16);
                iArr[1] = (i16 & iArr2[1]) ^ iArr[1];
                authShift(getOutput());
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
            }
            bArr2[i12 + i13] = b11;
        }
        return bArr2;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = i10 >>> 12;
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = i13 >>> 9;
        int i15 = i13 >>> 25;
        int i16 = i13 >>> 31;
        int[] iArr2 = this.lfsr;
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = (i17 >>> 20) & (i17 >>> 13);
        return (((i13 ^ (((((((((i20 ^ ((i17 >>> 8) & i11)) ^ (i16 & (i18 >>> 10))) ^ ((i18 >>> 28) & (i19 >>> 15))) ^ ((i11 & i16) & (i19 >>> 30))) ^ (i19 >>> 29)) ^ (i10 >>> 2)) ^ (i10 >>> 15)) ^ (i12 >>> 4)) ^ (i12 >>> 13))) ^ i14) ^ i15) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i10 = iArr[0];
        int i11 = iArr[1] >>> 6;
        int i12 = iArr[2];
        return (iArr[3] ^ ((((i10 ^ (i10 >>> 7)) ^ i11) ^ (i12 >>> 6)) ^ (i12 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = i10 >>> 25;
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = ((i10 >>> 26) ^ i10) ^ (i12 >>> 24);
        return (((((((((((iArr[3] ^ (i14 ^ (i13 >>> 27))) ^ ((i10 & i13) >>> 3)) ^ ((i10 >>> 11) & (i10 >>> 13))) ^ ((i10 >>> 17) & (i10 >>> 18))) ^ ((i10 & i12) >>> 27)) ^ ((i12 >>> 8) & (i12 >>> 16))) ^ ((i12 >>> 29) & (i13 >>> 1))) ^ ((i13 >>> 4) & (i13 >>> 20))) ^ (((i10 >>> 22) & (i10 >>> 24)) & i11)) ^ (((i13 >>> 6) & (i13 >>> 14)) & (i13 >>> 18))) ^ ((((i13 >>> 24) & (i13 >>> 28)) & (i13 >>> 29)) & (i13 >>> 31))) & 1;
    }

    private void initGrain() {
        for (int i10 = 0; i10 < 320; i10++) {
            int output = getOutput();
            this.nfsr = shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ output) & 1);
            this.lfsr = shift(this.lfsr, (output ^ getOutputLFSR()) & 1);
        }
        for (int i11 = 0; i11 < 8; i11++) {
            for (int i12 = 0; i12 < 8; i12++) {
                int output2 = getOutput();
                this.nfsr = shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ output2) ^ (this.workingKey[i11] >> i12)) & 1);
                this.lfsr = shift(this.lfsr, ((output2 ^ getOutputLFSR()) ^ (this.workingKey[i11 + 8] >> i12)) & 1);
            }
        }
        for (int i13 = 0; i13 < 2; i13++) {
            for (int i14 = 0; i14 < 32; i14++) {
                int output3 = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr = this.authAcc;
                iArr[i13] = (output3 << i14) | iArr[i13];
            }
        }
        for (int i15 = 0; i15 < 2; i15++) {
            for (int i16 = 0; i16 < 32; i16++) {
                int output4 = getOutput();
                this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
                this.lfsr = shift(this.lfsr, getOutputLFSR() & 1);
                int[] iArr2 = this.authSr;
                iArr2[i15] = (output4 << i16) | iArr2[i15];
            }
        }
        this.initialised = true;
    }

    private static int len_length(int i10) {
        if ((i10 & 255) == i10) {
            return 1;
        }
        if ((65535 & i10) == i10) {
            return 2;
        }
        return (16777215 & i10) == i10 ? 3 : 4;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = Byte.MAX_VALUE;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        Pack.littleEndianToInt(bArr, 0, this.nfsr);
        Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
    }

    private int[] shift(int[] iArr, int i10) {
        int i11 = iArr[0] >>> 1;
        int i12 = iArr[1];
        iArr[0] = i11 | (i12 << 31);
        int i13 = i12 >>> 1;
        int i14 = iArr[2];
        iArr[1] = i13 | (i14 << 31);
        int i15 = iArr[3];
        iArr[2] = (i14 >>> 1) | (i15 << 31);
        iArr[3] = (i10 << 31) | (i15 >>> 1);
        return iArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        accumulate();
        byte[] bArrIntToLittleEndian = Pack.intToLittleEndian(this.authAcc);
        this.mac = bArrIntToLittleEndian;
        System.arraycopy(bArrIntToLittleEndian, 0, bArr, i10, bArrIntToLittleEndian.length);
        reset(false);
        return this.mac.length;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Grain-128AEAD";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        return i10 + 8;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128AEAD init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Grain-128AEAD requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128AEAD init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Grain-128AEAD key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z10)));
        byte[] bArr = new byte[16];
        this.workingIV = bArr;
        this.workingKey = new byte[16];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        if (this.aadFinished) {
            throw new IllegalStateException("associated data must be added before plaintext/ciphertext");
        }
        this.aadData.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        if (this.aadFinished) {
            throw new IllegalStateException("associated data must be added before plaintext/ciphertext");
        }
        this.aadData.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        return processBytes(new byte[]{b10}, 0, 1, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (!this.aadFinished) {
            doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
            this.aadFinished = true;
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        getKeyStream(bArr, i10, i11, bArr2, i12);
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z10) {
        if (z10) {
            this.mac = null;
        }
        this.aadData.reset();
        this.aadFinished = false;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }
}
