package com.android.apksig.internal.util;

import ad.b;
import com.android.apksig.util.DataSink;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ByteBufferSink implements DataSink {
    private final ByteBuffer mBuffer;

    public ByteBufferSink(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.mBuffer.put(bArr, i10, i11);
        } catch (BufferOverflowException e10) {
            throw new IOException(b.b(i11, "Insufficient space in output buffer for ", " bytes"), e10);
        }
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            this.mBuffer.put(byteBuffer);
        } catch (BufferOverflowException e10) {
            throw new IOException(b.b(iRemaining, "Insufficient space in output buffer for ", " bytes"), e10);
        }
    }
}
