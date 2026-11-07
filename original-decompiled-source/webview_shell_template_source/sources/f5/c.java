package f5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c<K, V> implements Map<K, V>, Serializable, q5.b {
    public static final c F;
    public int A;
    public f5.e<K> B;
    public f5.f<V> C;
    public f5.d<K, V> D;
    public boolean E;
    public K[] s;

    /* renamed from: t, reason: collision with root package name */
    public V[] f13063t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f13064u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f13065v;

    /* renamed from: w, reason: collision with root package name */
    public int f13066w;

    /* renamed from: x, reason: collision with root package name */
    public int f13067x;

    /* renamed from: y, reason: collision with root package name */
    public int f13068y;

    /* renamed from: z, reason: collision with root package name */
    public int f13069z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, q5.a {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i6 = this.f13071t;
            c<K, V> cVar = this.s;
            if (i6 >= cVar.f13067x) {
                throw new NoSuchElementException();
            }
            this.f13071t = i6 + 1;
            this.f13072u = i6;
            C0060c c0060c = new C0060c(cVar, i6);
            b();
            return c0060c;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: f5.c$c, reason: collision with other inner class name */
    public static final class C0060c<K, V> implements Map.Entry<K, V>, q5.a {
        public final c<K, V> s;

        /* renamed from: t, reason: collision with root package name */
        public final int f13070t;

        public C0060c(c<K, V> cVar, int i6) {
            j.e("map", cVar);
            this.s = cVar;
            this.f13070t = i6;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.s.s[this.f13070t];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.s.f13063t;
            j.b(vArr);
            return vArr[this.f13070t];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            c<K, V> cVar = this.s;
            cVar.b();
            V[] vArr = cVar.f13063t;
            if (vArr == null) {
                int length = cVar.s.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                cVar.f13063t = vArr;
            }
            int i6 = this.f13070t;
            V v6 = vArr[i6];
            vArr[i6] = v2;
            return v6;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d<K, V> {
        public final c<K, V> s;

        /* renamed from: t, reason: collision with root package name */
        public int f13071t;

        /* renamed from: u, reason: collision with root package name */
        public int f13072u;

        /* renamed from: v, reason: collision with root package name */
        public int f13073v;

        public d(c<K, V> cVar) {
            j.e("map", cVar);
            this.s = cVar;
            this.f13072u = -1;
            this.f13073v = cVar.f13069z;
            b();
        }

        public final void a() {
            if (this.s.f13069z != this.f13073v) {
                throw new ConcurrentModificationException();
            }
        }

        public final void b() {
            while (true) {
                int i6 = this.f13071t;
                c<K, V> cVar = this.s;
                if (i6 >= cVar.f13067x || cVar.f13064u[i6] >= 0) {
                    return;
                } else {
                    this.f13071t = i6 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f13071t < this.s.f13067x;
        }

        public final void remove() {
            a();
            if (this.f13072u == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            c<K, V> cVar = this.s;
            cVar.b();
            cVar.k(this.f13072u);
            this.f13072u = -1;
            this.f13073v = cVar.f13069z;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, q5.a {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i6 = this.f13071t;
            c<K, V> cVar = this.s;
            if (i6 >= cVar.f13067x) {
                throw new NoSuchElementException();
            }
            this.f13071t = i6 + 1;
            this.f13072u = i6;
            K k6 = cVar.s[i6];
            b();
            return k6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, q5.a {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i6 = this.f13071t;
            c<K, V> cVar = this.s;
            if (i6 >= cVar.f13067x) {
                throw new NoSuchElementException();
            }
            this.f13071t = i6 + 1;
            this.f13072u = i6;
            V[] vArr = cVar.f13063t;
            j.b(vArr);
            V v2 = vArr[this.f13072u];
            b();
            return v2;
        }
    }

    static {
        c cVar = new c(0);
        cVar.E = true;
        F = cVar;
    }

    public c(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i6];
        int[] iArr = new int[i6];
        int iHighestOneBit = Integer.highestOneBit((i6 < 1 ? 1 : i6) * 3);
        this.s = kArr;
        this.f13063t = null;
        this.f13064u = iArr;
        this.f13065v = new int[iHighestOneBit];
        this.f13066w = 2;
        this.f13067x = 0;
        this.f13068y = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(K k6) {
        b();
        while (true) {
            int i6 = i(k6);
            int i7 = this.f13066w * 2;
            int length = this.f13065v.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f13065v;
                int i9 = iArr[i6];
                if (i9 <= 0) {
                    int i10 = this.f13067x;
                    K[] kArr = this.s;
                    if (i10 < kArr.length) {
                        int i11 = i10 + 1;
                        this.f13067x = i11;
                        kArr[i10] = k6;
                        this.f13064u[i10] = i6;
                        iArr[i6] = i11;
                        this.A++;
                        this.f13069z++;
                        if (i8 > this.f13066w) {
                            this.f13066w = i8;
                        }
                        return i10;
                    }
                    f(1);
                } else {
                    if (j.a(this.s[i9 - 1], k6)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i7) {
                        j(this.f13065v.length * 2);
                        break;
                    }
                    i6 = i6 == 0 ? this.f13065v.length - 1 : i6 - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.E) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z6) {
        int i6;
        V[] vArr = this.f13063t;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i6 = this.f13067x;
            if (i7 >= i6) {
                break;
            }
            int[] iArr = this.f13064u;
            int i9 = iArr[i7];
            if (i9 >= 0) {
                K[] kArr = this.s;
                kArr[i8] = kArr[i7];
                if (vArr != null) {
                    vArr[i8] = vArr[i7];
                }
                if (z6) {
                    iArr[i8] = i9;
                    this.f13065v[i9] = i8 + 1;
                }
                i8++;
            }
            i7++;
        }
        f5.b.l(this.s, i8, i6);
        if (vArr != null) {
            f5.b.l(vArr, i8, this.f13067x);
        }
        this.f13067x = i8;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i6 = this.f13067x - 1;
        if (i6 >= 0) {
            int i7 = 0;
            while (true) {
                int[] iArr = this.f13064u;
                int i8 = iArr[i7];
                if (i8 >= 0) {
                    this.f13065v[i8] = 0;
                    iArr[i7] = -1;
                }
                if (i7 == i6) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        f5.b.l(this.s, 0, this.f13067x);
        V[] vArr = this.f13063t;
        if (vArr != null) {
            f5.b.l(vArr, 0, this.f13067x);
        }
        this.A = 0;
        this.f13067x = 0;
        this.f13069z++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection<?> collection) {
        j.e("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry<? extends K, ? extends V> entry) {
        j.e("entry", entry);
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        V[] vArr = this.f13063t;
        j.b(vArr);
        return j.a(vArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        f5.d<K, V> dVar = this.D;
        if (dVar != null) {
            return dVar;
        }
        f5.d<K, V> dVar2 = new f5.d<>(this);
        this.D = dVar2;
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
        return this.A == map.size() && d(map.entrySet());
    }

    public final void f(int i6) {
        V[] vArr;
        K[] kArr = this.s;
        int length = kArr.length;
        int i7 = this.f13067x;
        int i8 = length - i7;
        int i9 = i7 - this.A;
        if (i8 < i6 && i8 + i9 >= i6 && i9 >= kArr.length / 4) {
            c(true);
            return;
        }
        int i10 = i7 + i6;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > kArr.length) {
            int length2 = kArr.length;
            int i11 = length2 + (length2 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i11);
            j.d("copyOf(...)", kArr2);
            this.s = kArr2;
            V[] vArr2 = this.f13063t;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i11);
                j.d("copyOf(...)", vArr);
            } else {
                vArr = null;
            }
            this.f13063t = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.f13064u, i11);
            j.d("copyOf(...)", iArrCopyOf);
            this.f13064u = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i11 >= 1 ? i11 : 1) * 3);
            if (iHighestOneBit > this.f13065v.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(K k6) {
        int i6 = i(k6);
        int i7 = this.f13066w;
        while (true) {
            int i8 = this.f13065v[i6];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (j.a(this.s[i9], k6)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            i6 = i6 == 0 ? this.f13065v.length - 1 : i6 - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        V[] vArr = this.f13063t;
        j.b(vArr);
        return vArr[iG];
    }

    public final int h(V v2) {
        int i6 = this.f13067x;
        while (true) {
            i6--;
            if (i6 < 0) {
                return -1;
            }
            if (this.f13064u[i6] >= 0) {
                V[] vArr = this.f13063t;
                j.b(vArr);
                if (j.a(vArr[i6], v2)) {
                    return i6;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i6 = 0;
        while (bVar.hasNext()) {
            int i7 = bVar.f13071t;
            c<K, V> cVar = bVar.s;
            if (i7 >= cVar.f13067x) {
                throw new NoSuchElementException();
            }
            bVar.f13071t = i7 + 1;
            bVar.f13072u = i7;
            K k6 = cVar.s[i7];
            int iHashCode = k6 != null ? k6.hashCode() : 0;
            V[] vArr = cVar.f13063t;
            j.b(vArr);
            V v2 = vArr[bVar.f13072u];
            int iHashCode2 = v2 != null ? v2.hashCode() : 0;
            bVar.b();
            i6 += iHashCode ^ iHashCode2;
        }
        return i6;
    }

    public final int i(K k6) {
        return ((k6 != null ? k6.hashCode() : 0) * (-1640531527)) >>> this.f13068y;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f13064u[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i6) {
        this.f13069z++;
        int i7 = 0;
        if (this.f13067x > this.A) {
            c(false);
        }
        this.f13065v = new int[i6];
        this.f13068y = Integer.numberOfLeadingZeros(i6) + 1;
        while (i7 < this.f13067x) {
            int i8 = i7 + 1;
            int i9 = i(this.s[i7]);
            int i10 = this.f13066w;
            while (true) {
                int[] iArr = this.f13065v;
                if (iArr[i9] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i9 = i9 == 0 ? iArr.length - 1 : i9 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i6) {
        K[] kArr = this.s;
        j.e("<this>", kArr);
        kArr[i6] = null;
        V[] vArr = this.f13063t;
        if (vArr != null) {
            vArr[i6] = null;
        }
        int length = this.f13064u[i6];
        int i7 = this.f13066w * 2;
        int length2 = this.f13065v.length / 2;
        if (i7 > length2) {
            i7 = length2;
        }
        int i8 = i7;
        int i9 = 0;
        int i10 = length;
        while (true) {
            length = length == 0 ? this.f13065v.length - 1 : length - 1;
            i9++;
            if (i9 > this.f13066w) {
                this.f13065v[i10] = 0;
                break;
            }
            int[] iArr = this.f13065v;
            int i11 = iArr[length];
            if (i11 == 0) {
                iArr[i10] = 0;
                break;
            }
            if (i11 < 0) {
                iArr[i10] = -1;
            } else {
                int i12 = i11 - 1;
                int i13 = i(this.s[i12]) - length;
                int[] iArr2 = this.f13065v;
                if ((i13 & (iArr2.length - 1)) >= i9) {
                    iArr2[i10] = i11;
                    this.f13064u[i12] = i10;
                }
                i8--;
                if (i8 >= 0) {
                    this.f13065v[i10] = -1;
                    break;
                }
            }
            i10 = length;
            i9 = 0;
            i8--;
            if (i8 >= 0) {
            }
        }
        this.f13064u[i6] = -1;
        this.A--;
        this.f13069z++;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        f5.e<K> eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        f5.e<K> eVar2 = new f5.e<>(this);
        this.B = eVar2;
        return eVar2;
    }

    @Override // java.util.Map
    public final V put(K k6, V v2) {
        b();
        int iA = a(k6);
        V[] vArr = this.f13063t;
        if (vArr == null) {
            int length = this.s.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f13063t = vArr;
        }
        if (iA >= 0) {
            vArr[iA] = v2;
            return null;
        }
        int i6 = (-iA) - 1;
        V v6 = vArr[i6];
        vArr[i6] = v2;
        return v6;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        j.e("from", map);
        b();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            V[] vArr = this.f13063t;
            if (vArr == null) {
                int length = this.s.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f13063t = vArr;
            }
            if (iA >= 0) {
                vArr[iA] = entry.getValue();
            } else {
                int i6 = (-iA) - 1;
                if (!j.a(entry.getValue(), vArr[i6])) {
                    vArr[i6] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        b();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        V[] vArr = this.f13063t;
        j.b(vArr);
        V v2 = vArr[iG];
        k(iG);
        return v2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.A * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i6 = 0;
        while (bVar.hasNext()) {
            if (i6 > 0) {
                sb.append(", ");
            }
            int i7 = bVar.f13071t;
            c<K, V> cVar = bVar.s;
            if (i7 >= cVar.f13067x) {
                throw new NoSuchElementException();
            }
            bVar.f13071t = i7 + 1;
            bVar.f13072u = i7;
            K k6 = cVar.s[i7];
            if (k6 == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(k6);
            }
            sb.append('=');
            V[] vArr = cVar.f13063t;
            j.b(vArr);
            V v2 = vArr[bVar.f13072u];
            if (v2 == cVar) {
                sb.append("(this Map)");
            } else {
                sb.append(v2);
            }
            bVar.b();
            i6++;
        }
        sb.append("}");
        String string = sb.toString();
        j.d("toString(...)", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        f5.f<V> fVar = this.C;
        if (fVar != null) {
            return fVar;
        }
        f5.f<V> fVar2 = new f5.f<>(this);
        this.C = fVar2;
        return fVar2;
    }
}
