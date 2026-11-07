package t;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final float f25389a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.u0 f25390b;

    public v(float f10, q1.u0 u0Var) {
        this.f25389a = f10;
        this.f25390b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return f3.h.a(this.f25389a, vVar.f25389a) && this.f25390b.equals(vVar.f25390b);
    }

    public final int hashCode() {
        return this.f25390b.hashCode() + (Float.hashCode(this.f25389a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) f3.h.b(this.f25389a)) + ", brush=" + this.f25390b + ')';
    }
}
