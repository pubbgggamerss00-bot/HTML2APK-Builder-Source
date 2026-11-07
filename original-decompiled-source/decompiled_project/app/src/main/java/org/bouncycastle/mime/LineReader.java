package org.bouncycastle.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
class LineReader {
    private int lastC = -1;
    private final InputStream src;

    public LineReader(InputStream inputStream) {
        this.src = inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x001a, code lost:
    
        r1 = r4.src.read();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String readLine() throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = this.lastC;
        if (i11 != -1) {
            if (i11 == 13) {
                return "";
            }
            this.lastC = -1;
            while (i11 >= 0 && i11 != 13 && i11 != 10) {
                byteArrayOutputStream.write(i11);
            }
            if (i11 == 13 && (i10 = this.src.read()) != 10 && i10 >= 0) {
                this.lastC = i10;
            }
            if (i11 < 0) {
                return null;
            }
            return Strings.fromUTF8ByteArray(byteArrayOutputStream.toByteArray());
        }
        i11 = this.src.read();
    }
}
