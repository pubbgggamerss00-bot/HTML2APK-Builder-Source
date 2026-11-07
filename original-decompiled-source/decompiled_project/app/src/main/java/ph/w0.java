package ph;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class w0<T> extends uh.r<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21598e = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public w0() {
        throw null;
    }

    @Override // uh.r, ph.y1
    public final void i(Object obj) {
        j(obj);
    }

    @Override // uh.r, ph.y1
    public final void j(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f21598e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                uh.g.a(f1.m.g(obj), ah.p.c(this.f29766d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
