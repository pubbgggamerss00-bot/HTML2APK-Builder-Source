package b8;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h {
    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        if (fIntBitsToFloat == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + n.e(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + n.e(Float.intBitsToFloat(i10)) + ", " + n.e(Float.intBitsToFloat(i11)) + ')';
    }
}
