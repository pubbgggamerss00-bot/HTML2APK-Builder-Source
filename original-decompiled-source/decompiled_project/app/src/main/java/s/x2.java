package s;

import s.s;

/* loaded from: classes.dex */
public final class x2<V extends s> implements q2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final t2<V> f23994a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f23995b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23996c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23997d;

    public x2(t2 t2Var, y0 y0Var, long j10) {
        this.f23994a = t2Var;
        this.f23995b = y0Var;
        this.f23996c = (t2Var.f() + t2Var.e()) * 1000000;
        this.f23997d = j10 * 1000000;
    }

    @Override // s.q2
    public final boolean a() {
        return true;
    }

    @Override // s.q2
    public final long b(V v10, V v11, V v12) {
        return Long.MAX_VALUE;
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        return this.f23994a.c(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        return this.f23994a.d(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    public final long h(long j10) {
        long j11 = this.f23997d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f23996c;
        long j14 = j12 / j13;
        return (this.f23995b == y0.f23998a || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    public final V i(long j10, V v10, V v11, V v12) {
        long j11 = this.f23997d;
        long j12 = j10 + j11;
        long j13 = this.f23996c;
        return j12 > j13 ? this.f23994a.c(j13 - j11, v10, v12, v11) : v11;
    }
}
