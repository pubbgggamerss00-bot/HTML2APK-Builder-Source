package org.bouncycastle.asn1;

import j2.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z10) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z10);
        }
    }

    public ASN1Encodable implParseObject(int i10) throws IOException {
        set00Check(false);
        int tagNumber = ASN1InputStream.readTagNumber(this._in, i10);
        int length = ASN1InputStream.readLength(this._in, this._limit, tagNumber == 3 || tagNumber == 4 || tagNumber == 16 || tagNumber == 17 || tagNumber == 8);
        if (length < 0) {
            if ((i10 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
            int i11 = i10 & 192;
            return i11 != 0 ? new BERTaggedObjectParser(i11, tagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(tagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, length, this._limit);
        if ((i10 & BERTags.FLAGS) == 0) {
            return parseImplicitPrimitive(tagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i12 = i10 & 192;
        if (i12 != 0) {
            return new DLTaggedObjectParser(i12, tagNumber, (i10 & 32) != 0, aSN1StreamParser2);
        }
        return aSN1StreamParser2.parseImplicitConstructedDL(tagNumber);
    }

    public ASN1Primitive loadTaggedDL(int i10, int i11, boolean z10) throws IOException {
        return !z10 ? ASN1TaggedObject.createPrimitive(i10, i11, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i10, i11, readVector());
    }

    public ASN1Primitive loadTaggedIL(int i10, int i11) throws IOException {
        return ASN1TaggedObject.createConstructedIL(i10, i11, readVector());
    }

    public ASN1Encodable parseImplicitConstructedDL(int i10) throws IOException {
        if (i10 == 3) {
            return new BERBitStringParser(this);
        }
        if (i10 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i10 == 8) {
            return new DERExternalParser(this);
        }
        if (i10 == 16) {
            return new DLSequenceParser(this);
        }
        if (i10 == 17) {
            return new DLSetParser(this);
        }
        throw new ASN1Exception("unknown DL object encountered: 0x" + Integer.toHexString(i10));
    }

    public ASN1Encodable parseImplicitConstructedIL(int i10) throws IOException {
        if (i10 == 3) {
            return new BERBitStringParser(this);
        }
        if (i10 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i10 == 8) {
            return new DERExternalParser(this);
        }
        if (i10 == 16) {
            return new BERSequenceParser(this);
        }
        if (i10 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    public ASN1Encodable parseImplicitPrimitive(int i10) throws IOException {
        return parseImplicitPrimitive(i10, (DefiniteLengthInputStream) this._in);
    }

    public ASN1Encodable parseObject(int i10) throws IOException {
        if (i10 < 0 || i10 > 30) {
            throw new IllegalArgumentException(y.a(i10, "invalid universal tag number: "));
        }
        int i11 = this._in.read();
        if (i11 < 0) {
            return null;
        }
        if ((i11 & (-33)) == i10) {
            return implParseObject(i11);
        }
        throw new IOException(y.a(i11, "unexpected identifier encountered: "));
    }

    public ASN1TaggedObjectParser parseTaggedObject() throws IOException {
        int i10 = this._in.read();
        if (i10 < 0) {
            return null;
        }
        if ((i10 & 192) != 0) {
            return (ASN1TaggedObjectParser) implParseObject(i10);
        }
        throw new ASN1Exception("no tagged object found");
    }

    public ASN1Encodable readObject() throws IOException {
        int i10 = this._in.read();
        if (i10 < 0) {
            return null;
        }
        return implParseObject(i10);
    }

    public ASN1EncodableVector readVector() throws IOException {
        int i10 = this._in.read();
        if (i10 < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable aSN1EncodableImplParseObject = implParseObject(i10);
            aSN1EncodableVector.add(aSN1EncodableImplParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) aSN1EncodableImplParseObject).getLoadedObject() : aSN1EncodableImplParseObject.toASN1Primitive());
            i10 = this._in.read();
        } while (i10 >= 0);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i10) {
        this(inputStream, i10, new byte[11][]);
    }

    public ASN1Encodable parseImplicitPrimitive(int i10, DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        if (i10 == 3) {
            return new DLBitStringParser(definiteLengthInputStream);
        }
        if (i10 == 4) {
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        if (i10 == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i10 == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i10 == 17) {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return ASN1InputStream.createPrimitiveDERObject(i10, definiteLengthInputStream, this.tmpBuffers);
        } catch (IllegalArgumentException e10) {
            throw new ASN1Exception("corrupted stream detected", e10);
        }
    }

    public ASN1StreamParser(InputStream inputStream, int i10, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i10;
        this.tmpBuffers = bArr;
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
