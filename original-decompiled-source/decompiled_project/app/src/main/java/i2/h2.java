package i2;

/* loaded from: classes.dex */
public final class h2 implements w1 {

    /* renamed from: a, reason: collision with root package name */
    public final g2.m0 f13911a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f13912b;

    public h2(g2.m0 m0Var, l0 l0Var) {
        this.f13911a = m0Var;
        this.f13912b = l0Var;
    }

    @Override // i2.w1
    public final boolean U() {
        return this.f13912b.t0().m();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return kotlin.jvm.internal.r.a(this.f13911a, h2Var.f13911a) && kotlin.jvm.internal.r.a(this.f13912b, h2Var.f13912b);
    }

    public final int hashCode() {
        return this.f13912b.hashCode() + (this.f13911a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f13911a + ", placeable=" + this.f13912b + ')';
    }
}
