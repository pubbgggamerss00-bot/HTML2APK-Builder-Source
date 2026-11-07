package ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class q2 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21581g = AtomicIntegerFieldUpdater.newUpdater(q2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f21582e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    public b1 f21583f;

    public static void m(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // ph.x1
    public final boolean j() {
        return true;
    }

    @Override // ph.x1
    public final void k(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f21581g;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                m(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f21582e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21581g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                b1 b1Var = this.f21583f;
                if (b1Var != null) {
                    b1Var.a();
                    return;
                }
                return;
            }
        }
    }
}
