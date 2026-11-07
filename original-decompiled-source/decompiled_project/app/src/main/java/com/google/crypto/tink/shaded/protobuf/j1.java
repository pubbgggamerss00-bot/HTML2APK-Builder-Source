package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6703g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f6704a;

    /* renamed from: b, reason: collision with root package name */
    public List<j1<K, V>.b> f6705b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map<K, V> f6706c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6707d;

    /* renamed from: e, reason: collision with root package name */
    public volatile j1<K, V>.d f6708e;

    /* renamed from: f, reason: collision with root package name */
    public Map<K, V> f6709f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0073a f6710a = new C0073a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f6711b = new b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$a$a, reason: collision with other inner class name */
        public class C0073a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f6710a;
            }
        }
    }

    public class b implements Map.Entry<K, V>, Comparable<j1<K, V>.b> {

        /* renamed from: a, reason: collision with root package name */
        public final K f6712a;

        /* renamed from: b, reason: collision with root package name */
        public V f6713b;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f6712a = k10;
            this.f6713b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f6712a.compareTo(((b) obj).f6712a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k10 = this.f6712a;
                    if (k10 == null ? key == null : k10.equals(key)) {
                        V v10 = this.f6713b;
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
            return this.f6712a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f6713b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f6712a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f6713b;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i10 = j1.f6703g;
            j1.this.e();
            V v11 = this.f6713b;
            this.f6713b = v10;
            return v11;
        }

        public final String toString() {
            return this.f6712a + "=" + this.f6713b;
        }
    }

    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public int f6715a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6716b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f6717c;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f6717c == null) {
                this.f6717c = j1.this.f6706c.entrySet().iterator();
            }
            return this.f6717c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f6715a + 1;
            j1 j1Var = j1.this;
            return i10 < j1Var.f6705b.size() || (!j1Var.f6706c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f6716b = true;
            int i10 = this.f6715a + 1;
            this.f6715a = i10;
            j1 j1Var = j1.this;
            return i10 < j1Var.f6705b.size() ? j1Var.f6705b.get(this.f6715a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f6716b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f6716b = false;
            int i10 = j1.f6703g;
            j1 j1Var = j1.this;
            j1Var.e();
            if (this.f6715a >= j1Var.f6705b.size()) {
                a().remove();
                return;
            }
            int i11 = this.f6715a;
            this.f6715a = i11 - 1;
            j1Var.k(i11);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            j1.this.j((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return j1.this.size();
        }
    }

    public j1(int i10) {
        this.f6704a = i10;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f6706c = map;
        this.f6709f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(K k10) {
        int i10;
        int i11;
        int size = this.f6705b.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i10 = 0;
            while (i10 <= i12) {
                int i13 = (i10 + i12) / 2;
                int iCompareTo = k10.compareTo(this.f6705b.get(i13).f6712a);
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
            int iCompareTo2 = k10.compareTo(this.f6705b.get(i12).f6712a);
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
        if (!this.f6705b.isEmpty()) {
            this.f6705b.clear();
        }
        if (this.f6706c.isEmpty()) {
            return;
        }
        this.f6706c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.f6706c.containsKey(comparable);
    }

    public final void e() {
        if (this.f6707d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f6708e == null) {
            this.f6708e = new d();
        }
        return this.f6708e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size == j1Var.size()) {
            int size2 = this.f6705b.size();
            if (size2 != j1Var.f6705b.size()) {
                return ((AbstractSet) entrySet()).equals(j1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (f(i10).equals(j1Var.f(i10))) {
                }
            }
            if (size2 != size) {
                return this.f6706c.equals(j1Var.f6706c);
            }
            return true;
        }
        return false;
    }

    public final Map.Entry<K, V> f(int i10) {
        return this.f6705b.get(i10);
    }

    public final Iterable<Map.Entry<K, V>> g() {
        return this.f6706c.isEmpty() ? a.f6711b : this.f6706c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? this.f6705b.get(iC).f6713b : this.f6706c.get(comparable);
    }

    public final SortedMap<K, V> h() {
        e();
        if (this.f6706c.isEmpty() && !(this.f6706c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6706c = treeMap;
            this.f6709f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6706c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6705b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f6705b.get(i10).hashCode();
        }
        return this.f6706c.size() > 0 ? this.f6706c.hashCode() + iHashCode : iHashCode;
    }

    public void i() {
        if (this.f6707d) {
            return;
        }
        this.f6706c = this.f6706c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6706c);
        this.f6709f = this.f6709f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6709f);
        this.f6707d = true;
    }

    public final V j(K k10, V v10) {
        e();
        int iC = c(k10);
        if (iC >= 0) {
            return this.f6705b.get(iC).setValue(v10);
        }
        e();
        boolean zIsEmpty = this.f6705b.isEmpty();
        int i10 = this.f6704a;
        if (zIsEmpty && !(this.f6705b instanceof ArrayList)) {
            this.f6705b = new ArrayList(i10);
        }
        int i11 = -(iC + 1);
        if (i11 >= i10) {
            return h().put(k10, v10);
        }
        if (this.f6705b.size() == i10) {
            j1<K, V>.b bVarRemove = this.f6705b.remove(i10 - 1);
            h().put(bVarRemove.f6712a, bVarRemove.f6713b);
        }
        this.f6705b.add(i11, new b(k10, v10));
        return null;
    }

    public final V k(int i10) {
        e();
        V v10 = this.f6705b.remove(i10).f6713b;
        if (!this.f6706c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = h().entrySet().iterator();
            List<j1<K, V>.b> list = this.f6705b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
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
        if (this.f6706c.isEmpty()) {
            return null;
        }
        return this.f6706c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6706c.size() + this.f6705b.size();
    }
}
