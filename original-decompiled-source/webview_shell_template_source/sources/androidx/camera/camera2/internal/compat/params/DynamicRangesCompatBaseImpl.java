package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.internal.compat.params.DynamicRangesCompat;
import androidx.camera.core.DynamicRange;
import androidx.work.j;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class DynamicRangesCompatBaseImpl implements DynamicRangesCompat.DynamicRangeProfilesCompatImpl {
    static final DynamicRangesCompat COMPAT_INSTANCE = new DynamicRangesCompat(new DynamicRangesCompatBaseImpl());
    private static final Set<DynamicRange> SDR_ONLY = Collections.singleton(DynamicRange.SDR);

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        j.a("DynamicRange is not supported: " + dynamicRange, DynamicRange.SDR.equals(dynamicRange));
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        j.a("DynamicRange is not supported: " + dynamicRange, DynamicRange.SDR.equals(dynamicRange));
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.DynamicRangeProfilesCompatImpl
    public DynamicRangeProfiles unwrap() {
        return null;
    }
}
