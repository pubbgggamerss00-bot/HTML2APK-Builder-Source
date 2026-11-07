package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CaptureFailedRetryEnabler {
    private final CaptureFailedRetryQuirk mCaptureFailedRetryQuirk = (CaptureFailedRetryQuirk) DeviceQuirks.get(CaptureFailedRetryQuirk.class);

    public int getRetryCount() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.mCaptureFailedRetryQuirk;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.getRetryCount();
    }
}
