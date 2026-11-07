package p;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<K, V> extends b1<K, V> implements Map<K, V> {

    /* renamed from: d, reason: collision with root package name */
    public a<K, V>.C0241a f20549d;

    /* renamed from: e, reason: collision with root package name */
    public a<K, V>.c f20550e;

    /* renamed from: f, reason: collision with root package name */
    public a<K, V>.e f20551f;

    /* renamed from: p.a$a, reason: collision with other inner class name */
    public final class C0241a extends AbstractSet<Map.Entry<K, V>> {
        public C0241a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a.this.f20576c;
        }
    }

    public final class b extends p.f<K> {
        public b() {
            super(a.this.f20576c);
        }

        @Override // p.f
        public final K c(int i10) {
            return a.this.h(i10);
        }

        @Override // p.f
        public final void e(int i10) {
            a.this.i(i10);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public int f20555a;

        /* renamed from: b, reason: collision with root package name */
        public int f20556b = -1;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20557c;

        public d() {
            this.f20555a = a.this.f20576c - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f20557c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f20556b;
            a aVar = a.this;
            return kotlin.jvm.internal.r.a(key, aVar.h(i10)) && kotlin.jvm.internal.r.a(entry.getValue(), aVar.k(this.f20556b));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f20557c) {
                return a.this.h(this.f20556b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f20557c) {
                return a.this.k(this.f20556b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20556b < this.f20555a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f20557c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i10 = this.f20556b;
            a aVar = a.this;
            K kH = aVar.h(i10);
            V vK = aVar.k(this.f20556b);
            return (kH == null ? 0 : kH.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f20556b++;
            this.f20557c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f20557c) {
                throw new IllegalStateException();
            }
            a.this.i(this.f20556b);
            this.f20556b--;
            this.f20555a--;
            this.f20557c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f20557c) {
                return a.this.j(this.f20556b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class f extends p.f<V> {
        public f() {
            super(a.this.f20576c);
        }

        @Override // p.f
        public final V c(int i10) {
            return a.this.k(i10);
        }

        @Override // p.f
        public final void e(int i10) {
            a.this.i(i10);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0241a c0241a = this.f20549d;
        if (c0241a != null) {
            return c0241a;
        }
        a<K, V>.C0241a c0241a2 = new C0241a();
        this.f20549d = c0241a2;
        return c0241a2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        a<K, V>.c cVar = this.f20550e;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f20550e = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(Collection<?> collection) {
        int i10 = this.f20576c;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f20576c;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.f20576c;
        int i10 = this.f20576c;
        int[] iArr = this.f20574a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20574a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20575b, size * 2);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20575b = objArrCopyOf;
        }
        if (this.f20576c != i10) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        a<K, V>.e eVar = this.f20551f;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f20551f = eVar2;
        return eVar2;
    }

    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
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
            return a.this.l(collection);
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
                if (aVar.f20576c == set.size()) {
                    return aVar.l(set);
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
            for (int i10 = aVar.f20576c - 1; i10 >= 0; i10--) {
                K kH = aVar.h(i10);
                iHashCode += kH == null ? 0 : kH.hashCode();
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
            int iF = aVar.f(obj);
            if (iF < 0) {
                return false;
            }
            aVar.i(iF);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return a.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (!collection.contains(aVar.h(i11))) {
                    aVar.i(i11);
                }
            }
            return i10 != aVar.f20576c;
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return a.this.f20576c;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = aVar.h(i11);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = aVar.h(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
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
            return a.this.c(obj) >= 0;
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
            int iC = aVar.c(obj);
            if (iC < 0) {
                return false;
            }
            aVar.i(iC);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (collection.contains(aVar.k(i11))) {
                    aVar.i(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (!collection.contains(aVar.k(i11))) {
                    aVar.i(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return a.this.f20576c;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = aVar.k(i11);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            a aVar = a.this;
            int i10 = aVar.f20576c;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = aVar.k(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }
    }
}
