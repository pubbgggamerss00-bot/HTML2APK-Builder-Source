package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    public ByteOrderedDataInputStream(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i6) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i6);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int read() {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i6 = this.mPosition + 1;
        this.mPosition = i6;
        if (i6 > this.mLength) {
            throw new EOFException();
        }
        int i7 = this.mDataInputStream.read();
        if (i7 >= 0) {
            return (byte) i7;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.mPosition + i7;
        this.mPosition = i8;
        if (i8 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, i6, i7) != i7) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i6 = this.mPosition + 4;
        this.mPosition = i6;
        if (i6 > this.mLength) {
            throw new EOFException();
        }
        int i7 = this.mDataInputStream.read();
        int i8 = this.mDataInputStream.read();
        int i9 = this.mDataInputStream.read();
        int i10 = this.mDataInputStream.read();
        if ((i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i6 = this.mPosition + 8;
        this.mPosition = i6;
        if (i6 > this.mLength) {
            throw new EOFException();
        }
        int i7 = this.mDataInputStream.read();
        int i8 = this.mDataInputStream.read();
        int i9 = this.mDataInputStream.read();
        int i10 = this.mDataInputStream.read();
        int i11 = this.mDataInputStream.read();
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        int i14 = this.mDataInputStream.read();
        if ((i7 | i8 | i9 | i10 | i11 | i12 | i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i14 << 56) + (i13 << 48) + (i12 << 40) + (i11 << 32) + (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i7 << 56) + (i8 << 48) + (i9 << 40) + (i10 << 32) + (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i6 = this.mPosition + 2;
        this.mPosition = i6;
        if (i6 > this.mLength) {
            throw new EOFException();
        }
        int i7 = this.mDataInputStream.read();
        int i8 = this.mDataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((i8 << 8) + i7);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((i7 << 8) + i8);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return readInt() & 4294967295L;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i6 = this.mPosition + 2;
        this.mPosition = i6;
        if (i6 > this.mLength) {
            throw new EOFException();
        }
        int i7 = this.mDataInputStream.read();
        int i8 = this.mDataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i8 << 8) + i7;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public void seek(long j6) throws IOException {
        int i6 = this.mPosition;
        if (i6 > j6) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j6 -= i6;
        }
        int i7 = (int) j6;
        if (skipBytes(i7) != i7) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i6) {
        int iMin = Math.min(i6, this.mLength - this.mPosition);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.mDataInputStream.skipBytes(iMin - iSkipBytes);
        }
        this.mPosition += iSkipBytes;
        return iSkipBytes;
    }

    public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.mLength = iAvailable;
        this.mPosition = 0;
        dataInputStream.mark(iAvailable);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.mDataInputStream.read(bArr, i6, i7);
        this.mPosition += i8;
        return i8;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length <= this.mLength) {
            if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public ByteOrderedDataInputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
