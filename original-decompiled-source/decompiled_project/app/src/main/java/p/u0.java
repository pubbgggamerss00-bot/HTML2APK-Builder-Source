package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class u0<E> implements Set<E>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final s0<E> f20727a;

    @vg.e(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super E>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f20728a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f20729b;

        /* renamed from: c, reason: collision with root package name */
        public int f20730c;

        /* renamed from: d, reason: collision with root package name */
        public int f20731d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f20732e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ u0<E> f20733f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0<E> u0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f20733f = u0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f20733f, eVar);
            aVar.f20732e = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Object obj, tg.e<? super pg.f0> eVar) {
            return ((a) create((lh.i) obj, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            lh.i iVar;
            Object[] objArr;
            long[] jArr;
            int i10;
            ug.a aVar = ug.a.f29706a;
            int i11 = this.f20731d;
            if (i11 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f20732e;
                s0<E> s0Var = this.f20733f.f20727a;
                objArr = s0Var.f20713b;
                jArr = s0Var.f20714c;
                i10 = s0Var.f20716e;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f20730c;
                jArr = this.f20729b;
                objArr = this.f20728a;
                iVar = (lh.i) this.f20732e;
                pg.q.b(obj);
            }
            if (i10 == Integer.MAX_VALUE) {
                return pg.f0.f21461a;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj2 = objArr[i10];
            this.f20732e = iVar;
            this.f20728a = objArr;
            this.f20729b = jArr;
            this.f20730c = i12;
            this.f20731d = 1;
            iVar.c(obj2, this);
            return aVar;
        }
    }

    public u0(j0 parent) {
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20727a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20727a.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f20727a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f20727a, ((u0) obj).f20727a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f20727a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f20727a.f20718g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return e1.d.f(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f20727a.f20718g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return this.f20727a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
