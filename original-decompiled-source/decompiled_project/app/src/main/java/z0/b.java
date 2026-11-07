package z0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import qg.p;

/* loaded from: classes.dex */
public final class b<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public T[] f34700a;

    /* renamed from: b, reason: collision with root package name */
    public a f34701b;

    /* renamed from: c, reason: collision with root package name */
    public int f34702c = 0;

    public static final class a<T> implements List<T>, fh.b {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f34703a;

        public a(b<T> bVar) {
            this.f34703a = bVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t3) {
            this.f34703a.b(t3);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            b<T> bVar = this.f34703a;
            return bVar.e(bVar.f34702c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f34703a.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f34703a.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            b<T> bVar = this.f34703a;
            bVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!bVar.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i10) {
            z0.c.a(i10, this);
            return this.f34703a.f34700a[i10];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f34703a.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f34703a.f34702c == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            b<T> bVar = this.f34703a;
            T[] tArr = bVar.f34700a;
            for (int i10 = bVar.f34702c - 1; i10 >= 0; i10--) {
                if (r.a(obj, tArr[i10])) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f34703a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            b<T> bVar = this.f34703a;
            bVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i10 = bVar.f34702c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                bVar.j(it.next());
            }
            return i10 != bVar.f34702c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            b<T> bVar = this.f34703a;
            int i10 = bVar.f34702c;
            for (int i11 = i10 - 1; -1 < i11; i11--) {
                if (!collection.contains(bVar.f34700a[i11])) {
                    bVar.k(i11);
                }
            }
            return i10 != bVar.f34702c;
        }

        @Override // java.util.List
        public final T set(int i10, T t3) {
            z0.c.a(i10, this);
            T[] tArr = this.f34703a.f34700a;
            T t10 = tArr[i10];
            tArr[i10] = t3;
            return t10;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f34703a.f34702c;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            z0.c.b(this, i10, i11);
            return new C0353b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.a(this);
        }

        @Override // java.util.List
        public final void add(int i10, T t3) {
            this.f34703a.a(i10, t3);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List
        public final T remove(int i10) {
            z0.c.a(i10, this);
            return this.f34703a.k(i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) i.b(this, tArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            return this.f34703a.e(i10, collection);
        }
    }

    /* renamed from: z0.b$b, reason: collision with other inner class name */
    public static final class C0353b<T> implements List<T>, fh.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f34704a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34705b;

        /* renamed from: c, reason: collision with root package name */
        public int f34706c;

        public C0353b(List<T> list, int i10, int i11) {
            this.f34704a = list;
            this.f34705b = i10;
            this.f34706c = i11;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t3) {
            int i10 = this.f34706c;
            this.f34706c = i10 + 1;
            this.f34704a.add(i10, t3);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends T> collection) {
            this.f34704a.addAll(i10 + this.f34705b, collection);
            int size = collection.size();
            this.f34706c += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i10 = this.f34706c - 1;
            int i11 = this.f34705b;
            if (i11 <= i10) {
                while (true) {
                    this.f34704a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f34706c = i11;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i10 = this.f34706c;
            for (int i11 = this.f34705b; i11 < i10; i11++) {
                if (r.a(this.f34704a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
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
            z0.c.a(i10, this);
            return (T) this.f34704a.get(i10 + this.f34705b);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i10 = this.f34706c;
            int i11 = this.f34705b;
            for (int i12 = i11; i12 < i10; i12++) {
                if (r.a(this.f34704a.get(i12), obj)) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f34706c == this.f34705b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i10 = this.f34706c - 1;
            int i11 = this.f34705b;
            if (i11 > i10) {
                return -1;
            }
            while (!r.a(this.f34704a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - i11;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i10 = this.f34706c;
            for (int i11 = this.f34705b; i11 < i10; i11++) {
                ?? r22 = this.f34704a;
                if (r.a(r22.get(i11), obj)) {
                    r22.remove(i11);
                    this.f34706c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            int i10 = this.f34706c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f34706c;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            int i10 = this.f34706c;
            int i11 = i10 - 1;
            int i12 = this.f34705b;
            if (i12 <= i11) {
                while (true) {
                    ?? r32 = this.f34704a;
                    if (!collection.contains(r32.get(i11))) {
                        r32.remove(i11);
                        this.f34706c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f34706c;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i10, T t3) {
            z0.c.a(i10, this);
            return (T) this.f34704a.set(i10 + this.f34705b, t3);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f34706c - this.f34705b;
        }

        @Override // java.util.List
        public final List<T> subList(int i10, int i11) {
            z0.c.b(this, i10, i11);
            return new C0353b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return i.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i10, T t3) {
            this.f34704a.add(i10 + this.f34705b, t3);
            this.f34706c++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) i.b(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.f34704a.addAll(this.f34706c, collection);
            int size = collection.size();
            this.f34706c += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i10) {
            z0.c.a(i10, this);
            this.f34706c--;
            return (T) this.f34704a.remove(i10 + this.f34705b);
        }
    }

    public static final class c<T> implements ListIterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f34707a;

        /* renamed from: b, reason: collision with root package name */
        public int f34708b;

        public c(List<T> list, int i10) {
            this.f34707a = list;
            this.f34708b = i10;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t3) {
            this.f34707a.add(this.f34708b, t3);
            this.f34708b++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f34708b < this.f34707a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f34708b > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i10 = this.f34708b;
            this.f34708b = i10 + 1;
            return (T) this.f34707a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f34708b;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i10 = this.f34708b - 1;
            this.f34708b = i10;
            return (T) this.f34707a.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f34708b - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i10 = this.f34708b - 1;
            this.f34708b = i10;
            this.f34707a.remove(i10);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t3) {
            this.f34707a.set(this.f34708b, t3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Object[] objArr) {
        this.f34700a = objArr;
    }

    public final void a(int i10, T t3) {
        int i11 = this.f34702c + 1;
        if (this.f34700a.length < i11) {
            m(i11);
        }
        T[] tArr = this.f34700a;
        int i12 = this.f34702c;
        if (i10 != i12) {
            System.arraycopy(tArr, i10, tArr, i10 + 1, i12 - i10);
        }
        tArr[i10] = t3;
        this.f34702c++;
    }

    public final void b(Object obj) {
        int i10 = this.f34702c + 1;
        if (this.f34700a.length < i10) {
            m(i10);
        }
        Object[] objArr = (T[]) this.f34700a;
        int i11 = this.f34702c;
        objArr[i11] = obj;
        this.f34702c = i11 + 1;
    }

    public final void c(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f34702c + size;
        if (this.f34700a.length < i11) {
            m(i11);
        }
        Object[] objArr = (T[]) this.f34700a;
        int i12 = this.f34702c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f34702c += size;
    }

    public final void d(int i10, b bVar) {
        int i11 = bVar.f34702c;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f34702c + i11;
        if (this.f34700a.length < i12) {
            m(i12);
        }
        T[] tArr = this.f34700a;
        int i13 = this.f34702c;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(bVar.f34700a, 0, tArr, i10, i11);
        this.f34702c += i11;
    }

    public final boolean e(int i10, Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f34702c + size;
        if (this.f34700a.length < i12) {
            m(i12);
        }
        T[] tArr = this.f34700a;
        int i13 = this.f34702c;
        if (i10 != i13) {
            System.arraycopy(tArr, i10, tArr, i10 + size, i13 - i10);
        }
        for (T t3 : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                p.o();
                throw null;
            }
            tArr[i11 + i10] = t3;
            i11 = i14;
        }
        this.f34702c += size;
        return true;
    }

    public final List<T> f() {
        a aVar = this.f34701b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f34701b = aVar2;
        return aVar2;
    }

    public final void g() {
        T[] tArr = this.f34700a;
        int i10 = this.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.f34702c = 0;
    }

    public final boolean h(T t3) {
        int i10 = this.f34702c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !r.a(this.f34700a[i11], t3); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(T t3) {
        T[] tArr = this.f34700a;
        int i10 = this.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (r.a(t3, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean j(T t3) {
        int i10 = i(t3);
        if (i10 < 0) {
            return false;
        }
        k(i10);
        return true;
    }

    public final T k(int i10) {
        T[] tArr = this.f34700a;
        T t3 = tArr[i10];
        int i11 = this.f34702c;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(tArr, i12, tArr, i10, i11 - i12);
        }
        int i13 = this.f34702c - 1;
        this.f34702c = i13;
        tArr[i13] = null;
        return t3;
    }

    public final void l(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f34702c;
            if (i11 < i12) {
                T[] tArr = this.f34700a;
                System.arraycopy(tArr, i11, tArr, i10, i12 - i11);
            }
            int i13 = this.f34702c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f34700a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f34702c = i14;
        }
    }

    public final void m(int i10) {
        T[] tArr = this.f34700a;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i10, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.f34700a = tArr2;
    }

    public final void n(Comparator<T> comparator) {
        Arrays.sort(this.f34700a, 0, this.f34702c, comparator);
    }
}
