package uh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ph.b1;
import ph.o0;
import ph.r0;

/* loaded from: classes2.dex */
public final class h extends ph.g0 implements r0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29743h = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f29744c;

    /* renamed from: d, reason: collision with root package name */
    public final ph.g0 f29745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29746e;

    /* renamed from: f, reason: collision with root package name */
    public final m<Runnable> f29747f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29748g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f29749a;

        public a(Runnable runnable) {
            this.f29749a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f29749a.run();
                } catch (Throwable th2) {
                    kotlinx.coroutines.a.a(th2, tg.i.f28768a);
                }
                h hVar = h.this;
                Runnable runnableH0 = hVar.H0();
                if (runnableH0 == null) {
                    return;
                }
                this.f29749a = runnableH0;
                i10++;
                if (i10 >= 16 && g.c(hVar.f29745d, hVar)) {
                    g.b(hVar.f29745d, hVar, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(ph.g0 g0Var, int i10) {
        r0 r0Var = g0Var instanceof r0 ? (r0) g0Var : null;
        this.f29744c = r0Var == null ? o0.f21572a : r0Var;
        this.f29745d = g0Var;
        this.f29746e = i10;
        this.f29747f = new m<>();
        this.f29748g = new Object();
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        Runnable runnableH0;
        this.f29747f.a(runnable);
        if (f29743h.get(this) >= this.f29746e || !I0() || (runnableH0 = H0()) == null) {
            return;
        }
        g.b(this.f29745d, this, new a(runnableH0));
    }

    @Override // ph.g0
    public final void E0(tg.h hVar, Runnable runnable) {
        Runnable runnableH0;
        this.f29747f.a(runnable);
        if (f29743h.get(this) >= this.f29746e || !I0() || (runnableH0 = H0()) == null) {
            return;
        }
        this.f29745d.E0(this, new a(runnableH0));
    }

    @Override // ph.g0
    public final ph.g0 G0(int i10) {
        i.a(i10);
        return i10 >= this.f29746e ? this : super.G0(i10);
    }

    public final Runnable H0() {
        while (true) {
            Runnable runnableD = this.f29747f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f29748g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29743h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f29747f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean I0() {
        synchronized (this.f29748g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29743h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f29746e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // ph.r0
    public final void i0(long j10, ph.m mVar) {
        this.f29744c.i0(j10, mVar);
    }

    @Override // ph.g0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29745d);
        sb.append(".limitedParallelism(");
        return b.b.a(sb, this.f29746e, ')');
    }

    @Override // ph.r0
    public final b1 z(long j10, Runnable runnable, tg.h hVar) {
        return this.f29744c.z(j10, runnable, hVar);
    }
}
