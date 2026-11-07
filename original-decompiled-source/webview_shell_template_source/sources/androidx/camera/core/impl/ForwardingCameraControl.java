package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ForwardingCameraControl implements CameraControlInternal {
    private final CameraControlInternal mCameraControlInternal;

    public ForwardingCameraControl(CameraControlInternal cameraControlInternal) {
        this.mCameraControlInternal = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
        this.mCameraControlInternal.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig.Builder builder) {
        this.mCameraControlInternal.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> cancelFocusAndMetering() {
        return this.mCameraControlInternal.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCameraControlInternal.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mCameraControlInternal.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> enableTorch(boolean z6) {
        return this.mCameraControlInternal.enableTorch(z6);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public c5.a<CameraCapturePipeline> getCameraCapturePipelineAsync(int i6, int i7) {
        return this.mCameraControlInternal.getCameraCapturePipelineAsync(i6, i7);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mCameraControlInternal.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.mCameraControlInternal.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return this.mCameraControlInternal.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect getSensorRect() {
        return this.mCameraControlInternal.getSensorRect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public SessionConfig getSessionConfig() {
        return this.mCameraControlInternal.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mCameraControlInternal.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        return this.mCameraControlInternal.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mCameraControlInternal.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Integer> setExposureCompensationIndex(int i6) {
        return this.mCameraControlInternal.setExposureCompensationIndex(i6);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i6) {
        this.mCameraControlInternal.setFlashMode(i6);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> setLinearZoom(float f6) {
        return this.mCameraControlInternal.setLinearZoom(f6);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.mCameraControlInternal.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> setZoomRatio(float f6) {
        return this.mCameraControlInternal.setZoomRatio(f6);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z6) {
        this.mCameraControlInternal.setZslDisabledByUserCaseConfig(z6);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return this.mCameraControlInternal.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public c5.a<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i6, int i7) {
        return this.mCameraControlInternal.submitStillCaptureRequests(list, i6, i7);
    }
}
