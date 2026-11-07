package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    public CameraManagerCompatApi28Impl(Context context) {
        super(context, null);
    }

    public static CameraManagerCompatApi28Impl create(Context context) {
        return new CameraManagerCompatApi28Impl(context);
    }

    private boolean isDndFailCase(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && isDndRuntimeException(th);
    }

    private static boolean isDndRuntimeException(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void throwDndException(Throwable th) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB, th);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws CameraAccessExceptionCompat {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e6) {
            if (isDndFailCase(e6)) {
                throwDndException(e6);
            }
            throw e6;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            this.mCameraManager.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e6) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e6);
        } catch (IllegalArgumentException e7) {
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (isDndFailCase(e9)) {
                throwDndException(e9);
            }
            throw e9;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallback);
    }
}
