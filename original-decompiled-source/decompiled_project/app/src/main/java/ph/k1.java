package ph;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class k1 extends j1 implements r0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21558c;

    public k1(Executor executor) {
        this.f21558c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // ph.g0
    public final void D0(tg.h hVar, Runnable runnable) {
        try {
            this.f21558c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            v1.b(hVar, cancellationException);
            wh.c cVar = z0.f21632a;
            wh.b.f31563c.D0(hVar, runnable);
        }
    }

    @Override // ph.j1
    public final Executor H0() {
        return this.f21558c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f21558c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k1) && ((k1) obj).f21558c == this.f21558c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f21558c);
    }

    @Override // ph.r0
    public final void i0(long j10, m mVar) {
        Executor executor = this.f21558c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            k2 k2Var = new k2(this, mVar);
            tg.h hVar = mVar.f21567e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(k2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                v1.b(hVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            mVar.t(new i(scheduledFutureSchedule));
        } else {
            n0.f21570k.i0(j10, mVar);
        }
    }

    @Override // ph.g0
    public final String toString() {
        return this.f21558c.toString();
    }

    @Override // ph.r0
    public final b1 z(long j10, Runnable runnable, tg.h hVar) {
        Executor executor = this.f21558c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                v1.b(hVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new a1(scheduledFutureSchedule) : n0.f21570k.z(j10, runnable, hVar);
    }
}
