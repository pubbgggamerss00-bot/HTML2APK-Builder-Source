package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class l<K, V> implements Set<K>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0<K, V> f20663a;

    @vg.e(c = "androidx.collection.Keys$iterator$1", f = "ScatterMap.kt", l = {1431}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super K>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f20664a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f20665b;

        /* renamed from: c, reason: collision with root package name */
        public int f20666c;

        /* renamed from: d, reason: collision with root package name */
        public int f20667d;

        /* renamed from: e, reason: collision with root package name */
        public int f20668e;

        /* renamed from: f, reason: collision with root package name */
        public int f20669f;

        /* renamed from: g, reason: collision with root package name */
        public long f20670g;

        /* renamed from: h, reason: collision with root package name */
        public int f20671h;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f20672j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l<K, V> f20673k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l<K, V> lVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f20673k = lVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f20673k, eVar);
            aVar.f20672j = obj;
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
            int i11 = this.f20671h;
            if (i11 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f20672j;
                v0<K, V> v0Var = this.f20673k.f20663a;
                objArr = v0Var.f20738b;
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
            int i12 = this.f20669f;
            int i13 = this.f20668e;
            long j11 = this.f20670g;
            i10 = this.f20667d;
            int i14 = this.f20666c;
            long[] jArr2 = this.f20665b;
            Object[] objArr2 = this.f20664a;
            lh.i iVar2 = (lh.i) this.f20672j;
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
                                    this.f20672j = iVar2;
                                    this.f20664a = objArr2;
                                    this.f20665b = jArr2;
                                    this.f20666c = i14;
                                    this.f20667d = i10;
                                    this.f20670g = j11;
                                    this.f20668e = i13;
                                    this.f20669f = i12;
                                    this.f20671h = 1;
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

    public l(v0<K, V> parent) {
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20663a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(K k10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20663a.b(obj);
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
            if (!this.f20663a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f20663a.e();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
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
        return this.f20663a.f20741e;
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
