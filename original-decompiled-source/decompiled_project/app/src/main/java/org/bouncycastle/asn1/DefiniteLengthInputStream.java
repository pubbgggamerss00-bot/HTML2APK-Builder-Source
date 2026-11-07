package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes2.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            setParentEofDetect(true);
        }
        this._originalLength = i10;
        this._remaining = i10;
    }

    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int i10 = this._in.read();
        if (i10 >= 0) {
            int i11 = this._remaining - 1;
            this._remaining = i11;
            if (i11 == 0) {
                setParentEofDetect(true);
            }
            return i10;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    public void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i10 = this._remaining;
        if (i10 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i10 == 0) {
            return;
        }
        int limit = getLimit();
        int i11 = this._remaining;
        if (i11 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        int fully = i11 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    public byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i10 = this._remaining;
        if (i10 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        byte[] bArr = new byte[i10];
        int fully = i10 - Streams.readFully(this._in, bArr, 0, i10);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this._remaining;
        if (i12 == 0) {
            return -1;
        }
        int i13 = this._in.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            int i14 = this._remaining - i13;
            this._remaining = i14;
            if (i14 == 0) {
                setParentEofDetect(true);
            }
            return i13;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }
}
