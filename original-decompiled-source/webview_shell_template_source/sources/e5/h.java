package e5;

import e5.c;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h<E> extends e<E> {

    /* renamed from: v, reason: collision with root package name */
    public static final Object[] f12931v = new Object[0];
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public Object[] f12932t = f12931v;

    /* renamed from: u, reason: collision with root package name */
    public int f12933u;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, E e6) {
        int length;
        int i7 = this.f12933u;
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
        }
        if (i6 == i7) {
            addLast(e6);
            return;
        }
        if (i6 == 0) {
            addFirst(e6);
            return;
        }
        i();
        d(this.f12933u + 1);
        int iH = h(this.s + i6);
        int i8 = this.f12933u;
        if (i6 < ((i8 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.f12932t;
                kotlin.jvm.internal.j.e("<this>", objArr);
                iH = objArr.length;
            }
            int i9 = iH - 1;
            int i10 = this.s;
            if (i10 == 0) {
                Object[] objArr2 = this.f12932t;
                kotlin.jvm.internal.j.e("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i10 - 1;
            }
            int i11 = this.s;
            if (i9 >= i11) {
                Object[] objArr3 = this.f12932t;
                objArr3[length] = objArr3[i11];
                i.c(i11, i11 + 1, i9 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f12932t;
                i.c(i11 - 1, i11, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f12932t;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.c(0, 1, i9 + 1, objArr5, objArr5);
            }
            this.f12932t[i9] = e6;
            this.s = length;
        } else {
            int iH2 = h(this.s + i8);
            if (iH < iH2) {
                Object[] objArr6 = this.f12932t;
                i.c(iH + 1, iH, iH2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f12932t;
                i.c(1, 0, iH2, objArr7, objArr7);
                Object[] objArr8 = this.f12932t;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.c(iH + 1, iH, objArr8.length - 1, objArr8, objArr8);
            }
            this.f12932t[iH] = e6;
        }
        this.f12933u++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection<? extends E> collection) {
        kotlin.jvm.internal.j.e("elements", collection);
        int i7 = this.f12933u;
        if (i6 < 0 || i6 > i7) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i6 == this.f12933u) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f12933u);
        int iH = h(this.s + this.f12933u);
        int iH2 = h(this.s + i6);
        int size = collection.size();
        if (i6 >= ((this.f12933u + 1) >> 1)) {
            int i8 = iH2 + size;
            if (iH2 < iH) {
                int i9 = size + iH;
                Object[] objArr = this.f12932t;
                if (i9 <= objArr.length) {
                    i.c(i8, iH2, iH, objArr, objArr);
                } else if (i8 >= objArr.length) {
                    i.c(i8 - objArr.length, iH2, iH, objArr, objArr);
                } else {
                    int length = iH - (i9 - objArr.length);
                    i.c(0, length, iH, objArr, objArr);
                    Object[] objArr2 = this.f12932t;
                    i.c(i8, iH2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f12932t;
                i.c(size, 0, iH, objArr3, objArr3);
                Object[] objArr4 = this.f12932t;
                if (i8 >= objArr4.length) {
                    i.c(i8 - objArr4.length, iH2, objArr4.length, objArr4, objArr4);
                } else {
                    i.c(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f12932t;
                    i.c(i8, iH2, objArr5.length - size, objArr5, objArr5);
                }
            }
            c(iH2, collection);
            return true;
        }
        int i10 = this.s;
        int length2 = i10 - size;
        if (iH2 < i10) {
            Object[] objArr6 = this.f12932t;
            i.c(length2, i10, objArr6.length, objArr6, objArr6);
            if (size >= iH2) {
                Object[] objArr7 = this.f12932t;
                i.c(objArr7.length - size, 0, iH2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f12932t;
                i.c(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f12932t;
                i.c(0, size, iH2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f12932t;
            i.c(length2, i10, iH2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f12932t;
            length2 += objArr11.length;
            int i11 = iH2 - i10;
            int length3 = objArr11.length - length2;
            if (length3 >= i11) {
                i.c(length2, i10, iH2, objArr11, objArr11);
            } else {
                i.c(length2, i10, i10 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f12932t;
                i.c(0, this.s + length3, iH2, objArr12, objArr12);
            }
        }
        this.s = length2;
        c(f(iH2 - size), collection);
        return true;
    }

    public final void addFirst(E e6) {
        i();
        d(this.f12933u + 1);
        int length = this.s;
        if (length == 0) {
            Object[] objArr = this.f12932t;
            kotlin.jvm.internal.j.e("<this>", objArr);
            length = objArr.length;
        }
        int i6 = length - 1;
        this.s = i6;
        this.f12932t[i6] = e6;
        this.f12933u++;
    }

    public final void addLast(E e6) {
        i();
        d(this.f12933u + 1);
        this.f12932t[h(this.s + this.f12933u)] = e6;
        this.f12933u++;
    }

    public final void c(int i6, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f12932t.length;
        while (i6 < length && it.hasNext()) {
            this.f12932t[i6] = it.next();
            i6++;
        }
        int i7 = this.s;
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            this.f12932t[i8] = it.next();
        }
        this.f12933u = collection.size() + this.f12933u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.s, h(this.s + this.f12933u));
        }
        this.s = 0;
        this.f12933u = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f12932t;
        if (i6 <= objArr.length) {
            return;
        }
        if (objArr == f12931v) {
            if (i6 < 10) {
                i6 = 10;
            }
            this.f12932t = new Object[i6];
            return;
        }
        int length = objArr.length;
        int i7 = length + (length >> 1);
        if (i7 - i6 < 0) {
            i7 = i6;
        }
        if (i7 - 2147483639 > 0) {
            i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i7];
        i.c(0, this.s, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f12932t;
        int length2 = objArr3.length;
        int i8 = this.s;
        i.c(length2 - i8, 0, i8, objArr3, objArr2);
        this.s = 0;
        this.f12932t = objArr2;
    }

    public final int e(int i6) {
        kotlin.jvm.internal.j.e("<this>", this.f12932t);
        if (i6 == r0.length - 1) {
            return 0;
        }
        return i6 + 1;
    }

    public final int f(int i6) {
        return i6 < 0 ? i6 + this.f12932t.length : i6;
    }

    public final void g(int i6, int i7) {
        if (i6 < i7) {
            Object[] objArr = this.f12932t;
            kotlin.jvm.internal.j.e("<this>", objArr);
            Arrays.fill(objArr, i6, i7, (Object) null);
        } else {
            Object[] objArr2 = this.f12932t;
            Arrays.fill(objArr2, i6, objArr2.length, (Object) null);
            Object[] objArr3 = this.f12932t;
            kotlin.jvm.internal.j.e("<this>", objArr3);
            Arrays.fill(objArr3, 0, i7, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i6) {
        int i7 = this.f12933u;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
        }
        return (E) this.f12932t[h(this.s + i6)];
    }

    public final int h(int i6) {
        Object[] objArr = this.f12932t;
        return i6 >= objArr.length ? i6 - objArr.length : i6;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i6;
        int iH = h(this.s + this.f12933u);
        int length = this.s;
        if (length < iH) {
            while (length < iH) {
                if (kotlin.jvm.internal.j.a(obj, this.f12932t[length])) {
                    i6 = this.s;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.f12932t.length;
        while (true) {
            if (length >= length2) {
                for (int i7 = 0; i7 < iH; i7++) {
                    if (kotlin.jvm.internal.j.a(obj, this.f12932t[i7])) {
                        length = i7 + this.f12932t.length;
                        i6 = this.s;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.f12932t[length])) {
                i6 = this.s;
                break;
            }
            length++;
        }
        return length - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12933u == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i6;
        int iH = h(this.s + this.f12933u);
        int i7 = this.s;
        if (i7 < iH) {
            length = iH - 1;
            if (i7 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f12932t[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i6 = this.s;
                return length - i6;
            }
            return -1;
        }
        if (i7 > iH) {
            int i8 = iH - 1;
            while (true) {
                if (-1 >= i8) {
                    Object[] objArr = this.f12932t;
                    kotlin.jvm.internal.j.e("<this>", objArr);
                    length = objArr.length - 1;
                    int i9 = this.s;
                    if (i9 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f12932t[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                        i6 = this.s;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.f12932t[i8])) {
                        length = i8 + this.f12932t.length;
                        i6 = this.s;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iH;
        kotlin.jvm.internal.j.e("elements", collection);
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f12932t.length != 0) {
            int iH2 = h(this.s + this.f12933u);
            int i6 = this.s;
            if (i6 < iH2) {
                iH = i6;
                while (i6 < iH2) {
                    Object obj = this.f12932t[i6];
                    if (collection.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f12932t[iH] = obj;
                        iH++;
                    }
                    i6++;
                }
                Object[] objArr = this.f12932t;
                kotlin.jvm.internal.j.e("<this>", objArr);
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.f12932t.length;
                boolean z7 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f12932t;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f12932t[i7] = obj2;
                        i7++;
                    }
                    i6++;
                }
                iH = h(i7);
                for (int i8 = 0; i8 < iH2; i8++) {
                    Object[] objArr3 = this.f12932t;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f12932t[iH] = obj3;
                        iH = e(iH);
                    }
                }
                z6 = z7;
            }
            if (z6) {
                i();
                this.f12933u = f(iH - this.s);
            }
        }
        return z6;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f12932t;
        int i6 = this.s;
        E e6 = (E) objArr[i6];
        objArr[i6] = null;
        this.s = e(i6);
        this.f12933u--;
        return e6;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h(l.b(this) + this.s);
        Object[] objArr = this.f12932t;
        E e6 = (E) objArr[iH];
        objArr[iH] = null;
        this.f12933u--;
        return e6;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i6, int i7) {
        c.a.a(i6, i7, this.f12933u);
        int i8 = i7 - i6;
        if (i8 == 0) {
            return;
        }
        if (i8 == this.f12933u) {
            clear();
            return;
        }
        if (i8 == 1) {
            remove(i6);
            return;
        }
        i();
        if (i6 < this.f12933u - i7) {
            int iH = h((i6 - 1) + this.s);
            int iH2 = h((i7 - 1) + this.s);
            while (i6 > 0) {
                int i9 = iH + 1;
                int iMin = Math.min(i6, Math.min(i9, iH2 + 1));
                Object[] objArr = this.f12932t;
                int i10 = iH2 - iMin;
                int i11 = iH - iMin;
                i.c(i10 + 1, i11 + 1, i9, objArr, objArr);
                iH = f(i11);
                iH2 = f(i10);
                i6 -= iMin;
            }
            int iH3 = h(this.s + i8);
            g(this.s, iH3);
            this.s = iH3;
        } else {
            int iH4 = h(this.s + i7);
            int iH5 = h(this.s + i6);
            int i12 = this.f12933u;
            while (true) {
                i12 -= i7;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f12932t;
                i7 = Math.min(i12, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.f12932t;
                int i13 = iH4 + i7;
                i.c(iH5, iH4, i13, objArr3, objArr3);
                iH4 = h(i13);
                iH5 = h(iH5 + i7);
            }
            int iH6 = h(this.s + this.f12933u);
            g(f(iH6 - i8), iH6);
        }
        this.f12933u -= i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int iH;
        kotlin.jvm.internal.j.e("elements", collection);
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f12932t.length != 0) {
            int iH2 = h(this.s + this.f12933u);
            int i6 = this.s;
            if (i6 < iH2) {
                iH = i6;
                while (i6 < iH2) {
                    Object obj = this.f12932t[i6];
                    if (collection.contains(obj)) {
                        this.f12932t[iH] = obj;
                        iH++;
                    } else {
                        z6 = true;
                    }
                    i6++;
                }
                Object[] objArr = this.f12932t;
                kotlin.jvm.internal.j.e("<this>", objArr);
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.f12932t.length;
                boolean z7 = false;
                int i7 = i6;
                while (i6 < length) {
                    Object[] objArr2 = this.f12932t;
                    Object obj2 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj2)) {
                        this.f12932t[i7] = obj2;
                        i7++;
                    } else {
                        z7 = true;
                    }
                    i6++;
                }
                iH = h(i7);
                for (int i8 = 0; i8 < iH2; i8++) {
                    Object[] objArr3 = this.f12932t;
                    Object obj3 = objArr3[i8];
                    objArr3[i8] = null;
                    if (collection.contains(obj3)) {
                        this.f12932t[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                i();
                this.f12933u = f(iH - this.s);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i6, E e6) {
        int i7 = this.f12933u;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
        }
        int iH = h(this.s + i6);
        Object[] objArr = this.f12932t;
        E e7 = (E) objArr[iH];
        objArr[iH] = e6;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f12933u]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) throws NegativeArraySizeException {
        kotlin.jvm.internal.j.e("array", tArr);
        int length = tArr.length;
        int i6 = this.f12933u;
        if (length < i6) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i6);
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int iH = h(this.s + this.f12933u);
        int i7 = this.s;
        if (i7 < iH) {
            i.e(i7, iH, 2, this.f12932t, tArr);
        } else if (!isEmpty()) {
            Object[] objArr = this.f12932t;
            i.c(0, this.s, objArr.length, objArr, tArr);
            Object[] objArr2 = this.f12932t;
            i.c(objArr2.length - this.s, 0, iH, objArr2, tArr);
        }
        int i8 = this.f12933u;
        if (i8 < tArr.length) {
            tArr[i8] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e6) {
        addLast(e6);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        kotlin.jvm.internal.j.e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + this.f12933u);
        c(h(this.s + this.f12933u), collection);
        return true;
    }
}
