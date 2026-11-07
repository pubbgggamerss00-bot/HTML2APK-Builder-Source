package s;

import s.s;

/* loaded from: classes.dex */
public final class n1<V extends s> implements q2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final q2<V> f23850a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23851b;

    public n1(q2<V> q2Var, long j10) {
        this.f23850a = q2Var;
        this.f23851b = j10;
    }

    @Override // s.q2
    public final boolean a() {
        return this.f23850a.a();
    }

    @Override // s.q2
    public final long b(V v10, V v11, V v12) {
        return this.f23850a.b(v10, v11, v12) + this.f23851b;
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        long j11 = this.f23851b;
        return j10 < j11 ? v12 : (V) this.f23850a.c(j10 - j11, v10, v11, v12);
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        long j11 = this.f23851b;
        return j10 < j11 ? v10 : (V) this.f23850a.d(j10 - j11, v10, v11, v12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return n1Var.f23851b == this.f23851b && kotlin.jvm.internal.r.a(n1Var.f23850a, this.f23850a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f23851b) + (this.f23850a.hashCode() * 31);
    }
}
