package androidx.camera.core.internal;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SupportedOutputSizesSorter {
    private static final String TAG = "SupportedOutputSizesCollector";
    private final CameraInfoInternal mCameraInfoInternal;
    private final Rational mFullFovRatio;
    private final int mLensFacing;
    private final int mSensorOrientation;
    private final SupportedOutputSizesSorterLegacy mSupportedOutputSizesSorterLegacy;

    public SupportedOutputSizesSorter(CameraInfoInternal cameraInfoInternal, Size size) {
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        Rational rationalCalculateFullFovRatioFromActiveArraySize = size != null ? calculateFullFovRatioFromActiveArraySize(size) : calculateFullFovRatioFromSupportedOutputSizes(cameraInfoInternal);
        this.mFullFovRatio = rationalCalculateFullFovRatioFromActiveArraySize;
        this.mSupportedOutputSizesSorterLegacy = new SupportedOutputSizesSorterLegacy(cameraInfoInternal, rationalCalculateFullFovRatioFromActiveArraySize);
    }

    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategy(List<Size> list, AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        return applyAspectRatioStrategyFallbackRule(groupSizesByAspectRatio(list), aspectRatioStrategy, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategyFallbackRule(Map<Rational, List<Size>> map, AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        int i6 = 0;
        boolean z6 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z6 = false;
        }
        Rational targetAspectRatioRationalValue = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z6);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            Rational targetAspectRatioRationalValue2 = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z6);
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                Rational rational2 = (Rational) obj;
                if (!rational2.equals(targetAspectRatioRationalValue2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioRationalValue, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        int size2 = arrayList2.size();
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            Rational rational3 = (Rational) obj2;
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> applyHighResolutionSettings(List<Size> list, ResolutionSelector resolutionSelector, int i6) {
        if (resolutionSelector.getAllowedResolutionMode() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.mCameraInfoInternal.getSupportedHighResolutions(i6));
        Collections.sort(arrayList, new CompareSizesByArea(true));
        return arrayList;
    }

    private static void applyMaxResolutionRestriction(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int area = SizeUtil.getArea(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (SizeUtil.getArea(size2) <= area) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List<Size> applyResolutionFilter(List<Size> list, ResolutionFilter resolutionFilter, int i6, int i7, int i8) {
        if (resolutionFilter == null) {
            return list;
        }
        List<Size> listFilter = resolutionFilter.filter(new ArrayList(list), CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i6), i7, i8 == 1));
        if (list.containsAll(listFilter)) {
            return listFilter;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void applyResolutionStrategy(LinkedHashMap<Rational, List<Size>> linkedHashMap, ResolutionStrategy resolutionStrategy) {
        if (resolutionStrategy == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            applyResolutionStrategyFallbackRule(linkedHashMap.get(it.next()), resolutionStrategy);
        }
    }

    private static void applyResolutionStrategyFallbackRule(List<Size> list, ResolutionStrategy resolutionStrategy) {
        if (list.isEmpty()) {
            return;
        }
        int fallbackRule = resolutionStrategy.getFallbackRule();
        if (resolutionStrategy.equals(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
            return;
        }
        Size boundSize = resolutionStrategy.getBoundSize();
        if (fallbackRule == 0) {
            sortSupportedSizesByFallbackRuleNone(list, boundSize);
            return;
        }
        if (fallbackRule == 1) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, true);
            return;
        }
        if (fallbackRule == 2) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, false);
        } else if (fallbackRule == 3) {
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, true);
        } else {
            if (fallbackRule != 4) {
                return;
            }
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, false);
        }
    }

    private Rational calculateFullFovRatioFromActiveArraySize(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational calculateFullFovRatioFromSupportedOutputSizes(CameraInfoInternal cameraInfoInternal) {
        List<Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
        if (supportedResolutions.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(supportedResolutions, new CompareSizesByArea());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List<Size> getResolutionCandidateList(List<Pair<Integer, Size[]>> list, int i6) {
        List<Size> sizeListByFormat = getSizeListByFormat(list, i6);
        if (sizeListByFormat == null) {
            sizeListByFormat = this.mCameraInfoInternal.getSupportedResolutions(i6);
        }
        ArrayList arrayList = new ArrayList(sizeListByFormat);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            Logger.w(TAG, "The retrieved supported resolutions from camera info internal is empty. Format is " + i6 + ".");
        }
        return arrayList;
    }

    public static List<Rational> getResolutionListGroupingAspectRatioKeys(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_16_9);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    Object obj = arrayList.get(i6);
                    i6++;
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) obj)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Size> getSizeListByFormat(List<Pair<Integer, Size[]>> list, int i6) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i6) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    public static Rational getTargetAspectRatioRationalValue(int i6, boolean z6) {
        if (i6 == -1) {
            return null;
        }
        if (i6 == 0) {
            return z6 ? AspectRatioUtil.ASPECT_RATIO_4_3 : AspectRatioUtil.ASPECT_RATIO_3_4;
        }
        if (i6 == 1) {
            return z6 ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_9_16;
        }
        Logger.e(TAG, "Undefined target aspect ratio: " + i6);
        return null;
    }

    public static Map<Rational, List<Size>> groupSizesByAspectRatio(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = getResolutionListGroupingAspectRatioKeys(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List<Size> sortSupportedOutputSizesByResolutionSelector(ResolutionSelector resolutionSelector, List<Size> list, Size size, int i6, Rational rational, int i7, int i8) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapApplyAspectRatioStrategy = applyAspectRatioStrategy(list, resolutionSelector.getAspectRatioStrategy(), rational);
        if (size != null) {
            applyMaxResolutionRestriction(linkedHashMapApplyAspectRatioStrategy, size);
        }
        applyResolutionStrategy(linkedHashMapApplyAspectRatioStrategy, resolutionSelector.getResolutionStrategy());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapApplyAspectRatioStrategy.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return applyResolutionFilter(arrayList, resolutionSelector.getResolutionFilter(), i6, i7, i8);
    }

    public static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(List<Size> list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(List<Size> list, Size size, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            Size size2 = list.get(i6);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z6) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleNone(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public List<Size> getSortedSupportedOutputSizes(UseCaseConfig<?> useCaseConfig) {
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        List<Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        ResolutionSelector resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        List<Size> resolutionCandidateList = getResolutionCandidateList(imageOutputConfig.getSupportedResolutions(null), useCaseConfig.getInputFormat());
        if (resolutionSelector == null) {
            return this.mSupportedOutputSizesSorterLegacy.sortSupportedOutputSizes(resolutionCandidateList, useCaseConfig);
        }
        Size maxResolution = ((ImageOutputConfig) useCaseConfig).getMaxResolution(null);
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        if (!useCaseConfig.isHighResolutionDisabled(false)) {
            resolutionCandidateList = applyHighResolutionSettings(resolutionCandidateList, resolutionSelector, useCaseConfig.getInputFormat());
        }
        return sortSupportedOutputSizesByResolutionSelector(imageOutputConfig.getResolutionSelector(), resolutionCandidateList, maxResolution, targetRotation, this.mFullFovRatio, this.mSensorOrientation, this.mLensFacing);
    }
}
