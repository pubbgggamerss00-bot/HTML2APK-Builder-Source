package c1;

import java.util.Map;

/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final K f4552a;

    /* renamed from: b, reason: collision with root package name */
    public final V f4553b;

    public b(K k10, V v10) {
        this.f4552a = k10;
        this.f4553b = v10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.r.a(entry.getKey(), this.f4552a) && kotlin.jvm.internal.r.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f4552a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f4553b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k10 = this.f4552a;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4552a);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
