package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public c<K, V> f18827a;

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f18828b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f18829c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public int f18830d = 0;

    public static class a<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f18834d;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f18833c;
        }
    }

    /* renamed from: o.b$b, reason: collision with other inner class name */
    public static class C0212b<K, V> extends e<K, V> {
        @Override // o.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f18833c;
        }

        @Override // o.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f18834d;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f18831a;

        /* renamed from: b, reason: collision with root package name */
        public final V f18832b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f18833c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f18834d;

        public c(K k10, V v10) {
            this.f18831a = k10;
            this.f18832b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f18831a.equals(cVar.f18831a) && this.f18832b.equals(cVar.f18832b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f18831a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f18832b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f18831a.hashCode() ^ this.f18832b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f18831a + "=" + this.f18832b;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f18835a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18836b = true;

        public d() {
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f18835a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f18834d;
                this.f18835a = cVar3;
                this.f18836b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f18836b) {
                return b.this.f18827a != null;
            }
            c<K, V> cVar = this.f18835a;
            return (cVar == null || cVar.f18833c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f18836b) {
                this.f18836b = false;
                this.f18835a = b.this.f18827a;
            } else {
                c<K, V> cVar = this.f18835a;
                this.f18835a = cVar != null ? cVar.f18833c : null;
            }
            return this.f18835a;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public c<K, V> f18838a;

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f18839b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f18838a = cVar2;
            this.f18839b = cVar;
        }

        @Override // o.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f18838a == cVar && cVar == this.f18839b) {
                this.f18839b = null;
                this.f18838a = null;
            }
            c<K, V> cVar2 = this.f18838a;
            if (cVar2 == cVar) {
                this.f18838a = b(cVar2);
            }
            c<K, V> cVar3 = this.f18839b;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f18838a;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f18839b = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18839b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f18839b;
            c<K, V> cVar2 = this.f18838a;
            this.f18839b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f18827a;
        while (cVar != null && !cVar.f18831a.equals(k10)) {
            cVar = cVar.f18833c;
        }
        return cVar;
    }

    public V b(K k10) {
        c<K, V> cVarA = a(k10);
        if (cVarA == null) {
            return null;
        }
        this.f18830d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f18829c;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarA);
            }
        }
        c<K, V> cVar = cVarA.f18834d;
        if (cVar != null) {
            cVar.f18833c = cVarA.f18833c;
        } else {
            this.f18827a = cVarA.f18833c;
        }
        c<K, V> cVar2 = cVarA.f18833c;
        if (cVar2 != null) {
            cVar2.f18834d = cVar;
        } else {
            this.f18828b = cVar;
        }
        cVarA.f18833c = null;
        cVarA.f18834d = null;
        return cVarA.f18832b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18830d != bVar.f18830d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f18827a, this.f18828b);
        this.f18829c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
