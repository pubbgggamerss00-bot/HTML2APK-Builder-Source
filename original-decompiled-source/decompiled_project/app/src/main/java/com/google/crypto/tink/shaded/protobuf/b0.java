package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b0 extends c0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, b0> f6630a;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f6630a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            b0 value = this.f6630a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof p0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            b0 value = this.f6630a.getValue();
            p0 p0Var = value.f6636a;
            value.f6637b = null;
            value.f6636a = (p0) obj;
            return p0Var;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f6631a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6631a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f6631a.next();
            if (!(next.getValue() instanceof b0)) {
                return next;
            }
            a aVar = new a();
            aVar.f6630a = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f6631a.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
