package t0;

/* loaded from: classes.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public final long f25537a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25538b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25539c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25540d;

    public ba(long j10, long j11, long j12, long j13) {
        this.f25537a = j10;
        this.f25538b = j11;
        this.f25539c = j12;
        this.f25540d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return q1.b1.d(this.f25537a, baVar.f25537a) && q1.b1.d(this.f25538b, baVar.f25538b) && q1.b1.d(this.f25539c, baVar.f25539c) && q1.b1.d(this.f25540d, baVar.f25540d);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f25540d) + r.e2.a(r.e2.a(Long.hashCode(this.f25537a) * 31, 31, this.f25538b), 31, this.f25539c);
    }
}
