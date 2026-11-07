package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class FocusMeteringControl {
    static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;
    private static final MeteringRectangle[] EMPTY_RECTANGLES = new MeteringRectangle[0];
    private static final String TAG = "FocusMeteringControl";
    private MeteringRectangle[] mAeRects;
    private MeteringRectangle[] mAfRects;
    private ScheduledFuture<?> mAutoCancelHandle;
    private ScheduledFuture<?> mAutoFocusTimeoutHandle;
    private MeteringRectangle[] mAwbRects;
    private final Camera2CameraControlImpl mCameraControl;
    final Executor mExecutor;
    private boolean mIsExternalFlashAeModeEnabled;
    private final MeteringRegionCorrection mMeteringRegionCorrection;
    b.a<FocusMeteringResult> mRunningActionCompleter;
    b.a<Void> mRunningCancelCompleter;
    private final ScheduledExecutorService mScheduler;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForAeMode;
    private volatile boolean mIsActive = false;
    private volatile Rational mPreviewAspectRatio = null;
    private boolean mIsInAfAutoMode = false;
    Integer mCurrentAfState = 0;
    long mFocusTimeoutCounter = 0;
    boolean mIsAutoFocusCompleted = false;
    boolean mIsFocusSuccessful = false;
    private int mTemplate = 1;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForFocus = null;
    private Camera2CameraControlImpl.CaptureResultListener mSessionListenerForCancel = null;

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mRunningActionCompleter = null;
        this.mRunningCancelCompleter = null;
        this.mIsExternalFlashAeModeEnabled = false;
        this.mSessionListenerForAeMode = null;
        this.mCameraControl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mMeteringRegionCorrection = new MeteringRegionCorrection(quirks);
    }

    private void clearAutoFocusTimeoutHandle() {
        ScheduledFuture<?> scheduledFuture = this.mAutoFocusTimeoutHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoFocusTimeoutHandle = null;
        }
    }

    private void completeCancelFuture() {
        b.a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.a(null);
            this.mRunningCancelCompleter = null;
        }
    }

    private void disableAutoCancel() {
        ScheduledFuture<?> scheduledFuture = this.mAutoCancelHandle;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mAutoCancelHandle = null;
        }
    }

    private void executeMeteringAction(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, FocusMeteringAction focusMeteringAction, long j6) {
        final long jUpdateSessionConfigSynchronous;
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr2;
        this.mAwbRects = meteringRectangleArr3;
        if (shouldTriggerAF()) {
            this.mIsInAfAutoMode = true;
            this.mIsAutoFocusCompleted = false;
            this.mIsFocusSuccessful = false;
            jUpdateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            triggerAf(null, true);
        } else {
            this.mIsInAfAutoMode = false;
            this.mIsAutoFocusCompleted = true;
            this.mIsFocusSuccessful = false;
            jUpdateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        }
        this.mCurrentAfState = 0;
        final boolean zIsAfModeSupported = isAfModeSupported();
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.p1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return this.f449a.lambda$executeMeteringAction$7(zIsAfModeSupported, jUpdateSessionConfigSynchronous, totalCaptureResult);
            }
        };
        this.mSessionListenerForFocus = captureResultListener;
        this.mCameraControl.addCaptureResultListener(captureResultListener);
        final long j7 = this.mFocusTimeoutCounter + 1;
        this.mFocusTimeoutCounter = j7;
        Runnable runnable = new Runnable() { // from class: androidx.camera.camera2.internal.q1
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$executeMeteringAction$9(j7);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.mScheduler;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.mAutoFocusTimeoutHandle = scheduledExecutorService.schedule(runnable, j6, timeUnit);
        if (focusMeteringAction.isAutoCancelEnabled()) {
            this.mAutoCancelHandle = this.mScheduler.schedule(new h1(1, j7, this), focusMeteringAction.getAutoCancelDurationInMillis(), timeUnit);
        }
    }

    private void failActionFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForFocus);
        b.a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException(str));
            this.mRunningActionCompleter = null;
        }
    }

    private void failCancelFuture(String str) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForCancel);
        b.a<Void> aVar = this.mRunningCancelCompleter;
        if (aVar != null) {
            aVar.b(new CameraControl.OperationCanceledException(str));
            this.mRunningCancelCompleter = null;
        }
    }

    private Rational getDefaultAspectRatio() {
        if (this.mPreviewAspectRatio != null) {
            return this.mPreviewAspectRatio;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        return new Rational(cropSensorRegion.width(), cropSensorRegion.height());
    }

    private static PointF getFovAdjustedPoint(MeteringPoint meteringPoint, Rational rational, Rational rational2, int i6, MeteringRegionCorrection meteringRegionCorrection) {
        if (meteringPoint.getSurfaceAspectRatio() != null) {
            rational2 = meteringPoint.getSurfaceAspectRatio();
        }
        PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, i6);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                correctedPoint.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + correctedPoint.y);
                return correctedPoint;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            correctedPoint.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + correctedPoint.x);
        }
        return correctedPoint;
    }

    private static MeteringRectangle getMeteringRect(MeteringPoint meteringPoint, PointF pointF, Rect rect) {
        int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
        int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
        int size = ((int) (meteringPoint.getSize() * rect.width())) / 2;
        int size2 = ((int) (meteringPoint.getSize() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - size, iHeight - size2, iWidth + size, iHeight + size2);
        rect2.left = rangeLimit(rect2.left, rect.right, rect.left);
        rect2.right = rangeLimit(rect2.right, rect.right, rect.left);
        rect2.top = rangeLimit(rect2.top, rect.bottom, rect.top);
        rect2.bottom = rangeLimit(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
    }

    private List<MeteringRectangle> getMeteringRectangles(List<MeteringPoint> list, int i6, Rational rational, Rect rect, int i7) {
        if (list.isEmpty() || i6 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (MeteringPoint meteringPoint : list) {
            if (arrayList.size() == i6) {
                break;
            }
            if (isValid(meteringPoint)) {
                MeteringRectangle meteringRect = getMeteringRect(meteringPoint, getFovAdjustedPoint(meteringPoint, rational2, rational, i7, this.mMeteringRegionCorrection), rect);
                if (meteringRect.getWidth() != 0 && meteringRect.getHeight() != 0) {
                    arrayList.add(meteringRect);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private boolean isAfModeSupported() {
        return this.mCameraControl.getSupportedAfMode(1) == 1;
    }

    private static boolean isValid(MeteringPoint meteringPoint) {
        return meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$cancelFocusAndMetering$13(b.a aVar) {
        this.mExecutor.execute(new m(3, this, aVar));
        return "cancelFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$cancelFocusAndMeteringInternal$14(int i6, long j6, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i6 || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j6)) {
            return false;
        }
        completeCancelFuture();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableExternalFlashAeMode$4(boolean z6, b.a aVar) {
        this.mCameraControl.removeCaptureResultListener(this.mSessionListenerForAeMode);
        this.mIsExternalFlashAeModeEnabled = z6;
        enableExternalFlashAeMode((b.a<Void>) aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$enableExternalFlashAeMode$5(boolean z6, b.a aVar) {
        this.mExecutor.execute(new j1(this, z6, aVar));
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$enableExternalFlashAeMode$6(long j6, b.a aVar, TotalCaptureResult totalCaptureResult) {
        boolean z6 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        Logger.d(TAG, "enableExternalFlashAeMode: isAeModeExternalFlash = " + z6);
        if (z6 != this.mIsExternalFlashAeModeEnabled || !Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j6)) {
            return false;
        }
        Logger.d(TAG, "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z6);
        if (aVar != null) {
            aVar.a(null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$10(long j6) {
        if (j6 == this.mFocusTimeoutCounter) {
            cancelFocusAndMeteringWithoutAsyncResult();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$11(long j6) {
        this.mExecutor.execute(new h1(0, j6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$executeMeteringAction$7(boolean z6, long j6, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (shouldTriggerAF()) {
            if (!z6 || num == null) {
                this.mIsFocusSuccessful = true;
                this.mIsAutoFocusCompleted = true;
            } else if (this.mCurrentAfState.intValue() == 3) {
                if (num.intValue() == 4) {
                    this.mIsFocusSuccessful = true;
                    this.mIsAutoFocusCompleted = true;
                } else if (num.intValue() == 5) {
                    this.mIsFocusSuccessful = false;
                    this.mIsAutoFocusCompleted = true;
                }
            }
        }
        if (this.mIsAutoFocusCompleted && Camera2CameraControlImpl.isSessionUpdated(totalCaptureResult, j6)) {
            completeActionFuture(this.mIsFocusSuccessful);
            return true;
        }
        if (!this.mCurrentAfState.equals(num) && num != null) {
            this.mCurrentAfState = num;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$8(long j6) {
        if (j6 == this.mFocusTimeoutCounter) {
            this.mIsFocusSuccessful = false;
            completeActionFuture(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeMeteringAction$9(final long j6) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$executeMeteringAction$8(j6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$startFocusAndMetering$1(final FocusMeteringAction focusMeteringAction, final long j6, final b.a aVar) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.lambda$startFocusAndMetering$0(aVar, focusMeteringAction, j6);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$triggerAePrecapture$3(b.a aVar) {
        this.mExecutor.execute(new p(3, this, aVar));
        return "triggerAePrecapture";
    }

    private static int rangeLimit(int i6, int i7, int i8) {
        return Math.min(Math.max(i6, i8), i7);
    }

    private boolean shouldTriggerAF() {
        return this.mAfRects.length > 0;
    }

    public void addFocusMeteringOptions(Camera2ImplConfig.Builder builder) {
        int defaultAfMode = this.mIsInAfAutoMode ? 1 : getDefaultAfMode();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.mCameraControl.getSupportedAfMode(defaultAfMode));
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, numValueOf, optionPriority);
        MeteringRectangle[] meteringRectangleArr = this.mAfRects;
        if (meteringRectangleArr.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, optionPriority);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.mAeRects;
        if (meteringRectangleArr2.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, optionPriority);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.mAwbRects;
        if (meteringRectangleArr3.length != 0) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, optionPriority);
        }
    }

    public void cancelAfAeTrigger(boolean z6, boolean z7) {
        if (this.mIsActive) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setUseRepeatingSurface(true);
            builder.setTemplateType(this.mTemplate);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z6) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z7) {
                builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.addImplementationOptions(builder2.build());
            this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
    }

    public c5.a<Void> cancelFocusAndMetering() {
        return y.b.a(new r0(1, this));
    }

    /* renamed from: cancelFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$cancelFocusAndMetering$12(b.a<Void> aVar) {
        failCancelFuture("Cancelled by another cancelFocusAndMetering()");
        failActionFuture("Cancelled by cancelFocusAndMetering()");
        this.mRunningCancelCompleter = aVar;
        disableAutoCancel();
        clearAutoFocusTimeoutHandle();
        if (shouldTriggerAF()) {
            cancelAfAeTrigger(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        this.mAfRects = meteringRectangleArr;
        this.mAeRects = meteringRectangleArr;
        this.mAwbRects = meteringRectangleArr;
        this.mIsInAfAutoMode = false;
        final long jUpdateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
        if (this.mRunningCancelCompleter != null) {
            final int supportedAfMode = this.mCameraControl.getSupportedAfMode(getDefaultAfMode());
            Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.o1
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    return this.lambda$cancelFocusAndMeteringInternal$14(supportedAfMode, jUpdateSessionConfigSynchronous, totalCaptureResult);
                }
            };
            this.mSessionListenerForCancel = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }

    public void cancelFocusAndMeteringWithoutAsyncResult() {
        lambda$cancelFocusAndMetering$12(null);
    }

    public void completeActionFuture(boolean z6) {
        clearAutoFocusTimeoutHandle();
        b.a<FocusMeteringResult> aVar = this.mRunningActionCompleter;
        if (aVar != null) {
            aVar.a(FocusMeteringResult.create(z6));
            this.mRunningActionCompleter = null;
        }
    }

    public c5.a<Void> enableExternalFlashAeMode(boolean z6) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 28) {
            Log.d(TAG, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i6);
            return Futures.immediateFuture(null);
        }
        if (this.mCameraControl.getSupportedAeMode(5) != 5) {
            Log.d(TAG, "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return Futures.immediateFuture(null);
        }
        Log.d(TAG, "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return y.b.a(new i1(this, z6, 0));
    }

    public int getDefaultAfMode() {
        return this.mTemplate != 3 ? 4 : 3;
    }

    public boolean isExternalFlashAeModeEnabled() {
        return this.mIsExternalFlashAeModeEnabled;
    }

    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        return (getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2).isEmpty() && getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4).isEmpty()) ? false : true;
    }

    public void setActive(boolean z6) {
        if (z6 == this.mIsActive) {
            return;
        }
        this.mIsActive = z6;
        if (this.mIsActive) {
            return;
        }
        cancelFocusAndMeteringWithoutAsyncResult();
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mPreviewAspectRatio = rational;
    }

    public void setTemplate(int i6) {
        this.mTemplate = i6;
    }

    public c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return startFocusAndMetering(focusMeteringAction, AUTO_FOCUS_TIMEOUT_DURATION);
    }

    /* renamed from: startFocusAndMeteringInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$startFocusAndMetering$0(b.a<FocusMeteringResult> aVar, FocusMeteringAction focusMeteringAction, long j6) {
        if (!this.mIsActive) {
            aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect cropSensorRegion = this.mCameraControl.getCropSensorRegion();
        Rational defaultAspectRatio = getDefaultAspectRatio();
        List<MeteringRectangle> meteringRectangles = getMeteringRectangles(focusMeteringAction.getMeteringPointsAf(), this.mCameraControl.getMaxAfRegionCount(), defaultAspectRatio, cropSensorRegion, 1);
        List<MeteringRectangle> meteringRectangles2 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAe(), this.mCameraControl.getMaxAeRegionCount(), defaultAspectRatio, cropSensorRegion, 2);
        List<MeteringRectangle> meteringRectangles3 = getMeteringRectangles(focusMeteringAction.getMeteringPointsAwb(), this.mCameraControl.getMaxAwbRegionCount(), defaultAspectRatio, cropSensorRegion, 4);
        if (meteringRectangles.isEmpty() && meteringRectangles2.isEmpty() && meteringRectangles3.isEmpty()) {
            aVar.b(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        failActionFuture("Cancelled by another startFocusAndMetering()");
        failCancelFuture("Cancelled by another startFocusAndMetering()");
        disableAutoCancel();
        this.mRunningActionCompleter = aVar;
        MeteringRectangle[] meteringRectangleArr = EMPTY_RECTANGLES;
        executeMeteringAction((MeteringRectangle[]) meteringRectangles.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles2.toArray(meteringRectangleArr), (MeteringRectangle[]) meteringRectangles3.toArray(meteringRectangleArr), focusMeteringAction, j6);
    }

    public c5.a<Void> triggerAePrecapture() {
        return y.b.a(new q(4, this));
    }

    public void triggerAf(final b.a<CameraCaptureResult> aVar, boolean z6) {
        if (!this.mIsActive) {
            if (aVar != null) {
                aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z6) {
            builder2.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mCameraControl.getSupportedAeMode(1)), Config.OptionPriority.HIGH_PRIORITY_REQUIRED);
        }
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i6) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(new CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i6, CameraCaptureResult cameraCaptureResult) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(cameraCaptureResult);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i6, CameraCaptureFailure cameraCaptureFailure) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
    }

    public c5.a<FocusMeteringResult> startFocusAndMetering(final FocusMeteringAction focusMeteringAction, final long j6) {
        return y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.n1
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$startFocusAndMetering$1(focusMeteringAction, j6, aVar);
            }
        });
    }

    /* renamed from: triggerAePrecapture, reason: merged with bridge method [inline-methods] */
    public void lambda$triggerAePrecapture$2(final b.a<Void> aVar) {
        Logger.d(TAG, "triggerAePrecapture");
        if (!this.mIsActive) {
            if (aVar != null) {
                aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(this.mTemplate);
        builder.setUseRepeatingSurface(true);
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        builder.addImplementationOptions(builder2.build());
        builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.FocusMeteringControl.2
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCancelled(int i6) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(new CameraControl.OperationCanceledException("Camera is closed"));
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i6, CameraCaptureResult cameraCaptureResult) {
                if (aVar != null) {
                    Logger.d(FocusMeteringControl.TAG, "triggerAePrecapture: triggering capture request completed");
                    aVar.a(null);
                }
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureFailed(int i6, CameraCaptureFailure cameraCaptureFailure) {
                b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
                }
            }
        });
        this.mCameraControl.submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
    }

    private void enableExternalFlashAeMode(final b.a<Void> aVar) {
        if (!this.mIsActive) {
            if (aVar != null) {
                aVar.b(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            final long jUpdateSessionConfigSynchronous = this.mCameraControl.updateSessionConfigSynchronous();
            Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.k1
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    return this.f420a.lambda$enableExternalFlashAeMode$6(jUpdateSessionConfigSynchronous, aVar, totalCaptureResult);
                }
            };
            this.mSessionListenerForAeMode = captureResultListener;
            this.mCameraControl.addCaptureResultListener(captureResultListener);
        }
    }
}
