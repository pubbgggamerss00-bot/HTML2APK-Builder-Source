package p;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class b1<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public int[] f20574a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20575b;

    /* renamed from: c, reason: collision with root package name */
    public int f20576c;

    public b1() {
        this(0);
    }

    public final int c(V v10) {
        int i10 = this.f20576c * 2;
        Object[] objArr = this.f20575b;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (v10.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void clear() {
        if (this.f20576c > 0) {
            this.f20574a = q.a.f21637a;
            this.f20575b = q.a.f21639c;
            this.f20576c = 0;
        }
        if (this.f20576c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return f(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return c(v10) >= 0;
    }

    public final int e(int i10, Object obj) {
        int i11 = this.f20576c;
        if (i11 == 0) {
            return -1;
        }
        int iA = q.a.a(i11, i10, this.f20574a);
        if (iA < 0 || kotlin.jvm.internal.r.a(obj, this.f20575b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f20574a[i12] == i10) {
            if (kotlin.jvm.internal.r.a(obj, this.f20575b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f20574a[i13] == i10; i13--) {
            if (kotlin.jvm.internal.r.a(obj, this.f20575b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof b1) {
                int i10 = this.f20576c;
                if (i10 != ((b1) obj).f20576c) {
                    return false;
                }
                b1 b1Var = (b1) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kH = h(i11);
                    V vK = k(i11);
                    Object obj2 = b1Var.get(kH);
                    if (vK == null) {
                        if (obj2 != null || !b1Var.containsKey(kH)) {
                            return false;
                        }
                    } else if (!vK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f20576c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f20576c;
            for (int i13 = 0; i13 < i12; i13++) {
                K kH2 = h(i13);
                V vK2 = k(i13);
                Object obj3 = ((Map) obj).get(kH2);
                if (vK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kH2)) {
                        return false;
                    }
                } else if (!vK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f(K k10) {
        return k10 == null ? g() : e(k10.hashCode(), k10);
    }

    public final int g() {
        int i10 = this.f20576c;
        if (i10 == 0) {
            return -1;
        }
        int iA = q.a.a(i10, 0, this.f20574a);
        if (iA < 0 || this.f20575b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f20574a[i11] == 0) {
            if (this.f20575b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f20574a[i12] == 0; i12--) {
            if (this.f20575b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(K k10) {
        int iF = f(k10);
        if (iF >= 0) {
            return (V) this.f20575b[(iF << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v10) {
        int iF = f(obj);
        return iF >= 0 ? (V) this.f20575b[(iF << 1) + 1] : v10;
    }

    public final K h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f20576c) {
            z10 = true;
        }
        if (z10) {
            return (K) this.f20575b[i10 << 1];
        }
        q.d.a("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f20574a;
        Object[] objArr = this.f20575b;
        int i10 = this.f20576c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final V i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20576c)) {
            q.d.a("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f20575b;
        int i12 = i10 << 1;
        V v10 = (V) objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return v10;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f20574a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                qg.m.d(i10, iArr, i14, i11, iArr);
                Object[] objArr2 = this.f20575b;
                qg.m.g(objArr2, i12, objArr2, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f20575b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20574a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20575b, i16 << 1);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20575b = objArrCopyOf;
            if (i11 != this.f20576c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                qg.m.d(0, iArr, 0, i10, this.f20574a);
                qg.m.g(objArr, 0, this.f20575b, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                qg.m.d(i10, iArr, i17, i11, this.f20574a);
                qg.m.g(objArr, i12, this.f20575b, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f20576c) {
            throw new ConcurrentModificationException();
        }
        this.f20576c = i13;
        return v10;
    }

    public final boolean isEmpty() {
        return this.f20576c <= 0;
    }

    public final V j(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f20576c) {
            z10 = true;
        }
        if (!z10) {
            q.d.a("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f20575b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final V k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f20576c) {
            z10 = true;
        }
        if (z10) {
            return (V) this.f20575b[(i10 << 1) + 1];
        }
        q.d.a("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final V put(K k10, V v10) {
        int i10 = this.f20576c;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iE = k10 != null ? e(iHashCode, k10) : g();
        if (iE >= 0) {
            int i11 = (iE << 1) + 1;
            Object[] objArr = this.f20575b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iE;
        int[] iArr = this.f20574a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20574a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20575b, i13 << 1);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20575b = objArrCopyOf;
            if (i10 != this.f20576c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f20574a;
            int i14 = i12 + 1;
            qg.m.d(i14, iArr2, i12, i10, iArr2);
            Object[] objArr2 = this.f20575b;
            qg.m.g(objArr2, i14 << 1, objArr2, i12 << 1, this.f20576c << 1);
        }
        int i15 = this.f20576c;
        if (i10 == i15) {
            int[] iArr3 = this.f20574a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f20575b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f20576c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int iF = f(k10);
        if (iF >= 0) {
            return i(iF);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int iF = f(k10);
        if (iF >= 0) {
            return j(iF, v10);
        }
        return null;
    }

    public final int size() {
        return this.f20576c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f20576c * 28);
        sb.append('{');
        int i10 = this.f20576c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            K kH = h(i11);
            if (kH != sb) {
                sb.append(kH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vK = k(i11);
            if (vK != sb) {
                sb.append(vK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public b1(int i10) {
        this.f20574a = i10 == 0 ? q.a.f21637a : new int[i10];
        this.f20575b = i10 == 0 ? q.a.f21639c : new Object[i10 << 1];
    }

    public final boolean remove(K k10, V v10) {
        int iF = f(k10);
        if (iF < 0 || !kotlin.jvm.internal.r.a(v10, k(iF))) {
            return false;
        }
        i(iF);
        return true;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int iF = f(k10);
        if (iF < 0 || !kotlin.jvm.internal.r.a(v10, k(iF))) {
            return false;
        }
        j(iF, v11);
        return true;
    }
}
