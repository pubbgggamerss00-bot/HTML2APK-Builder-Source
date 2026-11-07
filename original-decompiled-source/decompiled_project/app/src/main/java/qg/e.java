package qg;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class e<K, V> implements Map<K, V>, fh.a {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.r.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c1.n((c1.d) this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (((c1.d) this).f4558b != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v10 = get(key);
                if (kotlin.jvm.internal.r.a(value, v10) && (v10 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((c1.d) this).f4558b == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new c1.p((c1.d) this);
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
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((c1.d) this).f4558b;
    }

    public final String toString() {
        return x.I(entrySet(), ", ", "{", "}", new eh.l() { // from class: qg.d
            @Override // eh.l
            public final Object invoke(Object obj) {
                Map.Entry it = (Map.Entry) obj;
                kotlin.jvm.internal.r.e(it, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it.getKey();
                e eVar = this.f22718a;
                sb.append(key == eVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it.getValue();
                sb.append(value != eVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            }
        }, 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new c1.r((c1.d) this);
    }
}
