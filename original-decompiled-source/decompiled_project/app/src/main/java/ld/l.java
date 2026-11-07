package ld;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final i f17004a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17005b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f17006c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ScheduledFuture<?> f17007d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f17008e = -1;

    public l(i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f17004a = iVar;
        this.f17005b = executor;
        this.f17006c = scheduledExecutorService;
    }

    public final void a() {
        if (this.f17007d == null || this.f17007d.isDone()) {
            return;
        }
        this.f17007d.cancel(false);
    }

    public final void b(long j10) {
        a();
        this.f17008e = -1L;
        this.f17007d = this.f17006c.schedule(new j(this), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }
}
