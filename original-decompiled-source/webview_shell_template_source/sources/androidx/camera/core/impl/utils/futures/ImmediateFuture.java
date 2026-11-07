package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.Logger;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
abstract class ImmediateFuture<V> implements c5.a<V> {
    private static final String TAG = "ImmediateFuture";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {
        private final Throwable mCause;

        public ImmediateFailedFuture(Throwable th) {
            this.mCause = th;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.mCause);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture(null);
        private final V mValue;

        public ImmediateSuccessfulFuture(V v2) {
            this.mValue = v2;
        }

        @Override // androidx.camera.core.impl.utils.futures.ImmediateFuture, java.util.concurrent.Future
        public V get() {
            return this.mValue;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.mValue + "]]";
        }
    }

    public static <V> c5.a<V> nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    @Override // c5.a
    public void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            Logger.e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e6);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
