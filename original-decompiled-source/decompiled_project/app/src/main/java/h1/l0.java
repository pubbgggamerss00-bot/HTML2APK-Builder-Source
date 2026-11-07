package h1;

import h1.u;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x0.b2;

/* loaded from: classes.dex */
public final class l0<T> implements List<T>, fh.b {

    /* renamed from: a, reason: collision with root package name */
    public final u<T> f12146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12147b;

    /* renamed from: c, reason: collision with root package name */
    public int f12148c;

    /* renamed from: d, reason: collision with root package name */
    public int f12149d;

    public static final class a implements ListIterator<T>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.e0 f12150a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0<T> f12151b;

        public a(kotlin.jvm.internal.e0 e0Var, l0<T> l0Var) {
            this.f12150a = e0Var;
            this.f12151b = l0Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f12150a.f16324a < this.f12151b.f12149d - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f12150a.f16324a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            kotlin.jvm.internal.e0 e0Var = this.f12150a;
            int i10 = e0Var.f16324a + 1;
            l0<T> l0Var = this.f12151b;
            v.a(i10, l0Var.f12149d);
            e0Var.f16324a = i10;
            return l0Var.get(i10);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f12150a.f16324a + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            kotlin.jvm.internal.e0 e0Var = this.f12150a;
            int i10 = e0Var.f16324a;
            l0<T> l0Var = this.f12151b;
            v.a(i10, l0Var.f12149d);
            e0Var.f16324a = i10 - 1;
            return l0Var.get(i10);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f12150a.f16324a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public l0(u<T> uVar, int i10, int i11) {
        this.f12146a = uVar;
        this.f12147b = i10;
        this.f12148c = uVar.g();
        this.f12149d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t3) {
        c();
        int i10 = this.f12147b + this.f12149d;
        u<T> uVar = this.f12146a;
        uVar.add(i10, t3);
        this.f12149d++;
        this.f12148c = uVar.g();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.f12149d, collection);
    }

    public final void c() {
        if (this.f12146a.g() != this.f12148c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        if (this.f12149d > 0) {
            c();
            u<T> uVar = this.f12146a;
            int i11 = this.f12147b;
            int i12 = this.f12149d + i11;
            do {
                synchronized (v.f12186a) {
                    u.a aVar = uVar.f12179a;
                    kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    u.a aVar2 = (u.a) n.i(aVar);
                    i10 = aVar2.f12181d;
                    cVar = aVar2.f12180c;
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                kotlin.jvm.internal.r.b(cVar);
                b1.f fVarBuilder = cVar.builder();
                fVarBuilder.subList(i11, i12).clear();
                a1.c cVarF = fVarBuilder.f();
                if (kotlin.jvm.internal.r.a(cVarF, cVar)) {
                    break;
                }
                u.a aVar3 = uVar.f12179a;
                kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (n.f12160c) {
                    hVarK = n.k();
                    zE = u.e((u.a) n.w(aVar3, uVar, hVarK), i10, cVarF, true);
                }
                n.n(hVarK, uVar);
            } while (!zE);
            this.f12149d = 0;
            this.f12148c = this.f12146a.g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i10) {
        c();
        v.a(i10, this.f12149d);
        return this.f12146a.get(this.f12147b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i10 = this.f12149d;
        int i11 = this.f12147b;
        Iterator<Integer> it = jh.j.q(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((qg.h0) it).nextInt();
            if (kotlin.jvm.internal.r.a(obj, this.f12146a.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12149d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i10 = this.f12149d;
        int i11 = this.f12147b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (kotlin.jvm.internal.r.a(obj, this.f12146a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        c();
        u<T> uVar = this.f12146a;
        int i11 = this.f12147b;
        int i12 = this.f12149d + i11;
        int size = uVar.size();
        do {
            synchronized (v.f12186a) {
                u.a aVar = uVar.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                u.a aVar2 = (u.a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            b1.f fVarBuilder = cVar.builder();
            fVarBuilder.subList(i11, i12).retainAll(collection);
            a1.c cVarF = fVarBuilder.f();
            if (kotlin.jvm.internal.r.a(cVarF, cVar)) {
                break;
            }
            u.a aVar3 = uVar.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = u.e((u.a) n.w(aVar3, uVar, hVarK), i10, cVarF, true);
            }
            n.n(hVarK, uVar);
        } while (!zE);
        int size2 = size - uVar.size();
        if (size2 > 0) {
            this.f12148c = this.f12146a.g();
            this.f12149d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i10, T t3) {
        v.a(i10, this.f12149d);
        c();
        int i11 = i10 + this.f12147b;
        u<T> uVar = this.f12146a;
        T t10 = uVar.set(i11, t3);
        this.f12148c = uVar.g();
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12149d;
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f12149d)) {
            b2.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i12 = this.f12147b;
        return new l0(this.f12146a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        c();
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        e0Var.f16324a = i10 - 1;
        return new a(e0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.i.b(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        c();
        int i11 = i10 + this.f12147b;
        u<T> uVar = this.f12146a;
        boolean zAddAll = uVar.addAll(i11, collection);
        if (zAddAll) {
            this.f12149d = collection.size() + this.f12149d;
            this.f12148c = uVar.g();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i10) {
        c();
        int i11 = this.f12147b + i10;
        u<T> uVar = this.f12146a;
        T tRemove = uVar.remove(i11);
        this.f12149d--;
        this.f12148c = uVar.g();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i10, T t3) {
        c();
        int i11 = this.f12147b + i10;
        u<T> uVar = this.f12146a;
        uVar.add(i11, t3);
        this.f12149d++;
        this.f12148c = uVar.g();
    }
}
