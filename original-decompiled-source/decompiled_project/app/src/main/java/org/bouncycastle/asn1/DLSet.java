package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class DLSet extends ASN1Set {
    private int contentsLength;

    public DLSet() {
        this.contentsLength = -1;
    }

    private int getContentsLength() throws IOException {
        if (this.contentsLength < 0) {
            int length = this.elements.length;
            int iEncodedLength = 0;
            for (int i10 = 0; i10 < length; i10++) {
                iEncodedLength += this.elements[i10].toASN1Primitive().toDLObject().encodedLength(true);
            }
            this.contentsLength = iEncodedLength;
        }
        return this.contentsLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.writeIdentifier(z10, 49);
        DLOutputStream dLSubStream = aSN1OutputStream.getDLSubStream();
        int length = this.elements.length;
        int i10 = 0;
        if (this.contentsLength >= 0 || length > 16) {
            aSN1OutputStream.writeDL(getContentsLength());
            while (i10 < length) {
                dLSubStream.writePrimitive(this.elements[i10].toASN1Primitive(), true);
                i10++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iEncodedLength = 0;
        for (int i11 = 0; i11 < length; i11++) {
            ASN1Primitive dLObject = this.elements[i11].toASN1Primitive().toDLObject();
            aSN1PrimitiveArr[i11] = dLObject;
            iEncodedLength += dLObject.encodedLength(true);
        }
        this.contentsLength = iEncodedLength;
        aSN1OutputStream.writeDL(iEncodedLength);
        while (i10 < length) {
            dLSubStream.writePrimitive(aSN1PrimitiveArr[i10], true);
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) throws IOException {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, getContentsLength());
    }

    @Override // org.bouncycastle.asn1.ASN1Set, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.contentsLength = -1;
    }

    public DLSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
        this.contentsLength = -1;
    }

    public DLSet(boolean z10, ASN1Encodable[] aSN1EncodableArr) {
        super(z10, aSN1EncodableArr);
        this.contentsLength = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
        this.contentsLength = -1;
    }

    public DLSet(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        super(aSN1EncodableArr, aSN1EncodableArr2);
        this.contentsLength = -1;
    }
}
