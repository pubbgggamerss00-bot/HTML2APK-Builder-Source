package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nn1 extends AbstractMap implements Serializable {
    public static final Object B = new Object();
    public transient mn1 A;
    public transient Object s;

    /* renamed from: t, reason: collision with root package name */
    public transient int[] f7471t;

    /* renamed from: u, reason: collision with root package name */
    public transient Object[] f7472u;

    /* renamed from: v, reason: collision with root package name */
    public transient Object[] f7473v;

    /* renamed from: w, reason: collision with root package name */
    public transient int f7474w = ed0.q(8, 1);

    /* renamed from: x, reason: collision with root package name */
    public transient int f7475x;

    /* renamed from: y, reason: collision with root package name */
    public transient kn1 f7476y;

    /* renamed from: z, reason: collision with root package name */
    public transient in1 f7477z;

    public final int[] a() {
        int[] iArr = this.f7471t;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f7472u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f7473v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f7474w += 32;
        Map mapD = d();
        if (mapD != null) {
            this.f7474w = ed0.q(size(), 3);
            mapD.clear();
            this.s = null;
            this.f7475x = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f7475x, (Object) null);
        Arrays.fill(c(), 0, this.f7475x, (Object) null);
        Object obj = this.s;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f7475x, 0);
        this.f7475x = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        return mapD != null ? mapD.containsKey(obj) : h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i6 = 0; i6 < this.f7475x; i6++) {
            if (aa1.k(obj, c()[i6])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.s;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void e(int i6, int i7) {
        Object obj = this.s;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i8 = size - 1;
        if (i6 >= i8) {
            objArrB[i6] = null;
            objArrC[i6] = null;
            iArrA[i6] = 0;
            return;
        }
        int i9 = i6 + 1;
        Object obj2 = objArrB[i8];
        objArrB[i6] = obj2;
        objArrC[i6] = objArrC[i8];
        objArrB[i8] = null;
        objArrC[i8] = null;
        iArrA[i6] = iArrA[i8];
        iArrA[i8] = 0;
        int iN = aa1.n(obj2) & i7;
        int iB = on1.b(iN, obj);
        if (iB == size) {
            on1.d(iN, i9, obj);
            return;
        }
        while (true) {
            int i10 = iB - 1;
            int i11 = iArrA[i10];
            int i12 = i11 & i7;
            if (i12 == size) {
                iArrA[i10] = (i11 & (~i7)) | (i7 & i9);
                return;
            }
            iB = i12;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        in1 in1Var = this.f7477z;
        if (in1Var != null) {
            return in1Var;
        }
        in1 in1Var2 = new in1(this);
        this.f7477z = in1Var2;
        return in1Var2;
    }

    public final boolean f() {
        return this.s == null;
    }

    public final int g() {
        return (1 << (this.f7474w & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iH = h(obj);
        if (iH == -1) {
            return null;
        }
        return c()[iH];
    }

    public final int h(Object obj) {
        if (f()) {
            return -1;
        }
        int iN = aa1.n(obj);
        int iG = g();
        Object obj2 = this.s;
        Objects.requireNonNull(obj2);
        int iB = on1.b(iN & iG, obj2);
        if (iB != 0) {
            int i6 = ~iG;
            int i7 = iN & i6;
            do {
                int i8 = iB - 1;
                int i9 = a()[i8];
                if ((i9 & i6) == i7 && aa1.k(obj, b()[i8])) {
                    return i8;
                }
                iB = i9 & iG;
            } while (iB != 0);
        }
        return -1;
    }

    public final int i(int i6, int i7, int i8, int i9) {
        int i10 = i7 - 1;
        Object objC = on1.c(i7);
        if (i9 != 0) {
            on1.d(i8 & i10, i9 + 1, objC);
        }
        Object obj = this.s;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i11 = 0; i11 <= i6; i11++) {
            int iB = on1.b(i11, obj);
            while (iB != 0) {
                int i12 = iB - 1;
                int i13 = iArrA[i12];
                int i14 = ((~i6) & i13) | i11;
                int i15 = i14 & i10;
                int iB2 = on1.b(i15, objC);
                on1.d(i15, iB, objC);
                iArrA[i12] = ((~i10) & i14) | (iB2 & i10);
                iB = i13 & i6;
            }
        }
        this.s = objC;
        this.f7474w = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f7474w & (-32));
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!f()) {
            int iG = g();
            Object obj2 = this.s;
            Objects.requireNonNull(obj2);
            int iA = on1.a(obj, null, iG, obj2, a(), b(), null);
            if (iA != -1) {
                Object obj3 = c()[iA];
                e(iA, iG);
                this.f7475x--;
                this.f7474w += 32;
                return obj3;
            }
        }
        return B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kn1 kn1Var = this.f7476y;
        if (kn1Var != null) {
            return kn1Var;
        }
        kn1 kn1Var2 = new kn1(this);
        this.f7476y = kn1Var2;
        return kn1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i6;
        int i7 = 32;
        if (f()) {
            sl1.h("Arrays already allocated", f());
            int i8 = this.f7474w;
            int iMax = Math.max(i8 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.s = on1.c(iMax2);
            this.f7474w = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f7474w & (-32));
            this.f7471t = new int[i8];
            this.f7472u = new Object[i8];
            this.f7473v = new Object[i8];
        }
        Map mapD = d();
        if (mapD != null) {
            return mapD.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i9 = this.f7475x;
        int i10 = i9 + 1;
        int iN = aa1.n(obj);
        int iG = g();
        int i11 = iN & iG;
        Object obj3 = this.s;
        Objects.requireNonNull(obj3);
        int iB = on1.b(i11, obj3);
        if (iB == 0) {
            if (i10 > iG) {
                iG = i(iG, (iG + 1) * (iG < 32 ? 4 : 2), iN, i9);
            } else {
                Object obj4 = this.s;
                Objects.requireNonNull(obj4);
                on1.d(i11, i10, obj4);
            }
            i6 = 1;
        } else {
            int i12 = ~iG;
            int i13 = iN & i12;
            int i14 = 0;
            while (true) {
                int i15 = iB - 1;
                int i16 = iArrA[i15];
                i6 = 1;
                int i17 = i16 & i12;
                int i18 = i7;
                if (i17 == i13 && aa1.k(obj, objArrB[i15])) {
                    Object obj5 = objArrC[i15];
                    objArrC[i15] = obj2;
                    return obj5;
                }
                int i19 = i16 & iG;
                int i20 = i14 + 1;
                if (i19 != 0) {
                    i14 = i20;
                    iB = i19;
                    i7 = i18;
                } else {
                    if (i20 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i21 = isEmpty() ? -1 : 0;
                        while (i21 >= 0) {
                            linkedHashMap.put(b()[i21], c()[i21]);
                            int i22 = i21 + 1;
                            i21 = i22 < this.f7475x ? i22 : -1;
                        }
                        this.s = linkedHashMap;
                        this.f7471t = null;
                        this.f7472u = null;
                        this.f7473v = null;
                        this.f7474w += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > iG) {
                        iG = i(iG, (iG + 1) * (iG < i18 ? 4 : 2), iN, i9);
                    } else {
                        iArrA[i15] = (i10 & iG) | i17;
                    }
                }
            }
        }
        int length = a().length;
        if (i10 > length) {
            int i23 = i6;
            int iMin = Math.min(1073741823, (Math.max(i23, length >>> 1) + length) | i23);
            if (iMin != length) {
                this.f7471t = Arrays.copyOf(a(), iMin);
                this.f7472u = Arrays.copyOf(b(), iMin);
                this.f7473v = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i9] = (~iG) & iN;
        b()[i9] = obj;
        c()[i9] = obj2;
        this.f7475x = i10;
        this.f7474w += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == B) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.f7475x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        mn1 mn1Var = this.A;
        if (mn1Var != null) {
            return mn1Var;
        }
        mn1 mn1Var2 = new mn1(this);
        this.A = mn1Var2;
        return mn1Var2;
    }
}
