package com.google.crypto.tink.shaded.protobuf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public final /* synthetic */ class s0 {
    public static int a(int i10, int i11, int i12) {
        return k.Q(i10) + i11 + i12;
    }

    public static DERSequence b(ASN1EncodableVector aSN1EncodableVector, DEROctetString dEROctetString, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(dEROctetString);
        return new DERSequence(aSN1EncodableVector2);
    }
}
