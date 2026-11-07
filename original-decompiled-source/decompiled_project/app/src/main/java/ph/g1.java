package ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public abstract class g1 extends h1 implements r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21536g = AtomicReferenceFieldUpdater.newUpdater(g1.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21537h = AtomicReferenceFieldUpdater.newUpdater(g1.class, Object.class, "_delayed$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21538j = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final m f21539c;

        public a(long j10, m mVar) {
            super(j10);
            this.f21539c = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21539c.B(g1.this, pg.f0.f21461a);
        }

        @Override // ph.g1.c
        public final String toString() {
            return super.toString() + this.f21539c;
        }
    }

    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f21541c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f21541c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21541c.run();
        }

        @Override // ph.g1.c
        public final String toString() {
            return super.toString() + this.f21541c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, b1, uh.f0 {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f21542a;

        /* renamed from: b, reason: collision with root package name */
        public int f21543b = -1;

        public c(long j10) {
            this.f21542a = j10;
        }

        @Override // ph.b1
        public final void a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    uh.v vVar = i1.f21548a;
                    if (obj == vVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof uh.e0 ? (uh.e0) obj2 : null) != null) {
                                dVar.b(this.f21543b);
                            }
                        }
                    }
                    this._heap = vVar;
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // uh.f0
        public final void c(d dVar) {
            if (this._heap == i1.f21548a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j10 = this.f21542a - cVar.f21542a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int d(long j10, d dVar, g1 g1Var) {
            synchronized (this) {
                if (this._heap == i1.f21548a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f29731a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (g1.f21538j.get(g1Var) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f21544c = j10;
                        } else {
                            long j11 = cVar.f21542a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f21544c > 0) {
                                dVar.f21544c = j10;
                            }
                        }
                        long j12 = this.f21542a;
                        long j13 = dVar.f21544c;
                        if (j12 - j13 < 0) {
                            this.f21542a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // uh.f0
        public final void setIndex(int i10) {
            this.f21543b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f21542a + ']';
        }
    }

    public static final class d extends uh.e0<c> {

        /* renamed from: c, reason: collision with root package name */
        public long f21544c;
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        O0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // ph.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long K0() {
        Runnable runnable;
        Object obj;
        uh.v vVar = i1.f21549b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21536g;
        if (!L0()) {
            P0();
            loop0: while (true) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 == null) {
                    break;
                }
                if (!(obj2 instanceof uh.n)) {
                    if (obj2 != vVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj2;
                        break loop0;
                    }
                    break;
                }
                uh.n nVar = (uh.n) obj2;
                Object objD = nVar.d();
                if (objD != uh.n.f29758g) {
                    runnable = (Runnable) objD;
                    break;
                }
                uh.n nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, nVarC) && atomicReferenceFieldUpdater.get(this) == obj2) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            qg.l<x0<?>> lVar = this.f21532e;
            if (((lVar == null || lVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != null) {
                    if (obj3 instanceof uh.n) {
                        long j10 = uh.n.f29757f.get((uh.n) obj3);
                        if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj3 == vVar) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar = (d) f21537h.get(this);
                if (dVar != null) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.f29731a;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    c cVar = (c) obj;
                    if (cVar != null) {
                        long jNanoTime = cVar.f21542a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void O0(Runnable runnable) {
        P0();
        if (!Q0(runnable)) {
            n0.f21570k.O0(runnable);
            return;
        }
        Thread threadM0 = M0();
        if (Thread.currentThread() != threadM0) {
            LockSupport.unpark(threadM0);
        }
    }

    public final void P0() {
        c cVarB;
        d dVar = (d) f21537h.get(this);
        if (dVar == null || uh.e0.f29730b.get(dVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.f29731a;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar = (c) obj;
                        cVarB = ((jNanoTime - cVar.f21542a) > 0L ? 1 : ((jNanoTime - cVar.f21542a) == 0L ? 0 : -1)) >= 0 ? Q0(cVar) : false ? dVar.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVarB != null);
    }

    public final boolean Q0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21536g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f21538j.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof uh.n)) {
                        if (obj != i1.f21549b) {
                            uh.n nVar = new uh.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    uh.n nVar2 = (uh.n) obj;
                    int iA = nVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        uh.n nVarC = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R0() {
        qg.l<x0<?>> lVar = this.f21532e;
        if (lVar != null ? lVar.isEmpty() : true) {
            d dVar = (d) f21537h.get(this);
            if (dVar == null) {
                Object obj = f21536g.get(this);
                if (obj != null) {
                    if (obj instanceof uh.n) {
                        long j10 = uh.n.f29757f.get((uh.n) obj);
                        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
                    }
                    if (obj == i1.f21549b) {
                    }
                }
                return true;
            }
            if (uh.e0.f29730b.get(dVar) == 0) {
            }
        }
        return false;
    }

    public final void S0(long j10, c cVar) {
        int iD;
        Thread threadM0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21537h;
        if (f21538j.get(this) == 1) {
            iD = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.f21544c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.r.b(obj);
                dVar = (d) obj;
            }
            iD = cVar.d(j10, dVar, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                N0(j10, cVar);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                uh.f0[] f0VarArr = dVar3.f29731a;
                f0Var = f0VarArr != null ? f0VarArr[0] : null;
            }
            f0Var = (c) f0Var;
        }
        if (f0Var != cVar || Thread.currentThread() == (threadM0 = M0())) {
            return;
        }
        LockSupport.unpark(threadM0);
    }

    @Override // ph.r0
    public final void i0(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j11 + jNanoTime, mVar);
            S0(jNanoTime, aVar);
            mVar.t(new c1(aVar));
        }
    }

    @Override // ph.f1
    public void shutdown() {
        c cVarB;
        p2.f21577a.set(null);
        f21538j.set(this, 1);
        uh.v vVar = i1.f21549b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21536g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof uh.n)) {
                    if (obj != vVar) {
                        uh.n nVar = new uh.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((uh.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (K0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f21537h.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = uh.e0.f29730b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                N0(jNanoTime, cVar);
            }
        }
    }

    @Override // ph.r0
    public b1 z(long j10, Runnable runnable, tg.h hVar) {
        return o0.f21572a.z(j10, runnable, hVar);
    }
}
