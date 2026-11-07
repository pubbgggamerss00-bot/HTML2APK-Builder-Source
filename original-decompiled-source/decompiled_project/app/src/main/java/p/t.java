package p;

import java.util.Map;

/* loaded from: classes.dex */
public final class t<K, V> implements Map.Entry<K, V>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final K f20720a;

    /* renamed from: b, reason: collision with root package name */
    public final V f20721b;

    public t(K k10, V v10) {
        this.f20720a = k10;
        this.f20721b = v10;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f20720a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f20721b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
