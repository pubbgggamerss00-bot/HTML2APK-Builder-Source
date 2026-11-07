package wf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e<K, V> implements Map<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f31531a;

    public class a implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f31532a;

        public a(int i10) {
            this.f31532a = i10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return getKey().equals(aVar.getKey()) && getValue().equals(aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return (K) e.this.f31531a[this.f31532a];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return (V) e.this.f31531a[this.f31532a + 1];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (v10 == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            V v11 = (V) getValue();
            e.this.f31531a[this.f31532a + 1] = v10;
            return v11;
        }
    }

    public final int c(Object obj) {
        if (!isEmpty() && obj != null) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f31531a;
                if (i10 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i10])) {
                    return i10;
                }
                i10 += 2;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f31531a = null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i10 = -1;
        if (!isEmpty() && obj != null) {
            int i11 = 1;
            while (true) {
                Object[] objArr = this.f31531a;
                if (i11 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i11])) {
                    i10 = i11;
                    break;
                }
                i11 += 2;
            }
        }
        return i10 >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < this.f31531a.length; i10 += 2) {
            linkedHashSet.add(new a(i10));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return null;
        }
        return (V) this.f31531a[iC + 1];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = this.f31531a;
        return objArr == null || objArr.length == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f31531a;
            if (i10 >= objArr.length) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            linkedHashSet.add(objArr[i10]);
            i10 += 2;
        }
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null || v10 == null) {
            throw new NullPointerException("Key or value must not be null.");
        }
        if (this.f31531a == null) {
            this.f31531a = new Object[]{k10, v10};
            return null;
        }
        int iC = c(k10);
        if (iC >= 0) {
            Object[] objArr = this.f31531a;
            int i10 = iC + 1;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
        Object[] objArr2 = this.f31531a;
        int length = objArr2.length;
        Object[] objArr3 = new Object[length + 2];
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        objArr3[length] = k10;
        objArr3[length + 1] = v10;
        this.f31531a = objArr3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.f31531a;
        int i10 = 0;
        if (objArr == null || objArr.length == 0) {
            this.f31531a = new Object[map.size() << 1];
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new NullPointerException("Key or value must not be null.");
                }
                int i11 = i10 + 1;
                this.f31531a[i10] = entry.getKey();
                i10 += 2;
                this.f31531a[i11] = entry.getValue();
            }
            return;
        }
        int length = objArr.length;
        int size = (map.size() << 1) + length;
        Object[] objArr2 = new Object[size];
        System.arraycopy(this.f31531a, 0, objArr2, 0, length);
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() == null || entry2.getValue() == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            int iC = c(entry2.getKey());
            if (iC >= 0) {
                objArr2[iC + 1] = entry2.getValue();
            } else {
                int i12 = length + 1;
                objArr2[length] = entry2.getKey();
                length += 2;
                objArr2[i12] = entry2.getValue();
            }
        }
        if (length < size) {
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr2 = objArr3;
        }
        this.f31531a = objArr2;
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return null;
        }
        Object[] objArr = this.f31531a;
        V v10 = (V) objArr[iC + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f31531a = null;
            return v10;
        }
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, iC);
        System.arraycopy(this.f31531a, iC + 2, objArr2, iC, (length - iC) - 2);
        this.f31531a = objArr2;
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = this.f31531a;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        int i10 = 1;
        ArrayList arrayList = new ArrayList(this.f31531a.length >> 1);
        while (true) {
            Object[] objArr = this.f31531a;
            if (i10 >= objArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(objArr[i10]);
            i10 += 2;
        }
    }
}
