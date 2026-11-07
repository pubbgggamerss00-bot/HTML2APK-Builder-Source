package wh;

import b.o;
import c2.u;
import i0.u2;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.l;
import ph.m0;
import uh.q;
import uh.v;

/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31537h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31538j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31539k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final v f31540l = new v("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f31541a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31542b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31543c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f31544d;

    /* renamed from: e, reason: collision with root package name */
    public final d f31545e;

    /* renamed from: f, reason: collision with root package name */
    public final d f31546f;

    /* renamed from: g, reason: collision with root package name */
    public final q<C0320a> f31547g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: wh.a$a, reason: collision with other inner class name */
    public final class C0320a extends Thread {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f31548j = AtomicIntegerFieldUpdater.newUpdater(C0320a.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final k f31549a;

        /* renamed from: b, reason: collision with root package name */
        public final g0<g> f31550b;

        /* renamed from: c, reason: collision with root package name */
        public b f31551c;

        /* renamed from: d, reason: collision with root package name */
        public long f31552d;

        /* renamed from: e, reason: collision with root package name */
        public long f31553e;

        /* renamed from: f, reason: collision with root package name */
        public int f31554f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f31555g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C0320a() {
            throw null;
        }

        public C0320a(int i10) {
            setDaemon(true);
            setContextClassLoader(a.class.getClassLoader());
            this.f31549a = new k();
            this.f31550b = new g0<>();
            this.f31551c = b.f31560d;
            this.nextParkedWorker = a.f31540l;
            int iNanoTime = (int) System.nanoTime();
            this.f31554f = iNanoTime == 0 ? 42 : iNanoTime;
            f(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            r12 = wh.k.f31580d.get(r10);
            r0 = wh.k.f31579c.get(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            if (r12 == r0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            if (wh.k.f31581e.get(r10) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            r0 = r0 - 1;
            r1 = r10.c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r1 == null) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        
            r8 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g a(boolean z10) {
            g gVarE;
            g gVarE2;
            long j10;
            b bVar = this.f31551c;
            b bVar2 = b.f31557a;
            a aVar = a.this;
            g gVar = null;
            k kVar = this.f31549a;
            if (bVar != bVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = a.f31538j;
                do {
                    j10 = atomicLongFieldUpdater.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        kVar.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f31578b;
                            g gVar2 = (g) atomicReferenceFieldUpdater.get(kVar);
                            if (gVar2 == null || !gVar2.f31569b) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, gVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(kVar) != gVar2) {
                                    break;
                                }
                            }
                            gVar = gVar2;
                            break loop1;
                        }
                        if (gVar != null) {
                            return gVar;
                        }
                        g gVarD = aVar.f31546f.d();
                        return gVarD == null ? i(1) : gVarD;
                    }
                } while (!a.f31538j.compareAndSet(aVar, j10, j10 - 4398046511104L));
                this.f31551c = b.f31557a;
            }
            if (z10) {
                boolean z11 = d(aVar.f31541a * 2) == 0;
                if (z11 && (gVarE2 = e()) != null) {
                    return gVarE2;
                }
                kVar.getClass();
                g gVarB = (g) k.f31578b.getAndSet(kVar, null);
                if (gVarB == null) {
                    gVarB = kVar.b();
                }
                if (gVarB != null) {
                    return gVarB;
                }
                if (!z11 && (gVarE = e()) != null) {
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

        public final int d(int i10) {
            int i11 = this.f31554f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f31554f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            int iD = d(2);
            a aVar = a.this;
            if (iD == 0) {
                g gVarD = aVar.f31545e.d();
                return gVarD != null ? gVarD : aVar.f31546f.d();
            }
            g gVarD2 = aVar.f31546f.d();
            return gVarD2 != null ? gVarD2 : aVar.f31545e.d();
        }

        public final void f(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f31544d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.f31551c;
            boolean z10 = bVar2 == b.f31557a;
            if (z10) {
                a.f31538j.addAndGet(a.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.f31551c = bVar;
            }
            return z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        
            r7 = -2;
            r5 = r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, wh.g] */
        /* JADX WARN: Type inference failed for: r7v14, types: [wh.g] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [wh.g] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g i(int i10) {
            long j10;
            T tC;
            long j11;
            long j12;
            T t3;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f31538j;
            a aVar = a.this;
            int i11 = (int) (atomicLongFieldUpdater.get(aVar) & 2097151);
            Object obj = null;
            if (i11 < 2) {
                return null;
            }
            int iD = d(i11);
            int i12 = 0;
            long jMin = Long.MAX_VALUE;
            while (i12 < i11) {
                iD++;
                if (iD > i11) {
                    iD = 1;
                }
                C0320a c0320aB = aVar.f31547g.b(iD);
                if (c0320aB != null && c0320aB != this) {
                    k kVar = c0320aB.f31549a;
                    if (i10 != 3) {
                        kVar.getClass();
                        int i13 = k.f31580d.get(kVar);
                        int i14 = k.f31579c.get(kVar);
                        boolean z10 = i10 == 1;
                        while (true) {
                            if (i13 == i14) {
                                j10 = 0;
                                break;
                            }
                            j10 = 0;
                            if (!z10 || k.f31581e.get(kVar) != 0) {
                                int i15 = i13 + 1;
                                tC = kVar.c(i13, z10);
                                if (tC != 0) {
                                    break;
                                }
                                i13 = i15;
                            } else {
                                break;
                            }
                        }
                    } else {
                        tC = kVar.b();
                        j10 = 0;
                    }
                    g0<g> g0Var = this.f31550b;
                    if (tC != 0) {
                        g0Var.f16327a = tC;
                        t3 = obj;
                        j12 = -1;
                        j11 = -1;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f31578b;
                            ?? r14 = (g) atomicReferenceFieldUpdater.get(kVar);
                            if (r14 == 0) {
                                j11 = -1;
                                break;
                            }
                            j11 = -1;
                            if (((r14.f31569b ? 1 : 2) & i10) == 0) {
                                break;
                            }
                            i.f31576f.getClass();
                            k kVar2 = kVar;
                            long jNanoTime = System.nanoTime() - r14.f31568a;
                            long j13 = i.f31572b;
                            if (jNanoTime < j13) {
                                j12 = j13 - jNanoTime;
                                t3 = 0;
                                break;
                            }
                            do {
                                t3 = 0;
                                if (atomicReferenceFieldUpdater.compareAndSet(kVar2, r14, null)) {
                                    g0Var.f16327a = r14;
                                    j12 = -1;
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(kVar2) == r14);
                            kVar = kVar2;
                            obj = null;
                        }
                    }
                    if (j12 == j11) {
                        g gVar = g0Var.f16327a;
                        g0Var.f16327a = t3;
                        return gVar;
                    }
                    if (j12 > j10) {
                        jMin = Math.min(jMin, j12);
                    }
                }
                i12++;
                obj = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f31553e = jMin;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j10;
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    a aVar = a.this;
                    aVar.getClass();
                    if (a.f31539k.get(aVar) != 1) {
                        b bVar = this.f31551c;
                        b bVar2 = b.f31561e;
                        if (bVar == bVar2) {
                            break loop0;
                        }
                        g gVarA = a(this.f31555g);
                        if (gVarA != null) {
                            this.f31553e = 0L;
                            a aVar2 = a.this;
                            this.f31552d = 0L;
                            if (this.f31551c == b.f31559c) {
                                this.f31551c = b.f31558b;
                            }
                            if (gVarA.f31569b) {
                                if (h(b.f31558b) && !aVar2.Z() && !aVar2.N(a.f31538j.get(aVar2))) {
                                    aVar2.Z();
                                }
                                aVar2.getClass();
                                try {
                                    gVarA.run();
                                } catch (Throwable th2) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                }
                                a.f31538j.addAndGet(aVar2, -2097152L);
                                if (this.f31551c != bVar2) {
                                    this.f31551c = b.f31560d;
                                }
                            } else {
                                aVar2.getClass();
                                try {
                                    gVarA.run();
                                } catch (Throwable th3) {
                                    Thread threadCurrentThread2 = Thread.currentThread();
                                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                                }
                            }
                        } else {
                            this.f31555g = false;
                            if (this.f31553e == 0) {
                                Object obj = this.nextParkedWorker;
                                v vVar = a.f31540l;
                                if (obj != vVar) {
                                    f31548j.set(this, -1);
                                    while (this.nextParkedWorker != a.f31540l) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31548j;
                                        if (atomicIntegerFieldUpdater.get(this) == -1) {
                                            a aVar3 = a.this;
                                            aVar3.getClass();
                                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = a.f31539k;
                                            if (atomicIntegerFieldUpdater2.get(aVar3) == 1) {
                                                break;
                                            }
                                            b bVar3 = this.f31551c;
                                            b bVar4 = b.f31561e;
                                            if (bVar3 == bVar4) {
                                                break;
                                            }
                                            h(b.f31559c);
                                            Thread.interrupted();
                                            if (this.f31552d == 0) {
                                                j10 = 2097151;
                                                this.f31552d = System.nanoTime() + a.this.f31543c;
                                            } else {
                                                j10 = 2097151;
                                            }
                                            LockSupport.parkNanos(a.this.f31543c);
                                            if (System.nanoTime() - this.f31552d >= 0) {
                                                this.f31552d = 0L;
                                                a aVar4 = a.this;
                                                synchronized (aVar4.f31547g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(aVar4) == 1)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f31538j;
                                                            if (((int) (atomicLongFieldUpdater.get(aVar4) & j10)) > aVar4.f31541a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i10 = this.indexInArray;
                                                                    f(0);
                                                                    aVar4.M(this, i10, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(aVar4) & j10);
                                                                    if (andDecrement != i10) {
                                                                        C0320a c0320aB = aVar4.f31547g.b(andDecrement);
                                                                        r.b(c0320aB);
                                                                        C0320a c0320a = c0320aB;
                                                                        aVar4.f31547g.c(i10, c0320a);
                                                                        c0320a.f(i10);
                                                                        aVar4.M(c0320a, andDecrement, i10);
                                                                    }
                                                                    aVar4.f31547g.c(andDecrement, null);
                                                                    f0 f0Var = f0.f21461a;
                                                                    this.f31551c = bVar4;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    a aVar5 = a.this;
                                    aVar5.getClass();
                                    if (this.nextParkedWorker == vVar) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = a.f31537h;
                                        while (true) {
                                            long j11 = atomicLongFieldUpdater2.get(aVar5);
                                            int i11 = this.indexInArray;
                                            this.nextParkedWorker = aVar5.f31547g.b((int) (j11 & 2097151));
                                            a aVar6 = aVar5;
                                            if (a.f31537h.compareAndSet(aVar6, j11, ((j11 + 2097152) & (-2097152)) | i11)) {
                                                break;
                                            } else {
                                                aVar5 = aVar6;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (z10) {
                                    h(b.f31559c);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f31553e);
                                    this.f31553e = 0L;
                                    break;
                                }
                                z10 = true;
                            }
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(b.f31561e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31557a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f31558b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f31559c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f31560d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f31561e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f31562f;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            f31557a = bVar;
            b bVar2 = new b("BLOCKING", 1);
            f31558b = bVar2;
            b bVar3 = new b("PARKING", 2);
            f31559c = bVar3;
            b bVar4 = new b("DORMANT", 3);
            f31560d = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            f31561e = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f31562f = bVarArr;
            u2.e(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f31562f.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f31541a = i10;
        this.f31542b = i11;
        this.f31543c = j10;
        this.f31544d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(ad.b.b(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(e1.c.a(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(ad.b.b(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(u.a("Idle worker keep alive time ", " must be positive", j10).toString());
        }
        this.f31545e = new d();
        this.f31546f = new d();
        this.f31547g = new q<>((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
    }

    public static /* synthetic */ void z(a aVar, Runnable runnable, int i10) {
        aVar.p(runnable, false, (i10 & 4) == 0);
    }

    public final void M(C0320a c0320a, int i10, int i11) {
        while (true) {
            long j10 = f31537h.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = c0320a.c();
                    while (true) {
                        if (objC == f31540l) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        C0320a c0320a2 = (C0320a) objC;
                        int iB = c0320a2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = c0320a2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f31537h.compareAndSet(this, j10, i12 | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean N(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f31541a;
        if (i10 < i11) {
            int iL = l();
            if (iL == 1 && i11 > 1) {
                l();
            }
            if (iL > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        v vVar;
        int iB;
        while (true) {
            long j10 = f31537h.get(this);
            C0320a c0320aB = this.f31547g.b((int) (2097151 & j10));
            if (c0320aB == null) {
                c0320aB = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = c0320aB.c();
                while (true) {
                    vVar = f31540l;
                    if (objC == vVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C0320a c0320a = (C0320a) objC;
                    iB = c0320a.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c0320a.c();
                }
                if (iB >= 0) {
                    if (f31537h.compareAndSet(this, j10, iB | j11)) {
                        c0320aB.g(vVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0320aB == null) {
                return false;
            }
            if (C0320a.f31548j.compareAndSet(c0320aB, -1, 0)) {
                LockSupport.unpark(c0320aB);
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i10;
        g gVarD;
        if (f31539k.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0320a c0320a = threadCurrentThread instanceof C0320a ? (C0320a) threadCurrentThread : null;
            if (c0320a == null || !r.a(a.this, this)) {
                c0320a = null;
            }
            synchronized (this.f31547g) {
                i10 = (int) (f31538j.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    C0320a c0320aB = this.f31547g.b(i11);
                    r.b(c0320aB);
                    C0320a c0320a2 = c0320aB;
                    if (c0320a2 != c0320a) {
                        while (c0320a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0320a2);
                            c0320a2.join(10000L);
                        }
                        k kVar = c0320a2.f31549a;
                        d dVar = this.f31546f;
                        kVar.getClass();
                        g gVar = (g) k.f31578b.getAndSet(kVar, null);
                        if (gVar != null) {
                            dVar.a(gVar);
                        }
                        while (true) {
                            g gVarB = kVar.b();
                            if (gVarB == null) {
                                break;
                            } else {
                                dVar.a(gVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f31546f.b();
            this.f31545e.b();
            while (true) {
                if (c0320a == null) {
                    gVarD = this.f31545e.d();
                    if (gVarD == null && (gVarD = this.f31546f.d()) == null) {
                        break;
                    }
                } else {
                    gVarD = c0320a.a(true);
                    if (gVarD == null) {
                    }
                }
                try {
                    gVarD.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (c0320a != null) {
                c0320a.h(b.f31561e);
            }
            f31537h.set(this, 0L);
            f31538j.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z(this, runnable, 6);
    }

    public final int l() {
        synchronized (this.f31547g) {
            try {
                if (f31539k.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f31538j;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f31541a) {
                    return 0;
                }
                if (i10 >= this.f31542b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f31547g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0320a c0320a = new C0320a(i12);
                this.f31547g.c(i12, c0320a);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                c0320a.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p(Runnable runnable, boolean z10, boolean z11) {
        g hVar;
        b bVar;
        i.f31576f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof g) {
            hVar = (g) runnable;
            hVar.f31568a = jNanoTime;
            hVar.f31569b = z10;
        } else {
            hVar = new h(runnable, jNanoTime, z10);
        }
        boolean z12 = hVar.f31569b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31538j;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0320a c0320a = threadCurrentThread instanceof C0320a ? (C0320a) threadCurrentThread : null;
        if (c0320a == null || !r.a(a.this, this)) {
            c0320a = null;
        }
        if (c0320a != null && (bVar = c0320a.f31551c) != b.f31561e && (hVar.f31569b || bVar != b.f31558b)) {
            c0320a.f31555g = true;
            k kVar = c0320a.f31549a;
            if (z11) {
                hVar = kVar.a(hVar);
            } else {
                kVar.getClass();
                g gVar = (g) k.f31578b.getAndSet(kVar, hVar);
                hVar = gVar == null ? null : kVar.a(gVar);
            }
        }
        if (hVar != null) {
            if (!(hVar.f31569b ? this.f31546f.a(hVar) : this.f31545e.a(hVar))) {
                throw new RejectedExecutionException(o.a(new StringBuilder(), this.f31544d, " was terminated"));
            }
        }
        if (z12) {
            if (Z() || N(jAddAndGet)) {
                return;
            }
            Z();
            return;
        }
        if (Z() || N(atomicLongFieldUpdater.get(this))) {
            return;
        }
        Z();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q<C0320a> qVar = this.f31547g;
        int iA = qVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            C0320a c0320aB = qVar.b(i15);
            if (c0320aB != null) {
                k kVar = c0320aB.f31549a;
                kVar.getClass();
                int i16 = k.f31578b.get(kVar) != null ? (k.f31579c.get(kVar) - k.f31580d.get(kVar)) + 1 : k.f31579c.get(kVar) - k.f31580d.get(kVar);
                int iOrdinal = c0320aB.f31551c.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new l();
                    }
                    i14++;
                }
            }
        }
        long j10 = f31538j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f31544d);
        sb4.append('@');
        sb4.append(m0.a(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f31541a;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f31542b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f31545e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f31546f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
