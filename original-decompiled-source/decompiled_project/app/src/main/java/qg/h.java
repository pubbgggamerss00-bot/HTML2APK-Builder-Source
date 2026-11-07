package qg;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class h<K, V> extends AbstractMap<K, V> implements Map<K, V>, fh.c {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new c1.h((c1.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new c1.j((c1.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((c1.f) this).f4567f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new c1.l((c1.f) this);
    }
}
