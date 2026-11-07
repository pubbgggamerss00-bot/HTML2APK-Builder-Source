package nc;

import java.util.Map;
import nc.v0;

/* loaded from: classes2.dex */
public final class t0<K, V> extends o<K, V> {

    /* renamed from: j, reason: collision with root package name */
    public static final t0<Object, Object> f18746j = new t0<>();

    /* renamed from: d, reason: collision with root package name */
    public final transient int[] f18747d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f18748e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f18749f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f18750g;

    /* renamed from: h, reason: collision with root package name */
    public final transient t0<V, K> f18751h;

    /* JADX WARN: Multi-variable type inference failed */
    public t0() {
        this.f18747d = null;
        this.f18748e = new Object[0];
        this.f18749f = 0;
        this.f18750g = 0;
        this.f18751h = this;
    }

    @Override // nc.s
    public final v<Map.Entry<K, V>> c() {
        return new v0.a(this, this.f18748e, this.f18749f, this.f18750g);
    }

    @Override // nc.s
    public final v<K> e() {
        return new v0.b(this, new v0.c(this.f18748e, this.f18749f, this.f18750g));
    }

    @Override // nc.s, java.util.Map
    public final V get(Object obj) {
        return (V) v0.k(this.f18747d, this.f18748e, this.f18750g, this.f18749f, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18750g;
    }

    public t0(int[] iArr, Object[] objArr, int i10, t0<V, K> t0Var) {
        this.f18747d = iArr;
        this.f18748e = objArr;
        this.f18749f = 1;
        this.f18750g = i10;
        this.f18751h = t0Var;
    }

    public t0(Object[] objArr, int i10) {
        this.f18748e = objArr;
        this.f18750g = i10;
        this.f18749f = 0;
        int i11 = i10 >= 2 ? v.i(i10) : 0;
        this.f18747d = v0.j(objArr, i10, i11, 0);
        this.f18751h = new t0<>(v0.j(objArr, i10, i11, 1), objArr, i10, this);
    }
}
