package ph;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f21547a;

    public i(ScheduledFuture scheduledFuture) {
        this.f21547a = scheduledFuture;
    }

    @Override // ph.j
    public final void d(Throwable th2) {
        this.f21547a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f21547a + ']';
    }
}
