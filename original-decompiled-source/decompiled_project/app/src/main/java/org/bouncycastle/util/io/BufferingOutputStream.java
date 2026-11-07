package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.other.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.buf;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i10) {
        this.other = outputStream;
        this.buf = new byte[i10];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2;
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i12 = this.bufOff;
        if (i11 < length - i12) {
            System.arraycopy(bArr, i10, bArr3, i12, i11);
        } else {
            int length2 = bArr3.length - i12;
            System.arraycopy(bArr, i10, bArr3, i12, length2);
            this.bufOff += length2;
            flush();
            int length3 = i10 + length2;
            i11 -= length2;
            while (true) {
                bArr2 = this.buf;
                if (i11 < bArr2.length) {
                    break;
                }
                this.other.write(bArr, length3, bArr2.length);
                byte[] bArr4 = this.buf;
                length3 += bArr4.length;
                i11 -= bArr4.length;
            }
            if (i11 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, length3, bArr2, this.bufOff, i11);
            }
        }
        this.bufOff += i11;
    }
}
