package z0;

import eh.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import lh.i;
import p.x0;
import pg.f0;
import pg.q;
import vg.h;

/* loaded from: classes.dex */
public final class d<T> implements Set<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0<T> f34709a;

    @vg.e(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {31}, m = "invokeSuspend")
    public static final class a extends h implements p<i<? super T>, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f34710a;

        /* renamed from: b, reason: collision with root package name */
        public long[] f34711b;

        /* renamed from: c, reason: collision with root package name */
        public int f34712c;

        /* renamed from: d, reason: collision with root package name */
        public int f34713d;

        /* renamed from: e, reason: collision with root package name */
        public int f34714e;

        /* renamed from: f, reason: collision with root package name */
        public int f34715f;

        /* renamed from: g, reason: collision with root package name */
        public long f34716g;

        /* renamed from: h, reason: collision with root package name */
        public int f34717h;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f34718j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d<T> f34719k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f34719k = dVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f34719k, eVar);
            aVar.f34718j = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(Object obj, tg.e<? super f0> eVar) {
            return ((a) create((i) obj, eVar)).invokeSuspend(f0.f21461a);
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
            i iVar;
            Object[] objArr;
            long[] jArr;
            int length;
            int i10;
            long j10;
            ug.a aVar = ug.a.f29706a;
            int i11 = this.f34717h;
            if (i11 == 0) {
                q.b(obj);
                iVar = (i) this.f34718j;
                x0<T> x0Var = this.f34719k.f34709a;
                objArr = x0Var.f20753b;
                jArr = x0Var.f20752a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i10 = 0;
                    j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i10 != length) {
                    }
                }
                return f0.f21461a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f34715f;
            int i13 = this.f34714e;
            long j11 = this.f34716g;
            i10 = this.f34713d;
            int i14 = this.f34712c;
            long[] jArr2 = this.f34711b;
            Object[] objArr2 = this.f34710a;
            i iVar2 = (i) this.f34718j;
            q.b(obj);
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
                                    this.f34718j = iVar2;
                                    this.f34710a = objArr2;
                                    this.f34711b = jArr2;
                                    this.f34712c = i14;
                                    this.f34713d = i10;
                                    this.f34716g = j11;
                                    this.f34714e = i13;
                                    this.f34715f = i12;
                                    this.f34717h = 1;
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
                return f0.f21461a;
            }
        }
    }

    public d(x0<T> x0Var) {
        this.f34709a = x0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f34709a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f34709a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f34709a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
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
        return this.f34709a.f20755d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.i.b(this, tArr);
    }
}
