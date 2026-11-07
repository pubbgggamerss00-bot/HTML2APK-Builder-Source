package f3;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f8836a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, 0L) ? "Unspecified" : a(j10, 4294967296L) ? "Sp" : a(j10, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f8836a == ((v) obj).f8836a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8836a);
    }

    public final String toString() {
        return b(this.f8836a);
    }
}
