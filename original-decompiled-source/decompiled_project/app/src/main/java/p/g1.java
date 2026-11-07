package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class g1<K, V> implements Collection<V>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0<K, V> f20624a;

    @vg.e(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", l = {1446}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super V>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f20625a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f20626b;

        /* renamed from: c, reason: collision with root package name */
        public int f20627c;

        /* renamed from: d, reason: collision with root package name */
        public int f20628d;

        /* renamed from: e, reason: collision with root package name */
        public int f20629e;

        /* renamed from: f, reason: collision with root package name */
        public int f20630f;

        /* renamed from: g, reason: collision with root package name */
        public long f20631g;

        /* renamed from: h, reason: collision with root package name */
        public int f20632h;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f20633j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ g1<K, V> f20634k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1<K, V> g1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f20634k = g1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f20634k, eVar);
            aVar.f20633j = obj;
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
            int i11 = this.f20632h;
            if (i11 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f20633j;
                v0<K, V> v0Var = this.f20634k.f20624a;
                objArr = v0Var.f20739c;
                jArr = v0Var.f20737a;
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
            int i12 = this.f20630f;
            int i13 = this.f20629e;
            long j11 = this.f20631g;
            i10 = this.f20628d;
            int i14 = this.f20627c;
            long[] jArr2 = this.f20626b;
            Object[] objArr2 = this.f20625a;
            lh.i iVar2 = (lh.i) this.f20633j;
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
                                    this.f20633j = iVar2;
                                    this.f20625a = objArr2;
                                    this.f20626b = jArr2;
                                    this.f20627c = i14;
                                    this.f20628d = i10;
                                    this.f20631g = j11;
                                    this.f20629e = i13;
                                    this.f20630f = i12;
                                    this.f20632h = 1;
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

    public g1(v0<K, V> parent) {
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20624a = parent;
    }

    @Override // java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20624a.c(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f20624a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20624a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return e1.d.f(new a(this, null));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super V> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20624a.f20741e;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
