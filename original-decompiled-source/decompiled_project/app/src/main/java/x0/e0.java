package x0;

/* loaded from: classes.dex */
public final class e0<T> implements v3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<x, T> f31666a;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(eh.l<? super x, ? extends T> lVar) {
        this.f31666a = lVar;
    }

    @Override // x0.v3
    public final T a(a2 a2Var) {
        return this.f31666a.invoke(a2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && kotlin.jvm.internal.r.a(this.f31666a, ((e0) obj).f31666a);
    }

    public final int hashCode() {
        return this.f31666a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f31666a + ')';
    }
}
