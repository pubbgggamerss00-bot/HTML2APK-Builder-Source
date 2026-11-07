package t0;

/* loaded from: classes.dex */
public final class t3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f27042a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.b f27043b;

    /* JADX WARN: Multi-variable type inference failed */
    public t3(ic icVar, f1.b bVar) {
        this.f27042a = icVar;
        this.f27043b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return kotlin.jvm.internal.r.a(this.f27042a, t3Var.f27042a) && this.f27043b.equals(t3Var.f27043b);
    }

    public final int hashCode() {
        T t3 = this.f27042a;
        return this.f27043b.hashCode() + ((t3 == null ? 0 : t3.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f27042a + ", transition=" + this.f27043b + ')';
    }
}
