package g2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k {
    public static final float a(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
    }
}
