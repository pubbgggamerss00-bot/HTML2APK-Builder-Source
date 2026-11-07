package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;
    private final CameraAccessException mCameraAccessException;
    private final int mReason;
    static final Set<Integer> PLATFORM_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;
    static final Set<Integer> COMPAT_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(CAMERA_UNAVAILABLE_DO_NOT_DISTURB), Integer.valueOf(CAMERA_CHARACTERISTICS_CREATION_ERROR))));

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(int i6) {
        super(getDefaultMessage(i6));
        this.mReason = i6;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6) : null;
    }

    private static String getCombinedMessage(int i6, String str) {
        return String.format("%s (%d): %s", getProblemString(i6), Integer.valueOf(i6), str);
    }

    private static String getDefaultMessage(int i6) {
        if (i6 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i6 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i6 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i6 == 4) {
            return "The camera device is in use already";
        }
        if (i6 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i6 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i6 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    private static String getProblemString(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? i6 != 1000 ? i6 != 10001 ? i6 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    public static CameraAccessExceptionCompat toCameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.mReason;
    }

    public CameraAccessException toCameraAccessException() {
        return this.mCameraAccessException;
    }

    public CameraAccessExceptionCompat(int i6, String str) {
        super(getCombinedMessage(i6, str));
        this.mReason = i6;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6, str) : null;
    }

    public CameraAccessExceptionCompat(int i6, String str, Throwable th) {
        super(getCombinedMessage(i6, str), th);
        this.mReason = i6;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6, str, th) : null;
    }

    public CameraAccessExceptionCompat(int i6, Throwable th) {
        super(getDefaultMessage(i6), th);
        this.mReason = i6;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i6)) ? new CameraAccessException(i6, null, th) : null;
    }

    private CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
