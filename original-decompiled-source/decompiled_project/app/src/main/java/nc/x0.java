package nc;

import c9.t1;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import nc.r;

/* loaded from: classes2.dex */
public final class x0<E> extends y<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final x0<Comparable> f18787h;

    /* renamed from: g, reason: collision with root package name */
    public final transient r<E> f18788g;

    static {
        r.a aVar = r.f18735b;
        f18787h = new x0<>(u0.f18756e, n0.f18723a);
    }

    public x0(r<E> rVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f18788g = rVar;
    }

    public final int A(E e10, boolean z10) {
        e10.getClass();
        int iBinarySearch = Collections.binarySearch(this.f18788g, e10, this.f18790d);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // nc.v, nc.p
    public final r<E> a() {
        return this.f18788g;
    }

    @Override // nc.p
    public final int b(Object[] objArr) {
        return this.f18788g.b(objArr);
    }

    @Override // nc.p
    public final Object[] c() {
        return this.f18788g.c();
    }

    @Override // nc.y, java.util.NavigableSet
    public final E ceiling(E e10) {
        int iA = A(e10, true);
        r<E> rVar = this.f18788g;
        if (iA == rVar.size()) {
            return null;
        }
        return rVar.get(iA);
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f18788g, obj, this.f18790d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof m0) {
            collection = ((m0) collection).p();
        }
        Comparator<? super E> comparator = this.f18790d;
        if (!t1.b(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        e1<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        a aVar = (a) it;
        if (!aVar.hasNext()) {
            return false;
        }
        a2.a aVar2 = (Object) it2.next();
        a2.a aVar3 = (Object) aVar.next();
        while (true) {
            try {
                int iCompare = comparator.compare(aVar3, aVar2);
                if (iCompare < 0) {
                    if (!aVar.hasNext()) {
                        return false;
                    }
                    aVar3 = (Object) aVar.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    aVar2 = (Object) it2.next();
                } else if (iCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // nc.p
    public final int d() {
        return this.f18788g.d();
    }

    @Override // nc.p
    public final int e() {
        return this.f18788g.e();
    }

    @Override // nc.v, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        a2.a aVar;
        E next;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f18788g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator<? super E> comparator = this.f18790d;
        if (!t1.b(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            e1<E> it2 = iterator();
            do {
                a aVar2 = (a) it2;
                if (!aVar2.hasNext()) {
                    return true;
                }
                aVar = (Object) aVar2.next();
                next = it.next();
                if (next == null) {
                    break;
                }
            } while (comparator.compare(aVar, next) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // nc.p
    public final boolean f() {
        return this.f18788g.f();
    }

    @Override // nc.y, java.util.SortedSet
    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18788g.get(0);
    }

    @Override // nc.y, java.util.NavigableSet
    public final E floor(E e10) {
        int iY = y(e10, true) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f18788g.get(iY);
    }

    @Override // nc.y, nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final e1<E> iterator() {
        return this.f18788g.listIterator(0);
    }

    @Override // nc.y, java.util.NavigableSet
    public final E higher(E e10) {
        int iA = A(e10, false);
        r<E> rVar = this.f18788g;
        if (iA == rVar.size()) {
            return null;
        }
        return rVar.get(iA);
    }

    @Override // nc.y, java.util.SortedSet
    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f18788g.get(r0.size() - 1);
    }

    @Override // nc.y, java.util.NavigableSet
    public final E lower(E e10) {
        int iY = y(e10, false) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f18788g.get(iY);
    }

    @Override // nc.y
    public final x0 r() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f18790d);
        return isEmpty() ? y.t(comparatorReverseOrder) : new x0(this.f18788g.o(), comparatorReverseOrder);
    }

    @Override // nc.y, java.util.NavigableSet
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r.a descendingIterator() {
        return this.f18788g.o().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18788g.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nc.y
    public final x0 u(Object obj, boolean z10) {
        return x(0, y(obj, z10));
    }

    @Override // nc.y
    public final y<E> v(E e10, boolean z10, E e11, boolean z11) {
        return w(e10, z10).u(e11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nc.y
    public final x0 w(Object obj, boolean z10) {
        return x(A(obj, z10), this.f18788g.size());
    }

    public final x0<E> x(int i10, int i11) {
        r<E> rVar = this.f18788g;
        if (i10 == 0 && i11 == rVar.size()) {
            return this;
        }
        Comparator<? super E> comparator = this.f18790d;
        return i10 < i11 ? new x0<>(rVar.subList(i10, i11), comparator) : y.t(comparator);
    }

    public final int y(E e10, boolean z10) {
        e10.getClass();
        int iBinarySearch = Collections.binarySearch(this.f18788g, e10, this.f18790d);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }
}
