package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(byte b10, int i10) {
        super(b10, i10);
    }

    public static DERBitString convert(ASN1BitString aSN1BitString) {
        return (DERBitString) aSN1BitString.toDERObject();
    }

    public static DERBitString fromOctetString(ASN1OctetString aSN1OctetString) {
        return new DERBitString(aSN1OctetString.getOctets(), true);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        byte[] bArr = this.contents;
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b10 = bArr[length];
        byte b11 = (byte) ((255 << i10) & b10);
        if (b10 == b11) {
            aSN1OutputStream.writeEncodingDL(z10, 3, bArr);
        } else {
            aSN1OutputStream.writeEncodingDL(z10, 3, bArr, 0, length, b11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERBitString(int i10) {
        super(ASN1BitString.getBytes(i10), ASN1BitString.getPadBits(i10));
    }

    public DERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public DERBitString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }
}
