package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
final class ASN1Tag {
    private final int tagClass;
    private final int tagNumber;

    private ASN1Tag(int i10, int i11) {
        this.tagClass = i10;
        this.tagNumber = i11;
    }

    public static ASN1Tag create(int i10, int i11) {
        return new ASN1Tag(i10, i11);
    }

    public int getTagClass() {
        return this.tagClass;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }
}
