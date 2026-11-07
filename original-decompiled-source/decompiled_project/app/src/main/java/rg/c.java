package rg;

import c9.u1;
import fh.c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class c<K, V> implements Map<K, V>, Serializable, fh.c {

    /* renamed from: p, reason: collision with root package name */
    public static final c f23550p;

    /* renamed from: a, reason: collision with root package name */
    public K[] f23551a;

    /* renamed from: b, reason: collision with root package name */
    public V[] f23552b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f23553c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f23554d;

    /* renamed from: e, reason: collision with root package name */
    public int f23555e;

    /* renamed from: f, reason: collision with root package name */
    public int f23556f;

    /* renamed from: g, reason: collision with root package name */
    public int f23557g;

    /* renamed from: h, reason: collision with root package name */
    public int f23558h;

    /* renamed from: j, reason: collision with root package name */
    public int f23559j;

    /* renamed from: k, reason: collision with root package name */
    public rg.e<K> f23560k;

    /* renamed from: l, reason: collision with root package name */
    public rg.f<V> f23561l;

    /* renamed from: m, reason: collision with root package name */
    public rg.d<K, V> f23562m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23563n;

    public static final class a {
    }

    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, fh.a {
        @Override // java.util.Iterator
        public final Object next() {
            c();
            int i10 = this.f23568b;
            c<K, V> cVar = this.f23567a;
            if (i10 >= cVar.f23556f) {
                throw new NoSuchElementException();
            }
            this.f23568b = i10 + 1;
            this.f23569c = i10;
            C0263c c0263c = new C0263c(cVar, i10);
            e();
            return c0263c;
        }
    }

    /* renamed from: rg.c$c, reason: collision with other inner class name */
    public static final class C0263c<K, V> implements Map.Entry<K, V>, c.a {

        /* renamed from: a, reason: collision with root package name */
        public final c<K, V> f23564a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23565b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23566c;

        public C0263c(c<K, V> map, int i10) {
            r.e(map, "map");
            this.f23564a = map;
            this.f23565b = i10;
            this.f23566c = map.f23558h;
        }

        public final void c() {
            if (this.f23564a.f23558h != this.f23566c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return r.a(entry.getKey(), getKey()) && r.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            c();
            return this.f23564a.f23551a[this.f23565b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            c();
            V[] vArr = this.f23564a.f23552b;
            r.b(vArr);
            return vArr[this.f23565b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            c();
            c<K, V> cVar = this.f23564a;
            cVar.f();
            V[] vArr = cVar.f23552b;
            if (vArr == null) {
                int length = cVar.f23551a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                cVar.f23552b = vArr;
            }
            int i10 = this.f23565b;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final c<K, V> f23567a;

        /* renamed from: b, reason: collision with root package name */
        public int f23568b;

        /* renamed from: c, reason: collision with root package name */
        public int f23569c;

        /* renamed from: d, reason: collision with root package name */
        public int f23570d;

        public d(c<K, V> map) {
            r.e(map, "map");
            this.f23567a = map;
            this.f23569c = -1;
            this.f23570d = map.f23558h;
            e();
        }

        public final void c() {
            if (this.f23567a.f23558h != this.f23570d) {
                throw new ConcurrentModificationException();
            }
        }

        public final void e() {
            while (true) {
                int i10 = this.f23568b;
                c<K, V> cVar = this.f23567a;
                if (i10 >= cVar.f23556f || cVar.f23553c[i10] >= 0) {
                    return;
                } else {
                    this.f23568b = i10 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f23568b < this.f23567a.f23556f;
        }

        public final void remove() {
            c();
            if (this.f23569c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            c<K, V> cVar = this.f23567a;
            cVar.f();
            cVar.p(this.f23569c);
            this.f23569c = -1;
            this.f23570d = cVar.f23558h;
        }
    }

    public static final class e<K, V> extends d<K, V> implements Iterator<K>, fh.a {
        @Override // java.util.Iterator
        public final K next() {
            c();
            int i10 = this.f23568b;
            c<K, V> cVar = this.f23567a;
            if (i10 >= cVar.f23556f) {
                throw new NoSuchElementException();
            }
            this.f23568b = i10 + 1;
            this.f23569c = i10;
            K k10 = cVar.f23551a[i10];
            e();
            return k10;
        }
    }

    public static final class f<K, V> extends d<K, V> implements Iterator<V>, fh.a {
        @Override // java.util.Iterator
        public final V next() {
            c();
            int i10 = this.f23568b;
            c<K, V> cVar = this.f23567a;
            if (i10 >= cVar.f23556f) {
                throw new NoSuchElementException();
            }
            this.f23568b = i10 + 1;
            this.f23569c = i10;
            V[] vArr = cVar.f23552b;
            r.b(vArr);
            V v10 = vArr[this.f23569c];
            e();
            return v10;
        }
    }

    static {
        c cVar = new c(0);
        cVar.f23563n = true;
        f23550p = cVar;
    }

    public c() {
        this(8);
    }

    public final int c(K k10) {
        f();
        while (true) {
            int iN = n(k10);
            int i10 = this.f23555e * 2;
            int length = this.f23554d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f23554d;
                int i12 = iArr[iN];
                if (i12 <= 0) {
                    int i13 = this.f23556f;
                    K[] kArr = this.f23551a;
                    if (i13 < kArr.length) {
                        int i14 = i13 + 1;
                        this.f23556f = i14;
                        kArr[i13] = k10;
                        this.f23553c[i13] = iN;
                        iArr[iN] = i14;
                        this.f23559j++;
                        this.f23558h++;
                        if (i11 > this.f23555e) {
                            this.f23555e = i11;
                        }
                        return i13;
                    }
                    j(1);
                } else {
                    if (r.a(this.f23551a[i12 - 1], k10)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        o(this.f23554d.length * 2);
                        break;
                    }
                    iN = iN == 0 ? this.f23554d.length - 1 : iN - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i10 = this.f23556f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f23553c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f23554d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        u1.e(this.f23551a, 0, this.f23556f);
        V[] vArr = this.f23552b;
        if (vArr != null) {
            u1.e(vArr, 0, this.f23556f);
        }
        this.f23559j = 0;
        this.f23556f = 0;
        this.f23558h++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m(obj) >= 0;
    }

    public final c e() {
        f();
        this.f23563n = true;
        if (this.f23559j > 0) {
            return this;
        }
        c cVar = f23550p;
        r.c(cVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return cVar;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        rg.d<K, V> dVar = this.f23562m;
        if (dVar != null) {
            return dVar;
        }
        rg.d<K, V> dVar2 = new rg.d<>(this);
        this.f23562m = dVar2;
        return dVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f23559j == map.size() && h(map.entrySet());
    }

    public final void f() {
        if (this.f23563n) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(boolean z10) {
        int i10;
        V[] vArr = this.f23552b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f23556f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f23553c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.f23551a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f23554d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        u1.e(this.f23551a, i12, i10);
        if (vArr != null) {
            u1.e(vArr, i12, this.f23556f);
        }
        this.f23556f = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        V[] vArr = this.f23552b;
        r.b(vArr);
        return vArr[iK];
    }

    public final boolean h(Collection<?> m10) {
        r.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            int i11 = bVar.f23568b;
            c<K, V> cVar = bVar.f23567a;
            if (i11 >= cVar.f23556f) {
                throw new NoSuchElementException();
            }
            bVar.f23568b = i11 + 1;
            bVar.f23569c = i11;
            K k10 = cVar.f23551a[i11];
            int iHashCode = k10 != null ? k10.hashCode() : 0;
            V[] vArr = cVar.f23552b;
            r.b(vArr);
            V v10 = vArr[bVar.f23569c];
            int iHashCode2 = v10 != null ? v10.hashCode() : 0;
            bVar.e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final boolean i(Map.Entry<? extends K, ? extends V> entry) {
        r.e(entry, "entry");
        int iK = k(entry.getKey());
        if (iK < 0) {
            return false;
        }
        V[] vArr = this.f23552b;
        r.b(vArr);
        return r.a(vArr[iK], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23559j == 0;
    }

    public final void j(int i10) {
        V[] vArr;
        K[] kArr = this.f23551a;
        int length = kArr.length;
        int i11 = this.f23556f;
        int i12 = length - i11;
        int i13 = i11 - this.f23559j;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= kArr.length / 4) {
            g(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > kArr.length) {
            int length2 = kArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i15);
            r.d(kArr2, "copyOf(...)");
            this.f23551a = kArr2;
            V[] vArr2 = this.f23552b;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i15);
                r.d(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.f23552b = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.f23553c, i15);
            r.d(iArrCopyOf, "copyOf(...)");
            this.f23553c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f23554d.length) {
                o(iHighestOneBit);
            }
        }
    }

    public final int k(K k10) {
        int iN = n(k10);
        int i10 = this.f23555e;
        while (true) {
            int i11 = this.f23554d[iN];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (r.a(this.f23551a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iN = iN == 0 ? this.f23554d.length - 1 : iN - 1;
        }
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        rg.e<K> eVar = this.f23560k;
        if (eVar != null) {
            return eVar;
        }
        rg.e<K> eVar2 = new rg.e<>(this);
        this.f23560k = eVar2;
        return eVar2;
    }

    public final int m(V v10) {
        int i10 = this.f23556f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f23553c[i10] >= 0) {
                V[] vArr = this.f23552b;
                r.b(vArr);
                if (r.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    public final int n(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f23557g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f23553c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i10) {
        this.f23558h++;
        int i11 = 0;
        if (this.f23556f > this.f23559j) {
            g(false);
        }
        this.f23554d = new int[i10];
        this.f23557g = Integer.numberOfLeadingZeros(i10) + 1;
        while (i11 < this.f23556f) {
            int i12 = i11 + 1;
            int iN = n(this.f23551a[i11]);
            int i13 = this.f23555e;
            while (true) {
                int[] iArr = this.f23554d;
                if (iArr[iN] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iN = iN == 0 ? iArr.length - 1 : iN - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i10) {
        K[] kArr = this.f23551a;
        r.e(kArr, "<this>");
        kArr[i10] = null;
        V[] vArr = this.f23552b;
        if (vArr != null) {
            vArr[i10] = null;
        }
        int length = this.f23553c[i10];
        int i11 = this.f23555e * 2;
        int length2 = this.f23554d.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        while (true) {
            length = length == 0 ? this.f23554d.length - 1 : length - 1;
            i13++;
            if (i13 > this.f23555e) {
                this.f23554d[i14] = 0;
                break;
            }
            int[] iArr = this.f23554d;
            int i15 = iArr[length];
            if (i15 == 0) {
                iArr[i14] = 0;
                break;
            }
            if (i15 < 0) {
                iArr[i14] = -1;
            } else {
                int i16 = i15 - 1;
                int iN = n(this.f23551a[i16]) - length;
                int[] iArr2 = this.f23554d;
                if ((iN & (iArr2.length - 1)) >= i13) {
                    iArr2[i14] = i15;
                    this.f23553c[i16] = i14;
                }
                i12--;
                if (i12 >= 0) {
                    this.f23554d[i14] = -1;
                    break;
                }
            }
            i14 = length;
            i13 = 0;
            i12--;
            if (i12 >= 0) {
            }
        }
        this.f23553c[i10] = -1;
        this.f23559j--;
        this.f23558h++;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        f();
        int iC = c(k10);
        V[] vArr = this.f23552b;
        if (vArr == null) {
            int length = this.f23551a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f23552b = vArr;
        }
        if (iC >= 0) {
            vArr[iC] = v10;
            return null;
        }
        int i10 = (-iC) - 1;
        V v11 = vArr[i10];
        vArr[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        r.e(from, "from");
        f();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        j(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iC = c(entry.getKey());
            V[] vArr = this.f23552b;
            if (vArr == null) {
                int length = this.f23551a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f23552b = vArr;
            }
            if (iC >= 0) {
                vArr[iC] = entry.getValue();
            } else {
                int i10 = (-iC) - 1;
                if (!r.a(entry.getValue(), vArr[i10])) {
                    vArr[i10] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        f();
        int iK = k(obj);
        if (iK < 0) {
            return null;
        }
        V[] vArr = this.f23552b;
        r.b(vArr);
        V v10 = vArr[iK];
        p(iK);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23559j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f23559j * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i10 = 0;
        while (bVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = bVar.f23568b;
            c<K, V> cVar = bVar.f23567a;
            if (i11 >= cVar.f23556f) {
                throw new NoSuchElementException();
            }
            bVar.f23568b = i11 + 1;
            bVar.f23569c = i11;
            K k10 = cVar.f23551a[i11];
            if (k10 == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(k10);
            }
            sb.append('=');
            V[] vArr = cVar.f23552b;
            r.b(vArr);
            V v10 = vArr[bVar.f23569c];
            if (v10 == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(v10);
            }
            bVar.e();
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        r.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        rg.f<V> fVar = this.f23561l;
        if (fVar != null) {
            return fVar;
        }
        rg.f<V> fVar2 = new rg.f<>(this);
        this.f23561l = fVar2;
        return fVar2;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f23551a = kArr;
        this.f23552b = null;
        this.f23553c = iArr;
        this.f23554d = new int[iHighestOneBit];
        this.f23555e = 2;
        this.f23556f = 0;
        this.f23557g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
