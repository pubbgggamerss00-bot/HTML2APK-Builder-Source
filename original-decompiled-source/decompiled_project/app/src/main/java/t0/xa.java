package t0;

/* loaded from: classes.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public final float f27403a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27404b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27405c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27406d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27407e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27408f;

    public xa(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27403a = f10;
        this.f27404b = f11;
        this.f27405c = f12;
        this.f27406d = f13;
        this.f27407e = f14;
        this.f27408f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return f3.h.a(this.f27403a, xaVar.f27403a) && f3.h.a(this.f27404b, xaVar.f27404b) && f3.h.a(this.f27405c, xaVar.f27405c) && f3.h.a(this.f27406d, xaVar.f27406d) && f3.h.a(this.f27408f, xaVar.f27408f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f27408f) + r.z1.a(this.f27406d, r.z1.a(this.f27405c, r.z1.a(this.f27404b, Float.hashCode(this.f27403a) * 31, 31), 31), 31);
    }
}
