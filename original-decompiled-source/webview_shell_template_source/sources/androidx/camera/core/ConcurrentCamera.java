package androidx.camera.core;

import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ConcurrentCamera {
    private List<Camera> mCameras;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class SingleCameraConfig {
        private CameraSelector mCameraSelector;
        private LayoutSettings mLayoutSettings;
        private androidx.lifecycle.m mLifecycleOwner;
        private UseCaseGroup mUseCaseGroup;

        public SingleCameraConfig(CameraSelector cameraSelector, UseCaseGroup useCaseGroup, androidx.lifecycle.m mVar) {
            this(cameraSelector, useCaseGroup, LayoutSettings.DEFAULT, mVar);
        }

        public CameraSelector getCameraSelector() {
            return this.mCameraSelector;
        }

        public LayoutSettings getLayoutSettings() {
            return this.mLayoutSettings;
        }

        public androidx.lifecycle.m getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        public UseCaseGroup getUseCaseGroup() {
            return this.mUseCaseGroup;
        }

        public SingleCameraConfig(CameraSelector cameraSelector, UseCaseGroup useCaseGroup, LayoutSettings layoutSettings, androidx.lifecycle.m mVar) {
            this.mCameraSelector = cameraSelector;
            this.mUseCaseGroup = useCaseGroup;
            this.mLayoutSettings = layoutSettings;
            this.mLifecycleOwner = mVar;
        }
    }

    public ConcurrentCamera(List<Camera> list) {
        this.mCameras = list;
    }

    public List<Camera> getCameras() {
        return this.mCameras;
    }
}
