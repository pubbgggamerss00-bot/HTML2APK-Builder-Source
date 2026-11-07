package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f8826a;

    public static boolean a(Object obj, long j10) {
        return (obj instanceof p) && j10 == ((p) obj).f8826a;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static String c(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & BodyPartID.bodyIdMax));
    }

    public final boolean equals(Object obj) {
        return a(obj, this.f8826a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8826a);
    }

    public final String toString() {
        return c(this.f8826a);
    }
}
