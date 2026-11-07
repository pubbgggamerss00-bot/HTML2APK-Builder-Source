package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class UseTorchAsFlash {
    private final boolean mHasUseTorchAsFlashQuirk;

    public UseTorchAsFlash(Quirks quirks) {
        this.mHasUseTorchAsFlashQuirk = quirks.contains(UseTorchAsFlashQuirk.class);
    }

    public boolean shouldUseTorchAsFlash() {
        return this.mHasUseTorchAsFlashQuirk;
    }
}
