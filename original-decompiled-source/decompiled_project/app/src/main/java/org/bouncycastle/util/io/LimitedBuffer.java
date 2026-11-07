package org.bouncycastle.util.io;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class LimitedBuffer extends OutputStream {
    private final byte[] buf;
    private int count = 0;

    public LimitedBuffer(int i10) {
        this.buf = new byte[i10];
    }

    public int copyTo(byte[] bArr, int i10) {
        System.arraycopy(this.buf, 0, bArr, i10, this.count);
        return this.count;
    }

    public int limit() {
        return this.buf.length;
    }

    public void reset() {
        this.count = 0;
    }

    public int size() {
        return this.count;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.buf;
        int i11 = this.count;
        this.count = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        System.arraycopy(bArr, 0, this.buf, this.count, bArr.length);
        this.count += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        System.arraycopy(bArr, i10, this.buf, this.count, i11);
        this.count += i11;
    }
}
