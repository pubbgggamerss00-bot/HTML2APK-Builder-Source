package j1;

import androidx.compose.ui.ZIndexElement;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l {
    public static final p1.g a(float f10, float f11, float f12, float f13, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new p1.g(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean b(p1.g gVar) {
        long j10 = gVar.f21139e;
        return (j10 >>> 32) == (BodyPartID.bodyIdMax & j10) && j10 == gVar.f21140f && j10 == gVar.f21141g && j10 == gVar.f21142h;
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new ZIndexElement(f10));
    }
}
