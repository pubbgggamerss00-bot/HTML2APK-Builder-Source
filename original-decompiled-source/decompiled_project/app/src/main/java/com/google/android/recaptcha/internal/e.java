package com.google.android.recaptcha.internal;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes2.dex */
public final /* synthetic */ class e {
    public static int a(int i10, int i11, int i12) {
        return zzln.zzA(i10) + i11 + i12;
    }

    public static DERSequence b(ASN1EncodableVector aSN1EncodableVector, ASN1OctetString aSN1OctetString, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(aSN1OctetString);
        return new DERSequence(aSN1EncodableVector2);
    }

    public static void c(w1.e eVar, float f10, float f11, float f12, float f13) {
        eVar.a();
        eVar.h(f10, f11);
        eVar.e(f12);
        eVar.l(f13);
    }
}
