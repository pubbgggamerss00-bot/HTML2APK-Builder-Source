package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class h0<E> extends q0<E> {

    /* renamed from: c, reason: collision with root package name */
    public b<E> f20636c;

    public static final class a<T> implements ListIterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20637a;

        /* renamed from: b, reason: collision with root package name */
        public int f20638b;

        public a(List<T> list, int i10) {
            this.f20637a = list;
            this.f20638b = i10 - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t3) {
            int i10 = this.f20638b + 1;
            this.f20638b = i10;
            this.f20637a.add(i10, t3);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f20638b < this.f20637a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f20638b >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f20638b + 1;
            this.f20638b = i10;
            return (T) this.f20637a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f20638b + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f20638b;
            this.f20638b = i10 - 1;
            return (T) this.f20637a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f20638b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f20637a.remove(this.f20638b);
            this.f20638b--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t3) {
            this.f20637a.set(this.f20638b, t3);
        }
    }

    public static final class b<T> implements List<T>, fh.b {

        /* renamed from: a, reason: collision with root package name */
        public final h0<T> f20639a;

        public b(h0<T> h0Var) {
            this.f20639a = h0Var;
        }

        @Override // java.util.List
        public final void add(int i10, T t3) {
            int i11;
            h0<T> h0Var = this.f20639a;
            if (i10 < 0 || i10 > (i11 = h0Var.f20707b)) {
                StringBuilder sbB = i0.b(i10, "Index ", " must be in 0..");
                sbB.append(h0Var.f20707b);
                q.d.b(sbB.toString());
                throw null;
            }
            int i12 = i11 + 1;
            Object[] objArr = h0Var.f20706a;
            if (objArr.length < i12) {
                h0Var.m(i12, objArr);
            }
            Object[] objArr2 = h0Var.f20706a;
            int i13 = h0Var.f20707b;
            if (i10 != i13) {
                qg.m.g(objArr2, i10 + 1, objArr2, i10, i13);
            }
            objArr2[i10] = t3;
            h0Var.f20707b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            h0<T> h0Var = this.f20639a;
            if (i10 < 0 || i10 > h0Var.f20707b) {
                StringBuilder sbB = i0.b(i10, "Index ", " must be in 0..");
                sbB.append(h0Var.f20707b);
                q.d.b(sbB.toString());
                throw null;
            }
            int i11 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            int size = elements.size() + h0Var.f20707b;
            Object[] objArr = h0Var.f20706a;
            if (objArr.length < size) {
                h0Var.m(size, objArr);
            }
            Object[] objArr2 = h0Var.f20706a;
            if (i10 != h0Var.f20707b) {
                qg.m.g(objArr2, elements.size() + i10, objArr2, i10, h0Var.f20707b);
            }
            for (T t3 : elements) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    qg.p.o();
                    throw null;
                }
                objArr2[i11 + i10] = t3;
                i11 = i12;
            }
            h0Var.f20707b = elements.size() + h0Var.f20707b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f20639a.i();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f20639a.c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (this.f20639a.c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            r0.a(i10, this);
            return this.f20639a.b(i10);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f20639a.c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f20639a.d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            h0<T> h0Var = this.f20639a;
            if (obj == null) {
                Object[] objArr = h0Var.f20706a;
                for (int i10 = h0Var.f20707b - 1; -1 < i10; i10--) {
                    if (objArr[i10] == null) {
                        return i10;
                    }
                }
            } else {
                Object[] objArr2 = h0Var.f20706a;
                for (int i11 = h0Var.f20707b - 1; -1 < i11; i11--) {
                    if (obj.equals(objArr2[i11])) {
                        return i11;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f20639a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            h0<T> h0Var = this.f20639a;
            h0Var.getClass();
            int i10 = h0Var.f20707b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                h0Var.j(it.next());
            }
            return i10 != h0Var.f20707b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            h0<T> h0Var = this.f20639a;
            h0Var.getClass();
            int i10 = h0Var.f20707b;
            Object[] objArr = h0Var.f20706a;
            for (int i11 = i10 - 1; -1 < i11; i11--) {
                if (!elements.contains(objArr[i11])) {
                    h0Var.k(i11);
                }
            }
            return i10 != h0Var.f20707b;
        }

        @Override // java.util.List
        public final T set(int i10, T t3) {
            r0.a(i10, this);
            h0<T> h0Var = this.f20639a;
            if (i10 < 0 || i10 >= h0Var.f20707b) {
                h0Var.f(i10);
                throw null;
            }
            Object[] objArr = h0Var.f20706a;
            T t10 = (T) objArr[i10];
            objArr[i10] = t3;
            return t10;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f20639a.f20707b;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            r0.b(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.i.a(this);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            r0.a(i10, this);
            return this.f20639a.k(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            return (T[]) kotlin.jvm.internal.i.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t3) {
            this.f20639a.g(t3);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            h0<T> h0Var = this.f20639a;
            int i10 = h0Var.f20707b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                h0Var.g(it.next());
            }
            return i10 != h0Var.f20707b;
        }
    }

    public static final class c<T> implements List<T>, fh.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20640a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20641b;

        /* renamed from: c, reason: collision with root package name */
        public int f20642c;

        public c(List<T> list, int i10, int i11) {
            this.f20640a = list;
            this.f20641b = i10;
            this.f20642c = i11;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t3) {
            int i10 = this.f20642c;
            this.f20642c = i10 + 1;
            this.f20640a.add(i10, t3);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            this.f20640a.addAll(i10 + this.f20641b, elements);
            this.f20642c = elements.size() + this.f20642c;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f20642c - 1;
            int i11 = this.f20641b;
            if (i11 <= i10) {
                while (true) {
                    this.f20640a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f20642c = i11;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f20642c;
            for (int i11 = this.f20641b; i11 < i10; i11++) {
                if (kotlin.jvm.internal.r.a(this.f20640a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i10) {
            r0.a(i10, this);
            return (T) this.f20640a.get(i10 + this.f20641b);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f20642c;
            int i11 = this.f20641b;
            for (int i12 = i11; i12 < i10; i12++) {
                if (kotlin.jvm.internal.r.a(this.f20640a.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f20642c == this.f20641b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new a(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f20642c - 1;
            int i11 = this.f20641b;
            if (i11 > i10) {
                return -1;
            }
            while (!kotlin.jvm.internal.r.a(this.f20640a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f20642c;
            for (int i11 = this.f20641b; i11 < i10; i11++) {
                ?? r22 = this.f20640a;
                if (kotlin.jvm.internal.r.a(r22.get(i11), obj)) {
                    r22.remove(i11);
                    this.f20642c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            int i10 = this.f20642c;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f20642c;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            int i10 = this.f20642c;
            int i11 = i10 - 1;
            int i12 = this.f20641b;
            if (i12 <= i11) {
                while (true) {
                    ?? r32 = this.f20640a;
                    if (!elements.contains(r32.get(i11))) {
                        r32.remove(i11);
                        this.f20642c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f20642c;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i10, T t3) {
            r0.a(i10, this);
            return (T) this.f20640a.set(i10 + this.f20641b, t3);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f20642c - this.f20641b;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            r0.b(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.i.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i10, T t3) {
            this.f20640a.add(i10 + this.f20641b, t3);
            this.f20642c++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.r.e(array, "array");
            return (T[]) kotlin.jvm.internal.i.b(this, array);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> elements) {
            kotlin.jvm.internal.r.e(elements, "elements");
            this.f20640a.addAll(this.f20642c, elements);
            this.f20642c = elements.size() + this.f20642c;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i10) {
            r0.a(i10, this);
            this.f20642c--;
            return (T) this.f20640a.remove(i10 + this.f20641b);
        }
    }

    public h0() {
        this((Object) null);
    }

    public final void g(Object obj) {
        int i10 = this.f20707b + 1;
        Object[] objArr = this.f20706a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        Object[] objArr2 = this.f20706a;
        int i11 = this.f20707b;
        objArr2[i11] = obj;
        this.f20707b = i11 + 1;
    }

    public final void h(List elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f20707b;
        int size = elements.size() + i10;
        Object[] objArr = this.f20706a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f20706a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f20707b = elements.size() + this.f20707b;
    }

    public final void i() {
        qg.m.m(this.f20706a, 0, this.f20707b, null);
        this.f20707b = 0;
    }

    public final boolean j(E e10) {
        int iC = c(e10);
        if (iC < 0) {
            return false;
        }
        k(iC);
        return true;
    }

    public final E k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20707b)) {
            f(i10);
            throw null;
        }
        Object[] objArr = this.f20706a;
        E e10 = (E) objArr[i10];
        if (i10 != i11 - 1) {
            qg.m.g(objArr, i10, objArr, i10 + 1, i11);
        }
        int i12 = this.f20707b - 1;
        this.f20707b = i12;
        objArr[i12] = null;
        return e10;
    }

    public final void l(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f20707b) || i11 < 0 || i11 > i12) {
            StringBuilder sbA = g0.a(i10, i11, "Start (", ") and end (", ") must be in 0..");
            sbA.append(this.f20707b);
            q.d.b(sbA.toString());
            throw null;
        }
        if (i11 < i10) {
            q.d.a("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f20706a;
                qg.m.g(objArr, i10, objArr, i11, i12);
            }
            int i13 = this.f20707b;
            int i14 = i13 - (i11 - i10);
            qg.m.m(this.f20706a, i14, i13, null);
            this.f20707b = i14;
        }
    }

    public final void m(int i10, Object[] oldContent) {
        kotlin.jvm.internal.r.e(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i10, (length * 3) / 2)];
        qg.m.g(oldContent, 0, objArr, 0, length);
        this.f20706a = objArr;
    }

    public h0(int i10) {
        this.f20706a = i10 == 0 ? r0.f20710a : new Object[i10];
    }

    public /* synthetic */ h0(Object obj) {
        this(16);
    }
}
