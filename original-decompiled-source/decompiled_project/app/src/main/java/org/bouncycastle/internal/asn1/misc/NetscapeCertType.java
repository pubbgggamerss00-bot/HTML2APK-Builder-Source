package org.bouncycastle.internal.asn1.misc;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.DERBitString;

/* loaded from: classes2.dex */
public class NetscapeCertType extends DERBitString {
    public static final int objectSigning = 16;
    public static final int objectSigningCA = 1;
    public static final int reserved = 8;
    public static final int smime = 32;
    public static final int smimeCA = 2;
    public static final int sslCA = 4;
    public static final int sslClient = 128;
    public static final int sslServer = 64;

    public NetscapeCertType(int i10) {
        super(ASN1BitString.getBytes(i10), ASN1BitString.getPadBits(i10));
    }

    public boolean hasUsages(int i10) {
        return (intValue() & i10) == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString
    public String toString() {
        return "NetscapeCertType: 0x" + Integer.toHexString(intValue());
    }

    public NetscapeCertType(ASN1BitString aSN1BitString) {
        super(aSN1BitString.getBytes(), aSN1BitString.getPadBits());
    }
}
