package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = QuirkSettings.withDefaultBehavior();
    private static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    private final MutableStateObservable<QuirkSettings> mObservable = MutableStateObservable.withInitialState(DEFAULT);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {
        private static final String TAG = "ObserverToConsumerAdapter";
        private final t0.a<T> mDelegate;

        public ObserverToConsumerAdapter(t0.a<T> aVar) {
            this.mDelegate = aVar;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th) {
            Logger.e(TAG, "Unexpected error in Observable", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(T t6) {
            this.mDelegate.accept(t6);
        }
    }

    public static QuirkSettingsHolder instance() {
        return sInstance;
    }

    public QuirkSettings get() {
        try {
            return this.mObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e6) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e6);
        }
    }

    public void observe(Executor executor, t0.a<QuirkSettings> aVar) {
        this.mObservable.addObserver(executor, new ObserverToConsumerAdapter(aVar));
    }

    public void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    public void set(QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }
}
