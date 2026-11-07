package x0;

/* loaded from: classes.dex */
public final class t3<T> implements v3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f31918a;

    public t3(T t3) {
        this.f31918a = t3;
    }

    @Override // x0.v3
    public final T a(a2 a2Var) {
        return this.f31918a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && kotlin.jvm.internal.r.a(this.f31918a, ((t3) obj).f31918a);
    }

    public final int hashCode() {
        T t3 = this.f31918a;
        if (t3 == null) {
            return 0;
        }
        return t3.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f31918a + ')';
    }
}
