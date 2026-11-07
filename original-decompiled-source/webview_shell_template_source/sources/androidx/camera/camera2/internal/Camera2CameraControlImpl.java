package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class Camera2CameraControlImpl implements CameraControlInternal {
    private static final int DEFAULT_TEMPLATE = 1;
    private static final String TAG = "Camera2CameraControlImp";
    static final String TAG_SESSION_UPDATE_ID = "CameraControlSessionUpdateId";
    private final AeFpsRange mAeFpsRange;
    private final AutoFlashAEModeDisabler mAutoFlashAEModeDisabler;
    private final Camera2CameraControl mCamera2CameraControl;
    private final Camera2CapturePipeline mCamera2CapturePipeline;
    private final CameraCaptureCallbackSet mCameraCaptureCallbackSet;
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private final CameraControlInternal.ControlUpdateCallback mControlUpdateCallback;
    private long mCurrentSessionUpdateId;
    final Executor mExecutor;
    private final ExposureControl mExposureControl;
    private volatile int mFlashMode;
    private volatile c5.a<Void> mFlashModeChangeSessionUpdateFuture;
    private final FocusMeteringControl mFocusMeteringControl;
    private volatile boolean mIsTorchOn;
    private final Object mLock;
    private final AtomicLong mNextSessionUpdateId;
    private ImageCapture.ScreenFlash mScreenFlash;
    final CameraControlSessionCallback mSessionCallback;
    private final SessionConfig.Builder mSessionConfigBuilder;
    private int mTemplate;
    private final TorchControl mTorchControl;
    private int mUseCount;
    private final VideoUsageControl mVideoUsageControl;
    private final ZoomControl mZoomControl;
    ZslControl mZslControl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {
        Set<CameraCaptureCallback> mCallbacks = new HashSet();
        Map<CameraCaptureCallback, Executor> mCallbackExecutors = new ArrayMap();

        public void addCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.add(cameraCaptureCallback);
            this.mCallbackExecutors.put(cameraCaptureCallback, executor);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(final int i6) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureCancelled(i6);
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCancelled.", e6);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i6, CameraCaptureResult cameraCaptureResult) {
            for (CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new k(cameraCaptureCallback, i6, cameraCaptureResult));
                } catch (RejectedExecutionException e6) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureCompleted.", e6);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(final int i6, final CameraCaptureFailure cameraCaptureFailure) {
            for (final CameraCaptureCallback cameraCaptureCallback : this.mCallbacks) {
                try {
                    this.mCallbackExecutors.get(cameraCaptureCallback).execute(new Runnable() { // from class: androidx.camera.camera2.internal.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            cameraCaptureCallback.onCaptureFailed(i6, cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e6) {
                    Logger.e(Camera2CameraControlImpl.TAG, "Executor rejected to invoke onCaptureFailed.", e6);
                }
            }
        }

        public void removeCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCallbacks.remove(cameraCaptureCallback);
            this.mCallbackExecutors.remove(cameraCaptureCallback);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        final Set<CaptureResultListener> mResultListeners = new HashSet();

        public CameraControlSessionCallback(Executor executor) {
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$0(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (CaptureResultListener captureResultListener : this.mResultListeners) {
                if (captureResultListener.onCaptureResult(totalCaptureResult)) {
                    hashSet.add(captureResultListener);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.mResultListeners.removeAll(hashSet);
        }

        public void addListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.add(captureResultListener);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new m(0, this, totalCaptureResult));
        }

        public void removeListener(CaptureResultListener captureResultListener) {
            this.mResultListeners.remove(captureResultListener);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface CaptureResultListener {
        boolean onCaptureResult(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback) {
        this(cameraCharacteristicsCompat, scheduledExecutorService, executor, controlUpdateCallback, new Quirks(new ArrayList()));
    }

    private int getSupportedAwbMode(int i6) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i6, iArr) ? i6 : isModeInList(1, iArr) ? 1 : 0;
    }

    private boolean isControlInUse() {
        return getUseCount() > 0;
    }

    private static boolean isModeInList(int i6, int[] iArr) {
        for (int i7 : iArr) {
            if (i6 == i7) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSessionUpdated(TotalCaptureResult totalCaptureResult, long j6) {
        Long l4;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof TagBundle) && (l4 = (Long) ((TagBundle) tag).getTag(TAG_SESSION_UPDATE_ID)) != null && l4.longValue() >= j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSessionCameraCaptureCallback$8(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.addCaptureCallback(executor, cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c5.a lambda$getCameraCapturePipelineAsync$5(int i6, int i7, int i8, Void r42) {
        return Futures.immediateFuture(this.mCamera2CapturePipeline.getCameraCapturePipeline(i6, i7, i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSessionCameraCaptureCallback$9(CameraCaptureCallback cameraCaptureCallback) {
        this.mCameraCaptureCallbackSet.removeCaptureCallback(cameraCaptureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c5.a lambda$submitStillCaptureRequests$4(List list, int i6, int i7, int i8, Void r5) {
        return this.mCamera2CapturePipeline.submitStillCaptures(list, i6, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateSessionConfigAsync$6(b.a aVar) {
        Futures.propagate(waitForSessionUpdateId(updateSessionConfigSynchronous()), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateSessionConfigAsync$7(final b.a aVar) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$updateSessionConfigAsync$6(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$waitForSessionUpdateId$2(long j6, b.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!isSessionUpdated(totalCaptureResult, j6)) {
            return false;
        }
        aVar.a(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$waitForSessionUpdateId$3(final long j6, final b.a aVar) {
        addCaptureResultListener(new CaptureResultListener() { // from class: androidx.camera.camera2.internal.c
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return Camera2CameraControlImpl.lambda$waitForSessionUpdateId$2(j6, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j6;
    }

    private c5.a<Void> waitForSessionUpdateId(final long j6) {
        return y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.i
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$waitForSessionUpdateId$3(j6, aVar);
            }
        });
    }

    public void addCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.addListener(captureResultListener);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(Config config) {
        this.mCamera2CameraControl.addCaptureRequestOptions(CaptureRequestOptions.Builder.from(config).build()).addListener(new g(), CameraXExecutors.directExecutor());
    }

    public void addSessionCameraCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new u(this, executor, cameraCaptureCallback, 1));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(SessionConfig.Builder builder) {
        this.mZslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> cancelFocusAndMetering() {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.cancelFocusAndMetering());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.mCamera2CameraControl.clearCaptureRequestOptions().addListener(new d(), CameraXExecutors.directExecutor());
    }

    public void decrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i6 = this.mUseCount;
                if (i6 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.mUseCount = i6 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.mVideoUsageControl.decrementUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> enableTorch(boolean z6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mTorchControl.enableTorch(z6));
    }

    public void enableTorchInternal(boolean z6) {
        this.mIsTorchOn = z6;
        if (!z6) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mTemplate);
            builder.setUseRepeatingSurface(true);
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(1)));
            builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
            builder.addImplementationOptions(builder2.build());
            submitCaptureRequestsInternal(Collections.singletonList(builder.build()));
        }
        updateSessionConfigSynchronous();
    }

    public Camera2CameraControl getCamera2CameraControl() {
        return this.mCamera2CameraControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public c5.a<CameraCapturePipeline> getCameraCapturePipelineAsync(final int i6, final int i7) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.h
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final c5.a apply(Object obj) {
                    return this.s.lambda$getCameraCapturePipelineAsync$5(i6, flashMode, i7, (Void) obj);
                }
            }, this.mExecutor);
        }
        Logger.w(TAG, "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public Rect getCropSensorRegion() {
        return this.mZoomControl.getCropSensorRegion();
    }

    public long getCurrentSessionUpdateId() {
        return this.mCurrentSessionUpdateId;
    }

    public ExposureControl getExposureControl() {
        return this.mExposureControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.mFlashMode;
    }

    public FocusMeteringControl getFocusMeteringControl() {
        return this.mFocusMeteringControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config getInteropConfig() {
        return this.mCamera2CameraControl.getCamera2ImplConfig();
    }

    public int getMaxAeRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAfRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getMaxAwbRegionCount() {
        Integer num = (Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public ImageCapture.ScreenFlash getScreenFlash() {
        return this.mScreenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect getSensorRect() {
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public SessionConfig getSessionConfig() {
        this.mSessionConfigBuilder.setTemplateType(this.mTemplate);
        this.mSessionConfigBuilder.setImplementationOptions(getSessionOptions());
        this.mSessionConfigBuilder.addTag(TAG_SESSION_UPDATE_ID, Long.valueOf(this.mCurrentSessionUpdateId));
        return this.mSessionConfigBuilder.build();
    }

    public Config getSessionOptions() {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        Config.OptionPriority optionPriority = Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, 1, optionPriority);
        this.mFocusMeteringControl.addFocusMeteringOptions(builder);
        this.mAeFpsRange.addAeFpsRangeOptions(builder);
        this.mZoomControl.addZoomOption(builder);
        int correctedAeMode = this.mFocusMeteringControl.isExternalFlashAeModeEnabled() ? 5 : 1;
        if (this.mIsTorchOn) {
            builder.setCaptureRequestOptionWithPriority(CaptureRequest.FLASH_MODE, 2, optionPriority);
        } else {
            int i6 = this.mFlashMode;
            if (i6 == 0) {
                correctedAeMode = this.mAutoFlashAEModeDisabler.getCorrectedAeMode(2);
            } else if (i6 == 1) {
                correctedAeMode = 3;
            } else if (i6 == 2) {
                correctedAeMode = 1;
            }
        }
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(getSupportedAeMode(correctedAeMode)), optionPriority);
        builder.setCaptureRequestOptionWithPriority(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(getSupportedAwbMode(1)), optionPriority);
        this.mExposureControl.setCaptureRequestOption(builder);
        this.mCamera2CameraControl.applyOptionsToBuilder(builder);
        return builder.build();
    }

    public int getSupportedAeMode(int i6) {
        return getSupportedAeMode(this.mCameraCharacteristics, i6);
    }

    public int getSupportedAfMode(int i6) {
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (isModeInList(i6, iArr)) {
            return i6;
        }
        if (isModeInList(4, iArr)) {
            return 4;
        }
        return isModeInList(1, iArr) ? 1 : 0;
    }

    public TorchControl getTorchControl() {
        return this.mTorchControl;
    }

    public int getUseCount() {
        int i6;
        synchronized (this.mLock) {
            i6 = this.mUseCount;
        }
        return i6;
    }

    public ZoomControl getZoomControl() {
        return this.mZoomControl;
    }

    public ZslControl getZslControl() {
        return this.mZslControl;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            this.mUseCount++;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.mVideoUsageControl.incrementUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        int usage = this.mVideoUsageControl.getUsage();
        Logger.d(TAG, "isInVideoUsage: mVideoUsageControl value = " + usage);
        return usage > 0;
    }

    public boolean isTorchOn() {
        return this.mIsTorchOn;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.mZslControl.isZslDisabledByUserCaseConfig();
    }

    public void removeCaptureResultListener(CaptureResultListener captureResultListener) {
        this.mSessionCallback.removeListener(captureResultListener);
    }

    public void removeSessionCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        this.mExecutor.execute(new b0(2, this, cameraCaptureCallback));
    }

    public void resetTemplate() {
        setTemplate(1);
    }

    public void setActive(boolean z6) {
        Logger.d(TAG, "setActive: isActive = " + z6);
        this.mFocusMeteringControl.setActive(z6);
        this.mZoomControl.setActive(z6);
        this.mTorchControl.setActive(z6);
        this.mExposureControl.setActive(z6);
        this.mCamera2CameraControl.setActive(z6);
        if (z6) {
            return;
        }
        this.mScreenFlash = null;
        this.mVideoUsageControl.resetDirectly();
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Integer> setExposureCompensationIndex(int i6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : this.mExposureControl.setExposureCompensationIndex(i6);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i6) {
        if (!isControlInUse()) {
            Logger.w(TAG, "Camera is not active.");
            return;
        }
        this.mFlashMode = i6;
        Logger.d(TAG, "setFlashMode: mFlashMode = " + this.mFlashMode);
        ZslControl zslControl = this.mZslControl;
        boolean z6 = true;
        if (this.mFlashMode != 1 && this.mFlashMode != 0) {
            z6 = false;
        }
        zslControl.setZslDisabledByFlashMode(z6);
        this.mFlashModeChangeSessionUpdateFuture = updateSessionConfigAsync();
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> setLinearZoom(float f6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setLinearZoom(f6));
    }

    public void setPreviewAspectRatio(Rational rational) {
        this.mFocusMeteringControl.setPreviewAspectRatio(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.mScreenFlash = screenFlash;
    }

    public void setTemplate(int i6) {
        this.mTemplate = i6;
        this.mFocusMeteringControl.setTemplate(i6);
        this.mCamera2CapturePipeline.setTemplate(this.mTemplate);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<Void> setZoomRatio(float f6) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mZoomControl.setZoomRatio(f6));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z6) {
        this.mZslControl.setZslDisabledByUserCaseConfig(z6);
    }

    @Override // androidx.camera.core.CameraControl
    public c5.a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        return !isControlInUse() ? Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active.")) : Futures.nonCancellationPropagating(this.mFocusMeteringControl.startFocusAndMetering(focusMeteringAction));
    }

    public void submitCaptureRequestsInternal(List<CaptureConfig> list) {
        this.mControlUpdateCallback.onCameraControlCaptureRequests(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public c5.a<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, final int i6, final int i7) {
        if (isControlInUse()) {
            final int flashMode = getFlashMode();
            return FutureChain.from(Futures.nonCancellationPropagating(this.mFlashModeChangeSessionUpdateFuture)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.f
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final c5.a apply(Object obj) {
                    return this.s.lambda$submitStillCaptureRequests$4(list, i6, flashMode, i7, (Void) obj);
                }
            }, this.mExecutor);
        }
        Logger.w(TAG, "Camera is not active.");
        return Futures.immediateFailedFuture(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public void updateSessionConfig() {
        this.mExecutor.execute(new y(1, this));
    }

    public c5.a<Void> updateSessionConfigAsync() {
        return Futures.nonCancellationPropagating(y.b.a(new q0(2, this)));
    }

    public long updateSessionConfigSynchronous() {
        this.mCurrentSessionUpdateId = this.mNextSessionUpdateId.getAndIncrement();
        this.mControlUpdateCallback.onCameraControlUpdateSessionConfig();
        return this.mCurrentSessionUpdateId;
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        this.mLock = new Object();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.mSessionConfigBuilder = builder;
        this.mUseCount = 0;
        this.mIsTorchOn = false;
        this.mFlashMode = 2;
        this.mNextSessionUpdateId = new AtomicLong(0L);
        this.mFlashModeChangeSessionUpdateFuture = Futures.immediateFuture(null);
        this.mTemplate = 1;
        this.mCurrentSessionUpdateId = 0L;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        this.mCameraCaptureCallbackSet = cameraCaptureCallbackSet;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mControlUpdateCallback = controlUpdateCallback;
        this.mExecutor = executor;
        this.mVideoUsageControl = new VideoUsageControl(executor);
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.mSessionCallback = cameraControlSessionCallback;
        builder.setTemplateType(this.mTemplate);
        builder.addRepeatingCameraCaptureCallback(CaptureCallbackContainer.create(cameraControlSessionCallback));
        builder.addRepeatingCameraCaptureCallback(cameraCaptureCallbackSet);
        this.mExposureControl = new ExposureControl(this, cameraCharacteristicsCompat, executor);
        this.mFocusMeteringControl = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.mZoomControl = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.mTorchControl = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.mZslControl = new ZslControlImpl(cameraCharacteristicsCompat);
        this.mAeFpsRange = new AeFpsRange(quirks);
        this.mAutoFlashAEModeDisabler = new AutoFlashAEModeDisabler(quirks);
        this.mCamera2CameraControl = new Camera2CameraControl(this, executor);
        this.mCamera2CapturePipeline = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor, scheduledExecutorService);
    }

    public static int getSupportedAeMode(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i6) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return isModeInList(i6, iArr) ? i6 : isModeInList(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addInteropConfig$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$clearInteropConfig$1() {
    }
}
