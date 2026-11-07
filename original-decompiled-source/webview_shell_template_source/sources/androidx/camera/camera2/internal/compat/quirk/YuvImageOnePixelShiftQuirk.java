package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class YuvImageOnePixelShiftQuirk implements OnePixelShiftQuirk {
    private static boolean isMotorolaMotoG3() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "MotoG3".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMA920F() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-A920F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMG532F() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G532F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMJ415F() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J415F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isSamsungSMJ700F() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "SM-J700F".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isXiaomiMiA1() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && "Mi A1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isMotorolaMotoG3() || isSamsungSMG532F() || isSamsungSMJ700F() || isSamsungSMA920F() || isSamsungSMJ415F() || isXiaomiMiA1();
    }
}
