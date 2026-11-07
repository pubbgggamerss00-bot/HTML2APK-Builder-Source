package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraUnavailableExceptionHelper {
    private CameraUnavailableExceptionHelper() {
    }

    public static CameraUnavailableException createFrom(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i6 = 1;
        if (reason != 1) {
            i6 = 2;
            if (reason != 2) {
                i6 = 3;
                if (reason != 3) {
                    i6 = 4;
                    if (reason != 4) {
                        i6 = 5;
                        if (reason != 5) {
                            i6 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i6, cameraAccessExceptionCompat);
    }
}
