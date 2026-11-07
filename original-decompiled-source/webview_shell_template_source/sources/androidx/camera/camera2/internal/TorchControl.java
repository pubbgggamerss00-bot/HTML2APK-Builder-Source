package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    private static final String TAG = "TorchControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    b.a<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    boolean mTargetTorchEnabled;
    private final androidx.lifecycle.r<Integer> mTorchState;

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new e0(cameraCharacteristicsCompat));
        this.mTorchState = new androidx.lifecycle.r<>(0);
        camera2CameraControlImpl.addCaptureResultListener(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.z1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return this.f484a.lambda$new$0(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$enableTorch$2(boolean z6, b.a aVar) {
        this.mExecutor.execute(new j1(this, aVar, z6));
        return "enableTorch: " + z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(TotalCaptureResult totalCaptureResult) {
        if (this.mEnableTorchCompleter != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.mTargetTorchEnabled) {
                this.mEnableTorchCompleter.a(null);
                this.mEnableTorchCompleter = null;
            }
        }
        return false;
    }

    private <T> void setLiveDataValue(androidx.lifecycle.r<T> rVar, T t6) {
        if (Threads.isMainThread()) {
            rVar.setValue(t6);
        } else {
            rVar.postValue(t6);
        }
    }

    public c5.a<Void> enableTorch(boolean z6) {
        if (this.mHasFlashUnit) {
            setLiveDataValue(this.mTorchState, Integer.valueOf(z6 ? 1 : 0));
            return y.b.a(new i1(this, z6, 1));
        }
        Logger.d(TAG, "Unable to enableTorch due to there is no flash unit.");
        return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
    }

    /* renamed from: enableTorchInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$enableTorch$1(b.a<Void> aVar, boolean z6) {
        if (!this.mHasFlashUnit) {
            if (aVar != null) {
                aVar.b(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.mIsActive) {
                setLiveDataValue(this.mTorchState, 0);
                if (aVar != null) {
                    aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.mTargetTorchEnabled = z6;
            this.mCamera2CameraControlImpl.enableTorchInternal(z6);
            setLiveDataValue(this.mTorchState, Integer.valueOf(z6 ? 1 : 0));
            b.a<Void> aVar2 = this.mEnableTorchCompleter;
            if (aVar2 != null) {
                aVar2.b(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.mEnableTorchCompleter = aVar;
        }
    }

    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    public void setActive(boolean z6) {
        if (this.mIsActive == z6) {
            return;
        }
        this.mIsActive = z6;
        if (z6) {
            return;
        }
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            this.mCamera2CameraControlImpl.enableTorchInternal(false);
            setLiveDataValue(this.mTorchState, 0);
        }
        b.a<Void> aVar = this.mEnableTorchCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableTorchCompleter = null;
        }
    }
}
