package t0;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public final long f25879a = q1.b1.f21654h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fa) {
            return q1.b1.d(this.f25879a, ((fa) obj).f25879a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f25879a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) q1.b1.j(this.f25879a)) + ", rippleAlpha=null)";
    }
}
