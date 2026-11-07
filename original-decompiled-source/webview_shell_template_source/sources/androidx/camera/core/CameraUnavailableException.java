package androidx.camera.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class CameraUnavailableException extends Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    public CameraUnavailableException(int i6) {
        this.mReason = i6;
    }

    public int getReason() {
        return this.mReason;
    }

    public CameraUnavailableException(int i6, String str) {
        super(str);
        this.mReason = i6;
    }

    public CameraUnavailableException(int i6, String str, Throwable th) {
        super(str, th);
        this.mReason = i6;
    }

    public CameraUnavailableException(int i6, Throwable th) {
        super(th);
        this.mReason = i6;
    }
}
