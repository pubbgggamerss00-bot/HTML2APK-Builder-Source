package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class r1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2135f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List<r1<K, V>.a> f2136a = Collections.EMPTY_LIST;

    /* renamed from: b, reason: collision with root package name */
    public Map<K, V> f2137b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2138c;

    /* renamed from: d, reason: collision with root package name */
    public volatile r1<K, V>.c f2139d;

    /* renamed from: e, reason: collision with root package name */
    public Map<K, V> f2140e;

    public class a implements Map.Entry<K, V>, Comparable<r1<K, V>.a> {

        /* renamed from: a, reason: collision with root package name */
        public final K f2141a;

        /* renamed from: b, reason: collision with root package name */
        public V f2142b;

        public a() {
            throw null;
        }

        public a(K k10, V v10) {
            this.f2141a = k10;
            this.f2142b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f2141a.compareTo(((a) obj).f2141a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k10 = this.f2141a;
                    if (k10 == null ? key == null : k10.equals(key)) {
                        V v10 = this.f2142b;
                        Object value = entry.getValue();
                        if (v10 == null ? value == null : v10.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f2141a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f2142b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f2141a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f2142b;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i10 = r1.f2135f;
            r1.this.e();
            V v11 = this.f2142b;
            this.f2142b = v10;
            return v11;
        }

        public final String toString() {
            return this.f2141a + "=" + this.f2142b;
        }
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f2144a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2145b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2146c;

        public b() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f2146c == null) {
                this.f2146c = r1.this.f2137b.entrySet().iterator();
            }
            return this.f2146c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f2144a + 1;
            r1 r1Var = r1.this;
            return i10 < r1Var.f2136a.size() || (!r1Var.f2137b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f2145b = true;
            int i10 = this.f2144a + 1;
            this.f2144a = i10;
            r1 r1Var = r1.this;
            return i10 < r1Var.f2136a.size() ? r1Var.f2136a.get(this.f2144a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f2145b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2145b = false;
            int i10 = r1.f2135f;
            r1 r1Var = r1.this;
            r1Var.e();
            if (this.f2144a >= r1Var.f2136a.size()) {
                a().remove();
                return;
            }
            int i11 = this.f2144a;
            this.f2144a = i11 - 1;
            r1Var.k(i11);
        }
    }

    public class c extends AbstractSet<Map.Entry<K, V>> {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            r1.this.j((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            r1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = r1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            r1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return r1.this.size();
        }
    }

    public r1() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f2137b = map;
        this.f2140e = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(K k10) {
        int i10;
        int i11;
        int size = this.f2136a.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i10 = 0;
            while (i10 <= i12) {
                int i13 = (i10 + i12) / 2;
                int iCompareTo = k10.compareTo(this.f2136a.get(i13).f2141a);
                if (iCompareTo < 0) {
                    i12 = i13 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i13;
                    }
                    i10 = i13 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f2136a.get(i12).f2141a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i10 = 0;
                while (i10 <= i12) {
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        if (!this.f2136a.isEmpty()) {
            this.f2136a.clear();
        }
        if (this.f2137b.isEmpty()) {
            return;
        }
        this.f2137b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.f2137b.containsKey(comparable);
    }

    public final void e() {
        if (this.f2138c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2139d == null) {
            this.f2139d = new c();
        }
        return this.f2139d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return super.equals(obj);
        }
        r1 r1Var = (r1) obj;
        int size = size();
        if (size == r1Var.size()) {
            int size2 = this.f2136a.size();
            if (size2 != r1Var.f2136a.size()) {
                return ((AbstractSet) entrySet()).equals(r1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (f(i10).equals(r1Var.f(i10))) {
                }
            }
            if (size2 != size) {
                return this.f2137b.equals(r1Var.f2137b);
            }
            return true;
        }
        return false;
    }

    public final Map.Entry<K, V> f(int i10) {
        return this.f2136a.get(i10);
    }

    public final Set g() {
        return this.f2137b.isEmpty() ? Collections.EMPTY_SET : this.f2137b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? this.f2136a.get(iC).f2142b : this.f2137b.get(comparable);
    }

    public final SortedMap<K, V> h() {
        e();
        if (this.f2137b.isEmpty() && !(this.f2137b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2137b = treeMap;
            this.f2140e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2137b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2136a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f2136a.get(i10).hashCode();
        }
        return this.f2137b.size() > 0 ? this.f2137b.hashCode() + iHashCode : iHashCode;
    }

    public void i() {
        if (this.f2138c) {
            return;
        }
        this.f2137b = this.f2137b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2137b);
        this.f2140e = this.f2140e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2140e);
        this.f2138c = true;
    }

    public final V j(K k10, V v10) {
        e();
        int iC = c(k10);
        if (iC >= 0) {
            return this.f2136a.get(iC).setValue(v10);
        }
        e();
        if (this.f2136a.isEmpty() && !(this.f2136a instanceof ArrayList)) {
            this.f2136a = new ArrayList(16);
        }
        int i10 = -(iC + 1);
        if (i10 >= 16) {
            return h().put(k10, v10);
        }
        if (this.f2136a.size() == 16) {
            r1<K, V>.a aVarRemove = this.f2136a.remove(15);
            h().put(aVarRemove.f2141a, aVarRemove.f2142b);
        }
        this.f2136a.add(i10, new a(k10, v10));
        return null;
    }

    public final V k(int i10) {
        e();
        V v10 = this.f2136a.remove(i10).f2142b;
        if (!this.f2137b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = h().entrySet().iterator();
            List<r1<K, V>.a> list = this.f2136a;
            Map.Entry<K, V> next = it.next();
            list.add(new a(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return k(iC);
        }
        if (this.f2137b.isEmpty()) {
            return null;
        }
        return this.f2137b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2137b.size() + this.f2136a.size();
    }
}
