package org.bouncycastle.crypto.modes;

import j2.y;
import java.util.Vector;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Longs;

/* loaded from: classes2.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (blockCipher2 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (blockCipher2.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i10) {
        bArr[i10] = Byte.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 >= 16) {
                return;
            } else {
                bArr[i10] = 0;
            }
        }
    }

    public static int OCB_ntz(long j10) {
        return Longs.numberOfTrailingZeros(j10);
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i10 = 16;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            int i12 = bArr[i10] & 255;
            bArr2[i10] = (byte) (i11 | (i12 << 1));
            i11 = (i12 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        Bytes.xorTo(16, bArr2, bArr);
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        byte[] bArr2;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i11 = this.mainBlockPos;
            int i12 = this.macSize;
            if (i11 < i12) {
                throw new InvalidCipherTextException("data too short");
            }
            int i13 = i11 - i12;
            this.mainBlockPos = i13;
            bArr2 = new byte[i12];
            System.arraycopy(this.mainBlock, i13, bArr2, 0, i12);
        }
        int i14 = this.hashBlockPos;
        if (i14 > 0) {
            OCB_extend(this.hashBlock, i14);
            updateHASH(this.L_Asterisk);
        }
        int i15 = this.mainBlockPos;
        if (i15 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i15);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i16 = this.mainBlockPos;
            if (length < i10 + i16) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.mainBlock, 0, bArr, i10, i16);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i17 = this.macSize;
        byte[] bArr5 = new byte[i17];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i17);
        int i18 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i19 = i10 + i18;
            int i20 = this.macSize;
            if (length2 < i19 + i20) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, bArr, i19, i20);
            i18 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        reset(false);
        return i18;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    public byte[] getLSub(int i10) {
        while (i10 >= this.L.size()) {
            Vector vector = this.L;
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
        return (byte[]) this.L.elementAt(i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.mainBlockPos;
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
        return this.mainCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.mainBlockPos;
        if (!this.forEncryption) {
            int i12 = this.macSize;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] iv;
        KeyParameter key;
        boolean z11 = this.forEncryption;
        this.forEncryption = z10;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(y.a(macSize, "Invalid value for MAC size: "));
            }
            this.macSize = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z10 ? 16 : this.macSize + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (key != null) {
            this.hashCipher.init(true, key);
            this.mainCipher.init(z10, key);
            this.KtopInput = null;
        } else if (z11 != z10) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int iProcessNonce = processNonce(iv);
        int i10 = iProcessNonce % 8;
        int i11 = iProcessNonce / 8;
        if (i10 == 0) {
            System.arraycopy(this.Stretch, i11, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i12 = 0; i12 < 16; i12++) {
                byte[] bArr2 = this.Stretch;
                int i13 = bArr2[i11] & 255;
                i11++;
                this.OffsetMAIN_0[i12] = (byte) (((bArr2[i11] & 255) >>> (8 - i10)) | (i13 << i10));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) throws IllegalStateException, DataLengthException {
        byte[] bArr = this.hashBlock;
        int i10 = this.hashBlockPos;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.hashBlockPos = i11;
        if (i11 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.hashBlock;
            int i13 = this.hashBlockPos;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.hashBlockPos = i14;
            if (i14 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = this.mainBlock;
        int i11 = this.mainBlockPos;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.mainBlockPos = i12;
        if (i12 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i10);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (bArr.length < i10 + i11) {
            throw new DataLengthException("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            byte[] bArr3 = this.mainBlock;
            int i15 = this.mainBlockPos;
            bArr3[i15] = bArr[i10 + i14];
            int i16 = i15 + 1;
            this.mainBlockPos = i16;
            if (i16 == bArr3.length) {
                processMainBlock(bArr2, i12 + i13);
                i13 += 16;
            }
        }
        return i13;
    }

    public void processHashBlock() throws IllegalStateException, DataLengthException {
        long j10 = this.hashBlockCount + 1;
        this.hashBlockCount = j10;
        updateHASH(getLSub(OCB_ntz(j10)));
        this.hashBlockPos = 0;
    }

    public void processMainBlock(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        if (bArr.length < i10 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j10 = this.mainBlockCount + 1;
        this.mainBlockCount = j10;
        xor(bArr2, getLSub(OCB_ntz(j10)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i10, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    public int processNonce(byte[] bArr) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b10 = bArr2[15];
        int i11 = b10 & 63;
        bArr2[15] = (byte) (b10 & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i10 < 8) {
                byte[] bArr5 = this.Stretch;
                int i12 = i10 + 16;
                byte b11 = bArr4[i10];
                i10++;
                bArr5[i12] = (byte) (b11 ^ bArr4[i10]);
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IllegalStateException, DataLengthException {
        reset(true);
    }

    public void updateHASH(byte[] bArr) throws IllegalStateException, DataLengthException {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    public void reset(boolean z10) throws IllegalStateException, DataLengthException {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z10) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
