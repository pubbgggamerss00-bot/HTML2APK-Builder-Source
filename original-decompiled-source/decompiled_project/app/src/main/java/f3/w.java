package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final long f8837a;

    public static long a(float f10, float f11, int i10, long j10) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        }
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final long d(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    public static final long e(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(float f10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) * f10;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String g(long j10) {
        return "(" + b(j10) + ", " + c(j10) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f8837a == ((w) obj).f8837a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8837a);
    }

    public final String toString() {
        return g(this.f8837a);
    }
}
