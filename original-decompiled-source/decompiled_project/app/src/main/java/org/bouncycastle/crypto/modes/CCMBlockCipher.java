package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.a;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CCMBlockCipher implements CCMModeCipher {
    private int blockSize;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private CipherParameters keyParam;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public CCMBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.macBlock = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int calculateMac(byte[] bArr, int i10, int i11, byte[] bArr2) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        CBCBlockCipherMac cBCBlockCipherMac = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        cBCBlockCipherMac.init(this.keyParam);
        byte[] bArr3 = new byte[16];
        if (hasAssociatedText()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i12 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr4 = this.nonce;
        bArr3[0] = (byte) (macSize | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i13 = i11;
        int i14 = 1;
        while (i13 > 0) {
            bArr3[16 - i14] = (byte) (i13 & 255);
            i13 >>>= 8;
            i14++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        if (hasAssociatedText()) {
            int associatedTextLength = getAssociatedTextLength();
            if (associatedTextLength < 65280) {
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 24));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 16));
                cBCBlockCipherMac.update((byte) (associatedTextLength >> 8));
                cBCBlockCipherMac.update((byte) associatedTextLength);
                i12 = 6;
            }
            byte[] bArr5 = this.initialAssociatedText;
            if (bArr5 != null) {
                cBCBlockCipherMac.update(bArr5, 0, bArr5.length);
            }
            if (this.associatedText.size() > 0) {
                cBCBlockCipherMac.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int i15 = (i12 + associatedTextLength) % 16;
            if (i15 != 0) {
                while (i15 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i15++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i10, i11);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    private int getAssociatedTextLength() {
        int size = this.associatedText.size();
        byte[] bArr = this.initialAssociatedText;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int getMacSize(boolean z10, int i10) {
        if (!z10 || (i10 >= 32 && i10 <= 128 && (i10 & 15) == 0)) {
            return i10 >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean hasAssociatedText() {
        return getAssociatedTextLength() > 0;
    }

    public static CCMModeCipher newInstance(BlockCipher blockCipher) {
        return new CCMBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i10);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
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
        int size = this.data.size() + i10;
        if (this.forEncryption) {
            return size + this.macSize;
        }
        int i11 = this.macSize;
        if (size < i11) {
            return 0;
        }
        return size - i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        this.forEncryption = z10;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = getMacSize(z10, aEADParameters.getMacSize());
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(a.a("invalid parameters passed to CCM: ", cipherParameters));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = getMacSize(z10, 64);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.keyParam = parameters;
        }
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IOException {
        this.associatedText.write(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IOException {
        this.associatedText.write(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException, IOException {
        this.data.write(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        this.data.write(bArr, i10, i11);
        return 0;
    }

    public int processPacket(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        int i13;
        if (this.keyParam == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.nonce;
        int length = bArr3.length;
        int i14 = 15 - length;
        if (i14 < 4) {
            if (i11 - (!this.forEncryption ? 16 : 0) >= (1 << (i14 * 8))) {
                throw new IllegalStateException("CCM packet too large for choice of q");
            }
        }
        byte[] bArr4 = new byte[this.blockSize];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(this.cipher);
        cTRModeCipherNewInstance.init(this.forEncryption, new ParametersWithIV(this.keyParam, bArr4));
        if (!this.forEncryption) {
            int i15 = this.macSize;
            if (i11 < i15) {
                throw new InvalidCipherTextException("data too short");
            }
            int i16 = i11 - i15;
            if (bArr2.length < i16 + i12) {
                throw new OutputLengthException("Output buffer too short.");
            }
            int i17 = i10 + i16;
            System.arraycopy(bArr, i17, this.macBlock, 0, i15);
            byte[] bArr5 = this.macBlock;
            cTRModeCipherNewInstance.processBlock(bArr5, 0, bArr5, 0);
            int i18 = this.macSize;
            while (true) {
                byte[] bArr6 = this.macBlock;
                if (i18 == bArr6.length) {
                    break;
                }
                bArr6[i18] = 0;
                i18++;
            }
            int i19 = i10;
            int i20 = i12;
            while (true) {
                i13 = this.blockSize;
                if (i19 >= i17 - i13) {
                    break;
                }
                cTRModeCipherNewInstance.processBlock(bArr, i19, bArr2, i20);
                int i21 = this.blockSize;
                i20 += i21;
                i19 += i21;
            }
            byte[] bArr7 = new byte[i13];
            int i22 = i16 - (i19 - i10);
            System.arraycopy(bArr, i19, bArr7, 0, i22);
            cTRModeCipherNewInstance.processBlock(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i20, i22);
            byte[] bArr8 = new byte[this.blockSize];
            calculateMac(bArr2, i12, i16, bArr8);
            if (Arrays.constantTimeAreEqual(this.macBlock, bArr8)) {
                return i16;
            }
            throw new InvalidCipherTextException("mac check in CCM failed");
        }
        int i23 = this.macSize + i11;
        if (bArr2.length < i23 + i12) {
            throw new OutputLengthException("Output buffer too short.");
        }
        calculateMac(bArr, i10, i11, this.macBlock);
        byte[] bArr9 = new byte[this.blockSize];
        cTRModeCipherNewInstance.processBlock(this.macBlock, 0, bArr9, 0);
        int i24 = i10;
        int i25 = i12;
        while (true) {
            int i26 = i10 + i11;
            int i27 = this.blockSize;
            if (i24 >= i26 - i27) {
                byte[] bArr10 = new byte[i27];
                int i28 = i26 - i24;
                System.arraycopy(bArr, i24, bArr10, 0, i28);
                cTRModeCipherNewInstance.processBlock(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i25, i28);
                System.arraycopy(bArr9, 0, bArr2, i12 + i11, this.macSize);
                return i23;
            }
            cTRModeCipherNewInstance.processBlock(bArr, i24, bArr2, i25);
            int i29 = this.blockSize;
            i25 += i29;
            i24 += i29;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] processPacket(byte[] bArr, int i10, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IllegalArgumentException {
        int i12;
        if (this.forEncryption) {
            i12 = this.macSize + i11;
        } else {
            int i13 = this.macSize;
            if (i11 < i13) {
                throw new InvalidCipherTextException("data too short");
            }
            i12 = i11 - i13;
        }
        byte[] bArr2 = new byte[i12];
        processPacket(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }
}
