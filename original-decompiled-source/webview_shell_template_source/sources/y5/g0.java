package y5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g0<T> extends b6.t<T> {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15346v = AtomicIntegerFieldUpdater.newUpdater(g0.class, "_decision");
    private volatile int _decision;

    @Override // b6.t, y5.c1
    public final void n(Object obj) {
        u(obj);
    }

    @Override // b6.t, y5.c1
    public final void u(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15346v;
            int i6 = atomicIntegerFieldUpdater.get(this);
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                b6.h.a(a1.a.f(null), e1.a(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
