package jf;

import cf.i;
import cf.l;
import cf.u;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b<K, V> implements Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f15712a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15713b;

    public b(HashMap map, cf.d dVar) {
        this.f15713b = map;
        this.f15712a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b<String, Object> c(cf.d dVar) throws IOException {
        Object objValueOf;
        HashMap map = new HashMap();
        for (l lVar : dVar.f5423b.keySet()) {
            cf.b bVarV0 = dVar.v0(lVar);
            if (bVarV0 instanceof u) {
                objValueOf = ((u) bVarV0).getString();
            } else if (bVarV0 instanceof i) {
                objValueOf = Integer.valueOf((int) ((i) bVarV0).f5445b);
            } else if (bVarV0 instanceof l) {
                objValueOf = ((l) bVarV0).f5545b;
            } else if (bVarV0 instanceof cf.f) {
                objValueOf = Float.valueOf(((cf.f) bVarV0).f5435b.floatValue());
            } else {
                if (!(bVarV0 instanceof cf.c)) {
                    throw new IOException("Error:unknown type of object to convert:" + bVarV0);
                }
                objValueOf = ((cf.c) bVarV0).f5422b ? Boolean.TRUE : Boolean.FALSE;
            }
            map.put(lVar.f5545b, objValueOf);
        }
        return new b<>(map, dVar);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f15712a.f5423b.clear();
        this.f15713b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f15713b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f15713b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.f15713b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f15712a.equals(this.f15712a);
        }
        return false;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f15713b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f15712a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f15713b.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V put(K k10, V v10) {
        this.f15712a.O0(l.g0((String) k10), ((c) v10).Z());
        return (V) this.f15713b.put(k10, v10);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        this.f15712a.L0(l.g0((String) obj));
        return (V) this.f15713b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f15712a.f5423b.size();
    }

    public final String toString() {
        return this.f15713b.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f15713b.values();
    }
}
