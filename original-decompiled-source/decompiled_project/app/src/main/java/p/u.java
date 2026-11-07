package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class u<K, V> implements Map<K, V>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0<K, V> f20723a;

    /* renamed from: b, reason: collision with root package name */
    public d<K, V> f20724b;

    /* renamed from: c, reason: collision with root package name */
    public l<K, V> f20725c;

    /* renamed from: d, reason: collision with root package name */
    public g1<K, V> f20726d;

    public u(v0<K, V> parent) {
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20723a = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f20723a.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f20723a.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        d<K, V> dVar = this.f20724b;
        if (dVar != null) {
            return dVar;
        }
        d<K, V> dVar2 = new d<>(this.f20723a);
        this.f20724b = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f20723a, ((u) obj).f20723a);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f20723a.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f20723a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f20723a.e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        l<K, V> lVar = this.f20725c;
        if (lVar != null) {
            return lVar;
        }
        l<K, V> lVar2 = new l<>(this.f20723a);
        this.f20725c = lVar2;
        return lVar2;
    }

    @Override // java.util.Map
    public final V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20723a.f20741e;
    }

    public final String toString() {
        return this.f20723a.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        g1<K, V> g1Var = this.f20726d;
        if (g1Var != null) {
            return g1Var;
        }
        g1<K, V> g1Var2 = new g1<>(this.f20723a);
        this.f20726d = g1Var2;
        return g1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
