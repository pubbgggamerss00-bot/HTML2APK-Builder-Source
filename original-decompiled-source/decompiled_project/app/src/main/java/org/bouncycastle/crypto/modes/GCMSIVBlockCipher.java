package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class GCMSIVBlockCipher implements AEADBlockCipher {
    private static final byte ADD = -31;
    private static final int AEAD_COMPLETE = 2;
    private static final int BUFLEN = 16;
    private static final int HALFBUFLEN = 8;
    private static final int INIT = 1;
    private static final byte MASK = Byte.MIN_VALUE;
    private static final int MAX_DATALEN = 2147483623;
    private static final int NONCELEN = 12;
    private boolean forEncryption;
    private byte[] macBlock;
    private final GCMSIVHasher theAEADHasher;
    private final BlockCipher theCipher;
    private final GCMSIVHasher theDataHasher;
    private GCMSIVCache theEncData;
    private int theFlags;
    private final byte[] theGHash;
    private byte[] theInitialAEAD;
    private final GCMMultiplier theMultiplier;
    private byte[] theNonce;
    private GCMSIVCache thePlain;
    private final byte[] theReverse;

    public static class GCMSIVCache extends ByteArrayOutputStream {
        public void clearBuffer() {
            Arrays.fill(getBuffer(), (byte) 0);
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class GCMSIVHasher {
        private int numActive;
        private long numHashed;
        private final byte[] theBuffer;
        private final byte[] theByte;

        private GCMSIVHasher() {
            this.theBuffer = new byte[16];
            this.theByte = new byte[1];
        }

        public void completeHash() {
            if (this.numActive > 0) {
                Arrays.fill(GCMSIVBlockCipher.this.theReverse, (byte) 0);
                GCMSIVBlockCipher.fillReverse(this.theBuffer, 0, this.numActive, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher.gHASH(gCMSIVBlockCipher.theReverse);
            }
        }

        public long getBytesProcessed() {
            return this.numHashed;
        }

        public void reset() {
            this.numActive = 0;
            this.numHashed = 0L;
        }

        public void updateHash(byte b10) {
            byte[] bArr = this.theByte;
            bArr[0] = b10;
            updateHash(bArr, 0, 1);
        }

        public void updateHash(byte[] bArr, int i10, int i11) {
            int i12;
            int i13 = this.numActive;
            int i14 = 16 - i13;
            if (i13 <= 0 || i11 < i14) {
                i12 = i11;
                i14 = 0;
            } else {
                System.arraycopy(bArr, i10, this.theBuffer, i13, i14);
                GCMSIVBlockCipher.fillReverse(this.theBuffer, 0, 16, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher.gHASH(gCMSIVBlockCipher.theReverse);
                i12 = i11 - i14;
                this.numActive = 0;
            }
            while (i12 >= 16) {
                GCMSIVBlockCipher.fillReverse(bArr, i10 + i14, 16, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher2 = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher2.gHASH(gCMSIVBlockCipher2.theReverse);
                i14 += 16;
                i12 -= 16;
            }
            if (i12 > 0) {
                System.arraycopy(bArr, i10 + i14, this.theBuffer, this.numActive, i12);
                this.numActive += i12;
            }
            this.numHashed += i11;
        }
    }

    public GCMSIVBlockCipher() {
        this(AESEngine.newInstance());
    }

    private static int bufLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private byte[] calculateTag() throws IllegalStateException, DataLengthException {
        this.theDataHasher.completeHash();
        byte[] bArrCompletePolyVal = completePolyVal();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 12; i10++) {
            bArrCompletePolyVal[i10] = (byte) (bArrCompletePolyVal[i10] ^ this.theNonce[i10]);
        }
        bArrCompletePolyVal[15] = (byte) (bArrCompletePolyVal[15] & (-129));
        this.theCipher.processBlock(bArrCompletePolyVal, 0, bArr, 0);
        return bArr;
    }

    private void checkAEADStatus(int i10) {
        int i11 = this.theFlags;
        if ((i11 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i11 & 2) != 0) {
            throw new IllegalStateException("AEAD data cannot be processed after ordinary data");
        }
        if (this.theAEADHasher.getBytesProcessed() - Long.MIN_VALUE > (MAX_DATALEN - i10) - Long.MIN_VALUE) {
            throw new IllegalStateException("AEAD byte count exceeded");
        }
    }

    private static void checkBuffer(byte[] bArr, int i10, int i11, boolean z10) {
        int iBufLength = bufLength(bArr);
        int i12 = i10 + i11;
        if (i11 < 0 || i10 < 0 || i12 < 0 || i12 > iBufLength) {
            if (!z10) {
                throw new DataLengthException("Input buffer too short.");
            }
        }
    }

    private void checkStatus(int i10) {
        long j10;
        int i11 = this.theFlags;
        if ((i11 & 1) == 0) {
            throw new IllegalStateException("Cipher is not initialised");
        }
        if ((i11 & 2) == 0) {
            this.theAEADHasher.completeHash();
            this.theFlags |= 2;
        }
        long size = this.thePlain.size();
        if (this.forEncryption) {
            j10 = 2147483623;
        } else {
            size = this.theEncData.size();
            j10 = 2147483639;
        }
        if (size - Long.MIN_VALUE > (j10 - i10) - Long.MIN_VALUE) {
            throw new IllegalStateException("byte count exceeded");
        }
    }

    private byte[] completePolyVal() {
        byte[] bArr = new byte[16];
        gHashLengths();
        fillReverse(this.theGHash, 0, 16, bArr);
        return bArr;
    }

    private void decryptPlain() throws InvalidCipherTextException, IllegalStateException, DataLengthException, IOException {
        byte[] buffer = this.theEncData.getBuffer();
        int size = this.theEncData.size();
        int i10 = size - 16;
        if (i10 < 0) {
            throw new InvalidCipherTextException("Data too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(buffer, i10, size);
        byte[] bArrClone = Arrays.clone(bArrCopyOfRange);
        bArrClone[15] = (byte) (bArrClone[15] | MASK);
        byte[] bArr = new byte[16];
        int i11 = 0;
        while (i10 > 0) {
            this.theCipher.processBlock(bArrClone, 0, bArr, 0);
            int iMin = Math.min(16, i10);
            xorBlock(bArr, buffer, i11, iMin);
            this.thePlain.write(bArr, 0, iMin);
            this.theDataHasher.updateHash(bArr, 0, iMin);
            i10 -= iMin;
            i11 += iMin;
            incrementCounter(bArrClone);
        }
        byte[] bArrCalculateTag = calculateTag();
        if (!Arrays.constantTimeAreEqual(bArrCalculateTag, bArrCopyOfRange)) {
            reset();
            throw new InvalidCipherTextException("mac check failed");
        }
        byte[] bArr2 = this.macBlock;
        System.arraycopy(bArrCalculateTag, 0, bArr2, 0, bArr2.length);
    }

    private void deriveKeys(KeyParameter keyParameter) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int keyLength = keyParameter.getKeyLength();
        byte[] bArr4 = new byte[keyLength];
        System.arraycopy(this.theNonce, 0, bArr, 4, 12);
        this.theCipher.init(true, keyParameter);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 8, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 8, 8);
        if (keyLength == 32) {
            bArr[0] = (byte) (bArr[0] + 1);
            this.theCipher.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 16, 8);
            bArr[0] = (byte) (bArr[0] + 1);
            this.theCipher.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 24, 8);
        }
        this.theCipher.init(true, new KeyParameter(bArr4));
        fillReverse(bArr3, 0, 16, bArr2);
        mulX(bArr2);
        this.theMultiplier.init(bArr2);
        this.theFlags |= 1;
    }

    private int encryptPlain(byte[] bArr, byte[] bArr2, int i10) throws IllegalStateException, DataLengthException {
        byte[] buffer = this.thePlain.getBuffer();
        byte[] bArrClone = Arrays.clone(bArr);
        bArrClone[15] = (byte) (bArrClone[15] | MASK);
        byte[] bArr3 = new byte[16];
        int size = this.thePlain.size();
        int i11 = 0;
        while (size > 0) {
            this.theCipher.processBlock(bArrClone, 0, bArr3, 0);
            int iMin = Math.min(16, size);
            xorBlock(bArr3, buffer, i11, iMin);
            System.arraycopy(bArr3, 0, bArr2, i10 + i11, iMin);
            size -= iMin;
            i11 += iMin;
            incrementCounter(bArrClone);
        }
        return this.thePlain.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fillReverse(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 0;
        int i13 = 15;
        while (i12 < i11) {
            bArr2[i13] = bArr[i10 + i12];
            i12++;
            i13--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gHASH(byte[] bArr) {
        xorBlock(this.theGHash, bArr);
        this.theMultiplier.multiplyH(this.theGHash);
    }

    private void gHashLengths() {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(this.theDataHasher.getBytesProcessed() * 8, bArr, 0);
        Pack.longToBigEndian(this.theAEADHasher.getBytesProcessed() * 8, bArr, 8);
        gHASH(bArr);
    }

    private static void incrementCounter(byte[] bArr) {
        for (int i10 = 0; i10 < 4; i10++) {
            byte b10 = (byte) (bArr[i10] + 1);
            bArr[i10] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private static void mulX(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            byte b10 = bArr[i11];
            bArr[i11] = (byte) (i10 | ((b10 >> 1) & CertificateBody.profileType));
            i10 = (b10 & 1) == 0 ? 0 : -128;
        }
        if (i10 != 0) {
            bArr[0] = (byte) (bArr[0] ^ ADD);
        }
    }

    private void resetStreams() {
        GCMSIVCache gCMSIVCache = this.thePlain;
        if (gCMSIVCache != null) {
            gCMSIVCache.clearBuffer();
        }
        this.theAEADHasher.reset();
        this.theDataHasher.reset();
        this.thePlain = new GCMSIVCache();
        this.theEncData = this.forEncryption ? null : new GCMSIVCache();
        this.theFlags &= -3;
        Arrays.fill(this.theGHash, (byte) 0);
        byte[] bArr = this.theInitialAEAD;
        if (bArr != null) {
            this.theAEADHasher.updateHash(bArr, 0, bArr.length);
        }
    }

    private static void xorBlock(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException, IOException {
        checkStatus(0);
        checkBuffer(bArr, i10, getOutputSize(0), true);
        if (!this.forEncryption) {
            decryptPlain();
            int size = this.thePlain.size();
            System.arraycopy(this.thePlain.getBuffer(), 0, bArr, i10, size);
            resetStreams();
            return size;
        }
        byte[] bArrCalculateTag = calculateTag();
        int iEncryptPlain = encryptPlain(bArrCalculateTag, bArr, i10) + 16;
        System.arraycopy(bArrCalculateTag, 0, bArr, this.thePlain.size() + i10, 16);
        byte[] bArr2 = this.macBlock;
        System.arraycopy(bArrCalculateTag, 0, bArr2, 0, bArr2.length);
        resetStreams();
        return iEncryptPlain;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.theCipher.getAlgorithmName() + "-GCM-SIV";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        if (this.forEncryption) {
            return this.thePlain.size() + i10 + 16;
        }
        int size = this.theEncData.size() + i10;
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.theCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        byte[] iv;
        KeyParameter key;
        byte[] associatedText;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            associatedText = aEADParameters.getAssociatedText();
            iv = aEADParameters.getNonce();
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM-SIV");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            key = (KeyParameter) parametersWithIV.getParameters();
            associatedText = null;
        }
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Invalid nonce");
        }
        if (key == null || !(key.getKeyLength() == 16 || key.getKeyLength() == 32)) {
            throw new IllegalArgumentException("Invalid key");
        }
        this.forEncryption = z10;
        this.theInitialAEAD = associatedText;
        this.theNonce = iv;
        deriveKeys(key);
        resetStreams();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        checkAEADStatus(1);
        this.theAEADHasher.updateHash(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        checkAEADStatus(i11);
        checkBuffer(bArr, i10, i11, false);
        this.theAEADHasher.updateHash(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException, IOException {
        checkStatus(1);
        if (!this.forEncryption) {
            this.theEncData.write(b10);
            return 0;
        }
        this.thePlain.write(b10);
        this.theDataHasher.updateHash(b10);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException, IOException {
        checkStatus(i11);
        checkBuffer(bArr, i10, i11, false);
        if (this.forEncryption) {
            this.thePlain.write(bArr, i10, i11);
            this.theDataHasher.updateHash(bArr, i10, i11);
        } else {
            this.theEncData.write(bArr, i10, i11);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        resetStreams();
    }

    public GCMSIVBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new Tables4kGCMMultiplier());
    }

    private static void xorBlock(byte[] bArr, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr2[i12 + i10]);
        }
    }

    public GCMSIVBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        this.theGHash = new byte[16];
        this.theReverse = new byte[16];
        this.macBlock = new byte[16];
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Cipher required with a block size of 16.");
        }
        this.theCipher = blockCipher;
        this.theMultiplier = gCMMultiplier;
        this.theAEADHasher = new GCMSIVHasher();
        this.theDataHasher = new GCMSIVHasher();
    }
}
