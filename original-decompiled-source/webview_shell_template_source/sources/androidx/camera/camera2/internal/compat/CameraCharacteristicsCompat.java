package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CameraCharacteristicsCompat {
    private final CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;
    private final String mCameraId;
    private final Map<CameraCharacteristics.Key<?>, Object> mValuesCache = new HashMap();
    private StreamConfigurationMapCompat mStreamConfigurationMapCompat = null;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface CameraCharacteristicsCompatImpl {
        <T> T get(CameraCharacteristics.Key<T> key);

        Set<String> getPhysicalCameraIds();

        CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
        this.mCameraId = str;
    }

    private boolean isKeyNonCacheable(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        return new CameraCharacteristicsCompat(cameraCharacteristics, str);
    }

    public <T> T get(CameraCharacteristics.Key<T> key) {
        if (isKeyNonCacheable(key)) {
            return (T) this.mCameraCharacteristicsImpl.get(key);
        }
        synchronized (this) {
            try {
                T t6 = (T) this.mValuesCache.get(key);
                if (t6 != null) {
                    return t6;
                }
                T t7 = (T) this.mCameraCharacteristicsImpl.get(key);
                if (t7 != null) {
                    this.mValuesCache.put(key, t7);
                }
                return t7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    public StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        if (this.mStreamConfigurationMapCompat == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.mStreamConfigurationMapCompat = StreamConfigurationMapCompat.toStreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.mCameraId));
            } catch (AssertionError | NullPointerException e6) {
                throw new IllegalArgumentException(e6.getMessage());
            }
        }
        return this.mStreamConfigurationMapCompat;
    }

    public boolean isZoomOverrideAvailable() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.mCameraCharacteristicsImpl.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i6 : iArr) {
                if (i6 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }
}
