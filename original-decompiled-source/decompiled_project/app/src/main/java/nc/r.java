package nc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nc.p;

/* loaded from: classes2.dex */
public abstract class r<E> extends p<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18735b = new a(0, u0.f18756e);

    public static class a<E> extends nc.a<E> {

        /* renamed from: c, reason: collision with root package name */
        public final r<E> f18736c;

        public a(int i10, r rVar) {
            super(rVar.size(), i10);
            this.f18736c = rVar;
        }

        @Override // nc.a
        public final E a(int i10) {
            return this.f18736c.get(i10);
        }
    }

    public static class b<E> extends r<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient r<E> f18737c;

        public b(r<E> rVar) {
            this.f18737c = rVar;
        }

        @Override // nc.r, nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f18737c.contains(obj);
        }

        @Override // nc.p
        public final boolean f() {
            return this.f18737c.f();
        }

        @Override // java.util.List
        public final E get(int i10) {
            r<E> rVar = this.f18737c;
            g8.w.d(i10, rVar.size());
            return rVar.get((rVar.size() - 1) - i10);
        }

        @Override // nc.r, java.util.List
        public final int indexOf(Object obj) {
            int iLastIndexOf = this.f18737c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (r0.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // nc.r, nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // nc.r, java.util.List
        public final int lastIndexOf(Object obj) {
            int iIndexOf = this.f18737c.indexOf(obj);
            if (iIndexOf >= 0) {
                return (r0.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // nc.r, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // nc.r
        public final r<E> o() {
            return this.f18737c;
        }

        @Override // nc.r, java.util.List
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final r<E> subList(int i10, int i11) {
            r<E> rVar = this.f18737c;
            g8.w.g(i10, i11, rVar.size());
            return rVar.subList(rVar.size() - i11, rVar.size() - i10).o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18737c.size();
        }

        @Override // nc.r, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public class c extends r<E> {

        /* renamed from: c, reason: collision with root package name */
        public final transient int f18738c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f18739d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r f18740e;

        public c(int i10, int i11, r rVar) {
            this.f18740e = rVar;
            this.f18738c = i10;
            this.f18739d = i11;
        }

        @Override // nc.p
        public final Object[] c() {
            return this.f18740e.c();
        }

        @Override // nc.p
        public final int d() {
            return this.f18740e.e() + this.f18738c + this.f18739d;
        }

        @Override // nc.p
        public final int e() {
            return this.f18740e.e() + this.f18738c;
        }

        @Override // nc.p
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i10) {
            g8.w.d(i10, this.f18739d);
            return this.f18740e.get(i10 + this.f18738c);
        }

        @Override // nc.r, nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // nc.r, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // nc.r, java.util.List
        /* renamed from: q */
        public final r<E> subList(int i10, int i11) {
            g8.w.g(i10, i11, this.f18739d);
            int i12 = this.f18738c;
            return this.f18740e.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18739d;
        }

        @Override // nc.r, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return listIterator(i10);
        }
    }

    public static u0 i(int i10, Object[] objArr) {
        return i10 == 0 ? u0.f18756e : new u0(objArr, i10);
    }

    public static <E> r<E> j(Iterable<? extends E> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? k((Collection) iterable) : m(iterable.iterator());
    }

    public static <E> r<E> k(Collection<? extends E> collection) {
        if (!(collection instanceof p)) {
            Object[] array = collection.toArray();
            h1.m.c(array.length, array);
            return i(array.length, array);
        }
        r<E> rVarA = ((p) collection).a();
        if (!rVarA.f()) {
            return rVarA;
        }
        Object[] array2 = rVarA.toArray(p.f18724a);
        return i(array2.length, array2);
    }

    public static u0 m(Iterator it) {
        Object[] objArrCopyOf;
        if (!it.hasNext()) {
            return u0.f18756e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            h1.m.c(1, objArr);
            return i(1, objArr);
        }
        g.b(4, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[4];
        next.getClass();
        int i10 = 0 + 1;
        if (objArrCopyOf2.length < i10) {
            objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, p.b.a(objArrCopyOf2.length, i10));
        }
        int i11 = 0 + 1;
        objArrCopyOf2[0] = next;
        boolean z10 = false;
        while (it.hasNext()) {
            Object next2 = it.next();
            next2.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf2.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf2, p.b.a(objArrCopyOf2.length, i12));
            } else if (z10) {
                objArrCopyOf = (Object[]) objArrCopyOf2.clone();
            } else {
                objArrCopyOf2[i11] = next2;
                i11++;
            }
            objArrCopyOf2 = objArrCopyOf;
            z10 = false;
            objArrCopyOf2[i11] = next2;
            i11++;
        }
        return i(i11, objArrCopyOf2);
    }

    @Override // nc.p
    public final r<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nc.p
    public int b(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(list instanceof RandomAccess)) {
                    return j0.c(iterator(), list.iterator());
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (lc.i.a(get(i10), list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // nc.p
    /* renamed from: g */
    public final e1<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final a listIterator(int i10) {
        g8.w.f(i10, size());
        return isEmpty() ? f18735b : new a(i10, this);
    }

    public r<E> o() {
        return size() <= 1 ? this : new b(this);
    }

    @Override // java.util.List
    /* renamed from: q */
    public r<E> subList(int i10, int i11) {
        g8.w.g(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? u0.f18756e : new c(i10, i12, this);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
