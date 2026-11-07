package org.bouncycastle.est;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.cert.ocsp.a;
import org.bouncycastle.util.encoders.Base64;

/* loaded from: classes2.dex */
class CTEBase64InputStream extends InputStream {
    protected final byte[] data;
    protected final OutputStream dataOutputStream;
    protected boolean end;
    protected final Long max;
    protected final byte[] rawBuf;
    protected long read;
    protected int rp;
    protected final InputStream src;
    protected int wp;

    public CTEBase64InputStream(InputStream inputStream) {
        this(inputStream, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.src.close();
    }

    public int pullFromSrc() throws IOException {
        int i10;
        int i11 = 0;
        do {
            Long l10 = this.max;
            if (l10 != null && this.read > l10.longValue()) {
                return -1;
            }
            i10 = this.src.read();
            if (i10 >= 33 || i10 == 13 || i10 == 10) {
                byte[] bArr = this.rawBuf;
                if (i11 >= bArr.length) {
                    throw new IOException("Content Transfer Encoding, base64 line length > 1024");
                }
                bArr[i11] = (byte) i10;
                this.read++;
                i11++;
            } else if (i10 >= 0) {
                this.read++;
            }
            if (i10 <= -1 || i11 >= this.rawBuf.length) {
                break;
            }
        } while (i10 != 10);
        if (i11 > 0) {
            try {
                Base64.decode(this.rawBuf, 0, i11, this.dataOutputStream);
            } catch (Exception e10) {
                throw new IOException(a.a("Decode Base64 Content-Transfer-Encoding: ", e10));
            }
        } else if (i10 == -1) {
            return -1;
        }
        return this.wp;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.rp == this.wp) {
            this.rp = 0;
            this.wp = 0;
            int iPullFromSrc = pullFromSrc();
            if (iPullFromSrc == -1) {
                return iPullFromSrc;
            }
        }
        byte[] bArr = this.data;
        int i10 = this.rp;
        this.rp = i10 + 1;
        return bArr[i10] & 255;
    }

    public CTEBase64InputStream(InputStream inputStream, Long l10) {
        this.rawBuf = new byte[1024];
        this.data = new byte[768];
        this.src = inputStream;
        this.dataOutputStream = new OutputStream() { // from class: org.bouncycastle.est.CTEBase64InputStream.1
            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
                CTEBase64InputStream cTEBase64InputStream = CTEBase64InputStream.this;
                byte[] bArr = cTEBase64InputStream.data;
                int i11 = cTEBase64InputStream.wp;
                cTEBase64InputStream.wp = i11 + 1;
                bArr[i11] = (byte) i10;
            }
        };
        this.max = l10;
    }
}
