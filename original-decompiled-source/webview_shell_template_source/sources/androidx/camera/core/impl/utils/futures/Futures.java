package androidx.camera.core.impl.utils.futures;

import androidx.camera.camera2.interop.f;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.camera.core.y;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Futures {
    private static final o.a<?, ?> IDENTITY_FUNCTION = new o.a<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // o.a
        public Object apply(Object obj) {
            return obj;
        }
    };

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e6) {
                e = e6;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e7) {
                e = e7;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e8);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(c5.a<V> aVar, FutureCallback<? super V> futureCallback, Executor executor) {
        futureCallback.getClass();
        aVar.addListener(new CallbackListener(aVar, futureCallback), executor);
    }

    public static <V> c5.a<List<V>> allAsList(Collection<? extends c5.a<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static <V> V getDone(Future<V> future) {
        j.f("Future was expected to be done, " + future, future.isDone());
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v2;
        boolean z6 = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    public static <V> c5.a<V> immediateFailedFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <V> c5.a<V> immediateFuture(V v2) {
        return v2 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$makeTimeoutFuture$1(b.a aVar, c5.a aVar2, long j6) {
        return Boolean.valueOf(aVar.b(new TimeoutException("Future[" + aVar2 + "] is not done within " + j6 + " ms.")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$3(final c5.a aVar, ScheduledExecutorService scheduledExecutorService, final long j6, final b.a aVar2) {
        propagate(aVar, aVar2);
        if (!aVar.isDone()) {
            aVar.addListener(new androidx.activity.j(2, scheduledExecutorService.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Futures.lambda$makeTimeoutFuture$1(aVar2, aVar, j6);
                }
            }, j6, TimeUnit.MILLISECONDS)), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeTimeoutFuture$4(b.a aVar, Object obj, boolean z6, c5.a aVar2) {
        aVar.a(obj);
        if (z6) {
            aVar2.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$makeTimeoutFuture$6(final c5.a aVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z6, long j6, final b.a aVar2) {
        propagate(aVar, aVar2);
        if (!aVar.isDone()) {
            aVar.addListener(new y(3, scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.d
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.lambda$makeTimeoutFuture$4(aVar2, obj, z6, aVar);
                }
            }, j6, TimeUnit.MILLISECONDS)), CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$nonCancellationPropagating$0(c5.a aVar, b.a aVar2) {
        propagateTransform(false, aVar, IDENTITY_FUNCTION, aVar2, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + aVar + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$transformAsyncOnCompletion$8(c5.a aVar, b.a aVar2) {
        aVar.addListener(new androidx.activity.d(1, aVar2), CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + aVar + "]";
    }

    public static <V> c5.a<V> makeTimeoutFuture(final long j6, final ScheduledExecutorService scheduledExecutorService, final c5.a<V> aVar) {
        return y.b.a(new b.c() { // from class: androidx.camera.core.impl.utils.futures.a
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar2) {
                return Futures.lambda$makeTimeoutFuture$3(aVar, scheduledExecutorService, j6, aVar2);
            }
        });
    }

    public static <V> c5.a<V> nonCancellationPropagating(c5.a<V> aVar) {
        aVar.getClass();
        return aVar.isDone() ? aVar : y.b.a(new f(4, aVar));
    }

    public static <V> void propagate(c5.a<V> aVar, b.a<V> aVar2) {
        propagateTransform(aVar, IDENTITY_FUNCTION, aVar2, CameraXExecutors.directExecutor());
    }

    private static <I, O> void propagateTransform(boolean z6, final c5.a<I> aVar, final o.a<? super I, ? extends O> aVar2, final b.a<O> aVar3, Executor executor) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        executor.getClass();
        addCallback(aVar, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                aVar3.b(th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i6) {
                try {
                    aVar3.a(aVar2.apply(i6));
                } catch (Throwable th) {
                    aVar3.b(th);
                }
            }
        }, executor);
        if (z6) {
            Runnable runnable = new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    aVar.cancel(true);
                }
            };
            Executor executorDirectExecutor = CameraXExecutors.directExecutor();
            y.d<Void> dVar = aVar3.f15192c;
            if (dVar != null) {
                dVar.addListener(runnable, executorDirectExecutor);
            }
        }
    }

    public static <V> c5.a<List<V>> successfulAsList(Collection<? extends c5.a<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <I, O> c5.a<O> transform(c5.a<I> aVar, final o.a<? super I, ? extends O> aVar2, Executor executor) {
        aVar2.getClass();
        return transformAsync(aVar, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public c5.a<O> apply(I i6) {
                return Futures.immediateFuture(aVar2.apply(i6));
            }
        }, executor);
    }

    public static <I, O> c5.a<O> transformAsync(c5.a<I> aVar, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, aVar);
        aVar.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <V> c5.a<Void> transformAsyncOnCompletion(c5.a<V> aVar) {
        return y.b.a(new b(0, aVar));
    }

    public static <V> c5.a<V> makeTimeoutFuture(final long j6, final ScheduledExecutorService scheduledExecutorService, final V v2, final boolean z6, final c5.a<V> aVar) {
        return y.b.a(new b.c() { // from class: androidx.camera.core.impl.utils.futures.c
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar2) {
                return Futures.lambda$makeTimeoutFuture$6(aVar, scheduledExecutorService, v2, z6, j6, aVar2);
            }
        });
    }

    public static <I, O> void propagateTransform(c5.a<I> aVar, o.a<? super I, ? extends O> aVar2, b.a<O> aVar3, Executor executor) {
        propagateTransform(true, aVar, aVar2, aVar3, executor);
    }
}
