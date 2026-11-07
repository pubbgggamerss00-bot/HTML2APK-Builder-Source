package org.bouncycastle.est;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ESTException extends IOException {
    private static final long MAX_ERROR_BODY = 8192;
    private InputStream body;
    private Throwable cause;
    private int statusCode;

    public ESTException(String str) {
        this(str, null);
    }

    public InputStream getBody() {
        InputStream inputStream = this.body;
        return inputStream == null ? new InputStream() { // from class: org.bouncycastle.est.ESTException.1
            @Override // java.io.InputStream
            public int read() throws IOException {
                return -1;
            }
        } : inputStream;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " HTTP Status Code: " + this.statusCode;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ESTException(String str, Throwable th2) {
        super(str);
        this.cause = th2;
        this.body = null;
        this.statusCode = 0;
    }

    public ESTException(String str, Throwable th2, int i10, InputStream inputStream) throws IOException {
        super(str);
        this.cause = th2;
        this.statusCode = i10;
        if (inputStream == null) {
            this.body = null;
            return;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 < 0) {
                    break;
                }
                if (byteArrayOutputStream.size() + i11 > MAX_ERROR_BODY) {
                    byteArrayOutputStream.write(bArr, 0, 8192 - byteArrayOutputStream.size());
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Exception unused) {
                return;
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        this.body = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        inputStream.close();
    }
}
