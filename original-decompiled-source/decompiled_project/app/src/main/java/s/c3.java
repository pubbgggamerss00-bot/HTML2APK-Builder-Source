package s;

import s.s;

/* loaded from: classes.dex */
public final class c3<V extends s> implements t2<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f23692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23693b;

    /* renamed from: c, reason: collision with root package name */
    public final v2<V> f23694c;

    public c3(int i10, int i11, b0 b0Var) {
        this.f23692a = i10;
        this.f23693b = i11;
        this.f23694c = new v2<>(new h0(i10, i11, b0Var));
    }

    @Override // s.q2
    public final V c(long j10, V v10, V v11, V v12) {
        return (V) this.f23694c.c(j10, v10, v11, v12);
    }

    @Override // s.q2
    public final V d(long j10, V v10, V v11, V v12) {
        return (V) this.f23694c.d(j10, v10, v11, v12);
    }

    @Override // s.t2
    public final int e() {
        return this.f23693b;
    }

    @Override // s.t2
    public final int f() {
        return this.f23692a;
    }
}
