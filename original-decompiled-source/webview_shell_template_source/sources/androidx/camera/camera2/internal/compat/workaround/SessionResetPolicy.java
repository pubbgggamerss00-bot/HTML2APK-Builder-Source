package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SessionResetPolicy {
    private final boolean mNeedAbortCapture;

    public SessionResetPolicy(Quirks quirks) {
        this.mNeedAbortCapture = quirks.contains(Preview3AThreadCrashQuirk.class);
    }

    public boolean needAbortCapture() {
        return this.mNeedAbortCapture;
    }
}
