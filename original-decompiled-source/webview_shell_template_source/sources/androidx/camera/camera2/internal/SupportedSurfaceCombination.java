package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.internal.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.internal.compat.workaround.TargetAspectRatio;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class SupportedSurfaceCombination {
    private static final String TAG = "SupportedSurfaceCombination";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final String mCameraId;
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DisplayInfoManager mDisplayInfoManager;
    private final DynamicRangeResolver mDynamicRangeResolver;
    private final ExtraSupportedSurfaceCombinationsContainer mExtraSupportedSurfaceCombinationsContainer;
    private final int mHardwareLevel;
    private boolean mIsBurstCaptureSupported;
    private boolean mIsConcurrentCameraModeSupported;
    private boolean mIsPreviewStabilizationSupported;
    private boolean mIsRawSupported;
    private boolean mIsStreamUseCaseSupported;
    private boolean mIsUltraHighResolutionSensorSupported;
    SurfaceSizeDefinition mSurfaceSizeDefinition;
    private final List<SurfaceCombination> mSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mUltraHighSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mConcurrentSurfaceCombinations = new ArrayList();
    private final List<SurfaceCombination> mPreviewStabilizationSurfaceCombinations = new ArrayList();
    private final Map<FeatureSettings, List<SurfaceCombination>> mFeatureSettingsToSupportedCombinationsMap = new HashMap();
    private final List<SurfaceCombination> mSurfaceCombinations10Bit = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsUltraHdr = new ArrayList();
    private final List<SurfaceCombination> mSurfaceCombinationsStreamUseCase = new ArrayList();
    List<Integer> mSurfaceSizeDefinitionFormats = new ArrayList();
    private final TargetAspectRatio mTargetAspectRatio = new TargetAspectRatio();
    private final ResolutionCorrector mResolutionCorrector = new ResolutionCorrector();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Size[] getHighResolutionOutputSizes(StreamConfigurationMap streamConfigurationMap, int i6) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class FeatureSettings {
        public static FeatureSettings of(int i6, int i7, boolean z6, boolean z7) {
            return new AutoValue_SupportedSurfaceCombination_FeatureSettings(i6, i7, z6, z7);
        }

        public abstract int getCameraMode();

        public abstract int getRequiredMaxBitDepth();

        public abstract boolean isPreviewStabilizationOn();

        public abstract boolean isUltraHdrOn();
    }

    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException, NumberFormatException {
        this.mIsRawSupported = false;
        this.mIsBurstCaptureSupported = false;
        this.mIsConcurrentCameraModeSupported = false;
        this.mIsStreamUseCaseSupported = false;
        this.mIsUltraHighResolutionSensorSupported = false;
        this.mIsPreviewStabilizationSupported = false;
        str.getClass();
        this.mCameraId = str;
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        this.mExtraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer();
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
            this.mCharacteristics = cameraCharacteristicsCompat;
            Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.mHardwareLevel = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i6 : iArr) {
                    if (i6 == 3) {
                        this.mIsRawSupported = true;
                    } else if (i6 == 6) {
                        this.mIsBurstCaptureSupported = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i6 == 16) {
                        this.mIsUltraHighResolutionSensorSupported = true;
                    }
                }
            }
            DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(this.mCharacteristics);
            this.mDynamicRangeResolver = dynamicRangeResolver;
            generateSupportedCombinationList();
            if (this.mIsUltraHighResolutionSensorSupported) {
                generateUltraHighSupportedCombinationList();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.mIsConcurrentCameraModeSupported = zHasSystemFeature;
            if (zHasSystemFeature) {
                generateConcurrentSupportedCombinationList();
            }
            if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
                generate10BitSupportedCombinationList();
            }
            if (isUltraHdrSupported()) {
                generateUltraHdrSupportedCombinationList();
            }
            boolean zIsStreamUseCaseSupported = StreamUseCaseUtil.isStreamUseCaseSupported(this.mCharacteristics);
            this.mIsStreamUseCaseSupported = zIsStreamUseCaseSupported;
            if (zIsStreamUseCaseSupported) {
                generateStreamUseCaseSupportedCombinationList();
            }
            boolean zIsPreviewStabilizationSupported = VideoStabilizationUtil.isPreviewStabilizationSupported(this.mCharacteristics);
            this.mIsPreviewStabilizationSupported = zIsPreviewStabilizationSupported;
            if (zIsPreviewStabilizationSupported) {
                generatePreviewStabilizationSupportedCombinationList();
            }
            generateSurfaceSizeDefinition();
            checkCustomization();
        } catch (CameraAccessExceptionCompat e6) {
            throw CameraUnavailableExceptionHelper.createFrom(e6);
        }
    }

    private static Range<Integer> compareIntersectingRanges(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double rangeLength = getRangeLength(range2.intersect(range));
        double rangeLength2 = getRangeLength(range3.intersect(range));
        double rangeLength3 = rangeLength2 / getRangeLength(range3);
        double rangeLength4 = rangeLength / getRangeLength(range2);
        return (rangeLength2 <= rangeLength ? rangeLength2 != rangeLength ? rangeLength4 >= 0.5d || rangeLength3 <= rangeLength4 : rangeLength3 <= rangeLength4 && (rangeLength3 != rangeLength4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : rangeLength3 < 0.5d && rangeLength3 < rangeLength4) ? range2 : range3;
    }

    private FeatureSettings createFeatureSettings(int i6, Map<UseCaseConfig<?>, DynamicRange> map, boolean z6, boolean z7) {
        int requiredMaxBitDepth = getRequiredMaxBitDepth(map);
        if (i6 != 0 && z7) {
            throw new IllegalArgumentException("Camera device id is " + this.mCameraId + ". Ultra HDR is not currently supported in " + CameraMode.toLabelString(i6) + " camera mode.");
        }
        if (i6 == 0 || requiredMaxBitDepth != 10) {
            return FeatureSettings.of(i6, requiredMaxBitDepth, z6, z7);
        }
        throw new IllegalArgumentException("Camera device id is " + this.mCameraId + ". 10 bit dynamic range is not currently supported in " + CameraMode.toLabelString(i6) + " camera mode.");
    }

    private Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes(Map<UseCaseConfig<?>, List<Size>> map, FeatureSettings featureSettings, Range<Integer> range) {
        HashMap map2 = new HashMap();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : map.get(useCaseConfig)) {
                int inputFormat = useCaseConfig.getInputFormat();
                SurfaceConfig.ConfigSize configSize = SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)).getConfigSize();
                int maxFrameRate = range != null ? getMaxFrameRate(this.mCharacteristics, inputFormat, size) : Integer.MAX_VALUE;
                Set hashSet = (Set) map3.get(configSize);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(configSize, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(maxFrameRate))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(maxFrameRate));
                }
            }
            map2.put(useCaseConfig, arrayList);
        }
        return map2;
    }

    private void generate10BitSupportedCombinationList() {
        this.mSurfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private void generateConcurrentSupportedCombinationList() {
        this.mConcurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private void generatePreviewStabilizationSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mPreviewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
        }
    }

    private void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.mSurfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.getStreamUseCaseSupportedCombinationList());
        }
    }

    private void generateSupportedCombinationList() {
        this.mSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.mHardwareLevel, this.mIsRawSupported, this.mIsBurstCaptureSupported));
        this.mSurfaceCombinations.addAll(this.mExtraSupportedSurfaceCombinationsContainer.get(this.mCameraId));
    }

    private void generateSurfaceSizeDefinition() throws NumberFormatException {
        this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new HashMap(), this.mDisplayInfoManager.getPreviewSize(), new HashMap(), getRecordSize(), new HashMap(), new HashMap());
    }

    private void generateUltraHdrSupportedCombinationList() {
        this.mSurfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private void generateUltraHighSupportedCombinationList() {
        this.mUltraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private List<List<Size>> getAllPossibleSizeArrangements(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i7 = size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            List<Size> list2 = list.get(i8);
            for (int i9 = 0; i9 < size; i9++) {
                ((List) arrayList.get(i9)).add(list2.get((i9 % i7) / size2));
            }
            if (i8 < list.size() - 1) {
                i7 = size2;
                size2 /= list.get(i8 + 1).size();
            }
        }
        return arrayList;
    }

    private Range<Integer> getClosestSupportedDeviceFrameRate(Range<Integer> range, int i6) {
        if (range != null) {
            Range<Integer> rangeCompareIntersectingRanges = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (!range.equals(rangeCompareIntersectingRanges)) {
                Range<Integer>[] rangeArr = (Range[]) this.mCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeCompareIntersectingRanges;
                }
                Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i6)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i6)));
                int rangeLength = 0;
                for (Range<Integer> range3 : rangeArr) {
                    if (i6 >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeCompareIntersectingRanges.equals(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                            rangeCompareIntersectingRanges = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int rangeLength2 = getRangeLength(range3.intersect(range2));
                            if (rangeLength == 0) {
                                rangeLength = rangeLength2;
                            } else {
                                if (rangeLength2 >= rangeLength) {
                                    rangeCompareIntersectingRanges = compareIntersectingRanges(range2, rangeCompareIntersectingRanges, range3);
                                    rangeLength = getRangeLength(range2.intersect(rangeCompareIntersectingRanges));
                                }
                                range3 = rangeCompareIntersectingRanges;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (rangeLength != 0 || (getRangeDistance(range3, range2) >= getRangeDistance(rangeCompareIntersectingRanges, range2) && (getRangeDistance(range3, range2) != getRangeDistance(rangeCompareIntersectingRanges, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeCompareIntersectingRanges.getUpper()).intValue() && getRangeLength(range3) >= getRangeLength(rangeCompareIntersectingRanges))))) {
                            }
                        }
                        rangeCompareIntersectingRanges = range3;
                    }
                }
                return rangeCompareIntersectingRanges;
            }
        }
        return StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    }

    public static int getMaxFrameRate(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i6, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i6, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size getMaxOutputSizeByFormat(StreamConfigurationMap streamConfigurationMap, int i6, boolean z6) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i6 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i6);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        if (z6 && (highResolutionOutputSizes = Api23Impl.getHighResolutionOutputSizes(streamConfigurationMap, i6)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), compareSizesByArea);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), compareSizesByArea);
    }

    private int getMaxSupportedFpsFromAttachedSurfaces(List<AttachedSurfaceInfo> list) {
        int updatedMaximumFps = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            updatedMaximumFps = getUpdatedMaximumFps(updatedMaximumFps, attachedSurfaceInfo.getImageFormat(), attachedSurfaceInfo.getSize());
        }
        return updatedMaximumFps;
    }

    private static int getRangeDistance(Range<Integer> range, Range<Integer> range2) {
        androidx.work.j.f("Ranges must not intersect", (range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int getRangeLength(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private Size getRecordSize() throws NumberFormatException {
        try {
            int i6 = Integer.parseInt(this.mCameraId);
            CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i6, 1) ? this.mCamcorderProfileHelper.get(i6, 1) : null;
            return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : getRecordSizeByHasProfile(i6);
        } catch (NumberFormatException unused) {
            return getRecordSizeFromStreamConfigurationMap();
        }
    }

    private Size getRecordSizeByHasProfile(int i6) {
        Size size = SizeUtil.RESOLUTION_480P;
        CamcorderProfile camcorderProfile = this.mCamcorderProfileHelper.hasProfile(i6, 10) ? this.mCamcorderProfileHelper.get(i6, 10) : this.mCamcorderProfileHelper.hasProfile(i6, 8) ? this.mCamcorderProfileHelper.get(i6, 8) : this.mCamcorderProfileHelper.hasProfile(i6, 12) ? this.mCamcorderProfileHelper.get(i6, 12) : this.mCamcorderProfileHelper.hasProfile(i6, 6) ? this.mCamcorderProfileHelper.get(i6, 6) : this.mCamcorderProfileHelper.hasProfile(i6, 5) ? this.mCamcorderProfileHelper.get(i6, 5) : this.mCamcorderProfileHelper.hasProfile(i6, 4) ? this.mCamcorderProfileHelper.get(i6, 4) : null;
        return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : size;
    }

    private Size getRecordSizeFromStreamConfigurationMap() {
        Size[] outputSizes = this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return SizeUtil.RESOLUTION_480P;
        }
        Arrays.sort(outputSizes, new CompareSizesByArea(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = SizeUtil.RESOLUTION_1080P;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return SizeUtil.RESOLUTION_480P;
    }

    private static int getRequiredMaxBitDepth(Map<UseCaseConfig<?>, DynamicRange> map) {
        Iterator<DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(FeatureSettings featureSettings) {
        List list;
        if (this.mFeatureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            return this.mFeatureSettingsToSupportedCombinationsMap.get(featureSettings);
        }
        ArrayList arrayList = new ArrayList();
        if (featureSettings.isUltraHdrOn()) {
            list = arrayList;
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.mSurfaceCombinationsUltraHdr);
                list = arrayList;
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                list = this.mConcurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.isPreviewStabilizationOn() ? this.mPreviewStabilizationSurfaceCombinations : this.mSurfaceCombinations);
                list = arrayList;
            } else {
                arrayList.addAll(this.mUltraHighSurfaceCombinations);
                arrayList.addAll(this.mSurfaceCombinations);
                list = arrayList;
            }
        } else {
            list = arrayList;
            if (featureSettings.getRequiredMaxBitDepth() == 10) {
                list = arrayList;
                if (featureSettings.getCameraMode() == 0) {
                    arrayList.addAll(this.mSurfaceCombinations10Bit);
                    list = arrayList;
                }
            }
        }
        this.mFeatureSettingsToSupportedCombinationsMap.put(featureSettings, list);
        return list;
    }

    private Pair<List<SurfaceConfig>, Integer> getSurfaceConfigListAndFpsCeiling(int i6, List<AttachedSurfaceInfo> list, List<Size> list2, List<UseCaseConfig<?>> list3, List<Integer> list4, int i7, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            arrayList.add(attachedSurfaceInfo.getSurfaceConfig());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        for (int i8 = 0; i8 < list2.size(); i8++) {
            Size size = list2.get(i8);
            UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i8).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(i6, inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i7 = getUpdatedMaximumFps(i7, useCaseConfig.getInputFormat(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i7));
    }

    private Range<Integer> getTargetFpsRange(List<AttachedSurfaceInfo> list, List<UseCaseConfig<?>> list2, List<Integer> list3) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        Range<Integer> updatedTargetFramerate = null;
        while (it.hasNext()) {
            updatedTargetFramerate = getUpdatedTargetFramerate(it.next().getTargetFrameRate(), updatedTargetFramerate);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            updatedTargetFramerate = getUpdatedTargetFramerate(list2.get(it2.next().intValue()).getTargetFrameRate(null), updatedTargetFramerate);
        }
        return updatedTargetFramerate;
    }

    private int getUpdatedMaximumFps(int i6, int i7, Size size) {
        return Math.min(i6, getMaxFrameRate(this.mCharacteristics, i7, size));
    }

    private Range<Integer> getUpdatedTargetFramerate(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> getUseCasesPriorityOrder(List<UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            int surfaceOccupancyPriority = it.next().getSurfaceOccupancyPriority(0);
            if (!arrayList2.contains(Integer.valueOf(surfaceOccupancyPriority))) {
                arrayList2.add(Integer.valueOf(surfaceOccupancyPriority));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            int iIntValue = ((Integer) obj).intValue();
            for (UseCaseConfig<?> useCaseConfig : list) {
                if (iIntValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private static boolean isUltraHdrOn(List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageFormat() == 4101) {
                return true;
            }
        }
        Iterator<UseCaseConfig<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUltraHdrSupported() {
        int[] outputFormats = this.mCharacteristics.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return false;
        }
        for (int i6 : outputFormats) {
            if (i6 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean isUseCasesCombinationSupported(FeatureSettings featureSettings, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSurfaceConfig());
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            List<Size> list2 = map.get(useCaseConfig);
            androidx.work.j.a("No available output size is found for " + useCaseConfig + ".", (list2 == null || list2.isEmpty()) ? false : true);
            Size size = (Size) Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            arrayList.add(SurfaceConfig.transformSurfaceConfig(featureSettings.getCameraMode(), inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat)));
        }
        return checkSupported(featureSettings, arrayList);
    }

    private void refreshPreviewSize() throws NumberFormatException {
        this.mDisplayInfoManager.refresh();
        if (this.mSurfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
        } else {
            this.mSurfaceSizeDefinition = SurfaceSizeDefinition.create(this.mSurfaceSizeDefinition.getAnalysisSize(), this.mSurfaceSizeDefinition.getS720pSizeMap(), this.mDisplayInfoManager.getPreviewSize(), this.mSurfaceSizeDefinition.getS1440pSizeMap(), this.mSurfaceSizeDefinition.getRecordSize(), this.mSurfaceSizeDefinition.getMaximumSizeMap(), this.mSurfaceSizeDefinition.getUltraMaximumSizeMap());
        }
    }

    private void updateMaximumSizeByFormat(Map<Integer, Size> map, int i6) {
        Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i6, true);
        if (maxOutputSizeByFormat != null) {
            map.put(Integer.valueOf(i6), maxOutputSizeByFormat);
        }
    }

    private void updateS720pOrS1440pSizeByFormat(Map<Integer, Size> map, Size size, int i6) {
        if (this.mIsConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat = getMaxOutputSizeByFormat(this.mCharacteristics.getStreamConfigurationMapCompat().toStreamConfigurationMap(), i6, false);
            Integer numValueOf = Integer.valueOf(i6);
            if (maxOutputSizeByFormat != null) {
                size = (Size) Collections.min(Arrays.asList(size, maxOutputSizeByFormat), new CompareSizesByArea());
            }
            map.put(numValueOf, size);
        }
    }

    private void updateUltraMaximumSizeByFormat(Map<Integer, Size> map, int i6) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.mIsUltraHighResolutionSensorSupported || (streamConfigurationMap = (StreamConfigurationMap) this.mCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i6), getMaxOutputSizeByFormat(streamConfigurationMap, i6, true));
    }

    public List<Size> applyResolutionSelectionOrderRelatedWorkarounds(List<Size> list, int i6) {
        Rational rational;
        int i7 = this.mTargetAspectRatio.get(this.mCameraId, this.mCharacteristics);
        if (i7 == 0) {
            rational = AspectRatioUtil.ASPECT_RATIO_4_3;
        } else if (i7 == 1) {
            rational = AspectRatioUtil.ASPECT_RATIO_16_9;
        } else if (i7 != 2) {
            rational = null;
        } else {
            Size maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256);
            rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.mResolutionCorrector.insertOrPrioritize(SurfaceConfig.getConfigType(i6), list);
    }

    public boolean checkSupported(FeatureSettings featureSettings, List<SurfaceConfig> list) {
        Iterator<SurfaceCombination> it = getSurfaceCombinationsByFeatureSettings(featureSettings).iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 = it.next().getOrderedSupportedSurfaceConfigList(list) != null;
            if (z6) {
                break;
            }
        }
        return z6;
    }

    public String getCameraId() {
        return this.mCameraId;
    }

    public List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, List<SurfaceConfig> list) {
        if (!StreamUseCaseUtil.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        Iterator<SurfaceCombination> it = this.mSurfaceCombinationsStreamUseCase.iterator();
        while (it.hasNext()) {
            List<SurfaceConfig> orderedSupportedSurfaceConfigList = it.next().getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                return orderedSupportedSurfaceConfigList;
            }
        }
        return null;
    }

    public Pair<Map<UseCaseConfig<?>, StreamSpec>, Map<AttachedSurfaceInfo, StreamSpec>> getSuggestedStreamSpecifications(int i6, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, boolean z6, boolean z7) {
        int i7;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        List<SurfaceConfig> list2;
        HashMap map5;
        List<SurfaceConfig> list3;
        String str;
        String str2;
        int i8;
        HashMap map6;
        List<Size> list4;
        List<Size> list5;
        HashMap map7;
        boolean z8;
        refreshPreviewSize();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(arrayList);
        Map<UseCaseConfig<?>, DynamicRange> mapResolveAndValidateDynamicRanges = this.mDynamicRangeResolver.resolveAndValidateDynamicRanges(list, arrayList, useCasesPriorityOrder);
        FeatureSettings featureSettingsCreateFeatureSettings = createFeatureSettings(i6, mapResolveAndValidateDynamicRanges, z6, isUltraHdrOn(list, map));
        boolean zIsUseCasesCombinationSupported = isUseCasesCombinationSupported(featureSettingsCreateFeatureSettings, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!zIsUseCasesCombinationSupported) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> targetFpsRange = getTargetFpsRange(list, arrayList, useCasesPriorityOrder);
        Map<UseCaseConfig<?>, List<Size>> mapFilterSupportedSizes = filterSupportedSizes(map, featureSettingsCreateFeatureSettings, targetFpsRange);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = useCasesPriorityOrder.iterator();
        while (it.hasNext()) {
            UseCaseConfig useCaseConfig = (UseCaseConfig) arrayList.get(it.next().intValue());
            arrayList2.add(applyResolutionSelectionOrderRelatedWorkarounds(mapFilterSupportedSizes.get(useCaseConfig), useCaseConfig.getInputFormat()));
            mapFilterSupportedSizes = mapFilterSupportedSizes;
        }
        List<List<Size>> allPossibleSizeArrangements = getAllPossibleSizeArrangements(arrayList2);
        HashMap map8 = new HashMap();
        HashMap map9 = new HashMap();
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        boolean zContainsZslUseCase = StreamUseCaseUtil.containsZslUseCase(list, arrayList);
        int maxSupportedFpsFromAttachedSurfaces = getMaxSupportedFpsFromAttachedSurfaces(list);
        if (!this.mIsStreamUseCaseSupported || zContainsZslUseCase) {
            i7 = maxSupportedFpsFromAttachedSurfaces;
            map2 = map10;
            map3 = map11;
            map4 = map9;
            list2 = null;
        } else {
            Iterator<List<Size>> it2 = allPossibleSizeArrangements.iterator();
            List<SurfaceConfig> orderedSupportedStreamUseCaseSurfaceConfigList = null;
            while (true) {
                if (!it2.hasNext()) {
                    HashMap map12 = map11;
                    i7 = maxSupportedFpsFromAttachedSurfaces;
                    map2 = map10;
                    map3 = map12;
                    z8 = zIsUseCasesCombinationSupported;
                    map4 = map9;
                    break;
                }
                z8 = zIsUseCasesCombinationSupported;
                map4 = map9;
                Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling = getSurfaceConfigListAndFpsCeiling(i6, list, it2.next(), arrayList, useCasesPriorityOrder, maxSupportedFpsFromAttachedSurfaces, map10, map11);
                HashMap map13 = map11;
                i7 = maxSupportedFpsFromAttachedSurfaces;
                map2 = map10;
                map3 = map13;
                orderedSupportedStreamUseCaseSurfaceConfigList = getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettingsCreateFeatureSettings, (List) surfaceConfigListAndFpsCeiling.first);
                if (orderedSupportedStreamUseCaseSurfaceConfigList != null && !StreamUseCaseUtil.areCaptureTypesEligible(map2, map3, orderedSupportedStreamUseCaseSurfaceConfigList)) {
                    orderedSupportedStreamUseCaseSurfaceConfigList = null;
                }
                if (orderedSupportedStreamUseCaseSurfaceConfigList != null) {
                    if (StreamUseCaseUtil.areStreamUseCasesAvailableForSurfaceConfigs(this.mCharacteristics, orderedSupportedStreamUseCaseSurfaceConfigList)) {
                        break;
                    }
                    orderedSupportedStreamUseCaseSurfaceConfigList = null;
                }
                map2.clear();
                map3.clear();
                map10 = map2;
                maxSupportedFpsFromAttachedSurfaces = i7;
                map11 = map3;
                map9 = map4;
                zIsUseCasesCombinationSupported = z8;
            }
            if (orderedSupportedStreamUseCaseSurfaceConfigList == null && !z8) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.mCameraId + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = orderedSupportedStreamUseCaseSurfaceConfigList;
        }
        Iterator<List<Size>> it3 = allPossibleSizeArrangements.iterator();
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        boolean z9 = false;
        boolean z10 = false;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (!it3.hasNext()) {
                map5 = map3;
                list3 = list2;
                str = str3;
                str2 = str4;
                i8 = i11;
                map6 = map2;
                list4 = list6;
                break;
            }
            List<Size> next = it3.next();
            HashMap map14 = map2;
            int i12 = i7;
            str = str3;
            map5 = map3;
            int i13 = i10;
            list3 = list2;
            int i14 = i9;
            str2 = str4;
            map6 = map14;
            Pair<List<SurfaceConfig>, Integer> surfaceConfigListAndFpsCeiling2 = getSurfaceConfigListAndFpsCeiling(i6, list, next, arrayList, useCasesPriorityOrder, i12, null, null);
            List<SurfaceConfig> list8 = (List) surfaceConfigListAndFpsCeiling2.first;
            int iIntValue = ((Integer) surfaceConfigListAndFpsCeiling2.second).intValue();
            boolean z11 = targetFpsRange == null || i12 <= iIntValue || iIntValue >= ((Integer) targetFpsRange.getLower()).intValue();
            if (!z9 && checkSupported(featureSettingsCreateFeatureSettings, list8)) {
                if (i13 == i14 || i13 < iIntValue) {
                    list6 = next;
                    i13 = iIntValue;
                }
                if (z11) {
                    if (z10) {
                        list4 = next;
                        i10 = iIntValue;
                        i8 = i11;
                        break;
                    }
                    list6 = next;
                    i13 = iIntValue;
                    z9 = true;
                }
            }
            if (list3 == null || z10 || getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettingsCreateFeatureSettings, list8) == null) {
                i11 = i11;
            } else {
                int i15 = i11;
                if (i15 != i14 && i15 >= iIntValue) {
                    i11 = i15;
                } else {
                    list7 = next;
                    i11 = iIntValue;
                }
                if (!z11) {
                    continue;
                } else {
                    if (z9) {
                        i8 = iIntValue;
                        list4 = list6;
                        list5 = next;
                        i10 = i13;
                        break;
                    }
                    list7 = next;
                    i11 = iIntValue;
                    z10 = true;
                }
            }
            i7 = i12;
            i9 = i14;
            i10 = i13;
            map2 = map6;
            str4 = str2;
            list2 = list3;
            map3 = map5;
            str3 = str;
        }
        list5 = list7;
        if (list4 == null) {
            throw new IllegalArgumentException(str2 + this.mCameraId + " and Hardware level: " + this.mHardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
        }
        Range<Integer> closestSupportedDeviceFrameRate = targetFpsRange != null ? getClosestSupportedDeviceFrameRate(targetFpsRange, i10) : null;
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = arrayList.get(i16);
            i16++;
            UseCaseConfig useCaseConfig2 = (UseCaseConfig) obj;
            StreamSpec.Builder builder = StreamSpec.builder(list4.get(useCasesPriorityOrder.indexOf(Integer.valueOf(arrayList.indexOf(useCaseConfig2)))));
            List<Integer> list9 = useCasesPriorityOrder;
            DynamicRange dynamicRange = mapResolveAndValidateDynamicRanges.get(useCaseConfig2);
            dynamicRange.getClass();
            StreamSpec.Builder zslDisabled = builder.setDynamicRange(dynamicRange).setImplementationOptions(StreamUseCaseUtil.getStreamSpecImplementationOptions(useCaseConfig2)).setZslDisabled(z7);
            if (closestSupportedDeviceFrameRate != null) {
                zslDisabled.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            map4.put(useCaseConfig2, zslDisabled.build());
            useCasesPriorityOrder = list9;
        }
        if (list3 == null || i10 != i8 || list4.size() != list5.size()) {
            map7 = map8;
            break;
        }
        for (int i17 = 0; i17 < list4.size(); i17++) {
            if (!list4.get(i17).equals(list5.get(i17))) {
                map7 = map8;
                break;
            }
        }
        map7 = map8;
        if (!StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.mCharacteristics, list, map4, map7)) {
            StreamUseCaseUtil.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(map4, map7, map6, map5, list3);
        }
        return new Pair<>(map4, map7);
    }

    public SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i6) {
        if (!this.mSurfaceSizeDefinitionFormats.contains(Integer.valueOf(i6))) {
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS720pSizeMap(), SizeUtil.RESOLUTION_720P, i6);
            updateS720pOrS1440pSizeByFormat(this.mSurfaceSizeDefinition.getS1440pSizeMap(), SizeUtil.RESOLUTION_1440P, i6);
            updateMaximumSizeByFormat(this.mSurfaceSizeDefinition.getMaximumSizeMap(), i6);
            updateUltraMaximumSizeByFormat(this.mSurfaceSizeDefinition.getUltraMaximumSizeMap(), i6);
            this.mSurfaceSizeDefinitionFormats.add(Integer.valueOf(i6));
        }
        return this.mSurfaceSizeDefinition;
    }

    public boolean isBurstCaptureSupported() {
        return this.mIsBurstCaptureSupported;
    }

    public boolean isRawSupported() {
        return this.mIsRawSupported;
    }

    public SurfaceConfig transformSurfaceConfig(int i6, int i7, Size size) {
        return SurfaceConfig.transformSurfaceConfig(i6, i7, size, getUpdatedSurfaceSizeDefinitionByFormat(i7));
    }

    private void checkCustomization() {
    }
}
