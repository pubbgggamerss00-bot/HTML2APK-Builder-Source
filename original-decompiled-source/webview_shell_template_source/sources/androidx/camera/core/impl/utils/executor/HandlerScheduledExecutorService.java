package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import y.b;
import y.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    private static ThreadLocal<ScheduledExecutorService> sThreadLocalInstance = new ThreadLocal<ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return CameraXExecutors.mainThreadExecutor();
            }
            if (Looper.myLooper() != null) {
                return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
            }
            return null;
        }
    };
    private final Handler mHandler;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {
        final AtomicReference<b.a<V>> mCompleter = new AtomicReference<>(null);
        private final c5.a<V> mDelegate;
        private final long mRunAtMillis;
        private final Callable<V> mTask;

        public HandlerScheduledFuture(final Handler handler, long j6, final Callable<V> callable) {
            this.mRunAtMillis = j6;
            this.mTask = callable;
            this.mDelegate = b.a(new b.c<V>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // y.b.c
                public Object attachCompleter(b.a<V> aVar) {
                    Runnable runnable = new Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (HandlerScheduledFuture.this.mCompleter.getAndSet(null) != null) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                handler.removeCallbacks(HandlerScheduledFuture.this);
                            }
                        }
                    };
                    Executor executorDirectExecutor = CameraXExecutors.directExecutor();
                    d<Void> dVar = aVar.f15192c;
                    if (dVar != null) {
                        dVar.addListener(runnable, executorDirectExecutor);
                    }
                    HandlerScheduledFuture.this.mCompleter.set(aVar);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            return this.mDelegate.cancel(z6);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.mDelegate.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.mRunAtMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            b.a andSet = this.mCompleter.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.a(this.mTask.call());
                } catch (Exception e6) {
                    andSet.b(e6);
                }
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public V get(long j6, TimeUnit timeUnit) {
            return this.mDelegate.get(j6, timeUnit);
        }
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.mHandler = handler;
    }

    private RejectedExecutionException createPostFailedException() {
        return new RejectedExecutionException(this.mHandler + " is shutting down");
    }

    public static ScheduledExecutorService currentThreadExecutor() {
        ScheduledExecutorService scheduledExecutorService = sThreadLocalInstance.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("Current thread has no looper!");
        }
        HandlerScheduledExecutorService handlerScheduledExecutorService = new HandlerScheduledExecutorService(new Handler(looperMyLooper));
        sThreadLocalInstance.set(handlerScheduledExecutorService);
        return handlerScheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.mHandler.post(runnable)) {
            throw createPostFailedException();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, long j6, TimeUnit timeUnit) {
        return schedule(new Callable<Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        }, j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j6, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j6, timeUnit) + SystemClock.uptimeMillis();
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(this.mHandler, jConvert, callable);
        return this.mHandler.postAtTime(handlerScheduledFuture, jConvert) ? handlerScheduledFuture : Futures.immediateFailedScheduledFuture(createPostFailedException());
    }
}
