package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final c5.a<T> mValueFuture;

    private ConstantObservable(T t6) {
        this.mValueFuture = Futures.immediateFuture(t6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e6) {
            observer.onError(e6);
        }
    }

    public static <U> Observable<U> withValue(U u6) {
        return u6 == null ? NULL_OBSERVABLE : new ConstantObservable(u6);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new androidx.camera.camera2.interop.d(2, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public c5.a<T> fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
    }
}
