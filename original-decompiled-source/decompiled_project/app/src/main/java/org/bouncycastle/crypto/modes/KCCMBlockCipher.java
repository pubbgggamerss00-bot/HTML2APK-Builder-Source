package org.bouncycastle.crypto.modes;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;
    private byte[] G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f20047s;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    private void CalculateMac(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        while (i11 > 0) {
            for (int i12 = 0; i12 < this.engine.getBlockSize(); i12++) {
                byte[] bArr2 = this.macBlock;
                bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i10 + i12]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i11 -= this.engine.getBlockSize();
            i10 += this.engine.getBlockSize();
        }
    }

    private void ProcessBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        int i13 = 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i13 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f20047s;
            bArr4[i13] = (byte) (bArr4[i13] + bArr3[i13]);
            i13++;
        }
        this.engine.processBlock(this.f20047s, 0, this.buffer, 0);
        for (int i14 = 0; i14 < this.engine.getBlockSize(); i14++) {
            bArr2[i12 + i14] = (byte) (this.buffer[i14] ^ bArr[i10 + i14]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[LOOP:0: B:24:0x0041->B:26:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte getFlag(boolean z10, int i10) {
        String str;
        String binaryString;
        StringBuffer stringBuffer = new StringBuffer();
        if (z10) {
            stringBuffer.append("1");
        } else {
            stringBuffer.append(d.L0);
        }
        if (i10 == 8) {
            str = "010";
        } else if (i10 == 16) {
            str = "011";
        } else if (i10 == 32) {
            str = "100";
        } else {
            if (i10 != 48) {
                if (i10 == 64) {
                    str = "110";
                }
                binaryString = Integer.toBinaryString(this.Nb_ - 1);
                while (binaryString.length() < 4) {
                    binaryString = new StringBuffer(binaryString).insert(0, d.L0).toString();
                }
                stringBuffer.append(binaryString);
                return (byte) Integer.parseInt(stringBuffer.toString(), 2);
            }
            str = "101";
        }
        stringBuffer.append(str);
        binaryString = Integer.toBinaryString(this.Nb_ - 1);
        while (binaryString.length() < 4) {
        }
        stringBuffer.append(binaryString);
        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
    }

    private void intToBytes(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) (i10 >> 24);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11] = (byte) i10;
    }

    private void processAAD(byte[] bArr, int i10, int i11, int i12) throws IllegalStateException, DataLengthException {
        if (i11 - i10 < this.engine.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i11 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i12, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.G1, 0, this.macBlock, 0);
        intToBytes(i11, this.buffer, 0);
        if (i11 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i13 = 0; i13 < i11; i13++) {
                byte[] bArr4 = this.buffer;
                int i14 = this.Nb_ + i13;
                bArr4[i14] = (byte) (bArr4[i14] ^ bArr[i10 + i13]);
            }
            for (int i15 = 0; i15 < this.engine.getBlockSize(); i15++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i15] = (byte) (bArr5[i15] ^ this.buffer[i15]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i16 = 0; i16 < this.engine.getBlockSize(); i16++) {
            byte[] bArr7 = this.macBlock;
            bArr7[i16] = (byte) (bArr7[i16] ^ this.buffer[i16]);
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr8 = this.macBlock;
        blockCipher2.processBlock(bArr8, 0, bArr8, 0);
        while (i11 != 0) {
            for (int i17 = 0; i17 < this.engine.getBlockSize(); i17++) {
                byte[] bArr9 = this.macBlock;
                bArr9[i17] = (byte) (bArr9[i17] ^ bArr[i17 + i10]);
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr10 = this.macBlock;
            blockCipher3.processBlock(bArr10, 0, bArr10, 0);
            i10 += this.engine.getBlockSize();
            i11 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i10) {
        if (i10 != 4 && i10 != 6 && i10 != 8) {
            throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.Nb_ = i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IOException {
        int iProcessPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i10);
        reset();
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KCCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        return i10 + this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z10;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
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
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i10, i11);
        return 0;
    }

    public int processPacket(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IOException {
        int i13;
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i12 < i11) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.associatedText.size() > 0) {
            if (this.forEncryption) {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
            } else {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
            }
        }
        if (!this.forEncryption) {
            if ((i11 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            this.engine.processBlock(this.nonce, 0, this.f20047s, 0);
            int blockSize = i11 / this.engine.getBlockSize();
            int blockSize2 = i10;
            int blockSize3 = i12;
            for (int i14 = 0; i14 < blockSize; i14++) {
                ProcessBlock(bArr, blockSize2, i11, bArr2, blockSize3);
                blockSize2 += this.engine.getBlockSize();
                blockSize3 += this.engine.getBlockSize();
            }
            if (i11 > blockSize2) {
                int i15 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i15 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.f20047s;
                    bArr4[i15] = (byte) (bArr4[i15] + bArr3[i15]);
                    i15++;
                }
                this.engine.processBlock(this.f20047s, 0, this.buffer, 0);
                int i16 = 0;
                while (true) {
                    i13 = this.macSize;
                    if (i16 >= i13) {
                        break;
                    }
                    bArr2[blockSize3 + i16] = (byte) (this.buffer[i16] ^ bArr[blockSize2 + i16]);
                    i16++;
                }
                blockSize3 += i13;
            }
            int i17 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i17 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.f20047s;
                bArr6[i17] = (byte) (bArr6[i17] + bArr5[i17]);
                i17++;
            }
            this.engine.processBlock(this.f20047s, 0, this.buffer, 0);
            int i18 = this.macSize;
            System.arraycopy(bArr2, blockSize3 - i18, this.buffer, 0, i18);
            CalculateMac(bArr2, 0, blockSize3 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i19 = this.macSize;
            byte[] bArr7 = new byte[i19];
            System.arraycopy(this.buffer, 0, bArr7, 0, i19);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            reset();
            return i11 - this.macSize;
        }
        if (i11 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        CalculateMac(bArr, i10, i11);
        this.engine.processBlock(this.nonce, 0, this.f20047s, 0);
        int blockSize4 = i10;
        int blockSize5 = i11;
        int blockSize6 = i12;
        while (blockSize5 > 0) {
            ProcessBlock(bArr, blockSize4, i11, bArr2, blockSize6);
            blockSize5 -= this.engine.getBlockSize();
            blockSize4 += this.engine.getBlockSize();
            blockSize6 += this.engine.getBlockSize();
        }
        int i20 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i20 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.f20047s;
            bArr9[i20] = (byte) (bArr9[i20] + bArr8[i20]);
            i20++;
        }
        this.engine.processBlock(this.f20047s, 0, this.buffer, 0);
        int i21 = 0;
        while (true) {
            int i22 = this.macSize;
            if (i21 >= i22) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i22);
                reset();
                return this.macSize + i11;
            }
            bArr2[blockSize6 + i21] = (byte) (this.buffer[i21] ^ this.macBlock[i21]);
            i21++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i10) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.f20047s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i10);
    }
}
