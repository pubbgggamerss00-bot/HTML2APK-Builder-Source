package h1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x0.b2;

/* loaded from: classes.dex */
public final class u<T> implements i0, List<T>, RandomAccess, fh.b {

    /* renamed from: a, reason: collision with root package name */
    public a f12179a;

    public static final class a<T> extends k0 {

        /* renamed from: c, reason: collision with root package name */
        public a1.c<? extends T> f12180c;

        /* renamed from: d, reason: collision with root package name */
        public int f12181d;

        /* renamed from: e, reason: collision with root package name */
        public int f12182e;

        public a(long j10, a1.c<? extends T> cVar) {
            super(j10);
            this.f12180c = cVar;
        }

        @Override // h1.k0
        public final void a(k0 k0Var) {
            synchronized (v.f12186a) {
                kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.f12180c = ((a) k0Var).f12180c;
                this.f12181d = ((a) k0Var).f12181d;
                this.f12182e = ((a) k0Var).f12182e;
                pg.f0 f0Var = pg.f0.f21461a;
            }
        }

        @Override // h1.k0
        public final k0 b() {
            return c(n.k().g());
        }

        @Override // h1.k0
        public final k0 c(long j10) {
            return new a(j10, this.f12180c);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<List<T>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12183a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f12184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f12183a = i10;
            this.f12184b = collection;
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f12183a, this.f12184b));
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<List<T>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f12185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Collection<? extends T> collection) {
            super(1);
            this.f12185a = collection;
        }

        @Override // eh.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f12185a));
        }
    }

    public u() {
        h hVarK = n.k();
        long jG = hVarK.g();
        b1.j jVar = b1.j.f3502b;
        a aVar = new a(jG, jVar);
        if (!(hVarK instanceof h1.b)) {
            aVar.f12134b = new a(1, jVar);
        }
        this.f12179a = aVar;
    }

    public static boolean e(a aVar, int i10, a1.c cVar, boolean z10) {
        boolean z11;
        synchronized (v.f12186a) {
            try {
                int i11 = aVar.f12181d;
                if (i11 == i10) {
                    aVar.f12180c = cVar;
                    z11 = true;
                    if (z10) {
                        aVar.f12182e++;
                    }
                    aVar.f12181d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t3) {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarAdd = cVar.add((a1.c<? extends T>) t3);
            if (cVarAdd.equals(cVar)) {
                return false;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i10, cVarAdd, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends T> collection) {
        return i(new b(i10, collection));
    }

    @Override // h1.i0
    public final k0 c() {
        return this.f12179a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        h hVarK;
        a aVar = this.f12179a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (n.f12160c) {
            hVarK = n.k();
            a aVar2 = (a) n.w(aVar, this, hVarK);
            synchronized (v.f12186a) {
                aVar2.f12180c = b1.j.f3502b;
                aVar2.f12181d++;
                aVar2.f12182e++;
            }
        }
        n.n(hVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return f().f12180c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return f().f12180c.containsAll(collection);
    }

    public final a<T> f() {
        a aVar = this.f12179a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) n.t(aVar, this);
    }

    public final int g() {
        a aVar = this.f12179a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) n.i(aVar)).f12182e;
    }

    @Override // java.util.List
    public final T get(int i10) {
        return f().f12180c.get(i10);
    }

    public final boolean i(eh.l<? super List<T>, Boolean> lVar) {
        int i10;
        a1.c<? extends T> cVar;
        Boolean boolInvoke;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            b1.f fVarBuilder = cVar.builder();
            boolInvoke = lVar.invoke(fVarBuilder);
            a1.c cVarF = fVarBuilder.f();
            if (kotlin.jvm.internal.r.a(cVarF, cVar)) {
                break;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i10, cVarF, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return f().f12180c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return f().f12180c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // h1.i0
    public final void k(k0 k0Var) {
        k0Var.f12134b = this.f12179a;
        this.f12179a = (a) k0Var;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return f().f12180c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new c0(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i10) {
        int i11;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        T t3 = get(i10);
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i11 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarE = cVar.E(i10);
            if (cVarE.equals(cVar)) {
                break;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i11, cVarE, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return t3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarRemoveAll = cVar.removeAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.r.a(cVarRemoveAll, cVar)) {
                return false;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i10, cVarRemoveAll, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return i(new c(collection));
    }

    @Override // java.util.List
    public final T set(int i10, T t3) {
        int i11;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        T t10 = get(i10);
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i11 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVar2 = cVar.set(i10, (int) t3);
            if (cVar2.equals(cVar)) {
                break;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i11, cVar2, false);
            }
            n.n(hVarK, this);
        } while (!zE);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return f().f12180c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            b2.a("fromIndex or toIndex are out of bounds");
        }
        return new l0(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        a aVar = this.f12179a;
        kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) n.i(aVar)).f12180c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarAddAll = cVar.addAll((Collection<? extends Object>) collection);
            if (kotlin.jvm.internal.r.a(cVarAddAll, cVar)) {
                return false;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i10, cVarAddAll, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i10) {
        return new c0(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.i.b(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i10, T t3) {
        int i11;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i11 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarAdd = cVar.add(i10, (int) t3);
            if (cVarAdd.equals(cVar)) {
                return;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i11, cVarAdd, true);
            }
            n.n(hVarK, this);
        } while (!zE);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        a1.c<? extends T> cVar;
        h hVarK;
        boolean zE;
        do {
            synchronized (v.f12186a) {
                a aVar = this.f12179a;
                kotlin.jvm.internal.r.c(aVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) n.i(aVar);
                i10 = aVar2.f12181d;
                cVar = aVar2.f12180c;
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kotlin.jvm.internal.r.b(cVar);
            a1.c<? extends T> cVarRemove = cVar.remove((a1.c<? extends T>) obj);
            if (kotlin.jvm.internal.r.a(cVarRemove, cVar)) {
                return false;
            }
            a aVar3 = this.f12179a;
            kotlin.jvm.internal.r.c(aVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f12160c) {
                hVarK = n.k();
                zE = e((a) n.w(aVar3, this, hVarK), i10, cVarRemove, true);
            }
            n.n(hVarK, this);
        } while (!zE);
        return true;
    }
}
