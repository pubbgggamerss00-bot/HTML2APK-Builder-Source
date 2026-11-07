package androidx.camera.core;

import androidx.camera.core.impl.CameraConfig;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface Camera {
    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    CameraConfig getExtendedConfig();

    default boolean isUseCasesCombinationSupported(boolean z6, UseCase... useCaseArr) {
        return true;
    }

    default boolean isUseCasesCombinationSupportedByFramework(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    default boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }
}
