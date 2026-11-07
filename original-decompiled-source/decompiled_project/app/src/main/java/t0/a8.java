package t0;

/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25463a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25464b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25465c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25466d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25467e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25468f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25469g;

    public a8(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f25463a = j10;
        this.f25464b = j11;
        this.f25465c = j12;
        this.f25466d = j13;
        this.f25467e = j14;
        this.f25468f = j15;
        this.f25469g = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return q1.b1.d(this.f25463a, a8Var.f25463a) && q1.b1.d(this.f25466d, a8Var.f25466d) && q1.b1.d(this.f25464b, a8Var.f25464b) && q1.b1.d(this.f25467e, a8Var.f25467e) && q1.b1.d(this.f25465c, a8Var.f25465c) && q1.b1.d(this.f25468f, a8Var.f25468f) && q1.b1.d(this.f25469g, a8Var.f25469g);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f25469g) + r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f25463a) * 31, 31, this.f25466d), 31, this.f25464b), 31, this.f25467e), 31, this.f25465c), 31, this.f25468f);
    }
}
