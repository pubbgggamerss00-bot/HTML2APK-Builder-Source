package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    final OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    public void writeByte(int i6) throws IOException {
        this.mOutputStream.write(i6);
    }

    public void writeInt(int i6) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(i6 & 255);
            this.mOutputStream.write((i6 >>> 8) & 255);
            this.mOutputStream.write((i6 >>> 16) & 255);
            this.mOutputStream.write((i6 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((i6 >>> 24) & 255);
            this.mOutputStream.write((i6 >>> 16) & 255);
            this.mOutputStream.write((i6 >>> 8) & 255);
            this.mOutputStream.write(i6 & 255);
        }
    }

    public void writeShort(short s) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(s & 255);
            this.mOutputStream.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((s >>> 8) & 255);
            this.mOutputStream.write(s & 255);
        }
    }

    public void writeUnsignedInt(long j6) throws IOException {
        writeInt((int) j6);
    }

    public void writeUnsignedShort(int i6) throws IOException {
        writeShort((short) i6);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i6, int i7) throws IOException {
        this.mOutputStream.write(bArr, i6, i7);
    }
}
