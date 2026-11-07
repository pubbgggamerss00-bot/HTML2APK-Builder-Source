package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirks;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class UseFlashModeTorchFor3aUpdate {
    private static final String TAG = "UseFlashModeTorchFor3aUpdate";
    private final TorchFlashRequiredFor3aUpdateQuirk mTorchFlashRequiredFor3AUpdateQuirk;

    public UseFlashModeTorchFor3aUpdate(Quirks quirks) {
        this.mTorchFlashRequiredFor3AUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) quirks.get(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean shouldUseFlashModeTorch() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.mTorchFlashRequiredFor3AUpdateQuirk;
        boolean z6 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.isFlashModeTorchRequired();
        Logger.d(TAG, "shouldUseFlashModeTorch: " + z6);
        return z6;
    }
}
