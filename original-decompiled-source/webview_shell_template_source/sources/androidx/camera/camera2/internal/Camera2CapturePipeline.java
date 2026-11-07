package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";
    private final Camera2CameraControlImpl mCameraControl;
    private final Quirks mCameraQuirk;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private final boolean mIsLegacyDevice;
    private final ScheduledExecutorService mScheduler;
    private int mTemplate = 1;
    private final UseTorchAsFlash mUseTorchAsFlash;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i6, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i6;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(b.a aVar) {
            this.mCameraControl.getFocusMeteringControl().lambda$triggerAePrecapture$2(aVar);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$1(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(y.b.a(new h0(this))).transform(new i0(), CameraXExecutors.directExecutor());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            c5.a<Boolean> aVarImmediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return aVarImmediateFuture;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class CameraCapturePipelineImpl implements CameraCapturePipeline {
        private final Executor mExecutor;
        private int mFlashMode;
        private final Pipeline mPipelineDelegate;

        public CameraCapturePipelineImpl(Pipeline pipeline, Executor executor, int i6) {
            this.mPipelineDelegate = pipeline;
            this.mExecutor = executor;
            this.mFlashMode = i6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$invokePostCapture$1(b.a aVar) {
            this.mPipelineDelegate.executePostCapture();
            aVar.a(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$invokePreCapture$0(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public c5.a<Void> invokePostCapture() {
            return y.b.a(new j0(this));
        }

        @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
        public c5.a<Void> invokePreCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "invokePreCapture");
            return FutureChain.from(this.mPipelineDelegate.executePreCapture(this.mFlashMode)).transform(new k0(0), this.mExecutor);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final ScheduledExecutorService mScheduler;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new AnonymousClass1();

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1, reason: invalid class name */
        public class AnonymousClass1 implements PipelineTask {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean lambda$preCapture$0(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    if (it.next().isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    it.next().postCapture();
                }
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<PipelineTask> it = Pipeline.this.mTasks.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new k0(1), CameraXExecutors.directExecutor());
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1L);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5L);
        }

        public Pipeline(int i6, Executor executor, ScheduledExecutorService scheduledExecutorService, Camera2CameraControlImpl camera2CameraControlImpl, boolean z6, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i6;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z6;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        private void applyAeModeQuirk(CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(CaptureConfig.Builder builder, CaptureConfig captureConfig) {
            int i6 = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i6 != -1) {
                builder.setTemplateType(i6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$executeCapture$0(List list, int i6, TotalCaptureResult totalCaptureResult) {
            return submitConfigsInternal(list, i6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$executePreCapture$1(int i6, TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(i6, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$executePreCapture$2(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$executePreCapture$3(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? Camera2CapturePipeline.waitForResult(this.mTimeout3A, this.mScheduler, this.mCameraControl, new p0()) : Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$submitConfigsInternal$4(CaptureConfig.Builder builder, final b.a aVar) {
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled(int i6) {
                    aVar.b(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(int i6, CameraCaptureResult cameraCaptureResult) {
                    aVar.a(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(int i6, CameraCaptureFailure cameraCaptureFailure) {
                    aVar.b(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j6) {
            this.mTimeout3A = j6;
        }

        public void addTask(PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        public c5.a<List<Void>> executeCapture(final List<CaptureConfig> list, final int i6) {
            FutureChain futureChainTransformAsync = FutureChain.from(executePreCapture(i6)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.m0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final c5.a apply(Object obj) {
                    return this.s.lambda$executeCapture$0(list, i6, (TotalCaptureResult) obj);
                }
            }, this.mExecutor);
            futureChainTransformAsync.addListener(new z(2, this), this.mExecutor);
            return futureChainTransformAsync;
        }

        public void executePostCapture() {
            this.mPipelineSubTask.postCapture();
        }

        public c5.a<TotalCaptureResult> executePreCapture(final int i6) {
            c5.a<TotalCaptureResult> aVarImmediateFuture = Futures.immediateFuture(null);
            if (this.mTasks.isEmpty()) {
                return aVarImmediateFuture;
            }
            return FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? Camera2CapturePipeline.waitForResult(this.mCameraControl, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.n0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final c5.a apply(Object obj) {
                    return this.s.lambda$executePreCapture$1(i6, (TotalCaptureResult) obj);
                }
            }, this.mExecutor).transformAsync(new o0(0, this), this.mExecutor);
        }

        public c5.a<List<Void>> submitConfigsInternal(List<CaptureConfig> list, int i6) {
            ImageProxy imageProxyDequeueImageFromBuffer;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = (captureConfig.getTemplateType() != 5 || this.mCameraControl.getZslControl().isZslDisabledByFlashMode() || this.mCameraControl.getZslControl().isZslDisabledByUserCaseConfig() || (imageProxyDequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer()) == null || !this.mCameraControl.getZslControl().enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) ? null : CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo());
                if (cameraCaptureResultRetrieveCameraCaptureResult != null) {
                    builderFrom.setCameraCaptureResult(cameraCaptureResultRetrieveCameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(builderFrom, captureConfig);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i6)) {
                    applyAeModeQuirk(builderFrom);
                }
                arrayList.add(y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.l0
                    @Override // y.b.c
                    public final Object attachCompleter(b.a aVar) {
                        return this.s.lambda$submitConfigsInternal$4(builderFrom, aVar);
                    }
                }));
                arrayList2.add(builderFrom.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        private final Checker mChecker;
        private b.a<TotalCaptureResult> mCompleter;
        private final c5.a<TotalCaptureResult> mFuture = y.b.a(new q0(0, this));

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public interface Checker {
            boolean check(TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(Checker checker) {
            this.mChecker = checker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(b.a aVar) {
            this.mCompleter = aVar;
            return "waitFor3AResult";
        }

        public c5.a<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Checker checker = this.mChecker;
            if (checker != null && !checker.check(totalCaptureResult)) {
                return false;
            }
            this.mCompleter.a(totalCaptureResult);
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ScreenFlashTask implements PipelineTask {
        private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final ScheduledExecutorService mScheduler;
        private final ImageCapture.ScreenFlash mScreenFlash;
        private final UseFlashModeTorchFor3aUpdate mUseFlashModeTorchFor3aUpdate;

        public ScreenFlashTask(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor, ScheduledExecutorService scheduledExecutorService, UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mUseFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
            ImageCapture.ScreenFlash screenFlash = camera2CameraControlImpl.getScreenFlash();
            Objects.requireNonNull(screenFlash);
            this.mScreenFlash = screenFlash;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$preCapture$0(b.a aVar) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: UI change applied");
            aVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$preCapture$1(AtomicReference atomicReference, final b.a aVar) {
            atomicReference.set(new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.internal.w0
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    Camera2CapturePipeline.ScreenFlashTask.lambda$preCapture$0(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$10(Void r5) {
            return Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new v0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$11(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$preCapture$2(AtomicReference atomicReference, b.a aVar) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            this.mScreenFlash.apply(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (ImageCapture.ScreenFlashListener) atomicReference.get());
            aVar.a(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$3(final AtomicReference atomicReference, final b.a aVar) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.camera2.internal.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$preCapture$2(atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$4(Void r22) {
            return this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$5(b.a aVar) {
            if (!this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                aVar.a(null);
                return "EnableTorchInternal";
            }
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture: enable torch");
            this.mCameraControl.enableTorchInternal(true);
            aVar.a(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$6(Void r22) {
            return y.b.a(new r0(0, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$7(c5.a aVar, Object obj) {
            return Futures.makeTimeoutFuture(TimeUnit.SECONDS.toMillis(3L), this.mScheduler, null, true, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$8(Void r12) {
            return this.mCameraControl.getFocusMeteringControl().triggerAePrecapture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$preCapture$9(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, false);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return false;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#postCapture");
            if (this.mUseFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                this.mCameraControl.enableTorchInternal(false);
            }
            this.mCameraControl.getFocusMeteringControl().enableExternalFlashAeMode(false).addListener(new t0(), this.mExecutor);
            this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
            ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
            ImageCapture.ScreenFlash screenFlash = this.mScreenFlash;
            Objects.requireNonNull(screenFlash);
            scheduledExecutorServiceMainThreadExecutor.execute(new d0(2, screenFlash));
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "ScreenFlashTask#preCapture");
            AtomicReference atomicReference = new AtomicReference();
            int i6 = 1;
            return FutureChain.from(y.b.a(new r(i6, this, atomicReference))).transformAsync(new o0(i6, this), this.mExecutor).transformAsync(new j0(this), this.mExecutor).transformAsync(new x0(this, y.b.a(new q(2, atomicReference))), this.mExecutor).transformAsync(new q0(1, this), this.mExecutor).transformAsync(new q(1, this), this.mExecutor).transform(new s0(), CameraXExecutors.directExecutor());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class TorchTask implements PipelineTask {
        private static final long CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(2);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final ScheduledExecutorService mScheduler;
        private final boolean mTriggerAePrecapture;

        public TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i6, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z6) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i6;
            this.mExecutor = executor;
            this.mScheduler = scheduledExecutorService;
            this.mTriggerAePrecapture = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(b.a aVar) {
            this.mCameraControl.getTorchControl().lambda$enableTorch$1(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$1(Void r12) {
            return this.mTriggerAePrecapture ? this.mCameraControl.getFocusMeteringControl().triggerAePrecapture() : Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$preCapture$2(TotalCaptureResult totalCaptureResult) {
            return Camera2CapturePipeline.is3AConverged(totalCaptureResult, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ c5.a lambda$preCapture$3(Void r5) {
            return Camera2CapturePipeline.waitForResult(CHECK_3A_WITH_TORCH_TIMEOUT_IN_NS, this.mScheduler, this.mCameraControl, new y0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean lambda$preCapture$4(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().lambda$enableTorch$1(null, false);
                Logger.d(Camera2CapturePipeline.TAG, "Turning off torch");
                if (this.mTriggerAePrecapture) {
                    this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public c5.a<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Logger.d(Camera2CapturePipeline.TAG, "TorchTask#preCapture: isFlashRequired = " + Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult));
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (!this.mCameraControl.isTorchOn()) {
                    Logger.d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(y.b.a(new q(3, this))).transformAsync(new h0(this), this.mExecutor).transformAsync(new o0(2, this), this.mExecutor).transform(new p0(), CameraXExecutors.directExecutor());
                }
                Logger.d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = num != null && num.intValue() == 2;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(new e0(cameraCharacteristicsCompat));
    }

    public static boolean is3AConverged(TotalCaptureResult totalCaptureResult, boolean z6) {
        if (totalCaptureResult == null) {
            return false;
        }
        return ConvergenceUtils.is3AConverged(new Camera2CameraCaptureResult(totalCaptureResult), z6);
    }

    public static boolean isFlashRequired(int i6, TotalCaptureResult totalCaptureResult) {
        Logger.d(TAG, "isFlashRequired: flashMode = " + i6);
        if (i6 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            Logger.d(TAG, "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                return false;
            }
            if (i6 != 3) {
                throw new AssertionError(i6);
            }
        }
        return true;
    }

    private boolean isTorchAsFlash(int i6) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i6 == 1;
    }

    public static c5.a<TotalCaptureResult> waitForResult(long j6, ScheduledExecutorService scheduledExecutorService, Camera2CameraControlImpl camera2CameraControlImpl, ResultListener.Checker checker) {
        return Futures.makeTimeoutFuture(TimeUnit.NANOSECONDS.toMillis(j6), scheduledExecutorService, null, true, waitForResult(camera2CameraControlImpl, checker));
    }

    public Pipeline createPipeline(int i6, int i7, int i8) {
        int i9;
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mScheduler, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i6 == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (i7 != 3) {
            if (this.mHasFlashUnit) {
                if (isTorchAsFlash(i8)) {
                    i9 = i7;
                    pipeline.addTask(new TorchTask(this.mCameraControl, i9, this.mExecutor, this.mScheduler, (this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mCameraControl.isInVideoUsage()) ? false : true));
                } else {
                    i9 = i7;
                    pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i9, overrideAeModeForStillCapture));
                }
            }
            StringBuilder sbA = g0.a("createPipeline: captureMode = ", i6, ", flashMode = ", i9, ", flashType = ");
            sbA.append(i8);
            sbA.append(", pipeline tasks = ");
            sbA.append(pipeline.mTasks);
            Logger.d(TAG, sbA.toString());
            return pipeline;
        }
        pipeline.addTask(new ScreenFlashTask(this.mCameraControl, this.mExecutor, this.mScheduler, new UseFlashModeTorchFor3aUpdate(this.mCameraQuirk)));
        i9 = i7;
        StringBuilder sbA2 = g0.a("createPipeline: captureMode = ", i6, ", flashMode = ", i9, ", flashType = ");
        sbA2.append(i8);
        sbA2.append(", pipeline tasks = ");
        sbA2.append(pipeline.mTasks);
        Logger.d(TAG, sbA2.toString());
        return pipeline;
    }

    public CameraCapturePipeline getCameraCapturePipeline(int i6, int i7, int i8) {
        return new CameraCapturePipelineImpl(createPipeline(i6, i7, i8), this.mExecutor, i7);
    }

    public void setTemplate(int i6) {
        this.mTemplate = i6;
    }

    public c5.a<List<Void>> submitStillCaptures(List<CaptureConfig> list, int i6, int i7, int i8) {
        return Futures.nonCancellationPropagating(createPipeline(i6, i7, i8).executeCapture(list, i7));
    }

    public static c5.a<TotalCaptureResult> waitForResult(Camera2CameraControlImpl camera2CameraControlImpl, ResultListener.Checker checker) {
        ResultListener resultListener = new ResultListener(checker);
        camera2CameraControlImpl.addCaptureResultListener(resultListener);
        c5.a<TotalCaptureResult> future = resultListener.getFuture();
        future.addListener(new p(2, camera2CameraControlImpl, resultListener), camera2CameraControlImpl.mExecutor);
        return future;
    }
}
