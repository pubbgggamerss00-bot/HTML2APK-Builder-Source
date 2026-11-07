package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements Quirk {
    private static final String TAG = "CamcorderProfileResolutionQuirk";
    private final StreamConfigurationMapCompat mStreamConfigurationMapCompat;
    private List<Size> mSupportedResolutions = null;

    public CamcorderProfileResolutionQuirk(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mStreamConfigurationMapCompat = cameraCharacteristicsCompat.getStreamConfigurationMapCompat();
    }

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> getSupportedResolutions() {
        if (this.mSupportedResolutions == null) {
            Size[] outputSizes = this.mStreamConfigurationMapCompat.getOutputSizes(34);
            this.mSupportedResolutions = outputSizes != null ? Arrays.asList((Size[]) outputSizes.clone()) : Collections.EMPTY_LIST;
            Logger.d(TAG, "mSupportedResolutions = " + this.mSupportedResolutions);
        }
        return new ArrayList(this.mSupportedResolutions);
    }
}
