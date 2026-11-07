package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ForceCloseDeferrableSurface {
    private final boolean mHasConfigureSurfaceToSecondarySessionFailQuirk;
    private final boolean mHasPreviewOrientationIncorrectQuirk;
    private final boolean mHasTextureViewIsClosedQuirk;

    public ForceCloseDeferrableSurface(Quirks quirks, Quirks quirks2) {
        this.mHasTextureViewIsClosedQuirk = quirks2.contains(TextureViewIsClosedQuirk.class);
        this.mHasPreviewOrientationIncorrectQuirk = quirks.contains(PreviewOrientationIncorrectQuirk.class);
        this.mHasConfigureSurfaceToSecondarySessionFailQuirk = quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void onSessionEnd(List<DeferrableSurface> list) {
        if (!shouldForceClose() || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        Logger.d("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean shouldForceClose() {
        return this.mHasTextureViewIsClosedQuirk || this.mHasPreviewOrientationIncorrectQuirk || this.mHasConfigureSurfaceToSecondarySessionFailQuirk;
    }
}
