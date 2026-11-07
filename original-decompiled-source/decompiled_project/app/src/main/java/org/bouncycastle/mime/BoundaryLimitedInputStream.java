package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class BoundaryLimitedInputStream extends InputStream {
    private final byte[] boundary;
    private final byte[] buf;
    private int bufOff;
    private int lastI;
    private final InputStream src;
    private int index = 0;
    private boolean ended = false;

    public BoundaryLimitedInputStream(InputStream inputStream, String str) {
        this.bufOff = 0;
        this.src = inputStream;
        this.boundary = Strings.toByteArray(str);
        this.buf = new byte[str.length() + 3];
        this.bufOff = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read() throws IOException {
        int i10;
        int i11;
        int i12;
        if (this.ended) {
            return -1;
        }
        int i13 = this.index;
        int i14 = this.bufOff;
        if (i13 < i14) {
            byte[] bArr = this.buf;
            int i15 = i13 + 1;
            this.index = i15;
            i10 = bArr[i13] & 255;
            if (i15 < i14) {
                return i10;
            }
            this.bufOff = 0;
            this.index = 0;
        } else {
            i10 = this.src.read();
        }
        this.lastI = i10;
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 13 || i10 == 10) {
            this.index = 0;
            if (i10 != 13) {
                i11 = this.src.read();
                if (i11 == 45) {
                    byte[] bArr2 = this.buf;
                    int i16 = this.bufOff;
                    this.bufOff = i16 + 1;
                    bArr2[i16] = 45;
                    i11 = this.src.read();
                }
                if (i11 != 45) {
                    byte[] bArr3 = this.buf;
                    int i17 = this.bufOff;
                    int i18 = i17 + 1;
                    this.bufOff = i18;
                    bArr3[i17] = 45;
                    while (true) {
                        if (this.bufOff - i18 == this.boundary.length || (i12 = this.src.read()) < 0) {
                            break;
                        }
                        byte[] bArr4 = this.buf;
                        int i19 = this.bufOff;
                        byte b10 = (byte) i12;
                        bArr4[i19] = b10;
                        if (b10 != this.boundary[i19 - i18]) {
                            this.bufOff = i19 + 1;
                            break;
                        }
                        this.bufOff = i19 + 1;
                    }
                    if (this.bufOff - i18 == this.boundary.length) {
                        this.ended = true;
                        return -1;
                    }
                } else if (i11 >= 0) {
                    byte[] bArr5 = this.buf;
                    int i20 = this.bufOff;
                    this.bufOff = i20 + 1;
                    bArr5[i20] = (byte) i11;
                }
            } else {
                i11 = this.src.read();
                if (i11 == 10) {
                    byte[] bArr6 = this.buf;
                    int i21 = this.bufOff;
                    this.bufOff = i21 + 1;
                    bArr6[i21] = 10;
                    i11 = this.src.read();
                }
                if (i11 == 45) {
                }
                if (i11 != 45) {
                }
            }
        }
        return i10;
    }
}
