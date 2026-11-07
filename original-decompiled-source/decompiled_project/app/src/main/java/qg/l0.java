package qg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class l0<T> extends c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final List<T> f22730a;

    public static final class a implements ListIterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final ListIterator<T> f22731a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0<T> f22732b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l0<? extends T> l0Var, int i10) {
            this.f22732b = l0Var;
            List<T> list = l0Var.f22730a;
            if (i10 >= 0 && i10 <= l0Var.c()) {
                this.f22731a = list.listIterator(l0Var.c() - i10);
                return;
            }
            StringBuilder sbB = p.i0.b(i10, "Position index ", " must be in range [");
            sbB.append(new jh.g(0, l0Var.c(), 1));
            sbB.append("].");
            throw new IndexOutOfBoundsException(sbB.toString());
        }

        @Override // java.util.ListIterator
        public final void add(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f22731a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f22731a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f22731a.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return p.i(this.f22732b) - this.f22731a.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f22731a.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return p.i(this.f22732b) - this.f22731a.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(List<? extends T> delegate) {
        kotlin.jvm.internal.r.e(delegate, "delegate");
        this.f22730a = delegate;
    }

    @Override // qg.a
    public final int c() {
        return this.f22730a.size();
    }

    @Override // java.util.List
    public final T get(int i10) {
        if (i10 >= 0 && i10 <= p.i(this)) {
            return this.f22730a.get(p.i(this) - i10);
        }
        StringBuilder sbB = p.i0.b(i10, "Element index ", " must be in range [");
        sbB.append(new jh.g(0, p.i(this), 1));
        sbB.append("].");
        throw new IndexOutOfBoundsException(sbB.toString());
    }

    @Override // qg.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this, 0);
    }

    @Override // qg.c, java.util.List
    public final ListIterator<T> listIterator() {
        return new a(this, 0);
    }

    @Override // qg.c, java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
