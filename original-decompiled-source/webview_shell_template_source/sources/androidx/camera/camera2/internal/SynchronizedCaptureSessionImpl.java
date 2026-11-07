package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private static final String TAG = "SyncCaptureSessionImpl";
    private final ForceCloseDeferrableSurface mCloseSurfaceQuirk;
    private final AtomicBoolean mClosed;
    private List<DeferrableSurface> mDeferrableSurfaces;
    private final ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final Object mObjectLock;
    c5.a<List<Void>> mOpenSessionBlockerFuture;
    private final RequestMonitor mRequestMonitor;
    private final ScheduledExecutorService mScheduledExecutorService;
    private final SessionResetPolicy mSessionResetPolicy;

    public SynchronizedCaptureSessionImpl(Quirks quirks, Quirks quirks2, CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mObjectLock = new Object();
        this.mClosed = new AtomicBoolean(false);
        this.mCloseSurfaceQuirk = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureSessionStuckQuirk.class) || quirks.contains(IncorrectCaptureStateQuirk.class));
        this.mForceCloseSessionQuirk = new ForceCloseCaptureSession(quirks2);
        this.mSessionResetPolicy = new SessionResetPolicy(quirks2);
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    private void closeCreatedSession() {
        Iterator<SynchronizedCaptureSession> it = this.mCaptureSessionRepository.getCaptureSessions().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        debugLog("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigured$1(SynchronizedCaptureSession synchronizedCaptureSession) {
        super.onConfigured(synchronizedCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c5.a lambda$openCaptureSession$0(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list, List list2) {
        if (this.mSessionResetPolicy.needAbortCapture()) {
            closeCreatedSession();
        }
        debugLog("start openCaptureSession");
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.captureBurstRequests(list, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        if (!this.mClosed.compareAndSet(false, true)) {
            debugLog("close() has been called. Skip this invocation.");
            return;
        }
        if (this.mSessionResetPolicy.needAbortCapture()) {
            try {
                debugLog("Call abortCaptures() before closing session.");
                abortCaptures();
            } catch (Exception e6) {
                debugLog("Exception when calling abortCaptures()" + e6);
            }
        }
        debugLog("Session call close()");
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new d0(1, this), getExecutor());
    }

    public void debugLog(String str) {
        Logger.d(TAG, "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        super.finishClose();
        this.mRequestMonitor.stop();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public c5.a<Void> getOpeningBlocker() {
        return Futures.makeTimeoutFuture(1500L, this.mScheduledExecutorService, this.mRequestMonitor.getRequestsProcessedFuture());
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i6) {
        super.onCameraDeviceError(i6);
        if (i6 == 5) {
            synchronized (this.mObjectLock) {
                try {
                    if (isCameraCaptureSessionOpen() && this.mDeferrableSurfaces != null) {
                        debugLog("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<DeferrableSurface> it = this.mDeferrableSurfaces.iterator();
                        while (it.hasNext()) {
                            it.next().close();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mObjectLock) {
            this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
        }
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        debugLog("Session onConfigured()");
        this.mForceCloseSessionQuirk.onSessionConfigured(synchronizedCaptureSession, this.mCaptureSessionRepository.getCreatingCaptureSessions(), this.mCaptureSessionRepository.getCaptureSessions(), new o0(4, this));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public c5.a<Void> openCaptureSession(final CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat, final List<DeferrableSurface> list) {
        c5.a<Void> aVarNonCancellationPropagating;
        synchronized (this.mObjectLock) {
            try {
                List<SynchronizedCaptureSession> captureSessions = this.mCaptureSessionRepository.getCaptureSessions();
                ArrayList arrayList = new ArrayList();
                Iterator<SynchronizedCaptureSession> it = captureSessions.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getOpeningBlocker());
                }
                c5.a<List<Void>> aVarSuccessfulAsList = Futures.successfulAsList(arrayList);
                this.mOpenSessionBlockerFuture = aVarSuccessfulAsList;
                aVarNonCancellationPropagating = Futures.nonCancellationPropagating(FutureChain.from(aVarSuccessfulAsList).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.y1
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final c5.a apply(Object obj) {
                        return this.s.lambda$openCaptureSession$0(cameraDevice, sessionConfigurationCompat, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarNonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, this.mRequestMonitor.createMonitorListener(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public c5.a<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j6) {
        c5.a<List<Surface>> aVarStartWithDeferrableSurface;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            aVarStartWithDeferrableSurface = super.startWithDeferrableSurface(list, j6);
        }
        return aVarStartWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean zStop;
        synchronized (this.mObjectLock) {
            try {
                if (isCameraCaptureSessionOpen()) {
                    this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
                } else {
                    c5.a<List<Void>> aVar = this.mOpenSessionBlockerFuture;
                    if (aVar != null) {
                        aVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
