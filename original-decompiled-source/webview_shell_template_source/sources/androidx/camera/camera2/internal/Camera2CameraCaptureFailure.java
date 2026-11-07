package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.core.impl.CameraCaptureFailure;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Camera2CameraCaptureFailure extends CameraCaptureFailure {
    private final CaptureFailure mCaptureFailure;

    public Camera2CameraCaptureFailure(CameraCaptureFailure.Reason reason, CaptureFailure captureFailure) {
        super(reason);
        this.mCaptureFailure = captureFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    public Object getCaptureFailure() {
        return this.mCaptureFailure;
    }
}
