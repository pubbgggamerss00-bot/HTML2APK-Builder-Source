package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.work.j;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2CameraInfo {
    private static final String TAG = "Camera2CameraInfo";
    private Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private Camera2PhysicalCameraInfoImpl mCamera2PhysicalCameraInfo;

    public Camera2CameraInfo(Camera2CameraInfoImpl camera2CameraInfoImpl) {
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
    }

    public static CameraCharacteristics extractCameraCharacteristics(CameraInfo cameraInfo) {
        if (cameraInfo instanceof Camera2PhysicalCameraInfoImpl) {
            return ((Camera2PhysicalCameraInfoImpl) cameraInfo).getCameraCharacteristicsCompat().toCameraCharacteristics();
        }
        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
        j.f("CameraInfo does not contain any Camera2 information.", implementation instanceof Camera2CameraInfoImpl);
        return ((Camera2CameraInfoImpl) implementation).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }

    public static Camera2CameraInfo from(CameraInfo cameraInfo) {
        if (cameraInfo instanceof Camera2PhysicalCameraInfoImpl) {
            return ((Camera2PhysicalCameraInfoImpl) cameraInfo).getCamera2CameraInfo();
        }
        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
        j.a("CameraInfo doesn't contain Camera2 implementation.", implementation instanceof Camera2CameraInfoImpl);
        return ((Camera2CameraInfoImpl) implementation).getCamera2CameraInfo();
    }

    public <T> T getCameraCharacteristic(CameraCharacteristics.Key<T> key) {
        Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl = this.mCamera2PhysicalCameraInfo;
        return camera2PhysicalCameraInfoImpl != null ? (T) camera2PhysicalCameraInfoImpl.getCameraCharacteristicsCompat().get(key) : (T) this.mCamera2CameraInfoImpl.getCameraCharacteristicsCompat().get(key);
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        return this.mCamera2PhysicalCameraInfo != null ? Collections.EMPTY_MAP : this.mCamera2CameraInfoImpl.getCameraCharacteristicsMap();
    }

    public String getCameraId() {
        Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl = this.mCamera2PhysicalCameraInfo;
        return camera2PhysicalCameraInfoImpl != null ? camera2PhysicalCameraInfoImpl.getCameraId() : this.mCamera2CameraInfoImpl.getCameraId();
    }

    public Camera2CameraInfo(Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl) {
        this.mCamera2PhysicalCameraInfo = camera2PhysicalCameraInfoImpl;
    }
}
