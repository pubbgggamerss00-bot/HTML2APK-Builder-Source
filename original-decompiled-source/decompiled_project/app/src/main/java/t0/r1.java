package t0;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26840a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26841b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26842c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26843d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26844e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26845f;

    public r1(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f26840a = f10;
        this.f26841b = f11;
        this.f26842c = f12;
        this.f26843d = f13;
        this.f26844e = f14;
        this.f26845f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return f3.h.a(this.f26840a, r1Var.f26840a) && f3.h.a(this.f26841b, r1Var.f26841b) && f3.h.a(this.f26842c, r1Var.f26842c) && f3.h.a(this.f26843d, r1Var.f26843d) && f3.h.a(this.f26845f, r1Var.f26845f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26845f) + r.z1.a(this.f26843d, r.z1.a(this.f26842c, r.z1.a(this.f26841b, Float.hashCode(this.f26840a) * 31, 31), 31), 31);
    }
}
