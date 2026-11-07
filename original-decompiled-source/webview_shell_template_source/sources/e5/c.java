package e5;

import androidx.camera.camera2.internal.g0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<E> extends e5.a<E> implements List<E> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        public static void a(int i6, int i7, int i8) {
            if (i6 < 0 || i7 > i8) {
                StringBuilder sbA = g0.a("fromIndex: ", i6, ", toIndex: ", i7, ", size: ");
                sbA.append(i8);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i6 > i7) {
                throw new IllegalArgumentException(androidx.camera.view.g.e("fromIndex: ", i6, i7, " > toIndex: "));
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Iterator<E>, q5.a {
        public int s;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.s < c.this.c();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i6 = this.s;
            this.s = i6 + 1;
            return c.this.get(i6);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: e5.c$c, reason: collision with other inner class name */
    public class C0056c extends c<E>.b implements ListIterator<E> {
        public C0056c(int i6) {
            super();
            int iC = c.this.c();
            if (i6 < 0 || i6 > iC) {
                throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, iC, ", size: "));
            }
            this.s = i6;
        }

        @Override // java.util.ListIterator
        public final void add(E e6) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.s > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.s;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i6 = this.s - 1;
            this.s = i6;
            return c.this.get(i6);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.s - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e6) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d<E> extends c<E> implements RandomAccess {
        public final c<E> s;

        /* renamed from: t, reason: collision with root package name */
        public final int f12929t;

        /* renamed from: u, reason: collision with root package name */
        public final int f12930u;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i6, int i7) {
            this.s = cVar;
            this.f12929t = i6;
            a.a(i6, i7, cVar.c());
            this.f12930u = i7 - i6;
        }

        @Override // e5.a
        public final int c() {
            return this.f12930u;
        }

        @Override // java.util.List
        public final E get(int i6) {
            int i7 = this.f12930u;
            if (i6 < 0 || i6 >= i7) {
                throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
            }
            return this.s.get(this.f12929t + i6);
        }
    }

    @Override // java.util.List
    public final void add(int i6, E e6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i6, Collection<? extends E> collection) {
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
                if (!kotlin.jvm.internal.j.a(it2.next(), it.next())) {
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

    @Override // java.util.List
    public int indexOf(E e6) {
        Iterator<E> it = iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.j.a(it.next(), e6)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e6) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.j.a(listIterator.previous(), e6)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new C0056c(0);
    }

    @Override // java.util.List
    public final E remove(int i6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i6, E e6) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i6, int i7) {
        return new d(this, i6, i7);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i6) {
        return new C0056c(i6);
    }
}
