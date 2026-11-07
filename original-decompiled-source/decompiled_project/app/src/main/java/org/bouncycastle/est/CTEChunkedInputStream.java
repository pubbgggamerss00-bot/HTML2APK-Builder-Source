package org.bouncycastle.est;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class CTEChunkedInputStream extends InputStream {
    int chunkLen = 0;
    private InputStream src;

    public CTEChunkedInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    private String readEOL() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = this.src.read();
            if (i10 != -1) {
                byteArrayOutputStream.write(i10 & 255);
                if (i10 == 10) {
                    break;
                }
            } else if (byteArrayOutputStream.size() == 0) {
                return null;
            }
        }
        return byteArrayOutputStream.toString().trim();
    }

    @Override // java.io.InputStream
    public int read() throws IOException, NumberFormatException {
        String eol;
        int i10 = this.chunkLen;
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        if (i10 == 0) {
            do {
                eol = readEOL();
                if (eol == null) {
                    break;
                }
            } while (eol.length() == 0);
            if (eol == null) {
                return -1;
            }
            int i11 = Integer.parseInt(eol.trim(), 16);
            this.chunkLen = i11;
            if (i11 == 0) {
                readEOL();
                this.chunkLen = PKIFailureInfo.systemUnavail;
                return -1;
            }
        }
        this.chunkLen--;
        return this.src.read();
    }
}
