package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes2.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i10, int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(i10, i11, i12, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        if (z10) {
            int i10 = this.tagClass;
            if (zIsExplicit || aSN1Primitive.encodeConstructed()) {
                i10 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i10, this.tagNo);
        }
        if (!zIsExplicit) {
            aSN1Primitive.encode(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.write(128);
        aSN1Primitive.encode(aSN1OutputStream, true);
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z10) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = aSN1Primitive.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += 3;
        }
        return iEncodedLength + (z10 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public ASN1TaggedObject replaceTag(int i10, int i11) {
        return new BERTaggedObject(this.explicitness, i10, i11, this.obj);
    }

    public BERTaggedObject(int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(true, i10, i11, aSN1Encodable);
    }

    public BERTaggedObject(int i10, ASN1Encodable aSN1Encodable) {
        super(true, i10, aSN1Encodable);
    }

    public BERTaggedObject(boolean z10, int i10, int i11, ASN1Encodable aSN1Encodable) {
        super(z10, i10, i11, aSN1Encodable);
    }

    public BERTaggedObject(boolean z10, int i10, ASN1Encodable aSN1Encodable) {
        super(z10, i10, aSN1Encodable);
    }
}
