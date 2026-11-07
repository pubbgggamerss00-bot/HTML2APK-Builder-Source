package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraCaptureSessionCompat {
    private final CameraCaptureSessionCompatImpl mImpl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession unwrap();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final CameraCaptureSession.CaptureCallback mWrappedCallback;

        public CaptureCallbackExecutorWrapper(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureBufferLost$6(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j6) {
            ApiCompat.Api24Impl.onCaptureBufferLost(this.mWrappedCallback, cameraCaptureSession, captureRequest, surface, j6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$2(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureFailed$3(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProgressed$1(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceAborted$5(CameraCaptureSession cameraCaptureSession, int i6) {
            this.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceCompleted$4(CameraCaptureSession cameraCaptureSession, int i6, long j6) {
            this.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession, i6, j6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j7) {
            this.mWrappedCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j7);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j6) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureBufferLost$6(cameraCaptureSession, captureRequest, surface, j6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureCompleted$2(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureFailed$3(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureProgressed$1(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i6) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureSequenceAborted$5(cameraCaptureSession, i6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i6, final long j6) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureSequenceCompleted$4(cameraCaptureSession, i6, j6);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j6, final long j7) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureStarted$0(cameraCaptureSession, captureRequest, j6, j7);
                }
            });
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        private final Executor mExecutor;
        final CameraCaptureSession.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onActive$3(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureQueueEmpty$4(CameraCaptureSession cameraCaptureSession) {
            ApiCompat.Api26Impl.onCaptureQueueEmpty(this.mWrappedCallback, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$5(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigureFailed$1(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$2(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfacePrepared$6(CameraCaptureSession cameraCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.onSurfacePrepared(this.mWrappedCallback, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new k(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new n(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new l(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onConfigureFailed$1(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new o(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new p(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onSurfacePrepared$6(cameraCaptureSession, surface);
                }
            });
        }
    }

    private CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession);
        } else {
            this.mImpl = CameraCaptureSessionCompatBaseImpl.create(cameraCaptureSession, handler);
        }
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new CameraCaptureSessionCompat(cameraCaptureSession, handler);
    }
}
