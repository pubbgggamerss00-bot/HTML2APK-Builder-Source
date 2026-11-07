package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0<K, V> f20586a;

    @vg.e(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super Map.Entry<? extends K, ? extends V>>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public d f20587a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f20588b;

        /* renamed from: c, reason: collision with root package name */
        public int f20589c;

        /* renamed from: d, reason: collision with root package name */
        public int f20590d;

        /* renamed from: e, reason: collision with root package name */
        public int f20591e;

        /* renamed from: f, reason: collision with root package name */
        public int f20592f;

        /* renamed from: g, reason: collision with root package name */
        public long f20593g;

        /* renamed from: h, reason: collision with root package name */
        public int f20594h;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f20595j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d<K, V> f20596k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<K, V> dVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f20596k = dVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f20596k, eVar);
            aVar.f20595j = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Object obj, tg.e<? super pg.f0> eVar) {
            return ((a) create((lh.i) obj, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004e -> B:22:0x00a0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:14:0x0062). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x0097). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            lh.i iVar;
            d<K, V> dVar;
            long[] jArr;
            int length;
            int i10;
            long j10;
            ug.a aVar = ug.a.f29706a;
            int i11 = this.f20594h;
            if (i11 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f20595j;
                dVar = this.f20596k;
                jArr = dVar.f20586a.f20737a;
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
            int i12 = this.f20592f;
            int i13 = this.f20591e;
            long j11 = this.f20593g;
            i10 = this.f20590d;
            int i14 = this.f20589c;
            long[] jArr2 = this.f20588b;
            d<K, V> dVar2 = this.f20587a;
            lh.i iVar2 = (lh.i) this.f20595j;
            pg.q.b(obj);
            j11 >>= 8;
            i12++;
            if (i12 < i13) {
                if (i13 == 8) {
                    length = i14;
                    jArr = jArr2;
                    dVar = dVar2;
                    iVar = iVar2;
                    if (i10 != length) {
                        i10++;
                        j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            dVar2 = dVar;
                            i13 = 8 - ((~(i10 - length)) >>> 31);
                            iVar2 = iVar;
                            i12 = 0;
                            jArr2 = jArr;
                            i14 = length;
                            j11 = j10;
                            if (i12 < i13) {
                                if ((255 & j11) < 128) {
                                    int i15 = (i10 << 3) + i12;
                                    v0<K, V> v0Var = dVar2.f20586a;
                                    t tVar = new t(v0Var.f20738b[i15], v0Var.f20739c[i15]);
                                    this.f20595j = iVar2;
                                    this.f20587a = dVar2;
                                    this.f20588b = jArr2;
                                    this.f20589c = i14;
                                    this.f20590d = i10;
                                    this.f20593g = j11;
                                    this.f20591e = i13;
                                    this.f20592f = i12;
                                    this.f20594h = 1;
                                    iVar2.c(tVar, this);
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

    public d(v0<K, V> parent) {
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20586a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.r.a(this.f20586a.d(entry.getKey()), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!kotlin.jvm.internal.r.a(this.f20586a.d(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f20586a.e();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return e1.d.f(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f20586a.f20741e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.r.e(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }
}
