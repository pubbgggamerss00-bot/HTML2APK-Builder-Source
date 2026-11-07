package qc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qc.a;

/* loaded from: classes2.dex */
public abstract class l<V> implements m<V> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f22641a = Logger.getLogger(l.class.getName());

    public static final class a<V> extends a.i<V> {
    }

    public static class b<V> extends l<V> {

        /* renamed from: c, reason: collision with root package name */
        public static final b<Object> f22642c = new b<>(null);

        /* renamed from: b, reason: collision with root package name */
        public final V f22643b;

        public b(V v10) {
            this.f22643b = v10;
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return this.f22643b;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f22643b + "]]";
        }
    }

    @Override // qc.m
    public final void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f22641a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
