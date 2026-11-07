package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class ListFuture<V> implements c5.a<List<V>> {
    private final boolean mAllMustSucceed;
    List<? extends c5.a<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final c5.a<List<V>> mResult;
    b.a<List<V>> mResultNotifier;
    List<V> mValues;

    public ListFuture(List<? extends c5.a<? extends V>> list, boolean z6, Executor executor) {
        list.getClass();
        this.mFutures = list;
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z6;
        this.mRemaining = new AtomicInteger(list.size());
        this.mResult = y.b.a(new b.c<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
            @Override // y.b.c
            public Object attachCompleter(b.a<List<V>> aVar) {
                j.f("The result can only set once!", ListFuture.this.mResultNotifier == null);
                ListFuture.this.mResultNotifier = aVar;
                return "ListFuture[" + this + "]";
            }
        });
        init(executor);
    }

    private void callAllGets() throws InterruptedException {
        List<? extends c5.a<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (c5.a<? extends V> aVar : list) {
            while (!aVar.isDone()) {
                try {
                    aVar.get();
                } catch (Error e6) {
                    throw e6;
                } catch (InterruptedException e7) {
                    throw e7;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.a(new ArrayList(this.mValues));
            return;
        }
        for (int i6 = 0; i6 < this.mFutures.size(); i6++) {
            this.mValues.add(null);
        }
        List<? extends c5.a<? extends V>> list = this.mFutures;
        for (final int i7 = 0; i7 < list.size(); i7++) {
            final c5.a<? extends V> aVar = list.get(i7);
            aVar.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i7, aVar);
                }
            }, executor);
        }
    }

    @Override // c5.a
    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        List<? extends c5.a<? extends V>> list = this.mFutures;
        if (list != null) {
            Iterator<? extends c5.a<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z6);
            }
        }
        return this.mResult.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i6, Future<? extends V> future) {
        b.a<List<V>> aVar;
        ArrayList arrayList;
        List<V> list = this.mValues;
        if (isDone() || list == null) {
            j.f("Future was done before all dependencies completed", this.mAllMustSucceed);
            return;
        }
        try {
            try {
                try {
                    try {
                        j.f("Tried to set value from future which is not done", future.isDone());
                        list.set(i6, Futures.getUninterruptibly(future));
                        int iDecrementAndGet = this.mRemaining.decrementAndGet();
                        j.f("Less than 0 remaining futures", iDecrementAndGet >= 0);
                        if (iDecrementAndGet == 0) {
                            List<V> list2 = this.mValues;
                            if (list2 != null) {
                                this.mResultNotifier.a(new ArrayList(list2));
                            } else {
                                j.f(null, isDone());
                            }
                        }
                    } catch (ExecutionException e6) {
                        if (this.mAllMustSucceed) {
                            this.mResultNotifier.b(e6.getCause());
                        }
                        int iDecrementAndGet2 = this.mRemaining.decrementAndGet();
                        j.f("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                        if (iDecrementAndGet2 == 0) {
                            List<V> list3 = this.mValues;
                            if (list3 != null) {
                                aVar = this.mResultNotifier;
                                arrayList = new ArrayList(list3);
                                aVar.a(arrayList);
                                return;
                            }
                            j.f(null, isDone());
                        }
                    }
                } catch (RuntimeException e7) {
                    if (this.mAllMustSucceed) {
                        this.mResultNotifier.b(e7);
                    }
                    int iDecrementAndGet3 = this.mRemaining.decrementAndGet();
                    j.f("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                    if (iDecrementAndGet3 == 0) {
                        List<V> list4 = this.mValues;
                        if (list4 != null) {
                            aVar = this.mResultNotifier;
                            arrayList = new ArrayList(list4);
                            aVar.a(arrayList);
                            return;
                        }
                        j.f(null, isDone());
                    }
                }
            } catch (Error e8) {
                this.mResultNotifier.b(e8);
                int iDecrementAndGet4 = this.mRemaining.decrementAndGet();
                j.f("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                if (iDecrementAndGet4 == 0) {
                    List<V> list5 = this.mValues;
                    if (list5 != null) {
                        aVar = this.mResultNotifier;
                        arrayList = new ArrayList(list5);
                        aVar.a(arrayList);
                        return;
                    }
                    j.f(null, isDone());
                }
            } catch (CancellationException unused) {
                if (this.mAllMustSucceed) {
                    cancel(false);
                }
                int iDecrementAndGet5 = this.mRemaining.decrementAndGet();
                j.f("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                if (iDecrementAndGet5 == 0) {
                    List<V> list6 = this.mValues;
                    if (list6 != null) {
                        aVar = this.mResultNotifier;
                        arrayList = new ArrayList(list6);
                        aVar.a(arrayList);
                        return;
                    }
                    j.f(null, isDone());
                }
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.mRemaining.decrementAndGet();
            j.f("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.a(new ArrayList(list7));
                } else {
                    j.f(null, isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public List<V> get() throws InterruptedException {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j6, TimeUnit timeUnit) {
        return this.mResult.get(j6, timeUnit);
    }
}
