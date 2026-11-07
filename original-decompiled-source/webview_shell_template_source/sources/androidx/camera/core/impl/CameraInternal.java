package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import java.util.Collection;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        State(boolean z6) {
            this.mHoldsCameraSlot = z6;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    void close();

    void detachUseCases(Collection<UseCase> collection);

    @Override // androidx.camera.core.Camera
    default CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    default CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    CameraInfoInternal getCameraInfoInternal();

    Observable<State> getCameraState();

    @Override // androidx.camera.core.Camera
    default CameraConfig getExtendedConfig() {
        return CameraConfigs.defaultConfig();
    }

    default boolean getHasTransform() {
        return true;
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    void open();

    c5.a<Void> release();

    default void setActiveResumingMode(boolean z6) {
    }

    default void setExtendedConfig(CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z6) {
    }
}
