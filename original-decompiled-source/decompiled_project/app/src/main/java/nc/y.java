package nc;

import c9.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import nc.r;
import nc.v;

/* loaded from: classes2.dex */
public abstract class y<E> extends z<E> implements NavigableSet<E>, b1<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f18789f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final transient Comparator<? super E> f18790d;

    /* renamed from: e, reason: collision with root package name */
    public transient y<E> f18791e;

    public static final class a<E> extends v.a<E> {

        /* renamed from: d, reason: collision with root package name */
        public final Comparator<? super E> f18792d;

        public a(Comparator<? super E> comparator) {
            comparator.getClass();
            this.f18792d = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nc.v.a
        public final v.a c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // nc.v.a
        public final /* bridge */ /* synthetic */ v d() {
            throw null;
        }
    }

    public y(Comparator<? super E> comparator) {
        this.f18790d = comparator;
    }

    public static x0 o(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return t(comparator);
        }
        h1.m.c(i10, objArr);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new x0(r.i(i11, objArr), comparator);
    }

    public static <E> y<E> q(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        comparator.getClass();
        if (t1.b(comparator, iterable) && (iterable instanceof y)) {
            y<E> yVar = (y) iterable;
            if (!yVar.f()) {
                return yVar;
            }
        }
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            j0.a(arrayList, it);
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        return o(comparator, array.length, array);
    }

    public static <E> x0<E> t(Comparator<? super E> comparator) {
        return n0.f18723a.equals(comparator) ? (x0<E>) x0.f18787h : new x0<>(u0.f18756e, comparator);
    }

    public E ceiling(E e10) {
        e10.getClass();
        Iterator<E> it = w(e10, true).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Override // java.util.SortedSet, nc.b1
    public final Comparator<? super E> comparator() {
        return this.f18790d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        y<E> yVar = this.f18791e;
        if (yVar != null) {
            return yVar;
        }
        x0 x0VarR = r();
        this.f18791e = x0VarR;
        x0VarR.f18791e = this;
        return x0VarR;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        e10.getClass();
        r.a aVarDescendingIterator = u(e10, true).descendingIterator();
        if (aVarDescendingIterator.hasNext()) {
            return aVarDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return u(obj, z10);
    }

    public E higher(E e10) {
        e10.getClass();
        Iterator<E> it = w(e10, false).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        e10.getClass();
        r.a aVarDescendingIterator = u(e10, false).descendingIterator();
        if (aVarDescendingIterator.hasNext()) {
            return aVarDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract x0 r();

    @Override // java.util.NavigableSet
    /* renamed from: s */
    public abstract r.a descendingIterator();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        g8.w.c(this.f18790d.compare(obj, obj2) <= 0);
        return v(obj, z10, obj2, z11);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return w(obj, z10);
    }

    public abstract x0 u(Object obj, boolean z10);

    public abstract y<E> v(E e10, boolean z10, E e11, boolean z11);

    public abstract x0 w(Object obj, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return u(obj, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return w(obj, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        g8.w.c(this.f18790d.compare(obj, obj2) <= 0);
        return v(obj, true, obj2, false);
    }
}
