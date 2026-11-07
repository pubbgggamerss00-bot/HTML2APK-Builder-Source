package pg;

import i0.e4;

/* loaded from: classes2.dex */
public final class z implements Comparable<z> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21492b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f21493a;

    public static final class a {
    }

    @Override // java.lang.Comparable
    public final int compareTo(z zVar) {
        long j10 = zVar.f21493a;
        long j11 = this.f21493a ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f21493a == ((z) obj).f21493a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21493a);
    }

    public final String toString() {
        return e4.d(10, this.f21493a);
    }
}
