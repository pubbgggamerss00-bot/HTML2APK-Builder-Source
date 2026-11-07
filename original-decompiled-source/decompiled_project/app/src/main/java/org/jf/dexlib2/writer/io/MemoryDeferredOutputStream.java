package org.jf.dexlib2.writer.io;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MemoryDeferredOutputStream extends DeferredOutputStream {
    private static final int DEFAULT_BUFFER_SIZE = 16384;
    private final List<byte[]> buffers;
    private byte[] currentBuffer;
    private int currentPosition;

    public MemoryDeferredOutputStream() {
        this(16384);
    }

    public static DeferredOutputStreamFactory getFactory() {
        return getFactory(16384);
    }

    private int remaining() {
        return this.currentBuffer.length - this.currentPosition;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (remaining() == 0) {
            this.buffers.add(this.currentBuffer);
            this.currentBuffer = new byte[this.currentBuffer.length];
            this.currentPosition = 0;
        }
        byte[] bArr = this.currentBuffer;
        int i11 = this.currentPosition;
        this.currentPosition = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // org.jf.dexlib2.writer.io.DeferredOutputStream
    public void writeTo(OutputStream outputStream) throws IOException {
        Iterator<byte[]> it = this.buffers.iterator();
        while (it.hasNext()) {
            outputStream.write(it.next());
        }
        int i10 = this.currentPosition;
        if (i10 > 0) {
            outputStream.write(this.currentBuffer, 0, i10);
        }
        this.buffers.clear();
        this.currentPosition = 0;
    }

    public MemoryDeferredOutputStream(int i10) {
        this.buffers = new ArrayList();
        this.currentBuffer = new byte[i10];
    }

    public static DeferredOutputStreamFactory getFactory(final int i10) {
        return new DeferredOutputStreamFactory() { // from class: org.jf.dexlib2.writer.io.MemoryDeferredOutputStream.1
            @Override // org.jf.dexlib2.writer.io.DeferredOutputStreamFactory
            public DeferredOutputStream makeDeferredOutputStream() {
                return new MemoryDeferredOutputStream(i10);
            }
        };
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int iRemaining = remaining();
        int i12 = 0;
        while (true) {
            int i13 = i11 - i12;
            if (i13 <= 0) {
                return;
            }
            int iMin = Math.min(iRemaining, i13);
            System.arraycopy(bArr, i10 + i12, this.currentBuffer, this.currentPosition, iMin);
            i12 += iMin;
            this.currentPosition += iMin;
            iRemaining = remaining();
            if (iRemaining == 0) {
                this.buffers.add(this.currentBuffer);
                byte[] bArr2 = new byte[this.currentBuffer.length];
                this.currentBuffer = bArr2;
                this.currentPosition = 0;
                iRemaining = bArr2.length;
            }
        }
    }
}
