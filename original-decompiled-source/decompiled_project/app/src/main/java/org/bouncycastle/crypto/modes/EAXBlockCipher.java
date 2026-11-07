package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private CTRModeCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = SICBlockCipher.newInstance(blockCipher);
    }

    private void calculateMac() throws IllegalStateException, DataLengthException {
        byte[] bArr = new byte[this.blockSize];
        int i10 = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) ((this.nonceMac[i10] ^ this.associatedTextMac[i10]) ^ bArr[i10]);
            i10++;
        }
    }

    private void initCipher() throws IllegalStateException, DataLengthException {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i10 = this.blockSize;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 2;
        this.mac.update(bArr, 0, i10);
    }

    private int process(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int iProcessBlock;
        byte[] bArr2 = this.bufBlock;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i13 = this.blockSize;
        if (length < i10 + i13) {
            throw new OutputLengthException("Output buffer is too short");
        }
        if (this.forEncryption) {
            iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i10);
            this.mac.update(bArr, i10, this.blockSize);
        } else {
            this.mac.update(bArr2, 0, i13);
            iProcessBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i10);
        }
        this.bufOff = 0;
        if (!this.forEncryption) {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return iProcessBlock;
    }

    private boolean verifyMac(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.macSize; i12++) {
            i11 |= this.macBlock[i12] ^ bArr[i10 + i12];
        }
        return i11 == 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        initCipher();
        int i11 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        if (this.forEncryption) {
            int i12 = i10 + i11;
            if (bArr.length < this.macSize + i12) {
                throw new OutputLengthException("Output buffer too short");
            }
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11);
            this.mac.update(bArr3, 0, i11);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i12, this.macSize);
            reset(false);
            return i11 + this.macSize;
        }
        int i13 = this.macSize;
        if (i11 < i13) {
            throw new InvalidCipherTextException("data too short");
        }
        if (bArr.length < (i10 + i11) - i13) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i11 > i13) {
            this.mac.update(bArr2, 0, i11 - i13);
            this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11 - this.macSize);
        }
        calculateMac();
        if (!verifyMac(this.bufBlock, i11 - this.macSize)) {
            throw new InvalidCipherTextException("mac check in EAX failed");
        }
        reset(false);
        return i11 - this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i10 = this.macSize;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.macBlock, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        if (this.forEncryption) {
            return i11 + this.macSize;
        }
        int i12 = this.macSize;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher.getUnderlyingCipher();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        if (!this.forEncryption) {
            int i12 = this.macSize;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % this.blockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] iv;
        CipherParameters parameters;
        this.forEncryption = z10;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z10 ? this.blockSize : this.blockSize + this.macSize];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i10 = this.blockSize;
        bArr[i10 - 1] = 0;
        this.mac.update(bArr, 0, i10);
        this.mac.update(iv, 0, iv.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(parameters, this.nonceMac));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IllegalStateException {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (this.cipherInitialized) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.mac.update(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        initCipher();
        return process(b10, bArr, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        initCipher();
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        int iProcess = 0;
        for (int i13 = 0; i13 != i11; i13++) {
            iProcess += process(bArr[i10 + i13], bArr2, i12 + iProcess);
        }
        return iProcess;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IllegalStateException, DataLengthException {
        reset(true);
    }

    private void reset(boolean z10) throws IllegalStateException, DataLengthException {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z10) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i10 = this.blockSize;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 1;
        this.mac.update(bArr, 0, i10);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
