package androidx.camera.core.impl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(Object obj, boolean z6) {
        super(obj, z6);
    }

    public static <T> MutableStateObservable<T> withInitialError(Throwable th) {
        return new MutableStateObservable<>(th, true);
    }

    public static <T> MutableStateObservable<T> withInitialState(T t6) {
        return new MutableStateObservable<>(t6, false);
    }

    public void setError(Throwable th) {
        updateStateAsError(th);
    }

    public void setState(T t6) {
        updateState(t6);
    }
}
