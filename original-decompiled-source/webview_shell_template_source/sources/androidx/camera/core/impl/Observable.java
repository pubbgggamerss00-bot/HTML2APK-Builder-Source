package androidx.camera.core.impl;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface Observable<T> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Observer<T> {
        void onError(Throwable th);

        void onNewData(T t6);
    }

    void addObserver(Executor executor, Observer<? super T> observer);

    c5.a<T> fetchData();

    void removeObserver(Observer<? super T> observer);
}
