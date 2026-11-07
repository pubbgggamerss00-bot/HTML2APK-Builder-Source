package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.workaround.c;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.work.j;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements Camera {
    private static final String TAG = "CameraUseCaseAdapter";
    private final RestrictedCameraControl mAdapterCameraControl;
    private final RestrictedCameraInfo mAdapterCameraInfo;
    private final RestrictedCameraInfo mAdapterSecondaryCameraInfo;
    private final List<UseCase> mAppUseCases;
    private boolean mAttached;
    private final CameraConfig mCameraConfig;
    private final CameraCoordinator mCameraCoordinator;
    private final CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;
    private final CameraInternal mCameraInternal;
    private final List<UseCase> mCameraUseCases;
    private List<CameraEffect> mEffects;
    private final CameraId mId;
    private Config mInteropConfig;
    private final LayoutSettings mLayoutSettings;
    private final Object mLock;
    private UseCase mPlaceholderForExtensions;
    private final CameraInternal mSecondaryCameraInternal;
    private final LayoutSettings mSecondaryLayoutSettings;
    private StreamSharing mStreamSharing;
    private final UseCaseConfigFactory mUseCaseConfigFactory;
    private ViewPort mViewPort;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }

        public CameraException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class CameraId {
        public static CameraId create(String str, Identifier identifier) {
            return new AutoValue_CameraUseCaseAdapter_CameraId(str, identifier);
        }

        public abstract Identifier getCameraConfigId();

        public abstract String getCameraIdString();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class ConfigPair {
        UseCaseConfig<?> mCameraConfig;
        UseCaseConfig<?> mExtendedConfig;

        public ConfigPair(UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
            this.mExtendedConfig = useCaseConfig;
            this.mCameraConfig = useCaseConfig2;
        }
    }

    public CameraUseCaseAdapter(CameraInternal cameraInternal, CameraCoordinator cameraCoordinator, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        RestrictedCameraInfo restrictedCameraInfo = new RestrictedCameraInfo(cameraInternal.getCameraInfoInternal(), CameraConfigs.defaultConfig());
        LayoutSettings layoutSettings = LayoutSettings.DEFAULT;
        this(cameraInternal, null, restrictedCameraInfo, null, layoutSettings, layoutSettings, cameraCoordinator, cameraDeviceSurfaceManager, useCaseConfigFactory);
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    public static Collection<UseCase> calculateCameraUseCases(Collection<UseCase> collection, UseCase useCase, StreamSharing streamSharing) {
        ArrayList arrayList = new ArrayList(collection);
        if (useCase != null) {
            arrayList.add(useCase);
        }
        if (streamSharing != null) {
            arrayList.add(streamSharing);
            arrayList.removeAll(streamSharing.getChildren());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private UseCase calculatePlaceholderForExtensions(Collection<UseCase> collection, StreamSharing streamSharing) {
        UseCase useCaseCreateExtraImageCapture;
        synchronized (this.mLock) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (streamSharing != null) {
                    arrayList.add(streamSharing);
                    arrayList.removeAll(streamSharing.getChildren());
                }
                if (!isCoexistingPreviewImageCaptureRequired()) {
                    useCaseCreateExtraImageCapture = null;
                } else if (isExtraPreviewRequired(arrayList)) {
                    useCaseCreateExtraImageCapture = isPreview(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraPreview();
                } else if (isExtraImageCaptureRequired(arrayList)) {
                    useCaseCreateExtraImageCapture = isImageCapture(this.mPlaceholderForExtensions) ? this.mPlaceholderForExtensions : createExtraImageCapture();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return useCaseCreateExtraImageCapture;
    }

    private static Matrix calculateSensorToBufferTransformMatrix(Rect rect, Size size) {
        j.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<UseCase, StreamSpec> calculateSuggestedStreamSpecs(int i6, CameraInfoInternal cameraInfoInternal, Collection<UseCase> collection, Collection<UseCase> collection2, Map<UseCase, ConfigPair> map) {
        Rect sensorRect;
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator<UseCase> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UseCase next = it.next();
            SurfaceConfig surfaceConfigTransformSurfaceConfig = this.mCameraDeviceSurfaceManager.transformSurfaceConfig(i6, cameraId, next.getImageFormat(), next.getAttachedSurfaceResolution());
            int imageFormat = next.getImageFormat();
            Size attachedSurfaceResolution = next.getAttachedSurfaceResolution();
            StreamSpec attachedStreamSpec = next.getAttachedStreamSpec();
            attachedStreamSpec.getClass();
            AttachedSurfaceInfo attachedSurfaceInfoCreate = AttachedSurfaceInfo.create(surfaceConfigTransformSurfaceConfig, imageFormat, attachedSurfaceResolution, attachedStreamSpec.getDynamicRange(), StreamSharing.getCaptureTypes(next), next.getAttachedStreamSpec().getImplementationOptions(), next.getCurrentConfig().getTargetFrameRate(null));
            arrayList.add(attachedSurfaceInfoCreate);
            map3.put(attachedSurfaceInfoCreate, next);
            map2.put(next, next.getAttachedStreamSpec());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                sensorRect = this.mCameraInternal.getCameraControlInternal().getSensorRect();
            } catch (NullPointerException unused) {
                sensorRect = null;
            }
            SupportedOutputSizesSorter supportedOutputSizesSorter = new SupportedOutputSizesSorter(cameraInfoInternal, sensorRect != null ? TransformUtils.rectToSize(sensorRect) : null);
            boolean z6 = false;
            for (UseCase useCase : collection) {
                ConfigPair configPair = map.get(useCase);
                UseCaseConfig<?> useCaseConfigMergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                map4.put(useCaseConfigMergeConfigs, useCase);
                map5.put(useCaseConfigMergeConfigs, supportedOutputSizesSorter.getSortedSupportedOutputSizes(useCaseConfigMergeConfigs));
                if (useCase.getCurrentConfig() instanceof PreviewConfig) {
                    z6 = ((PreviewConfig) useCase.getCurrentConfig()).getPreviewStabilizationMode() == 2;
                }
            }
            Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> suggestedStreamSpecs = this.mCameraDeviceSurfaceManager.getSuggestedStreamSpecs(i6, cameraId, arrayList, map5, z6, hasVideoCapture(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((UseCase) entry.getValue(), (StreamSpec) ((Map) suggestedStreamSpecs.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) suggestedStreamSpecs.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((UseCase) map3.get(entry2.getKey()), (StreamSpec) entry2.getValue());
                }
            }
        }
        return map2;
    }

    private void checkUnsupportedFeatureCombinationAndThrow(Collection<UseCase> collection) {
        if (hasExtension()) {
            if (hasNonSdrConfig(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (hasUltraHdrImageCapture(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.mLock) {
            try {
                if (!this.mEffects.isEmpty() && hasUltraHdrImageCapture(collection)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    private ImageCapture createExtraImageCapture() {
        return new ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }

    private Preview createExtraPreview() {
        Preview previewBuild = new Preview.Builder().setTargetName("Preview-Extra").build();
        previewBuild.setSurfaceProvider(new c());
        return previewBuild;
    }

    private StreamSharing createOrReuseStreamSharing(Collection<UseCase> collection, boolean z6) {
        synchronized (this.mLock) {
            try {
                Set<UseCase> streamSharingChildren = getStreamSharingChildren(collection, z6);
                if (streamSharingChildren.size() >= 2 || (hasExtension() && hasVideoCapture(streamSharingChildren))) {
                    StreamSharing streamSharing = this.mStreamSharing;
                    if (streamSharing != null && streamSharing.getChildren().equals(streamSharingChildren)) {
                        StreamSharing streamSharing2 = this.mStreamSharing;
                        Objects.requireNonNull(streamSharing2);
                        return streamSharing2;
                    }
                    if (!isStreamSharingChildrenCombinationValid(streamSharingChildren)) {
                        return null;
                    }
                    return new StreamSharing(this.mCameraInternal, this.mSecondaryCameraInternal, this.mLayoutSettings, this.mSecondaryLayoutSettings, streamSharingChildren, this.mUseCaseConfigFactory);
                }
                return null;
            } finally {
            }
        }
    }

    public static CameraId generateCameraId(RestrictedCameraInfo restrictedCameraInfo, RestrictedCameraInfo restrictedCameraInfo2) {
        StringBuilder sb = new StringBuilder();
        sb.append(restrictedCameraInfo.getCameraId());
        sb.append(restrictedCameraInfo2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : restrictedCameraInfo2.getCameraId());
        return CameraId.create(sb.toString(), restrictedCameraInfo.getCameraConfig().getCompatibilityId());
    }

    private static UseCaseConfig<?> generateExtendedStreamSharingConfigFromPreview(UseCaseConfigFactory useCaseConfigFactory, StreamSharing streamSharing) {
        UseCaseConfig<?> defaultConfig = new Preview.Builder().build().getDefaultConfig(false, useCaseConfigFactory);
        if (defaultConfig == null) {
            return null;
        }
        MutableOptionsBundle mutableOptionsBundleFrom = MutableOptionsBundle.from((Config) defaultConfig);
        mutableOptionsBundleFrom.removeOption(TargetConfig.OPTION_TARGET_CLASS);
        return streamSharing.getUseCaseConfigBuilder(mutableOptionsBundleFrom).getUseCaseConfig();
    }

    private int getCameraMode() {
        synchronized (this.mLock) {
            try {
                return this.mCameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Map<UseCase, ConfigPair> getConfigs(Collection<UseCase> collection, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap map = new HashMap();
        for (UseCase useCase : collection) {
            map.put(useCase, new ConfigPair(StreamSharing.isStreamSharing(useCase) ? generateExtendedStreamSharingConfigFromPreview(useCaseConfigFactory, (StreamSharing) useCase) : useCase.getDefaultConfig(false, useCaseConfigFactory), useCase.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return map;
    }

    private int getSharingTargets(boolean z6) {
        int targets;
        synchronized (this.mLock) {
            try {
                Iterator<CameraEffect> it = this.mEffects.iterator();
                CameraEffect cameraEffect = null;
                while (true) {
                    targets = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    CameraEffect next = it.next();
                    if (TargetUtils.getNumberOfTargets(next.getTargets()) > 1) {
                        j.f("Can only have one sharing effect.", cameraEffect == null);
                        cameraEffect = next;
                    }
                }
                if (cameraEffect != null) {
                    targets = cameraEffect.getTargets();
                }
                if (z6) {
                    targets |= 3;
                }
            } finally {
            }
        }
        return targets;
    }

    private Set<UseCase> getStreamSharingChildren(Collection<UseCase> collection, boolean z6) {
        HashSet hashSet = new HashSet();
        int sharingTargets = getSharingTargets(z6);
        for (UseCase useCase : collection) {
            j.a("Only support one level of sharing for now.", !StreamSharing.isStreamSharing(useCase));
            if (useCase.isEffectTargetsSupported(sharingTargets)) {
                hashSet.add(useCase);
            }
        }
        return hashSet;
    }

    private boolean hasExtension() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = this.mCameraConfig.getSessionProcessor(null) != null;
        }
        return z6;
    }

    private static boolean hasImplementationOptionChanged(StreamSpec streamSpec, SessionConfig sessionConfig) {
        Config implementationOptions = streamSpec.getImplementationOptions();
        Config implementationOptions2 = sessionConfig.getImplementationOptions();
        if (implementationOptions.listOptions().size() != sessionConfig.getImplementationOptions().listOptions().size()) {
            return true;
        }
        for (Config.Option<?> option : implementationOptions.listOptions()) {
            if (!implementationOptions2.containsOption(option) || !Objects.equals(implementationOptions2.retrieveOption(option), implementationOptions.retrieveOption(option))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNonSdrConfig(Collection<UseCase> collection) {
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isNotSdr(it.next().getCurrentConfig().getDynamicRange())) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasUltraHdrImageCapture(Collection<UseCase> collection) {
        for (UseCase useCase : collection) {
            if (isImageCapture(useCase)) {
                UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
                Config.Option<?> option = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                if (currentConfig.containsOption(option)) {
                    Integer num = (Integer) currentConfig.retrieveOption(option);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean hasVideoCapture(Collection<UseCase> collection) {
        Iterator<UseCase> it = collection.iterator();
        while (it.hasNext()) {
            if (isVideoCapture(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = true;
            if (this.mCameraConfig.getUseCaseCombinationRequiredRule() != 1) {
                z6 = false;
            }
        }
        return z6;
    }

    private static boolean isExtraImageCaptureRequired(Collection<UseCase> collection) {
        boolean z6 = false;
        boolean z7 = false;
        for (UseCase useCase : collection) {
            if (isPreview(useCase) || StreamSharing.isStreamSharing(useCase)) {
                z6 = true;
            } else if (isImageCapture(useCase)) {
                z7 = true;
            }
        }
        return z6 && !z7;
    }

    private static boolean isExtraPreviewRequired(Collection<UseCase> collection) {
        boolean z6 = false;
        boolean z7 = false;
        for (UseCase useCase : collection) {
            if (isPreview(useCase) || StreamSharing.isStreamSharing(useCase)) {
                z7 = true;
            } else if (isImageCapture(useCase)) {
                z6 = true;
            }
        }
        return z6 && !z7;
    }

    private static boolean isImageCapture(UseCase useCase) {
        return useCase instanceof ImageCapture;
    }

    private static boolean isNotSdr(DynamicRange dynamicRange) {
        return (dynamicRange.getBitDepth() == 10) || (dynamicRange.getEncoding() != 1 && dynamicRange.getEncoding() != 0);
    }

    private static boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    public static boolean isStreamSharingChildrenCombinationValid(Collection<UseCase> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (UseCase useCase : collection) {
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr[i6];
                if (useCase.isEffectTargetsSupported(i7)) {
                    if (hashSet.contains(Integer.valueOf(i7))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i7));
                }
            }
        }
        return true;
    }

    private static boolean isVideoCapture(UseCase useCase) {
        if (useCase != null) {
            if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                return useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            }
            Log.e(TAG, useCase + " UseCase does not have capture type.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$0(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createExtraPreview$1(SurfaceRequest surfaceRequest) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, CameraXExecutors.directExecutor(), new t0.a() { // from class: androidx.camera.core.internal.a
            @Override // t0.a
            public final void accept(Object obj) {
                CameraUseCaseAdapter.lambda$createExtraPreview$0(surface, surfaceTexture, (SurfaceRequest.Result) obj);
            }
        });
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            try {
                if (this.mInteropConfig != null) {
                    this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List<CameraEffect> setEffectsOnUseCases(List<CameraEffect> list, Collection<UseCase> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (UseCase useCase : collection) {
            useCase.setEffect(null);
            for (CameraEffect cameraEffect : list) {
                if (useCase.isEffectTargetsSupported(cameraEffect.getTargets())) {
                    j.f(useCase + " already has effect" + useCase.getEffect(), useCase.getEffect() == null);
                    useCase.setEffect(cameraEffect);
                    arrayList.remove(cameraEffect);
                }
            }
        }
        return arrayList;
    }

    public static void updateEffects(List<CameraEffect> list, Collection<UseCase> collection, Collection<UseCase> collection2) {
        List<CameraEffect> effectsOnUseCases = setEffectsOnUseCases(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<CameraEffect> effectsOnUseCases2 = setEffectsOnUseCases(effectsOnUseCases, arrayList);
        if (effectsOnUseCases2.size() > 0) {
            Logger.w(TAG, "Unused effects: " + effectsOnUseCases2);
        }
    }

    private void updateViewPortAndSensorToBufferMatrix(Map<UseCase, StreamSpec> map, Collection<UseCase> collection) {
        Map<UseCase, StreamSpec> map2;
        synchronized (this.mLock) {
            try {
                if (this.mViewPort == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<UseCase, Rect> mapCalculateViewPortRects = ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), this.mCameraInternal.getCameraInfoInternal().getLensFacing() == 0, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), map2);
                    for (UseCase useCase : collection) {
                        Rect rect = mapCalculateViewPortRects.get(useCase);
                        rect.getClass();
                        useCase.setViewPortCropRect(rect);
                    }
                }
                for (UseCase useCase2 : collection) {
                    Rect sensorRect = this.mCameraInternal.getCameraControlInternal().getSensorRect();
                    StreamSpec streamSpec = map2.get(useCase2);
                    streamSpec.getClass();
                    useCase2.setSensorToBufferTransformMatrix(calculateSensorToBufferTransformMatrix(sensorRect, streamSpec.getResolution()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addUseCases(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            try {
                this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                if (cameraInternal != null) {
                    cameraInternal.setExtendedConfig(this.mCameraConfig);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
                linkedHashSet.addAll(collection);
                try {
                    CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                    updateUseCases(linkedHashSet, cameraInternal2 != null, cameraInternal2 != null);
                } catch (IllegalArgumentException e6) {
                    throw new CameraException(e6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            try {
                if (!this.mAttached) {
                    if (!this.mCameraUseCases.isEmpty()) {
                        this.mCameraInternal.setExtendedConfig(this.mCameraConfig);
                        CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                        if (cameraInternal != null) {
                            cameraInternal.setExtendedConfig(this.mCameraConfig);
                        }
                    }
                    this.mCameraInternal.attachUseCases(this.mCameraUseCases);
                    CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                    if (cameraInternal2 != null) {
                        cameraInternal2.attachUseCases(this.mCameraUseCases);
                    }
                    restoreInteropConfig();
                    Iterator<UseCase> it = this.mCameraUseCases.iterator();
                    while (it.hasNext()) {
                        it.next().notifyState();
                    }
                    this.mAttached = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            try {
                if (this.mAttached) {
                    this.mCameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                    if (cameraInternal != null) {
                        cameraInternal.detachUseCases(new ArrayList(this.mCameraUseCases));
                    }
                    cacheInteropConfig();
                    this.mAttached = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.mAdapterCameraControl;
    }

    public CameraId getCameraId() {
        return this.mId;
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.mAdapterCameraInfo;
    }

    public Collection<UseCase> getCameraUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mCameraUseCases);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        CameraConfig cameraConfig;
        synchronized (this.mLock) {
            cameraConfig = this.mCameraConfig;
        }
        return cameraConfig;
    }

    public CameraInfo getSecondaryCameraInfo() {
        return this.mAdapterSecondaryCameraInfo;
    }

    public List<UseCase> getUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mAppUseCases);
        }
        return arrayList;
    }

    public boolean isEquivalent(CameraUseCaseAdapter cameraUseCaseAdapter) {
        return getCameraId().equals(cameraUseCaseAdapter.getCameraId());
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z6, UseCase... useCaseArr) {
        Collection<UseCase> collectionAsList = Arrays.asList(useCaseArr);
        if (z6) {
            collectionAsList = calculateCameraUseCases(collectionAsList, null, createOrReuseStreamSharing(collectionAsList, true));
        }
        Collection<UseCase> collection = collectionAsList;
        synchronized (this.mLock) {
            try {
                try {
                    calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), collection, Collections.EMPTY_LIST, getConfigs(collection, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void removeUseCases(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.mAppUseCases);
            linkedHashSet.removeAll(collection);
            CameraInternal cameraInternal = this.mSecondaryCameraInternal;
            updateUseCases(linkedHashSet, cameraInternal != null, cameraInternal != null);
        }
    }

    public void setActiveResumingMode(boolean z6) {
        this.mCameraInternal.setActiveResumingMode(z6);
    }

    public void setEffects(List<CameraEffect> list) {
        synchronized (this.mLock) {
            this.mEffects = list;
        }
    }

    public void setViewPort(ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }

    public void updateUseCases(Collection<UseCase> collection) {
        updateUseCases(collection, false, false);
    }

    public void updateUseCases(Collection<UseCase> collection, boolean z6, boolean z7) {
        int i6;
        int i7;
        StreamSpec streamSpec;
        Config implementationOptions;
        synchronized (this.mLock) {
            try {
                checkUnsupportedFeatureCombinationAndThrow(collection);
                if (!z6 && hasExtension() && hasVideoCapture(collection)) {
                    updateUseCases(collection, true, z7);
                    return;
                }
                StreamSharing streamSharingCreateOrReuseStreamSharing = createOrReuseStreamSharing(collection, z6);
                UseCase useCaseCalculatePlaceholderForExtensions = calculatePlaceholderForExtensions(collection, streamSharingCreateOrReuseStreamSharing);
                Collection<UseCase> collectionCalculateCameraUseCases = calculateCameraUseCases(collection, useCaseCalculatePlaceholderForExtensions, streamSharingCreateOrReuseStreamSharing);
                ArrayList arrayList = new ArrayList(collectionCalculateCameraUseCases);
                arrayList.removeAll(this.mCameraUseCases);
                ArrayList arrayList2 = new ArrayList(collectionCalculateCameraUseCases);
                arrayList2.retainAll(this.mCameraUseCases);
                ArrayList arrayList3 = new ArrayList(this.mCameraUseCases);
                arrayList3.removeAll(collectionCalculateCameraUseCases);
                Map<UseCase, ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
                Map<UseCase, StreamSpec> mapCalculateSuggestedStreamSpecs = Collections.EMPTY_MAP;
                try {
                    Map<UseCase, StreamSpec> mapCalculateSuggestedStreamSpecs2 = calculateSuggestedStreamSpecs(getCameraMode(), this.mCameraInternal.getCameraInfoInternal(), arrayList, arrayList2, configs);
                    if (this.mSecondaryCameraInternal != null) {
                        int cameraMode = getCameraMode();
                        CameraInternal cameraInternal = this.mSecondaryCameraInternal;
                        Objects.requireNonNull(cameraInternal);
                        mapCalculateSuggestedStreamSpecs = calculateSuggestedStreamSpecs(cameraMode, cameraInternal.getCameraInfoInternal(), arrayList, arrayList2, configs);
                    }
                    updateViewPortAndSensorToBufferMatrix(mapCalculateSuggestedStreamSpecs2, collectionCalculateCameraUseCases);
                    updateEffects(this.mEffects, collectionCalculateCameraUseCases, collection);
                    int size = arrayList3.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList3.get(i8);
                        i8++;
                        ((UseCase) obj).unbindFromCamera(this.mCameraInternal);
                    }
                    this.mCameraInternal.detachUseCases(arrayList3);
                    if (this.mSecondaryCameraInternal != null) {
                        int size2 = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            Object obj2 = arrayList3.get(i9);
                            i9++;
                            CameraInternal cameraInternal2 = this.mSecondaryCameraInternal;
                            Objects.requireNonNull(cameraInternal2);
                            ((UseCase) obj2).unbindFromCamera(cameraInternal2);
                        }
                        CameraInternal cameraInternal3 = this.mSecondaryCameraInternal;
                        Objects.requireNonNull(cameraInternal3);
                        cameraInternal3.detachUseCases(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        int size3 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            UseCase useCase = (UseCase) obj3;
                            if (!mapCalculateSuggestedStreamSpecs2.containsKey(useCase) || (implementationOptions = (streamSpec = mapCalculateSuggestedStreamSpecs2.get(useCase)).getImplementationOptions()) == null) {
                                i7 = size3;
                            } else {
                                i7 = size3;
                                if (hasImplementationOptionChanged(streamSpec, useCase.getSessionConfig())) {
                                    useCase.updateSuggestedStreamSpecImplementationOptions(implementationOptions);
                                    if (this.mAttached) {
                                        this.mCameraInternal.onUseCaseUpdated(useCase);
                                        CameraInternal cameraInternal4 = this.mSecondaryCameraInternal;
                                        if (cameraInternal4 != null) {
                                            Objects.requireNonNull(cameraInternal4);
                                            cameraInternal4.onUseCaseUpdated(useCase);
                                        }
                                    }
                                }
                            }
                            size3 = i7;
                        }
                    }
                    int size4 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        Object obj4 = arrayList.get(i11);
                        i11++;
                        UseCase useCase2 = (UseCase) obj4;
                        ConfigPair configPair = configs.get(useCase2);
                        Objects.requireNonNull(configPair);
                        CameraInternal cameraInternal5 = this.mSecondaryCameraInternal;
                        if (cameraInternal5 != null) {
                            CameraInternal cameraInternal6 = this.mCameraInternal;
                            Objects.requireNonNull(cameraInternal5);
                            i6 = size4;
                            useCase2.bindToCamera(cameraInternal6, cameraInternal5, configPair.mExtendedConfig, configPair.mCameraConfig);
                            StreamSpec streamSpec2 = mapCalculateSuggestedStreamSpecs2.get(useCase2);
                            streamSpec2.getClass();
                            useCase2.updateSuggestedStreamSpec(streamSpec2, mapCalculateSuggestedStreamSpecs.get(useCase2));
                        } else {
                            i6 = size4;
                            useCase2.bindToCamera(this.mCameraInternal, null, configPair.mExtendedConfig, configPair.mCameraConfig);
                            StreamSpec streamSpec3 = mapCalculateSuggestedStreamSpecs2.get(useCase2);
                            streamSpec3.getClass();
                            useCase2.updateSuggestedStreamSpec(streamSpec3, null);
                        }
                        size4 = i6;
                    }
                    if (this.mAttached) {
                        this.mCameraInternal.attachUseCases(arrayList);
                        CameraInternal cameraInternal7 = this.mSecondaryCameraInternal;
                        if (cameraInternal7 != null) {
                            Objects.requireNonNull(cameraInternal7);
                            cameraInternal7.attachUseCases(arrayList);
                        }
                    }
                    int size5 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size5) {
                        Object obj5 = arrayList.get(i12);
                        i12++;
                        ((UseCase) obj5).notifyState();
                    }
                    this.mAppUseCases.clear();
                    this.mAppUseCases.addAll(collection);
                    this.mCameraUseCases.clear();
                    this.mCameraUseCases.addAll(collectionCalculateCameraUseCases);
                    this.mPlaceholderForExtensions = useCaseCalculatePlaceholderForExtensions;
                    this.mStreamSharing = streamSharingCreateOrReuseStreamSharing;
                } catch (IllegalArgumentException e6) {
                    if (z6 || hasExtension() || this.mCameraCoordinator.getCameraOperatingMode() == 2) {
                        throw e6;
                    }
                    updateUseCases(collection, true, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CameraUseCaseAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, RestrictedCameraInfo restrictedCameraInfo, RestrictedCameraInfo restrictedCameraInfo2, LayoutSettings layoutSettings, LayoutSettings layoutSettings2, CameraCoordinator cameraCoordinator, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        this.mAppUseCases = new ArrayList();
        this.mCameraUseCases = new ArrayList();
        this.mEffects = Collections.EMPTY_LIST;
        this.mLock = new Object();
        this.mAttached = true;
        this.mInteropConfig = null;
        this.mCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
        this.mCameraCoordinator = cameraCoordinator;
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        CameraConfig cameraConfig = restrictedCameraInfo.getCameraConfig();
        this.mCameraConfig = cameraConfig;
        this.mAdapterCameraControl = new RestrictedCameraControl(cameraInternal.getCameraControlInternal(), cameraConfig.getSessionProcessor(null));
        this.mAdapterCameraInfo = restrictedCameraInfo;
        this.mAdapterSecondaryCameraInfo = restrictedCameraInfo2;
        this.mId = generateCameraId(restrictedCameraInfo, restrictedCameraInfo2);
    }
}
