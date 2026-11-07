package m1;

import i2.k;
import i2.w;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h {
    public static final boolean a(g gVar, long j10) {
        if (!gVar.f1144a.f1157p) {
            return false;
        }
        w wVar = k.f(gVar).I.f13790b;
        if (!wVar.V.f1157p) {
            return false;
        }
        long jY = wVar.Y(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY & BodyPartID.bodyIdMax));
        long j11 = gVar.f17625t;
        float f10 = ((int) (j11 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j11 & BodyPartID.bodyIdMax)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }
}
