package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(Surface surface, Size size, int i6) {
        super(size, i6);
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public c5.a<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(Surface surface) {
        this.mSurface = surface;
    }
}
