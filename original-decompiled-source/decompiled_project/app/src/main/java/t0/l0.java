package t0;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26335a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26336b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26337c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26338d;

    public l0(long j10, long j11, long j12, long j13) {
        this.f26335a = j10;
        this.f26336b = j11;
        this.f26337c = j12;
        this.f26338d = j13;
    }

    public final l0 a(long j10, long j11, long j12, long j13) {
        if (j10 == 16) {
            j10 = this.f26335a;
        }
        return new l0(j10, j11 != 16 ? j11 : this.f26336b, j12 != 16 ? j12 : this.f26337c, j13 != 16 ? j13 : this.f26338d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return q1.b1.d(this.f26335a, l0Var.f26335a) && q1.b1.d(this.f26336b, l0Var.f26336b) && q1.b1.d(this.f26337c, l0Var.f26337c) && q1.b1.d(this.f26338d, l0Var.f26338d);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26338d) + r.e2.a(r.e2.a(Long.hashCode(this.f26335a) * 31, 31, this.f26336b), 31, this.f26337c);
    }
}
