package nc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import nc.p;

/* loaded from: classes2.dex */
public abstract class s<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient v<Map.Entry<K, V>> f18741a;

    /* renamed from: b, reason: collision with root package name */
    public transient v<K> f18742b;

    /* renamed from: c, reason: collision with root package name */
    public transient p<V> f18743c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f18744a;

        /* renamed from: b, reason: collision with root package name */
        public int f18745b = 0;

        public a(int i10) {
            this.f18744a = new Object[i10 * 2];
        }

        public s<K, V> a() {
            int i10 = this.f18745b;
            Object[] objArr = this.f18744a;
            if (i10 == 0) {
                return v0.f18761g;
            }
            if (i10 == 1) {
                g.a(objArr[0], objArr[1]);
                return new v0(null, objArr, 1);
            }
            g8.w.f(i10, objArr.length >> 1);
            return new v0(v0.j(objArr, i10, v.i(i10), 0), objArr, i10);
        }

        public a<K, V> b(K k10, V v10) {
            int i10 = (this.f18745b + 1) * 2;
            Object[] objArr = this.f18744a;
            if (i10 > objArr.length) {
                this.f18744a = Arrays.copyOf(objArr, p.b.a(objArr.length, i10));
            }
            g.a(k10, v10);
            Object[] objArr2 = this.f18744a;
            int i11 = this.f18745b;
            int i12 = i11 * 2;
            objArr2[i12] = k10;
            objArr2[i12 + 1] = v10;
            this.f18745b = i11 + 1;
            return this;
        }
    }

    public abstract v<Map.Entry<K, V>> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract v<K> e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract p<V> f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public v<Map.Entry<K, V>> entrySet() {
        v<Map.Entry<K, V>> vVar = this.f18741a;
        if (vVar != null) {
            return vVar;
        }
        v<Map.Entry<K, V>> vVarC = c();
        this.f18741a = vVarC;
        return vVarC;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public v<K> keySet() {
        v<K> vVar = this.f18742b;
        if (vVar != null) {
            return vVar;
        }
        v<K> vVarE = e();
        this.f18742b = vVarE;
        return vVarE;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p<V> values() {
        p<V> pVar = this.f18743c;
        if (pVar != null) {
            return pVar;
        }
        p<V> pVarF = f();
        this.f18743c = pVarF;
        return pVarF;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        g.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
