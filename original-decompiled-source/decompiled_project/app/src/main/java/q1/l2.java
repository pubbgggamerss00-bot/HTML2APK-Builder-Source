package q1;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21718b = b3.e.a(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21719c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f21720a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static String d(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l2) {
            return this.f21720a == ((l2) obj).f21720a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21720a);
    }

    public final String toString() {
        return d(this.f21720a);
    }
}
