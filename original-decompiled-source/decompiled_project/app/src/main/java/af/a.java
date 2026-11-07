package af;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public abstract class a implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public ByteOrder f523a = ByteOrder.BIG_ENDIAN;

    /* renamed from: b, reason: collision with root package name */
    public long f524b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f525c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f526d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f527e = false;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f528f = new byte[8];

    public final void a() throws IOException {
        if (this.f527e) {
            throw new IOException("stream is closed");
        }
    }

    public void b(long j10) throws IOException {
        a();
        if (j10 > this.f524b) {
            throw new IndexOutOfBoundsException("Trying to flush outside of current position");
        }
        if (j10 < this.f525c) {
            throw new IndexOutOfBoundsException("Trying to flush within already flushed portion");
        }
        this.f525c = j10;
    }

    public final void c(long j10) throws IOException {
        a();
        if (j10 < this.f525c) {
            throw new IllegalArgumentException("trying to seek before flushed pos");
        }
        this.f526d = 0;
        this.f524b = j10;
    }

    public abstract void close() throws IOException;

    public final void finalize() throws Throwable {
        if (this.f527e) {
            return;
        }
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract int read() throws IOException;

    public abstract int read(byte[] bArr, int i10, int i11) throws IOException;

    @Override // java.io.DataInput
    public final boolean readBoolean() throws IOException {
        int i10 = read();
        if (i10 >= 0) {
            return i10 != 0;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i10 = read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final char readChar() throws IOException {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i11 > 0) {
            int i12 = read(bArr, i10, i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i10 += i12;
            i11 -= i12;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i10;
        byte b10;
        byte[] bArr = this.f528f;
        if (read(bArr, 0, 4) < 0) {
            throw new EOFException();
        }
        if (this.f523a == ByteOrder.BIG_ENDIAN) {
            i10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
            b10 = bArr[3];
        } else {
            i10 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
            b10 = bArr[0];
        }
        return i10 | (b10 & 255);
    }

    @Override // java.io.DataInput
    public final String readLine() throws IOException {
        StringBuilder sb = new StringBuilder(80);
        boolean z10 = true;
        while (true) {
            int i10 = read();
            if (i10 != -1) {
                if (i10 == 10) {
                    break;
                }
                if (i10 == 13) {
                    int i11 = read();
                    if (i11 != 10 && i11 != -1) {
                        a();
                        c(this.f524b - 1);
                    }
                } else {
                    sb.append((char) i10);
                    z10 = false;
                }
            } else {
                break;
            }
        }
        z10 = false;
        if (z10) {
            return null;
        }
        return sb.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte[] bArr = this.f528f;
        if (read(bArr, 0, 8) < 0) {
            throw new EOFException();
        }
        if (this.f523a == ByteOrder.BIG_ENDIAN) {
            return (((((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) & BodyPartID.bodyIdMax) << 32) | (((bArr[7] & 255) | ((bArr[6] & 255) << 8) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16)) & BodyPartID.bodyIdMax);
        }
        return (((bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8)) & BodyPartID.bodyIdMax) | ((((bArr[4] & 255) | (((bArr[5] & 255) << 8) | (((bArr[7] & 255) << 24) | ((bArr[6] & 255) << 16)))) & BodyPartID.bodyIdMax) << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i10;
        byte b10;
        byte[] bArr = this.f528f;
        if (read(bArr, 0, 2) < 0) {
            throw new EOFException();
        }
        if (this.f523a == ByteOrder.BIG_ENDIAN) {
            i10 = bArr[0] << 8;
            b10 = bArr[1];
        } else {
            i10 = bArr[1] << 8;
            b10 = bArr[0];
        }
        return (short) (i10 | (b10 & 255));
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        ByteOrder byteOrder = this.f523a;
        this.f523a = ByteOrder.BIG_ENDIAN;
        int unsignedShort = readUnsignedShort();
        char[] cArr = new char[unsignedShort];
        readFully(new byte[unsignedShort], 0, unsignedShort);
        this.f523a = byteOrder;
        return new DataInputStream(new ByteArrayInputStream(this.f528f)).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i10 = read();
        if (i10 >= 0) {
            return i10;
        }
        throw new EOFException("EOF reached");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return readShort() & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) throws IOException {
        long j10 = i10;
        a();
        c(this.f524b + j10);
        return (int) j10;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }
}
