package rg;

import c9.u1;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.r;
import qg.c;
import qg.m;

/* loaded from: classes2.dex */
public final class b<E> extends qg.g<E> implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f23533d;

    /* renamed from: a, reason: collision with root package name */
    public E[] f23534a;

    /* renamed from: b, reason: collision with root package name */
    public int f23535b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23536c;

    public static final class a<E> extends qg.g<E> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public E[] f23537a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23538b;

        /* renamed from: c, reason: collision with root package name */
        public int f23539c;

        /* renamed from: d, reason: collision with root package name */
        public final a<E> f23540d;

        /* renamed from: e, reason: collision with root package name */
        public final b<E> f23541e;

        /* renamed from: rg.b$a$a, reason: collision with other inner class name */
        public static final class C0261a<E> implements ListIterator<E>, fh.a {

            /* renamed from: a, reason: collision with root package name */
            public final a<E> f23542a;

            /* renamed from: b, reason: collision with root package name */
            public int f23543b;

            /* renamed from: c, reason: collision with root package name */
            public int f23544c = -1;

            /* renamed from: d, reason: collision with root package name */
            public int f23545d;

            public C0261a(a<E> aVar, int i10) {
                this.f23542a = aVar;
                this.f23543b = i10;
                this.f23545d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void add(E e10) {
                c();
                int i10 = this.f23543b;
                this.f23543b = i10 + 1;
                a<E> aVar = this.f23542a;
                aVar.add(i10, e10);
                this.f23544c = -1;
                this.f23545d = ((AbstractList) aVar).modCount;
            }

            public final void c() {
                if (((AbstractList) this.f23542a.f23541e).modCount != this.f23545d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f23543b < this.f23542a.f23539c;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f23543b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                c();
                int i10 = this.f23543b;
                a<E> aVar = this.f23542a;
                if (i10 >= aVar.f23539c) {
                    throw new NoSuchElementException();
                }
                this.f23543b = i10 + 1;
                this.f23544c = i10;
                return aVar.f23537a[aVar.f23538b + i10];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f23543b;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                c();
                int i10 = this.f23543b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f23543b = i11;
                this.f23544c = i11;
                a<E> aVar = this.f23542a;
                return aVar.f23537a[aVar.f23538b + i11];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f23543b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                c();
                int i10 = this.f23544c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a<E> aVar = this.f23542a;
                aVar.e(i10);
                this.f23543b = this.f23544c;
                this.f23544c = -1;
                this.f23545d = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e10) {
                c();
                int i10 = this.f23544c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f23542a.set(i10, e10);
            }
        }

        public a(E[] backing, int i10, int i11, a<E> aVar, b<E> root) {
            r.e(backing, "backing");
            r.e(root, "root");
            this.f23537a = backing;
            this.f23538b = i10;
            this.f23539c = i11;
            this.f23540d = aVar;
            this.f23541e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e10) {
            k();
            j();
            i(this.f23538b + this.f23539c, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> elements) {
            r.e(elements, "elements");
            k();
            j();
            int size = elements.size();
            g(this.f23538b + this.f23539c, elements, size);
            return size > 0;
        }

        @Override // qg.g
        public final int c() {
            j();
            return this.f23539c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            k();
            j();
            n(this.f23538b, this.f23539c);
        }

        @Override // qg.g
        public final E e(int i10) {
            k();
            j();
            int i11 = this.f23539c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
            }
            return m(this.f23538b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            j();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                E[] eArr = this.f23537a;
                int i10 = this.f23539c;
                if (i10 == list.size()) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (r.a(eArr[this.f23538b + i11], list.get(i11))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final void g(int i10, Collection<? extends E> collection, int i11) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f23541e;
            a<E> aVar = this.f23540d;
            if (aVar != null) {
                aVar.g(i10, collection, i11);
            } else {
                b bVar2 = b.f23533d;
                bVar.g(i10, collection, i11);
            }
            this.f23537a = bVar.f23534a;
            this.f23539c += i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i10) {
            j();
            int i11 = this.f23539c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
            }
            return this.f23537a[this.f23538b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            j();
            E[] eArr = this.f23537a;
            int i10 = this.f23539c;
            int iHashCode = 1;
            for (int i11 = 0; i11 < i10; i11++) {
                E e10 = eArr[this.f23538b + i11];
                iHashCode = (iHashCode * 31) + (e10 != null ? e10.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i(int i10, E e10) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f23541e;
            a<E> aVar = this.f23540d;
            if (aVar != null) {
                aVar.i(i10, e10);
            } else {
                b bVar2 = b.f23533d;
                bVar.i(i10, e10);
            }
            this.f23537a = bVar.f23534a;
            this.f23539c++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            j();
            for (int i10 = 0; i10 < this.f23539c; i10++) {
                if (r.a(this.f23537a[this.f23538b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            j();
            return this.f23539c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final void j() {
            if (((AbstractList) this.f23541e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void k() {
            if (this.f23541e.f23536c) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            j();
            for (int i10 = this.f23539c - 1; i10 >= 0; i10--) {
                if (r.a(this.f23537a[this.f23538b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final E m(int i10) {
            E eM;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f23540d;
            if (aVar != null) {
                eM = aVar.m(i10);
            } else {
                b bVar = b.f23533d;
                eM = this.f23541e.m(i10);
            }
            this.f23539c--;
            return eM;
        }

        public final void n(int i10, int i11) {
            if (i11 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f23540d;
            if (aVar != null) {
                aVar.n(i10, i11);
            } else {
                b bVar = b.f23533d;
                this.f23541e.n(i10, i11);
            }
            this.f23539c -= i11;
        }

        public final int o(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            int iO;
            a<E> aVar = this.f23540d;
            if (aVar != null) {
                iO = aVar.o(i10, i11, collection, z10);
            } else {
                b bVar = b.f23533d;
                iO = this.f23541e.o(i10, i11, collection, z10);
            }
            if (iO > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f23539c -= iO;
            return iO;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            k();
            j();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                e(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> elements) {
            r.e(elements, "elements");
            k();
            j();
            return o(this.f23538b, this.f23539c, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> elements) {
            r.e(elements, "elements");
            k();
            j();
            return o(this.f23538b, this.f23539c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i10, E e10) {
            k();
            j();
            int i11 = this.f23539c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
            }
            E[] eArr = this.f23537a;
            int i12 = this.f23538b;
            E e11 = eArr[i12 + i10];
            eArr[i12 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i10, int i11) {
            c.a.b(i10, i11, this.f23539c);
            return new a(this.f23537a, this.f23538b + i10, i11 - i10, this, this.f23541e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            r.e(array, "array");
            j();
            int length = array.length;
            int i10 = this.f23539c;
            int i11 = this.f23538b;
            if (length < i10) {
                T[] tArr = (T[]) Arrays.copyOfRange(this.f23537a, i11, i10 + i11, array.getClass());
                r.d(tArr, "copyOfRange(...)");
                return tArr;
            }
            m.g(this.f23537a, 0, array, i11, i10 + i11);
            int i12 = this.f23539c;
            if (i12 < array.length) {
                array[i12] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            j();
            return u1.a(this.f23537a, this.f23538b, this.f23539c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i10) {
            j();
            int i11 = this.f23539c;
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
            }
            return new C0261a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, E e10) {
            k();
            j();
            int i11 = this.f23539c;
            if (i10 >= 0 && i10 <= i11) {
                i(this.f23538b + i10, e10);
                return;
            }
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i10, Collection<? extends E> elements) {
            r.e(elements, "elements");
            k();
            j();
            int i11 = this.f23539c;
            if (i10 >= 0 && i10 <= i11) {
                int size = elements.size();
                g(this.f23538b + i10, elements, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            j();
            E[] eArr = this.f23537a;
            int i10 = this.f23539c;
            int i11 = this.f23538b;
            return m.k(eArr, i11, i10 + i11);
        }
    }

    /* renamed from: rg.b$b, reason: collision with other inner class name */
    public static final class C0262b<E> implements ListIterator<E>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final b<E> f23546a;

        /* renamed from: b, reason: collision with root package name */
        public int f23547b;

        /* renamed from: c, reason: collision with root package name */
        public int f23548c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f23549d;

        public C0262b(b<E> bVar, int i10) {
            this.f23546a = bVar;
            this.f23547b = i10;
            this.f23549d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            c();
            int i10 = this.f23547b;
            this.f23547b = i10 + 1;
            b<E> bVar = this.f23546a;
            bVar.add(i10, e10);
            this.f23548c = -1;
            this.f23549d = ((AbstractList) bVar).modCount;
        }

        public final void c() {
            if (((AbstractList) this.f23546a).modCount != this.f23549d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f23547b < this.f23546a.f23535b;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f23547b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            c();
            int i10 = this.f23547b;
            b<E> bVar = this.f23546a;
            if (i10 >= bVar.f23535b) {
                throw new NoSuchElementException();
            }
            this.f23547b = i10 + 1;
            this.f23548c = i10;
            return bVar.f23534a[i10];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f23547b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            c();
            int i10 = this.f23547b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f23547b = i11;
            this.f23548c = i11;
            return this.f23546a.f23534a[i11];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f23547b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            c();
            int i10 = this.f23548c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            b<E> bVar = this.f23546a;
            bVar.e(i10);
            this.f23547b = this.f23548c;
            this.f23548c = -1;
            this.f23549d = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            c();
            int i10 = this.f23548c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f23546a.set(i10, e10);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f23536c = true;
        f23533d = bVar;
    }

    public b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f23534a = (E[]) new Object[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        j();
        int i10 = this.f23535b;
        ((AbstractList) this).modCount++;
        k(i10, 1);
        this.f23534a[i10] = e10;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        r.e(elements, "elements");
        j();
        int size = elements.size();
        g(this.f23535b, elements, size);
        return size > 0;
    }

    @Override // qg.g
    public final int c() {
        return this.f23535b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        n(0, this.f23535b);
    }

    @Override // qg.g
    public final E e(int i10) {
        j();
        int i11 = this.f23535b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        return m(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            E[] eArr = this.f23534a;
            int i10 = this.f23535b;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (r.a(eArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, Collection<? extends E> collection, int i11) {
        ((AbstractList) this).modCount++;
        k(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f23534a[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.f23535b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        return this.f23534a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f23534a;
        int i10 = this.f23535b;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            E e10 = eArr[i11];
            iHashCode = (iHashCode * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i10, E e10) {
        ((AbstractList) this).modCount++;
        k(i10, 1);
        this.f23534a[i10] = e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f23535b; i10++) {
            if (r.a(this.f23534a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f23535b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f23536c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void k(int i10, int i11) {
        int i12 = this.f23535b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f23534a;
        if (i12 > eArr.length) {
            int length = eArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
            r.d(eArr2, "copyOf(...)");
            this.f23534a = eArr2;
        }
        E[] eArr3 = this.f23534a;
        m.g(eArr3, i10 + i11, eArr3, i10, this.f23535b);
        this.f23535b += i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f23535b - 1; i10 >= 0; i10--) {
            if (r.a(this.f23534a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final E m(int i10) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f23534a;
        E e10 = eArr[i10];
        m.g(eArr, i10, eArr, i10 + 1, this.f23535b);
        E[] eArr2 = this.f23534a;
        int i11 = this.f23535b - 1;
        r.e(eArr2, "<this>");
        eArr2[i11] = null;
        this.f23535b--;
        return e10;
    }

    public final void n(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f23534a;
        m.g(eArr, i10, eArr, i10 + i11, this.f23535b);
        E[] eArr2 = this.f23534a;
        int i12 = this.f23535b;
        u1.e(eArr2, i12 - i11, i12);
        this.f23535b -= i11;
    }

    public final int o(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f23534a[i14]) == z10) {
                E[] eArr = this.f23534a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f23534a;
        m.g(eArr2, i10 + i13, eArr2, i11 + i10, this.f23535b);
        E[] eArr3 = this.f23534a;
        int i16 = this.f23535b;
        u1.e(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f23535b -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> elements) {
        r.e(elements, "elements");
        j();
        return o(0, this.f23535b, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> elements) {
        r.e(elements, "elements");
        j();
        return o(0, this.f23535b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        j();
        int i11 = this.f23535b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        E[] eArr = this.f23534a;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        c.a.b(i10, i11, this.f23535b);
        return new a(this.f23534a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        r.e(array, "array");
        int length = array.length;
        int i10 = this.f23535b;
        if (length < i10) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f23534a, 0, i10, array.getClass());
            r.d(tArr, "copyOfRange(...)");
            return tArr;
        }
        m.g(this.f23534a, 0, array, 0, i10);
        int i11 = this.f23535b;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return u1.a(this.f23534a, 0, this.f23535b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f23535b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
        }
        return new C0262b(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> elements) {
        r.e(elements, "elements");
        j();
        int i11 = this.f23535b;
        if (i10 >= 0 && i10 <= i11) {
            int size = elements.size();
            g(i10, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        j();
        int i11 = this.f23535b;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            k(i10, 1);
            this.f23534a[i10] = e10;
            return;
        }
        throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return m.k(this.f23534a, 0, this.f23535b);
    }
}
