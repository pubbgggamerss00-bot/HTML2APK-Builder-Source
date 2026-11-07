package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class BERBitString extends ASN1BitString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(byte b10, int i10) {
        super(b10, i10);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    public static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].contents;
        }
        int i10 = length - 1;
        int length2 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr = aSN1BitStringArr[i11].contents;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i10].contents;
        byte b10 = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b10;
        int i12 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.contents;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i12, length3);
            i12 += length3;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        ASN1OutputStream aSN1OutputStream2;
        if (!encodeConstructed()) {
            byte[] bArr = this.contents;
            DLBitString.encode(aSN1OutputStream, z10, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z10, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr == null) {
            byte[] bArr2 = this.contents;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length = bArr2.length;
                int i10 = length - 1;
                int i11 = this.segmentLimit - 1;
                while (i10 > i11) {
                    ASN1OutputStream aSN1OutputStream3 = aSN1OutputStream;
                    DLBitString.encode(aSN1OutputStream3, true, (byte) 0, this.contents, length - i10, i11);
                    i10 -= i11;
                    aSN1OutputStream = aSN1OutputStream3;
                }
                aSN1OutputStream2 = aSN1OutputStream;
                DLBitString.encode(aSN1OutputStream2, true, b10, this.contents, length - i10, i10);
            }
            aSN1OutputStream2.write(0);
            aSN1OutputStream2.write(0);
        }
        aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        aSN1OutputStream2 = aSN1OutputStream;
        aSN1OutputStream2.write(0);
        aSN1OutputStream2.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) throws IOException {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z10, this.contents.length);
        }
        int iEncodedLength = z10 ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return iEncodedLength;
            }
            int length = bArr.length - 2;
            int i10 = this.segmentLimit;
            int i11 = length / (i10 - 1);
            return DLBitString.encodedLength(true, this.contents.length - ((this.segmentLimit - 1) * i11)) + (DLBitString.encodedLength(true, i10) * i11) + iEncodedLength;
        }
        int i12 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i12 >= aSN1BitStringArr.length) {
                return iEncodedLength;
            }
            iEncodedLength += aSN1BitStringArr[i12].encodedLength(true);
            i12++;
        }
    }

    public BERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        this(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(byte[] bArr, int i10) {
        this(bArr, i10, 1000);
    }

    public BERBitString(byte[] bArr, int i10, int i11) {
        super(bArr, i10);
        this.elements = null;
        this.segmentLimit = i11;
    }

    public BERBitString(byte[] bArr, boolean z10) {
        super(bArr, z10);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, 1000);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i10) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i10;
    }
}
