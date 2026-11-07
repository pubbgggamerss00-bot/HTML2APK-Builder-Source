package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f8819a;

    public static final float a(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f8819a == ((k) obj).f8819a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8819a);
    }

    public final String toString() {
        long j10 = this.f8819a;
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.b(b(j10))) + " x " + ((Object) h.b(a(j10)));
    }
}
