package qg;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qg.c;

/* loaded from: classes2.dex */
public final class l<E> extends g<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f22726d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f22727a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f22728b;

    /* renamed from: c, reason: collision with root package name */
    public int f22729c;

    public l() {
        this.f22728b = f22726d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int length;
        int i11 = this.f22729c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        if (i10 == i11) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        q();
        g(this.f22729c + 1);
        int iO = o(this.f22727a + i10);
        int i12 = this.f22729c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iO == 0) {
                Object[] objArr = this.f22728b;
                kotlin.jvm.internal.r.e(objArr, "<this>");
                iO = objArr.length;
            }
            int i13 = iO - 1;
            int i14 = this.f22727a;
            if (i14 == 0) {
                Object[] objArr2 = this.f22728b;
                kotlin.jvm.internal.r.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f22727a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f22728b;
                objArr3[length] = objArr3[i15];
                m.g(objArr3, i15, objArr3, i15 + 1, i13 + 1);
            } else {
                Object[] objArr4 = this.f22728b;
                m.g(objArr4, i15 - 1, objArr4, i15, objArr4.length);
                Object[] objArr5 = this.f22728b;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.g(objArr5, 0, objArr5, 1, i13 + 1);
            }
            this.f22728b[i13] = e10;
            this.f22727a = length;
        } else {
            int iO2 = o(i12 + this.f22727a);
            if (iO < iO2) {
                Object[] objArr6 = this.f22728b;
                m.g(objArr6, iO + 1, objArr6, iO, iO2);
            } else {
                Object[] objArr7 = this.f22728b;
                m.g(objArr7, 1, objArr7, 0, iO2);
                Object[] objArr8 = this.f22728b;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.g(objArr8, iO + 1, objArr8, iO, objArr8.length - 1);
            }
            this.f22728b[iO] = e10;
        }
        this.f22729c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        int i11 = this.f22729c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == this.f22729c) {
            return addAll(elements);
        }
        q();
        g(elements.size() + this.f22729c);
        int iO = o(this.f22729c + this.f22727a);
        int iO2 = o(this.f22727a + i10);
        int size = elements.size();
        if (i10 >= ((this.f22729c + 1) >> 1)) {
            int i12 = iO2 + size;
            if (iO2 < iO) {
                int i13 = size + iO;
                Object[] objArr = this.f22728b;
                if (i13 <= objArr.length) {
                    m.g(objArr, i12, objArr, iO2, iO);
                } else if (i12 >= objArr.length) {
                    m.g(objArr, i12 - objArr.length, objArr, iO2, iO);
                } else {
                    int length = iO - (i13 - objArr.length);
                    m.g(objArr, 0, objArr, length, iO);
                    Object[] objArr2 = this.f22728b;
                    m.g(objArr2, i12, objArr2, iO2, length);
                }
            } else {
                Object[] objArr3 = this.f22728b;
                m.g(objArr3, size, objArr3, 0, iO);
                Object[] objArr4 = this.f22728b;
                if (i12 >= objArr4.length) {
                    m.g(objArr4, i12 - objArr4.length, objArr4, iO2, objArr4.length);
                } else {
                    m.g(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f22728b;
                    m.g(objArr5, i12, objArr5, iO2, objArr5.length - size);
                }
            }
            f(iO2, elements);
            return true;
        }
        int i14 = this.f22727a;
        int length2 = i14 - size;
        if (iO2 < i14) {
            Object[] objArr6 = this.f22728b;
            m.g(objArr6, length2, objArr6, i14, objArr6.length);
            if (size >= iO2) {
                Object[] objArr7 = this.f22728b;
                m.g(objArr7, objArr7.length - size, objArr7, 0, iO2);
            } else {
                Object[] objArr8 = this.f22728b;
                m.g(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f22728b;
                m.g(objArr9, 0, objArr9, size, iO2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f22728b;
            m.g(objArr10, length2, objArr10, i14, iO2);
        } else {
            Object[] objArr11 = this.f22728b;
            length2 += objArr11.length;
            int i15 = iO2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                m.g(objArr11, length2, objArr11, i14, iO2);
            } else {
                m.g(objArr11, length2, objArr11, i14, i14 + length3);
                Object[] objArr12 = this.f22728b;
                m.g(objArr12, 0, objArr12, this.f22727a + length3, iO2);
            }
        }
        this.f22727a = length2;
        f(m(iO2 - size), elements);
        return true;
    }

    public final void addFirst(E e10) {
        q();
        g(this.f22729c + 1);
        int length = this.f22727a;
        if (length == 0) {
            Object[] objArr = this.f22728b;
            kotlin.jvm.internal.r.e(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f22727a = i10;
        this.f22728b[i10] = e10;
        this.f22729c++;
    }

    public final void addLast(E e10) {
        q();
        g(c() + 1);
        this.f22728b[o(c() + this.f22727a)] = e10;
        this.f22729c = c() + 1;
    }

    @Override // qg.g
    public final int c() {
        return this.f22729c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            q();
            n(this.f22727a, o(c() + this.f22727a));
        }
        this.f22727a = 0;
        this.f22729c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // qg.g
    public final E e(int i10) {
        int i11 = this.f22729c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        if (i10 == p.i(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        q();
        int iO = o(this.f22727a + i10);
        Object[] objArr = this.f22728b;
        E e10 = (E) objArr[iO];
        if (i10 < (this.f22729c >> 1)) {
            int i12 = this.f22727a;
            if (iO >= i12) {
                m.g(objArr, i12 + 1, objArr, i12, iO);
            } else {
                m.g(objArr, 1, objArr, 0, iO);
                Object[] objArr2 = this.f22728b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f22727a;
                m.g(objArr2, i13 + 1, objArr2, i13, objArr2.length - 1);
            }
            Object[] objArr3 = this.f22728b;
            int i14 = this.f22727a;
            objArr3[i14] = null;
            this.f22727a = j(i14);
        } else {
            int iO2 = o(p.i(this) + this.f22727a);
            if (iO <= iO2) {
                Object[] objArr4 = this.f22728b;
                m.g(objArr4, iO, objArr4, iO + 1, iO2 + 1);
            } else {
                Object[] objArr5 = this.f22728b;
                m.g(objArr5, iO, objArr5, iO + 1, objArr5.length);
                Object[] objArr6 = this.f22728b;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.g(objArr6, 0, objArr6, 1, iO2 + 1);
            }
            this.f22728b[iO2] = null;
        }
        this.f22729c--;
        return e10;
    }

    public final void f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f22728b.length;
        while (i10 < length && it.hasNext()) {
            this.f22728b[i10] = it.next();
            i10++;
        }
        int i11 = this.f22727a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f22728b[i12] = it.next();
        }
        this.f22729c = collection.size() + this.f22729c;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f22728b[this.f22727a];
    }

    public final void g(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f22728b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f22726d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f22728b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        m.g(objArr, 0, objArr2, this.f22727a, objArr.length);
        Object[] objArr3 = this.f22728b;
        int length2 = objArr3.length;
        int i12 = this.f22727a;
        m.g(objArr3, length2 - i12, objArr2, 0, i12);
        this.f22727a = 0;
        this.f22728b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int iC = c();
        if (i10 < 0 || i10 >= iC) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, iC, "index: ", ", size: "));
        }
        return (E) this.f22728b[o(this.f22727a + i10)];
    }

    public final E i() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f22728b[this.f22727a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iO = o(c() + this.f22727a);
        int length = this.f22727a;
        if (length < iO) {
            while (length < iO) {
                if (kotlin.jvm.internal.r.a(obj, this.f22728b[length])) {
                    i10 = this.f22727a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.f22728b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iO; i11++) {
                    if (kotlin.jvm.internal.r.a(obj, this.f22728b[i11])) {
                        length = i11 + this.f22728b.length;
                        i10 = this.f22727a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.r.a(obj, this.f22728b[length])) {
                i10 = this.f22727a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final int j(int i10) {
        kotlin.jvm.internal.r.e(this.f22728b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final E k() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f22728b[o(p.i(this) + this.f22727a)];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f22728b[o(p.i(this) + this.f22727a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iO = o(this.f22729c + this.f22727a);
        int i11 = this.f22727a;
        if (i11 < iO) {
            length = iO - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.r.a(obj, this.f22728b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f22727a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iO) {
            int i12 = iO - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f22728b;
                    kotlin.jvm.internal.r.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f22727a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.r.a(obj, this.f22728b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f22727a;
                    }
                } else {
                    if (kotlin.jvm.internal.r.a(obj, this.f22728b[i12])) {
                        length = i12 + this.f22728b.length;
                        i10 = this.f22727a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    public final int m(int i10) {
        return i10 < 0 ? i10 + this.f22728b.length : i10;
    }

    public final void n(int i10, int i11) {
        if (i10 < i11) {
            m.m(this.f22728b, i10, i11, null);
            return;
        }
        Object[] objArr = this.f22728b;
        m.m(objArr, i10, objArr.length, null);
        m.m(this.f22728b, 0, i11, null);
    }

    public final int o(int i10) {
        Object[] objArr = this.f22728b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void q() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> elements) {
        int iO;
        kotlin.jvm.internal.r.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f22728b.length != 0) {
            int iO2 = o(c() + this.f22727a);
            int i10 = this.f22727a;
            if (i10 < iO2) {
                iO = i10;
                while (i10 < iO2) {
                    Object obj = this.f22728b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f22728b[iO] = obj;
                        iO++;
                    }
                    i10++;
                }
                m.m(this.f22728b, iO, iO2, null);
            } else {
                int length = this.f22728b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f22728b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f22728b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iO = o(i11);
                for (int i12 = 0; i12 < iO2; i12++) {
                    Object[] objArr2 = this.f22728b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f22728b[iO] = obj3;
                        iO = j(iO);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                q();
                this.f22729c = m(iO - this.f22727a);
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        Object[] objArr = this.f22728b;
        int i10 = this.f22727a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f22727a = j(i10);
        this.f22729c = c() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        int iO = o(p.i(this) + this.f22727a);
        Object[] objArr = this.f22728b;
        E e10 = (E) objArr[iO];
        objArr[iO] = null;
        this.f22729c = c() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c.a.b(i10, i11, this.f22729c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f22729c) {
            clear();
            return;
        }
        if (i12 == 1) {
            e(i10);
            return;
        }
        q();
        if (i10 < this.f22729c - i11) {
            int iO = o((i10 - 1) + this.f22727a);
            int iO2 = o((i11 - 1) + this.f22727a);
            while (i10 > 0) {
                int i13 = iO + 1;
                int iMin = Math.min(i10, Math.min(i13, iO2 + 1));
                Object[] objArr = this.f22728b;
                int i14 = iO2 - iMin;
                int i15 = iO - iMin;
                m.g(objArr, i14 + 1, objArr, i15 + 1, i13);
                iO = m(i15);
                iO2 = m(i14);
                i10 -= iMin;
            }
            int iO3 = o(this.f22727a + i12);
            n(this.f22727a, iO3);
            this.f22727a = iO3;
        } else {
            int iO4 = o(this.f22727a + i11);
            int iO5 = o(this.f22727a + i10);
            int i16 = this.f22729c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f22728b;
                i11 = Math.min(i16, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.f22728b;
                int i17 = iO4 + i11;
                m.g(objArr3, iO5, objArr3, iO4, i17);
                iO4 = o(i17);
                iO5 = o(iO5 + i11);
            }
            int iO6 = o(this.f22729c + this.f22727a);
            n(m(iO6 - i12), iO6);
        }
        this.f22729c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> elements) {
        int iO;
        kotlin.jvm.internal.r.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f22728b.length != 0) {
            int iO2 = o(c() + this.f22727a);
            int i10 = this.f22727a;
            if (i10 < iO2) {
                iO = i10;
                while (i10 < iO2) {
                    Object obj = this.f22728b[i10];
                    if (elements.contains(obj)) {
                        this.f22728b[iO] = obj;
                        iO++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                m.m(this.f22728b, iO, iO2, null);
            } else {
                int length = this.f22728b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f22728b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f22728b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iO = o(i11);
                for (int i12 = 0; i12 < iO2; i12++) {
                    Object[] objArr2 = this.f22728b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f22728b[iO] = obj3;
                        iO = j(iO);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                q();
                this.f22729c = m(iO - this.f22727a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int iC = c();
        if (i10 < 0 || i10 >= iC) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, iC, "index: ", ", size: "));
        }
        int iO = o(this.f22727a + i10);
        Object[] objArr = this.f22728b;
        E e11 = (E) objArr[iO];
        objArr[iO] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    public l(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f22726d;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(j2.y.a(i10, "Illegal Capacity: "));
        }
        this.f22728b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) throws NegativeArraySizeException {
        kotlin.jvm.internal.r.e(array, "array");
        int length = array.length;
        int i10 = this.f22729c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.r.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) objNewInstance);
        }
        int iO = o(this.f22729c + this.f22727a);
        int i11 = this.f22727a;
        if (i11 < iO) {
            m.i(this.f22728b, i11, array, iO, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f22728b;
            m.g(objArr, 0, array, this.f22727a, objArr.length);
            Object[] objArr2 = this.f22728b;
            m.g(objArr2, objArr2.length - this.f22727a, array, 0, iO);
        }
        int i12 = this.f22729c;
        if (i12 < array.length) {
            array[i12] = null;
        }
        return array;
    }

    public l(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f22728b = array;
        this.f22729c = array.length;
        if (array.length == 0) {
            this.f22728b = f22726d;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        q();
        g(elements.size() + c());
        f(o(c() + this.f22727a), elements);
        return true;
    }
}
