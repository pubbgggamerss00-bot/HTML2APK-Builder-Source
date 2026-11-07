package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class bo1 extends wn1 implements List, RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    public static final zn1 f3236t = new zn1(cp1.f3636w, 0);

    public static cp1 k(Object[] objArr, int i6) {
        return i6 == 0 ? cp1.f3636w : new cp1(objArr, i6);
    }

    public static bo1 l(Collection collection) {
        if (!(collection instanceof wn1)) {
            Object[] array = collection.toArray();
            int length = array.length;
            ap1.a(array, length);
            return k(array, length);
        }
        bo1 bo1VarF = ((wn1) collection).f();
        if (!bo1VarF.h()) {
            return bo1VarF;
        }
        Object[] array2 = bo1VarF.toArray(wn1.s);
        return k(array2, array2.length);
    }

    public static cp1 m(Object[] objArr) {
        if (objArr.length == 0) {
            return cp1.f3636w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        ap1.a(objArr2, length);
        return k(objArr2, length);
    }

    public static cp1 n(Object obj) {
        Object[] objArr = {obj};
        ap1.a(objArr, 1);
        return k(objArr, 1);
    }

    public static cp1 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ap1.a(objArr, 2);
        return k(objArr, 2);
    }

    public static cp1 p(Long l4, Long l6, Long l7, Long l8, Long l9) {
        Object[] objArr = {l4, l6, l7, l8, l9};
        ap1.a(objArr, 5);
        return k(objArr, 5);
    }

    @SafeVarargs
    public static cp1 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i6 = length + 12;
        Object[] objArr2 = new Object[i6];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        ap1.a(objArr2, i6);
        return k(objArr2, i6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i6, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public int c(Object[] objArr, int i6) {
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i6 + i7] = get(i7);
        }
        return i6 + size;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i6 = 0; i6 < size; i6++) {
                        if (aa1.k(get(i6), list.get(i6))) {
                        }
                    }
                    return true;
                }
                zn1 zn1VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (zn1VarListIterator.hasNext()) {
                        if (!it.hasNext() || !aa1.k(zn1VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    /* renamed from: g */
    public final up1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode = (iHashCode * 31) + get(i6).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (obj.equals(get(i6))) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public bo1 subList(int i6, int i7) {
        sl1.g(i6, i7, size());
        int i8 = i7 - i6;
        return i8 == size() ? this : i8 == 0 ? cp1.f3636w : new ao1(this, i6, i8);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final zn1 listIterator(int i6) {
        sl1.b(i6, size());
        return isEmpty() ? f3236t : new zn1(this, i6);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i6, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.wn1
    @Deprecated
    public final bo1 f() {
        return this;
    }
}
