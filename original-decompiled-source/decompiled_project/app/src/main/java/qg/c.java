package qg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class c<E> extends qg.a<E> implements List<E> {

    public static final class a {
        public static void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = p.g0.a(i10, i11, "startIndex: ", ", endIndex: ", ", size: ");
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(e1.c.a(i10, i11, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = p.g0.a(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(e1.c.a(i10, i11, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    public class b implements Iterator<E>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public int f22712a;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f22712a < c.this.c();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f22712a;
            this.f22712a = i10 + 1;
            return c.this.get(i10);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: qg.c$c, reason: collision with other inner class name */
    public class C0253c extends c<E>.b implements ListIterator<E> {
        public C0253c(int i10) {
            super();
            int iC = c.this.c();
            if (i10 < 0 || i10 > iC) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, iC, "index: ", ", size: "));
            }
            this.f22712a = i10;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f22712a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f22712a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f22712a - 1;
            this.f22712a = i10;
            return c.this.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f22712a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final c<E> f22715a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22716b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22717c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            this.f22715a = cVar;
            this.f22716b = i10;
            a.b(i10, i11, cVar.c());
            this.f22717c = i11 - i10;
        }

        @Override // qg.a
        public final int c() {
            return this.f22717c;
        }

        @Override // java.util.List
        public final E get(int i10) {
            int i11 = this.f22717c;
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "index: ", ", size: "));
            }
            return this.f22715a.get(this.f22716b + i10);
        }
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.r.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.r.a(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.r.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C0253c(0);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    public ListIterator<E> listIterator(int i10) {
        return new C0253c(i10);
    }
}
