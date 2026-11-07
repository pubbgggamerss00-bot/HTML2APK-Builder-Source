package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraValidator {
    private static final CameraSelector EXTERNAL_LENS_FACING = new CameraSelector.Builder().requireLensFacing(2).build();
    private static final String TAG = "CameraValidator";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static int getDeviceId(Context context) {
            return context.getDeviceId();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class CameraIdListIncorrectException extends Exception {
        private int mAvailableCameraCount;

        public CameraIdListIncorrectException(String str, int i6, Throwable th) {
            super(str, th);
            this.mAvailableCameraCount = i6;
        }

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }
    }

    private CameraValidator() {
    }

    public static void validateCameras(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer lensFacing;
        int i6 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && Api34Impl.getDeviceId(context) != 0) {
            LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
            if (cameras.isEmpty()) {
                throw new CameraIdListIncorrectException("No cameras available", 0, null);
            }
            Logger.d(TAG, "Virtual device with ID: " + Api34Impl.getDeviceId(context) + " has " + cameras.size() + " cameras. Skipping validation.");
            return;
        }
        if (cameraSelector != null) {
            try {
                lensFacing = cameraSelector.getLensFacing();
                if (lensFacing == null) {
                    Logger.w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e6) {
                Logger.e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e6);
                return;
            }
        } else {
            lensFacing = null;
        }
        Logger.d(TAG, "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + lensFacing);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || lensFacing.intValue() == 1)) {
                CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
                i6 = 1;
            }
        } catch (IllegalArgumentException e7) {
            illegalArgumentException = e7;
            Logger.w(TAG, "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (cameraSelector == null || lensFacing.intValue() == 0)) {
                CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                i6++;
            }
        } catch (IllegalArgumentException e8) {
            illegalArgumentException = e8;
            Logger.w(TAG, "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            EXTERNAL_LENS_FACING.select(cameraRepository.getCameras());
            Logger.d(TAG, "Found a LENS_FACING_EXTERNAL camera");
            i6++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        Logger.e(TAG, "Camera LensFacing verification failed, existing cameras: " + cameraRepository.getCameras());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i6, illegalArgumentException);
    }
}
