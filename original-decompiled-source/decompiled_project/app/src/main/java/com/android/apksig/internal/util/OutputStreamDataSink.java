package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class OutputStreamDataSink implements DataSink {
    private static final int MAX_READ_CHUNK_SIZE = 65536;
    private final OutputStream mOut;

    public OutputStreamDataSink(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException("out == null");
        }
        this.mOut = outputStream;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] bArr, int i10, int i11) throws IOException {
        this.mOut.write(bArr, i10, i11);
    }

    public OutputStream getOutputStream() {
        return this.mOut;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.hasArray()) {
                this.mOut.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            int iMin = Math.min(byteBuffer.remaining(), 65536);
            byte[] bArr = new byte[iMin];
            while (byteBuffer.hasRemaining()) {
                int iMin2 = Math.min(byteBuffer.remaining(), iMin);
                byteBuffer.get(bArr, 0, iMin2);
                this.mOut.write(bArr, 0, iMin2);
            }
        }
    }
}
