package qg;

/* loaded from: classes2.dex */
public final class e0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f22719a;

    /* renamed from: b, reason: collision with root package name */
    public final T f22720b;

    public e0(int i10, T t3) {
        this.f22719a = i10;
        this.f22720b = t3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f22719a == e0Var.f22719a && kotlin.jvm.internal.r.a(this.f22720b, e0Var.f22720b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22719a) * 31;
        T t3 = this.f22720b;
        return iHashCode + (t3 == null ? 0 : t3.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f22719a + ", value=" + this.f22720b + ')';
    }
}
