package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.compat.workaround.TorchStateReset;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.SurfaceUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private final boolean mCanUseMultiResolutionImageReader;
    private final List<CaptureConfig> mCaptureConfigs;
    private final StateCallback mCaptureSessionStateCallback;
    List<DeferrableSurface> mConfiguredDeferrableSurfaces;
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    private final DynamicRangesCompat mDynamicRangesCompat;
    b.a<Void> mReleaseCompleter;
    c5.a<Void> mReleaseFuture;
    private final RequestMonitor mRequestMonitor;
    SessionConfig mSessionConfig;
    final Object mSessionLock;
    SynchronizedCaptureSession.Opener mSessionOpener;
    State mState;
    private final StillCaptureFlow mStillCaptureFlow;
    private Map<DeferrableSurface, Long> mStreamUseCaseMap;
    SynchronizedCaptureSession mSynchronizedCaptureSession;
    private final TemplateParamsOverride mTemplateParamsOverride;
    private final TorchStateReset mTorchStateReset;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            CaptureSession.this.finishClose();
                            break;
                        case RELEASED:
                            Logger.d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    Logger.e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    switch (CaptureSession.this.mState) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                        case OPENING:
                            CaptureSession captureSession = CaptureSession.this;
                            captureSession.mState = State.OPENED;
                            captureSession.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            Logger.d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                            CaptureSession captureSession2 = CaptureSession.this;
                            captureSession2.issueRepeatingCaptureRequests(captureSession2.mSessionConfig);
                            CaptureSession.this.issuePendingCaptureRequest();
                            break;
                        case CLOSED:
                            CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                            break;
                        case RELEASING:
                            synchronizedCaptureSession.close();
                            break;
                    }
                    Logger.d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                try {
                    if (CaptureSession.this.mState == State.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                    }
                    Logger.d(CaptureSession.TAG, "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat) {
        this(dynamicRangesCompat, false);
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<CameraCaptureCallback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static List<OutputConfiguration> createInstancesForMultiResolutionOutput(List<MultiResolutionStreamInfo> list, int i6) {
        try {
            return (List) OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", Collection.class, Integer.TYPE).invoke(null, list, Integer.valueOf(i6));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            Logger.e(TAG, "Failed to create instances for multi-resolution output, " + e6.getMessage());
            return null;
        }
    }

    private static Map<SessionConfig.OutputConfig, OutputConfigurationCompat> createMultiResolutionOutputConfigurationCompats(Map<Integer, List<SessionConfig.OutputConfig>> map, Map<DeferrableSurface, Surface> map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            for (SessionConfig.OutputConfig outputConfig : map.get(num)) {
                SurfaceUtil.SurfaceInfo surfaceInfo = SurfaceUtil.getSurfaceInfo(map2.get(outputConfig.getSurface()));
                if (i6 == 0) {
                    i6 = surfaceInfo.format;
                }
                b1.j();
                int i7 = surfaceInfo.width;
                int i8 = surfaceInfo.height;
                String physicalCameraId = outputConfig.getPhysicalCameraId();
                Objects.requireNonNull(physicalCameraId);
                arrayList.add(a1.a(i7, i8, physicalCameraId));
            }
            if (i6 == 0 || arrayList.isEmpty()) {
                Logger.e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i6 + ", streamInfos size: " + arrayList.size());
            } else {
                List<OutputConfiguration> listCreateInstancesForMultiResolutionOutput = createInstancesForMultiResolutionOutput(arrayList, i6);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (SessionConfig.OutputConfig outputConfig2 : map.get(num)) {
                        OutputConfiguration outputConfigurationRemove = listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfigurationRemove.addSurface(map2.get(outputConfig2.getSurface()));
                        map3.put(outputConfig2, new OutputConfigurationCompat(outputConfigurationRemove));
                    }
                }
            }
        }
        return map3;
    }

    private OutputConfigurationCompat getOutputConfigurationCompat(SessionConfig.OutputConfig outputConfig, Map<DeferrableSurface, Surface> map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfiles;
        Surface surface = map.get(outputConfig.getSurface());
        androidx.work.j.e("Surface in OutputConfig not found in configuredSurfaceMap.", surface);
        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (outputConfig.getMirrorMode() == 0) {
            outputConfigurationCompat.setMirrorMode(1);
        } else if (outputConfig.getMirrorMode() == 1) {
            outputConfigurationCompat.setMirrorMode(2);
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            Iterator<DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                Surface surface2 = map.get(it.next());
                androidx.work.j.e("Surface in OutputConfig not found in configuredSurfaceMap.", surface2);
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfiles = this.mDynamicRangesCompat.toDynamicRangeProfiles()) == null) {
            jLongValue = 1;
        } else {
            DynamicRange dynamicRange = outputConfig.getDynamicRange();
            Long lDynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (lDynamicRangeToFirstSupportedProfile == null) {
                Logger.e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
                jLongValue = 1;
            } else {
                jLongValue = lDynamicRangeToFirstSupportedProfile.longValue();
            }
        }
        outputConfigurationCompat.setDynamicRangeProfile(jLongValue);
        return outputConfigurationCompat;
    }

    private List<OutputConfigurationCompat> getUniqueOutputConfigurations(List<OutputConfigurationCompat> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OutputConfigurationCompat outputConfigurationCompat : list) {
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    private static Map<Integer, List<SessionConfig.OutputConfig>> groupMrirOutputConfigs(Collection<SessionConfig.OutputConfig> collection) {
        HashMap map = new HashMap();
        for (SessionConfig.OutputConfig outputConfig : collection) {
            if (outputConfig.getSurfaceGroupId() > 0 && outputConfig.getSharedSurfaces().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(outputConfig.getSurfaceGroupId()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(outputConfig.getSurfaceGroupId()), arrayList);
                }
                arrayList.add(outputConfig);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$issueBurstCaptureRequest$3(CameraCaptureSession cameraCaptureSession, int i6, boolean z6) {
        synchronized (this.mSessionLock) {
            try {
                if (this.mState == State.OPENED) {
                    issueRepeatingCaptureRequests(this.mSessionConfig);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$issuePendingCaptureRequest$2() {
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                return;
            }
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$1(b.a aVar) {
        String str;
        synchronized (this.mSessionLock) {
            androidx.work.j.f("Release completer expected to be null", this.mReleaseCompleter == null);
            this.mReleaseCompleter = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openCaptureSession, reason: merged with bridge method [inline-methods] */
    public c5.a<Void> lambda$open$0(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            try {
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.mConfiguredSurfaceMap.clear();
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i6), list.get(i6));
                        }
                        this.mState = State.OPENING;
                        Logger.d(TAG, "Opening capture session.");
                        SynchronizedCaptureSession.StateCallback stateCallbackCreateComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                        CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                        Map map = new HashMap();
                        if (this.mCanUseMultiResolutionImageReader && Build.VERSION.SDK_INT >= 35) {
                            map = createMultiResolutionOutputConfigurationCompats(groupMrirOutputConfigs(sessionConfig.getOutputConfigs()), this.mConfiguredSurfaceMap);
                        }
                        ArrayList arrayList = new ArrayList();
                        String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                        for (SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                            OutputConfigurationCompat outputConfigurationCompat = (!this.mCanUseMultiResolutionImageReader || Build.VERSION.SDK_INT < 35) ? null : (OutputConfigurationCompat) map.get(outputConfig);
                            if (outputConfigurationCompat == null) {
                                outputConfigurationCompat = getOutputConfigurationCompat(outputConfig, this.mConfiguredSurfaceMap, physicalCameraId);
                                if (this.mStreamUseCaseMap.containsKey(outputConfig.getSurface())) {
                                    outputConfigurationCompat.setStreamUseCase(this.mStreamUseCaseMap.get(outputConfig.getSurface()).longValue());
                                }
                            }
                            arrayList.add(outputConfigurationCompat);
                        }
                        SessionConfigurationCompat sessionConfigurationCompatCreateSessionConfigurationCompat = this.mSessionOpener.createSessionConfigurationCompat(sessionConfig.getSessionType(), getUniqueOutputConfigurations(arrayList), stateCallbackCreateComboCallback);
                        if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                            sessionConfigurationCompatCreateSessionConfigurationCompat.setInputConfiguration(InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                        }
                        try {
                            CaptureRequest captureRequestBuildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(builderFrom.build(), cameraDevice, this.mTemplateParamsOverride);
                            if (captureRequestBuildWithoutTarget != null) {
                                sessionConfigurationCompatCreateSessionConfigurationCompat.setSessionParameters(captureRequestBuildWithoutTarget);
                            }
                            return this.mSessionOpener.openCaptureSession(cameraDevice, sessionConfigurationCompatCreateSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                        } catch (CameraAccessException e6) {
                            return Futures.immediateFailedFuture(e6);
                        }
                    }
                    if (iOrdinal != 4) {
                        return Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                    }
                }
                return Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
            } else {
                try {
                    this.mSynchronizedCaptureSession.abortCaptures();
                } catch (CameraAccessException e6) {
                    Logger.e(TAG, "Unable to abort captures.", e6);
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        ArrayList arrayList;
        synchronized (this.mSessionLock) {
            try {
                if (this.mCaptureConfigs.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.mCaptureConfigs);
                    this.mCaptureConfigs.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                CaptureConfig captureConfig = (CaptureConfig) obj;
                Iterator<CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            try {
                int iOrdinal = this.mState.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.mState);
                }
                if (iOrdinal == 1) {
                    this.mState = State.RELEASED;
                } else if (iOrdinal == 2) {
                    androidx.work.j.e("The Opener shouldn't null in state:" + this.mState, this.mSessionOpener);
                    this.mSessionOpener.stop();
                    this.mState = State.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    androidx.work.j.e("The Opener shouldn't null in state:" + this.mState, this.mSessionOpener);
                    this.mSessionOpener.stop();
                    this.mState = State.CLOSED;
                    this.mRequestMonitor.stop();
                    this.mSessionConfig = null;
                }
            } finally {
            }
        }
    }

    public void finishClose() {
        State state = this.mState;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = state2;
        this.mSynchronizedCaptureSession = null;
        b.a<Void> aVar = this.mReleaseCompleter;
        if (aVar != null) {
            aVar.a(null);
            this.mReleaseCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> listUnmodifiableList;
        synchronized (this.mSessionLock) {
            listUnmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return listUnmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        boolean z6;
        synchronized (this.mSessionLock) {
            try {
                State state = this.mState;
                z6 = state == State.OPENED || state == State.OPENING;
            } finally {
            }
        }
        return z6;
    }

    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        CameraBurstCaptureCallback cameraBurstCaptureCallback;
        ArrayList arrayList;
        boolean z6;
        synchronized (this.mSessionLock) {
            try {
                if (this.mState != State.OPENED) {
                    Logger.d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                    arrayList = new ArrayList();
                    Logger.d(TAG, "Issuing capture request.");
                    z6 = false;
                    for (CaptureConfig captureConfig : list) {
                        if (captureConfig.getSurfaces().isEmpty()) {
                            Logger.d(TAG, "Skipping issuing empty capture request.");
                        } else {
                            Iterator<DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    DeferrableSurface next = it.next();
                                    if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                        Logger.d(TAG, "Skipping capture request with invalid surface: " + next);
                                        break;
                                    }
                                } else {
                                    if (captureConfig.getTemplateType() == 2) {
                                        z6 = true;
                                    }
                                    CaptureConfig.Builder builderFrom = CaptureConfig.Builder.from(captureConfig);
                                    if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                        builderFrom.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                                    }
                                    SessionConfig sessionConfig = this.mSessionConfig;
                                    if (sessionConfig != null) {
                                        builderFrom.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                                    }
                                    builderFrom.addImplementationOptions(captureConfig.getImplementationOptions());
                                    CaptureRequest captureRequestBuild = Camera2CaptureRequestBuilder.build(builderFrom.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, false, this.mTemplateParamsOverride);
                                    if (captureRequestBuild == null) {
                                        Logger.d(TAG, "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<CameraCaptureCallback> it2 = captureConfig.getCameraCaptureCallbacks().iterator();
                                    while (it2.hasNext()) {
                                        CaptureCallbackConverter.toCaptureCallback(it2.next(), arrayList2);
                                    }
                                    cameraBurstCaptureCallback.addCamera2Callbacks(captureRequestBuild, arrayList2);
                                    arrayList.add(captureRequestBuild);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e6) {
                    Logger.e(TAG, "Unable to access camera: " + e6.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z6)) {
                    this.mSynchronizedCaptureSession.stopRepeating();
                    cameraBurstCaptureCallback.setCaptureSequenceCallback(new h0(this));
                }
                if (this.mTorchStateReset.isTorchResetRequired(arrayList, z6)) {
                    cameraBurstCaptureCallback.addCamera2Callbacks((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                            synchronized (CaptureSession.this.mSessionLock) {
                                try {
                                    SessionConfig sessionConfig2 = CaptureSession.this.mSessionConfig;
                                    if (sessionConfig2 == null) {
                                        return;
                                    }
                                    CaptureConfig repeatingCaptureConfig = sessionConfig2.getRepeatingCaptureConfig();
                                    Logger.d(CaptureSession.TAG, "Submit FLASH_MODE_OFF request");
                                    CaptureSession captureSession = CaptureSession.this;
                                    captureSession.issueCaptureRequests(Collections.singletonList(captureSession.mTorchStateReset.createTorchResetRequest(repeatingCaptureConfig)));
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }));
                }
                return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mCaptureConfigs.addAll(list);
                        break;
                    case OPENED:
                        this.mCaptureConfigs.addAll(list);
                        issuePendingCaptureRequest();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public void issuePendingCaptureRequest() {
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new x(1, this), CameraXExecutors.directExecutor());
    }

    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (sessionConfig == null) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.mState != State.OPENED) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e6) {
                    Logger.e(TAG, "Unable to access camera: " + e6.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                Logger.d(TAG, "Issuing request for session.");
                CaptureRequest captureRequestBuild = Camera2CaptureRequestBuilder.build(repeatingCaptureConfig, this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, true, this.mTemplateParamsOverride);
                if (captureRequestBuild == null) {
                    Logger.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(captureRequestBuild, this.mRequestMonitor.createMonitorListener(createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), new CameraCaptureSession.CaptureCallback[0])));
            } catch (CameraAccessException e7) {
                Logger.e(TAG, "Unable to access camera: " + e7.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public c5.a<Void> open(final SessionConfig sessionConfig, final CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        synchronized (this.mSessionLock) {
            try {
                if (this.mState.ordinal() != 1) {
                    Logger.e(TAG, "Open not allowed in state: " + this.mState);
                    return Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
                }
                this.mState = State.GET_SURFACE;
                ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
                this.mConfiguredDeferrableSurfaces = arrayList;
                this.mSessionOpener = opener;
                FutureChain futureChainTransformAsync = FutureChain.from(opener.startWithDeferrableSurface(arrayList, TIMEOUT_GET_SURFACE_IN_MS)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.c1
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final c5.a apply(Object obj) {
                        return this.s.lambda$open$0(sessionConfig, cameraDevice, (List) obj);
                    }
                }, this.mSessionOpener.getExecutor());
                Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        synchronized (CaptureSession.this.mSessionLock) {
                            try {
                                CaptureSession.this.mSessionOpener.stop();
                                int iOrdinal = CaptureSession.this.mState.ordinal();
                                if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                                    Logger.w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th);
                                    CaptureSession.this.finishClose();
                                }
                            } finally {
                            }
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r12) {
                    }
                }, this.mSessionOpener.getExecutor());
                return Futures.nonCancellationPropagating(futureChainTransformAsync);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public c5.a<Void> release(boolean z6) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.mState);
                case GET_SURFACE:
                    androidx.work.j.e("The Opener shouldn't null in state:" + this.mState, this.mSessionOpener);
                    this.mSessionOpener.stop();
                case INITIALIZED:
                    this.mState = State.RELEASED;
                    return Futures.immediateFuture(null);
                case OPENED:
                case CLOSED:
                    SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
                    if (synchronizedCaptureSession != null) {
                        if (z6) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (CameraAccessException e6) {
                                Logger.e(TAG, "Unable to abort captures.", e6);
                            }
                        }
                        this.mSynchronizedCaptureSession.close();
                    }
                case OPENING:
                    this.mState = State.RELEASING;
                    this.mRequestMonitor.stop();
                    androidx.work.j.e("The Opener shouldn't null in state:" + this.mState, this.mSessionOpener);
                    if (this.mSessionOpener.stop()) {
                        finishClose();
                        return Futures.immediateFuture(null);
                    }
                case RELEASING:
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = y.b.a(new o0(3, this));
                    }
                    return this.mReleaseFuture;
                default:
                    return Futures.immediateFuture(null);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            try {
                switch (this.mState) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.mSessionConfig = sessionConfig;
                        break;
                    case OPENED:
                        this.mSessionConfig = sessionConfig;
                        if (sessionConfig != null) {
                            if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                                Logger.e(TAG, "Does not have the proper configured lists");
                                return;
                            } else {
                                Logger.d(TAG, "Attempting to submit CaptureRequest after setting");
                                issueRepeatingCaptureRequests(this.mSessionConfig);
                                break;
                            }
                        } else {
                            return;
                        }
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(Map<DeferrableSurface, Long> map) {
        synchronized (this.mSessionLock) {
            this.mStreamUseCaseMap = map;
        }
    }

    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
            } else {
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e6) {
                    Logger.e(TAG, "Unable to stop repeating.", e6);
                }
            }
        }
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, boolean z6) {
        this(dynamicRangesCompat, new Quirks(Collections.EMPTY_LIST), z6);
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks) {
        this(dynamicRangesCompat, quirks, false);
    }

    public CaptureSession(DynamicRangesCompat dynamicRangesCompat, Quirks quirks, boolean z6) {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.EMPTY_LIST;
        this.mState = State.UNINITIALIZED;
        this.mStreamUseCaseMap = new HashMap();
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mTorchStateReset = new TorchStateReset();
        this.mState = State.INITIALIZED;
        this.mDynamicRangesCompat = dynamicRangesCompat;
        this.mCaptureSessionStateCallback = new StateCallback();
        this.mRequestMonitor = new RequestMonitor(quirks.contains(CaptureNoResponseQuirk.class));
        this.mTemplateParamsOverride = new TemplateParamsOverride(quirks);
        this.mCanUseMultiResolutionImageReader = z6;
    }
}
