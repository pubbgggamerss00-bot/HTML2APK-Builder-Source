package nc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z0<T> extends o0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final o0<? super T> f18794a;

    public z0(o0<? super T> o0Var) {
        this.f18794a = o0Var;
    }

    @Override // nc.o0
    public final <S extends T> o0<S> c() {
        return this.f18794a;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return this.f18794a.compare(t10, t3);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            return this.f18794a.equals(((z0) obj).f18794a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f18794a.hashCode();
    }

    public final String toString() {
        return this.f18794a + ".reverse()";
    }
}
