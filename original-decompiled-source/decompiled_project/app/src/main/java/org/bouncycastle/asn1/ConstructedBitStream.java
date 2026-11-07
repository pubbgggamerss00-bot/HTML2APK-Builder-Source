package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class ConstructedBitStream extends InputStream {
    private ASN1BitStringParser _currentParser;
    private InputStream _currentStream;
    private final boolean _octetAligned;
    private final ASN1StreamParser _parser;
    private boolean _first = true;
    private int _padBits = 0;

    public ConstructedBitStream(ASN1StreamParser aSN1StreamParser, boolean z10) {
        this._parser = aSN1StreamParser;
        this._octetAligned = z10;
    }

    private ASN1BitStringParser getNextParser() throws IOException {
        ASN1Encodable object = this._parser.readObject();
        if (object == null) {
            if (!this._octetAligned || this._padBits == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this._padBits);
        }
        if (object instanceof ASN1BitStringParser) {
            if (this._padBits == 0) {
                return (ASN1BitStringParser) object;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + object.getClass());
    }

    public int getPadBits() {
        return this._padBits;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int i10 = this._currentStream.read();
            if (i10 >= 0) {
                return i10;
            }
            this._padBits = this._currentParser.getPadBits();
            ASN1BitStringParser nextParser2 = getNextParser();
            this._currentParser = nextParser2;
            if (nextParser2 == null) {
                this._currentStream = null;
                return -1;
            }
            this._currentStream = nextParser2.getBitStream();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        if (this._currentStream == null) {
            if (!this._first) {
                return -1;
            }
            ASN1BitStringParser nextParser = getNextParser();
            this._currentParser = nextParser;
            if (nextParser == null) {
                return -1;
            }
            this._first = false;
            this._currentStream = nextParser.getBitStream();
        }
        while (true) {
            int i13 = this._currentStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                this._padBits = this._currentParser.getPadBits();
                ASN1BitStringParser nextParser2 = getNextParser();
                this._currentParser = nextParser2;
                if (nextParser2 == null) {
                    this._currentStream = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this._currentStream = nextParser2.getBitStream();
            }
        }
    }
}
