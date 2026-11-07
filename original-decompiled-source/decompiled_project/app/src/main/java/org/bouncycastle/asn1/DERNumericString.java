package org.bouncycastle.asn1;

/* loaded from: classes2.dex */
public class DERNumericString extends ASN1NumericString {
    public DERNumericString(String str) {
        this(str, false);
    }

    public DERNumericString(String str, boolean z10) {
        super(str, z10);
    }

    public DERNumericString(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }
}
