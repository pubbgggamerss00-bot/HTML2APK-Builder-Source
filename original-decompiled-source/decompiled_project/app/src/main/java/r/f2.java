package r;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22819a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22820b;

    /* renamed from: c, reason: collision with root package name */
    public final s.e0<Float> f22821c;

    public f2(float f10, long j10, s.e0 e0Var) {
        this.f22819a = f10;
        this.f22820b = j10;
        this.f22821c = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return Float.compare(this.f22819a, f2Var.f22819a) == 0 && q1.l2.a(this.f22820b, f2Var.f22820b) && kotlin.jvm.internal.r.a(this.f22821c, f2Var.f22821c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f22819a) * 31;
        int i10 = q1.l2.f21719c;
        return this.f22821c.hashCode() + e2.a(iHashCode, 31, this.f22820b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f22819a + ", transformOrigin=" + ((Object) q1.l2.d(this.f22820b)) + ", animationSpec=" + this.f22821c + ')';
    }
}
