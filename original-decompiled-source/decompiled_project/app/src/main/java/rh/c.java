package rh;

import c0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.y2;
import rh.l;
import th.n;

/* loaded from: classes2.dex */
public class c<E> implements h<E> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23580b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23581c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23582d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f23583e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23584f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23585g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23586h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23587j = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23588k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f23589a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final class a implements j<E>, y2 {

        /* renamed from: a, reason: collision with root package name */
        public Object f23590a = g.f23617p;

        /* renamed from: b, reason: collision with root package name */
        public ph.m<? super Boolean> f23591b;

        public a() {
        }

        @Override // rh.j
        public final Object a(vg.c cVar) throws Throwable {
            m<E> mVarR;
            Object obj = this.f23590a;
            boolean z10 = true;
            if (obj == g.f23617p || obj == g.f23613l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f23585g;
                c<E> cVar2 = c.this;
                m<E> mVar = (m) atomicReferenceFieldUpdater.get(cVar2);
                while (true) {
                    if (cVar2.y()) {
                        this.f23590a = g.f23613l;
                        Throwable thS = cVar2.s();
                        if (thS != null) {
                            int i10 = uh.u.f29769a;
                            throw thS;
                        }
                        z10 = false;
                    } else {
                        long andIncrement = c.f23581c.getAndIncrement(cVar2);
                        long j10 = g.f23603b;
                        long j11 = andIncrement / j10;
                        int i11 = (int) (andIncrement % j10);
                        if (mVar.f29768c != j11) {
                            mVarR = cVar2.r(j11, mVar);
                            if (mVarR == null) {
                                continue;
                            }
                        } else {
                            mVarR = mVar;
                        }
                        Object objJ = cVar2.J(mVarR, i11, andIncrement, null);
                        uh.v vVar = g.f23614m;
                        if (objJ == vVar) {
                            throw new IllegalStateException("unreachable");
                        }
                        uh.v vVar2 = g.f23616o;
                        if (objJ == vVar2) {
                            if (andIncrement < cVar2.v()) {
                                mVarR.a();
                            }
                            mVar = mVarR;
                        } else {
                            if (objJ == g.f23615n) {
                                c<E> cVar3 = c.this;
                                ph.m<? super Boolean> mVarA = ph.o.a(ah.p.c(cVar));
                                try {
                                    this.f23591b = mVarA;
                                    Object objJ2 = cVar3.J(mVarR, i11, andIncrement, this);
                                    if (objJ2 == vVar) {
                                        b(mVarR, i11);
                                    } else {
                                        if (objJ2 == vVar2) {
                                            if (andIncrement < cVar3.v()) {
                                                mVarR.a();
                                            }
                                            m<E> mVar2 = (m) c.f23585g.get(cVar3);
                                            while (true) {
                                                if (cVar3.y()) {
                                                    ph.m<? super Boolean> mVar3 = this.f23591b;
                                                    kotlin.jvm.internal.r.b(mVar3);
                                                    this.f23591b = null;
                                                    this.f23590a = g.f23613l;
                                                    Throwable thS2 = cVar2.s();
                                                    if (thS2 == null) {
                                                        mVar3.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        mVar3.resumeWith(pg.q.a(thS2));
                                                    }
                                                } else {
                                                    long andIncrement2 = c.f23581c.getAndIncrement(cVar3);
                                                    long j12 = g.f23603b;
                                                    long j13 = andIncrement2 / j12;
                                                    int i12 = (int) (andIncrement2 % j12);
                                                    if (mVar2.f29768c != j13) {
                                                        m<E> mVarR2 = cVar3.r(j13, mVar2);
                                                        if (mVarR2 != null) {
                                                            mVar2 = mVarR2;
                                                        }
                                                    }
                                                    Object objJ3 = cVar3.J(mVar2, i12, andIncrement2, this);
                                                    if (objJ3 == g.f23614m) {
                                                        b(mVar2, i12);
                                                        break;
                                                    }
                                                    if (objJ3 == g.f23616o) {
                                                        if (andIncrement2 < cVar3.v()) {
                                                            mVar2.a();
                                                        }
                                                    } else {
                                                        if (objJ3 == g.f23615n) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        mVar2.a();
                                                        this.f23590a = objJ3;
                                                        this.f23591b = null;
                                                    }
                                                }
                                            }
                                        } else {
                                            mVarR.a();
                                            this.f23590a = objJ2;
                                            this.f23591b = null;
                                        }
                                        mVarA.r(Boolean.TRUE, null);
                                    }
                                    Object objO = mVarA.o();
                                    ug.a aVar = ug.a.f29706a;
                                    return objO;
                                } catch (Throwable th2) {
                                    mVarA.z();
                                    throw th2;
                                }
                            }
                            mVarR.a();
                            this.f23590a = objJ;
                        }
                    }
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // ph.y2
        public final void b(uh.s<?> sVar, int i10) {
            ph.m<? super Boolean> mVar = this.f23591b;
            if (mVar != null) {
                mVar.b(sVar, i10);
            }
        }

        @Override // rh.j
        public final E next() throws Throwable {
            E e10 = (E) this.f23590a;
            uh.v vVar = g.f23617p;
            if (e10 == vVar) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f23590a = vVar;
            if (e10 != g.f23613l) {
                return e10;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f23580b;
            Throwable thT = c.this.t();
            int i10 = uh.u.f29769a;
            throw thT;
        }
    }

    public static final class b implements y2 {
    }

    /* renamed from: rh.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0264c extends kotlin.jvm.internal.p implements eh.q<c<?>, xh.j<?>, Object, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0264c f23593a = new C0264c(3, c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        
            return pg.f0.f21461a;
         */
        @Override // eh.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final f0 b(c<?> cVar, xh.j<?> jVar, Object obj) {
            m<?> mVar;
            c<?> cVar2 = cVar;
            xh.j<?> jVar2 = jVar;
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f23580b;
            cVar2.getClass();
            m<?> mVar2 = (m) c.f23585g.get(cVar2);
            while (true) {
                if (cVar2.y()) {
                    jVar2.e(g.f23613l);
                    break;
                }
                long andIncrement = c.f23581c.getAndIncrement(cVar2);
                long j10 = g.f23603b;
                long j11 = andIncrement / j10;
                int i10 = (int) (andIncrement % j10);
                if (mVar2.f29768c != j11) {
                    m<?> mVarR = cVar2.r(j11, mVar2);
                    if (mVarR == null) {
                        continue;
                    } else {
                        mVar = mVarR;
                    }
                } else {
                    mVar = mVar2;
                }
                Object objJ = cVar2.J(mVar, i10, andIncrement, jVar2);
                m<?> mVar3 = mVar;
                if (objJ == g.f23614m) {
                    y2 y2Var = jVar2 instanceof y2 ? (y2) jVar2 : null;
                    if (y2Var != null) {
                        y2Var.b(mVar3, i10);
                    }
                } else if (objJ == g.f23616o) {
                    if (andIncrement < cVar2.v()) {
                        mVar3.a();
                    }
                    mVar2 = mVar3;
                } else {
                    if (objJ == g.f23615n) {
                        throw new IllegalStateException("unexpected");
                    }
                    mVar3.a();
                    jVar2.e(objJ);
                }
            }
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.p implements eh.q<c<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23594a = new d(3, c.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // eh.q
        public final Object b(c<?> cVar, Object obj, Object obj2) {
            c<?> cVar2 = cVar;
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f23580b;
            cVar2.getClass();
            if (obj2 == g.f23613l) {
                obj2 = new l.a(cVar2.s());
            }
            return new l(obj2);
        }
    }

    public c(int i10) {
        this.f23589a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m<Object> mVar = g.f23602a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f23582d.get(this);
        m<Object> mVar2 = new m<>(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (A()) {
            mVar2 = g.f23602a;
            kotlin.jvm.internal.r.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f23620s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object D(c cVar, vg.c cVar2) throws Throwable {
        rh.d dVar;
        m<E> mVar;
        if (cVar2 instanceof rh.d) {
            dVar = (rh.d) cVar2;
            int i10 = dVar.f23597c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f23597c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new rh.d(cVar, cVar2);
            }
        }
        rh.d dVar2 = dVar;
        Object obj = dVar2.f23595a;
        ug.a aVar = ug.a.f29706a;
        int i11 = dVar2.f23597c;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return ((l) obj).f23626a;
        }
        pg.q.b(obj);
        m<E> mVar2 = (m) f23585g.get(cVar);
        while (!cVar.y()) {
            long andIncrement = f23581c.getAndIncrement(cVar);
            long j10 = g.f23603b;
            long j11 = andIncrement / j10;
            int i12 = (int) (andIncrement % j10);
            if (mVar2.f29768c != j11) {
                m<E> mVarR = cVar.r(j11, mVar2);
                if (mVarR == null) {
                    continue;
                } else {
                    mVar = mVarR;
                }
            } else {
                mVar = mVar2;
            }
            c cVar3 = cVar;
            Object objJ = cVar3.J(mVar, i12, andIncrement, null);
            if (objJ == g.f23614m) {
                throw new IllegalStateException("unexpected");
            }
            if (objJ != g.f23616o) {
                if (objJ != g.f23615n) {
                    mVar.a();
                    return objJ;
                }
                dVar2.f23597c = 1;
                Object objF = cVar3.F(mVar, i12, andIncrement, dVar2);
                return objF == aVar ? aVar : objF;
            }
            if (andIncrement < cVar3.v()) {
                mVar.a();
            }
            cVar = cVar3;
            mVar2 = mVar;
        }
        return new l.a(cVar.s());
    }

    public static final m i(c cVar, long j10, m mVar) {
        Object objA;
        c cVar2;
        m<Object> mVar2 = g.f23602a;
        f fVar = f.f23601a;
        loop0: while (true) {
            objA = uh.a.a(mVar, j10, fVar);
            if (!uh.t.d(objA)) {
                uh.s sVarC = uh.t.c(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23584f;
                    uh.s sVar = (uh.s) atomicReferenceFieldUpdater.get(cVar);
                    if (sVar.f29768c >= sVarC.f29768c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zD = uh.t.d(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23581c;
        if (zD) {
            cVar.h();
            if (mVar.f29768c * g.f23603b < atomicLongFieldUpdater.get(cVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) uh.t.c(objA);
            long j11 = mVar3.f29768c;
            if (j11 <= j10) {
                return mVar3;
            }
            long j12 = g.f23603b * j11;
            while (true) {
                long j13 = f23580b.get(cVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f23580b.compareAndSet(cVar2, j13, (((int) (j13 >> 60)) << 60) + j14)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j11 * g.f23603b < atomicLongFieldUpdater.get(cVar2)) {
                mVar3.a();
            }
        }
        return null;
    }

    public static final void j(c cVar, Object obj, ph.m mVar) {
        mVar.resumeWith(pg.q.a(cVar.u()));
    }

    public static final int k(c cVar, m mVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        mVar.n(i10, obj);
        if (z10) {
            return cVar.K(mVar, i10, obj, j10, obj2, z10);
        }
        Object objL = mVar.l(i10);
        if (objL == null) {
            if (cVar.l(j10)) {
                if (mVar.k(i10, null, g.f23605d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof y2) {
            mVar.n(i10, null);
            if (cVar.H(objL, obj)) {
                mVar.o(i10, g.f23610i);
                return 0;
            }
            uh.v vVar = g.f23612k;
            if (mVar.f23629f.getAndSet((i10 * 2) + 1, vVar) == vVar) {
                return 5;
            }
            mVar.m(i10, true);
            return 5;
        }
        return cVar.K(mVar, i10, obj, j10, obj2, z10);
    }

    public static void w(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23583e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j10 = f23582d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j10, m<E> mVar) {
        m<E> mVar2;
        m<E> mVar3;
        while (mVar.f29768c < j10 && (mVar3 = (m) mVar.b()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.c() || (mVar2 = (m) mVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23586h;
                    uh.s sVar = (uh.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f29768c >= mVar.f29768c) {
                        return;
                    }
                    if (!mVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (mVar.f()) {
                                mVar.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                        return;
                    }
                    return;
                }
            }
            mVar = mVar2;
        }
    }

    public final Object C(E e10, tg.e<? super f0> eVar) throws Throwable {
        ph.m mVar = new ph.m(1, ah.p.c(eVar));
        mVar.p();
        mVar.resumeWith(pg.q.a(u()));
        Object objO = mVar.o();
        return objO == ug.a.f29706a ? objO : f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(m mVar, int i10, long j10, vg.c cVar) throws Throwable {
        e eVar;
        m<E> mVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f23600c;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f23600c = i11 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(this, cVar);
            }
        }
        Object objO = eVar.f23598a;
        ug.a aVar = ug.a.f29706a;
        int i12 = eVar.f23600c;
        if (i12 == 0) {
            pg.q.b(objO);
            eVar.f23600c = 1;
            ph.m mVarA = ph.o.a(ah.p.c(eVar));
            try {
                v vVar = new v(mVarA);
                Object objJ = J(mVar, i10, j10, vVar);
                if (objJ == g.f23614m) {
                    vVar.b(mVar, i10);
                } else if (objJ == g.f23616o) {
                    if (j10 < v()) {
                        mVar.a();
                    }
                    m<E> mVar3 = (m) f23585g.get(this);
                    while (true) {
                        if (y()) {
                            mVarA.resumeWith(new l(new l.a(s())));
                            break;
                        }
                        long andIncrement = f23581c.getAndIncrement(this);
                        long j11 = g.f23603b;
                        long j12 = andIncrement / j11;
                        int i13 = (int) (andIncrement % j11);
                        if (mVar3.f29768c != j12) {
                            m<E> mVarR = r(j12, mVar3);
                            if (mVarR != null) {
                                mVar2 = mVarR;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        Object objJ2 = J(mVar2, i13, andIncrement, vVar);
                        m<E> mVar4 = mVar2;
                        if (objJ2 == g.f23614m) {
                            vVar.b(mVar4, i13);
                            break;
                        }
                        if (objJ2 == g.f23616o) {
                            if (andIncrement < v()) {
                                mVar4.a();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objJ2 == g.f23615n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.a();
                            mVarA.r(new l(objJ2), null);
                        }
                    }
                } else {
                    mVar.a();
                    mVarA.r(new l(objJ), null);
                }
                objO = mVarA.o();
                ug.a aVar2 = ug.a.f29706a;
                if (objO == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                mVarA.z();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objO);
        }
        return ((l) objO).f23626a;
    }

    public final void G(y2 y2Var, boolean z10) {
        if (y2Var instanceof b) {
            throw null;
        }
        if (y2Var instanceof ph.k) {
            ((tg.e) y2Var).resumeWith(pg.q.a(z10 ? t() : u()));
            return;
        }
        if (y2Var instanceof v) {
            ((v) y2Var).f23636a.resumeWith(new l(new l.a(s())));
            return;
        }
        if (!(y2Var instanceof a)) {
            if (y2Var instanceof xh.j) {
                ((xh.j) y2Var).c(this, g.f23613l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + y2Var).toString());
            }
        }
        a aVar = (a) y2Var;
        ph.m<? super Boolean> mVar = aVar.f23591b;
        kotlin.jvm.internal.r.b(mVar);
        aVar.f23591b = null;
        aVar.f23590a = g.f23613l;
        Throwable thS = c.this.s();
        if (thS == null) {
            mVar.resumeWith(Boolean.FALSE);
        } else {
            mVar.resumeWith(pg.q.a(thS));
        }
    }

    public final boolean H(Object obj, E e10) {
        if (obj instanceof xh.j) {
            return ((xh.j) obj).c(this, e10);
        }
        if (obj instanceof v) {
            return g.a(((v) obj).f23636a, new l(e10), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof ph.k) {
                return g.a((ph.k) obj, e10, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        a aVar = (a) obj;
        ph.m<? super Boolean> mVar = aVar.f23591b;
        kotlin.jvm.internal.r.b(mVar);
        aVar.f23591b = null;
        aVar.f23590a = e10;
        Boolean bool = Boolean.TRUE;
        c.this.getClass();
        return g.a(mVar, bool, null);
    }

    public final boolean I(Object obj, m<E> mVar, int i10) {
        xh.l lVar;
        if (obj instanceof ph.k) {
            return g.a((ph.k) obj, f0.f21461a, null);
        }
        if (!(obj instanceof xh.j)) {
            if (obj instanceof b) {
                g.a(null, Boolean.TRUE, null);
                throw null;
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iJ = ((xh.h) obj).j(this, f0.f21461a);
        if (iJ == 0) {
            lVar = xh.l.f33606a;
        } else if (iJ == 1) {
            lVar = xh.l.f33607b;
        } else if (iJ == 2) {
            lVar = xh.l.f33608c;
        } else {
            if (iJ != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iJ).toString());
            }
            lVar = xh.l.f33609d;
        }
        if (lVar == xh.l.f33607b) {
            mVar.n(i10, null);
        }
        return lVar == xh.l.f33606a;
    }

    public final Object J(m<E> mVar, int i10, long j10, Object obj) {
        Object objL = mVar.l(i10);
        AtomicReferenceArray atomicReferenceArray = mVar.f23629f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23580b;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f23615n;
                }
                if (mVar.k(i10, objL, obj)) {
                    q();
                    return g.f23614m;
                }
            }
        } else if (objL == g.f23605d && mVar.k(i10, objL, g.f23610i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            mVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = mVar.l(i10);
            if (objL2 == null || objL2 == g.f23606e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.k(i10, objL2, g.f23609h)) {
                        q();
                        return g.f23616o;
                    }
                } else {
                    if (obj == null) {
                        return g.f23615n;
                    }
                    if (mVar.k(i10, objL2, obj)) {
                        q();
                        return g.f23614m;
                    }
                }
            } else {
                if (objL2 != g.f23605d) {
                    uh.v vVar = g.f23611j;
                    if (objL2 != vVar && objL2 != g.f23609h) {
                        if (objL2 == g.f23613l) {
                            q();
                            return g.f23616o;
                        }
                        if (objL2 != g.f23608g && mVar.k(i10, objL2, g.f23607f)) {
                            boolean z10 = objL2 instanceof y;
                            if (z10) {
                                objL2 = ((y) objL2).f23637a;
                            }
                            if (I(objL2, mVar, i10)) {
                                mVar.o(i10, g.f23610i);
                                q();
                                Object obj3 = atomicReferenceArray.get(i10 * 2);
                                mVar.n(i10, null);
                                return obj3;
                            }
                            mVar.o(i10, vVar);
                            mVar.i();
                            if (z10) {
                                q();
                            }
                            return g.f23616o;
                        }
                    }
                    return g.f23616o;
                }
                if (mVar.k(i10, objL2, g.f23610i)) {
                    q();
                    Object obj4 = atomicReferenceArray.get(i10 * 2);
                    mVar.n(i10, null);
                    return obj4;
                }
            }
        }
    }

    public final int K(m<E> mVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object objL = mVar.l(i10);
            if (objL == null) {
                if (!l(j10) || z10) {
                    if (z10) {
                        if (mVar.k(i10, null, g.f23611j)) {
                            mVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (mVar.k(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (mVar.k(i10, null, g.f23605d)) {
                    break;
                }
            } else {
                if (objL != g.f23606e) {
                    uh.v vVar = g.f23612k;
                    if (objL == vVar) {
                        mVar.n(i10, null);
                        return 5;
                    }
                    if (objL == g.f23609h) {
                        mVar.n(i10, null);
                        return 5;
                    }
                    if (objL == g.f23613l) {
                        mVar.n(i10, null);
                        h();
                        return 4;
                    }
                    mVar.n(i10, null);
                    if (objL instanceof y) {
                        objL = ((y) objL).f23637a;
                    }
                    if (H(objL, e10)) {
                        mVar.o(i10, g.f23610i);
                        return 0;
                    }
                    if (mVar.f23629f.getAndSet((i10 * 2) + 1, vVar) != vVar) {
                        mVar.m(i10, true);
                    }
                    return 5;
                }
                if (mVar.k(i10, objL, g.f23605d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c<E> cVar = this;
        if (cVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f23582d;
            if (atomicLongFieldUpdater.get(cVar) > j10) {
                break;
            } else {
                cVar = this;
            }
        }
        int i10 = g.f23604c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23583e;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(cVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j11 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(cVar);
                    long j14 = atomicLongFieldUpdater2.get(cVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z10) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // rh.w
    public final xh.e<l<E>> a() {
        C0264c c0264c = C0264c.f23593a;
        kotlin.jvm.internal.r.c(c0264c, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        m0.b(3, c0264c);
        d dVar = d.f23594a;
        kotlin.jvm.internal.r.c(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        m0.b(3, dVar);
        return new xh.f(this, c0264c, dVar, null);
    }

    @Override // rh.w
    public final Object b(vg.i iVar) throws Throwable {
        m<E> mVar;
        Throwable th2;
        m<E> mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23585g;
        m<E> mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f23581c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = g.f23603b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (mVar3.f29768c != j11) {
                m<E> mVarR = r(j11, mVar3);
                if (mVarR == null) {
                    continue;
                } else {
                    mVar = mVarR;
                }
            } else {
                mVar = mVar3;
            }
            Object objJ = J(mVar, i10, andIncrement, null);
            uh.v vVar = g.f23614m;
            if (objJ == vVar) {
                throw new IllegalStateException("unexpected");
            }
            uh.v vVar2 = g.f23616o;
            if (objJ == vVar2) {
                if (andIncrement < v()) {
                    mVar.a();
                }
                mVar3 = mVar;
            } else {
                if (objJ != g.f23615n) {
                    mVar.a();
                    return objJ;
                }
                ph.m mVarA = ph.o.a(ah.p.c(iVar));
                c<E> cVar = this;
                try {
                    Object objJ2 = cVar.J(mVar, i10, andIncrement, mVarA);
                    if (objJ2 == vVar) {
                        mVarA.b(mVar, i10);
                    } else {
                        if (objJ2 == vVar2) {
                            if (andIncrement < v()) {
                                mVar.a();
                            }
                            m<E> mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (y()) {
                                    mVarA.resumeWith(pg.q.a(t()));
                                    break;
                                }
                                ph.m mVar5 = mVarA;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j12 = g.f23603b;
                                    long j13 = andIncrement2 / j12;
                                    int i11 = (int) (andIncrement2 % j12);
                                    if (mVar4.f29768c != j13) {
                                        try {
                                            m<E> mVarR2 = r(j13, mVar4);
                                            if (mVarR2 == null) {
                                                mVarA = mVar5;
                                            } else {
                                                mVar2 = mVarR2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            mVarA = mVar5;
                                            mVarA.z();
                                            throw th2;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objJ2 = cVar.J(mVar2, i11, andIncrement2, mVar5);
                                    m<E> mVar6 = mVar2;
                                    mVarA = mVar5;
                                    if (objJ2 == g.f23614m) {
                                        mVarA.b(mVar6, i11);
                                        break;
                                    }
                                    if (objJ2 == g.f23616o) {
                                        if (andIncrement2 < v()) {
                                            mVar6.a();
                                        }
                                        cVar = this;
                                        mVar4 = mVar6;
                                    } else {
                                        if (objJ2 == g.f23615n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar6.a();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mVarA = mVar5;
                                    th2 = th;
                                    mVarA.z();
                                    throw th2;
                                }
                            }
                        } else {
                            mVar.a();
                        }
                        mVarA.r(objJ2, null);
                    }
                    Object objO = mVarA.o();
                    ug.a aVar = ug.a.f29706a;
                    return objO;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thT = t();
        int i12 = uh.u.f29769a;
        throw thT;
    }

    @Override // rh.w
    public final Object c() {
        m<E> mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23581c;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f23580b.get(this);
        if (x(j11, true)) {
            return new l.a(s());
        }
        long j12 = j11 & 1152921504606846975L;
        l.b bVar = l.f23625b;
        if (j10 >= j12) {
            return bVar;
        }
        Object obj = g.f23612k;
        m<E> mVar2 = (m) f23585g.get(this);
        while (!y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = g.f23603b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (mVar2.f29768c != j14) {
                m<E> mVarR = r(j14, mVar2);
                if (mVarR == null) {
                    continue;
                } else {
                    mVar = mVarR;
                }
            } else {
                mVar = mVar2;
            }
            Object objJ = J(mVar, i10, andIncrement, obj);
            m<E> mVar3 = mVar;
            if (objJ == g.f23614m) {
                y2 y2Var = obj instanceof y2 ? (y2) obj : null;
                if (y2Var != null) {
                    y2Var.b(mVar3, i10);
                }
                L(andIncrement);
                mVar3.i();
                return bVar;
            }
            if (objJ != g.f23616o) {
                if (objJ == g.f23615n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.a();
                return objJ;
            }
            if (andIncrement < v()) {
                mVar3.a();
            }
            mVar2 = mVar3;
        }
        return new l.a(s());
    }

    @Override // rh.w
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0188, code lost:
    
        return pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        j(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c A[RETURN] */
    @Override // rh.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(E e10, tg.e<? super f0> eVar) throws Throwable {
        int iK;
        f0 f0Var;
        Object objO;
        ug.a aVar;
        E e11;
        c<E> cVar;
        m mVar;
        int i10;
        int i11;
        boolean z10;
        c<E> cVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23584f;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(cVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f23580b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar2);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zX = cVar2.x(andIncrement, false);
            int i12 = g.f23603b;
            long j11 = i12;
            long j12 = j10 / j11;
            int i13 = (int) (j10 % j11);
            if (mVar2.f29768c != j12) {
                m mVarI = i(cVar2, j12, mVar2);
                if (mVarI != null) {
                    mVar2 = mVarI;
                } else if (zX) {
                    Object objC = C(e10, eVar);
                    if (objC == ug.a.f29706a) {
                        return objC;
                    }
                }
            }
            int iK2 = k(cVar2, mVar2, i13, e10, j10, null, zX);
            if (iK2 == 0) {
                mVar2.a();
                break;
            }
            if (iK2 == 1) {
                break;
            }
            if (iK2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23581c;
                if (iK2 == 3) {
                    ph.m mVarA = ph.o.a(ah.p.c(eVar));
                    E e12 = e10;
                    try {
                        iK = k(cVar2, mVar2, i13, e12, j10, mVarA, false);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (iK == 0) {
                            mVar2.a();
                        } else if (iK != 1) {
                            if (iK != 2) {
                                if (iK != 4) {
                                    String str = "unexpected";
                                    if (iK != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar2.a();
                                    m mVar3 = (m) atomicReferenceFieldUpdater.get(cVar2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar2);
                                        long j13 = andIncrement2 & 1152921504606846975L;
                                        boolean zX2 = cVar2.x(andIncrement2, false);
                                        int i14 = g.f23603b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j14 = i14;
                                        String str2 = str;
                                        long j15 = j13 / j14;
                                        int i15 = (int) (j13 % j14);
                                        if (mVar3.f29768c != j15) {
                                            m mVarI2 = i(cVar2, j15, mVar3);
                                            if (mVarI2 != null) {
                                                i10 = i14;
                                                i11 = i15;
                                                z10 = zX2;
                                                mVar = mVarI2;
                                            } else {
                                                if (zX2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            mVar = mVar3;
                                            i10 = i14;
                                            i11 = i15;
                                            z10 = zX2;
                                        }
                                        int iK3 = k(cVar2, mVar, i11, e12, j13, mVarA, z10);
                                        E e13 = e12;
                                        cVar = cVar2;
                                        m mVar4 = mVar;
                                        int i16 = i11;
                                        e11 = e13;
                                        if (iK3 == 0) {
                                            mVar4.a();
                                            break;
                                        }
                                        if (iK3 == 1) {
                                            break;
                                        }
                                        if (iK3 != 2) {
                                            if (iK3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (iK3 != 4) {
                                                if (iK3 == 5) {
                                                    mVar4.a();
                                                }
                                                mVar3 = mVar4;
                                                cVar2 = cVar;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                e12 = e11;
                                            } else if (j13 < atomicLongFieldUpdater2.get(cVar)) {
                                                mVar4.a();
                                            }
                                        } else if (z10) {
                                            mVar4.i();
                                        } else {
                                            mVarA.b(mVar4, i16 + i10);
                                        }
                                    }
                                } else {
                                    e11 = e12;
                                    cVar = cVar2;
                                    if (j10 < atomicLongFieldUpdater2.get(cVar)) {
                                        mVar2.a();
                                    }
                                }
                                j(cVar, e11, mVarA);
                            } else {
                                mVarA.b(mVar2, i13 + i12);
                            }
                            objO = mVarA.o();
                            aVar = ug.a.f29706a;
                            if (objO != aVar) {
                                objO = f0.f21461a;
                            }
                            if (objO == aVar) {
                                return objO;
                            }
                        } else {
                            f0Var = f0.f21461a;
                            mVarA.resumeWith(f0Var);
                            objO = mVarA.o();
                            aVar = ug.a.f29706a;
                            if (objO != aVar) {
                            }
                            if (objO == aVar) {
                            }
                        }
                        f0Var = f0.f21461a;
                        mVarA.resumeWith(f0Var);
                        objO = mVarA.o();
                        aVar = ug.a.f29706a;
                        if (objO != aVar) {
                        }
                        if (objO == aVar) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mVarA.z();
                        throw th;
                    }
                } else if (iK2 == 4) {
                    if (j10 < atomicLongFieldUpdater2.get(cVar2)) {
                        mVar2.a();
                    }
                    Object objC2 = C(e10, eVar);
                    if (objC2 == ug.a.f29706a) {
                        return objC2;
                    }
                } else if (iK2 == 5) {
                    mVar2.a();
                }
            } else if (zX) {
                mVar2.i();
                Object objC3 = C(e10, eVar);
                if (objC3 == ug.a.f29706a) {
                    return objC3;
                }
            }
        }
    }

    @Override // rh.w
    public final Object e(n.a aVar) {
        return D(this, aVar);
    }

    @Override // rh.x
    public final void f(r rVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f23588k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            uh.v vVar = g.f23618q;
            if (obj != vVar) {
                if (obj == g.f23619r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            uh.v vVar2 = g.f23619r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                    break;
                }
            }
            rVar.invoke(s());
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    @Override // rh.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(E e10) {
        int iK;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23580b;
        boolean z10 = false;
        long j10 = 1152921504606846975L;
        boolean z11 = x(atomicLongFieldUpdater.get(this), false) ? false : !l(r1 & 1152921504606846975L);
        l.b bVar = l.f23625b;
        if (z11) {
            return bVar;
        }
        Object obj = g.f23611j;
        m mVar = (m) f23584f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zX = x(andIncrement, z10);
            int i10 = g.f23603b;
            long j12 = i10;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            if (mVar.f29768c == j13) {
                iK = k(this, mVar, i11, e10, j11, obj, zX);
                if (iK != 0) {
                    mVar.a();
                    return f0.f21461a;
                }
                if (iK == 1) {
                    return f0.f21461a;
                }
                if (iK == 2) {
                    if (zX) {
                        mVar.i();
                        return new l.a(u());
                    }
                    y2 y2Var = obj instanceof y2 ? (y2) obj : null;
                    if (y2Var != null) {
                        y2Var.b(mVar, i11 + i10);
                    }
                    mVar.i();
                    return bVar;
                }
                if (iK == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iK == 4) {
                    if (j11 < f23581c.get(this)) {
                        mVar.a();
                    }
                    return new l.a(u());
                }
                if (iK == 5) {
                    mVar.a();
                }
                z10 = false;
            } else {
                m mVarI = i(this, j13, mVar);
                if (mVarI != null) {
                    mVar = mVarI;
                    iK = k(this, mVar, i11, e10, j11, obj, zX);
                    if (iK != 0) {
                    }
                } else {
                    if (zX) {
                        return new l.a(u());
                    }
                    z10 = false;
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    @Override // rh.x
    public final boolean h() {
        return x(f23580b.get(this), false);
    }

    @Override // rh.w
    public final j<E> iterator() {
        return new a();
    }

    public final boolean l(long j10) {
        return j10 < f23582d.get(this) || j10 < f23581c.get(this) + ((long) this.f23589a);
    }

    public final boolean m(Throwable th2) {
        return n(false, th2);
    }

    public final boolean n(boolean z10, Throwable th2) {
        c<E> cVar;
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23580b;
        if (!z10) {
            cVar = this;
            break;
        }
        do {
            j14 = atomicLongFieldUpdater.get(this);
            if (((int) (j14 >> 60)) != 0) {
                cVar = this;
                break;
            }
            m<Object> mVar = g.f23602a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j14, (j14 & 1152921504606846975L) + (1 << 60)));
        uh.v vVar = g.f23620s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23587j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, th2)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j13, (3 << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j10, (j12 << 60) + j11));
        }
        h();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23588k;
                obj = atomicReferenceFieldUpdater2.get(this);
                uh.v vVar2 = obj == null ? g.f23618q : g.f23619r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                m0.b(1, obj);
                ((eh.l) obj).invoke(s());
                return z11;
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (rh.m) ((uh.b) uh.b.f29718b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m<E> o(long j10) {
        Object objD;
        long j11;
        Object obj = f23586h.get(this);
        m mVar = (m) f23584f.get(this);
        if (mVar.f29768c > ((m) obj).f29768c) {
            obj = mVar;
        }
        m mVar2 = (m) f23585g.get(this);
        if (mVar2.f29768c > ((m) obj).f29768c) {
            obj = mVar2;
        }
        uh.b bVar = (uh.b) obj;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uh.b.f29717a;
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            objD = null;
            uh.v vVar = uh.a.f29716a;
            if (obj2 == vVar) {
                break;
            }
            uh.b bVar2 = (uh.b) obj2;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, vVar)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            bVar = bVar2;
        }
        m<E> mVar3 = (m) bVar;
        if (z()) {
            m<E> mVar4 = mVar3;
            loop2: do {
                int i10 = g.f23603b - 1;
                while (true) {
                    if (-1 >= i10) {
                        break;
                    }
                    j11 = (mVar4.f29768c * g.f23603b) + i10;
                    if (j11 < f23581c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objL = mVar4.l(i10);
                        if (objL != null && objL != g.f23606e) {
                            if (objL == g.f23605d) {
                                break loop2;
                            }
                        } else {
                            if (mVar4.k(i10, objL, g.f23613l)) {
                                mVar4.i();
                                break;
                            }
                        }
                    }
                    i10--;
                }
            } while (mVar4 != null);
            j11 = -1;
            if (j11 != -1) {
                p(j11);
            }
        }
        loop5: for (m<E> mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((uh.b) uh.b.f29718b.get(mVar5))) {
            for (int i11 = g.f23603b - 1; -1 < i11; i11--) {
                if ((mVar5.f29768c * g.f23603b) + i11 < j10) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = mVar5.l(i11);
                    if (objL2 != null && objL2 != g.f23606e) {
                        if (!(objL2 instanceof y)) {
                            if (!(objL2 instanceof y2)) {
                                break;
                            }
                            if (mVar5.k(i11, objL2, g.f23613l)) {
                                objD = g0.d(objD, objL2);
                                mVar5.m(i11, true);
                                break;
                            }
                        } else {
                            if (mVar5.k(i11, objL2, g.f23613l)) {
                                objD = g0.d(objD, ((y) objL2).f23637a);
                                mVar5.m(i11, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar5.k(i11, objL2, g.f23613l)) {
                            mVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objD != null) {
            if (!(objD instanceof ArrayList)) {
                G((y2) objD, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) objD;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                G((y2) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void p(long j10) {
        m<E> mVar = (m) f23585g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f23581c;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f23589a + j11, f23582d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = g.f23603b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (mVar.f29768c != j13) {
                    m<E> mVarR = r(j13, mVar);
                    if (mVarR != null) {
                        mVar = mVarR;
                    }
                }
                m<E> mVar2 = mVar;
                if (J(mVar2, i10, j11, null) != g.f23616o || j11 < v()) {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        w(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        Object objA;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23586h;
        m<E> mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f23582d.getAndIncrement(this);
            long j10 = andIncrement / g.f23603b;
            if (v() <= andIncrement) {
                if (mVar.f29768c < j10 && mVar.b() != 0) {
                    B(j10, mVar);
                }
                w(this);
                return;
            }
            if (mVar.f29768c != j10) {
                f fVar = f.f23601a;
                while (true) {
                    objA = uh.a.a(mVar, j10, fVar);
                    if (!uh.t.d(objA)) {
                        uh.s sVarC = uh.t.c(objA);
                        while (true) {
                            uh.s sVar = (uh.s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f29768c >= sVarC.f29768c) {
                                break;
                            }
                            if (!sVarC.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                                    if (sVarC.f()) {
                                        sVarC.e();
                                    }
                                }
                            }
                            if (sVar.f()) {
                                sVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                m<E> mVar2 = null;
                if (uh.t.d(objA)) {
                    h();
                    B(j10, mVar);
                    w(this);
                } else {
                    m<E> mVar3 = (m) uh.t.c(objA);
                    long j11 = mVar3.f29768c;
                    if (j11 > j10) {
                        long j12 = j11 * g.f23603b;
                        if (f23582d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f23583e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            w(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i10 = (int) (andIncrement % g.f23603b);
            Object objL = mVar.l(i10);
            boolean z10 = objL instanceof y2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23581c;
            if (!z10 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.k(i10, objL, g.f23608g)) {
                while (true) {
                    Object objL2 = mVar.l(i10);
                    if (!(objL2 instanceof y2)) {
                        if (objL2 != g.f23611j) {
                            if (objL2 != null) {
                                if (objL2 == g.f23605d || objL2 == g.f23609h || objL2 == g.f23610i || objL2 == g.f23612k || objL2 == g.f23613l) {
                                    break loop0;
                                }
                                if (objL2 != g.f23607f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                                }
                            } else if (mVar.k(i10, objL2, g.f23606e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (mVar.k(i10, objL2, new y((y2) objL2))) {
                            break loop0;
                        }
                    } else if (mVar.k(i10, objL2, g.f23608g)) {
                        if (I(objL2, mVar, i10)) {
                            mVar.o(i10, g.f23605d);
                            break;
                        } else {
                            mVar.o(i10, g.f23611j);
                            mVar.i();
                        }
                    }
                }
            } else if (I(objL, mVar, i10)) {
                mVar.o(i10, g.f23605d);
                break;
            } else {
                mVar.o(i10, g.f23611j);
                mVar.i();
                w(this);
            }
        }
    }

    public final m<E> r(long j10, m<E> mVar) {
        Object objA;
        long j11;
        m<Object> mVar2 = g.f23602a;
        f fVar = f.f23601a;
        loop0: while (true) {
            objA = uh.a.a(mVar, j10, fVar);
            if (!uh.t.d(objA)) {
                uh.s sVarC = uh.t.c(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23585g;
                    uh.s sVar = (uh.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f29768c >= sVarC.f29768c) {
                        break loop0;
                    }
                    if (!sVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarC.f()) {
                                sVarC.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (uh.t.d(objA)) {
            h();
            if (mVar.f29768c * g.f23603b < v()) {
                mVar.a();
                return null;
            }
        } else {
            m<E> mVar3 = (m) uh.t.c(objA);
            long j12 = mVar3.f29768c;
            if (!A() && j10 <= f23582d.get(this) / g.f23603b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23586h;
                    uh.s sVar2 = (uh.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f29768c >= j12 || !mVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (mVar3.f()) {
                                mVar3.e();
                            }
                        }
                    }
                    if (sVar2.f()) {
                        sVar2.e();
                    }
                }
            }
            if (j12 <= j10) {
                return mVar3;
            }
            long j13 = j12 * g.f23603b;
            do {
                j11 = f23581c.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f23581c.compareAndSet(this, j11, j13));
            if (j12 * g.f23603b < v()) {
                mVar3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) f23587j.get(this);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new n("Channel was closed") : thS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        r16 = r7;
        r3 = (rh.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z10;
        String string;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (f23580b.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f23589a + ',');
        sb.append("data=[");
        int i11 = 0;
        boolean z11 = true;
        List listJ = qg.p.j(f23585g.get(this), f23584f.get(this), f23586h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (((m) obj) != g.f23602a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((m) next).f29768c;
            do {
                Object next2 = it.next();
                long j11 = ((m) next2).f29768c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long j12 = f23581c.get(this);
        long jV = v();
        loop2: while (true) {
            int i12 = g.f23603b;
            int i13 = i11;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                long j13 = (mVar.f29768c * g.f23603b) + i13;
                if (j13 >= jV && j13 >= j12) {
                    break loop2;
                }
                Object objL = mVar.l(i13);
                boolean z12 = z11;
                Object obj2 = mVar.f23629f.get(i13 * 2);
                if (objL instanceof ph.k) {
                    string = (j13 >= j12 || j13 < jV) ? (j13 >= jV || j13 < j12) ? "cont" : "send" : "receive";
                } else if (objL instanceof xh.j) {
                    string = (j13 >= j12 || j13 < jV) ? (j13 >= jV || j13 < j12) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof v) {
                    string = "receiveCatching";
                } else if (objL instanceof b) {
                    string = "sendBroadcast";
                } else if (objL instanceof y) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.r.a(objL, g.f23607f) || kotlin.jvm.internal.r.a(objL, g.f23608g)) {
                    string = "resuming_sender";
                } else if (objL == null || objL.equals(g.f23606e) || objL.equals(g.f23610i) || objL.equals(g.f23609h) || objL.equals(g.f23612k) || objL.equals(g.f23611j) || objL.equals(g.f23613l)) {
                    i13++;
                    z11 = z12;
                } else {
                    string = objL.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i13++;
                z11 = z12;
            }
            z11 = z10;
            i11 = 0;
        }
        if (mh.y.a0(sb) == ',') {
            kotlin.jvm.internal.r.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new o("Channel was closed") : thS;
    }

    public final long v() {
        return f23580b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (rh.m) ((uh.b) uh.b.f29718b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f23581c;
            if (i10 == 2) {
                o(1152921504606846975L & j10);
                if (z10) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23585g;
                        m<E> mVarR = (m) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (v() <= j11) {
                            break;
                        }
                        long j12 = g.f23603b;
                        long j13 = j11 / j12;
                        if (mVarR.f29768c != j13 && (mVarR = r(j13, mVarR)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f29768c < j13) {
                                break;
                            }
                        } else {
                            mVarR.a();
                            int i11 = (int) (j11 % j12);
                            while (true) {
                                Object objL = mVarR.l(i11);
                                if (objL != null && objL != g.f23606e) {
                                    if (objL == g.f23605d || (objL != g.f23611j && objL != g.f23613l && objL != g.f23610i && objL != g.f23609h && (objL == g.f23608g || (objL != g.f23607f && j11 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (mVarR.k(i11, objL, g.f23609h)) {
                                        q();
                                        break;
                                    }
                                }
                            }
                            f23581c.compareAndSet(this, j11, j11 + 1);
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(j2.y.a(i10, "unexpected close status: ").toString());
                }
                m<E> mVarO = o(1152921504606846975L & j10);
                Object objD = null;
                loop0: do {
                    int i12 = g.f23603b - 1;
                    while (true) {
                        if (-1 >= i12) {
                            break;
                        }
                        long j14 = (mVarO.f29768c * g.f23603b) + i12;
                        while (true) {
                            Object objL2 = mVarO.l(i12);
                            if (objL2 == g.f23610i) {
                                break loop0;
                            }
                            if (objL2 != g.f23605d) {
                                if (objL2 != g.f23606e && objL2 != null) {
                                    if (!(objL2 instanceof y2) && !(objL2 instanceof y)) {
                                        uh.v vVar = g.f23608g;
                                        if (objL2 == vVar || objL2 == g.f23607f) {
                                            break loop0;
                                        }
                                        if (objL2 != vVar) {
                                            break;
                                        }
                                    } else {
                                        if (j14 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        y2 y2Var = objL2 instanceof y ? ((y) objL2).f23637a : (y2) objL2;
                                        if (mVarO.k(i12, objL2, g.f23613l)) {
                                            objD = g0.d(objD, y2Var);
                                            mVarO.n(i12, null);
                                            mVarO.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (mVarO.k(i12, objL2, g.f23613l)) {
                                        mVarO.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (mVarO.k(i12, objL2, g.f23613l)) {
                                    mVarO.n(i12, null);
                                    mVarO.i();
                                    break;
                                }
                            }
                        }
                        i12--;
                    }
                } while (mVarO != null);
                if (objD != null) {
                    if (objD instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objD;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            G((y2) arrayList.get(size), false);
                        }
                    } else {
                        G((y2) objD, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean y() {
        return x(f23580b.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
