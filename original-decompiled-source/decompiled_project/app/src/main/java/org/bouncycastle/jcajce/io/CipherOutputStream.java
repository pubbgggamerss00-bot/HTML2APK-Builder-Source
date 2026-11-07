package org.bouncycastle.jcajce.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.bouncycastle.cert.ocsp.a;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* loaded from: classes.dex */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher cipher;
    private final byte[] oneByte;

    public CipherOutputStream(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.cipher = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:0|(4:24|2|(1:4)|10)|22|14|(1:20)(1:21)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() throws BadPaddingException, IllegalBlockSizeException, IOException {
        IOException iOException;
        IOException iOException2;
        try {
            byte[] bArrDoFinal = this.cipher.doFinal();
            if (bArrDoFinal != null) {
                ((FilterOutputStream) this).out.write(bArrDoFinal);
            }
            iOException2 = null;
        } catch (GeneralSecurityException e10) {
            iOException = new InvalidCipherTextIOException("Error during cipher finalisation", e10);
            iOException2 = iOException;
            flush();
            ((FilterOutputStream) this).out.close();
            if (iOException2 != null) {
            }
        } catch (Exception e11) {
            iOException = new IOException(a.a("Error closing stream: ", e11));
            iOException2 = iOException;
            flush();
            ((FilterOutputStream) this).out.close();
            if (iOException2 != null) {
            }
        }
        flush();
        ((FilterOutputStream) this).out.close();
        if (iOException2 != null) {
            throw iOException2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArrUpdate = this.cipher.update(bArr, i10, i11);
        if (bArrUpdate != null) {
            ((FilterOutputStream) this).out.write(bArrUpdate);
        }
    }
}
