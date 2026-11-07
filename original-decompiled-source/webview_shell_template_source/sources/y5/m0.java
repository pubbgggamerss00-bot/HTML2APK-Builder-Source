package y5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class m0 extends n0 implements f0 {

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15363x = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_queue");

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15364y = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_delayed");

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15365z = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a implements Runnable, Comparable<a>, j0, b6.z {
        private volatile Object _heap;
        public long s;

        /* renamed from: t, reason: collision with root package name */
        public int f15366t;

        @Override // b6.z
        public final void a(b bVar) {
            if (this._heap == o0.f15369a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = bVar;
        }

        public final int c(long j6, b bVar, m0 m0Var) {
            synchronized (this) {
                if (this._heap == o0.f15369a) {
                    return 2;
                }
                synchronized (bVar) {
                    try {
                        Object[] objArr = bVar.f2056a;
                        a aVar = (a) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m0.f15363x;
                        m0Var.getClass();
                        if (m0.f15365z.get(m0Var) != 0) {
                            return 1;
                        }
                        if (aVar == null) {
                            bVar.f15367c = j6;
                        } else {
                            long j7 = aVar.s;
                            if (j7 - j6 < 0) {
                                j6 = j7;
                            }
                            if (j6 - bVar.f15367c > 0) {
                                bVar.f15367c = j6;
                            }
                        }
                        long j8 = this.s;
                        long j9 = bVar.f15367c;
                        if (j8 - j9 < 0) {
                            this.s = j9;
                        }
                        bVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            long j6 = this.s - aVar.s;
            if (j6 > 0) {
                return 1;
            }
            return j6 < 0 ? -1 : 0;
        }

        @Override // y5.j0
        public final void d() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    b6.v vVar = o0.f15369a;
                    if (obj == vVar) {
                        return;
                    }
                    b bVar = obj instanceof b ? (b) obj : null;
                    if (bVar != null) {
                        synchronized (bVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof b6.y ? (b6.y) obj2 : null) != null) {
                                bVar.b(this.f15366t);
                            }
                        }
                    }
                    this._heap = vVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b6.z
        public final void setIndex(int i6) {
            this.f15366t = i6;
        }

        public final String toString() {
            return "Delayed[nanos=" + this.s + ']';
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends b6.y<a> {

        /* renamed from: c, reason: collision with root package name */
        public long f15367c;
    }

    public void E(Runnable runnable) {
        if (!F(runnable)) {
            c0.A.E(runnable);
            return;
        }
        Thread threadC = C();
        if (Thread.currentThread() != threadC) {
            LockSupport.unpark(threadC);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15363x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f15365z.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof b6.n)) {
                        if (obj != o0.f15370b) {
                            b6.n nVar = new b6.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    b6.n nVar2 = (b6.n) obj;
                    int iA = nVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        b6.n nVarC = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        break;
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
    public final boolean G() {
        e5.h<h0<?>> hVar = this.f15361w;
        if (hVar != null ? hVar.isEmpty() : true) {
            b bVar = (b) f15364y.get(this);
            if (bVar == null) {
                Object obj = f15363x.get(this);
                if (obj != null) {
                    if (obj instanceof b6.n) {
                        long j6 = b6.n.f2040f.get((b6.n) obj);
                        return ((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30));
                    }
                    if (obj == o0.f15370b) {
                    }
                }
                return true;
            }
            if (b6.y.f2055b.get(bVar) == 0) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long H() {
        Runnable runnable;
        Object obj;
        a aVarB;
        if (!B()) {
            b bVar = (b) f15364y.get(this);
            if (bVar != null && b6.y.f2055b.get(bVar) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (bVar) {
                        try {
                            Object[] objArr = bVar.f2056a;
                            Object obj2 = objArr != null ? objArr[0] : null;
                            if (obj2 == null) {
                                aVarB = null;
                            } else {
                                a aVar = (a) obj2;
                                aVarB = ((jNanoTime - aVar.s) > 0L ? 1 : ((jNanoTime - aVar.s) == 0L ? 0 : -1)) >= 0 ? F(aVar) : false ? bVar.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (aVarB != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15363x;
            loop1: while (true) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 == null) {
                    break;
                }
                if (!(obj3 instanceof b6.n)) {
                    if (obj3 != o0.f15370b) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj3;
                        break loop1;
                    }
                    break;
                }
                b6.n nVar = (b6.n) obj3;
                Object objD = nVar.d();
                if (objD != b6.n.f2041g) {
                    runnable = (Runnable) objD;
                    break;
                }
                b6.n nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, nVarC) && atomicReferenceFieldUpdater.get(this) == obj3) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            e5.h<h0<?>> hVar = this.f15361w;
            if (((hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj4 = f15363x.get(this);
                if (obj4 != null) {
                    if (obj4 instanceof b6.n) {
                        long j6 = b6.n.f2040f.get((b6.n) obj4);
                        if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj4 == o0.f15370b) {
                        return Long.MAX_VALUE;
                    }
                }
                b bVar2 = (b) f15364y.get(this);
                if (bVar2 != null) {
                    synchronized (bVar2) {
                        Object[] objArr2 = bVar2.f2056a;
                        obj = objArr2 != null ? objArr2[0] : null;
                    }
                    a aVar2 = (a) obj;
                    if (aVar2 != null) {
                        long jNanoTime2 = aVar2.s - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // y5.l0
    public void shutdown() {
        a aVarB;
        l1.f15362a.set(null);
        f15365z.set(this, 1);
        b6.v vVar = o0.f15370b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15363x;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof b6.n)) {
                    if (obj != vVar) {
                        b6.n nVar = new b6.n(8, true);
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
                ((b6.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (H() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f15364y.get(this);
            if (bVar == null) {
                return;
            }
            synchronized (bVar) {
                aVarB = b6.y.f2055b.get(bVar) > 0 ? bVar.b(0) : null;
            }
            a aVar = aVarB;
            if (aVar == null) {
                return;
            } else {
                D(jNanoTime, aVar);
            }
        }
    }

    @Override // y5.u
    public final void x(g5.f fVar, Runnable runnable) {
        E(runnable);
    }
}
