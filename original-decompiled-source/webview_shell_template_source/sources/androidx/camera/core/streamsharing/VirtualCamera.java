package androidx.camera.core.streamsharing;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.streamsharing.StreamSharing;
import java.util.Collection;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class VirtualCamera implements CameraInternal {
    private static final String UNSUPPORTED_MESSAGE = "Operation not supported by VirtualCamera.";
    private final CameraInternal mParentCamera;
    private final UseCase.StateChangeCallback mStateChangeCallback;
    private final VirtualCameraControl mVirtualCameraControl;
    private final VirtualCameraInfo mVirtualCameraInfo;

    public VirtualCamera(CameraInternal cameraInternal, UseCase.StateChangeCallback stateChangeCallback, StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mStateChangeCallback = stateChangeCallback;
        this.mVirtualCameraControl = new VirtualCameraControl(cameraInternal.getCameraControlInternal(), control);
        this.mVirtualCameraInfo = new VirtualCameraInfo(cameraInternal.getCameraInfoInternal());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection<UseCase> collection) {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection<UseCase> collection) {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.mVirtualCameraControl;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.mVirtualCameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable<CameraInternal.State> getCameraState() {
        return this.mParentCamera.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        this.mStateChangeCallback.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public c5.a<Void> release() {
        throw new UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    public void setRotationDegrees(int i6) {
        this.mVirtualCameraInfo.setVirtualCameraRotationDegrees(i6);
    }
}
