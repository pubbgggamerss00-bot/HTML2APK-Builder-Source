package f3;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final v[] f8832b = {new v(0), new v(4294967296L), new v(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f8833c = u.e(Float.NaN, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f8834a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f8832b[(int) ((j10 & 1095216660480L) >>> 32)].f8836a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
    }

    public static String d(long j10) {
        long jB = b(j10);
        if (v.a(jB, 0L)) {
            return "Unspecified";
        }
        if (v.a(jB, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (!v.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f8834a == ((t) obj).f8834a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8834a);
    }

    public final String toString() {
        return d(this.f8834a);
    }
}
