package x0;

/* loaded from: classes.dex */
public final class n0<T> implements v3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final n1<T> f31820a;

    public n0(n1<T> n1Var) {
        this.f31820a = n1Var;
    }

    @Override // x0.v3
    public final T a(a2 a2Var) {
        return this.f31820a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && kotlin.jvm.internal.r.a(this.f31820a, ((n0) obj).f31820a);
    }

    public final int hashCode() {
        return this.f31820a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f31820a + ')';
    }
}
