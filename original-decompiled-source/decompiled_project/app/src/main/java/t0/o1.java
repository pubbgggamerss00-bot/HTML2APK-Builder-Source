package t0;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26565a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26566b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26567c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26568d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26569e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26570f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26571g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26572h;

    public o1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f26565a = j10;
        this.f26566b = j11;
        this.f26567c = j12;
        this.f26568d = j13;
        this.f26569e = j14;
        this.f26570f = j15;
        this.f26571g = j16;
        this.f26572h = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return q1.b1.d(this.f26565a, o1Var.f26565a) && q1.b1.d(this.f26566b, o1Var.f26566b) && q1.b1.d(this.f26567c, o1Var.f26567c) && q1.b1.d(this.f26568d, o1Var.f26568d) && q1.b1.d(this.f26569e, o1Var.f26569e) && q1.b1.d(this.f26570f, o1Var.f26570f) && q1.b1.d(this.f26571g, o1Var.f26571g) && q1.b1.d(this.f26572h, o1Var.f26572h);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26572h) + r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f26565a) * 31, 31, this.f26566b), 31, this.f26567c), 31, this.f26568d), 31, this.f26569e), 31, this.f26570f), 31, this.f26571g);
    }
}
