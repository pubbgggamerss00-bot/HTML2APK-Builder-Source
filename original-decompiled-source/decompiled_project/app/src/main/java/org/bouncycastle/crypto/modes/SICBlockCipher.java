package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import x0.a;

/* loaded from: classes2.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j10) {
        int i10 = 5;
        if (j10 >= 0) {
            long j11 = (this.byteCount + j10) / this.blockSize;
            long j12 = j11;
            if (j11 > 255) {
                while (i10 >= 1) {
                    long j13 = 1 << (i10 * 8);
                    while (j12 >= j13) {
                        incrementCounterAt(i10);
                        j12 -= j13;
                    }
                    i10--;
                }
            }
            incrementCounter((int) j12);
            this.byteCount = (int) ((j10 + this.byteCount) - (this.blockSize * j11));
            return;
        }
        long j14 = ((-j10) - this.byteCount) / this.blockSize;
        long j15 = j14;
        if (j14 > 255) {
            while (i10 >= 1) {
                long j16 = 1 << (i10 * 8);
                while (j15 > j16) {
                    decrementCounterAt(i10);
                    j15 -= j16;
                }
                i10--;
            }
        }
        for (long j17 = 0; j17 != j15; j17++) {
            decrementCounterAt(0);
        }
        int i11 = (int) ((this.blockSize * j14) + this.byteCount + j10);
        if (i11 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i11;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize && this.counter[bArr.length - 1] != bArr[bArr.length - 1]) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    private void decrementCounterAt(int i10) {
        byte b10;
        int length = this.counter.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b10 = (byte) (r1[length] - 1);
            this.counter[length] = b10;
        } while (b10 == -1);
    }

    private void incrementCounter() {
        byte b10;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }

    private void incrementCounterAt(int i10) {
        byte b10;
        int length = this.counter.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) throws IllegalStateException, DataLengthException {
        int i10 = this.byteCount;
        if (i10 == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i11 = this.byteCount;
            this.byteCount = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.counterOut;
        int i12 = i10 + 1;
        this.byteCount = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i10 = length - 1;
        while (i10 >= 1) {
            byte[] bArr3 = this.IV;
            int i11 = i10 < bArr3.length ? (bArr2[i10] & 255) - (bArr3[i10] & 255) : bArr2[i10] & 255;
            if (i11 < 0) {
                int i12 = i10 - 1;
                bArr2[i12] = (byte) (bArr2[i12] - 1);
                i11 += 256;
            }
            bArr2[i10] = (byte) i11;
            i10--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.IV = bArrClone;
        int i10 = this.blockSize;
        if (i10 < bArrClone.length) {
            throw new IllegalArgumentException(a.a(new StringBuilder("CTR/SIC mode requires IV no greater than: "), this.blockSize, " bytes."));
        }
        int i11 = 8 > i10 / 2 ? i10 / 2 : 8;
        if (i10 - bArrClone.length <= i11) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i11) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        SICBlockCipher sICBlockCipher;
        if (this.byteCount != 0) {
            sICBlockCipher = this;
            sICBlockCipher.processBytes(bArr, i10, this.blockSize, bArr2, i11);
        } else {
            sICBlockCipher = this;
            int i12 = sICBlockCipher.blockSize;
            if (i10 + i12 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i11 + i12 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            sICBlockCipher.cipher.processBlock(sICBlockCipher.counter, 0, sICBlockCipher.counterOut, 0);
            for (int i13 = 0; i13 < sICBlockCipher.blockSize; i13++) {
                bArr2[i11 + i13] = (byte) (bArr[i10 + i13] ^ sICBlockCipher.counterOut[i13]);
            }
            incrementCounter();
        }
        return sICBlockCipher.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        byte b10;
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = this.byteCount;
            if (i14 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b11 = bArr[i10 + i13];
                byte[] bArr3 = this.counterOut;
                int i15 = this.byteCount;
                this.byteCount = i15 + 1;
                b10 = (byte) (b11 ^ bArr3[i15]);
            } else {
                byte b12 = bArr[i10 + i13];
                byte[] bArr4 = this.counterOut;
                int i16 = i14 + 1;
                this.byteCount = i16;
                b10 = (byte) (bArr4[i14] ^ b12);
                if (i16 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i12 + i13] = b10;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) throws IllegalStateException, DataLengthException {
        adjustCounter(j10);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j10;
    }

    private void incrementCounter(int i10) {
        byte[] bArr = this.counter;
        byte b10 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i10);
        if (b10 == 0 || bArr[bArr.length - 1] >= b10) {
            return;
        }
        incrementCounterAt(1);
    }
}
