package q1;

/* loaded from: classes.dex */
public final class i2 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21711a;

    public i2(long j10) {
        this.f21711a = j10;
    }

    @Override // q1.u0
    public final void a(float f10, long j10, h0 h0Var) {
        h0Var.g(1.0f);
        long jC = this.f21711a;
        if (f10 != 1.0f) {
            jC = b1.c(b1.e(jC) * f10, jC);
        }
        h0Var.i(jC);
        if (h0Var.d() != null) {
            h0Var.l(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i2) {
            return b1.d(this.f21711a, ((i2) obj).f21711a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Long.hashCode(this.f21711a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) b1.j(this.f21711a)) + ')';
    }
}
