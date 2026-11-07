package androidx.camera.core;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraProvider {
    List<CameraInfo> getAvailableCameraInfos();

    @ExperimentalCameraInfo
    default CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        throw new UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    boolean hasCamera(CameraSelector cameraSelector);
}
