package androidx.camera.core.impl.utils;

import androidx.camera.camera2.internal.compat.workaround.c;
import androidx.camera.camera2.internal.g0;
import androidx.camera.core.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 90) {
            return 1;
        }
        if (i6 == 180) {
            return 2;
        }
        if (i6 == 270) {
            return 3;
        }
        throw new IllegalStateException(c.d(i6, "Invalid sensor rotation: "));
    }

    public static int getRelativeImageRotation(int i6, int i7, boolean z6) {
        int i8 = z6 ? ((i7 - i6) + 360) % 360 : (i7 + i6) % 360;
        if (Logger.isVerboseEnabled(TAG)) {
            StringBuilder sbA = g0.a("getRelativeImageRotation: destRotationDegrees=", i6, ", sourceRotationDegrees=", i7, ", isOppositeFacing=");
            sbA.append(z6);
            sbA.append(", result=");
            sbA.append(i8);
            Logger.d(TAG, sbA.toString());
        }
        return i8;
    }

    public static int surfaceRotationToDegrees(int i6) {
        if (i6 == 0) {
            return 0;
        }
        if (i6 == 1) {
            return 90;
        }
        if (i6 == 2) {
            return 180;
        }
        if (i6 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(c.d(i6, "Unsupported surface rotation: "));
    }
}
