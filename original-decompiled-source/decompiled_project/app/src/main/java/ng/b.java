package ng;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import nc.s;

/* loaded from: classes2.dex */
public final class b<V> implements Map<Class<?>, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, V> f18808a;

    public b(s sVar) {
        this.f18808a = sVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f18808a.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f18808a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f18808a.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18808a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Class<?> cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18808a.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f18808a.values();
    }
}
