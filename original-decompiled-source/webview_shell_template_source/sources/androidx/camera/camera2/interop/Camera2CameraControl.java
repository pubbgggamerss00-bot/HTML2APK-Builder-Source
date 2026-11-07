package androidx.camera.camera2.interop;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.work.j;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2CameraControl {
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    b.a<Void> mCompleter;
    final Executor mExecutor;
    private boolean mIsActive = false;
    private boolean mPendingUpdate = false;
    final Object mLock = new Object();
    private Camera2ImplConfig.Builder mBuilder = new Camera2ImplConfig.Builder();

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    private void addCaptureRequestOptionsInternal(CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            this.mBuilder.insertAllOptions(captureRequestOptions);
        }
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new Camera2ImplConfig.Builder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeInFlightUpdate() {
        b.a<Void> aVar = this.mCompleter;
        if (aVar != null) {
            aVar.a(null);
            this.mCompleter = null;
        }
    }

    private void failInFlightUpdate(Exception exc) {
        b.a<Void> aVar = this.mCompleter;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.b(exc);
            this.mCompleter = null;
        }
    }

    public static Camera2CameraControl from(CameraControl cameraControl) {
        CameraControlInternal implementation = ((CameraControlInternal) cameraControl).getImplementation();
        j.a("CameraControl doesn't contain Camera2 implementation.", implementation instanceof Camera2CameraControlImpl);
        return ((Camera2CameraControlImpl) implementation).getCamera2CameraControl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$addCaptureRequestOptions$3(b.a aVar) {
        this.mExecutor.execute(new a(this, aVar, 1));
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$clearCaptureRequestOptions$5(b.a aVar) {
        this.mExecutor.execute(new a(this, aVar, 0));
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setCaptureRequestOptions$1(b.a aVar) {
        this.mExecutor.execute(new d(0, this, aVar));
        return "setCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setActiveInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$setActive$6(boolean z6) {
        if (this.mIsActive == z6) {
            return;
        }
        this.mIsActive = z6;
        if (!z6) {
            failInFlightUpdate(new CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.mPendingUpdate) {
            updateSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateConfig, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setCaptureRequestOptions$0(b.a<Void> aVar) {
        this.mPendingUpdate = true;
        failInFlightUpdate(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.mCompleter = aVar;
        if (this.mIsActive) {
            updateSession();
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfigAsync().addListener(new c(0, this), this.mExecutor);
        this.mPendingUpdate = false;
    }

    public c5.a<Void> addCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(y.b.a(new b(this)));
    }

    public void applyOptionsToBuilder(Camera2ImplConfig.Builder builder) {
        synchronized (this.mLock) {
            builder.insertAllOptions(this.mBuilder.getMutableConfig(), Config.OptionPriority.ALWAYS_OVERRIDE);
        }
    }

    public c5.a<Void> clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return Futures.nonCancellationPropagating(y.b.a(new g(0, this)));
    }

    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig camera2ImplConfigBuild;
        synchronized (this.mLock) {
            camera2ImplConfigBuild = this.mBuilder.build();
        }
        return camera2ImplConfigBuild;
    }

    public CaptureRequestOptions getCaptureRequestOptions() {
        CaptureRequestOptions captureRequestOptionsBuild;
        synchronized (this.mLock) {
            captureRequestOptionsBuild = CaptureRequestOptions.Builder.from(this.mBuilder.build()).build();
        }
        return captureRequestOptionsBuild;
    }

    public void setActive(final boolean z6) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.interop.e
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$setActive$6(z6);
            }
        });
    }

    public c5.a<Void> setCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        clearCaptureRequestOptionsInternal();
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(y.b.a(new f(0, this)));
    }
}
