package androidx.camera.core.processing;

import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    default c5.a<Void> snapshot(int i6, int i7) {
        return Futures.immediateFuture(null);
    }
}
