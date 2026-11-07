package org.jf.dexlib2.writer.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import oc.a;

/* loaded from: classes3.dex */
public class FileDeferredOutputStream extends DeferredOutputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private final File backingFile;
    private final NakedBufferedOutputStream output;
    private int writtenBytes;

    public static class NakedBufferedOutputStream extends BufferedOutputStream {
        public NakedBufferedOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public byte[] getBuffer() {
            return ((BufferedOutputStream) this).buf;
        }

        public int getCount() {
            return ((BufferedOutputStream) this).count;
        }

        public void resetBuffer() {
            ((BufferedOutputStream) this).count = 0;
        }

        public NakedBufferedOutputStream(OutputStream outputStream, int i10) {
            super(outputStream, i10);
        }
    }

    public FileDeferredOutputStream(File file) throws FileNotFoundException {
        this(file, 4096);
    }

    public static DeferredOutputStreamFactory getFactory(File file) {
        return getFactory(file, 4096);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.output.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.output.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.output.write(i10);
        this.writtenBytes++;
    }

    @Override // org.jf.dexlib2.writer.io.DeferredOutputStream
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] buffer = this.output.getBuffer();
        int count = this.output.getCount();
        this.output.resetBuffer();
        this.output.close();
        if (count != this.writtenBytes) {
            FileInputStream fileInputStream = new FileInputStream(this.backingFile);
            int i10 = a.f19131a;
            outputStream.getClass();
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i11);
                }
            }
            this.backingFile.delete();
        }
        outputStream.write(buffer, 0, count);
    }

    public FileDeferredOutputStream(File file, int i10) throws FileNotFoundException {
        this.backingFile = file;
        this.output = new NakedBufferedOutputStream(new FileOutputStream(file), i10);
    }

    public static DeferredOutputStreamFactory getFactory(final File file, final int i10) {
        return new DeferredOutputStreamFactory() { // from class: org.jf.dexlib2.writer.io.FileDeferredOutputStream.1
            @Override // org.jf.dexlib2.writer.io.DeferredOutputStreamFactory
            public DeferredOutputStream makeDeferredOutputStream() throws IOException {
                return new FileDeferredOutputStream(File.createTempFile("dexlibtmp", null, file), i10);
            }
        };
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.output.write(bArr);
        this.writtenBytes += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.output.write(bArr, i10, i11);
        this.writtenBytes += i11;
    }
}
