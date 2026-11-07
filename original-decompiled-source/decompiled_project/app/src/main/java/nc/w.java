package nc;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import nc.r;

/* loaded from: classes2.dex */
public final class w<K, V> extends x<K, V> implements NavigableMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final w<Comparable, Object> f18775g;

    /* renamed from: d, reason: collision with root package name */
    public final transient x0<K> f18776d;

    /* renamed from: e, reason: collision with root package name */
    public final transient r<V> f18777e;

    /* renamed from: f, reason: collision with root package name */
    public final transient w<K, V> f18778f;

    public class a extends t<K, V> {

        /* renamed from: nc.w$a$a, reason: collision with other inner class name */
        public class C0210a extends r<Map.Entry<K, V>> {
            public C0210a() {
            }

            @Override // nc.p
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i10) {
                a aVar = a.this;
                return new AbstractMap.SimpleImmutableEntry(w.this.f18776d.f18788g.get(i10), w.this.f18777e.get(i10));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return w.this.f18777e.size();
            }
        }

        public a() {
        }

        @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final e1<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // nc.v
        public final r<Map.Entry<K, V>> m() {
            return new C0210a();
        }
    }

    static {
        x0 x0VarT = y.t(n0.f18723a);
        r.a aVar = r.f18735b;
        f18775g = new w<>(x0VarT, u0.f18756e, null);
    }

    public w(x0<K> x0Var, r<V> rVar, w<K, V> wVar) {
        this.f18776d = x0Var;
        this.f18777e = rVar;
        this.f18778f = wVar;
    }

    @Override // nc.s
    public final v<Map.Entry<K, V>> c() {
        if (!isEmpty()) {
            return new a();
        }
        int i10 = v.f18759c;
        return w0.f18781j;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> ceilingEntry(K k10) {
        return tailMap(k10, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K ceilingKey(K k10) {
        Map.Entry<K, V> entryCeilingEntry = ceilingEntry(k10);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return this.f18776d.f18790d;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        x0<K> x0Var = this.f18776d;
        y<K> yVar = x0Var.f18791e;
        if (yVar != null) {
            return yVar;
        }
        x0 x0VarR = x0Var.r();
        x0Var.f18791e = x0VarR;
        x0VarR.f18791e = x0Var;
        return x0VarR;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        w<K, V> wVar = this.f18778f;
        if (wVar == null) {
            boolean zIsEmpty = isEmpty();
            x0<K> x0Var = this.f18776d;
            if (zIsEmpty) {
                o0 o0VarC = o0.a(x0Var.f18790d).c();
                return n0.f18723a.equals(o0VarC) ? f18775g : new w(y.t(o0VarC), u0.f18756e, null);
            }
            x0 x0VarR = x0Var.f18791e;
            if (x0VarR == null) {
                x0VarR = x0Var.r();
                x0Var.f18791e = x0VarR;
                x0VarR.f18791e = x0Var;
            }
            wVar = new w<>(x0VarR, this.f18777e.o(), this);
        }
        return wVar;
    }

    @Override // nc.s
    public final v<K> e() {
        throw new AssertionError("should never be called");
    }

    @Override // nc.s, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // nc.s
    public final p<V> f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().a().get(0);
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return this.f18776d.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> floorEntry(K k10) {
        return headMap(k10, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K floorKey(K k10) {
        Map.Entry<K, V> entryFloorEntry = floorEntry(k10);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    @Override // nc.s, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        int iBinarySearch;
        x0<K> x0Var = this.f18776d;
        x0Var.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(x0Var.f18788g, obj, x0Var.f18790d);
                if (iBinarySearch < 0) {
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f18777e.get(iBinarySearch);
    }

    @Override // nc.s
    /* renamed from: h */
    public final v keySet() {
        return this.f18776d;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> higherEntry(K k10) {
        return tailMap(k10, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final K higherKey(K k10) {
        Map.Entry<K, V> entryHigherEntry = higherEntry(k10);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // nc.s
    /* renamed from: i */
    public final p<V> values() {
        return this.f18777e;
    }

    public final w<K, V> j(int i10, int i11) {
        r<V> rVar = this.f18777e;
        if (i10 == 0 && i11 == rVar.size()) {
            return this;
        }
        x0<K> x0Var = this.f18776d;
        if (i10 != i11) {
            return new w<>(x0Var.x(i10, i11), rVar.subList(i10, i11), null);
        }
        Comparator<? super K> comparator = x0Var.f18790d;
        return n0.f18723a.equals(comparator) ? (w<K, V>) f18775g : new w<>(y.t(comparator), u0.f18756e, null);
    }

    @Override // java.util.NavigableMap
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final w<K, V> headMap(K k10, boolean z10) {
        k10.getClass();
        return j(0, this.f18776d.y(k10, z10));
    }

    @Override // nc.s, java.util.Map
    public final Set keySet() {
        return this.f18776d;
    }

    @Override // java.util.NavigableMap
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final w<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
        k10.getClass();
        k11.getClass();
        if (this.f18776d.f18790d.compare(k10, k11) <= 0) {
            return headMap(k11, z11).tailMap(k10, z10);
        }
        throw new IllegalArgumentException(d0.h0.b("expected fromKey <= toKey but %s > %s", k10, k11));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return super.entrySet().a().get(this.f18777e.size() - 1);
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return this.f18776d.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry<K, V> lowerEntry(K k10) {
        return headMap(k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final K lowerKey(K k10) {
        Map.Entry<K, V> entryLowerEntry = lowerEntry(k10);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final w<K, V> tailMap(K k10, boolean z10) {
        k10.getClass();
        return j(this.f18776d.A(k10, z10), this.f18777e.size());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f18776d;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18777e.size();
    }

    @Override // nc.s, java.util.Map
    public final Collection values() {
        return this.f18777e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
