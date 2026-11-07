package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 extends i0 {

    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry<K, h0> f2031a;

        public a() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f2031a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            h0 value = this.f2031a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof MessageLite)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            h0 value = this.f2031a.getValue();
            MessageLite messageLite = value.f2036a;
            value.f2037b = null;
            value.f2036a = (MessageLite) obj;
            return messageLite;
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f2032a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f2032a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f2032a.next();
            if (!(next.getValue() instanceof h0)) {
                return next;
            }
            a aVar = new a();
            aVar.f2031a = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f2032a.remove();
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
