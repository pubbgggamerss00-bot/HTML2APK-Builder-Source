package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private c5.a<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile c5.a<? extends O> mOutputFuture;

    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, c5.a<? extends I> aVar) {
        asyncFunction.getClass();
        this.mFunction = asyncFunction;
        aVar.getClass();
        this.mInputFuture = aVar;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e6) {
        boolean z6 = false;
        while (true) {
            try {
                blockingQueue.put(e6);
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
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z6 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
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
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        if (!super.cancel(z6)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z6));
        cancel(this.mInputFuture, z6);
        cancel(this.mOutputFuture, z6);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            c5.a<? extends I> aVar = this.mInputFuture;
            if (aVar != null) {
                aVar.get();
            }
            this.mOutputCreated.await();
            c5.a<? extends O> aVar2 = this.mOutputFuture;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, c5.a<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, c5.a<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        AsyncFunction<? super I, ? extends O> asyncFunction;
        ?? r02 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            final c5.a<? extends O> aVarApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = aVarApply;
                            if (isCancelled()) {
                                aVarApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                aVarApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                try {
                                                    ChainingListenableFuture.this.set(Futures.getUninterruptibly(aVarApply));
                                                } catch (CancellationException unused) {
                                                    ChainingListenableFuture.this.cancel(false);
                                                }
                                            } catch (ExecutionException e6) {
                                                ChainingListenableFuture.this.setException(e6.getCause());
                                            }
                                        } finally {
                                            ChainingListenableFuture.this.mOutputFuture = null;
                                        }
                                    }
                                }, CameraXExecutors.directExecutor());
                            }
                        } catch (Exception e6) {
                            setException(e6);
                            asyncFunction = r02;
                        }
                    } catch (Error e7) {
                        setException(e7);
                        asyncFunction = r02;
                    }
                } finally {
                    this.mFunction = (AsyncFunction<? super I, ? extends O>) r02;
                    this.mInputFuture = (c5.a<? extends I>) r02;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e8) {
                setException(e8.getCause());
            }
        } catch (UndeclaredThrowableException e9) {
            setException(e9.getCause());
            asyncFunction = r02;
        }
    }

    private void cancel(Future<?> future, boolean z6) {
        if (future != null) {
            future.cancel(z6);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j6 = timeUnit2.convert(j6, timeUnit);
                timeUnit = timeUnit2;
            }
            c5.a<? extends I> aVar = this.mInputFuture;
            if (aVar != null) {
                long jNanoTime = System.nanoTime();
                aVar.get(j6, timeUnit);
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j6, timeUnit)) {
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                c5.a<? extends O> aVar2 = this.mOutputFuture;
                if (aVar2 != null) {
                    aVar2.get(j6, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j6, timeUnit);
    }
}
