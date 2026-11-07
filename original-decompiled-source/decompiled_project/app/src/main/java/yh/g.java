package yh;

import eh.q;
import j2.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.p;
import pg.f0;
import ph.m;
import ph.o;
import ph.y2;
import uh.s;
import uh.t;
import uh.v;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34412c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34413d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34414e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f34415f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34416g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f34417a;

    /* renamed from: b, reason: collision with root package name */
    public final f f34418b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public /* synthetic */ class a extends p implements eh.p<Long, k, k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34419a = new a(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // eh.p
        public final k invoke(Long l10, k kVar) {
            int i10 = j.f34421a;
            return new k(l10.longValue(), kVar, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [yh.f] */
    public g(int i10) {
        this.f34417a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(y.a(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(y.a(i10, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10;
        this.f34418b = new q() { // from class: yh.f
            @Override // eh.q
            public final Object b(Object obj, Object obj2, Object obj3) {
                this.f34411a.a();
                return f0.f21461a;
            }
        };
    }

    public final void a() {
        int i10;
        Object objA;
        boolean zC;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34416g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f34417a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34412c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f34413d.getAndIncrement(this);
            long j10 = andIncrement2 / j.f34426f;
            h hVar = h.f34420a;
            while (true) {
                objA = uh.a.a(kVar, j10, hVar);
                if (t.d(objA)) {
                    break;
                }
                s sVarC = t.c(objA);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
            }
            k kVar2 = (k) t.c(objA);
            AtomicReferenceArray atomicReferenceArray = kVar2.f34427e;
            kVar2.a();
            zC = false;
            if (kVar2.f29768c <= j10) {
                int i12 = (int) (andIncrement2 % j.f34426f);
                Object andSet = atomicReferenceArray.getAndSet(i12, j.f34422b);
                if (andSet == null) {
                    int i13 = j.f34421a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == j.f34423c) {
                            zC = true;
                            break;
                        }
                    }
                    v vVar = j.f34422b;
                    v vVar2 = j.f34424d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, vVar, vVar2)) {
                            if (atomicReferenceArray.get(i12) != vVar) {
                                break;
                            }
                        } else {
                            zC = true;
                            break;
                        }
                    }
                    zC = !zC;
                } else if (andSet != j.f34425e) {
                    if (andSet instanceof ph.k) {
                        ph.k kVar3 = (ph.k) andSet;
                        v vVarM = kVar3.m(f0.f21461a, this.f34418b);
                        if (vVarM != null) {
                            kVar3.w(vVarM);
                            zC = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof xh.j)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zC = ((xh.j) andSet).c(this, f0.f21461a);
                    }
                }
            }
        } while (!zC);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r4.r(pg.f0.f21461a, r3.f34418b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vg.c cVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f34416g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f34417a;
        } while (andDecrement > i10);
        if (andDecrement > 0) {
            return f0.f21461a;
        }
        m mVarA = o.a(ah.p.c(cVar));
        try {
            if (!c(mVarA)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i10) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        if (c(mVarA)) {
                            break;
                        }
                    }
                }
            }
            Object objO = mVarA.o();
            ug.a aVar = ug.a.f29706a;
            if (objO != aVar) {
                objO = f0.f21461a;
            }
            return objO == aVar ? objO : f0.f21461a;
        } catch (Throwable th2) {
            mVarA.z();
            throw th2;
        }
    }

    public final boolean c(y2 y2Var) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34414e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f34415f.getAndIncrement(this);
        a aVar = a.f34419a;
        long j10 = andIncrement / j.f34426f;
        loop0: while (true) {
            objA = uh.a.a(kVar, j10, aVar);
            if (!t.d(objA)) {
                s sVarC = t.c(objA);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) t.c(objA);
        AtomicReferenceArray atomicReferenceArray = kVar2.f34427e;
        int i10 = (int) (andIncrement % j.f34426f);
        while (!atomicReferenceArray.compareAndSet(i10, null, y2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                v vVar = j.f34422b;
                v vVar2 = j.f34423c;
                while (!atomicReferenceArray.compareAndSet(i10, vVar, vVar2)) {
                    if (atomicReferenceArray.get(i10) != vVar) {
                        return false;
                    }
                }
                ((ph.k) y2Var).r(f0.f21461a, this.f34418b);
                return true;
            }
        }
        y2Var.b(kVar2, i10);
        return true;
    }
}
