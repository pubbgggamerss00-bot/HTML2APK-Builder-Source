package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.DynamicRangeConversions;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.Collection;
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
final class DynamicRangeResolver {
    private static final String TAG = "DynamicRangeResolver";
    private final CameraCharacteristicsCompat mCharacteristics;
    private final DynamicRangesCompat mDynamicRangesInfo;
    private final boolean mIs10BitSupported;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Api33Impl {
        private Api33Impl() {
        }

        public static DynamicRange getRecommended10BitDynamicRange(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
            Long l4 = (Long) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l4 != null) {
                return DynamicRangeConversions.profileToDynamicRange(l4.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCharacteristics = cameraCharacteristicsCompat;
        this.mDynamicRangesInfo = DynamicRangesCompat.fromCameraCharacteristics(cameraCharacteristicsCompat);
        int[] iArr = (int[]) cameraCharacteristicsCompat.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z6 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (iArr[i6] == 18) {
                    z6 = true;
                    break;
                }
                i6++;
            }
        }
        this.mIs10BitSupported = z6;
    }

    private static boolean canResolve(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        androidx.work.j.f("Fully specified range is not actually fully specified.", dynamicRange2.isFullySpecified());
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() == 2 || dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == dynamicRange2.getEncoding()) {
            return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
        }
        return false;
    }

    private static boolean canResolveWithinConstraints(DynamicRange dynamicRange, DynamicRange dynamicRange2, Set<DynamicRange> set) {
        if (set.contains(dynamicRange2)) {
            return canResolve(dynamicRange, dynamicRange2);
        }
        Logger.d(TAG, "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
        return false;
    }

    private static DynamicRange findSupportedHdrMatch(DynamicRange dynamicRange, Collection<DynamicRange> collection, Set<DynamicRange> set) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        for (DynamicRange dynamicRange2 : collection) {
            androidx.work.j.e("Fully specified DynamicRange cannot be null.", dynamicRange2);
            int encoding = dynamicRange2.getEncoding();
            androidx.work.j.f("Fully specified DynamicRange must have fully defined encoding.", dynamicRange2.isFullySpecified());
            if (encoding != 1 && canResolveWithinConstraints(dynamicRange, dynamicRange2, set)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    private static boolean isFullyUnspecified(DynamicRange dynamicRange) {
        return Objects.equals(dynamicRange, DynamicRange.UNSPECIFIED);
    }

    private static boolean isPartiallySpecified(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() == 2) {
            return true;
        }
        if (dynamicRange.getEncoding() == 0 || dynamicRange.getBitDepth() != 0) {
            return dynamicRange.getEncoding() == 0 && dynamicRange.getBitDepth() != 0;
        }
        return true;
    }

    private DynamicRange resolveDynamicRange(DynamicRange dynamicRange, Set<DynamicRange> set, Set<DynamicRange> set2, Set<DynamicRange> set3, String str) {
        DynamicRange recommended10BitDynamicRange;
        if (dynamicRange.isFullySpecified()) {
            if (set.contains(dynamicRange)) {
                return dynamicRange;
            }
            return null;
        }
        int encoding = dynamicRange.getEncoding();
        int bitDepth = dynamicRange.getBitDepth();
        if (encoding == 1 && bitDepth == 0) {
            DynamicRange dynamicRange2 = DynamicRange.SDR;
            if (set.contains(dynamicRange2)) {
                return dynamicRange2;
            }
            return null;
        }
        DynamicRange dynamicRangeFindSupportedHdrMatch = findSupportedHdrMatch(dynamicRange, set2, set);
        if (dynamicRangeFindSupportedHdrMatch != null) {
            Logger.d(TAG, "Resolved dynamic range for use case " + str + " from existing attached surface.\n" + dynamicRange + "\n->\n" + dynamicRangeFindSupportedHdrMatch);
            return dynamicRangeFindSupportedHdrMatch;
        }
        DynamicRange dynamicRangeFindSupportedHdrMatch2 = findSupportedHdrMatch(dynamicRange, set3, set);
        if (dynamicRangeFindSupportedHdrMatch2 != null) {
            Logger.d(TAG, "Resolved dynamic range for use case " + str + " from concurrently bound use case.\n" + dynamicRange + "\n->\n" + dynamicRangeFindSupportedHdrMatch2);
            return dynamicRangeFindSupportedHdrMatch2;
        }
        DynamicRange dynamicRange3 = DynamicRange.SDR;
        if (canResolveWithinConstraints(dynamicRange, dynamicRange3, set)) {
            Logger.d(TAG, "Resolved dynamic range for use case " + str + " to no compatible HDR dynamic ranges.\n" + dynamicRange + "\n->\n" + dynamicRange3);
            return dynamicRange3;
        }
        if (encoding == 2 && (bitDepth == 10 || bitDepth == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                recommended10BitDynamicRange = Api33Impl.getRecommended10BitDynamicRange(this.mCharacteristics);
                if (recommended10BitDynamicRange != null) {
                    linkedHashSet.add(recommended10BitDynamicRange);
                }
            } else {
                recommended10BitDynamicRange = null;
            }
            linkedHashSet.add(DynamicRange.HLG_10_BIT);
            DynamicRange dynamicRangeFindSupportedHdrMatch3 = findSupportedHdrMatch(dynamicRange, linkedHashSet, set);
            if (dynamicRangeFindSupportedHdrMatch3 != null) {
                StringBuilder sbA = i0.a("Resolved dynamic range for use case ", str, " from ", dynamicRangeFindSupportedHdrMatch3.equals(recommended10BitDynamicRange) ? "recommended" : "required", " 10-bit supported dynamic range.\n");
                sbA.append(dynamicRange);
                sbA.append("\n->\n");
                sbA.append(dynamicRangeFindSupportedHdrMatch3);
                Logger.d(TAG, sbA.toString());
                return dynamicRangeFindSupportedHdrMatch3;
            }
        }
        for (DynamicRange dynamicRange4 : set) {
            androidx.work.j.f("Candidate dynamic range must be fully specified.", dynamicRange4.isFullySpecified());
            if (!dynamicRange4.equals(DynamicRange.SDR) && canResolve(dynamicRange, dynamicRange4)) {
                Logger.d(TAG, "Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + dynamicRange + "\n->\n" + dynamicRange4);
                return dynamicRange4;
            }
        }
        return null;
    }

    private DynamicRange resolveDynamicRangeAndUpdateConstraints(Set<DynamicRange> set, Set<DynamicRange> set2, Set<DynamicRange> set3, UseCaseConfig<?> useCaseConfig, Set<DynamicRange> set4) {
        DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
        DynamicRange dynamicRangeResolveDynamicRange = resolveDynamicRange(dynamicRange, set4, set2, set3, useCaseConfig.getTargetName());
        if (dynamicRangeResolveDynamicRange != null) {
            updateConstraints(set4, dynamicRangeResolveDynamicRange, this.mDynamicRangesInfo);
            return dynamicRangeResolveDynamicRange;
        }
        throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + useCaseConfig.getTargetName() + "\nRequested dynamic range:\n  " + dynamicRange + "\nSupported dynamic ranges:\n  " + TextUtils.join("\n  ", set) + "\nConstrained set of concurrent dynamic ranges:\n  " + TextUtils.join("\n  ", set4));
    }

    private static void updateConstraints(Set<DynamicRange> set, DynamicRange dynamicRange, DynamicRangesCompat dynamicRangesCompat) {
        androidx.work.j.f("Cannot update already-empty constraints.", !set.isEmpty());
        Set<DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangesCompat.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        if (dynamicRangeCaptureRequestConstraints.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(dynamicRangeCaptureRequestConstraints);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dynamicRange + "\nConstraints:\n  " + TextUtils.join("\n  ", dynamicRangeCaptureRequestConstraints) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet));
        }
    }

    public boolean is10BitDynamicRangeSupported() {
        return this.mIs10BitSupported;
    }

    public Map<UseCaseConfig<?>, DynamicRange> resolveAndValidateDynamicRanges(List<AttachedSurfaceInfo> list, List<UseCaseConfig<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getDynamicRange());
        }
        Set<DynamicRange> supportedDynamicRanges = this.mDynamicRangesInfo.getSupportedDynamicRanges();
        HashSet hashSet = new HashSet(supportedDynamicRanges);
        Iterator<DynamicRange> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            updateConstraints(hashSet, it2.next(), this.mDynamicRangesInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            UseCaseConfig<?> useCaseConfig = list2.get(it3.next().intValue());
            DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
            if (isFullyUnspecified(dynamicRange)) {
                arrayList3.add(useCaseConfig);
            } else if (isPartiallySpecified(dynamicRange)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        int size = arrayList4.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList4.get(i6);
            i6++;
            UseCaseConfig<?> useCaseConfig2 = (UseCaseConfig) obj;
            DynamicRange dynamicRangeResolveDynamicRangeAndUpdateConstraints = resolveDynamicRangeAndUpdateConstraints(supportedDynamicRanges, linkedHashSet, linkedHashSet2, useCaseConfig2, hashSet);
            map.put(useCaseConfig2, dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            if (!linkedHashSet.contains(dynamicRangeResolveDynamicRangeAndUpdateConstraints)) {
                linkedHashSet2.add(dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            }
        }
        return map;
    }
}
