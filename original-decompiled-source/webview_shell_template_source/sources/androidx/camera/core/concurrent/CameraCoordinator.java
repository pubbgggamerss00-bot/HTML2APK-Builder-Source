package androidx.camera.core.concurrent;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraCoordinator {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraOperatingMode {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i6, int i7);
    }

    void addListener(ConcurrentCameraModeListener concurrentCameraModeListener);

    List<CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    List<List<CameraSelector>> getConcurrentCameraSelectors();

    String getPairedConcurrentCameraId(String str);

    void removeListener(ConcurrentCameraModeListener concurrentCameraModeListener);

    void setActiveConcurrentCameraInfos(List<CameraInfo> list);

    void setCameraOperatingMode(int i6);

    void shutdown();
}
