package t0;

/* loaded from: classes.dex */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public final long f26394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26396c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26397d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26398e;

    public lf(long j10, long j11, long j12, long j13, long j14) {
        this.f26394a = j10;
        this.f26395b = j11;
        this.f26396c = j12;
        this.f26397d = j13;
        this.f26398e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return q1.b1.d(this.f26394a, lfVar.f26394a) && q1.b1.d(this.f26395b, lfVar.f26395b) && q1.b1.d(this.f26396c, lfVar.f26396c) && q1.b1.d(this.f26397d, lfVar.f26397d) && q1.b1.d(this.f26398e, lfVar.f26398e);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26398e) + r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f26394a) * 31, 31, this.f26395b), 31, this.f26396c), 31, this.f26397d);
    }
}
