package androidx.camera.camera2.internal.compat.quirk;

import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class AspectRatioLegacyApi21Quirk implements Quirk {
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return false;
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
