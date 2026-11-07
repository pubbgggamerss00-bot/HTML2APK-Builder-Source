package c1;

import c1.t;

/* loaded from: classes.dex */
public class d<K, V> extends qg.e<K, V> implements a1.d<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final d f4556c = new d(t.f4579e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final t<K, V> f4557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4558b;

    public d(t<K, V> tVar, int i10) {
        this.f4557a = tVar;
        this.f4558b = i10;
    }

    @Override // java.util.Map
    public boolean containsKey(K k10) {
        return this.f4557a.d(k10, k10 != null ? k10.hashCode() : 0, 0);
    }

    @Override // a1.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder() {
        return new f<>(this);
    }

    public final d f(Object obj, d1.a aVar) {
        t.a aVarU = this.f4557a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return aVarU == null ? this : new d(aVarU.f4584a, this.f4558b + aVarU.f4585b);
    }

    @Override // java.util.Map
    public V get(K k10) {
        return (V) this.f4557a.g(k10, k10 != null ? k10.hashCode() : 0, 0);
    }
}
