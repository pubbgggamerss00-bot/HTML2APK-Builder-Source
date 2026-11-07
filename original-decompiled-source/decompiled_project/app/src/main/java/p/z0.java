package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class z0<E> implements Set<E>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f20764a;

    @vg.e(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super E>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f20765a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f20766b;

        /* renamed from: c, reason: collision with root package name */
        public int f20767c;

        /* renamed from: d, reason: collision with root package name */
        public int f20768d;

        /* renamed from: e, reason: collision with root package name */
        public int f20769e;

        /* renamed from: f, reason: collision with root package name */
        public int f20770f;

        /* renamed from: g, reason: collision with root package name */
        public long f20771g;

        /* renamed from: h, reason: collision with root package name */
        public int f20772h;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f20773j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ z0<E> f20774k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0<E> z0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f20774k = z0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f20774k, eVar);
            aVar.f20773j = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Object obj, tg.e<? super pg.f0> eVar) {
            return ((a) create((lh.i) obj, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            lh.i iVar;
            Object[] objArr;
            long[] jArr;
            int length;
            int i10;
            long j10;
            ug.a aVar = ug.a.f29706a;
            int i11 = this.f20772h;
            if (i11 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f20773j;
                m0 m0Var = this.f20774k.f20764a;
                objArr = m0Var.f20753b;
                jArr = m0Var.f20752a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i10 = 0;
                    j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i10 != length) {
                    }
                }
                return pg.f0.f21461a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f20770f;
            int i13 = this.f20769e;
            long j11 = this.f20771g;
            i10 = this.f20768d;
            int i14 = this.f20767c;
            long[] jArr2 = this.f20766b;
            Object[] objArr2 = this.f20765a;
            lh.i iVar2 = (lh.i) this.f20773j;
            pg.q.b(obj);
            j11 >>= 8;
            i12++;
            if (i12 < i13) {
                if (i13 == 8) {
                    length = i14;
                    jArr = jArr2;
                    objArr = objArr2;
                    iVar = iVar2;
                    if (i10 != length) {
                        i10++;
                        j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            iVar2 = iVar;
                            i12 = 0;
                            jArr2 = jArr;
                            i14 = length;
                            i13 = 8 - ((~(i10 - length)) >>> 31);
                            objArr2 = objArr;
                            j11 = j10;
                            if (i12 < i13) {
                                if ((255 & j11) < 128) {
                                    Object obj2 = objArr2[(i10 << 3) + i12];
                                    this.f20773j = iVar2;
                                    this.f20765a = objArr2;
                                    this.f20766b = jArr2;
                                    this.f20767c = i14;
                                    this.f20768d = i10;
                                    this.f20771g = j11;
                                    this.f20769e = i13;
                                    this.f20770f = i12;
                                    this.f20772h = 1;
                                    iVar2.c(obj2, this);
                                    ug.a aVar2 = ug.a.f29706a;
                                    return aVar;
                                }
                                j11 >>= 8;
                                i12++;
                                if (i12 < i13) {
                                }
                            }
                        }
                        if (i10 != length) {
                        }
                    }
                }
                return pg.f0.f21461a;
            }
        }
    }

    public z0(m0 m0Var) {
        this.f20764a = m0Var;
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
        return this.f20764a.a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f20764a.a(it.next())) {
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
        return this.f20764a.equals(((z0) obj).f20764a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f20764a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f20764a.b();
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
        return this.f20764a.f20755d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    public final String toString() {
        return this.f20764a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
