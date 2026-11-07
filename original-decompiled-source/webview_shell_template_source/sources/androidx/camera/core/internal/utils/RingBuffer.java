package androidx.camera.core.internal.utils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface RingBuffer<T> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnRemoveCallback<T> {
        void onRemove(T t6);
    }

    T dequeue();

    void enqueue(T t6);

    int getMaxCapacity();

    boolean isEmpty();
}
