package androidx.camera.core.internal.compat;

import android.hardware.Camera;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class MediaActionSoundCompatBaseImpl {
    private static final int SAMPLE_CAMERA_ID = 0;

    private MediaActionSoundCompatBaseImpl() {
    }

    public static boolean mustPlayShutterSound() {
        if (Camera.getNumberOfCameras() < 1) {
            return false;
        }
        try {
            Camera.getCameraInfo(0, new Camera.CameraInfo());
            return !r0.canDisableShutterSound;
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
