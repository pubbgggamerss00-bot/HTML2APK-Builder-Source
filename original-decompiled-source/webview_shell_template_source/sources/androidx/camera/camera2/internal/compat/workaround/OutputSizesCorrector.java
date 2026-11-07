package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class OutputSizesCorrector {
    private static final String TAG = "OutputSizesCorrector";
    private final String mCameraId;
    private final ExcludedSupportedSizesContainer mExcludedSupportedSizesContainer;
    private final ExtraSupportedOutputSizeQuirk mExtraSupportedOutputSizeQuirk = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.get(ExtraSupportedOutputSizeQuirk.class);

    public OutputSizesCorrector(String str) {
        this.mCameraId = str;
        this.mExcludedSupportedSizesContainer = new ExcludedSupportedSizesContainer(str);
    }

    private void addExtraSupportedOutputSizesByClass(List<Size> list, Class<?> cls) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.mExtraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(cls);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(Arrays.asList(extraSupportedResolutions));
        }
    }

    private void addExtraSupportedOutputSizesByFormat(List<Size> list, int i6) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.mExtraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(i6);
        if (extraSupportedResolutions.length > 0) {
            list.addAll(Arrays.asList(extraSupportedResolutions));
        }
    }

    private void excludeProblematicOutputSizesByClass(List<Size> list, Class<?> cls) {
        List<Size> list2 = this.mExcludedSupportedSizesContainer.get(cls);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    private void excludeProblematicOutputSizesByFormat(List<Size> list, int i6) {
        List<Size> list2 = this.mExcludedSupportedSizesContainer.get(i6);
        if (list2.isEmpty()) {
            return;
        }
        list.removeAll(list2);
    }

    public Size[] applyQuirks(Size[] sizeArr, int i6) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        addExtraSupportedOutputSizesByFormat(arrayList, i6);
        excludeProblematicOutputSizesByFormat(arrayList, i6);
        if (arrayList.isEmpty()) {
            Logger.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public <T> Size[] applyQuirks(Size[] sizeArr, Class<T> cls) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        addExtraSupportedOutputSizesByClass(arrayList, cls);
        excludeProblematicOutputSizesByClass(arrayList, cls);
        if (arrayList.isEmpty()) {
            Logger.w(TAG, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
