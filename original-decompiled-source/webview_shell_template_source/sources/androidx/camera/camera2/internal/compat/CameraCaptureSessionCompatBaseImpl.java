package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    final CameraCaptureSession mCameraCaptureSession;
    final Object mObject;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class CameraCaptureSessionCompatParamsApi21 {
        final Handler mCompatHandler;

        public CameraCaptureSessionCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(CameraCaptureSession cameraCaptureSession, Object obj) {
        cameraCaptureSession.getClass();
        this.mCameraCaptureSession = cameraCaptureSession;
        this.mObject = obj;
    }

    public static CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new CameraCaptureSessionCompatBaseImpl(cameraCaptureSession, new CameraCaptureSessionCompatParamsApi21(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.captureBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.capture(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl
    public CameraCaptureSession unwrap() {
        return this.mCameraCaptureSession;
    }
}
