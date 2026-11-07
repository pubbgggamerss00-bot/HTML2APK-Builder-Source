package s;

import s.s;

/* loaded from: classes.dex */
public final class b3<V extends s> implements u2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2<V> f23676a;

    public b3(float f10, float f11, V v10) {
        int[] iArr = s2.f23919a;
        this.f23676a = new v2<>(v10 != null ? new r2(f10, f11, v10) : new androidx.room.u(f10, f11));
    }

    @Override // s.u2, s.q2
    public final boolean a() {
        this.f23676a.getClass();
        return false;
    }

    @Override // s.q2
    public final long b(V v10, V v11, V v12) {
        return this.f23676a.b(v10, v11, v12);
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        return (V) this.f23676a.c(j10, v10, v11, v12);
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        return (V) this.f23676a.d(j10, v10, v11, v12);
    }

    @Override // s.q2
    public final V g(V v10, V v11, V v12) {
        return (V) this.f23676a.g(v10, v11, v12);
    }
}
