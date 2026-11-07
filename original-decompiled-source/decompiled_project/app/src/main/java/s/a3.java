package s;

import s.s;

/* loaded from: classes.dex */
public final class a3<V extends s> implements t2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f23651a;

    public a3(int i10) {
        this.f23651a = i10;
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        return v12;
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        return j10 < ((long) this.f23651a) * 1000000 ? v10 : v11;
    }

    @Override // s.t2
    public final int e() {
        return this.f23651a;
    }

    @Override // s.t2
    public final int f() {
        return 0;
    }
}
