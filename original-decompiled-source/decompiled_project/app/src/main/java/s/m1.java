package s;

/* loaded from: classes.dex */
public final class m1<T> implements l<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l<T> f23837a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23838b;

    public m1(e0 e0Var, long j10) {
        this.f23837a = e0Var;
        this.f23838b = j10;
    }

    @Override // s.l
    public final <V extends s> q2<V> a(n2<T, V> n2Var) {
        return new n1(this.f23837a.a(n2Var), this.f23838b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return m1Var.f23838b == this.f23838b && kotlin.jvm.internal.r.a(m1Var.f23837a, this.f23837a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f23838b) + (this.f23837a.hashCode() * 31);
    }
}
