package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface SynchronizedCaptureSession {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface Opener {
        SessionConfigurationCompat createSessionConfigurationCompat(int i6, List<OutputConfigurationCompat> list, StateCallback stateCallback);

        Executor getExecutor();

        c5.a<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list);

        c5.a<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j6);

        boolean stop();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class OpenerBuilder {
        private final Quirks mCameraQuirks;
        private final CaptureSessionRepository mCaptureSessionRepository;
        private final Handler mCompatHandler;
        private final Quirks mDeviceQuirks;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduledExecutorService;

        public OpenerBuilder(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, CaptureSessionRepository captureSessionRepository, Quirks quirks, Quirks quirks2) {
            this.mExecutor = executor;
            this.mScheduledExecutorService = scheduledExecutorService;
            this.mCompatHandler = handler;
            this.mCaptureSessionRepository = captureSessionRepository;
            this.mCameraQuirks = quirks;
            this.mDeviceQuirks = quirks2;
        }

        public Opener build() {
            return new SynchronizedCaptureSessionImpl(this.mCameraQuirks, this.mDeviceQuirks, this.mCaptureSessionRepository, this.mExecutor, this.mScheduledExecutorService, this.mCompatHandler);
        }
    }

    void abortCaptures();

    int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    void finishClose();

    CameraDevice getDevice();

    Surface getInputSurface();

    c5.a<Void> getOpeningBlocker();

    StateCallback getStateCallback();

    void onCameraDeviceError(int i6);

    int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void stopRepeating();

    CameraCaptureSessionCompat toCameraCaptureSessionCompat();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class StateCallback {
        public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }
}
