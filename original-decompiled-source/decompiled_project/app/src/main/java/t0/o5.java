package t0;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26585a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26586b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26587c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26588d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26589e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26590f;

    public o5(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f26585a = j10;
        this.f26586b = j11;
        this.f26587c = j12;
        this.f26588d = j13;
        this.f26589e = j14;
        this.f26590f = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return q1.b1.d(this.f26585a, o5Var.f26585a) && q1.b1.d(this.f26586b, o5Var.f26586b) && q1.b1.d(this.f26587c, o5Var.f26587c) && q1.b1.d(this.f26588d, o5Var.f26588d) && q1.b1.d(this.f26589e, o5Var.f26589e) && q1.b1.d(this.f26590f, o5Var.f26590f);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26590f) + r.e2.a(r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f26585a) * 31, 31, this.f26586b), 31, this.f26587c), 31, this.f26588d), 31, this.f26589e);
    }
}
