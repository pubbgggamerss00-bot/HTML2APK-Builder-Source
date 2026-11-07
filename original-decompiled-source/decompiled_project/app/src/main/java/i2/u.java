package i2;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class u implements List<d.c>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final p.h0<Object> f14021a = new p.h0<>(16);

    /* renamed from: b, reason: collision with root package name */
    public final p.b0 f14022b = new p.b0(16);

    /* renamed from: c, reason: collision with root package name */
    public int f14023c = -1;

    public final class b implements List<d.c>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14028a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14029b;

        public b(int i10, int i11) {
            this.f14028a = i10;
            this.f14029b = i11;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i10, d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i10, Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof d.c) && indexOf((d.c) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((d.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final d.c get(int i10) {
            Object objB = u.this.f14021a.b(i10 + this.f14028a);
            kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) objB;
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            d.c cVar = (d.c) obj;
            int i10 = this.f14028a;
            int i11 = this.f14029b;
            if (i10 <= i11) {
                int i12 = i10;
                while (!kotlin.jvm.internal.r.a(u.this.f14021a.b(i12), cVar)) {
                    if (i12 != i11) {
                        i12++;
                    }
                }
                return i12 - i10;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<d.c> iterator() {
            int i10 = this.f14028a;
            return u.this.new a(i10, i10, this.f14029b);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            d.c cVar = (d.c) obj;
            int i10 = this.f14029b;
            int i11 = this.f14028a;
            if (i11 <= i10) {
                while (!kotlin.jvm.internal.r.a(u.this.f14021a.b(i10), cVar)) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
                return i10 - i11;
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator<d.c> listIterator() {
            int i10 = this.f14028a;
            return u.this.new a(i10, i10, this.f14029b);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ d.c remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<d.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ d.c set(int i10, d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f14029b - this.f14028a;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super d.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<d.c> subList(int i10, int i11) {
            int i12 = this.f14028a;
            return u.this.new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.i.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<d.c> listIterator(int i10) {
            int i11 = this.f14028a;
            int i12 = this.f14029b;
            return u.this.new a(i10 + i11, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.i.b(this, tArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        q.d.b("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c() {
        long jA = v.a(Float.POSITIVE_INFINITY, false, false);
        int i10 = this.f14023c + 1;
        int i11 = qg.p.i(this);
        if (i10 > i11) {
            return jA;
        }
        while (true) {
            p.b0 b0Var = this.f14022b;
            if (i10 < 0) {
                b0Var.getClass();
                break;
            }
            if (i10 >= b0Var.f20573b) {
                break;
            }
            long j10 = b0Var.f20572a[i10];
            if (f1.m.b(j10, jA) < 0) {
                jA = j10;
            }
            if ((f1.m.c(jA) < CropImageView.DEFAULT_ASPECT_RATIO && f1.m.f(jA)) || i10 == i11) {
                break;
            }
            i10++;
        }
        return jA;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f14023c = -1;
        this.f14021a.i();
        this.f14022b.f20573b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d.c) && indexOf((d.c) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f14021a.l(i10, i11);
        p.b0 b0Var = this.f14022b;
        if (i10 >= 0) {
            int i12 = b0Var.f20573b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    q.d.a("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = b0Var.f20572a;
                        qg.m.e(i10, jArr, i11, jArr, i12);
                    }
                    b0Var.f20573b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            b0Var.getClass();
        }
        q.d.b("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final d.c get(int i10) {
        Object objB = this.f14021a.b(i10);
        kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (d.c) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d.c)) {
            return -1;
        }
        d.c cVar = (d.c) obj;
        int i10 = qg.p.i(this);
        if (i10 >= 0) {
            int i11 = 0;
            while (!kotlin.jvm.internal.r.a(this.f14021a.b(i11), cVar)) {
                if (i11 != i10) {
                    i11++;
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f14021a.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<d.c> iterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d.c)) {
            return -1;
        }
        d.c cVar = (d.c) obj;
        for (int i10 = qg.p.i(this); -1 < i10; i10--) {
            if (kotlin.jvm.internal.r.a(this.f14021a.b(i10), cVar)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<d.c> listIterator() {
        return new a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ d.c remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<d.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ d.c set(int i10, d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14021a.f20707b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super d.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<d.c> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<d.c> listIterator(int i10) {
        return new a(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.i.b(this, tArr);
    }

    public final class a implements ListIterator<d.c>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public int f14024a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14026c;

        public a(u uVar, int i10, int i11) {
            this((i11 & 1) != 0 ? 0 : i10, 0, uVar.f14021a.f20707b);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f14024a < this.f14026c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f14024a > this.f14025b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            p.h0<Object> h0Var = u.this.f14021a;
            int i10 = this.f14024a;
            this.f14024a = i10 + 1;
            Object objB = h0Var.b(i10);
            kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) objB;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f14024a - this.f14025b;
        }

        @Override // java.util.ListIterator
        public final d.c previous() {
            p.h0<Object> h0Var = u.this.f14021a;
            int i10 = this.f14024a - 1;
            this.f14024a = i10;
            Object objB = h0Var.b(i10);
            kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) objB;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f14024a - this.f14025b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i10, int i11, int i12) {
            this.f14024a = i10;
            this.f14025b = i11;
            this.f14026c = i12;
        }
    }
}
