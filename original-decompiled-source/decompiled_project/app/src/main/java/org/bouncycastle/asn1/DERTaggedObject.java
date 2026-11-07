package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    public DERTaggedObject(int i10, int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(i10, i11, i12, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean zIsExplicit = isExplicit();
        if (z10) {
            int i10 = this.tagClass;
            if (zIsExplicit || dERObject.encodeConstructed()) {
                i10 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i10, this.tagNo);
        }
        if (zIsExplicit) {
            aSN1OutputStream.writeDL(dERObject.encodedLength(true));
        }
        dERObject.encode(aSN1OutputStream.getDERSubStream(), zIsExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDERObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) throws IOException {
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = dERObject.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += ASN1OutputStream.getLengthOfDL(iEncodedLength);
        }
        return iEncodedLength + (z10 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i10, int i11) {
        return new DERTaggedObject(this.explicitness, i10, i11, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERTaggedObject(int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(true, i10, i11, aSN1Encodable);
    }

    public DERTaggedObject(int i10, ASN1Encodable aSN1Encodable) {
        super(true, i10, aSN1Encodable);
    }

    public DERTaggedObject(boolean z10, int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(z10, i10, i11, aSN1Encodable);
    }

    public DERTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }
}
