package t0;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26657a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26658b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26659c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26660d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26661e;

    public p0(float f10, float f11, float f12, float f13, float f14) {
        this.f26657a = f10;
        this.f26658b = f11;
        this.f26659c = f12;
        this.f26660d = f13;
        this.f26661e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return f3.h.a(this.f26657a, p0Var.f26657a) && f3.h.a(this.f26658b, p0Var.f26658b) && f3.h.a(this.f26659c, p0Var.f26659c) && f3.h.a(this.f26660d, p0Var.f26660d) && f3.h.a(this.f26661e, p0Var.f26661e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26661e) + r.z1.a(this.f26660d, r.z1.a(this.f26659c, r.z1.a(this.f26658b, Float.hashCode(this.f26657a) * 31, 31), 31), 31);
    }
}
