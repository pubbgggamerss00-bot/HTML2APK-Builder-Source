package androidx.camera.lifecycle;

import android.content.Context;
import android.os.Trace;
import androidx.camera.camera2.interop.b;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.ExperimentalCameraInfo;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.b0;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.m;
import e5.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import p5.l;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    public static final Companion Companion = new Companion(null);
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private final Map<CameraUseCaseAdapter.CameraId, RestrictedCameraInfo> mCameraInfoMap;
    private CameraX mCameraX;
    private CameraXConfig.Provider mCameraXConfigProvider;
    private c5.a<CameraX> mCameraXInitializeFuture;
    private c5.a<Void> mCameraXShutdownFuture;
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository;
    private final Object mLock = new Object();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProcessCameraProvider getInstance$lambda$0(l lVar, Object obj) {
            j.e("$tmp0", lVar);
            return (ProcessCameraProvider) lVar.invoke(obj);
        }

        @ExperimentalCameraProviderConfiguration
        public final void configureInstance(CameraXConfig cameraXConfig) {
            j.e("cameraXConfig", cameraXConfig);
            Trace.beginSection(d2.a.d("CX:configureInstance"));
            try {
                ProcessCameraProvider.sAppInstance.configureInstanceInternal(cameraXConfig);
            } finally {
                Trace.endSection();
            }
        }

        public final c5.a<ProcessCameraProvider> getInstance(Context context) {
            j.e("context", context);
            c5.a<ProcessCameraProvider> aVarTransform = Futures.transform(ProcessCameraProvider.sAppInstance.getOrCreateCameraXInstance(context), new b(new ProcessCameraProvider$Companion$getInstance$1(context)), CameraXExecutors.directExecutor());
            j.d("context: Context): Liste…tExecutor()\n            )", aVarTransform);
            return aVarTransform;
        }

        private Companion() {
        }
    }

    private ProcessCameraProvider() {
        c5.a<Void> aVarImmediateFuture = Futures.immediateFuture(null);
        j.d("immediateFuture<Void>(null)", aVarImmediateFuture);
        this.mCameraXShutdownFuture = aVarImmediateFuture;
        this.mLifecycleCameraRepository = new LifecycleCameraRepository();
        this.mCameraInfoMap = new HashMap();
    }

    @ExperimentalCameraProviderConfiguration
    public static final void configureInstance(CameraXConfig cameraXConfig) {
        Companion.configureInstance(cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureInstanceInternal(final CameraXConfig cameraXConfig) {
        Trace.beginSection(d2.a.d("CX:configureInstanceInternal"));
        try {
            synchronized (this.mLock) {
                cameraXConfig.getClass();
                androidx.work.j.f("CameraX has already been configured. To use a different configuration, shutdown() must be called.", this.mCameraXConfigProvider == null);
                this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$configureInstanceInternal$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                };
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return new ArrayList();
        }
        j.b(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        j.d("mCameraX!!.cameraFactory…tiveConcurrentCameraInfos", activeConcurrentCameraInfos);
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            j.d("cameraSelector.cameraFilterSet", next);
            CameraFilter cameraFilter = next;
            if (!j.a(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.mContext;
                j.b(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return 0;
        }
        j.b(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    public static final c5.a<ProcessCameraProvider> getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c5.a<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            c5.a<CameraX> aVar = this.mCameraXInitializeFuture;
            if (aVar != null) {
                return aVar;
            }
            b.d dVarA = y.b.a(new b0(3, this, new CameraX(context, this.mCameraXConfigProvider)));
            this.mCameraXInitializeFuture = dVarA;
            return dVarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrCreateCameraXInstance$lambda$18$lambda$17(ProcessCameraProvider processCameraProvider, final CameraX cameraX, final b.a aVar) {
        j.e("this$0", processCameraProvider);
        j.e("$cameraX", cameraX);
        j.e("completer", aVar);
        synchronized (processCameraProvider.mLock) {
            FutureChain futureChainTransformAsync = FutureChain.from(processCameraProvider.mCameraXShutdownFuture).transformAsync(new androidx.camera.core.l(new ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1(cameraX)), CameraXExecutors.directExecutor());
            j.d("cameraX = CameraX(contex…                        )", futureChainTransformAsync);
            Futures.addCallback(futureChainTransformAsync, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    j.e("t", th);
                    aVar.b(th);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r22) {
                    aVar.a(cameraX);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.a getOrCreateCameraXInstance$lambda$18$lambda$17$lambda$16$lambda$15(l lVar, Object obj) {
        j.e("$tmp0", lVar);
        return (c5.a) lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        j.b(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i6) {
        CameraX cameraX = this.mCameraX;
        if (cameraX == null) {
            return;
        }
        j.b(cameraX);
        cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setContext(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shutdownAsync$lambda$0(ProcessCameraProvider processCameraProvider) {
        j.e("this$0", processCameraProvider);
        processCameraProvider.unbindAll();
        processCameraProvider.mLifecycleCameraRepository.clear();
    }

    public final Camera bindToLifecycle(m mVar, CameraSelector cameraSelector, UseCase... useCaseArr) {
        j.e("lifecycleOwner", mVar);
        j.e("cameraSelector", cameraSelector);
        j.e("useCases", useCaseArr);
        Trace.beginSection(d2.a.d("CX:bindToLifecycle"));
        try {
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            setCameraOperatingMode(1);
            LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
            j.d("DEFAULT", layoutSettings);
            j.d("DEFAULT", layoutSettings);
            Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(mVar, cameraSelector, null, layoutSettings, layoutSettings, null, s.s, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
            Trace.endSection();
            return cameraBindToLifecycle$camera_lifecycle_release;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Camera bindToLifecycle$camera_lifecycle_release(m mVar, CameraSelector cameraSelector, CameraSelector cameraSelector2, LayoutSettings layoutSettings, LayoutSettings layoutSettings2, ViewPort viewPort, List<? extends CameraEffect> list, UseCase... useCaseArr) {
        CameraInternal cameraInternalSelect;
        RestrictedCameraInfo restrictedCameraInfo;
        j.e("lifecycleOwner", mVar);
        j.e("primaryCameraSelector", cameraSelector);
        j.e("primaryLayoutSettings", layoutSettings);
        j.e("secondaryLayoutSettings", layoutSettings2);
        j.e("effects", list);
        j.e("useCases", useCaseArr);
        Trace.beginSection(d2.a.d("CX:bindToLifecycle-internal"));
        try {
            Threads.checkMainThread();
            CameraX cameraX = this.mCameraX;
            j.b(cameraX);
            CameraInternal cameraInternalSelect2 = cameraSelector.select(cameraX.getCameraRepository().getCameras());
            j.d("primaryCameraSelector.se…cameraRepository.cameras)", cameraInternalSelect2);
            cameraInternalSelect2.setPrimary(true);
            CameraInfo cameraInfo = getCameraInfo(cameraSelector);
            j.c("null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo", cameraInfo);
            RestrictedCameraInfo restrictedCameraInfo2 = (RestrictedCameraInfo) cameraInfo;
            if (cameraSelector2 != null) {
                CameraX cameraX2 = this.mCameraX;
                j.b(cameraX2);
                cameraInternalSelect = cameraSelector2.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect.setPrimary(false);
                CameraInfo cameraInfo2 = getCameraInfo(cameraSelector2);
                j.c("null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo", cameraInfo2);
                restrictedCameraInfo = (RestrictedCameraInfo) cameraInfo2;
            } else {
                cameraInternalSelect = null;
                restrictedCameraInfo = null;
            }
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(mVar, CameraUseCaseAdapter.generateCameraId(restrictedCameraInfo2, restrictedCameraInfo));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            ArrayList arrayList = new ArrayList();
            for (UseCase useCase : useCaseArr) {
                if (useCase != null) {
                    arrayList.add(useCase);
                }
            }
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                UseCase useCase2 = (UseCase) obj;
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    int i7 = size;
                    j.d("lifecycleCameras", lifecycleCamera2);
                    LifecycleCamera lifecycleCamera3 = lifecycleCamera2;
                    if (lifecycleCamera3.isBound(useCase2) && !lifecycleCamera3.equals(lifecycleCamera)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{useCase2}, 1)));
                    }
                    size = i7;
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository = this.mLifecycleCameraRepository;
                CameraX cameraX3 = this.mCameraX;
                j.b(cameraX3);
                CameraCoordinator cameraCoordinator = cameraX3.getCameraFactory().getCameraCoordinator();
                CameraX cameraX4 = this.mCameraX;
                j.b(cameraX4);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX4.getCameraDeviceSurfaceManager();
                CameraX cameraX5 = this.mCameraX;
                j.b(cameraX5);
                lifecycleCamera = lifecycleCameraRepository.createLifecycleCamera(mVar, new CameraUseCaseAdapter(cameraInternalSelect2, cameraInternalSelect, restrictedCameraInfo2, restrictedCameraInfo, layoutSettings, layoutSettings2, cameraCoordinator, cameraDeviceSurfaceManager, cameraX5.getDefaultConfigFactory()));
            }
            LifecycleCamera lifecycleCamera4 = lifecycleCamera;
            if (useCaseArr.length == 0) {
                j.b(lifecycleCamera4);
            } else {
                LifecycleCameraRepository lifecycleCameraRepository2 = this.mLifecycleCameraRepository;
                j.b(lifecycleCamera4);
                List listC = e5.l.c(Arrays.copyOf(useCaseArr, useCaseArr.length));
                CameraX cameraX6 = this.mCameraX;
                j.b(cameraX6);
                lifecycleCameraRepository2.bindToLifecycleCamera(lifecycleCamera4, viewPort, list, listC, cameraX6.getCameraFactory().getCameraCoordinator());
            }
            Trace.endSection();
            return lifecycleCamera4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection(d2.a.d("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.mCameraX;
            j.b(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            j.d("mCameraX!!.cameraRepository.cameras", cameras);
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                j.d("camera.cameraInfo", cameraInfo);
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    public final List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection(d2.a.d("CX:getAvailableConcurrentCameraInfos"));
        try {
            Objects.requireNonNull(this.mCameraX);
            CameraX cameraX = this.mCameraX;
            j.b(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.mCameraX;
            j.b(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            j.d("mCameraX!!.cameraFactory…concurrentCameraSelectors", concurrentCameraSelectors);
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        j.d("cameraSelector", cameraSelector);
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                arrayList.add(arrayList2);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    @ExperimentalCameraInfo
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        Object restrictedCameraInfo;
        j.e("cameraSelector", cameraSelector);
        Trace.beginSection(d2.a.d("CX:getCameraInfo"));
        try {
            CameraX cameraX = this.mCameraX;
            j.b(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            j.d("cameraSelector.select(mC…meras).cameraInfoInternal", cameraInfoInternal);
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            CameraUseCaseAdapter.CameraId cameraIdCreate = CameraUseCaseAdapter.CameraId.create(cameraInfoInternal.getCameraId(), cameraConfig.getCompatibilityId());
            j.d("create(\n                …ilityId\n                )", cameraIdCreate);
            synchronized (this.mLock) {
                restrictedCameraInfo = this.mCameraInfoMap.get(cameraIdCreate);
                if (restrictedCameraInfo == null) {
                    restrictedCameraInfo = new RestrictedCameraInfo(cameraInfoInternal, cameraConfig);
                    this.mCameraInfoMap.put(cameraIdCreate, restrictedCameraInfo);
                }
            }
            return (RestrictedCameraInfo) restrictedCameraInfo;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) {
        boolean z6;
        j.e("cameraSelector", cameraSelector);
        Trace.beginSection(d2.a.d("CX:hasCamera"));
        try {
            CameraX cameraX = this.mCameraX;
            j.b(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z6 = true;
        } catch (IllegalArgumentException unused) {
            z6 = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z6;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(UseCase useCase) {
        j.e("useCase", useCase);
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            j.d("mLifecycleCameraRepository.lifecycleCameras", lifecycleCamera);
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    public final c5.a<Void> shutdownAsync() {
        Threads.runOnMainSync(new a(0, this));
        CameraX cameraX = this.mCameraX;
        if (cameraX != null) {
            cameraX.getCameraFactory().getCameraCoordinator().shutdown();
        }
        CameraX cameraX2 = this.mCameraX;
        c5.a<Void> aVarShutdown = cameraX2 != null ? cameraX2.shutdown() : Futures.immediateFuture(null);
        j.d("if (mCameraX != null) mC…mediateFuture<Void>(null)", aVarShutdown);
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = aVarShutdown;
            this.mCameraInfoMap.clear();
        }
        this.mCameraX = null;
        this.mContext = null;
        return aVarShutdown;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(UseCase... useCaseArr) {
        j.e("useCases", useCaseArr);
        Trace.beginSection(d2.a.d("CX:unbind"));
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.mLifecycleCameraRepository.unbind(e5.l.c(Arrays.copyOf(useCaseArr, useCaseArr.length)));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbindAll() {
        Trace.beginSection(d2.a.d("CX:unbindAll"));
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            this.mLifecycleCameraRepository.unbindAll();
        } finally {
            Trace.endSection();
        }
    }

    public final Camera bindToLifecycle(m mVar, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        j.e("lifecycleOwner", mVar);
        j.e("cameraSelector", cameraSelector);
        j.e("useCaseGroup", useCaseGroup);
        Trace.beginSection(d2.a.d("CX:bindToLifecycle-UseCaseGroup"));
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
                j.d("DEFAULT", layoutSettings);
                j.d("DEFAULT", layoutSettings);
                ViewPort viewPort = useCaseGroup.getViewPort();
                List<CameraEffect> effects = useCaseGroup.getEffects();
                j.d("useCaseGroup.effects", effects);
                List<UseCase> useCases = useCaseGroup.getUseCases();
                j.d("useCaseGroup.useCases", useCases);
                UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
                Camera cameraBindToLifecycle$camera_lifecycle_release = bindToLifecycle$camera_lifecycle_release(mVar, cameraSelector, null, layoutSettings, layoutSettings, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
                Trace.endSection();
                return cameraBindToLifecycle$camera_lifecycle_release;
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa A[Catch: all -> 0x026b, TRY_ENTER, TryCatch #1 {all -> 0x026b, blocks: (B:50:0x01b9, B:52:0x01c7, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0270, B:66:0x0274, B:68:0x027a), top: B:89:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0270 A[Catch: all -> 0x026b, TryCatch #1 {all -> 0x026b, blocks: (B:50:0x01b9, B:52:0x01c7, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0270, B:66:0x0274, B:68:0x027a), top: B:89:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027a A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #1 {all -> 0x026b, blocks: (B:50:0x01b9, B:52:0x01c7, B:61:0x0209, B:57:0x01fa, B:59:0x0200, B:65:0x0270, B:66:0x0274, B:68:0x027a), top: B:89:0x01b9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConcurrentCamera bindToLifecycle(List<ConcurrentCamera.SingleCameraConfig> list) throws Throwable {
        j.e("singleCameraConfigs", list);
        Trace.beginSection(d2.a.d("CX:bindToLifecycle-Concurrent"));
        try {
            if (list.size() >= 2) {
                if (list.size() <= 2) {
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig = list.get(0);
                    j.b(singleCameraConfig);
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig2 = singleCameraConfig;
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig3 = list.get(1);
                    j.b(singleCameraConfig3);
                    ConcurrentCamera.SingleCameraConfig singleCameraConfig4 = singleCameraConfig3;
                    ArrayList arrayList = new ArrayList();
                    if (j.a(singleCameraConfig2.getCameraSelector().getLensFacing(), singleCameraConfig4.getCameraSelector().getLensFacing())) {
                        if (getCameraOperatingMode() != 2) {
                            if (j.a(singleCameraConfig2.getLifecycleOwner(), singleCameraConfig4.getLifecycleOwner()) && j.a(singleCameraConfig2.getUseCaseGroup().getViewPort(), singleCameraConfig4.getUseCaseGroup().getViewPort()) && j.a(singleCameraConfig2.getUseCaseGroup().getEffects(), singleCameraConfig4.getUseCaseGroup().getEffects())) {
                                m lifecycleOwner = singleCameraConfig2.getLifecycleOwner();
                                j.d("firstCameraConfig.lifecycleOwner", lifecycleOwner);
                                CameraSelector cameraSelector = singleCameraConfig2.getCameraSelector();
                                j.d("firstCameraConfig.cameraSelector", cameraSelector);
                                ViewPort viewPort = singleCameraConfig2.getUseCaseGroup().getViewPort();
                                List<CameraEffect> effects = singleCameraConfig2.getUseCaseGroup().getEffects();
                                j.d("firstCameraConfig.useCaseGroup.effects", effects);
                                ArrayList arrayList2 = new ArrayList();
                                for (ConcurrentCamera.SingleCameraConfig singleCameraConfig5 : list) {
                                    j.b(singleCameraConfig5);
                                    for (UseCase useCase : singleCameraConfig5.getUseCaseGroup().getUseCases()) {
                                        j.d("config!!.useCaseGroup.useCases", useCase);
                                        UseCase useCase2 = useCase;
                                        String physicalCameraId = singleCameraConfig5.getCameraSelector().getPhysicalCameraId();
                                        if (physicalCameraId != null) {
                                            useCase2.setPhysicalCameraId(physicalCameraId);
                                        }
                                    }
                                    List<UseCase> useCases = singleCameraConfig5.getUseCaseGroup().getUseCases();
                                    j.d("config.useCaseGroup.useCases", useCases);
                                    arrayList2.addAll(useCases);
                                }
                                setCameraOperatingMode(1);
                                LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
                                j.d("DEFAULT", layoutSettings);
                                j.d("DEFAULT", layoutSettings);
                                UseCase[] useCaseArr = (UseCase[]) arrayList2.toArray(new UseCase[0]);
                                arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner, cameraSelector, null, layoutSettings, layoutSettings, viewPort, effects, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length)));
                            } else {
                                throw new IllegalArgumentException("Two camera configs need to have the same lifecycle owner, view port and effects.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                        }
                    } else {
                        Context context = this.mContext;
                        j.b(context);
                        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                            if (getCameraOperatingMode() != 1) {
                                ArrayList arrayList3 = new ArrayList();
                                try {
                                    CameraSelector cameraSelector2 = singleCameraConfig2.getCameraSelector();
                                    j.d("firstCameraConfig.cameraSelector", cameraSelector2);
                                    CameraInfo cameraInfo = getCameraInfo(cameraSelector2);
                                    CameraSelector cameraSelector3 = singleCameraConfig4.getCameraSelector();
                                    j.d("secondCameraConfig.cameraSelector", cameraSelector3);
                                    CameraInfo cameraInfo2 = getCameraInfo(cameraSelector3);
                                    arrayList3.add(cameraInfo);
                                    arrayList3.add(cameraInfo2);
                                    if (!getActiveConcurrentCameraInfos().isEmpty() && !arrayList3.equals(getActiveConcurrentCameraInfos())) {
                                        throw new UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras.");
                                    }
                                    setCameraOperatingMode(2);
                                    if (Objects.equals(singleCameraConfig2.getUseCaseGroup().getUseCases(), singleCameraConfig4.getUseCaseGroup().getUseCases())) {
                                        try {
                                            if (singleCameraConfig2.getUseCaseGroup().getUseCases().size() == 2) {
                                                UseCase useCase3 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(0);
                                                UseCase useCase4 = singleCameraConfig2.getUseCaseGroup().getUseCases().get(1);
                                                j.d("useCase0", useCase3);
                                                if (isVideoCapture(useCase3)) {
                                                    j.d("useCase1", useCase4);
                                                    if (!isPreview(useCase4)) {
                                                        if (isPreview(useCase3)) {
                                                            j.d("useCase1", useCase4);
                                                            if (isVideoCapture(useCase4)) {
                                                            }
                                                            setActiveConcurrentCameraInfos(arrayList3);
                                                        }
                                                        for (ConcurrentCamera.SingleCameraConfig singleCameraConfig6 : list) {
                                                            j.b(singleCameraConfig6);
                                                            m lifecycleOwner2 = singleCameraConfig6.getLifecycleOwner();
                                                            j.d("config!!.lifecycleOwner", lifecycleOwner2);
                                                            CameraSelector cameraSelector4 = singleCameraConfig6.getCameraSelector();
                                                            j.d("config.cameraSelector", cameraSelector4);
                                                            LayoutSettings layoutSettings2 = LayoutSettings.DEFAULT;
                                                            j.d("DEFAULT", layoutSettings2);
                                                            j.d("DEFAULT", layoutSettings2);
                                                            ViewPort viewPort2 = singleCameraConfig6.getUseCaseGroup().getViewPort();
                                                            List<CameraEffect> effects2 = singleCameraConfig6.getUseCaseGroup().getEffects();
                                                            j.d("config.useCaseGroup.effects", effects2);
                                                            List<UseCase> useCases2 = singleCameraConfig6.getUseCaseGroup().getUseCases();
                                                            j.d("config.useCaseGroup.useCases", useCases2);
                                                            UseCase[] useCaseArr2 = (UseCase[]) useCases2.toArray(new UseCase[0]);
                                                            arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner2, cameraSelector4, null, layoutSettings2, layoutSettings2, viewPort2, effects2, (UseCase[]) Arrays.copyOf(useCaseArr2, useCaseArr2.length)));
                                                        }
                                                        setActiveConcurrentCameraInfos(arrayList3);
                                                    }
                                                    m lifecycleOwner3 = singleCameraConfig2.getLifecycleOwner();
                                                    j.d("firstCameraConfig.lifecycleOwner", lifecycleOwner3);
                                                    CameraSelector cameraSelector5 = singleCameraConfig2.getCameraSelector();
                                                    j.d("firstCameraConfig.cameraSelector", cameraSelector5);
                                                    CameraSelector cameraSelector6 = singleCameraConfig4.getCameraSelector();
                                                    LayoutSettings layoutSettings3 = singleCameraConfig2.getLayoutSettings();
                                                    j.d("firstCameraConfig.layoutSettings", layoutSettings3);
                                                    LayoutSettings layoutSettings4 = singleCameraConfig4.getLayoutSettings();
                                                    j.d("secondCameraConfig.layoutSettings", layoutSettings4);
                                                    ViewPort viewPort3 = singleCameraConfig2.getUseCaseGroup().getViewPort();
                                                    List<CameraEffect> effects3 = singleCameraConfig2.getUseCaseGroup().getEffects();
                                                    j.d("firstCameraConfig.useCaseGroup.effects", effects3);
                                                    List<UseCase> useCases3 = singleCameraConfig2.getUseCaseGroup().getUseCases();
                                                    j.d("firstCameraConfig.useCaseGroup.useCases", useCases3);
                                                    UseCase[] useCaseArr3 = (UseCase[]) useCases3.toArray(new UseCase[0]);
                                                    arrayList.add(bindToLifecycle$camera_lifecycle_release(lifecycleOwner3, cameraSelector5, cameraSelector6, layoutSettings3, layoutSettings4, viewPort3, effects3, (UseCase[]) Arrays.copyOf(useCaseArr3, useCaseArr3.length)));
                                                    setActiveConcurrentCameraInfos(arrayList3);
                                                }
                                            } else {
                                                while (r0.hasNext()) {
                                                }
                                                setActiveConcurrentCameraInfos(arrayList3);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            Trace.endSection();
                                            throw th;
                                        }
                                    }
                                } catch (IllegalArgumentException unused) {
                                    throw new IllegalArgumentException("Invalid camera selectors in camera configs.");
                                }
                            } else {
                                throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras.");
                            }
                        } else {
                            throw new UnsupportedOperationException("Concurrent camera is not supported on the device.");
                        }
                    }
                    ConcurrentCamera concurrentCamera = new ConcurrentCamera(arrayList);
                    Trace.endSection();
                    return concurrentCamera;
                }
                throw new IllegalArgumentException("Concurrent camera is only supporting two cameras at maximum.");
            }
            throw new IllegalArgumentException("Concurrent camera needs two camera configs.");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
