package t0;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26133a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26134b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26135c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26136d;

    public j4(long j10, long j11, long j12, long j13) {
        this.f26133a = j10;
        this.f26134b = j11;
        this.f26135c = j12;
        this.f26136d = j13;
    }

    public final j4 a(long j10, long j11, long j12, long j13) {
        if (j10 == 16) {
            j10 = this.f26133a;
        }
        return new j4(j10, j11 != 16 ? j11 : this.f26134b, j12 != 16 ? j12 : this.f26135c, j13 != 16 ? j13 : this.f26136d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return q1.b1.d(this.f26133a, j4Var.f26133a) && q1.b1.d(this.f26134b, j4Var.f26134b) && q1.b1.d(this.f26135c, j4Var.f26135c) && q1.b1.d(this.f26136d, j4Var.f26136d);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26136d) + r.e2.a(r.e2.a(Long.hashCode(this.f26133a) * 31, 31, this.f26134b), 31, this.f26135c);
    }
}
