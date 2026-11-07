package p1;

import b8.n;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f21129a;

    public static long a(long j10, float f10, int i10) {
        float fIntBitsToFloat = (i10 & 1) != 0 ? Float.intBitsToFloat((int) (j10 >> 32)) : CropImageView.DEFAULT_ASPECT_RATIO;
        if ((i10 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final long f(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    public static final long g(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long h(float f10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) * f10;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String i(long j10) {
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + n.e(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + n.e(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f21129a == ((c) obj).f21129a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21129a);
    }

    public final String toString() {
        return i(this.f21129a);
    }
}
