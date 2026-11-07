package s;

/* loaded from: classes.dex */
public final class j1<T> implements a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f23785a;

    public j1(int i10) {
        this.f23785a = i10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j1) && ((j1) obj).f23785a == this.f23785a;
    }

    public final int hashCode() {
        return this.f23785a;
    }

    @Override // s.l
    public final <V extends s> t2<V> a(n2<T, V> n2Var) {
        return new a3(this.f23785a);
    }
}
