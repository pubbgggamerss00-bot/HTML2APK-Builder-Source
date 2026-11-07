package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.internal.compat.MediaActionSoundCompat;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface CameraInfo {
    public static final String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";
    public static final float INTRINSIC_ZOOM_RATIO_UNKNOWN = 1.0f;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImplementationType {
    }

    static boolean mustPlayShutterSound() {
        return MediaActionSoundCompat.mustPlayShutterSound();
    }

    CameraSelector getCameraSelector();

    LiveData<CameraState> getCameraState();

    ExposureState getExposureState();

    String getImplementationType();

    default float getIntrinsicZoomRatio() {
        return 1.0f;
    }

    default int getLensFacing() {
        return -1;
    }

    default Set<CameraInfo> getPhysicalCameraInfos() {
        return Collections.EMPTY_SET;
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i6);

    default Set<Range<Integer>> getSupportedFrameRateRanges() {
        return Collections.EMPTY_SET;
    }

    LiveData<Integer> getTorchState();

    LiveData<ZoomState> getZoomState();

    boolean hasFlashUnit();

    default boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        return false;
    }

    default boolean isLogicalMultiCameraSupported() {
        return false;
    }

    default boolean isPrivateReprocessingSupported() {
        return false;
    }

    @ExperimentalZeroShutterLag
    default boolean isZslSupported() {
        return false;
    }

    default Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set) {
        return DynamicRanges.findAllPossibleMatches(set, Collections.singleton(DynamicRange.SDR));
    }
}
