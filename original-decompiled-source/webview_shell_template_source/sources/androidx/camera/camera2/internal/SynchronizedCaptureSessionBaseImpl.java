package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSession.Opener {
    private static final String TAG = "SyncCaptureSessionBase";
    CameraCaptureSessionCompat mCameraCaptureSessionCompat;
    final CaptureSessionRepository mCaptureSessionRepository;
    SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;
    final Handler mCompatHandler;
    final Executor mExecutor;
    b.a<Void> mOpenCaptureSessionCompleter;
    c5.a<Void> mOpenCaptureSessionFuture;
    private final ScheduledExecutorService mScheduledExecutorService;
    private c5.a<List<Surface>> mStartingSurface;
    final Object mLock = new Object();
    private List<DeferrableSurface> mHeldDeferrableSurfaces = null;
    private boolean mClosed = false;
    private boolean mOpenerDisabled = false;
    private boolean mSessionFinished = false;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Surface getInputSurface(CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCompatHandler = handler;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        onSessionFinished(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$3(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionClosed(this);
        onSessionFinished(synchronizedCaptureSession);
        if (this.mCameraCaptureSessionCompat != null) {
            Objects.requireNonNull(this.mCaptureSessionStateCallback);
            this.mCaptureSessionStateCallback.onClosed(synchronizedCaptureSession);
        } else {
            Logger.w(TAG, "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionFinished$4(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onSessionFinished(synchronizedCaptureSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$openCaptureSession$0(List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, b.a aVar) {
        String str;
        synchronized (this.mLock) {
            holdDeferrableSurfaces(list);
            androidx.work.j.f("The openCaptureSessionCompleter can only set once!", this.mOpenCaptureSessionCompleter == null);
            this.mOpenCaptureSessionCompleter = aVar;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c5.a lambda$startWithDeferrableSurface$1(List list, List list2) {
        Logger.d(TAG, "[" + this + "] getSurface done with results: " + list2);
        return list2.isEmpty() ? Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces")) : list2.contains(null) ? Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null)))) : Futures.immediateFuture(list2);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void abortCaptures() throws CameraAccessException {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        this.mCaptureSessionRepository.onCaptureSessionClosing(this);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().close();
        getExecutor().execute(new d1(1, this));
    }

    public void createCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        if (this.mCameraCaptureSessionCompat == null) {
            this.mCameraCaptureSessionCompat = CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.mCompatHandler);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public SessionConfigurationCompat createSessionConfigurationCompat(int i6, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        this.mCaptureSessionStateCallback = stateCallback;
        return new SessionConfigurationCompat(i6, list, getExecutor(), new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.2
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onActive(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onActive(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onCaptureQueueEmpty(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onClosed(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                b.a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigureFailed(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        androidx.work.j.e("OpenCaptureSession completer should not null", SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter);
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.b(new IllegalStateException("onConfigureFailed"));
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        androidx.work.j.e("OpenCaptureSession completer should not null", SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter);
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        b.a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                b.a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigured(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        androidx.work.j.e("OpenCaptureSession completer should not null", SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter);
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.a(null);
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        androidx.work.j.e("OpenCaptureSession completer should not null", SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter);
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        b.a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.a(null);
                        throw th;
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onReady(synchronizedCaptureSessionBaseImpl);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onSurfacePrepared(synchronizedCaptureSessionBaseImpl, surface);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void finishClose() {
        releaseDeferrableSurfaces();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraDevice getDevice() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat.toCameraCaptureSession().getDevice();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public Surface getInputSurface() {
        this.mCameraCaptureSessionCompat.getClass();
        return Api23Impl.getInputSurface(this.mCameraCaptureSessionCompat.toCameraCaptureSession());
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public c5.a<Void> getOpeningBlocker() {
        return Futures.immediateFuture(null);
    }

    public void holdDeferrableSurfaces(List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            releaseDeferrableSurfaces();
            DeferrableSurfaces.incrementAll(list);
            this.mHeldDeferrableSurfaces = list;
        }
    }

    public boolean isCameraCaptureSessionOpen() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = this.mOpenCaptureSessionFuture != null;
        }
        return z6;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onActive(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onCaptureQueueEmpty(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        c5.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    aVar = null;
                } else {
                    this.mClosed = true;
                    androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mOpenCaptureSessionFuture);
                    aVar = this.mOpenCaptureSessionFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        finishClose();
        if (aVar != null) {
            aVar.addListener(new p(4, this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        finishClose();
        this.mCaptureSessionRepository.onCaptureSessionConfigureFail(this);
        this.mCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionRepository.onCaptureSessionCreated(this);
        this.mCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onReady(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        c5.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                if (this.mSessionFinished) {
                    aVar = null;
                } else {
                    this.mSessionFinished = true;
                    androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mOpenCaptureSessionFuture);
                    aVar = this.mOpenCaptureSessionFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.addListener(new b0(1, this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Objects.requireNonNull(this.mCaptureSessionStateCallback);
        this.mCaptureSessionStateCallback.onSurfacePrepared(synchronizedCaptureSession, surface);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public c5.a<Void> openCaptureSession(CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat, final List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            try {
                if (this.mOpenerDisabled) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                this.mCaptureSessionRepository.onCreateCaptureSession(this);
                final CameraDeviceCompat cameraDeviceCompat = CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.mCompatHandler);
                b.d dVarA = y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.x1
                    @Override // y.b.c
                    public final Object attachCompleter(b.a aVar) {
                        return this.s.lambda$openCaptureSession$0(list, cameraDeviceCompat, sessionConfigurationCompat, aVar);
                    }
                });
                this.mOpenCaptureSessionFuture = dVarA;
                Futures.addCallback(dVarA, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        SynchronizedCaptureSessionBaseImpl.this.finishClose();
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                        synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionConfigureFail(synchronizedCaptureSessionBaseImpl);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r12) {
                    }
                }, CameraXExecutors.directExecutor());
                return Futures.nonCancellationPropagating(this.mOpenCaptureSessionFuture);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseDeferrableSurfaces() {
        synchronized (this.mLock) {
            try {
                List<DeferrableSurface> list = this.mHeldDeferrableSurfaces;
                if (list != null) {
                    DeferrableSurfaces.decrementAll(list);
                    this.mHeldDeferrableSurfaces = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public c5.a<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j6) {
        synchronized (this.mLock) {
            try {
                if (this.mOpenerDisabled) {
                    return Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                }
                FutureChain futureChainTransformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(list, false, j6, getExecutor(), this.mScheduledExecutorService)).transformAsync(new r(2, this, list), getExecutor());
                this.mStartingSurface = futureChainTransformAsync;
                return Futures.nonCancellationPropagating(futureChainTransformAsync);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public boolean stop() {
        boolean z6;
        try {
            synchronized (this.mLock) {
                try {
                    if (!this.mOpenerDisabled) {
                        c5.a<List<Surface>> aVar = this.mStartingSurface;
                        aVar = aVar != null ? aVar : null;
                        this.mOpenerDisabled = true;
                    }
                    z6 = !isCameraCaptureSessionOpen();
                } finally {
                }
            }
            return z6;
        } finally {
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void stopRepeating() throws CameraAccessException {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.work.j.e("Need to call openCaptureSession before using this API.", this.mCameraCaptureSessionCompat);
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void onCameraDeviceError(int i6) {
    }
}
