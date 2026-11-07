package ph;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class a1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f21495a;

    public a1(ScheduledFuture scheduledFuture) {
        this.f21495a = scheduledFuture;
    }

    @Override // ph.b1
    public final void a() {
        this.f21495a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f21495a + ']';
    }
}
