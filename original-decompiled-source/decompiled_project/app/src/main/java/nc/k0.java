package nc;

import i0.u2;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class k0 {

    public static class a<T> extends b<T> implements RandomAccess {
    }

    public static class b<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<T> f18708a;

        public class a implements ListIterator<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f18709a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListIterator f18710b;

            public a(ListIterator listIterator) {
                this.f18710b = listIterator;
            }

            @Override // java.util.ListIterator
            public final void add(T t3) {
                ListIterator listIterator = this.f18710b;
                listIterator.add(t3);
                listIterator.previous();
                this.f18709a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f18710b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f18710b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final T next() {
                ListIterator listIterator = this.f18710b;
                if (!listIterator.hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f18709a = true;
                return (T) listIterator.previous();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b.this.a(this.f18710b.nextIndex());
            }

            @Override // java.util.ListIterator
            public final T previous() {
                ListIterator listIterator = this.f18710b;
                if (!listIterator.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f18709a = true;
                return (T) listIterator.next();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                if (!this.f18709a) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f18710b.remove();
                this.f18709a = false;
            }

            @Override // java.util.ListIterator
            public final void set(T t3) {
                if (!this.f18709a) {
                    throw new IllegalStateException();
                }
                this.f18710b.set(t3);
            }
        }

        public b(List<T> list) {
            list.getClass();
            this.f18708a = list;
        }

        public final int a(int i10) {
            int size = this.f18708a.size();
            g8.w.f(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, T t3) {
            this.f18708a.add(a(i10), t3);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f18708a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i10) {
            List<T> list = this.f18708a;
            int size = list.size();
            g8.w.d(i10, size);
            return list.get((size - 1) - i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this.f18708a.listIterator(a(i10)));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i10) {
            List<T> list = this.f18708a;
            int size = list.size();
            g8.w.d(i10, size);
            return list.remove((size - 1) - i10);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T set(int i10, T t3) {
            List<T> list = this.f18708a;
            int size = list.size();
            g8.w.d(i10, size);
            return list.set((size - 1) - i10, t3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18708a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<T> subList(int i10, int i11) {
            List<T> list = this.f18708a;
            g8.w.g(i10, i11, list.size());
            return k0.c(list.subList(a(i11), a(i10)));
        }
    }

    public static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f18712a;

        /* renamed from: b, reason: collision with root package name */
        public final lc.e<? super F, ? extends T> f18713b;

        public class a extends d1<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // nc.c1
            public final T a(F f10) {
                return c.this.f18713b.apply(f10);
            }
        }

        public c(List<F> list, lc.e<? super F, ? extends T> eVar) {
            list.getClass();
            this.f18712a = list;
            eVar.getClass();
            this.f18713b = eVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f18712a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i10) {
            return this.f18713b.apply(this.f18712a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.f18712a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this.f18712a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i10) {
            return this.f18713b.apply(this.f18712a.remove(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18712a.size();
        }
    }

    public static class d<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final List<F> f18715a;

        /* renamed from: b, reason: collision with root package name */
        public final lc.e<? super F, ? extends T> f18716b;

        public class a extends d1<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // nc.c1
            public final T a(F f10) {
                return d.this.f18716b.apply(f10);
            }
        }

        public d(List<F> list, lc.e<? super F, ? extends T> eVar) {
            list.getClass();
            this.f18715a = list;
            eVar.getClass();
            this.f18716b = eVar;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.f18715a.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this.f18715a.listIterator(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18715a.size();
        }
    }

    public static <E> ArrayList<E> a(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        ArrayList<E> arrayList = new ArrayList<>();
        j0.a(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> b(E... eArr) {
        int length = eArr.length;
        g.b(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(u2.i(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> c(List<T> list) {
        return list instanceof r ? ((r) list).o() : list instanceof b ? ((b) list).f18708a : list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static AbstractList d(List list, lc.e eVar) {
        return list instanceof RandomAccess ? new c(list, eVar) : new d(list, eVar);
    }
}
