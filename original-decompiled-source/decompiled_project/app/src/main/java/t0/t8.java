package t0;

/* loaded from: classes.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27058a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27059b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27060c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27061d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27062e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27063f;

    /* renamed from: g, reason: collision with root package name */
    public final long f27064g;

    public t8(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f27058a = j10;
        this.f27059b = j11;
        this.f27060c = j12;
        this.f27061d = j13;
        this.f27062e = j14;
        this.f27063f = j15;
        this.f27064g = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return q1.b1.d(this.f27058a, t8Var.f27058a) && q1.b1.d(this.f27061d, t8Var.f27061d) && q1.b1.d(this.f27059b, t8Var.f27059b) && q1.b1.d(this.f27062e, t8Var.f27062e) && q1.b1.d(this.f27060c, t8Var.f27060c) && q1.b1.d(this.f27063f, t8Var.f27063f) && q1.b1.d(this.f27064g, t8Var.f27064g);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f27064g) + r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f27058a) * 31, 31, this.f27061d), 31, this.f27059b), 31, this.f27062e), 31, this.f27060c), 31, this.f27063f);
    }
}
