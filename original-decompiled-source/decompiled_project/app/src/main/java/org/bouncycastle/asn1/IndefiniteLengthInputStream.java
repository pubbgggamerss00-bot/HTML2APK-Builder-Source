package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    public IndefiniteLengthInputStream(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int i11 = inputStream.read();
        this._b2 = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        checkForEof();
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (checkForEof()) {
            return -1;
        }
        int i10 = this._in.read();
        if (i10 < 0) {
            throw new EOFException();
        }
        int i11 = this._b1;
        this._b1 = this._b2;
        this._b2 = i10;
        return i11;
    }

    public void setEofOn00(boolean z10) {
        this._eofOn00 = z10;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this._eofOn00 || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this._eofReached) {
            return -1;
        }
        int i12 = this._in.read(bArr, i10 + 2, i11 - 2);
        if (i12 < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this._b1;
        bArr[i10 + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int i13 = this._in.read();
        this._b2 = i13;
        if (i13 >= 0) {
            return i12 + 2;
        }
        throw new EOFException();
    }
}
