package td;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import td.p;

/* loaded from: classes2.dex */
public final class o implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f28738a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f28739b;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f28738a = executorService;
        this.f28739b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f28738a.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f28738a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f28738a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f28738a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f28738a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f28738a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.b() { // from class: td.c
            @Override // td.p.b
            public final ScheduledFuture a(final p.a aVar) {
                final o oVar = this.f28700a;
                ScheduledExecutorService scheduledExecutorService = oVar.f28739b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.schedule(new Runnable() { // from class: td.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = oVar.f28738a;
                        final Runnable runnable3 = runnable2;
                        final p.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: td.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                Runnable runnable4 = runnable3;
                                p pVar = p.this;
                                try {
                                    runnable4.run();
                                    pVar.j(null);
                                } catch (Exception e10) {
                                    pVar.k(e10);
                                }
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.b() { // from class: td.f
            @Override // td.p.b
            public final ScheduledFuture a(final p.a aVar) {
                final o oVar = this.f28708a;
                ScheduledExecutorService scheduledExecutorService = oVar.f28739b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: td.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = oVar.f28738a;
                        final Runnable runnable3 = runnable2;
                        final p.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: td.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                try {
                                    runnable3.run();
                                } catch (Exception e10) {
                                    p.this.k(e10);
                                    throw e10;
                                }
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new p(new p.b() { // from class: td.g
            @Override // td.p.b
            public final ScheduledFuture a(final p.a aVar) {
                final o oVar = this.f28713a;
                ScheduledExecutorService scheduledExecutorService = oVar.f28739b;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: td.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = oVar.f28738a;
                        final Runnable runnable3 = runnable2;
                        final p.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: td.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    runnable3.run();
                                } catch (Exception e10) {
                                    p.this.k(e10);
                                }
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f28738a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f28738a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f28738a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new p(new p.b() { // from class: td.h
            @Override // td.p.b
            public final ScheduledFuture a(final p.a aVar) {
                final o oVar = this.f28718a;
                ScheduledExecutorService scheduledExecutorService = oVar.f28739b;
                final Callable callable2 = callable;
                return scheduledExecutorService.schedule(new Callable() { // from class: td.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ExecutorService executorService = oVar.f28738a;
                        final Callable callable3 = callable2;
                        final p.a aVar2 = aVar;
                        return executorService.submit(new Runnable() { // from class: td.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                Callable callable4 = callable3;
                                p pVar = p.this;
                                try {
                                    pVar.j(callable4.call());
                                } catch (Exception e10) {
                                    pVar.k(e10);
                                }
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t3) {
        return this.f28738a.submit(runnable, t3);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f28738a.submit(runnable);
    }
}
