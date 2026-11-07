package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import j2.y;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import m0.r;
import p.i0;

/* loaded from: classes.dex */
public class RandomAccessFileDataSink implements DataSink {
    private final RandomAccessFile mFile;
    private final FileChannel mFileChannel;
    private long mPosition;

    public RandomAccessFileDataSink(RandomAccessFile randomAccessFile) {
        this(randomAccessFile, 0L);
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(y.a(i10, "offset: "));
        }
        if (i10 > bArr.length) {
            StringBuilder sbB = i0.b(i10, "offset: ", ", buf.length: ");
            sbB.append(bArr.length);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i11 == 0) {
            return;
        }
        synchronized (this.mFile) {
            this.mFile.seek(this.mPosition);
            this.mFile.write(bArr, i10, i11);
            this.mPosition += i11;
        }
    }

    public RandomAccessFile getFile() {
        return this.mFile;
    }

    public RandomAccessFileDataSink(RandomAccessFile randomAccessFile, long j10) {
        if (randomAccessFile == null) {
            throw new NullPointerException("file == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(r.a("startPosition: ", j10));
        }
        this.mFile = randomAccessFile;
        this.mFileChannel = randomAccessFile.getChannel();
        this.mPosition = j10;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        synchronized (this.mFile) {
            try {
                this.mFile.seek(this.mPosition);
                while (byteBuffer.hasRemaining()) {
                    this.mFileChannel.write(byteBuffer);
                }
                this.mPosition += iRemaining;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
