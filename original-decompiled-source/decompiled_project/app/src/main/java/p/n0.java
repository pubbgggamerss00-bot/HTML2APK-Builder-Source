package p;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n0<E> extends z0<E> implements fh.d {

    /* renamed from: b, reason: collision with root package name */
    public final m0<E> f20682b;

    public static final class a implements Iterator<E>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public int f20683a = -1;

        /* renamed from: b, reason: collision with root package name */
        public final lh.h f20684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n0<E> f20685c;

        @vg.e(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        /* renamed from: p.n0$a$a, reason: collision with other inner class name */
        public static final class C0243a extends vg.h implements eh.p<lh.i<? super E>, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public a f20686a;

            /* renamed from: b, reason: collision with root package name */
            public n0 f20687b;

            /* renamed from: c, reason: collision with root package name */
            public long[] f20688c;

            /* renamed from: d, reason: collision with root package name */
            public int f20689d;

            /* renamed from: e, reason: collision with root package name */
            public int f20690e;

            /* renamed from: f, reason: collision with root package name */
            public int f20691f;

            /* renamed from: g, reason: collision with root package name */
            public int f20692g;

            /* renamed from: h, reason: collision with root package name */
            public long f20693h;

            /* renamed from: j, reason: collision with root package name */
            public int f20694j;

            /* renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f20695k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ n0<E> f20696l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ a f20697m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0243a(n0<E> n0Var, a aVar, tg.e<? super C0243a> eVar) {
                super(2, eVar);
                this.f20696l = n0Var;
                this.f20697m = aVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0243a c0243a = new C0243a(this.f20696l, this.f20697m, eVar);
                c0243a.f20695k = obj;
                return c0243a;
            }

            @Override // eh.p
            public final Object invoke(Object obj, tg.e<? super pg.f0> eVar) {
                return ((C0243a) create((lh.i) obj, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:22:0x00a2). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0067). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:19:0x0097). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                lh.i iVar;
                n0<E> n0Var;
                long[] jArr;
                int length;
                a aVar;
                int i10;
                long j10;
                ug.a aVar2 = ug.a.f29706a;
                int i11 = this.f20694j;
                if (i11 == 0) {
                    pg.q.b(obj);
                    iVar = (lh.i) this.f20695k;
                    n0Var = this.f20696l;
                    jArr = n0Var.f20682b.f20752a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        aVar = this.f20697m;
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
                int i12 = this.f20692g;
                int i13 = this.f20691f;
                long j11 = this.f20693h;
                int i14 = this.f20690e;
                int i15 = this.f20689d;
                long[] jArr2 = this.f20688c;
                n0<E> n0Var2 = this.f20687b;
                a aVar3 = this.f20686a;
                lh.i iVar2 = (lh.i) this.f20695k;
                pg.q.b(obj);
                j11 >>= 8;
                i12++;
                if (i12 < i13) {
                    if (i13 == 8) {
                        length = i15;
                        jArr = jArr2;
                        n0Var = n0Var2;
                        iVar = iVar2;
                        i10 = i14;
                        aVar = aVar3;
                        if (i10 != length) {
                            i10++;
                            j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                iVar2 = iVar;
                                i12 = 0;
                                n0Var2 = n0Var;
                                jArr2 = jArr;
                                i13 = 8 - ((~(i10 - length)) >>> 31);
                                aVar3 = aVar;
                                i14 = i10;
                                i15 = length;
                                j11 = j10;
                                if (i12 < i13) {
                                    if ((255 & j11) < 128) {
                                        int i16 = (i14 << 3) + i12;
                                        aVar3.f20683a = i16;
                                        Object obj2 = n0Var2.f20682b.f20753b[i16];
                                        this.f20695k = iVar2;
                                        this.f20686a = aVar3;
                                        this.f20687b = n0Var2;
                                        this.f20688c = jArr2;
                                        this.f20689d = i15;
                                        this.f20690e = i14;
                                        this.f20693h = j11;
                                        this.f20691f = i13;
                                        this.f20692g = i12;
                                        this.f20694j = 1;
                                        iVar2.c(obj2, this);
                                        ug.a aVar4 = ug.a.f29706a;
                                        return aVar2;
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

        public a(n0<E> n0Var) {
            this.f20685c = n0Var;
            this.f20684b = e1.d.f(new C0243a(n0Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20684b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f20684b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.f20683a;
            if (i10 != -1) {
                this.f20685c.f20682b.m(i10);
                this.f20683a = -1;
            }
        }
    }

    public n0(m0<E> m0Var) {
        super(m0Var);
        this.f20682b = m0Var;
    }

    @Override // p.z0, java.util.Set, java.util.Collection
    public final boolean add(E e10) {
        return this.f20682b.d(e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.z0, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        m0<E> m0Var = this.f20682b;
        m0Var.getClass();
        int i10 = m0Var.f20755d;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            m0Var.j(it.next());
        }
        return i10 != m0Var.f20755d;
    }

    @Override // p.z0, java.util.Set, java.util.Collection
    public final void clear() {
        this.f20682b.e();
    }

    @Override // p.z0, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // p.z0, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f20682b.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.z0, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        m0<E> m0Var = this.f20682b;
        m0Var.getClass();
        int i10 = m0Var.f20755d;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            m0Var.i(it.next());
        }
        return i10 != m0Var.f20755d;
    }

    @Override // p.z0, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        boolean z10;
        kotlin.jvm.internal.r.e(elements, "elements");
        m0<E> m0Var = this.f20682b;
        m0Var.getClass();
        Object[] objArr = m0Var.f20753b;
        int i10 = m0Var.f20755d;
        long[] jArr = m0Var.f20752a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!qg.x.w(elements, objArr[i14])) {
                                m0Var.m(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    z10 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z10 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z10 = false;
        }
        if (i10 != m0Var.f20755d) {
            return true;
        }
        return z10;
    }
}
