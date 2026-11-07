package androidx.camera.core.internal;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i6) throws EOFException {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) i6);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) throws EOFException {
        int i8;
        bArr.getClass();
        if (i6 < 0 || i6 > bArr.length || i7 < 0 || (i8 = i6 + i7) > bArr.length || i8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i7 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() >= i7) {
            this.mByteBuffer.put(bArr, i6, i7);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
