package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import h1.y;
import java.io.IOException;
import java.nio.ByteBuffer;
import m0.r;

/* loaded from: classes.dex */
public class ByteBufferDataSource implements DataSource {
    private final ByteBuffer mBuffer;
    private final int mSize;

    public ByteBufferDataSource(ByteBuffer byteBuffer) {
        this(byteBuffer, true);
    }

    private void checkChunkValid(long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException(r.a("offset: ", j10));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException(r.a("size: ", j11));
        }
        int i10 = this.mSize;
        if (j10 > i10) {
            throw new IndexOutOfBoundsException(x0.a.a(y.a("offset (", ") > source size (", j10), this.mSize, ")"));
        }
        long j12 = j10 + j11;
        if (j12 < j10) {
            throw new IndexOutOfBoundsException(com.android.apksig.internal.apk.a.a(j11, ") overflow", y.a("offset (", ") + size (", j10)));
        }
        if (j12 <= i10) {
            return;
        }
        StringBuilder sbA = y.a("offset (", ") + size (", j10);
        sbA.append(j11);
        sbA.append(") > source size (");
        throw new IndexOutOfBoundsException(x0.a.a(sbA, this.mSize, ")"));
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long j10, int i10, ByteBuffer byteBuffer) {
        byteBuffer.put(getByteBuffer(j10, i10));
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long j10, long j11, DataSink dataSink) throws IOException {
        if (j11 >= 0 && j11 <= this.mSize) {
            dataSink.consume(getByteBuffer(j10, (int) j11));
        } else {
            StringBuilder sbA = y.a("size: ", ", source size: ", j11);
            sbA.append(this.mSize);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long j10, int i10) {
        ByteBuffer byteBufferSlice;
        checkChunkValid(j10, i10);
        int i11 = (int) j10;
        int i12 = i10 + i11;
        synchronized (this.mBuffer) {
            this.mBuffer.position(0);
            this.mBuffer.limit(i12);
            this.mBuffer.position(i11);
            byteBufferSlice = this.mBuffer.slice();
        }
        return byteBufferSlice;
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return this.mSize;
    }

    private ByteBufferDataSource(ByteBuffer byteBuffer, boolean z10) {
        this.mBuffer = z10 ? byteBuffer.slice() : byteBuffer;
        this.mSize = byteBuffer.remaining();
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBufferDataSource slice(long j10, long j11) {
        if (j10 == 0 && j11 == this.mSize) {
            return this;
        }
        if (j11 >= 0 && j11 <= this.mSize) {
            return new ByteBufferDataSource(getByteBuffer(j10, (int) j11), false);
        }
        StringBuilder sbA = y.a("size: ", ", source size: ", j11);
        sbA.append(this.mSize);
        throw new IndexOutOfBoundsException(sbA.toString());
    }
}
