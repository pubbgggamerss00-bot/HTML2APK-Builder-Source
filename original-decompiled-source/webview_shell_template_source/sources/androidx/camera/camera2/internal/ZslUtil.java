package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ZslUtil {
    private ZslUtil() {
    }

    public static boolean isCapabilitySupported(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i6) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
        }
        return false;
    }
}
