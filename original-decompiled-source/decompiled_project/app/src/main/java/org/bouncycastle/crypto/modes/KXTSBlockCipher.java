package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class KXTSBlockCipher extends DefaultBufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j10, long[] jArr) {
        long j11 = 0;
        int i10 = 0;
        while (i10 < jArr.length) {
            long j12 = jArr[i10];
            jArr[i10] = j11 ^ (j12 << 1);
            i10++;
            j11 = j12 >>> 63;
        }
        jArr[0] = (j10 & (-j11)) ^ jArr[0];
    }

    public static long getReductionPolynomial(int i10) {
        if (i10 == 16) {
            return RED_POLY_128;
        }
        if (i10 == 32) {
            return RED_POLY_256;
        }
        if (i10 == 64) {
            return RED_POLY_512;
        }
        throw new IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
    }

    private void processBlocks(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        int i12 = this.counter;
        if (i12 == -1) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.counter = i12 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i13 = this.blockSize;
        byte[] bArr4 = new byte[i13];
        System.arraycopy(bArr3, 0, bArr4, 0, i13);
        for (int i14 = 0; i14 < this.blockSize; i14++) {
            bArr4[i14] = (byte) (bArr4[i14] ^ bArr[i10 + i14]);
        }
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr2[i11 + i15] = (byte) (bArr4[i15] ^ bArr3[i15]);
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        return i10;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalStateException, DataLengthException, IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Invalid parameters passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        int i10 = this.blockSize;
        if (length != i10) {
            throw new IllegalArgumentException("Currently only support IVs of exactly one block");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(iv, 0, bArr, 0, i10);
        ((DefaultBufferedBlockCipher) this).cipher.init(true, parameters);
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, 0, bArr, 0);
        ((DefaultBufferedBlockCipher) this).cipher.init(z10, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("Input buffer too short");
        }
        if (bArr2.length - i10 < i11) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i11 % this.blockSize != 0) {
            throw new IllegalArgumentException("Partial blocks not supported");
        }
        int i13 = 0;
        while (i13 < i11) {
            processBlocks(bArr, i10 + i13, bArr2, i12 + i13);
            i13 += this.blockSize;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        ((DefaultBufferedBlockCipher) this).cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }
}
