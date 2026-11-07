package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.CameraControl
        public c5.a<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public c5.a<Void> enableTorch(boolean z6) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Rect getSensorRect() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.CameraControl
        public c5.a<Integer> setExposureCompensationIndex(int i6) {
            return Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.CameraControl
        public c5.a<Void> setLinearZoom(float f6) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public c5.a<Void> setZoomRatio(float f6) {
            return Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public c5.a<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i6, int i7) {
            return Futures.immediateFuture(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i6) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z6) {
        }
    };

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void addZslConfig(SessionConfig.Builder builder);

    void clearInteropConfig();

    default c5.a<CameraCapturePipeline> getCameraCapturePipelineAsync(int i6, int i7) {
        return Futures.immediateFuture(new CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public c5.a<Void> invokePostCapture() {
                return Futures.immediateFuture(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public c5.a<Void> invokePreCapture() {
                return Futures.immediateFuture(null);
            }
        });
    }

    int getFlashMode();

    Config getInteropConfig();

    Rect getSensorRect();

    SessionConfig getSessionConfig();

    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i6);

    void setZslDisabledByUserCaseConfig(boolean z6);

    c5.a<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i6, int i7);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }

    default void decrementVideoUsage() {
    }

    default CameraControlInternal getImplementation() {
        return this;
    }

    default void incrementVideoUsage() {
    }

    default void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
    }
}
