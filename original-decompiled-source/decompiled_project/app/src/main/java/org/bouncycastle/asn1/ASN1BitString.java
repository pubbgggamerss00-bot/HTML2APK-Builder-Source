package org.bouncycastle.asn1;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import j2.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.jf.dexlib2.analysis.RegisterType;
import p.i0;

/* loaded from: classes2.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    public ASN1BitString(byte b10, int i10) {
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = new byte[]{(byte) i10, b10};
    }

    public static ASN1BitString createPrimitive(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i10 = bArr[0] & 255;
        if (i10 > 0) {
            if (i10 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b10 = bArr[length - 1];
            if (b10 != ((byte) ((255 << i10) & b10))) {
                return new DLBitString(bArr, false);
            }
        }
        return new DERBitString(bArr, false);
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BitString) {
                return (ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException(b.a(e10, new StringBuilder("failed to construct BIT STRING from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(i0.a(obj, "illegal object in getInstance: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i10 = bArr[0] & 255;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = bArrCopyOfRange.length - 1;
        bArrCopyOfRange[length] = (byte) (((byte) (255 << i10)) & bArrCopyOfRange[length]);
        return bArrCopyOfRange;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i10 = this.contents[0] & 255;
        if (i10 == 0) {
            return getBitStream();
        }
        throw new IOException(y.a(i10, "expected octet-aligned bitstring, but found padBits: "));
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & 255;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != encoded.length; i10++) {
                byte b10 = encoded[i10];
                char[] cArr = table;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & RegisterType.DOUBLE_HI]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new ASN1ParsingException(b.a(e10, new StringBuilder("Internal error encoding BitString: ")), e10);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE) ^ ((byte) ((255 << i10) & bArr[length]));
    }

    public int intValue() {
        int iMin = Math.min(5, this.contents.length - 1);
        int i10 = 0;
        for (int i11 = 1; i11 < iMin; i11++) {
            i10 |= (255 & this.contents[i11]) << ((i11 - 1) * 8);
        }
        if (1 > iMin || iMin >= 5) {
            return i10;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[iMin] & (255 << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8)) | i10;
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    public ASN1BitString(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = Arrays.prepend(bArr, (byte) i10);
    }

    public static byte[] getBytes(int i10) {
        if (i10 == 0) {
            return new byte[0];
        }
        int i11 = 4;
        for (int i12 = 3; i12 >= 1 && ((255 << (i12 * 8)) & i10) == 0; i12--) {
            i11--;
        }
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) ((i10 >> (i13 * 8)) & 255);
        }
        return bArr;
    }

    public static int getPadBits(int i10) {
        int i11;
        int i12 = 3;
        while (true) {
            if (i12 < 0) {
                i11 = 0;
                break;
            }
            if (i12 != 0) {
                int i13 = i10 >> (i12 * 8);
                if (i13 != 0) {
                    i11 = i13 & 255;
                    break;
                }
                i12--;
            } else {
                if (i10 != 0) {
                    i11 = i10 & 255;
                    break;
                }
                i12--;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        int i14 = 1;
        while (true) {
            i11 <<= 1;
            if ((i11 & 255) == 0) {
                return 8 - i14;
            }
            i14++;
        }
    }

    public ASN1BitString(byte[] bArr, boolean z10) {
        if (z10) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i10 = bArr[0] & 255;
            if (i10 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i10 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.contents = bArr;
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return (ASN1BitString) TYPE.getContextInstance(aSN1TaggedObject, z10);
    }
}
