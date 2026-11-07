package t0;

/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public final j3.q0 f26789a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26790b = true;

    public q7(j3.q0 q0Var) {
        this.f26789a = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.f26789a == ((q7) obj).f26789a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26790b) + (this.f26789a.hashCode() * 31);
    }
}
