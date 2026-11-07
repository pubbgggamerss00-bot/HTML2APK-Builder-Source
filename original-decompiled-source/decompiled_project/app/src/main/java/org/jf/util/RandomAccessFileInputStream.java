package org.jf.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class RandomAccessFileInputStream extends InputStream {
    private int filePosition;
    private final RandomAccessFile raf;

    public RandomAccessFileInputStream(RandomAccessFile randomAccessFile, int i10) {
        this.filePosition = i10;
        this.raf = randomAccessFile;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return ((int) this.raf.length()) - this.filePosition;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.raf.seek(this.filePosition);
        this.filePosition++;
        return this.raf.read();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        int iMin = Math.min((int) j10, available());
        this.filePosition += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        this.raf.seek(this.filePosition);
        int i10 = this.raf.read(bArr);
        this.filePosition += i10;
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.raf.seek(this.filePosition);
        int i12 = this.raf.read(bArr, i10, i11);
        this.filePosition += i12;
        return i12;
    }
}
