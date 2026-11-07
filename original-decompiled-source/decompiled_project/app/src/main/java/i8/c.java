package i8;

import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements d8.b {
    public static String b(int i10, String str) {
        return i10 + str;
    }

    public static DERSequence c(ASN1EncodableVector aSN1EncodableVector, ASN1Integer aSN1Integer, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector.add(aSN1Integer);
        return new DERSequence(aSN1EncodableVector2);
    }

    @Override // d8.b
    public void a(com.android.billingclient.api.a aVar) {
        r.e(aVar, "<unused var>");
    }
}
