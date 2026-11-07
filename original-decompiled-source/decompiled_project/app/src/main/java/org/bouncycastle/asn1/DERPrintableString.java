package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z10) {
        super(str, z10);
    }

    public DERPrintableString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }
}
