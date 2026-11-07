package i2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class v {
    public static final long a(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }
}
