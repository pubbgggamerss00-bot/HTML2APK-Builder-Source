package w;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: v, reason: collision with root package name */
    public a<K, V>.C0099a f14826v;

    /* renamed from: w, reason: collision with root package name */
    public a<K, V>.c f14827w;

    /* renamed from: x, reason: collision with root package name */
    public a<K, V>.e f14828x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: w.a$a, reason: collision with other inner class name */
    public final class C0099a extends AbstractSet<Map.Entry<K, V>> {
        public C0099a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a.this.f14850u;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class b extends w.c<K> {
        public b() {
            super(a.this.f14850u);
        }

        @Override // w.c
        public final K a(int i6) {
            return a.this.f(i6);
        }

        @Override // w.c
        public final void b(int i6) {
            a.this.g(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int s;

        /* renamed from: t, reason: collision with root package name */
        public int f14830t = -1;

        /* renamed from: u, reason: collision with root package name */
        public boolean f14831u;

        public d() {
            this.s = a.this.f14850u - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f14831u) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i6 = this.f14830t;
            a aVar = a.this;
            return j.a(key, aVar.f(i6)) && j.a(entry.getValue(), aVar.i(this.f14830t));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f14831u) {
                return a.this.f(this.f14830t);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f14831u) {
                return a.this.i(this.f14830t);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f14830t < this.s;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f14831u) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i6 = this.f14830t;
            a aVar = a.this;
            K kF = aVar.f(i6);
            V vI = aVar.i(this.f14830t);
            return (kF == null ? 0 : kF.hashCode()) ^ (vI != null ? vI.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f14830t++;
            this.f14831u = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f14831u) {
                throw new IllegalStateException();
            }
            a.this.g(this.f14830t);
            this.f14830t--;
            this.s--;
            this.f14831u = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            if (this.f14831u) {
                return a.this.h(this.f14830t, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class f extends w.c<V> {
        public f() {
            super(a.this.f14850u);
        }

        @Override // w.c
        public final V a(int i6) {
            return a.this.i(i6);
        }

        @Override // w.c
        public final void b(int i6) {
            a.this.g(i6);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0099a c0099a = this.f14826v;
        if (c0099a != null) {
            return c0099a;
        }
        a<K, V>.C0099a c0099a2 = new C0099a();
        this.f14826v = c0099a2;
        return c0099a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Collection<?> collection) {
        int i6 = this.f14850u;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i6 != this.f14850u;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        a<K, V>.c cVar = this.f14827w;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f14827w = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f14850u);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        a<K, V>.e eVar = this.f14828x;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f14828x = eVar2;
        return eVar2;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k6) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return a.this.j(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            a aVar = a.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (aVar.f14850u == set.size()) {
                    return aVar.j(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            a aVar = a.this;
            int iHashCode = 0;
            for (int i6 = aVar.f14850u - 1; i6 >= 0; i6--) {
                K kF = aVar.f(i6);
                iHashCode += kF == null ? 0 : kF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int iD = aVar.d(obj);
            if (iD < 0) {
                return false;
            }
            aVar.g(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return a.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            for (int i7 = i6 - 1; i7 >= 0; i7--) {
                if (!collection.contains(aVar.f(i7))) {
                    aVar.g(i7);
                }
            }
            return i6 != aVar.f14850u;
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return a.this.f14850u;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            Object[] objArr = new Object[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                objArr[i7] = aVar.f(i7);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            if (tArr.length < i6) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i6));
            }
            for (int i7 = 0; i7 < i6; i7++) {
                tArr[i7] = aVar.f(i7);
            }
            if (tArr.length > i6) {
                tArr[i6] = null;
            }
            return tArr;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            a aVar = a.this;
            int iA = aVar.a(obj);
            if (iA < 0) {
                return false;
            }
            aVar.g(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            int i7 = 0;
            boolean z6 = false;
            while (i7 < i6) {
                if (collection.contains(aVar.i(i7))) {
                    aVar.g(i7);
                    i7--;
                    i6--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            int i7 = 0;
            boolean z6 = false;
            while (i7 < i6) {
                if (!collection.contains(aVar.i(i7))) {
                    aVar.g(i7);
                    i7--;
                    i6--;
                    z6 = true;
                }
                i7++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public final int size() {
            return a.this.f14850u;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            Object[] objArr = new Object[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                objArr[i7] = aVar.i(i7);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i6 = aVar.f14850u;
            if (tArr.length < i6) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i6));
            }
            for (int i7 = 0; i7 < i6; i7++) {
                tArr[i7] = aVar.i(i7);
            }
            if (tArr.length > i6) {
                tArr[i6] = null;
            }
            return tArr;
        }
    }
}
