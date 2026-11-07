package nc;

import i0.u2;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class j0 {

    public static final class a<T> extends nc.a<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f18695d = new a(new Object[0], 0);

        /* renamed from: c, reason: collision with root package name */
        public final T[] f18696c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object[] objArr, int i10) {
            super(i10, 0);
            this.f18696c = objArr;
        }

        @Override // nc.a
        public final T a(int i10) {
            return this.f18696c[i10];
        }
    }

    public static class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<? extends T> f18697a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<? extends T> f18698b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator<? extends Iterator<? extends T>> f18699c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayDeque f18700d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<? extends Iterator<? extends T>> it;
            while (true) {
                Iterator<? extends T> it2 = this.f18698b;
                it2.getClass();
                if (it2.hasNext()) {
                    return true;
                }
                while (true) {
                    Iterator<? extends Iterator<? extends T>> it3 = this.f18699c;
                    if (it3 != null && it3.hasNext()) {
                        it = this.f18699c;
                        break;
                    }
                    ArrayDeque arrayDeque = this.f18700d;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.f18699c = (Iterator) this.f18700d.removeFirst();
                }
                it = null;
                this.f18699c = it;
                if (it == null) {
                    return false;
                }
                Iterator<? extends T> next = it.next();
                this.f18698b = next;
                if (next instanceof b) {
                    b bVar = (b) next;
                    this.f18698b = bVar.f18698b;
                    if (this.f18700d == null) {
                        this.f18700d = new ArrayDeque();
                    }
                    this.f18700d.addFirst(this.f18699c);
                    if (bVar.f18700d != null) {
                        while (!bVar.f18700d.isEmpty()) {
                            this.f18700d.addFirst(bVar.f18700d.removeLast());
                        }
                    }
                    this.f18699c = bVar.f18699c;
                }
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it = this.f18698b;
            this.f18697a = it;
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            Iterator<? extends T> it = this.f18697a;
            if (!(it != null)) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f18697a = null;
        }
    }

    public static class c<T> extends e1<T> {

        /* renamed from: a, reason: collision with root package name */
        public final PriorityQueue f18701a;

        public class a implements Comparator<p0<Object>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f18702a;

            public a(Comparator comparator) {
                this.f18702a = comparator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(p0<Object> p0Var, p0<Object> p0Var2) {
                return this.f18702a.compare(p0Var.peek(), p0Var2.peek());
            }
        }

        public c(Comparator comparator, Iterable iterable) {
            this.f18701a = new PriorityQueue(2, new a(comparator));
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                Iterator it2 = (Iterator) it.next();
                if (it2.hasNext()) {
                    this.f18701a.add(it2 instanceof d ? (d) it2 : new d(it2));
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f18701a.isEmpty();
        }

        @Override // java.util.Iterator
        public final T next() {
            PriorityQueue priorityQueue = this.f18701a;
            p0 p0Var = (p0) priorityQueue.remove();
            T t3 = (T) p0Var.next();
            if (p0Var.hasNext()) {
                priorityQueue.add(p0Var);
            }
            return t3;
        }
    }

    public static class d<E> implements p0<E> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<? extends E> f18703a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18704b;

        /* renamed from: c, reason: collision with root package name */
        public E f18705c;

        public d(Iterator<? extends E> it) {
            this.f18703a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18704b || this.f18703a.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!this.f18704b) {
                return this.f18703a.next();
            }
            E e10 = this.f18705c;
            this.f18704b = false;
            this.f18705c = null;
            return e10;
        }

        @Override // nc.p0
        public final E peek() {
            if (!this.f18704b) {
                this.f18705c = this.f18703a.next();
                this.f18704b = true;
            }
            return this.f18705c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f18704b) {
                throw new IllegalStateException("Can't remove after you've peeked at next");
            }
            this.f18703a.remove();
        }
    }

    public static boolean a(AbstractCollection abstractCollection, Iterator it) {
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= abstractCollection.add(it.next());
        }
        return zAdd;
    }

    public static b b(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        e0 e0Var = new e0(new Iterator[]{it, it2});
        b bVar = new b();
        bVar.f18698b = a.f18695d;
        bVar.f18699c = e0Var;
        return bVar;
    }

    public static boolean c(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !lc.i.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static f0 d(Iterator it, lc.l lVar) {
        it.getClass();
        lVar.getClass();
        return new f0(it, lVar);
    }

    @SafeVarargs
    public static a e(Object... objArr) {
        int length = objArr.length;
        g8.w.c(length >= 0);
        g8.w.g(0, length, objArr.length);
        g8.w.f(0, length);
        return length == 0 ? a.f18695d : new a(objArr, length);
    }

    public static c f(u0 u0Var, Comparator comparator) {
        g8.w.e(u0Var, "iterators");
        g8.w.e(comparator, "comparator");
        return new c(comparator, u0Var);
    }

    public static int g(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return u2.i(j10);
    }
}
