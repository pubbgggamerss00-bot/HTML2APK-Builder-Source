package p1;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class f {
    public static final e a(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        return new e(fIntBitsToFloat, Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i11));
    }

    public static final e b(e eVar, e eVar2, float f10) {
        return new e(h3.b.b(eVar.f21131a, eVar2.f21131a, f10), h3.b.b(eVar.f21132b, eVar2.f21132b, f10), h3.b.b(eVar.f21133c, eVar2.f21133c, f10), h3.b.b(eVar.f21134d, eVar2.f21134d, f10));
    }
}
