package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SessionProcessorSurface extends DeferrableSurface {
    private final int mOutputConfigId;
    private final Surface mSurface;

    public SessionProcessorSurface(Surface surface, int i6) {
        this.mSurface = surface;
        this.mOutputConfigId = i6;
    }

    public int getOutputConfigId() {
        return this.mOutputConfigId;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public c5.a<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }
}
