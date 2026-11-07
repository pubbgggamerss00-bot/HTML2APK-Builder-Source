package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> s;

    /* renamed from: t, reason: collision with root package name */
    public c<K, V> f13903t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f13904u = new WeakHashMap<>();

    /* renamed from: v, reason: collision with root package name */
    public int f13905v = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a<K, V> extends e<K, V> {
        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f13908v;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f13907u;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0080b<K, V> extends e<K, V> {
        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f13907u;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f13908v;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K s;

        /* renamed from: t, reason: collision with root package name */
        public final V f13906t;

        /* renamed from: u, reason: collision with root package name */
        public c<K, V> f13907u;

        /* renamed from: v, reason: collision with root package name */
        public c<K, V> f13908v;

        public c(K k6, V v2) {
            this.s = k6;
            this.f13906t = v2;
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
            return this.s.equals(cVar.s) && this.f13906t.equals(cVar.f13906t);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.s;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f13906t;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.s.hashCode() ^ this.f13906t.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.s + "=" + this.f13906t;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f13909t = true;

        public d() {
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.s;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f13908v;
                this.s = cVar3;
                this.f13909t = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f13909t) {
                return b.this.s != null;
            }
            c<K, V> cVar = this.s;
            return (cVar == null || cVar.f13907u == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f13909t) {
                this.f13909t = false;
                this.s = b.this.s;
            } else {
                c<K, V> cVar = this.s;
                this.s = cVar != null ? cVar.f13907u : null;
            }
            return this.s;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> s;

        /* renamed from: t, reason: collision with root package name */
        public c<K, V> f13911t;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.s = cVar2;
            this.f13911t = cVar;
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.s == cVar && cVar == this.f13911t) {
                this.f13911t = null;
                this.s = null;
            }
            c<K, V> cVar2 = this.s;
            if (cVar2 == cVar) {
                this.s = b(cVar2);
            }
            c<K, V> cVar3 = this.f13911t;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.s;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f13911t = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13911t != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f13911t;
            c<K, V> cVar2 = this.s;
            this.f13911t = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> c(K k6) {
        c<K, V> cVar = this.s;
        while (cVar != null && !cVar.s.equals(k6)) {
            cVar = cVar.f13907u;
        }
        return cVar;
    }

    public V d(K k6, V v2) {
        c<K, V> cVarC = c(k6);
        if (cVarC != null) {
            return cVarC.f13906t;
        }
        c<K, V> cVar = new c<>(k6, v2);
        this.f13905v++;
        c<K, V> cVar2 = this.f13903t;
        if (cVar2 == null) {
            this.s = cVar;
            this.f13903t = cVar;
            return null;
        }
        cVar2.f13907u = cVar;
        cVar.f13908v = cVar2;
        this.f13903t = cVar;
        return null;
    }

    public V e(K k6) {
        c<K, V> cVarC = c(k6);
        if (cVarC == null) {
            return null;
        }
        this.f13905v--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f13904u;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f13908v;
        if (cVar != null) {
            cVar.f13907u = cVarC.f13907u;
        } else {
            this.s = cVarC.f13907u;
        }
        c<K, V> cVar2 = cVarC.f13907u;
        if (cVar2 != null) {
            cVar2.f13908v = cVar;
        } else {
            this.f13903t = cVar;
        }
        cVarC.f13907u = null;
        cVarC.f13908v = null;
        return cVarC.f13906t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((n.b.e) r7).hasNext() != false) goto L28;
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
        if (this.f13905v != bVar.f13905v) {
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
        a aVar = new a(this.s, this.f13903t);
        this.f13904u.put(aVar, Boolean.FALSE);
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
