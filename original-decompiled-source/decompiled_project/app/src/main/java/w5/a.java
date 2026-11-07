package w5;

import androidx.room.g0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import pg.f0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g0.f f31267a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f31268b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f31269c = new AtomicBoolean(false);

    public a(g0.f fVar) {
        this.f31267a = fVar;
    }

    public final boolean a() {
        synchronized (this) {
            if (this.f31269c.get()) {
                return false;
            }
            this.f31268b.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            this.f31268b.decrementAndGet();
            if (this.f31268b.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            f0 f0Var = f0.f21461a;
        }
    }
}
