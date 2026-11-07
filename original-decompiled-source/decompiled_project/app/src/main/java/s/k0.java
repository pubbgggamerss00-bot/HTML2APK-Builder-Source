package s;

/* loaded from: classes.dex */
public final class k0<T> implements l<T> {

    /* renamed from: a, reason: collision with root package name */
    public final a0<T> f23796a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f23797b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23798c;

    public k0(a0 a0Var, y0 y0Var, long j10) {
        this.f23796a = a0Var;
        this.f23797b = y0Var;
        this.f23798c = j10;
    }

    @Override // s.l
    public final <V extends s> q2<V> a(n2<T, V> n2Var) {
        return new x2(this.f23796a.a((n2) n2Var), this.f23797b, this.f23798c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (kotlin.jvm.internal.r.a(k0Var.f23796a, this.f23796a) && k0Var.f23797b == this.f23797b && k0Var.f23798c == this.f23798c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23798c) + ((this.f23797b.hashCode() + (this.f23796a.hashCode() * 31)) * 31);
    }
}
