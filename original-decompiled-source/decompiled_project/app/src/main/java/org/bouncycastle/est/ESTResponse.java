package org.bouncycastle.est;

import e.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class ESTResponse {
    private static final Long ZERO = 0L;
    private String HttpVersion;
    private Long absoluteReadLimit;
    private Long contentLength;
    private final HttpUtil.Headers headers;
    private InputStream inputStream;
    private final byte[] lineBuffer;
    private final ESTRequest originalRequest;
    private long read = 0;
    private final Source source;
    private int statusCode;
    private String statusMessage;

    public static class PrintingInputStream extends InputStream {
        private final InputStream src;

        private PrintingInputStream(InputStream inputStream) {
            this.src = inputStream;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.src.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.src.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return this.src.read();
        }
    }

    public ESTResponse(ESTRequest eSTRequest, Source source) throws IOException {
        this.originalRequest = eSTRequest;
        this.source = source;
        if (source instanceof LimitedSource) {
            this.absoluteReadLimit = ((LimitedSource) source).getAbsoluteReadLimit();
        }
        Set<String> setAsKeySet = Properties.asKeySet("org.bouncycastle.debug.est");
        this.inputStream = (setAsKeySet.contains("input") || setAsKeySet.contains("all")) ? new PrintingInputStream(source.getInputStream()) : source.getInputStream();
        this.headers = new HttpUtil.Headers();
        this.lineBuffer = new byte[1024];
        process();
    }

    public static /* synthetic */ long access$108(ESTResponse eSTResponse) {
        long j10 = eSTResponse.read;
        eSTResponse.read = 1 + j10;
        return j10;
    }

    private void process() throws IOException {
        this.HttpVersion = readStringIncluding(' ');
        this.statusCode = Integer.parseInt(readStringIncluding(' '));
        this.statusMessage = readStringIncluding('\n');
        while (true) {
            String stringIncluding = readStringIncluding('\n');
            if (stringIncluding.length() <= 0) {
                break;
            }
            int iIndexOf = stringIncluding.indexOf(58);
            if (iIndexOf > -1) {
                this.headers.add(Strings.toLowerCase(stringIncluding.substring(0, iIndexOf).trim()), stringIncluding.substring(iIndexOf + 1).trim());
            }
        }
        boolean zEqualsIgnoreCase = this.headers.getFirstValueOrEmpty("Transfer-Encoding").equalsIgnoreCase("chunked");
        if (zEqualsIgnoreCase) {
            this.contentLength = 0L;
        } else {
            this.contentLength = getContentLength();
        }
        int i10 = this.statusCode;
        if (i10 == 204 || i10 == 202) {
            Long l10 = this.contentLength;
            if (l10 == null) {
                this.contentLength = 0L;
            } else if (i10 == 204 && l10.longValue() > 0) {
                throw new IOException("Got HTTP status 204 but Content-length > 0.");
            }
        }
        Long l11 = this.contentLength;
        if (l11 == null) {
            throw new IOException("No Content-length header.");
        }
        if (l11.equals(ZERO) && !zEqualsIgnoreCase) {
            this.inputStream = new InputStream() { // from class: org.bouncycastle.est.ESTResponse.1
                @Override // java.io.InputStream
                public int read() throws IOException {
                    return -1;
                }
            };
        }
        if (this.contentLength.longValue() < 0) {
            throw new IOException("Server returned negative content length: " + this.absoluteReadLimit);
        }
        if (this.absoluteReadLimit != null && this.contentLength.longValue() >= this.absoluteReadLimit.longValue()) {
            throw new IOException("Content length longer than absolute read limit: " + this.absoluteReadLimit + " Content-Length: " + this.contentLength);
        }
        this.inputStream = wrapWithCounter(this.inputStream, this.absoluteReadLimit);
        if (zEqualsIgnoreCase) {
            this.inputStream = new CTEChunkedInputStream(this.inputStream);
        }
        if ("base64".equalsIgnoreCase(getHeader("content-transfer-encoding"))) {
            InputStream inputStream = this.inputStream;
            this.inputStream = zEqualsIgnoreCase ? new CTEBase64InputStream(inputStream) : new CTEBase64InputStream(inputStream, this.contentLength);
        }
    }

    public void close() throws IOException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            inputStream.close();
        }
        this.source.close();
    }

    public long getAbsoluteReadLimit() {
        Long l10 = this.absoluteReadLimit;
        if (l10 == null) {
            return Long.MAX_VALUE;
        }
        return l10.longValue();
    }

    public Long getContentLength() {
        String firstValue = this.headers.getFirstValue("Content-Length");
        if (firstValue == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(firstValue));
        } catch (RuntimeException e10) {
            StringBuilder sbA = e.a("Content Length: '", firstValue, "' invalid. ");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public String getHeader(String str) {
        return this.headers.getFirstValue(str);
    }

    public String getHeaderOrEmpty(String str) {
        return this.headers.getFirstValueOrEmpty(str);
    }

    public HttpUtil.Headers getHeaders() {
        return this.headers;
    }

    public String getHttpVersion() {
        return this.HttpVersion;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public ESTRequest getOriginalRequest() {
        return this.originalRequest;
    }

    public Source getSource() {
        return this.source;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public String readStringIncluding(char c10) throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        int i12 = 0;
        while (true) {
            i10 = this.inputStream.read();
            bArr = this.lineBuffer;
            i11 = i12 + 1;
            bArr[i12] = (byte) i10;
            if (i11 >= bArr.length) {
                throw new IOException("Server sent line > " + this.lineBuffer.length);
            }
            if (i10 == c10 || i10 <= -1) {
                break;
            }
            i12 = i11;
        }
        if (i10 != -1) {
            return new String(bArr, 0, i11).trim();
        }
        throw new EOFException();
    }

    public InputStream wrapWithCounter(final InputStream inputStream, final Long l10) {
        return new InputStream() { // from class: org.bouncycastle.est.ESTResponse.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (ESTResponse.this.contentLength == null || ESTResponse.this.contentLength.longValue() - 1 <= ESTResponse.this.read) {
                    if (inputStream.available() > 0) {
                        throw new IOException("Stream closed with extra content in pipe that exceeds content length.");
                    }
                    inputStream.close();
                } else {
                    throw new IOException("Stream closed before limit fully read, Read: " + ESTResponse.this.read + " ContentLength: " + ESTResponse.this.contentLength);
                }
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i10 = inputStream.read();
                if (i10 > -1) {
                    ESTResponse.access$108(ESTResponse.this);
                    if (l10 != null && ESTResponse.this.read >= l10.longValue()) {
                        throw new IOException("Absolute Read Limit exceeded: " + l10);
                    }
                }
                return i10;
            }
        };
    }
}
