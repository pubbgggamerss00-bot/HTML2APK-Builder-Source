package androidx.camera.core.impl;

import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.impl.utils.futures.Futures;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RestrictedCameraControl extends ForwardingCameraControl {
    private final CameraControlInternal mCameraControl;
    private final SessionProcessor mSessionProcessor;

    public RestrictedCameraControl(CameraControlInternal cameraControlInternal, SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.mCameraControl = cameraControlInternal;
        this.mSessionProcessor = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<Void> cancelFocusAndMetering() {
        return this.mCameraControl.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<Void> enableTorch(boolean z6) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 6) ? Futures.immediateFailedFuture(new IllegalStateException("Torch is not supported")) : this.mCameraControl.enableTorch(z6);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.mCameraControl;
    }

    public SessionProcessor getSessionProcessor() {
        return this.mSessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<Integer> setExposureCompensationIndex(int i6) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 7) ? Futures.immediateFailedFuture(new IllegalStateException("ExposureCompensation is not supported")) : this.mCameraControl.setExposureCompensationIndex(i6);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<Void> setLinearZoom(float f6) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setLinearZoom(f6);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<Void> setZoomRatio(float f6) {
        return !SessionProcessorUtil.isOperationSupported(this.mSessionProcessor, 0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setZoomRatio(f6);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction modifiedFocusMeteringAction = SessionProcessorUtil.getModifiedFocusMeteringAction(this.mSessionProcessor, focusMeteringAction);
        return modifiedFocusMeteringAction == null ? Futures.immediateFailedFuture(new IllegalStateException("FocusMetering is not supported")) : this.mCameraControl.startFocusAndMetering(modifiedFocusMeteringAction);
    }
}
