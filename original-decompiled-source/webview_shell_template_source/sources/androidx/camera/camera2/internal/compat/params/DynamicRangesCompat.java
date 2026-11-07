package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.DynamicRange;
import androidx.work.j;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class DynamicRangesCompat {
    private final DynamicRangeProfilesCompatImpl mImpl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface DynamicRangeProfilesCompatImpl {
        Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange);

        Set<DynamicRange> getSupportedDynamicRanges();

        boolean isExtraLatencyPresent(DynamicRange dynamicRange);

        DynamicRangeProfiles unwrap();
    }

    public DynamicRangesCompat(DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        this.mImpl = dynamicRangeProfilesCompatImpl;
    }

    public static DynamicRangesCompat fromCameraCharacteristics(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        DynamicRangesCompat dynamicRangesCompat = Build.VERSION.SDK_INT >= 33 ? toDynamicRangesCompat(d.a(cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return dynamicRangesCompat == null ? DynamicRangesCompatBaseImpl.COMPAT_INSTANCE : dynamicRangesCompat;
    }

    public static DynamicRangesCompat toDynamicRangesCompat(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        j.f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
        return new DynamicRangesCompat(new DynamicRangesCompatApi33Impl(dynamicRangeProfiles));
    }

    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        return this.mImpl.getDynamicRangeCaptureRequestConstraints(dynamicRange);
    }

    public Set<DynamicRange> getSupportedDynamicRanges() {
        return this.mImpl.getSupportedDynamicRanges();
    }

    public boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        return this.mImpl.isExtraLatencyPresent(dynamicRange);
    }

    public DynamicRangeProfiles toDynamicRangeProfiles() {
        j.f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
        return this.mImpl.unwrap();
    }
}
