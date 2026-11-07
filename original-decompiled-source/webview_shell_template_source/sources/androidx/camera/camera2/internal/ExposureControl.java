package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ExposureControl {
    private static final int DEFAULT_EXPOSURE_COMPENSATION = 0;
    private final Camera2CameraControlImpl mCameraControl;
    private final Executor mExecutor;
    private final ExposureStateImpl mExposureStateImpl;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mRunningCaptureResultListener;
    private b.a<Integer> mRunningCompleter;

    public ExposureControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCameraControl = camera2CameraControlImpl;
        this.mExposureStateImpl = new ExposureStateImpl(cameraCharacteristicsCompat, 0);
        this.mExecutor = executor;
    }

    private void clearRunningTask() {
        b.a<Integer> aVar = this.mRunningCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.mRunningCompleter = null;
        }
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = this.mRunningCaptureResultListener;
        if (captureResultListener != null) {
            this.mCameraControl.removeCaptureResultListener(captureResultListener);
            this.mRunningCaptureResultListener = null;
        }
    }

    public static ExposureState getDefaultExposureState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return new ExposureStateImpl(cameraCharacteristicsCompat, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setExposureCompensationIndex$0(int i6, b.a aVar, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != i6) {
                return false;
            }
            aVar.a(Integer.valueOf(i6));
            return true;
        }
        int iIntValue = num.intValue();
        if ((iIntValue != 2 && iIntValue != 3 && iIntValue != 4) || num2.intValue() != i6) {
            return false;
        }
        aVar.a(Integer.valueOf(i6));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setExposureCompensationIndex$1(final b.a aVar, final int i6) {
        if (!this.mIsActive) {
            this.mExposureStateImpl.setExposureCompensationIndex(0);
            aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        clearRunningTask();
        androidx.work.j.f("mRunningCompleter should be null when starting set a new exposure compensation value", this.mRunningCompleter == null);
        androidx.work.j.f("mRunningCaptureResultListener should be null when starting set a new exposure compensation value", this.mRunningCaptureResultListener == null);
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.f1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return ExposureControl.lambda$setExposureCompensationIndex$0(i6, aVar, totalCaptureResult);
            }
        };
        this.mRunningCaptureResultListener = captureResultListener;
        this.mRunningCompleter = aVar;
        this.mCameraControl.addCaptureResultListener(captureResultListener);
        this.mCameraControl.updateSessionConfigSynchronous();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$setExposureCompensationIndex$2(int i6, b.a aVar) {
        this.mExecutor.execute(new k(i6, this, aVar));
        return p0.a(new StringBuilder("setExposureCompensationIndex["), i6, "]");
    }

    public ExposureState getExposureState() {
        return this.mExposureStateImpl;
    }

    public void setActive(boolean z6) {
        if (z6 == this.mIsActive) {
            return;
        }
        this.mIsActive = z6;
        if (z6) {
            return;
        }
        this.mExposureStateImpl.setExposureCompensationIndex(0);
        clearRunningTask();
    }

    public void setCaptureRequestOption(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.mExposureStateImpl.getExposureCompensationIndex()), Config.OptionPriority.REQUIRED);
    }

    public c5.a<Integer> setExposureCompensationIndex(final int i6) {
        if (!this.mExposureStateImpl.isExposureCompensationSupported()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range<Integer> exposureCompensationRange = this.mExposureStateImpl.getExposureCompensationRange();
        if (exposureCompensationRange.contains((Range<Integer>) Integer.valueOf(i6))) {
            this.mExposureStateImpl.setExposureCompensationIndex(i6);
            return Futures.nonCancellationPropagating(y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.g1
                @Override // y.b.c
                public final Object attachCompleter(b.a aVar) {
                    return this.s.lambda$setExposureCompensationIndex$2(i6, aVar);
                }
            }));
        }
        return Futures.immediateFailedFuture(new IllegalArgumentException("Requested ExposureCompensation " + i6 + " is not within valid range [" + exposureCompensationRange.getUpper() + ".." + exposureCompensationRange.getLower() + "]"));
    }
}
