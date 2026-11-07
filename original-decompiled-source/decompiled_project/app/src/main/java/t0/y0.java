package t0;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f27426a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27428c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27429d;

    public y0(long j10, long j11, long j12, long j13) {
        this.f27426a = j10;
        this.f27427b = j11;
        this.f27428c = j12;
        this.f27429d = j13;
    }

    public final y0 a(long j10, long j11, long j12, long j13) {
        if (j10 == 16) {
            j10 = this.f27426a;
        }
        return new y0(j10, j11 != 16 ? j11 : this.f27427b, j12 != 16 ? j12 : this.f27428c, j13 != 16 ? j13 : this.f27429d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return q1.b1.d(this.f27426a, y0Var.f27426a) && q1.b1.d(this.f27427b, y0Var.f27427b) && q1.b1.d(this.f27428c, y0Var.f27428c) && q1.b1.d(this.f27429d, y0Var.f27429d);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f27429d) + r.e2.a(r.e2.a(Long.hashCode(this.f27426a) * 31, 31, this.f27427b), 31, this.f27428c);
    }
}
