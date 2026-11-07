package org.bouncycastle.mime;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.mime.smime.SMimeParserContext;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
public class CanonicalOutputStream extends FilterOutputStream {
    protected static byte[] newline = {RegisterType.LONG_HI, 10};
    private final boolean is7Bit;
    protected int lastb;

    public CanonicalOutputStream(SMimeParserContext sMimeParserContext, Headers headers, OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        if (headers.getContentType() != null) {
            this.is7Bit = (headers.getContentType() == null || headers.getContentType().equals("binary")) ? false : true;
        } else {
            this.is7Bit = sMimeParserContext.getDefaultContentTransferEncoding().equals("7bit");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(int i10) throws IOException {
        if (!this.is7Bit) {
            ((FilterOutputStream) this).out.write(i10);
        } else if (i10 == 13) {
            ((FilterOutputStream) this).out.write(newline);
        } else if (i10 == 10) {
            if (this.lastb != 13) {
                ((FilterOutputStream) this).out.write(newline);
            }
        }
        this.lastb = i10;
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            write(bArr[i12]);
        }
    }
}
