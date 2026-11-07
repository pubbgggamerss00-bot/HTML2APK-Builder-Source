package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class LiveDataObservable<T> implements Observable<T> {
    final r<Result<T>> mLiveData = new r<>();
    private final Map<Observable.Observer<? super T>, LiveDataObserverAdapter<T>> mObservers = new HashMap();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class LiveDataObserverAdapter<T> implements s<Result<T>> {
        final AtomicBoolean mActive = new AtomicBoolean(true);
        final Executor mExecutor;
        final Observable.Observer<? super T> mObserver;

        public LiveDataObserverAdapter(Executor executor, Observable.Observer<? super T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onChanged$0(Result result) {
            if (this.mActive.get()) {
                if (result.completedSuccessfully()) {
                    this.mObserver.onNewData((Object) result.getValue());
                } else {
                    result.getError().getClass();
                    this.mObserver.onError(result.getError());
                }
            }
        }

        public void disable() {
            this.mActive.set(false);
        }

        @Override // androidx.lifecycle.s
        public void onChanged(Result<T> result) {
            this.mExecutor.execute(new i(0, this, result));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Result<T> {
        private final Throwable mError;
        private final T mValue;

        private Result(T t6, Throwable th) {
            this.mValue = t6;
            this.mError = th;
        }

        public static <T> Result<T> fromError(Throwable th) {
            th.getClass();
            return new Result<>(null, th);
        }

        public static <T> Result<T> fromValue(T t6) {
            return new Result<>(t6, null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public Throwable getError() {
            return this.mError;
        }

        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            return androidx.activity.m.e(sb, str, ">]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$2(LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            this.mLiveData.removeObserver(liveDataObserverAdapter);
        }
        this.mLiveData.observeForever(liveDataObserverAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$fetchData$0(b.a aVar) {
        Result<T> value = this.mLiveData.getValue();
        if (value == null) {
            aVar.b(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.completedSuccessfully()) {
            aVar.a(value.getValue());
        } else {
            value.getError().getClass();
            aVar.b(value.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$fetchData$1(b.a aVar) {
        CameraXExecutors.mainThreadExecutor().execute(new androidx.camera.core.j(1, this, aVar));
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeObserver$3(LiveDataObserverAdapter liveDataObserverAdapter) {
        this.mLiveData.removeObserver(liveDataObserverAdapter);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                final LiveDataObserverAdapter<T> liveDataObserverAdapter = this.mObservers.get(observer);
                if (liveDataObserverAdapter != null) {
                    liveDataObserverAdapter.disable();
                }
                final LiveDataObserverAdapter<T> liveDataObserverAdapter2 = new LiveDataObserverAdapter<>(executor, observer);
                this.mObservers.put(observer, liveDataObserverAdapter2);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.s.lambda$addObserver$2(liveDataObserverAdapter, liveDataObserverAdapter2);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public c5.a<T> fetchData() {
        return y.b.a(new androidx.camera.camera2.interop.f(3, this));
    }

    public LiveData<Result<T>> getLiveData() {
        return this.mLiveData;
    }

    public void postError(Throwable th) {
        this.mLiveData.postValue(Result.fromError(th));
    }

    public void postValue(T t6) {
        this.mLiveData.postValue(Result.fromValue(t6));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            try {
                final LiveDataObserverAdapter<T> liveDataObserverAdapterRemove = this.mObservers.remove(observer);
                if (liveDataObserverAdapterRemove != null) {
                    liveDataObserverAdapterRemove.disable();
                    CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.s.lambda$removeObserver$3(liveDataObserverAdapterRemove);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
