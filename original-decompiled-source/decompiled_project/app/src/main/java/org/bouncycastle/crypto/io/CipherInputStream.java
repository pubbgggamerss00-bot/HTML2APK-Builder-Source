package org.bouncycastle.crypto.io;

import c2.u;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cert.ocsp.a;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SkippingCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class CipherInputStream extends FilterInputStream {
    private static final int INPUT_BUF_SIZE = 2048;
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private int bufOff;
    private BufferedBlockCipher bufferedBlockCipher;
    private boolean finalized;
    private byte[] inBuf;
    private byte[] markBuf;
    private int markBufOff;
    private long markPosition;
    private int maxBuf;
    private SkippingCipher skippingCipher;
    private StreamCipher streamCipher;

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }

    private void ensureCapacity(int i10, boolean z10) {
        if (z10) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i10 = bufferedBlockCipher.getOutputSize(i10);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i10 = aEADBlockCipher.getOutputSize(i10);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i10 = bufferedBlockCipher2.getUpdateOutputSize(i10);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i10 = aEADBlockCipher2.getUpdateOutputSize(i10);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i10) {
            this.buf = new byte[i10];
        }
    }

    private void finaliseCipher() throws IOException {
        int iDoFinal;
        try {
            this.finalized = true;
            ensureCapacity(0, true);
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                iDoFinal = bufferedBlockCipher.doFinal(this.buf, 0);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher == null) {
                    this.maxBuf = 0;
                    return;
                }
                iDoFinal = aEADBlockCipher.doFinal(this.buf, 0);
            }
            this.maxBuf = iDoFinal;
        } catch (InvalidCipherTextException e10) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e10);
        } catch (Exception e11) {
            throw new IOException(a.a("Error finalising cipher ", e11));
        }
    }

    private int nextChunk() throws IOException {
        int iProcessBytes;
        if (this.finalized) {
            return -1;
        }
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i10 = this.maxBuf;
            if (i10 != 0) {
                return i10;
            }
            int i11 = ((FilterInputStream) this).in.read(this.inBuf);
            if (i11 == -1) {
                finaliseCipher();
                int i12 = this.maxBuf;
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            try {
                ensureCapacity(i11, false);
                BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
                if (bufferedBlockCipher != null) {
                    iProcessBytes = bufferedBlockCipher.processBytes(this.inBuf, 0, i11, this.buf, 0);
                } else {
                    AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                    if (aEADBlockCipher != null) {
                        iProcessBytes = aEADBlockCipher.processBytes(this.inBuf, 0, i11, this.buf, 0);
                    } else {
                        this.streamCipher.processBytes(this.inBuf, 0, i11, this.buf, 0);
                        this.maxBuf = i11;
                    }
                }
                this.maxBuf = iProcessBytes;
            } catch (Exception e10) {
                throw new CipherIOException("Error processing stream ", e10);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.bufOff = 0;
            this.maxBuf = 0;
            this.markBufOff = 0;
            this.markPosition = 0L;
            byte[] bArr = this.markBuf;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
                this.markBuf = null;
            }
            byte[] bArr2 = this.buf;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
                this.buf = null;
            }
            Arrays.fill(this.inBuf, (byte) 0);
        } finally {
            if (!this.finalized) {
                finaliseCipher();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        SkippingCipher skippingCipher = this.skippingCipher;
        if (skippingCipher != null) {
            this.markPosition = skippingCipher.getPosition();
        }
        byte[] bArr = this.buf;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.markBuf = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.markBufOff = this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.skippingCipher != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        byte[] bArr = this.buf;
        int i10 = this.bufOff;
        this.bufOff = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.skippingCipher == null) {
            throw new IOException("cipher must implement SkippingCipher to be used with reset()");
        }
        ((FilterInputStream) this).in.reset();
        this.skippingCipher.seekTo(this.markPosition);
        byte[] bArr = this.markBuf;
        if (bArr != null) {
            this.buf = bArr;
        }
        this.bufOff = this.markBufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0L;
        }
        if (this.skippingCipher == null) {
            int iMin = (int) Math.min(j10, available());
            this.bufOff += iMin;
            return iMin;
        }
        long jAvailable = available();
        if (j10 <= jAvailable) {
            this.bufOff = (int) (this.bufOff + j10);
            return j10;
        }
        this.bufOff = this.maxBuf;
        long jSkip = ((FilterInputStream) this).in.skip(j10 - jAvailable);
        if (jSkip == this.skippingCipher.skip(jSkip)) {
            return jSkip + jAvailable;
        }
        throw new IOException(u.a("Unable to skip cipher ", " bytes.", jSkip));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher, int i10) {
        super(inputStream);
        this.bufferedBlockCipher = bufferedBlockCipher;
        this.inBuf = new byte[i10];
        this.skippingCipher = bufferedBlockCipher instanceof SkippingCipher ? (SkippingCipher) bufferedBlockCipher : null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        int iMin = Math.min(i11, available());
        System.arraycopy(this.buf, this.bufOff, bArr, i10, iMin);
        this.bufOff += iMin;
        return iMin;
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher, int i10) {
        super(inputStream);
        this.streamCipher = streamCipher;
        this.inBuf = new byte[i10];
        this.skippingCipher = streamCipher instanceof SkippingCipher ? (SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher, int i10) {
        super(inputStream);
        this.aeadBlockCipher = aEADBlockCipher;
        this.inBuf = new byte[i10];
        this.skippingCipher = aEADBlockCipher instanceof SkippingCipher ? (SkippingCipher) aEADBlockCipher : null;
    }
}
