package androidx.camera.core.impl.utils.futures;

import androidx.work.j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class FutureChain<V> implements c5.a<V> {
    b.a<V> mCompleter;
    private final c5.a<V> mDelegate;

    public FutureChain(c5.a<V> aVar) {
        aVar.getClass();
        this.mDelegate = aVar;
    }

    public static <V> FutureChain<V> from(c5.a<V> aVar) {
        return aVar instanceof FutureChain ? (FutureChain) aVar : new FutureChain<>(aVar);
    }

    public final void addCallback(FutureCallback<? super V> futureCallback, Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    @Override // c5.a
    public void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.mDelegate.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    public boolean set(V v2) {
        b.a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.a(v2);
        }
        return false;
    }

    public boolean setException(Throwable th) {
        b.a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.b(th);
        }
        return false;
    }

    public final <T> FutureChain<T> transform(o.a<? super V, T> aVar, Executor executor) {
        return (FutureChain) Futures.transform(this, aVar, executor);
    }

    public final <T> FutureChain<T> transformAsync(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j6, TimeUnit timeUnit) {
        return this.mDelegate.get(j6, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = y.b.a(new b.c<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // y.b.c
            public Object attachCompleter(b.a<V> aVar) {
                j.f("The result can only set once!", FutureChain.this.mCompleter == null);
                FutureChain.this.mCompleter = aVar;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
