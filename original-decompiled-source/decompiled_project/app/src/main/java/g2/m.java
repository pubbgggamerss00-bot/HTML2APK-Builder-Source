package g2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class m implements j {
    @Override // g2.j
    public final long a(long j10, long j11) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(1.0f));
        int i10 = m1.f11408a;
        return jFloatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
