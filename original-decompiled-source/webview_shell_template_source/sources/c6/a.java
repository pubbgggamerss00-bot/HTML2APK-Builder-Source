package c6;

import androidx.activity.m;
import androidx.camera.camera2.internal.s0;
import b6.s;
import b6.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.p;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile int _isTerminated;
    private volatile long controlState;
    private volatile long parkedWorkersStack;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2216t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2217u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2218v;

    /* renamed from: w, reason: collision with root package name */
    public final d f2219w;

    /* renamed from: x, reason: collision with root package name */
    public final d f2220x;

    /* renamed from: y, reason: collision with root package name */
    public final s<C0029a> f2221y;

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2215z = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    public static final v C = new v(0, "NOT_IN_STACK");

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: c6.a$a, reason: collision with other inner class name */
    public final class C0029a extends Thread {
        public static final AtomicIntegerFieldUpdater A = AtomicIntegerFieldUpdater.newUpdater(C0029a.class, "workerCtl");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final l s;

        /* renamed from: t, reason: collision with root package name */
        public final p<g> f2222t;

        /* renamed from: u, reason: collision with root package name */
        public b f2223u;

        /* renamed from: v, reason: collision with root package name */
        public long f2224v;

        /* renamed from: w, reason: collision with root package name */
        public long f2225w;
        private volatile int workerCtl;

        /* renamed from: x, reason: collision with root package name */
        public int f2226x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f2227y;

        public C0029a() {
            throw null;
        }

        public C0029a(int i6) {
            setDaemon(true);
            this.s = new l();
            this.f2222t = new p<>();
            this.f2223u = b.f2231v;
            this.nextParkedWorker = a.C;
            s5.c.s.getClass();
            this.f2226x = s5.c.f14399t.a().nextInt();
            f(i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            r12 = c6.l.f2251d.get(r9);
            r0 = c6.l.f2250c.get(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r12 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            if (c6.l.f2252e.get(r9) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        
            r0 = r0 - 1;
            r1 = r9.b(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        
            r7 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g a(boolean z6) {
            g gVarE;
            g gVarE2;
            long j6;
            b bVar = this.f2223u;
            a aVar = a.this;
            g gVar = null;
            l lVar = this.s;
            b bVar2 = b.s;
            if (bVar != bVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.A;
                do {
                    j6 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                        lVar.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f2249b;
                            g gVar2 = (g) atomicReferenceFieldUpdater.get(lVar);
                            if (gVar2 == null || gVar2.f2238t.a() != 1) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, gVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != gVar2) {
                                    break;
                                }
                            }
                            gVar = gVar2;
                            break loop1;
                        }
                        if (gVar != null) {
                            return gVar;
                        }
                        g gVarD = aVar.f2220x.d();
                        return gVarD == null ? i(1) : gVarD;
                    }
                } while (!a.A.compareAndSet(aVar, j6, j6 - 4398046511104L));
                this.f2223u = bVar2;
            }
            if (z6) {
                boolean z7 = d(aVar.s * 2) == 0;
                if (z7 && (gVarE2 = e()) != null) {
                    return gVarE2;
                }
                lVar.getClass();
                g gVarA = (g) l.f2249b.getAndSet(lVar, null);
                if (gVarA == null) {
                    gVarA = lVar.a();
                }
                if (gVarA != null) {
                    return gVarA;
                }
                if (!z7 && (gVarE = e()) != null) {
                    return gVarE;
                }
            } else {
                g gVarE3 = e();
                if (gVarE3 != null) {
                    return gVarE3;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i6) {
            int i7 = this.f2226x;
            int i8 = i7 ^ (i7 << 13);
            int i9 = i8 ^ (i8 >> 17);
            int i10 = i9 ^ (i9 << 5);
            this.f2226x = i10;
            int i11 = i6 - 1;
            return (i11 & i6) == 0 ? i10 & i11 : (i10 & Integer.MAX_VALUE) % i6;
        }

        public final g e() {
            int iD = d(2);
            a aVar = a.this;
            if (iD == 0) {
                g gVarD = aVar.f2219w.d();
                return gVarD != null ? gVarD : aVar.f2220x.d();
            }
            g gVarD2 = aVar.f2220x.d();
            return gVarD2 != null ? gVarD2 : aVar.f2219w.d();
        }

        public final void f(int i6) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f2218v);
            sb.append("-worker-");
            sb.append(i6 == 0 ? "TERMINATED" : String.valueOf(i6));
            setName(sb.toString());
            this.indexInArray = i6;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.f2223u;
            boolean z6 = bVar2 == b.s;
            if (z6) {
                a.A.addAndGet(a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f2223u = bVar;
            }
            return z6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        
            r7 = -2;
            r5 = r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, c6.g, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v14, types: [c6.g] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [c6.g] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g i(int i6) {
            long j6;
            T tB;
            long j7;
            long j8;
            T t6;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.A;
            a aVar = a.this;
            int i7 = (int) (atomicLongFieldUpdater.get(aVar) & 2097151);
            Object obj = null;
            if (i7 < 2) {
                return null;
            }
            int iD = d(i7);
            int i8 = 0;
            long jMin = Long.MAX_VALUE;
            while (i8 < i7) {
                iD++;
                if (iD > i7) {
                    iD = 1;
                }
                C0029a c0029aB = aVar.f2221y.b(iD);
                if (c0029aB != null && c0029aB != this) {
                    l lVar = c0029aB.s;
                    if (i6 != 3) {
                        lVar.getClass();
                        int i9 = l.f2251d.get(lVar);
                        int i10 = l.f2250c.get(lVar);
                        boolean z6 = i6 == 1;
                        while (true) {
                            if (i9 == i10) {
                                j6 = 0;
                                break;
                            }
                            j6 = 0;
                            if (!z6 || l.f2252e.get(lVar) != 0) {
                                int i11 = i9 + 1;
                                tB = lVar.b(i9, z6);
                                if (tB != 0) {
                                    break;
                                }
                                i9 = i11;
                            } else {
                                break;
                            }
                        }
                    } else {
                        tB = lVar.a();
                        j6 = 0;
                    }
                    p<g> pVar = this.f2222t;
                    if (tB != 0) {
                        pVar.s = tB;
                        t6 = obj;
                        j8 = -1;
                        j7 = -1;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f2249b;
                            ?? r14 = (g) atomicReferenceFieldUpdater.get(lVar);
                            if (r14 == 0) {
                                j7 = -1;
                                break;
                            }
                            j7 = -1;
                            if (((r14.f2238t.a() == 1 ? 1 : 2) & i6) == 0) {
                                break;
                            }
                            j.f2246f.getClass();
                            l lVar2 = lVar;
                            long jNanoTime = System.nanoTime() - r14.s;
                            long j9 = j.f2242b;
                            if (jNanoTime < j9) {
                                j8 = j9 - jNanoTime;
                                t6 = 0;
                                break;
                            }
                            do {
                                t6 = 0;
                                if (atomicReferenceFieldUpdater.compareAndSet(lVar2, r14, null)) {
                                    pVar.s = r14;
                                    j8 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(lVar2) == r14);
                            lVar = lVar2;
                            obj = null;
                        }
                    }
                    if (j8 == j7) {
                        g gVar = pVar.s;
                        pVar.s = t6;
                        return gVar;
                    }
                    if (j8 > j6) {
                        jMin = Math.min(jMin, j8);
                    }
                }
                i8++;
                obj = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f2225w = jMin;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:120:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j6;
            loop0: while (true) {
                boolean z6 = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    if (a.B.get(aVar) == 0) {
                        b bVar = this.f2223u;
                        b bVar2 = b.f2232w;
                        if (bVar == bVar2) {
                            break loop0;
                        }
                        g gVarA = a(this.f2227y);
                        if (gVarA != null) {
                            this.f2225w = 0L;
                            b bVar3 = b.f2229t;
                            a aVar2 = a.this;
                            int iA = gVarA.f2238t.a();
                            this.f2224v = 0L;
                            if (this.f2223u == b.f2230u) {
                                this.f2223u = bVar3;
                            }
                            if (iA != 0 && h(bVar3) && !aVar2.f() && !aVar2.e(a.A.get(aVar2))) {
                                aVar2.f();
                            }
                            aVar2.getClass();
                            try {
                                gVarA.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            if (iA != 0) {
                                a.A.addAndGet(aVar2, -2097152L);
                                if (this.f2223u != bVar2) {
                                    this.f2223u = b.f2231v;
                                }
                            }
                        } else {
                            this.f2227y = false;
                            if (this.f2225w == 0) {
                                Object obj = this.nextParkedWorker;
                                v vVar = a.C;
                                if (obj != vVar) {
                                    A.set(this, -1);
                                    while (this.nextParkedWorker != a.C) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            a aVar3 = a.this;
                                            aVar3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.B;
                                            if (atomicIntegerFieldUpdater2.get(aVar3) != 0) {
                                                break;
                                            }
                                            b bVar4 = this.f2223u;
                                            b bVar5 = b.f2232w;
                                            if (bVar4 == bVar5) {
                                                break;
                                            }
                                            h(b.f2230u);
                                            Thread.interrupted();
                                            if (this.f2224v == 0) {
                                                j6 = 2097151;
                                                this.f2224v = System.nanoTime() + a.this.f2217u;
                                            } else {
                                                j6 = 2097151;
                                            }
                                            LockSupport.parkNanos(a.this.f2217u);
                                            if (System.nanoTime() - this.f2224v >= 0) {
                                                this.f2224v = 0L;
                                                a aVar4 = a.this;
                                                synchronized (aVar4.f2221y) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(aVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater = a.A;
                                                            if (((int) (atomicLongFieldUpdater.get(aVar4) & j6)) > aVar4.s) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    aVar4.d(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(aVar4) & j6);
                                                                    if (andDecrement != i6) {
                                                                        C0029a c0029aB = aVar4.f2221y.b(andDecrement);
                                                                        kotlin.jvm.internal.j.b(c0029aB);
                                                                        C0029a c0029a = c0029aB;
                                                                        aVar4.f2221y.c(i6, c0029a);
                                                                        c0029a.f(i6);
                                                                        aVar4.d(c0029a, andDecrement, i6);
                                                                    }
                                                                    aVar4.f2221y.c(andDecrement, null);
                                                                    this.f2223u = bVar5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    a aVar5 = a.this;
                                    aVar5.getClass();
                                    if (this.nextParkedWorker == vVar) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.f2215z;
                                        while (true) {
                                            long j7 = atomicLongFieldUpdater2.get(aVar5);
                                            int i7 = this.indexInArray;
                                            this.nextParkedWorker = aVar5.f2221y.b((int) (j7 & 2097151));
                                            a aVar6 = aVar5;
                                            if (a.f2215z.compareAndSet(aVar6, j7, ((j7 + 2097152) & (-2097152)) | i7)) {
                                                break;
                                            } else {
                                                aVar5 = aVar6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (z6) {
                                    h(b.f2230u);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f2225w);
                                    this.f2225w = 0L;
                                    break;
                                }
                                z6 = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(b.f2232w);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
        public static final b s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f2229t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f2230u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f2231v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f2232w;

        /* renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ b[] f2233x;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            s = bVar;
            b bVar2 = new b("BLOCKING", 1);
            f2229t = bVar2;
            b bVar3 = new b("PARKING", 2);
            f2230u = bVar3;
            b bVar4 = new b("DORMANT", 3);
            f2231v = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            f2232w = bVar5;
            f2233x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2233x.clone();
        }
    }

    public a(int i6, int i7, String str, long j6) {
        this.s = i6;
        this.f2216t = i7;
        this.f2217u = j6;
        this.f2218v = str;
        if (i6 < 1) {
            throw new IllegalArgumentException(s0.a(i6, "Core pool size ", " should be at least 1").toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(androidx.camera.view.g.e("Max pool size ", i7, i6, " should be greater than or equals to core pool size ").toString());
        }
        if (i7 > 2097150) {
            throw new IllegalArgumentException(s0.a(i7, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f2219w = new d();
        this.f2220x = new d();
        this.f2221y = new s<>((i6 + 1) * 2);
        this.controlState = i6 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f2221y) {
            try {
                if (B.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = A;
                long j6 = atomicLongFieldUpdater.get(this);
                int i6 = (int) (j6 & 2097151);
                int i7 = i6 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= this.s) {
                    return 0;
                }
                if (i6 >= this.f2216t) {
                    return 0;
                }
                int i8 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f2221y.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0029a c0029a = new C0029a(i8);
                this.f2221y.c(i8, c0029a);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = i7 + 1;
                c0029a.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, h hVar) {
        g iVar;
        j.f2246f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof g) {
            iVar = (g) runnable;
            iVar.s = jNanoTime;
            iVar.f2238t = hVar;
        } else {
            iVar = new i(runnable, jNanoTime, hVar);
        }
        boolean z6 = iVar.f2238t.a() == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A;
        long jAddAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0029a c0029a = threadCurrentThread instanceof C0029a ? (C0029a) threadCurrentThread : null;
        if (c0029a == null || !kotlin.jvm.internal.j.a(a.this, this)) {
            c0029a = null;
        }
        if (c0029a != null && c0029a.f2223u != b.f2232w && (iVar.f2238t.a() != 0 || c0029a.f2223u != b.f2229t)) {
            c0029a.f2227y = true;
            l lVar = c0029a.s;
            lVar.getClass();
            iVar = (g) l.f2249b.getAndSet(lVar, iVar);
            if (iVar == null) {
                iVar = null;
            } else {
                AtomicReferenceArray<g> atomicReferenceArray = lVar.f2253a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f2250c;
                if (atomicIntegerFieldUpdater.get(lVar) - l.f2251d.get(lVar) != 127) {
                    if (iVar.f2238t.a() == 1) {
                        l.f2252e.incrementAndGet(lVar);
                    }
                    int i6 = atomicIntegerFieldUpdater.get(lVar) & 127;
                    while (atomicReferenceArray.get(i6) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i6, iVar);
                    atomicIntegerFieldUpdater.incrementAndGet(lVar);
                    iVar = null;
                }
            }
        }
        if (iVar != null) {
            if (!(iVar.f2238t.a() == 1 ? this.f2220x.a(iVar) : this.f2219w.a(iVar))) {
                throw new RejectedExecutionException(m.e(new StringBuilder(), this.f2218v, " was terminated"));
            }
        }
        if (z6) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i6;
        g gVarD;
        if (B.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0029a c0029a = threadCurrentThread instanceof C0029a ? (C0029a) threadCurrentThread : null;
            if (c0029a == null || !kotlin.jvm.internal.j.a(a.this, this)) {
                c0029a = null;
            }
            synchronized (this.f2221y) {
                i6 = (int) (A.get(this) & 2097151);
            }
            if (1 <= i6) {
                int i7 = 1;
                while (true) {
                    C0029a c0029aB = this.f2221y.b(i7);
                    kotlin.jvm.internal.j.b(c0029aB);
                    C0029a c0029a2 = c0029aB;
                    if (c0029a2 != c0029a) {
                        while (c0029a2.isAlive()) {
                            LockSupport.unpark(c0029a2);
                            c0029a2.join(10000L);
                        }
                        l lVar = c0029a2.s;
                        d dVar = this.f2220x;
                        lVar.getClass();
                        g gVar = (g) l.f2249b.getAndSet(lVar, null);
                        if (gVar != null) {
                            dVar.a(gVar);
                        }
                        while (true) {
                            g gVarA = lVar.a();
                            if (gVarA == null) {
                                break;
                            } else {
                                dVar.a(gVarA);
                            }
                        }
                    }
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f2220x.b();
            this.f2219w.b();
            while (true) {
                if (c0029a == null) {
                    gVarD = this.f2219w.d();
                    if (gVarD == null && (gVarD = this.f2220x.d()) == null) {
                        break;
                    }
                } else {
                    gVarD = c0029a.a(true);
                    if (gVarD == null) {
                    }
                }
                try {
                    gVarD.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0029a != null) {
                c0029a.h(b.f2232w);
            }
            f2215z.set(this, 0L);
            A.set(this, 0L);
        }
    }

    public final void d(C0029a c0029a, int i6, int i7) {
        while (true) {
            long j6 = f2215z.get(this);
            int i8 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & (-2097152);
            if (i8 == i6) {
                if (i7 == 0) {
                    Object objC = c0029a.c();
                    while (true) {
                        if (objC == C) {
                            i8 = -1;
                            break;
                        }
                        if (objC == null) {
                            i8 = 0;
                            break;
                        }
                        C0029a c0029a2 = (C0029a) objC;
                        int iB = c0029a2.b();
                        if (iB != 0) {
                            i8 = iB;
                            break;
                        }
                        objC = c0029a2.c();
                    }
                } else {
                    i8 = i7;
                }
            }
            if (i8 >= 0) {
                if (f2215z.compareAndSet(this, j6, i8 | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j6) {
        int i6 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = this.s;
        if (i6 < i7) {
            int iA = a();
            if (iA == 1 && i7 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f2247g);
    }

    public final boolean f() {
        v vVar;
        int iB;
        while (true) {
            long j6 = f2215z.get(this);
            C0029a c0029aB = this.f2221y.b((int) (2097151 & j6));
            if (c0029aB == null) {
                c0029aB = null;
            } else {
                long j7 = (2097152 + j6) & (-2097152);
                Object objC = c0029aB.c();
                while (true) {
                    vVar = C;
                    if (objC == vVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C0029a c0029a = (C0029a) objC;
                    iB = c0029a.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c0029a.c();
                }
                if (iB >= 0) {
                    if (f2215z.compareAndSet(this, j6, iB | j7)) {
                        c0029aB.g(vVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0029aB == null) {
                return false;
            }
            if (C0029a.A.compareAndSet(c0029aB, -1, 0)) {
                LockSupport.unpark(c0029aB);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s<C0029a> sVar = this.f2221y;
        int iA = sVar.a();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < iA; i11++) {
            C0029a c0029aB = sVar.b(i11);
            if (c0029aB != null) {
                l lVar = c0029aB.s;
                lVar.getClass();
                int i12 = l.f2249b.get(lVar) != null ? (l.f2250c.get(lVar) - l.f2251d.get(lVar)) + 1 : l.f2250c.get(lVar) - l.f2251d.get(lVar);
                int iOrdinal = c0029aB.f2223u.ordinal();
                if (iOrdinal == 0) {
                    i6++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i8++;
                } else if (iOrdinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i12);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i10++;
                }
            }
        }
        long j6 = A.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2218v);
        sb4.append('@');
        sb4.append(b0.e(this));
        sb4.append("[Pool Size {core = ");
        int i13 = this.s;
        sb4.append(i13);
        sb4.append(", max = ");
        sb4.append(this.f2216t);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i6);
        sb4.append(", blocking = ");
        sb4.append(i7);
        sb4.append(", parked = ");
        sb4.append(i8);
        sb4.append(", dormant = ");
        sb4.append(i9);
        sb4.append(", terminated = ");
        sb4.append(i10);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2219w.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2220x.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i13 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
