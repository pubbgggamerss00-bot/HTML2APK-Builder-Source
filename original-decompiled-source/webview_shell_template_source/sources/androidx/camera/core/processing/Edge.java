package androidx.camera.core.processing;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Edge<T> implements t0.a<T> {
    private t0.a<T> mListener;

    @Override // t0.a
    public void accept(T t6) {
        kotlin.jvm.internal.j.c("Listener is not set.", this.mListener);
        this.mListener.accept(t6);
    }

    public void setListener(t0.a<T> aVar) {
        this.mListener = aVar;
    }
}
