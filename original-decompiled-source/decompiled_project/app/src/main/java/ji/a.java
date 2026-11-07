package ji;

import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import p5.s;
import r.n;
import w1.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static void a(Number number, n nVar, String str, s sVar, String str2) {
        number.intValue();
        r.e(nVar, str);
        r.e(sVar, str2);
    }

    public static void b(e eVar, float f10, float f11, float f12, float f13) {
        eVar.f(f10, f11);
        eVar.a();
        eVar.h(f12, f13);
    }

    public static byte[] c(ASN1Sequence aSN1Sequence, int i10) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets();
    }
}
