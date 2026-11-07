package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b10, int i10) {
        super(b10, i10);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z10, 3, this.contents);
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
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLBitString(int i10) {
        super(ASN1BitString.getBytes(i10), ASN1BitString.getPadBits(i10));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z10, byte b10, byte[] bArr, int i10, int i11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z10, 3, b10, bArr, i10, i11);
    }

    public static int encodedLength(boolean z10, int i10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z10, i10);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z10, byte[] bArr, int i10, int i11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z10, 3, bArr, i10, i11);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public DLBitString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }
}
