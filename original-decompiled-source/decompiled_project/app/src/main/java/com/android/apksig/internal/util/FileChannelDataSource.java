package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import h1.y;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import m0.r;

/* loaded from: classes.dex */
public class FileChannelDataSource implements DataSource {
    private static final int MAX_READ_CHUNK_SIZE = 1048576;
    private final FileChannel mChannel;
    private final long mOffset;
    private final long mSize;

    public FileChannelDataSource(FileChannel fileChannel) {
        this.mChannel = fileChannel;
        this.mOffset = 0L;
        this.mSize = -1L;
    }

    private static void checkChunkValid(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException(r.a("offset: ", j10));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException(r.a("size: ", j11));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException(com.android.apksig.internal.apk.a.a(j12, ")", y.a("offset (", ") > source size (", j10)));
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException(com.android.apksig.internal.apk.a.a(j11, ") overflow", y.a("offset (", ") + size (", j10)));
        }
        if (j13 <= j12) {
            return;
        }
        StringBuilder sbA = y.a("offset (", ") + size (", j10);
        sbA.append(j11);
        sbA.append(") > source size (");
        sbA.append(j12);
        sbA.append(")");
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j10, int i10, ByteBuffer byteBuffer) throws IOException {
        int i11;
        checkChunkValid(j10, i10, size());
        if (i10 == 0) {
            return;
        }
        if (i10 > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j11 = this.mOffset + j10;
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i10);
            while (i10 > 0) {
                synchronized (this.mChannel) {
                    this.mChannel.position(j11);
                    i11 = this.mChannel.read(byteBuffer);
                }
                j11 += i11;
                i10 -= i11;
            }
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j10, long j11, DataSink dataSink) throws IOException {
        checkChunkValid(j10, j11, size());
        if (j11 == 0) {
            return;
        }
        long j12 = this.mOffset + j10;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) Math.min(j11, 1048576L));
        long j13 = j12;
        long j14 = j11;
        while (j14 > 0) {
            int iMin = (int) Math.min(j14, byteBufferAllocateDirect.capacity());
            byteBufferAllocateDirect.limit(iMin);
            synchronized (this.mChannel) {
                try {
                    this.mChannel.position(j13);
                    int i10 = iMin;
                    while (i10 > 0) {
                        int i11 = this.mChannel.read(byteBufferAllocateDirect);
                        if (i11 < 0) {
                            throw new IOException("Unexpected EOF encountered");
                        }
                        i10 -= i11;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            byteBufferAllocateDirect.flip();
            dataSink.consume(byteBufferAllocateDirect);
            byteBufferAllocateDirect.clear();
            long j15 = iMin;
            j13 += j15;
            j14 -= j15;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j10, int i10) throws IOException {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(j2.y.a(i10, "size: "));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        copyTo(j10, i10, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        long j10 = this.mSize;
        if (j10 != -1) {
            return j10;
        }
        try {
            return this.mChannel.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public FileChannelDataSource slice(long j10, long j11) {
        long size = size();
        checkChunkValid(j10, j11, size);
        return (j10 == 0 && j11 == size) ? this : new FileChannelDataSource(this.mChannel, this.mOffset + j10, j11);
    }

    public FileChannelDataSource(FileChannel fileChannel, long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException(r.a("offset: ", j11));
        }
        if (j11 >= 0) {
            this.mChannel = fileChannel;
            this.mOffset = j10;
            this.mSize = j11;
            return;
        }
        throw new IndexOutOfBoundsException(r.a("size: ", j11));
    }
}
