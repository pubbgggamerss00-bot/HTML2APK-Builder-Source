package b6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y5.d0;
import y5.f0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends y5.u implements f0 {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2026z = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");
    private volatile int runningWorkers;

    /* renamed from: u, reason: collision with root package name */
    public final y5.u f2027u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2028v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f2029w;

    /* renamed from: x, reason: collision with root package name */
    public final m<Runnable> f2030x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f2031y;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class a implements Runnable {
        public Runnable s;

        public a(Runnable runnable) {
            this.s = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            y5.u uVar = iVar.f2027u;
            int i6 = 0;
            while (true) {
                try {
                    this.s.run();
                } catch (Throwable th) {
                    y5.w.a(g5.g.s, th);
                }
                Runnable runnableZ = iVar.z();
                if (runnableZ == null) {
                    return;
                }
                this.s = runnableZ;
                i6++;
                if (i6 >= 16 && uVar.y()) {
                    uVar.x(iVar, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(y5.u uVar, int i6) {
        this.f2027u = uVar;
        this.f2028v = i6;
        f0 f0Var = uVar instanceof f0 ? (f0) uVar : null;
        this.f2029w = f0Var == null ? d0.f15330a : f0Var;
        this.f2030x = new m<>();
        this.f2031y = new Object();
    }

    @Override // y5.u
    public final void x(g5.f fVar, Runnable runnable) {
        this.f2030x.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2026z;
        if (atomicIntegerFieldUpdater.get(this) < this.f2028v) {
            synchronized (this.f2031y) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f2028v) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableZ = z();
                if (runnableZ == null) {
                    return;
                }
                this.f2027u.x(this, new a(runnableZ));
            }
        }
    }

    public final Runnable z() {
        while (true) {
            Runnable runnableD = this.f2030x.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f2031y) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2026z;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f2030x.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
