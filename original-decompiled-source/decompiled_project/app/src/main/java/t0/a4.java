package t0;

/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f25450a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25451b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25452c;

    /* renamed from: d, reason: collision with root package name */
    public final float f25453d;

    public a4(float f10, float f11, float f12, float f13) {
        this.f25450a = f10;
        this.f25451b = f11;
        this.f25452c = f12;
        this.f25453d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        if (f3.h.a(this.f25450a, a4Var.f25450a) && f3.h.a(this.f25451b, a4Var.f25451b) && f3.h.a(this.f25452c, a4Var.f25452c)) {
            return f3.h.a(this.f25453d, a4Var.f25453d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25453d) + r.z1.a(this.f25452c, r.z1.a(this.f25451b, Float.hashCode(this.f25450a) * 31, 31), 31);
    }
}
