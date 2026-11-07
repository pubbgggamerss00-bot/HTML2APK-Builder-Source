package uh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ph.g2;
import uh.s;

/* loaded from: classes2.dex */
public abstract class s<S extends s<S>> extends b<S> implements g2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29767d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f29768c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j10, S s10, int i10) {
        super(s10);
        this.f29768c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // uh.b
    public final boolean c() {
        return f29767d.get(this) == g() && b() != null;
    }

    public final boolean f() {
        return f29767d.addAndGet(this, -65536) == g() && b() != null;
    }

    public abstract int g();

    public abstract void h(int i10, tg.h hVar);

    public final void i() {
        if (f29767d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f29767d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
