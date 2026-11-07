package g2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class n1 {
    public static final long a(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) * Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
