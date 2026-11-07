package org.jf.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class RandomAccessFileOutputStream extends OutputStream {
    private int filePosition;
    private final RandomAccessFile raf;

    public RandomAccessFileOutputStream(RandomAccessFile randomAccessFile, int i10) {
        this.filePosition = i10;
        this.raf = randomAccessFile;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.raf.seek(this.filePosition);
        this.filePosition++;
        this.raf.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.raf.seek(this.filePosition);
        this.filePosition += bArr.length;
        this.raf.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.raf.seek(this.filePosition);
        this.filePosition += i11;
        this.raf.write(bArr, i10, i11);
    }
}
