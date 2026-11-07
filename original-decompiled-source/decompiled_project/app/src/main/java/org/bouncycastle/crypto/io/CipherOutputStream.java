package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;

/* loaded from: classes2.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
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

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(4:34|3|(2:5|(1:7))(2:12|(2:14|(1:16))(2:17|(1:19)))|20)|32|24|(1:30)(1:31)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws IOException {
        IOException cipherIOException;
        IOException iOException;
        ensureCapacity(0, true);
        try {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                int iDoFinal = bufferedBlockCipher.doFinal(this.buf, 0);
                if (iDoFinal != 0) {
                    ((FilterOutputStream) this).out.write(this.buf, 0, iDoFinal);
                }
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    int iDoFinal2 = aEADBlockCipher.doFinal(this.buf, 0);
                    if (iDoFinal2 != 0) {
                        ((FilterOutputStream) this).out.write(this.buf, 0, iDoFinal2);
                    }
                } else {
                    StreamCipher streamCipher = this.streamCipher;
                    if (streamCipher != null) {
                        streamCipher.reset();
                    }
                }
            }
            iOException = null;
        } catch (InvalidCipherTextException e10) {
            cipherIOException = new InvalidCipherTextIOException("Error finalising cipher data", e10);
            iOException = cipherIOException;
            flush();
            ((FilterOutputStream) this).out.close();
            if (iOException != null) {
            }
        } catch (Exception e11) {
            cipherIOException = new CipherIOException("Error closing stream: ", e11);
            iOException = cipherIOException;
            flush();
            ((FilterOutputStream) this).out.close();
            if (iOException != null) {
            }
        }
        flush();
        ((FilterOutputStream) this).out.close();
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IllegalStateException, DataLengthException, IOException {
        byte[] bArr = this.oneByte;
        byte b10 = (byte) i10;
        bArr[0] = b10;
        StreamCipher streamCipher = this.streamCipher;
        if (streamCipher != null) {
            ((FilterOutputStream) this).out.write(streamCipher.returnByte(b10));
        } else {
            write(bArr, 0, 1);
        }
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IllegalStateException, DataLengthException, IOException {
        write(bArr, 0, bArr.length);
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException, IOException {
        ensureCapacity(i11, false);
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (bufferedBlockCipher != null) {
            int iProcessBytes = bufferedBlockCipher.processBytes(bArr, i10, i11, this.buf, 0);
            if (iProcessBytes != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
        if (aEADBlockCipher == null) {
            this.streamCipher.processBytes(bArr, i10, i11, this.buf, 0);
            ((FilterOutputStream) this).out.write(this.buf, 0, i11);
        } else {
            int iProcessBytes2 = aEADBlockCipher.processBytes(bArr, i10, i11, this.buf, 0);
            if (iProcessBytes2 != 0) {
                ((FilterOutputStream) this).out.write(this.buf, 0, iProcessBytes2);
            }
        }
    }
}
