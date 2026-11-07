package org.jf.dexlib2.writer.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class MemoryDataStore implements DexDataStore {
    private byte[] buf;
    private int size;

    public MemoryDataStore() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void growBufferIfNeeded(int i10) {
        if (i10 > this.size) {
            byte[] bArr = this.buf;
            if (i10 > bArr.length) {
                int newBufferSize = getNewBufferSize(bArr.length, i10);
                if (newBufferSize < i10) {
                    throw new IndexOutOfBoundsException();
                }
                this.buf = Arrays.copyOf(this.buf, newBufferSize);
            }
            this.size = i10;
        }
    }

    @Override // org.jf.dexlib2.writer.io.DexDataStore
    public void close() throws IOException {
    }

    public byte[] getBuffer() {
        return this.buf;
    }

    public byte[] getData() {
        return Arrays.copyOf(this.buf, this.size);
    }

    public int getNewBufferSize(int i10, int i11) {
        return Math.max(i11 + (i11 >> 2), i10 + PKIFailureInfo.transactionIdInUse);
    }

    public int getSize() {
        return this.size;
    }

    @Override // org.jf.dexlib2.writer.io.DexDataStore
    public OutputStream outputAt(int i10) {
        if (i10 >= 0) {
            return new OutputStream(i10) { // from class: org.jf.dexlib2.writer.io.MemoryDataStore.1
                private int position;
                final /* synthetic */ int val$offset;

                {
                    this.val$offset = i10;
                    this.position = i10;
                }

                @Override // java.io.OutputStream
                public void write(int i11) throws IOException {
                    MemoryDataStore.this.growBufferIfNeeded(this.position + 1);
                    byte[] bArr = MemoryDataStore.this.buf;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    bArr[i12] = (byte) i11;
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr) throws IOException {
                    MemoryDataStore.this.growBufferIfNeeded(this.position + bArr.length);
                    System.arraycopy(bArr, 0, MemoryDataStore.this.buf, this.position, bArr.length);
                    this.position += bArr.length;
                }

                @Override // java.io.OutputStream
                public void write(byte[] bArr, int i11, int i12) throws IOException {
                    MemoryDataStore.this.growBufferIfNeeded(this.position + i12);
                    System.arraycopy(bArr, i11, MemoryDataStore.this.buf, this.position, i12);
                    this.position += i12;
                }
            };
        }
        throw new IllegalArgumentException();
    }

    @Override // org.jf.dexlib2.writer.io.DexDataStore
    public InputStream readAt(int i10) {
        if (i10 >= 0) {
            return new InputStream(i10) { // from class: org.jf.dexlib2.writer.io.MemoryDataStore.2
                private int mark;
                private int position;
                final /* synthetic */ int val$offset;

                {
                    this.val$offset = i10;
                    this.position = i10;
                    this.mark = i10;
                }

                @Override // java.io.InputStream
                public int available() throws IOException {
                    return Math.max(0, MemoryDataStore.this.size - this.position);
                }

                @Override // java.io.InputStream
                public void mark(int i11) {
                    this.mark = this.position;
                }

                @Override // java.io.InputStream
                public boolean markSupported() {
                    return true;
                }

                @Override // java.io.InputStream
                public int read() throws IOException {
                    if (this.position >= MemoryDataStore.this.size) {
                        return -1;
                    }
                    byte[] bArr = MemoryDataStore.this.buf;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    return bArr[i11];
                }

                @Override // java.io.InputStream
                public void reset() throws IOException {
                    this.position = this.mark;
                }

                @Override // java.io.InputStream
                public long skip(long j10) throws IOException {
                    int iMax = (int) Math.max(0L, Math.min(j10, MemoryDataStore.this.size - this.position));
                    this.position += iMax;
                    return iMax;
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr) throws IOException {
                    int iMin = Math.min(bArr.length, MemoryDataStore.this.size - this.position);
                    if (iMin <= 0) {
                        return this.position >= MemoryDataStore.this.size ? -1 : 0;
                    }
                    System.arraycopy(MemoryDataStore.this.buf, this.position, bArr, 0, iMin);
                    this.position += iMin;
                    return iMin;
                }

                @Override // java.io.InputStream
                public int read(byte[] bArr, int i11, int i12) throws IOException {
                    int iMin = Math.min(i12, MemoryDataStore.this.size - this.position);
                    if (iMin <= 0) {
                        return this.position >= MemoryDataStore.this.size ? -1 : 0;
                    }
                    System.arraycopy(MemoryDataStore.this.buf, this.position, bArr, i11, iMin);
                    this.position += iMin;
                    return iMin;
                }
            };
        }
        throw new IllegalArgumentException();
    }

    public MemoryDataStore(int i10) {
        this.size = 0;
        this.buf = new byte[i10];
    }
}
