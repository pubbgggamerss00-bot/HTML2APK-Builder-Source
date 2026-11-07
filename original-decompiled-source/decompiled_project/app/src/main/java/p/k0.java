package p;

import java.util.Collection;
import java.util.Iterator;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class k0<E> extends u0<E> implements fh.d {

    /* renamed from: b, reason: collision with root package name */
    public final j0<E> f20651b;

    public static final class a implements Iterator<E>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public int f20652a = -1;

        /* renamed from: b, reason: collision with root package name */
        public final lh.h f20653b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0<E> f20654c;

        @vg.e(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        /* renamed from: p.k0$a$a, reason: collision with other inner class name */
        public static final class C0242a extends vg.h implements eh.p<lh.i<? super E>, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public a f20655a;

            /* renamed from: b, reason: collision with root package name */
            public k0 f20656b;

            /* renamed from: c, reason: collision with root package name */
            public long[] f20657c;

            /* renamed from: d, reason: collision with root package name */
            public int f20658d;

            /* renamed from: e, reason: collision with root package name */
            public int f20659e;

            /* renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f20660f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ k0<E> f20661g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ a f20662h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0242a(k0<E> k0Var, a aVar, tg.e<? super C0242a> eVar) {
                super(2, eVar);
                this.f20661g = k0Var;
                this.f20662h = aVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0242a c0242a = new C0242a(this.f20661g, this.f20662h, eVar);
                c0242a.f20660f = obj;
                return c0242a;
            }

            @Override // eh.p
            public final Object invoke(Object obj, tg.e<? super pg.f0> eVar) {
                return ((C0242a) create((lh.i) obj, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                lh.i iVar;
                k0<E> k0Var;
                long[] jArr;
                int i10;
                a aVar;
                ug.a aVar2 = ug.a.f29706a;
                int i11 = this.f20659e;
                if (i11 == 0) {
                    pg.q.b(obj);
                    iVar = (lh.i) this.f20660f;
                    k0Var = this.f20661g;
                    j0<E> j0Var = k0Var.f20651b;
                    jArr = j0Var.f20714c;
                    i10 = j0Var.f20716e;
                    aVar = this.f20662h;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f20658d;
                    jArr = this.f20657c;
                    k0Var = this.f20656b;
                    aVar = this.f20655a;
                    iVar = (lh.i) this.f20660f;
                    pg.q.b(obj);
                }
                if (i10 == Integer.MAX_VALUE) {
                    return pg.f0.f21461a;
                }
                int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
                aVar.f20652a = i10;
                Object obj2 = k0Var.f20651b.f20713b[i10];
                this.f20660f = iVar;
                this.f20655a = aVar;
                this.f20656b = k0Var;
                this.f20657c = jArr;
                this.f20658d = i12;
                this.f20659e = 1;
                iVar.c(obj2, this);
                return aVar2;
            }
        }

        public a(k0<E> k0Var) {
            this.f20654c = k0Var;
            this.f20653b = e1.d.f(new C0242a(k0Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20653b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.f20653b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.f20652a;
            if (i10 != -1) {
                this.f20654c.f20651b.h(i10);
                this.f20652a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0<E> parent) {
        super(parent);
        kotlin.jvm.internal.r.e(parent, "parent");
        this.f20651b = parent;
    }

    @Override // p.u0, java.util.Set, java.util.Collection
    public final boolean add(E e10) {
        return this.f20651b.b(e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.u0, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        j0<E> j0Var = this.f20651b;
        j0Var.getClass();
        int i10 = j0Var.f20718g;
        for (Object obj : elements) {
            int iD = j0Var.d(obj);
            j0Var.f20713b[iD] = obj;
            long[] jArr = j0Var.f20714c;
            int i11 = j0Var.f20715d;
            jArr[iD] = (i11 & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((iD & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            j0Var.f20715d = iD;
            if (j0Var.f20716e == Integer.MAX_VALUE) {
                j0Var.f20716e = iD;
            }
        }
        return i10 != j0Var.f20718g;
    }

    @Override // p.u0, java.util.Set, java.util.Collection
    public final void clear() {
        this.f20651b.c();
    }

    @Override // p.u0, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // p.u0, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f20651b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r14 = -1;
     */
    @Override // p.u0, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection<? extends Object> elements) {
        int iNumberOfTrailingZeros;
        kotlin.jvm.internal.r.e(elements, "elements");
        j0<E> j0Var = this.f20651b;
        j0Var.getClass();
        int i10 = j0Var.f20718g;
        Iterator<T> it = elements.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = iHashCode ^ (iHashCode << 16);
            int i14 = i13 & CertificateBody.profileType;
            int i15 = j0Var.f20717f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = j0Var.f20712a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i11;
                int i20 = i12;
                long j10 = (((-i18) >> 63) & (jArr[i17 + i11] << (64 - i18))) | (jArr[i17] >>> i18);
                long j11 = (i14 * 72340172838076673L) ^ j10;
                long j12 = -9187201950435737472L;
                long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j13 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i16) & i15;
                    long j14 = j12;
                    if (kotlin.jvm.internal.r.a(j0Var.f20713b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j13 &= j13 - 1;
                    j12 = j14;
                }
                i12 = i20 + 8;
                i16 = (i16 + i12) & i15;
                i11 = i19;
            }
            if (iNumberOfTrailingZeros >= 0) {
                j0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i10 != j0Var.f20718g;
    }

    @Override // p.u0, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        return this.f20651b.i(elements);
    }
}
