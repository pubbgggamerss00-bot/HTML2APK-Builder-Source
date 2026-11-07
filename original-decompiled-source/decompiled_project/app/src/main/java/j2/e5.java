package j2;

/* loaded from: classes.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14715a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14716b;

    public e5(String str, Object obj) {
        this.f14715a = str;
        this.f14716b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return kotlin.jvm.internal.r.a(this.f14715a, e5Var.f14715a) && kotlin.jvm.internal.r.a(this.f14716b, e5Var.f14716b);
    }

    public final int hashCode() {
        int iHashCode = this.f14715a.hashCode() * 31;
        Object obj = this.f14716b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f14715a + ", value=" + this.f14716b + ')';
    }
}
