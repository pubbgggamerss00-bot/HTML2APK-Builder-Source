package w;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class g<K, V> {
    public int[] s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f14849t;

    /* renamed from: u, reason: collision with root package name */
    public int f14850u;

    public g() {
        this(0);
    }

    public final int a(V v2) {
        int i6 = this.f14850u * 2;
        Object[] objArr = this.f14849t;
        if (v2 == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (v2.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i6) {
        int i7 = this.f14850u;
        int[] iArr = this.s;
        if (iArr.length < i6) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
            j.d("copyOf(this, newSize)", iArrCopyOf);
            this.s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14849t, i6 * 2);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14849t = objArrCopyOf;
        }
        if (this.f14850u != i7) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i6, Object obj) {
        int i7 = this.f14850u;
        if (i7 == 0) {
            return -1;
        }
        int iA = x.a.a(i7, i6, this.s);
        if (iA < 0 || j.a(obj, this.f14849t[iA << 1])) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.s[i8] == i6) {
            if (j.a(obj, this.f14849t[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.s[i9] == i6; i9--) {
            if (j.a(obj, this.f14849t[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    public final void clear() {
        if (this.f14850u > 0) {
            this.s = x.a.f15105a;
            this.f14849t = x.a.f15106b;
            this.f14850u = 0;
        }
        if (this.f14850u > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k6) {
        return d(k6) >= 0;
    }

    public boolean containsValue(V v2) {
        return a(v2) >= 0;
    }

    public final int d(K k6) {
        return k6 == null ? e() : c(k6.hashCode(), k6);
    }

    public final int e() {
        int i6 = this.f14850u;
        if (i6 == 0) {
            return -1;
        }
        int iA = x.a.a(i6, 0, this.s);
        if (iA < 0 || this.f14849t[iA << 1] == null) {
            return iA;
        }
        int i7 = iA + 1;
        while (i7 < i6 && this.s[i7] == 0) {
            if (this.f14849t[i7 << 1] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iA - 1; i8 >= 0 && this.s[i8] == 0; i8--) {
            if (this.f14849t[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof g) {
                int i6 = this.f14850u;
                if (i6 != ((g) obj).f14850u) {
                    return false;
                }
                g gVar = (g) obj;
                for (int i7 = 0; i7 < i6; i7++) {
                    K kF = f(i7);
                    V vI = i(i7);
                    Object obj2 = gVar.get(kF);
                    if (vI == null) {
                        if (obj2 != null || !gVar.containsKey(kF)) {
                            return false;
                        }
                    } else if (!vI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f14850u != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f14850u;
            for (int i9 = 0; i9 < i8; i9++) {
                K kF2 = f(i9);
                V vI2 = i(i9);
                Object obj3 = ((Map) obj).get(kF2);
                if (vI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kF2)) {
                        return false;
                    }
                } else if (!vI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final K f(int i6) {
        if (i6 < 0 || i6 >= this.f14850u) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (K) this.f14849t[i6 << 1];
    }

    public final V g(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f14850u)) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f14849t;
        int i8 = i6 << 1;
        V v2 = (V) objArr[i8 + 1];
        if (i7 <= 1) {
            clear();
            return v2;
        }
        int i9 = i7 - 1;
        int[] iArr = this.s;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i6 < i9) {
                int i10 = i6 + 1;
                e5.i.d(i6, i10, iArr, iArr, i7);
                Object[] objArr2 = this.f14849t;
                e5.i.c(i8, i10 << 1, i7 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f14849t;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            j.d("copyOf(this, newSize)", iArrCopyOf);
            this.s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14849t, i12 << 1);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14849t = objArrCopyOf;
            if (i7 != this.f14850u) {
                throw new ConcurrentModificationException();
            }
            if (i6 > 0) {
                e5.i.d(0, 0, iArr, this.s, i6);
                e5.i.c(0, 0, i8, objArr, this.f14849t);
            }
            if (i6 < i9) {
                int i13 = i6 + 1;
                e5.i.d(i6, i13, iArr, this.s, i7);
                e5.i.c(i8, i13 << 1, i7 << 1, objArr, this.f14849t);
            }
        }
        if (i7 != this.f14850u) {
            throw new ConcurrentModificationException();
        }
        this.f14850u = i9;
        return v2;
    }

    public V get(K k6) {
        int iD = d(k6);
        if (iD >= 0) {
            return (V) this.f14849t[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v2) {
        int iD = d(obj);
        return iD >= 0 ? (V) this.f14849t[(iD << 1) + 1] : v2;
    }

    public final V h(int i6, V v2) {
        if (i6 < 0 || i6 >= this.f14850u) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f14849t;
        V v6 = (V) objArr[i7];
        objArr[i7] = v2;
        return v6;
    }

    public final int hashCode() {
        int[] iArr = this.s;
        Object[] objArr = this.f14849t;
        int i6 = this.f14850u;
        int i7 = 1;
        int i8 = 0;
        int iHashCode = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return iHashCode;
    }

    public final V i(int i6) {
        if (i6 < 0 || i6 >= this.f14850u) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (V) this.f14849t[(i6 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f14850u <= 0;
    }

    public final V put(K k6, V v2) {
        int i6 = this.f14850u;
        int iHashCode = k6 != null ? k6.hashCode() : 0;
        int iC = k6 != null ? c(iHashCode, k6) : e();
        if (iC >= 0) {
            int i7 = (iC << 1) + 1;
            Object[] objArr = this.f14849t;
            V v6 = (V) objArr[i7];
            objArr[i7] = v2;
            return v6;
        }
        int i8 = ~iC;
        int[] iArr = this.s;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            j.d("copyOf(this, newSize)", iArrCopyOf);
            this.s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14849t, i9 << 1);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14849t = objArrCopyOf;
            if (i6 != this.f14850u) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr2 = this.s;
            int i10 = i8 + 1;
            e5.i.d(i10, i8, iArr2, iArr2, i6);
            Object[] objArr2 = this.f14849t;
            e5.i.c(i10 << 1, i8 << 1, this.f14850u << 1, objArr2, objArr2);
        }
        int i11 = this.f14850u;
        if (i6 == i11) {
            int[] iArr3 = this.s;
            if (i8 < iArr3.length) {
                iArr3[i8] = iHashCode;
                Object[] objArr3 = this.f14849t;
                int i12 = i8 << 1;
                objArr3[i12] = k6;
                objArr3[i12 + 1] = v2;
                this.f14850u = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k6, V v2) {
        V v6 = get(k6);
        return v6 == null ? put(k6, v2) : v6;
    }

    public V remove(K k6) {
        int iD = d(k6);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    public final V replace(K k6, V v2) {
        int iD = d(k6);
        if (iD >= 0) {
            return h(iD, v2);
        }
        return null;
    }

    public final int size() {
        return this.f14850u;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14850u * 28);
        sb.append('{');
        int i6 = this.f14850u;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            K kF = f(i7);
            if (kF != sb) {
                sb.append(kF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vI = i(i7);
            if (vI != sb) {
                sb.append(vI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        j.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public g(int i6) {
        this.s = i6 == 0 ? x.a.f15105a : new int[i6];
        this.f14849t = i6 == 0 ? x.a.f15106b : new Object[i6 << 1];
    }

    public final boolean remove(K k6, V v2) {
        int iD = d(k6);
        if (iD < 0 || !j.a(v2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(K k6, V v2, V v6) {
        int iD = d(k6);
        if (iD < 0 || !j.a(v2, i(iD))) {
            return false;
        }
        h(iD, v6);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(g<? extends K, ? extends V> gVar) {
        this(0);
        if (gVar != null) {
            int i6 = gVar.f14850u;
            b(this.f14850u + i6);
            if (this.f14850u != 0) {
                for (int i7 = 0; i7 < i6; i7++) {
                    put(gVar.f(i7), gVar.i(i7));
                }
            } else if (i6 > 0) {
                e5.i.d(0, 0, gVar.s, this.s, i6);
                e5.i.c(0, 0, i6 << 1, gVar.f14849t, this.f14849t);
                this.f14850u = i6;
            }
        }
    }
}
